const fs = require('fs');
const path = require('path');
const { execSync } = require('child_process');

const configFile = process.argv[2] || 'capacitor.config.prod.ts';
const mainConfigPath = path.join(__dirname, '../capacitor.config.ts');
const configBackupPath = path.join(__dirname, '../capacitor.config.backup.ts');
const androidPath = path.join(__dirname, '../android');
const apiPath = path.join(__dirname, '../src/app/api');
const apiBackupPath = path.join(__dirname, '../.api-backup');

console.log('🧹 CLEAN BUILD - This will ensure fresh build with all changes\n');

// Helper function to safely remove directory
function safeRemoveDir(dirPath) {
  if (fs.existsSync(dirPath)) {
    try {
      console.log(`   Removing ${path.basename(dirPath)}...`);
      fs.rmSync(dirPath, { recursive: true, force: true });
      return true;
    } catch (error) {
      console.warn(`   ⚠️ Could not remove ${dirPath}: ${error.message}`);
      return false;
    }
  }
  return true;
}

try {
  // Step 1: Clean Next.js build cache
  console.log('1️⃣ Cleaning Next.js build cache...');
  safeRemoveDir(path.join(__dirname, '../.next'));
  safeRemoveDir(path.join(__dirname, '../out'));
  console.log('✅ Next.js cache cleaned\n');

  // Step 2: Clean Android build cache
  console.log('2️⃣ Cleaning Android build cache...');
  safeRemoveDir(path.join(androidPath, 'app/build'));
  safeRemoveDir(path.join(androidPath, 'build'));
  safeRemoveDir(path.join(androidPath, '.gradle'));
  console.log('✅ Android cache cleaned\n');

  // Step 3: Clean Capacitor web assets
  console.log('3️⃣ Cleaning Capacitor web assets...');
  safeRemoveDir(path.join(androidPath, 'app/src/main/assets/public'));
  console.log('✅ Capacitor assets cleaned\n');

  // Step 4: Backup API routes (they can't be statically exported)
  console.log('4️⃣ Backing up API routes...');
  if (fs.existsSync(apiPath)) {
    // Remove old backup if exists
    if (fs.existsSync(apiBackupPath)) {
      safeRemoveDir(apiBackupPath);
    }
    // Copy API folder to backup (use copy instead of rename to avoid permission issues)
    try {
      fs.cpSync(apiPath, apiBackupPath, { recursive: true });
      console.log('✅ API routes backed up');
      // Now remove the original
      safeRemoveDir(apiPath);
      console.log('✅ API routes removed (will be restored after build)\n');
    } catch (e) {
      console.log(`⚠️ Could not backup API routes: ${e.message}`);
      console.log('⚠️ Continuing without backup...\n');
    }
  } else {
    console.log('ℹ️ No API routes to backup\n');
  }

  // Step 5: Swap config file
  console.log(`5️⃣ Using config: ${configFile}...`);
  const sourceConfigPath = path.join(__dirname, '..', configFile);
  
  if (configFile !== 'capacitor.config.ts' && fs.existsSync(sourceConfigPath)) {
    if (fs.existsSync(mainConfigPath)) {
      fs.renameSync(mainConfigPath, configBackupPath);
    }
    fs.copyFileSync(sourceConfigPath, mainConfigPath);
    console.log('✅ Config swapped\n');
  } else {
    console.log('✅ Using default config\n');
  }

  // Step 6: Build Next.js (fresh build)
  console.log('6️⃣ Building Next.js static export (FRESH BUILD)...');
  console.log('   This may take a few minutes...\n');
  execSync('cross-env BUILD_TARGET=android next build', { stdio: 'inherit' });
  console.log('\n✅ Next.js build complete\n');

  // Step 7: Sync to Capacitor (force sync)
  console.log('7️⃣ Syncing to Android...');
  execSync('npx cap sync android', { stdio: 'inherit' });
  console.log('✅ Synced to Android\n');

  // Step 8: Clean Gradle cache before building
  console.log('8️⃣ Cleaning Gradle cache...');
  const isWindows = process.platform === 'win32';
  const gradleCmd = isWindows ? 'gradlew.bat' : './gradlew';
  try {
    execSync(`${gradleCmd} clean --no-daemon`, { 
      stdio: 'inherit',
      cwd: androidPath
    });
    console.log('✅ Gradle cache cleaned\n');
  } catch (e) {
    console.log('⚠️ Gradle clean had issues, continuing...\n');
  }

  // Step 9: Build APK with Gradle
  console.log('9️⃣ Building APK with Gradle...');
  console.log('   This may take several minutes...\n');
  execSync(`${gradleCmd} assembleDebug --no-daemon`, { 
    stdio: 'inherit',
    cwd: androidPath
  });
  console.log('\n✅ APK built\n');

  // Step 10: Show APK info
  const apkPath = path.join(androidPath, 'app/build/outputs/apk/debug/app-debug.apk');
  if (fs.existsSync(apkPath)) {
    const stats = fs.statSync(apkPath);
    const sizeInMB = (stats.size / (1024 * 1024)).toFixed(2);
    console.log('🎉 CLEAN BUILD COMPLETE!\n');
    console.log('📦 APK Details:');
    console.log(`   Location: android/app/build/outputs/apk/debug/app-debug.apk`);
    console.log(`   Size: ${sizeInMB} MB`);
    console.log(`   Modified: ${stats.mtime.toLocaleString()}\n`);
    console.log('✨ This APK contains ALL your latest changes!\n');
  } else {
    console.log('⚠️ APK file not found at expected location');
  }

} catch (error) {
  console.error('\n❌ Build failed:', error.message);
  console.error('\n💡 Troubleshooting tips:');
  console.error('   1. Make sure no dev server is running (stop with Ctrl+C)');
  console.error('   2. Close Android Studio if it\'s open');
  console.error('   3. Try running: npm run clean:all');
  console.error('   4. Check if you have enough disk space');
  process.exit(1);
} finally {
  // Step 11: Restore config
  console.log('\n🔄 Restoring config...');
  if (fs.existsSync(configBackupPath)) {
    if (fs.existsSync(mainConfigPath)) {
      fs.rmSync(mainConfigPath, { force: true });
    }
    fs.renameSync(configBackupPath, mainConfigPath);
    console.log('✅ Config restored');
  }

  // Step 12: Restore API routes
  console.log('🔄 Restoring API routes...');
  if (fs.existsSync(apiBackupPath)) {
    // Remove current API folder if exists
    if (fs.existsSync(apiPath)) {
      safeRemoveDir(apiPath);
    }
    // Restore from backup
    try {
      fs.renameSync(apiBackupPath, apiPath);
      console.log('✅ API routes restored\n');
    } catch (e) {
      console.log('⚠️ Could not restore API routes automatically');
      console.log(`💡 Please manually rename .api-backup to src/app/api\n`);
    }
  }
}
