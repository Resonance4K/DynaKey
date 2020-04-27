
@echo off

set BIN_DIR=bin
set MAIN_FILE=DynaKey/Main/Main

echo\
echo Running the run.cmd file for DynaKey execution.
echo Created by Resonance4K.
echo\
echo --------------------------------------------------
echo\

echo Running program...
echo\
echo Program output (if available):

java -cp %BIN_DIR% %MAIN_FILE%

echo\
echo\
echo\
echo Program execution process completed!
echo\
echo --------------------------------------------------
echo\
pause > nul | set /p = Press any key to exit...
exit
