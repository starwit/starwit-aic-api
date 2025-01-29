# DecisionTypeEntity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**decision** | [**List[DecisionEntity]**](DecisionEntity.md) |  | [optional] 
**action_type** | [**List[ActionTypeEntity]**](ActionTypeEntity.md) |  | [optional] 

## Example

```python
from starwit_aic_api.models.decision_type_entity import DecisionTypeEntity

# TODO update the JSON string below
json = "{}"
# create an instance of DecisionTypeEntity from a JSON string
decision_type_entity_instance = DecisionTypeEntity.from_json(json)
# print the JSON string representation of the object
print(DecisionTypeEntity.to_json())

# convert the object into a dict
decision_type_entity_dict = decision_type_entity_instance.to_dict()
# create an instance of DecisionTypeEntity from a dict
decision_type_entity_from_dict = DecisionTypeEntity.from_dict(decision_type_entity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


