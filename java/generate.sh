#!/bin/bash

mvn clean

# kick out old generated code
rm -r aicockpit-jar/src
rm -r aicockpit-jar/target

echo "generate code"
mvn compile

GENERATOR_TARGET="target/generated-sources/openapi/src/main/java/de/starwit/aic"
PACKAGING_DIR="aicockpit-jar/src/main/java/de/starwit/aic"

echo "move generated code"
# make sure target folder exists
mkdir -p ${PACKAGING_DIR}/
cp -r -f ${GENERATOR_TARGET}/model               ${PACKAGING_DIR}/model
cp       ${GENERATOR_TARGET}/JSON.java           ${PACKAGING_DIR}/
cp       ${GENERATOR_TARGET}/ApiException.java   ${PACKAGING_DIR}/