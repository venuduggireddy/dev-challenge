# dev-challenge
Containerize 3 tire architecture

# API

Spring boot application using maven to build


# UI

Anuglar application to build for production

`ng build --prod`

For local deployment use

`ng serve --port 0 --open`

# HTTP Server

Nginx is use and has custom nginx.conf that uses reverse proxy to API for rest calls

# MySQL

After application is running we add the persons using

`curl -X POST \
  http://10.63.80.56:8080/person \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json;charset=UTF-8' \
  -H 'postman-token: d6607844-fd0e-f6b9-b522-3f23493e042c' \
  -d '{
	"firstName": "Venu",
	"lastName": "Reddy"
}'
`