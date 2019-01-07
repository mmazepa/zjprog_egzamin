#!/bin/bash

POINT=$1/src/Point.java
EDIST=$1/src/EuclideanDistance.java

if [ -f $POINT ]; then
	echo "Compiling Point..."
	javac -d $1/class $POINT
	echo "Compiling EuclideanDistance..."
	javac -d $1/class $EDIST
else
	echo "Compiling EuclideanDistance..."
	javac -d $1/class $EDIST
fi

echo "Done!"