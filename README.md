# microservices-complete

This project is basically a simple project that uses concrete implementation of different important technologies important to build robust backend.

Important implementation inclues -
- Spring Boot
- Spring Kafka
- Twitter APIs (Mocked)
- Docker and Docker Compose (for running kafka and schema registry)
- Spring WebClient

## Release v0.0.1
- Contains Mock Twitter Stream that produces tweets in fixed intervals based on jumbled words
- Kafka Producer that sends kafka to - twitter-topics on 3 nodes with 1 schema registry
- Docker based image generation of twitter to kafka functionality, to use put these commands
    - `mvn clean install` // this will create the image (make sure docker is running)
    - `cd docker-compose && docker compose up` // to run the images and spring application inside docker as container
- Advanced changes with respect to new versions of spring and spring-kafka
    - `kafkaTemplate.send()` method sending `CompletableFuture` instead of `ListenableFuture`
    - `webClient` implementation in `getSchemaRegistryStatus()` changed from `exchange` to `retrieve` with `toBodilessEntity` mapping Mono response to `HttpStatus`
