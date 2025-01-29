# ActionEntity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**creation_time** | **datetime** |  | [optional] 
**name** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**decision** | [**DecisionEntity**](DecisionEntity.md) |  | [optional] 
**action_type** | [**ActionTypeEntity**](ActionTypeEntity.md) |  | [optional] 

## Example

```python
from starwit_aic_api.models.action_entity import ActionEntity

# TODO update the JSON string below
json = "{}"
# create an instance of ActionEntity from a JSON string
action_entity_instance = ActionEntity.from_json(json)
# print the JSON string representation of the object
print(ActionEntity.to_json())

# convert the object into a dict
action_entity_dict = action_entity_instance.to_dict()
# create an instance of ActionEntity from a dict
action_entity_from_dict = ActionEntity.from_dict(action_entity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


