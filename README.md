# bingorestservice
Rest API for Bingo game 

For running service you need some DB running 

you can use postgresql for this purpose 
here is example how you run one 

docker run --name testpg3 -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=admin -e POSTGRES_DB=randomnum -p 5432:5432 -h testpg -d postgres

-e POSTGRES_USER=admin // here you set pg user environmental variable 

-e POSTGRES_PASSWORD=admin // password 

-e POSTGRES_DB=randomnum // database name 

-p 5432:5432 // you externalise (open) port mapping 

postgres // image name you use  
