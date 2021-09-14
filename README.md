# uniqueusers
filter the duplicates from list of two users json arrays

Java Spring boot maven project:

API that that accepts 2 userLists of json array objects and filter duplicates

------------------------------------------------------------------------------------------------
Request:
--------
curl --request POST \
  --url http://localhost:8080/unique/users \
  --header 'Content-Type: application/json' \
  --data '{
	"usersList1": [
		{
			"name": "Rama",
			"dept": "dev",
			"type": "emp"
		},
		{
			"name": "Magna",
			"dept": "hr",
			"type": "emp"
		},
		{
			"name": "Victor",
			"dept": "payroll",
			"type": "emp"
		}
	],
	"usersList2": [
		{
			"name": "Tom",
			"dept": "dev",
			"type": "contractor"
		},
		{
			"name": "Rama",
			"dept": "dev",
			"type": "emp"
		},
		{
			"name": "Satya",
			"dept": "dev",
			"type": "emp"
		},{
			"name": "Magna",
			"dept": "hr",
			"type": "emp"
		}
	]
}'

---------------------------------------------------------------------------
Response:
[
  {
    "name": "Rama",
    "dept": "dev",
    "type": "emp"
  },
  {
    "name": "Magna",
    "dept": "hr",
    "type": "emp"
  },
  {
    "name": "Victor",
    "dept": "payroll",
    "type": "emp"
  },
  {
    "name": "Tom",
    "dept": "dev",
    "type": "contractor"
  },
  {
    "name": "Satya",
    "dept": "dev",
    "type": "emp"
  }
]
