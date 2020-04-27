
#!/bin/bash

BIN_DIR=bin
MAIN_FILE=DynaKey/Main/Main

echo
echo "Running the run.sh file for DynaKey execution."
echo "Created by Resonance4K."
echo
echo "--------------------------------------------------"
echo

echo "Running program..."
echo
echo "Program output (if available):"

java -cp ${BIN_DIR} ${MAIN_FILE}

echo
echo
echo
echo Program execution process completed!
echo
echo "--------------------------------------------------"
echo
read -s -p "Press the enter key to exit..." key
echo
echo
exit
