#!/bin/bash

./scripts/ckjm.sh 00_code_to_repair
echo "------------------------------------"
./scripts/ckjm.sh 01_rename_variable
echo "------------------------------------"
./scripts/ckjm.sh 02_extract_method
echo "------------------------------------"
./scripts/ckjm.sh 03_return_modified_value
echo "------------------------------------"
./scripts/ckjm.sh 04_inline_variable
echo "------------------------------------"
./scripts/ckjm.sh 05_combine_functions_into_class
echo "------------------------------------"
./scripts/ckjm.sh 06_add_line_class
echo "------------------------------------"
./scripts/ckjm.sh 07_open_close
echo "------------------------------------"
./scripts/ckjm.sh 08_open_close_2
