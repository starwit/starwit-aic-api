# ActionTypeEntity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**execution_policy** | **str** |  | [optional] 
**action** | [**List[ActionEntity]**](ActionEntity.md) |  | [optional] 
**decision_type** | [**List[DecisionTypeEntity]**](DecisionTypeEntity.md) |  | [optional] 

## Example

```python
from starwit_aic_api.models.action_type_entity import ActionTypeEntity

# TODO update the JSON string below
json = "{}"
# create an instance of ActionTypeEntity from a JSON string
action_type_entity_instance = ActionTypeEntity.from_json(json)
# print the JSON string representation of the object
print(ActionTypeEntity.to_json())

# convert the object into a dict
action_type_entity_dict = action_type_entity_instance.to_dict()
# create an instance of ActionTypeEntity from a dict
action_type_entity_from_dict = ActionTypeEntity.from_dict(action_type_entity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


