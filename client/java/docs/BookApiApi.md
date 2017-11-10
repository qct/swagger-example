# BookApiApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBookByIdUsingGET**](BookApiApi.md#getBookByIdUsingGET) | **GET** /v1/book/{id} | 根据ID获取书籍
[**getBooksByCategoryUsingGET**](BookApiApi.md#getBooksByCategoryUsingGET) | **GET** /v1/book/getByCategoryId | 根据分类获取书籍
[**updateUsingPOST**](BookApiApi.md#updateUsingPOST) | **POST** /v1/book/update | 更新书籍


<a name="getBookByIdUsingGET"></a>
# **getBookByIdUsingGET**
> Book getBookByIdUsingGET(id)

根据ID获取书籍

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BookApiApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

[**Book**](Book.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getBooksByCategoryUsingGET"></a>
# **getBooksByCategoryUsingGET**
> List&lt;Book&gt; getBooksByCategoryUsingGET(id)

根据分类获取书籍

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BookApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BookApiApi apiInstance = new BookApiApi();
Integer id = 56; // Integer | id
try {
    List<Book> result = apiInstance.getBooksByCategoryUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookApiApi#getBooksByCategoryUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

[**List&lt;Book&gt;**](Book.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateUsingPOST"></a>
# **updateUsingPOST**
> Boolean updateUsingPOST(id)

更新书籍

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BookApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BookApiApi apiInstance = new BookApiApi();
Integer id = 56; // Integer | id
try {
    Boolean result = apiInstance.updateUsingPOST(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookApiApi#updateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id | [optional]

### Return type

**Boolean**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

