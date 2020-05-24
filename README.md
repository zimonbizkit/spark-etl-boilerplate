# ETL-Runner with Spark

# General

A simple spark standalone cluster for your testing environment purposses. 

The Docker compose will create the following containers:

container|Ip address
---|---
spark-master|10.5.0.2
spark-worker-1|10.5.0.3

# Installation

```
make up
```


## Validate your cluster

Just validate your cluster accesing the spark UI on each worker & master URL.

### Spark Master

http://10.5.0.2:8080/

![alt text](docs/spark-master.png "Spark master UI")

# Resource Allocation 

This cluster is shipped with three workers and one spark master, each of these has a particular set of resource allocation(basically RAM & cpu cores allocation).

* The default CPU cores allocation for each spark worker is 1 core.

* The default RAM for each spark-worker is 1024 MB.

* The default RAM allocation for spark executors is 256mb.

* The default RAM allocation for spark driver is 128mb

* If you wish to modify this allocations just edit the env/spark-worker.sh file.



