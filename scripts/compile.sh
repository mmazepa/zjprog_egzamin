#!/bin/bash

EDIST=$1/src/EuclideanDistance.java
POINT=$1/src/Point.java
ALINE=$1/src/Line.java

echo "Compiling EuclideanDistance..."
javac -d $1/class $EDIST

if [ -f $POINT ]; then
	echo "Compiling Point..."
	javac -d $1/class $POINT
fi

if [ -f $ALINE ]; then
	echo "Compiling Line..."
	javac -d $1/class $ALINE
fi

echo "Done!"
