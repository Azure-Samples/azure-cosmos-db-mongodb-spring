---
services: cosmos-db
platforms: spring
author: sivethe
---

# Developing a SpringBoot app using Azure Cosmos DB for MongoDB API
Azure Cosmos DB is a fully managed globally distributed, multi-model database service, transparently replicating your data across any number of Azure regions. You can elastically scale throughput and storage, and take advantage of fast, single-digit-millisecond data access using the API of your choice backed by 99.999 SLA. This sample shows you how to use the Azure Cosmos DB for MongoDB API to store and access data from a SpringBoot application. 

## Running this sample

* Before you can run this sample, you must have the following prerequisites:

   * An active Azure account. If you don't have one, you can sign up for a [free account](https://azure.microsoft.com/free/). Alternatively, you can use the [Azure Cosmos DB Emulator](https://docs.microsoft.com/azure/cosmos-db/local-emulator) for this tutorial.
   * Eclipse Oxygen 

* Then, clone this repository.

* Next, substitute the `spring.data.mongodb.uri` in *src\main\resources\application.properties* with your Cosmos DB account's values. 

* Run your application.

## About the code
The code included in this sample is intended to illustrate using Azure Cosmos DB for MongoDB API from SpringBoot application. It is a port of the sample from [SpringBoot Getting Started](https://github.com/spring-guides/gs-accessing-data-mongodb) article. It also uses code from [this tutorial](https://falkenfighter.wordpress.com/2015/10/13/multiple-databases-with-spring-boot-mongodb-repositories/) to configure read preference for different repositories.

## More information

- [Azure Cosmos DB](https://docs.microsoft.com/azure/cosmos-db/introduction)
- [Azure Cosmos DB for MongoDB API](https://docs.microsoft.com/en-us/azure/cosmos-db/mongodb-introduction)
- [SpringBoot : Getting Started](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-mongodb)
