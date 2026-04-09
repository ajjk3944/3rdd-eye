const fs = require('fs');
const path = require('path');
const { execSync } = require('child_process');

const configFile = process.argv[2] || 'capacitor.config.prod.ts';
const mainConfigPath = path.join(__dirname, '../capacitor.config.ts');
const configBackupPath = path.join(__dirname, '../capacitor.config.backup.ts');
const androidPath = path.join(__dirname, '../android');

console.log('📱 Building Android app (Simple Mode)...\n');

try {
  // Step 1: Swap config file
  console.log(`1️⃣ Using config: ${configFile}...`);
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

  // Step 2: Build Next.js (API routes will be excluded automatically for static export)
  console.log('2️⃣ Building Next.js static export...');
  execSync('cross-env BUILD_TARGET=android next build', { stdio: 'inherit' });
  console.log('✅ Next.js build complete\n');

  // Step 3: Copy to Capacitor
  console.log('3️⃣ Copying to Android...');
  execSync('npx cap copy android', { stdio: 'inherit' });
  console.log('✅ Copied to Android\n');

  // Step 4: Build APK with Gradle
  console.log('4️⃣ Building APK with Gradle...');
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
  // Step 5: Restore config
  console.log('\n5️⃣ Restoring config...');
  if (fs.existsSync(configBackupPath)) {
    if (fs.existsSync(mainConfigPath)) {
      fs.rmSync(mainConfigPath, { force: true });
    }
    fs.renameSync(configBackupPath, mainConfigPath);
    console.log('✅ Config restored');
  }
}