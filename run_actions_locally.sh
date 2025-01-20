#!/bin/bash

if [ -z "$GITHUB_TOKEN" ]; then
    read -s -p "GITHUB_TOKEN: " GITHUB_TOKEN
    export GITHUB_TOKEN
fi

act -s GITHUB_TOKEN