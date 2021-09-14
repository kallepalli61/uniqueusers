package com.project.uniqueusers.service;

import com.project.uniqueusers.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class UserService {


    public List<User> getAllUsers(List<User> users){
        //key is unique. Here key is name+dept+type.
        return users.stream().filter(distinctByKey(p -> p.getName() + p.getDept() + p.getType())).collect(Collectors.toList());

    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }
}
