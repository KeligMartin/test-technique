# HOW TO TEST

first, you will have to create a database named "test" on your postgresql service (the default port is 5432)

Then, launch `docker-compose up`

and `mvn spring-boot:run` with java11 to run the project.

You can visit `http://localhost:4012/api-docs.html` to check the documentation of the API