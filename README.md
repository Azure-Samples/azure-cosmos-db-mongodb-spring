---
page_type: sample
languages:
- java
products:
- azure
description: "Azure Cosmos DB is a fully managed globally distributed, multi-model database service, transparently replicating your data across any number of Azure regions."
urlFragment: azure-cosmos-db-mongodb-spring
---

# Developing a SpringBoot app using Azure Cosmos DB for MongoDB API

Azure Cosmos DB is a fully managed globally distributed, multi-model database service, transparently replicating your data across any number of Azure regions. You can elastically scale throughput and storage, and take advantage of fast, single-digit-millisecond data access using the API of your choice backed by 99.999 SLA. This sample shows you how to use the Azure Cosmos DB for MongoDB API to store and access data from a SpringBoot application. 

## Prerequisites

Before you can run this sample, you must have the following prerequisites:

- An active Azure account. If you don't have one, you can sign up for a [free account](https://azure.microsoft.com/free/). Alternatively, you can use the [Azure Cosmos DB Emulator](https://docs.microsoft.com/azure/cosmos-db/local-emulator) for this tutorial.
- An Azure Cosmos DB for MongoDB API account configured with at least two read regions.

## Running this sample

1. Clone this repository

1. Substitute the ``spring.data.mongodb.uri`` in *src\main\resources\application.properties* with your Azure Cosmos DB account's connection string.

    ```java
    spring.data.mongodb.uri=mongodb://<account-name>:<account-key>@<account-name>.mongo.cosmos.azure.com:10255/?ssl=true&replicaSet=globaldb&retrywrites=false&maxIdleTimeMS=120000&appName=@<account-name>@
    ```

    > *If the key string used in the MongoDB URI contains special characters, such as plus signs, use the URL-encoded value of that key. Otherwise, you may face issues trying to connect and see errors pertaining to SASL Authentication failure. This is especially true when working with [Azure Cosmos DB Emulator](https://docs.microsoft.com/azure/cosmos-db/local-emulator) over a local network.*

1. Create a new database in your Azure Cosmos DB account.

1. Substitute the ``spring.data.mongodb.database`` in *src\main\resources\application.properties* with the name of the database in your Azure Cosmos DB account.

    ```java
    spring.data.mongodb.database=<database-name>
    ```

1. Run your application:

    ```bash
    mvn spring-boot:run
    ```

## About the code

The code included in this sample is intended to illustrate using Azure Cosmos DB for MongoDB API from SpringBoot application. It is a port of the sample from [SpringBoot Getting Started](https://github.com/spring-guides/gs-accessing-data-mongodb) article. It also uses code from [this tutorial](https://falkenfighter.wordpress.com/2015/10/13/multiple-databases-with-spring-boot-mongodb-repositories/) to configure read preference for different repositories.

## More information

- [Azure Cosmos DB](https://docs.microsoft.com/azure/cosmos-db/introduction)
- [Azure Cosmos DB : MongoDB API](https://docs.microsoft.com/azure/cosmos-db/mongodb-introduction)
- [SpringBoot MongoDB: Getting Started](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#data.nosql.mongodb)
