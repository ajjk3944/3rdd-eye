@echo off
echo Copying Flipper-IRDB to public folder...
echo This may take a few minutes...

robocopy "Flipper-IRDB-main" "public\Flipper-IRDB-main" /E /NFL /NDL

echo.
echo Done! Flipper-IRDB copied to public folder.
pause
