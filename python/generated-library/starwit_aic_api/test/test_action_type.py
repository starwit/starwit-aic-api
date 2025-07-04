# coding: utf-8

"""
    AI Cockpit Transparency

    This API is part of project AI cockpit.   For more details see: https://www.kicockpit.eu/ 

    The version of the OpenAPI document: 0.0.3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from starwit_aic_api.models.action_type import ActionType

class TestActionType(unittest.TestCase):
    """ActionType unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ActionType:
        """Test ActionType
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ActionType`
        """
        model = ActionType()
        if include_optional:
            return ActionType(
                id = 56,
                name = '',
                description = '',
                endpoint = '',
                execution_policy = 'MANUAL',
                module = starwit_aic_api.models.module.Module(
                    id = 56, 
                    version = '', 
                    name = '', 
                    application_identifier = '', 
                    description = '', 
                    use_ai = True, 
                    model = starwit_aic_api.models.ai_model.AIModel(
                        name = '', 
                        version = '', 
                        last_deployment = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        model_type = 'LLM', 
                        model_link = '', 
                        public_training_data = True, 
                        link_to_public_training_data = '', ), 
                    action_types = [
                        starwit_aic_api.models.action_type.ActionType(
                            id = 56, 
                            name = '', 
                            description = '', 
                            endpoint = '', 
                            execution_policy = 'MANUAL', )
                        ], 
                    decision_types = [
                        starwit_aic_api.models.decision_type.DecisionType(
                            id = 56, 
                            name = '', 
                            description = '', )
                        ], 
                    s_bom_location = {
                        'key' : starwit_aic_api.models.module_s_bom_location_value.Module_sBOMLocation_value(
                            url = '', )
                        }, 
                    successors = [
                        starwit_aic_api.models.module.Module(
                            id = 56, 
                            version = '', 
                            name = '', 
                            application_identifier = '', 
                            description = '', 
                            use_ai = True, )
                        ], )
            )
        else:
            return ActionType(
        )
        """

    def testActionType(self):
        """Test ActionType"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
