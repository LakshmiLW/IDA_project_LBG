# IDA_project_LBG

prerequisites
Need to have docker Desktop on the machine.

Docker Images link : https://hub.docker.com/u/lakshmilw

Download the docker-compose.yaml file attached and place it in a folder(test).
Launch command promt from the same folder(test) and start pulling each of the images. It can be done as below:

docker-compose pull atm-locator
docker-compose pull api-gateway
docker-compose pull naming-server
docker-compose pull zipkin-server

then start the docker compose as below:

docker-compose start atm-locator
docker-compose start api-gateway
docker-compose start naming-server
docker-compose start zipkin-server

Can then run the below command to run the docker-compose yaml to see the below url's in action.
All the api specification is present in the swagger open api.. and they can be run using swagger ui.

Swagger - open api 
http://localhost:8000/swagger-ui.html
http://localhost:8000/v3/api-docs

actuator
http://localhost:8000/actuator

zipkin -- maintaining logs of all api's
http://localhost:9411/api/v2/spans

ATM get api
http://localhost:8000/atm-locator-service/atmdetails
with 2 required parameters :
url=https://api.lloydsbank.com/open-banking/v2.2/atms
identification={any valid identification}

ATM get api through api gateway for global logging
http://localhost:8761/atm-locator-service/atmdetails
url=https://api.lloydsbank.com/open-banking/v2.2/atms
identification={any valid identification}

Eureka Naming server -- to register the servers
http://localhost:8761/
