# swagger-client-java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.example</groupId>
    <artifactId>swagger-client-java</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.example:swagger-client-java:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-client-java-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.BookApiApi;

import java.io.File;
import java.util.*;

public class BookApiApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        BookApiApi apiInstance = new BookApiApi();
        Integer id = 56; // Integer | id
        try {
            Book result = apiInstance.getBookByIdUsingGET(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BookApiApi#getBookByIdUsingGET");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BookApiApi* | [**getBookByIdUsingGET**](docs/BookApiApi.md#getBookByIdUsingGET) | **GET** /v1/book/{id} | 根据ID获取书籍
*BookApiApi* | [**getBooksByCategoryUsingGET**](docs/BookApiApi.md#getBooksByCategoryUsingGET) | **GET** /v1/book/getByCategoryId | 根据分类获取书籍
*BookApiApi* | [**updateUsingPOST**](docs/BookApiApi.md#updateUsingPOST) | **POST** /v1/book/update | 更新书籍
*CategoryApiApi* | [**getAllUsingGET**](docs/CategoryApiApi.md#getAllUsingGET) | **GET** /v1/category/ | 获取全部分类
*CategoryApiApi* | [**getUsingGET**](docs/CategoryApiApi.md#getUsingGET) | **GET** /v1/category/{id} | 根据ID获取分类


## Documentation for Models

 - [Book](docs/Book.md)
 - [Category](docs/Category.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

damon.q@iv66.net

