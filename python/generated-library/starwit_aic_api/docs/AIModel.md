# AIModel


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**version** | **str** |  | [optional] 
**last_deployment** | **datetime** |  | [optional] 
**model_type** | [**AIModelType**](AIModelType.md) |  | [optional] 
**model_link** | **str** | Link to model documentation | [optional] 
**public_training_data** | **bool** | Is model based on public training data? | [optional] 
**link_to_public_training_data** | **str** | Link to public training data / documentation. | [optional] 

## Example

```python
from starwit_aic_api.models.ai_model import AIModel

# TODO update the JSON string below
json = "{}"
# create an instance of AIModel from a JSON string
ai_model_instance = AIModel.from_json(json)
# print the JSON string representation of the object
print(AIModel.to_json())

# convert the object into a dict
ai_model_dict = ai_model_instance.to_dict()
# create an instance of AIModel from a dict
ai_model_from_dict = AIModel.from_dict(ai_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


