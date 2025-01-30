#!/bin/bash

GENERATOR_TARGET=starwit-aic-api
PACKAGING_DIR=generated-library

rm -r ${GENERATOR_TARGET} openapitools.json
rm -r ${PACKAGING_DIR}/starwit_aic_api/

mkdir -p ${GENERATOR_TARGET}

openapi-generator-cli generate -g python \
    -o ${GENERATOR_TARGET} \
    -i ../ai-cockpit-api/aicockpit-api/decision-api.yaml \
    --additional-properties=generateSourceCodeOnly=true,packageName=starwit_aic_api

mkdir -p ${PACKAGING_DIR}/starwit_aic_api/
cp -r ${GENERATOR_TARGET}/starwit_aic_api ${PACKAGING_DIR}/