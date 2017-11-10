# \CategoryapiApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAllUsingGET**](CategoryapiApi.md#GetAllUsingGET) | **Get** /v1/category/ | 获取全部分类
[**GetUsingGET**](CategoryapiApi.md#GetUsingGET) | **Get** /v1/category/{id} | 根据ID获取分类


# **GetAllUsingGET**
> []Category GetAllUsingGET()

获取全部分类


### Parameters
This endpoint does not need any parameter.

### Return type

[**[]Category**](Category.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetUsingGET**
> Category GetUsingGET($id)

根据ID获取分类


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int32**| id | 

### Return type

[**Category**](Category.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

