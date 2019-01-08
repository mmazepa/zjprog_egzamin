#!/bin/bash

EDIST=$1/class/EuclideanDistance.class
POINT=$1/class/Point.class
ALINE=$1/class/Line.class

if [ -f $POINT ]; then
  java -jar tools/ckjm-1.9.jar $POINT
fi

if [ -f $ALINE ]; then
  java -jar tools/ckjm-1.9.jar $ALINE
fi

java -jar tools/ckjm-1.9.jar $EDIST
