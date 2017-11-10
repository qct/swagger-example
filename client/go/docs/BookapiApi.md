# \BookapiApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBookByIdUsingGET**](BookapiApi.md#GetBookByIdUsingGET) | **Get** /v1/book/{id} | 根据ID获取书籍
[**GetBooksByCategoryUsingGET**](BookapiApi.md#GetBooksByCategoryUsingGET) | **Get** /v1/book/getByCategoryId | 根据分类获取书籍
[**UpdateUsingPOST**](BookapiApi.md#UpdateUsingPOST) | **Post** /v1/book/update | 更新书籍


# **GetBookByIdUsingGET**
> Book GetBookByIdUsingGET($id)

根据ID获取书籍


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int32**| id | 

### Return type

[**Book**](Book.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetBooksByCategoryUsingGET**
> []Book GetBooksByCategoryUsingGET($id)

根据分类获取书籍


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int32**| id | 

### Return type

[**[]Book**](Book.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateUsingPOST**
> bool UpdateUsingPOST($id)

更新书籍


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int32**| id | [optional] 

### Return type

**bool**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

