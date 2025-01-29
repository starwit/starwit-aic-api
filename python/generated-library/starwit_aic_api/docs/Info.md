# Info


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**generation_date** | **datetime** | Last date this interface was updated. | [optional] 
**system_description** | **str** | additional info for this system | [optional] 
**api_version** | **str** |  | [optional] 
**used_model** | [**Model**](Model.md) |  | [optional] 

## Example

```python
from starwit_aic_api.models.info import Info

# TODO update the JSON string below
json = "{}"
# create an instance of Info from a JSON string
info_instance = Info.from_json(json)
# print the JSON string representation of the object
print(Info.to_json())

# convert the object into a dict
info_dict = info_instance.to_dict()
# create an instance of Info from a dict
info_from_dict = Info.from_dict(info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


