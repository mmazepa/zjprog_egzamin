#!/bin/bash

POINT=$1/src/Point.java
if [ -f $POINT ]; then
	java -jar tools/ckjm-1.9.jar $1/class/Point.class
fi

java -jar tools/ckjm-1.9.jar $1/class/EuclideanDistance.class