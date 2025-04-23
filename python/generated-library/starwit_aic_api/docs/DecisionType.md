# DecisionType

A type of decision that a system can derive

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**action_types** | [**List[ActionType]**](ActionType.md) |  | [optional] 
**module** | [**Module**](Module.md) |  | [optional] 

## Example

```python
from starwit_aic_api.models.decision_type import DecisionType

# TODO update the JSON string below
json = "{}"
# create an instance of DecisionType from a JSON string
decision_type_instance = DecisionType.from_json(json)
# print the JSON string representation of the object
print(DecisionType.to_json())

# convert the object into a dict
decision_type_dict = decision_type_instance.to_dict()
# create an instance of DecisionType from a dict
decision_type_from_dict = DecisionType.from_dict(decision_type_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


