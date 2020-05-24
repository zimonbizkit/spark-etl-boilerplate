#!/bin/bash

echo "Bash version ${BASH_VERSION}..."
pwd
while [[ $(stat -f %z "./data/input.csv") -lt $1 ]]
do
    for i in $(seq 1 4)
    do
        sh ./scripts/data-generator/requestor.sh &
    done
    wait
    sleep 2

done