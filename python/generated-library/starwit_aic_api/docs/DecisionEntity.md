# DecisionEntity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**acquisition_time** | **datetime** |  | [optional] 
**media_url** | **str** |  | [optional] 
**camera_latitude** | **float** |  | [optional] 
**camera_longitude** | **float** |  | [optional] 
**state** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**decision_type** | [**DecisionTypeEntity**](DecisionTypeEntity.md) |  | [optional] 
**action** | [**List[ActionEntity]**](ActionEntity.md) |  | [optional] 

## Example

```python
from starwit_aic_api.models.decision_entity import DecisionEntity

# TODO update the JSON string below
json = "{}"
# create an instance of DecisionEntity from a JSON string
decision_entity_instance = DecisionEntity.from_json(json)
# print the JSON string representation of the object
print(DecisionEntity.to_json())

# convert the object into a dict
decision_entity_dict = decision_entity_instance.to_dict()
# create an instance of DecisionEntity from a dict
decision_entity_from_dict = DecisionEntity.from_dict(decision_entity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


