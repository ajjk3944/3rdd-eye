const fs = require('fs');
const path = require('path');
const { execSync } = require('child_process');

const apiPath = path.join(__dirname, '../src/app/api');
const apiBackupPath = path.join(__dirname, '../.api-backup');
const configFile = process.argv[2] || 'capacitor.config.prod.ts';
const mainConfigPath = path.join(__dirname, '../capacitor.config.ts');
const configBackupPath = path.join(__dirname, '../capacitor.config.backup.ts');
const androidPath = path.join(__dirname, '../android');

console.log('📱 Building Android app...\n');

// Helper function to safely remove directory
function safeRemoveDir(dirPath) {
  if (fs.existsSync(dirPath)) {
    try {
      fs.rmSync(dirPath, { recursive: true, force: true });
      return true;
    } catch (error) {
      console.warn(`⚠️ Could not remove ${dirPath}: ${error.message}`);
      return false;
    }
  }
  return true;
}

// Helper function to safely rename/move directory
function safeMoveDir(source, destination) {
  try {
    // First try to remove destination if it exists
    safeRemoveDir(destination);
    
    // Try to rename
    fs.renameSync(source, destination);
    return true;
  } catch (error) {
    console.warn(`⚠️ Could not move ${source} to ${destination}: ${error.message}`);
    
    // Fallback: try copying instead of renaming
    try {
      if (fs.existsSync(source)) {
        fs.cpSync(source, destination, { recursive: true });
        safeRemoveDir(source);
        return true;
      }
    } catch (copyError) {
      console.warn(`⚠️ Copy fallback also failed: ${copyError.message}`);
      return false;
    }
  }
  return false;
}

// Helper function to wait for file system operations
function waitForFS(ms = 1000) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

// Main async function
async function buildAndroid() {
try {
  // Step 0: Check if dev server is running and warn user
  console.log('0️⃣ Checking for running processes...');
  try {
    // Check if port 3000 is in use (dev server)
    const netstat = execSync('netstat -an | findstr :3000', { encoding: 'utf8' });
    if (netstat.includes('LISTENING')) {
      console.log('⚠️ Development server appears to be running on port 3000');
      console.log('💡 Please stop the dev server (Ctrl+C) before building Android app');
      console.log('⏳ Waiting 3 seconds for you to stop it...\n');
      await waitForFS(3000);
    }
  } catch (e) {
    // Port not in use, continue
  }

  // Step 1: Backup API folder
  console.log('1️⃣ Backing up API routes...');
  if (fs.existsSync(apiPath)) {
    const success = safeMoveDir(apiPath, apiBackupPath);
    if (success) {
      console.log('✅ API routes backed up\n');
    } else {
      console.log('⚠️ Could not backup API routes, continuing without backup...\n');
    }
  } else {
    console.log('ℹ️ No API routes to backup\n');
  }

  // Step 2: Swap config file
  console.log(`2️⃣ Using config: ${configFile}...`);
  const sourceConfigPath = path.join(__dirname, '..', configFile);
  
  // Only swap if using a different config file
  if (configFile !== 'capacitor.config.ts' && fs.existsSync(sourceConfigPath)) {
    if (fs.existsSync(mainConfigPath)) {
      fs.renameSync(mainConfigPath, configBackupPath);
    }
    fs.copyFileSync(sourceConfigPath, mainConfigPath);
    console.log('✅ Config swapped\n');
  } else {
    console.log('✅ Using default config\n');
  }

  // Step 3: Build Next.js
  console.log('3️⃣ Building Next.js static export...');
  execSync('cross-env BUILD_TARGET=android next build', { stdio: 'inherit' });
  console.log('✅ Next.js build complete\n');

  // Step 4: Copy to Capacitor
  console.log('4️⃣ Copying to Android...');
  execSync('npx cap copy android', { stdio: 'inherit' });
  console.log('✅ Copied to Android\n');

  // Step 5: Build APK with Gradle
  console.log('5️⃣ Building APK with Gradle...');
  const isWindows = process.platform === 'win32';
  const gradleCmd = isWindows ? 'gradlew.bat' : './gradlew';
  execSync(`${gradleCmd} assembleDebug --no-daemon`, { 
    stdio: 'inherit',
    cwd: androidPath
  });
  console.log('✅ APK built\n');

  console.log('🎉 Android build complete!');
  console.log('📦 APK location: android/app/build/outputs/apk/debug/app-debug.apk');

} catch (error) {
  console.error('❌ Build failed:', error.message);
  process.exit(1);
} finally {
  // Step 6: Restore config
  console.log('\n6️⃣ Restoring config...');
  if (fs.existsSync(configBackupPath)) {
    if (fs.existsSync(mainConfigPath)) {
      safeRemoveDir(mainConfigPath);
    }
    fs.renameSync(configBackupPath, mainConfigPath);
    console.log('✅ Config restored');
  }

  // Step 7: Restore API folder
  console.log('7️⃣ Restoring API routes...');
  if (fs.existsSync(apiBackupPath)) {
    if (fs.existsSync(apiPath)) {
      safeRemoveDir(apiPath);
    }
    const success = safeMoveDir(apiBackupPath, apiPath);
    if (success) {
      console.log('✅ API routes restored');
    } else {
      console.log('⚠️ Could not restore API routes automatically');
      console.log(`💡 Please manually rename ${apiBackupPath} to ${apiPath}`);
    }
  }
}
}

// Run the build
buildAndroid();