
#!/bin/bash

SRC_DIR=src
RES_DIR=resources
BIN_DIR=bin

echo
echo "Running the cmp.sh file for DynaKey compilation."
echo "Created by Resonance4K."
echo
echo "--------------------------------------------------"
echo

echo "Clearing all previously compiled files..."
echo "Clearing all copied resource files..."

if [ -d "${PWD}/${BIN_DIR}" ]; then rm -r -f "${PWD}/${BIN_DIR}"; fi

echo
echo "Compiling program..."

if ! [ -d "${PWD}/${BIN_DIR}" ]; then mkdir "${PWD}/${BIN_DIR}"; fi

javac -d ${BIN_DIR} -sourcepath ${SRC_DIR}\
	${SRC_DIR}/DynaKey/Application/*.java\
	${SRC_DIR}/DynaKey/Container/*.java\
	${SRC_DIR}/DynaKey/Interface/*.java\
	${SRC_DIR}/DynaKey/Key/*.java\
	${SRC_DIR}/DynaKey/Main/*.java\
	${SRC_DIR}/DynaKey/Render/*.java\
	${SRC_DIR}/DynaKey/Shape/*.java\
	${SRC_DIR}/DynaKey/Text/*.java\
	${SRC_DIR}/DynaKey/Window/*.java

echo "Copying resources..."

cp -r "${RES_DIR}/." ${BIN_DIR}

echo
echo "Program compilation process completed!"
echo
echo "--------------------------------------------------"
echo
read -s -p "Press the enter key to exit..." key
echo
echo
exit
