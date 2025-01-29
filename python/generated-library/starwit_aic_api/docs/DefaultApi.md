# starwit_aic_api.DefaultApi

All URIs are relative to *http://localhost:8081/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](DefaultApi.md#delete) | **DELETE** /api/decisiontype/{id} | Delete decisiontype
[**delete1**](DefaultApi.md#delete1) | **DELETE** /api/decision/{id} | Delete decision
[**delete2**](DefaultApi.md#delete2) | **DELETE** /api/actiontype/{id} | Delete actiontype
[**delete3**](DefaultApi.md#delete3) | **DELETE** /api/action/{id} | Delete action
[**download**](DefaultApi.md#download) | **GET** /api/decision/download/{bucketName}/{objectName} | 
[**find_all**](DefaultApi.md#find_all) | **GET** /api/decisiontype | Get all decisiontype
[**find_all1**](DefaultApi.md#find_all1) | **GET** /api/decision | Get all decision
[**find_all2**](DefaultApi.md#find_all2) | **GET** /api/actiontype | Get all actiontype
[**find_all3**](DefaultApi.md#find_all3) | **GET** /api/action | Get all action
[**find_by_decision_type**](DefaultApi.md#find_by_decision_type) | **GET** /api/actiontype/by-decision-type/{id} | Get actiontype by decision type
[**find_by_id1**](DefaultApi.md#find_by_id1) | **GET** /api/decisiontype/{id} | Get decisiontype with id
[**find_by_id2**](DefaultApi.md#find_by_id2) | **GET** /api/decision/{id} | Get decision with id
[**find_by_id3**](DefaultApi.md#find_by_id3) | **GET** /api/actiontype/{id} | Get actiontype with id
[**find_by_id4**](DefaultApi.md#find_by_id4) | **GET** /api/action/{id} | Get action with id
[**get_info**](DefaultApi.md#get_info) | **GET** /info | 
[**save**](DefaultApi.md#save) | **POST** /api/decisiontype | Create decisiontype
[**save1**](DefaultApi.md#save1) | **POST** /api/decision | Create decision
[**save2**](DefaultApi.md#save2) | **POST** /api/actiontype | Create actiontype
[**save3**](DefaultApi.md#save3) | **POST** /api/action | Create action
[**update**](DefaultApi.md#update) | **PUT** /api/decisiontype | Update decisiontype
[**update1**](DefaultApi.md#update1) | **PUT** /api/decision | Update decision
[**update2**](DefaultApi.md#update2) | **PUT** /api/actiontype | Update actiontype
[**update3**](DefaultApi.md#update3) | **PUT** /api/action | Update action
[**update_list**](DefaultApi.md#update_list) | **PUT** /api/decisiontype/update-list | Update a list of Decision Types
[**update_list1**](DefaultApi.md#update_list1) | **PUT** /api/actiontype/update-list | Update a list of actiontype


# **delete**
> delete(id)

Delete decisiontype

### Example


```python
import starwit_aic_api
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    id = 56 # int | 

    try:
        # Delete decisiontype
        api_instance.delete(id)
    except Exception as e:
        print("Exception when calling DefaultApi->delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete1**
> delete1(id)

Delete decision

### Example


```python
import starwit_aic_api
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    id = 56 # int | 

    try:
        # Delete decision
        api_instance.delete1(id)
    except Exception as e:
        print("Exception when calling DefaultApi->delete1: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete2**
> delete2(id)

Delete actiontype

### Example


```python
import starwit_aic_api
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    id = 56 # int | 

    try:
        # Delete actiontype
        api_instance.delete2(id)
    except Exception as e:
        print("Exception when calling DefaultApi->delete2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete3**
> delete3(id)

Delete action

### Example


```python
import starwit_aic_api
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    id = 56 # int | 

    try:
        # Delete action
        api_instance.delete3(id)
    except Exception as e:
        print("Exception when calling DefaultApi->delete3: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download**
> bytearray download(bucket_name, object_name)



### Example


```python
import starwit_aic_api
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    bucket_name = 'bucket_name_example' # str | 
    object_name = 'object_name_example' # str | 

    try:
        api_response = api_instance.download(bucket_name, object_name)
        print("The response of DefaultApi->download:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->download: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucket_name** | **str**|  | 
 **object_name** | **str**|  | 

### Return type

**bytearray**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **find_all**
> List[DecisionTypeEntity] find_all()

Get all decisiontype

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.decision_type_entity import DecisionTypeEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)

    try:
        # Get all decisiontype
        api_response = api_instance.find_all()
        print("The response of DefaultApi->find_all:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->find_all: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[DecisionTypeEntity]**](DecisionTypeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **find_all1**
> List[DecisionEntity] find_all1()

Get all decision

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.decision_entity import DecisionEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)

    try:
        # Get all decision
        api_response = api_instance.find_all1()
        print("The response of DefaultApi->find_all1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->find_all1: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[DecisionEntity]**](DecisionEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **find_all2**
> List[ActionTypeEntity] find_all2()

Get all actiontype

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.action_type_entity import ActionTypeEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)

    try:
        # Get all actiontype
        api_response = api_instance.find_all2()
        print("The response of DefaultApi->find_all2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->find_all2: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[ActionTypeEntity]**](ActionTypeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **find_all3**
> List[ActionEntity] find_all3()

Get all action

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.action_entity import ActionEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)

    try:
        # Get all action
        api_response = api_instance.find_all3()
        print("The response of DefaultApi->find_all3:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->find_all3: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[ActionEntity]**](ActionEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **find_by_decision_type**
> List[ActionTypeEntity] find_by_decision_type(id)

Get actiontype by decision type

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.action_type_entity import ActionTypeEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    id = 56 # int | 

    try:
        # Get actiontype by decision type
        api_response = api_instance.find_by_decision_type(id)
        print("The response of DefaultApi->find_by_decision_type:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->find_by_decision_type: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

[**List[ActionTypeEntity]**](ActionTypeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **find_by_id1**
> DecisionTypeEntity find_by_id1(id)

Get decisiontype with id

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.decision_type_entity import DecisionTypeEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    id = 56 # int | 

    try:
        # Get decisiontype with id
        api_response = api_instance.find_by_id1(id)
        print("The response of DefaultApi->find_by_id1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->find_by_id1: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

[**DecisionTypeEntity**](DecisionTypeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **find_by_id2**
> DecisionEntity find_by_id2(id)

Get decision with id

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.decision_entity import DecisionEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    id = 56 # int | 

    try:
        # Get decision with id
        api_response = api_instance.find_by_id2(id)
        print("The response of DefaultApi->find_by_id2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->find_by_id2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

[**DecisionEntity**](DecisionEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **find_by_id3**
> ActionTypeEntity find_by_id3(id)

Get actiontype with id

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.action_type_entity import ActionTypeEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    id = 56 # int | 

    try:
        # Get actiontype with id
        api_response = api_instance.find_by_id3(id)
        print("The response of DefaultApi->find_by_id3:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->find_by_id3: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

[**ActionTypeEntity**](ActionTypeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **find_by_id4**
> ActionEntity find_by_id4(id)

Get action with id

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.action_entity import ActionEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    id = 56 # int | 

    try:
        # Get action with id
        api_response = api_instance.find_by_id4(id)
        print("The response of DefaultApi->find_by_id4:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->find_by_id4: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

[**ActionEntity**](ActionEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_info**
> List[Info] get_info()



shall deliver info on interface version and hosting system, readonly

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.info import Info
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
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

# **save**
> DecisionTypeEntity save(decision_type_entity)

Create decisiontype

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.decision_type_entity import DecisionTypeEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    decision_type_entity = starwit_aic_api.DecisionTypeEntity() # DecisionTypeEntity | 

    try:
        # Create decisiontype
        api_response = api_instance.save(decision_type_entity)
        print("The response of DefaultApi->save:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->save: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision_type_entity** | [**DecisionTypeEntity**](DecisionTypeEntity.md)|  | 

### Return type

[**DecisionTypeEntity**](DecisionTypeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save1**
> DecisionEntity save1(decision_entity)

Create decision

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.decision_entity import DecisionEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    decision_entity = starwit_aic_api.DecisionEntity() # DecisionEntity | 

    try:
        # Create decision
        api_response = api_instance.save1(decision_entity)
        print("The response of DefaultApi->save1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->save1: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision_entity** | [**DecisionEntity**](DecisionEntity.md)|  | 

### Return type

[**DecisionEntity**](DecisionEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save2**
> ActionTypeEntity save2(action_type_entity)

Create actiontype

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.action_type_entity import ActionTypeEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    action_type_entity = starwit_aic_api.ActionTypeEntity() # ActionTypeEntity | 

    try:
        # Create actiontype
        api_response = api_instance.save2(action_type_entity)
        print("The response of DefaultApi->save2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->save2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action_type_entity** | [**ActionTypeEntity**](ActionTypeEntity.md)|  | 

### Return type

[**ActionTypeEntity**](ActionTypeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save3**
> ActionEntity save3(action_entity)

Create action

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.action_entity import ActionEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    action_entity = starwit_aic_api.ActionEntity() # ActionEntity | 

    try:
        # Create action
        api_response = api_instance.save3(action_entity)
        print("The response of DefaultApi->save3:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->save3: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action_entity** | [**ActionEntity**](ActionEntity.md)|  | 

### Return type

[**ActionEntity**](ActionEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> DecisionTypeEntity update(decision_type_entity)

Update decisiontype

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.decision_type_entity import DecisionTypeEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    decision_type_entity = starwit_aic_api.DecisionTypeEntity() # DecisionTypeEntity | 

    try:
        # Update decisiontype
        api_response = api_instance.update(decision_type_entity)
        print("The response of DefaultApi->update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision_type_entity** | [**DecisionTypeEntity**](DecisionTypeEntity.md)|  | 

### Return type

[**DecisionTypeEntity**](DecisionTypeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update1**
> DecisionEntity update1(decision_entity)

Update decision

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.decision_entity import DecisionEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    decision_entity = starwit_aic_api.DecisionEntity() # DecisionEntity | 

    try:
        # Update decision
        api_response = api_instance.update1(decision_entity)
        print("The response of DefaultApi->update1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update1: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision_entity** | [**DecisionEntity**](DecisionEntity.md)|  | 

### Return type

[**DecisionEntity**](DecisionEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update2**
> ActionTypeEntity update2(action_type_entity)

Update actiontype

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.action_type_entity import ActionTypeEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    action_type_entity = starwit_aic_api.ActionTypeEntity() # ActionTypeEntity | 

    try:
        # Update actiontype
        api_response = api_instance.update2(action_type_entity)
        print("The response of DefaultApi->update2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action_type_entity** | [**ActionTypeEntity**](ActionTypeEntity.md)|  | 

### Return type

[**ActionTypeEntity**](ActionTypeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update3**
> ActionEntity update3(action_entity)

Update action

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.action_entity import ActionEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    action_entity = starwit_aic_api.ActionEntity() # ActionEntity | 

    try:
        # Update action
        api_response = api_instance.update3(action_entity)
        print("The response of DefaultApi->update3:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update3: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action_entity** | [**ActionEntity**](ActionEntity.md)|  | 

### Return type

[**ActionEntity**](ActionEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_list**
> update_list(decision_type_entity)

Update a list of Decision Types

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.decision_type_entity import DecisionTypeEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    decision_type_entity = [starwit_aic_api.DecisionTypeEntity()] # List[DecisionTypeEntity] | 

    try:
        # Update a list of Decision Types
        api_instance.update_list(decision_type_entity)
    except Exception as e:
        print("Exception when calling DefaultApi->update_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision_type_entity** | [**List[DecisionTypeEntity]**](DecisionTypeEntity.md)|  | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_list1**
> update_list1(action_type_entity)

Update a list of actiontype

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.action_type_entity import ActionTypeEntity
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    action_type_entity = [starwit_aic_api.ActionTypeEntity()] # List[ActionTypeEntity] | 

    try:
        # Update a list of actiontype
        api_instance.update_list1(action_type_entity)
    except Exception as e:
        print("Exception when calling DefaultApi->update_list1: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action_type_entity** | [**List[ActionTypeEntity]**](ActionTypeEntity.md)|  | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

