---
services: cosmos-db
platforms: spring
author: viviswan
---

# Azure CosmosDB MongoDB SpringBoot Sample
Azure Cosmos DB is a globally distributed multi-model database. One of the supported APIs is the MongoDB API, which provides a document model and support for client drivers in many platforms. This sample shows you how to use Azure Cosmos DB with MongoDB API from a Springboot MongoDB application. It also illustrates how to configure read preference for different repositories.

## Running this sample

* Before you can run this sample, you must have the following prerequisites:

   * An active Azure account. If you don't have one, you can sign up for a [free account](https://azure.microsoft.com/free/). Alternatively, you can use the [Azure Cosmos DB Emulator](https://docs.microsoft.com/azure/cosmos-db/local-emulator) for this tutorial.
   * Eclipse Oxygen 

* Then, clone this repository.

* Next, substitute the `spring.data.mongodb.uri` in *src\main\resources\application.properties* with your Cosmos DB account's values. 

* Run your application.

## About the code
The code included in this sample is intended to illustrate using Azure Cosmos DB with the MongoDB API from SpringBoot MongoDB application. It is a port of the sample from [SpringBoot Getting Started](https://github.com/spring-guides/gs-accessing-data-mongodb) article. It also uses code from [this tutorial](https://falkenfighter.wordpress.com/2015/10/13/multiple-databases-with-spring-boot-mongodb-repositories/) to configure read preference for different repositories.

## More information

- [Azure Cosmos DB](https://docs.microsoft.com/azure/cosmos-db/introduction)
- [Azure Cosmos DB : MongoDB API](https://docs.microsoft.com/azure/cosmos-db/mongodb-introduction)
- [SpringBoot MongoDB: Getting Started](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-mongodb)