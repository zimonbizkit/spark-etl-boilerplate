#!/bin/bash

set -e

docker build -t spark-base:latest ./docker/base --no-cache
docker build -t spark-master:latest ./docker/spark-master --no-cache
docker build -t spark-worker:latest ./docker/spark-worker --no-cache
docker build -t spark-submit:latest ./docker/spark-submit --no-cache
