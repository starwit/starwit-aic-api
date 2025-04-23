# ActionType

A type of action that a system can execute

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**endpoint** | **str** |  | [optional] 
**execution_policy** | **str** |  | [optional] 
**module** | [**Module**](Module.md) |  | [optional] 

## Example

```python
from starwit_aic_api.models.action_type import ActionType

# TODO update the JSON string below
json = "{}"
# create an instance of ActionType from a JSON string
action_type_instance = ActionType.from_json(json)
# print the JSON string representation of the object
print(ActionType.to_json())

# convert the object into a dict
action_type_dict = action_type_instance.to_dict()
# create an instance of ActionType from a dict
action_type_from_dict = ActionType.from_dict(action_type_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


