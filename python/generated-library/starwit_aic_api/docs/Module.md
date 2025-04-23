# Module


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**version** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**application_identifier** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**use_ai** | **bool** |  | [optional] 
**model** | [**AIModel**](AIModel.md) |  | [optional] 
**action_types** | [**List[ActionType]**](ActionType.md) |  | [optional] 
**decision_types** | [**List[DecisionType]**](DecisionType.md) |  | [optional] 
**s_bom_location** | [**Dict[str, ModuleSBOMLocationValue]**](ModuleSBOMLocationValue.md) |  | [optional] 
**successors** | [**List[Module]**](Module.md) |  | [optional] 

## Example

```python
from starwit_aic_api.models.module import Module

# TODO update the JSON string below
json = "{}"
# create an instance of Module from a JSON string
module_instance = Module.from_json(json)
# print the JSON string representation of the object
print(Module.to_json())

# convert the object into a dict
module_dict = module_instance.to_dict()
# create an instance of Module from a dict
module_from_dict = Module.from_dict(module_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


