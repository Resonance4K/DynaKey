
@echo off

echo\

echo Running the cmp.cmd file for DynaKey compilation.
echo Created by Resonance4K.

echo\
echo --------------------------------------------------
echo\

set SRC_DIR=src
set BIN_DIR=bin

echo Clearing all previously compiled files...

if exist %BIN_DIR% rmdir /s /q %BIN_DIR%

echo\
echo Compiling program...
echo\

if not exist %BIN_DIR% mkdir %BIN_DIR%

javac -d %BIN_DIR% -sourcepath %SRC_DIR%^
	%SRC_DIR%/DynaKey/Application/*.java^
	%SRC_DIR%/DynaKey/Container/*.java^
	%SRC_DIR%/DynaKey/Interface/*.java^
	%SRC_DIR%/DynaKey/Key/*.java^
	%SRC_DIR%/DynaKey/Main/*.java^
	%SRC_DIR%/DynaKey/Render/*.java^
	%SRC_DIR%/DynaKey/Shape/*.java^
	%SRC_DIR%/DynaKey/Text/*.java^
	%SRC_DIR%/DynaKey/Window/*.java

echo Program compilation process completed!

echo\
echo --------------------------------------------------
echo\

pause > nul | set /p = Press any key to exit...
exit
