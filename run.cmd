
@echo off

echo\

echo Running the run.cmd file for DynaKey execution.
echo Created by Resonance4K.

echo\
echo --------------------------------------------------
echo\

set BIN_DIR=bin

echo Running program...
echo\

echo Program output (if available):

java -cp %BIN_DIR% DynaKey/Main/Main

echo\
echo\
echo\

echo Program execution process completed!

echo\
echo --------------------------------------------------
echo\

pause > nul | set /p = Press any key to exit...
exit
