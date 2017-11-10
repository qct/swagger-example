# CategoryApiApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllUsingGET**](CategoryApiApi.md#getAllUsingGET) | **GET** /v1/category/ | 获取全部分类
[**getUsingGET**](CategoryApiApi.md#getUsingGET) | **GET** /v1/category/{id} | 根据ID获取分类


<a name="getAllUsingGET"></a>
# **getAllUsingGET**
> List&lt;Category&gt; getAllUsingGET()

获取全部分类

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoryApiApi;


CategoryApiApi apiInstance = new CategoryApiApi();
try {
    List<Category> result = apiInstance.getAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApiApi#getAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Category&gt;**](Category.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUsingGET"></a>
# **getUsingGET**
> Category getUsingGET(id)

根据ID获取分类

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoryApiApi;


CategoryApiApi apiInstance = new CategoryApiApi();
Integer id = 56; // Integer | id
try {
    Category result = apiInstance.getUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApiApi#getUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

[**Category**](Category.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

