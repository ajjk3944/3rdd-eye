package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.applovin.shadow.okio.Segment;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.Preconditions;
import com.facebook.infer.annotation.Nullsafe;
import dalvik.system.DexClassLoader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class DynamicLoaderFactory {
    private static final String AUDIENCE_NETWORK_CODE_PATH = "audience_network";
    public static final String AUDIENCE_NETWORK_DEX_FOLDER_NAME = "audience_network";
    private static final String CODE_CACHE_DIR = "code_cache";
    static final String DEX_LOADING_ERROR_MESSAGE = "Can't load Audience Network Dex. Please, check that audience_network folder is inside of assets folder.";
    private static final int DEX_LOAD_RETRY_COUNT = 3;
    private static final int DEX_LOAD_RETRY_DELAY_MS = 200;
    private static final String OPTIMIZED_DEX_PATH = "optimized";
    private static boolean sFallbackMode;
    private static final String DYNAMIC_LOADING_BUILD_TYPE = "releaseDL";
    public static final boolean LOAD_FROM_ASSETS = DYNAMIC_LOADING_BUILD_TYPE.equals(BuildConfig.BUILD_TYPE);
    public static final AtomicReference<DynamicLoader> sDynamicLoader = new AtomicReference<>();
    private static final AtomicBoolean sInitializing = new AtomicBoolean();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface RemoteClassLoaderFactory {
        ClassLoader create(Context context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudienceNetworkAds.InitResult createErrorInitResult(Throwable th2) {
        return new f(th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createErrorMessage(Throwable th2) {
        return "Can't load Audience Network Dex. Please, check that audience_network folder is inside of assets folder.\n" + stackTraceToString(th2);
    }

    @SuppressLint({"CatchGeneralException"})
    @TargetApi(27)
    private static ClassLoader createInMemoryClassLoader(Context context) throws IOException {
        try {
            ClassLoader classLoaderCreate = ((RemoteClassLoaderFactory) context.getClassLoader().loadClass("com.facebook.ads.internal.dynamicloading.RemoteClassLoaderFactoryImpl").getDeclaredConstructor(null).newInstance(null)).create(context);
            if (classLoaderCreate != null) {
                return classLoaderCreate;
            }
        } catch (Exception unused) {
            FlashPreferences.getSharedPreferences(context).edit().clear().apply();
        }
        String[] list = context.getAssets().list("audience_network");
        if (list == null || list.length == 0) {
            Log.e(AudienceNetworkAds.TAG, "Failed to find assets in audience_network");
            throw new RuntimeException("Failed to find assets in audience_network");
        }
        ByteBuffer[] byteBufferArr = new ByteBuffer[list.length];
        for (int i4 = 0; i4 < list.length; i4++) {
            String str = list[i4];
            InputStream inputStreamOpen = context.getAssets().open("audience_network" + File.separator + str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[Segment.SHARE_MINIMUM];
            while (true) {
                int i10 = inputStreamOpen.read(bArr);
                if (i10 > 0) {
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
            }
            inputStreamOpen.close();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            byteBufferArr[i4] = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
        }
        c.b();
        return b.b(byteBufferArr, DynamicLoaderFactory.class.getClassLoader());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void doCallInitialize(Context context, DynamicLoader dynamicLoader, Throwable th2, boolean z3, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener) {
        if (th2 != null) {
            if (initListener != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new e(initListener, th2), 100L);
                return;
            } else {
                Log.e(AudienceNetworkAds.TAG, DEX_LOADING_ERROR_MESSAGE, th2);
                return;
            }
        }
        if (dynamicLoader != null) {
            if (z3) {
                dynamicLoader.createAudienceNetworkAdsApi().onContentProviderCreated(context);
            } else {
                dynamicLoader.createAudienceNetworkAdsApi().initialize(context, multithreadedBundleWrapper, initListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DynamicLoader doMakeLoader(Context context, boolean z3) throws Exception {
        AtomicReference<DynamicLoader> atomicReference = sDynamicLoader;
        DynamicLoader dynamicLoader = atomicReference.get();
        if (dynamicLoader == null) {
            if (LOAD_FROM_ASSETS) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                dynamicLoader = (DynamicLoader) makeAdsSdkClassLoader(context.getApplicationContext()).loadClass("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
                Log.d(AudienceNetworkAds.TAG, "SDK dex loading time: " + (System.currentTimeMillis() - jCurrentTimeMillis));
            } else {
                dynamicLoader = (DynamicLoader) Class.forName("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
            }
            if (z3) {
                dynamicLoader.maybeInitInternally(context);
            }
            atomicReference.set(dynamicLoader);
        }
        return dynamicLoader;
    }

    @SuppressLint({"PrivateApi", "CatchGeneralException"})
    private static Context getApplicationContextViaReflection() {
        try {
            return (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
        } catch (Throwable th2) {
            Log.e(AudienceNetworkAds.TAG, "Failed to fetch Context from  ActivityThread. Audience Network SDK won't work unless you call AudienceNetworkAds.buildInitSettings().withListener(InitListener).initialize().", th2);
            return null;
        }
    }

    private static File getCacheCodeDirLegacy(Context context, File file) throws IOException {
        File file2 = new File(file, CODE_CACHE_DIR);
        try {
            mkdirChecked(file2);
            return file2;
        } catch (IOException unused) {
            File dir = context.getDir(CODE_CACHE_DIR, 0);
            mkdirChecked(dir);
            return dir;
        }
    }

    private static File getCodeCacheDir(Context context, File file) throws IOException {
        return context.getCodeCacheDir();
    }

    public static DynamicLoader getDynamicLoader() {
        return sDynamicLoader.get();
    }

    private static File getSecondaryDir(File file) throws IOException {
        File file2 = new File(file, "audience_network");
        mkdirChecked(file2);
        return file2;
    }

    public static void initialize(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, boolean z3) {
        if (z3 || !sInitializing.getAndSet(true)) {
            new Thread(new d(context, multithreadedBundleWrapper, initListener, z3)).start();
        }
    }

    public static synchronized boolean isFallbackMode() {
        return sFallbackMode;
    }

    private static ClassLoader makeAdsSdkClassLoader(Context context) throws Exception {
        return Build.VERSION.SDK_INT >= 30 ? createInMemoryClassLoader(context) : makeLegacyAdsSdkClassLoader(context);
    }

    private static DexClassLoader makeLegacyAdsSdkClassLoader(Context context) throws Exception {
        String path = context.getFilesDir().getPath();
        String[] list = context.getAssets().list("audience_network");
        if (list == null || list.length == 0) {
            Log.e(AudienceNetworkAds.TAG, "Failed to find assets in audience_network");
            throw new RuntimeException("Failed to find assets in audience_network");
        }
        int length = list.length;
        String[] strArr = new String[length];
        for (int i4 = 0; i4 < list.length; i4++) {
            String str = list[i4];
            StringBuilder sbZ = d.h.z(path);
            String str2 = File.separator;
            strArr[i4] = d.h.w(sbZ, str2, str);
            InputStream inputStreamOpen = context.getAssets().open("audience_network" + str2 + str);
            FileOutputStream fileOutputStream = new FileOutputStream(strArr[i4]);
            byte[] bArr = new byte[Segment.SHARE_MINIMUM];
            while (true) {
                int i10 = inputStreamOpen.read(bArr);
                if (i10 > 0) {
                    fileOutputStream.write(bArr, 0, i10);
                }
            }
            inputStreamOpen.close();
            fileOutputStream.flush();
            fileOutputStream.close();
        }
        String str3 = File.pathSeparator;
        if (str3 == null) {
            throw new NullPointerException("delimiter");
        }
        StringBuilder sb2 = new StringBuilder();
        if (length > 0) {
            sb2.append((CharSequence) strArr[0]);
            for (int i11 = 1; i11 < length; i11++) {
                sb2.append((CharSequence) str3);
                sb2.append((CharSequence) strArr[i11]);
            }
        }
        return new DexClassLoader(sb2.toString(), context.getDir(OPTIMIZED_DEX_PATH, 0).getPath(), null, DynamicLoaderFactory.class.getClassLoader());
    }

    public static synchronized DynamicLoader makeLoader(Context context) {
        return makeLoader(context, true);
    }

    @SuppressLint({"CatchGeneralException"})
    public static synchronized DynamicLoader makeLoaderUnsafe() {
        AtomicReference<DynamicLoader> atomicReference = sDynamicLoader;
        if (atomicReference.get() != null) {
            return atomicReference.get();
        }
        Context applicationContextViaReflection = getApplicationContextViaReflection();
        if (applicationContextViaReflection == null) {
            throw new RuntimeException("You must call AudienceNetworkAds.buildInitSettings(Context).initialize() before you can use Audience Network SDK.");
        }
        return makeLoader(applicationContextViaReflection, true);
    }

    private static void mkdirChecked(File file) throws IOException {
        String str;
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            str = "Failed to create dir " + file.getPath() + ". Parent file is null.";
        } else {
            str = "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite();
        }
        Log.e(AudienceNetworkAds.TAG, str);
        throw new IOException("Failed to create directory " + file.getPath() + ", detailed message: " + str);
    }

    public static synchronized void setFallbackMode(boolean z3) {
        try {
            if (z3) {
                sDynamicLoader.set(DynamicLoaderFallback.makeFallbackLoader());
                sFallbackMode = true;
            } else {
                sDynamicLoader.set(null);
                sFallbackMode = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static String stackTraceToString(Throwable th2) {
        return Log.getStackTraceString(th2);
    }

    @SuppressLint({"CatchGeneralException"})
    public static synchronized DynamicLoader makeLoader(Context context, boolean z3) {
        Preconditions.checkNotNull(context, "Context can not be null.");
        try {
        } catch (Throwable th2) {
            Log.e(AudienceNetworkAds.TAG, DEX_LOADING_ERROR_MESSAGE, th2);
            DexLoadErrorReporter.reportDexLoadingIssue(context, createErrorMessage(th2), 0.1d);
            DynamicLoader dynamicLoaderMakeFallbackLoader = DynamicLoaderFallback.makeFallbackLoader();
            sDynamicLoader.set(dynamicLoaderMakeFallbackLoader);
            sFallbackMode = true;
            return dynamicLoaderMakeFallbackLoader;
        }
        return doMakeLoader(context, z3);
    }
}
