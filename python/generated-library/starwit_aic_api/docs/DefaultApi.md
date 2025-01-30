# starwit_aic_api.DefaultApi

All URIs are relative to *http://localhost:8081/api/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_decision**](DefaultApi.md#create_decision) | **POST** /decision | Create decision
[**get_actions_by_id**](DefaultApi.md#get_actions_by_id) | **GET** /action/{id} | Get action by id
[**get_all_actions**](DefaultApi.md#get_all_actions) | **GET** /action | Get all actions
[**get_all_decisions**](DefaultApi.md#get_all_decisions) | **GET** /decision | Get all decisions
[**get_decisions_by_id**](DefaultApi.md#get_decisions_by_id) | **GET** /decision/{id} | Get decisions by id
[**get_info**](DefaultApi.md#get_info) | **GET** /info | 
[**save3**](DefaultApi.md#save3) | **POST** /action | Create action


# **create_decision**
> Decision create_decision(decision)

Create decision

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.decision import Decision
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/api/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/api/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    decision = starwit_aic_api.Decision() # Decision | 

    try:
        # Create decision
        api_response = api_instance.create_decision(decision)
        print("The response of DefaultApi->create_decision:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_decision: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision** | [**Decision**](Decision.md)|  | 

### Return type

[**Decision**](Decision.md)

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

# **get_actions_by_id**
> Action get_actions_by_id(id)

Get action by id

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.action import Action
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/api/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/api/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    id = 56 # int | 

    try:
        # Get action by id
        api_response = api_instance.get_actions_by_id(id)
        print("The response of DefaultApi->get_actions_by_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_actions_by_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

[**Action**](Action.md)

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

# **get_all_actions**
> List[Action] get_all_actions()

Get all actions

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.action import Action
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/api/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/api/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)

    try:
        # Get all actions
        api_response = api_instance.get_all_actions()
        print("The response of DefaultApi->get_all_actions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_all_actions: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[Action]**](Action.md)

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

# **get_all_decisions**
> List[Decision] get_all_decisions()

Get all decisions

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.decision import Decision
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/api/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/api/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)

    try:
        # Get all decisions
        api_response = api_instance.get_all_decisions()
        print("The response of DefaultApi->get_all_decisions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_all_decisions: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[Decision]**](Decision.md)

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

# **get_decisions_by_id**
> Decision get_decisions_by_id(id)

Get decisions by id

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.decision import Decision
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/api/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/api/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    id = 56 # int | 

    try:
        # Get decisions by id
        api_response = api_instance.get_decisions_by_id(id)
        print("The response of DefaultApi->get_decisions_by_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_decisions_by_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

[**Decision**](Decision.md)

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

# Defining the host is optional and defaults to http://localhost:8081/api/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/api/v0"
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

# **save3**
> Action save3(action)

Create action

### Example


```python
import starwit_aic_api
from starwit_aic_api.models.action import Action
from starwit_aic_api.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:8081/api/v0
# See configuration.py for a list of all supported configuration parameters.
configuration = starwit_aic_api.Configuration(
    host = "http://localhost:8081/api/v0"
)


# Enter a context with an instance of the API client
with starwit_aic_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = starwit_aic_api.DefaultApi(api_client)
    action = starwit_aic_api.Action() # Action | 

    try:
        # Create action
        api_response = api_instance.save3(action)
        print("The response of DefaultApi->save3:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->save3: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | [**Action**](Action.md)|  | 

### Return type

[**Action**](Action.md)

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

