# starwit_aic_api.DefaultApi

All URIs are relative to *http://localhost:8080/api/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_info**](DefaultApi.md#get_info) | **GET** /info | 
[**get_module**](DefaultApi.md#get_module) | **GET** /modules/{id} | 
[**get_modules**](DefaultApi.md#get_modules) | **GET** /modules | 
[**register_module**](DefaultApi.md#register_module) | **POST** /modules/register | 
[**update_module**](DefaultApi.md#update_module) | **PUT** /modules/register/{id} | 


# **get_info**
> List[Info] get_info()

shall deliver info on interface version and hosting system, readonly

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.info import Info
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8080/api/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8080/api/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)

    try:
        api_response = api_instance.get_info()
        print("The response of DefaultApi->get_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_info: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[Info]**](Info.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | base info |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_module**
> List[Module] get_module(id)

delivers components/modules with provided id

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.module import Module
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8080/api/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8080/api/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    id = 56 # int | Numeric ID of module

    try:
        api_response = api_instance.get_module(id)
        print("The response of DefaultApi->get_module:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_module: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Numeric ID of module | 

### Return type

[**List[Module]**](Module.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | get single module |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_modules**
> List[Module] get_modules()

delivers a list of components/modules of which AI system is composed

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.module import Module
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8080/api/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8080/api/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)

    try:
        api_response = api_instance.get_modules()
        print("The response of DefaultApi->get_modules:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_modules: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[Module]**](Module.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | module list |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **register_module**
> register_module(module)

register a new module

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.module import Module
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8080/api/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8080/api/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    module = starwit_aic_api.Module() # Module | Module test to be registered

    try:
        api_instance.register_module(module)
    except Exception as e:
        print("Exception when calling DefaultApi->register_module: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **module** | [**Module**](Module.md)| Module test to be registered | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | created a new module |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_module**
> update_module(id, module)

update a module

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.module import Module
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8080/api/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8080/api/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    id = 56 # int | Numeric ID of module test to be updated
    module = starwit_aic_api.Module() # Module | Module test to be updated

    try:
        api_instance.update_module(id, module)
    except Exception as e:
        print("Exception when calling DefaultApi->update_module: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Numeric ID of module test to be updated | 
 **module** | [**Module**](Module.md)| Module test to be updated | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | updated a module |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

