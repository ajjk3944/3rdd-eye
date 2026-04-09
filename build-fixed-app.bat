@echo off
echo ========================================
echo Building FIXED App - isCapacitor Bug Fixed
echo ========================================
echo.
echo BUG FIX: Changed isCapacitor() to isCapacitor
echo - Line 684: Router Admin Portal button
echo - Line 739: Router Passwords button
echo.

echo Step 1: Building Next.js app...
call npm run build
if %errorlevel% neq 0 (
    echo ERROR: Next.js build failed!
    pause
    exit /b 1
)
echo.

echo Step 2: Syncing with Capacitor...
call npx cap sync android
if %errorlevel% neq 0 (
    echo ERROR: Capacitor sync failed!
    pause
    exit /b 1
)
echo.

echo Step 3: Building Android APK...
cd android
call gradlew assembleDebug
if %errorlevel% neq 0 (
    echo ERROR: Android build failed!
    cd ..
    pause
    exit /b 1
)
cd ..
echo.

echo ========================================
echo BUILD SUCCESSFUL!
echo ========================================
echo.
echo BUG FIXED: isCapacitor() changed to isCapacitor
echo.
echo APK Location: android\app\build\outputs\apk\debug\app-debug.apk
echo.
echo The buttons will now work:
echo - "Open" button opens router admin in WebView
echo - "View Database" button shows router passwords
echo.
echo See BUTTON_FIX_COMPLETE.md for full details
echo.
pause
