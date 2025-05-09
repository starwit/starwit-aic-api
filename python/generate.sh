#!/bin/bash

GENERATOR_TARGET=starwit-aic-api
PACKAGING_DIR=generated-library

echo "downloading api spec files"
rm -rf spec_files
mkdir spec_files
curl -s -o spec_files/decision-api.yaml https://raw.githubusercontent.com/KI-Cockpit/ai-cockpit-api/refs/heads/main/aicockpit-api/decision-api.yaml
curl -s -o spec_files/configurationtypes.yaml https://raw.githubusercontent.com/KI-Cockpit/ai-cockpit-api/refs/heads/main/aicockpit-api/configurationtypes.yaml
curl -s -o spec_files/transparency-api.yaml https://raw.githubusercontent.com/KI-Cockpit/ai-cockpit-api/refs/heads/main/aicockpit-api/transparency-api.yaml

rm -rf ${GENERATOR_TARGET} openapitools.json
rm -rf ${PACKAGING_DIR}/starwit_aic_api/

mkdir -p ${GENERATOR_TARGET}

INPUT_FILES=""
for file in spec_files/*.yaml; do
    INPUT_FILES+="-i $file "
done

echo "using input file parameters: ${INPUT_FILES}"

openapi-generator-cli generate -g python \
    -o ${GENERATOR_TARGET} \
    ${INPUT_FILES} \
    --additional-properties=generateSourceCodeOnly=true,packageName=starwit_aic_api

mkdir -p ${PACKAGING_DIR}/starwit_aic_api/
cp -r ${GENERATOR_TARGET}/starwit_aic_api ${PACKAGING_DIR}/
