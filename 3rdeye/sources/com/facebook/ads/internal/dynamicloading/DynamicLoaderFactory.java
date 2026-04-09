package com.facebook.ads.internal.dynamicloading;

import B4.f;
import I2.d;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
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

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class DynamicLoaderFactory {
    private static final String AUDIENCE_NETWORK_CODE_PATH = "audience_network";
    public static final String AUDIENCE_NETWORK_DEX = "audience_network.dex";
    private static final String CODE_CACHE_DIR = "code_cache";
    static final String DEX_LOADING_ERROR_MESSAGE = "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder.";
    private static final int DEX_LOAD_RETRY_COUNT = 3;
    private static final int DEX_LOAD_RETRY_DELAY_MS = 200;
    private static final String OPTIMIZED_DEX_PATH = "optimized";
    private static boolean sFallbackMode;
    private static final String DYNAMIC_LOADING_BUILD_TYPE = "releaseDL";
    public static final boolean LOAD_FROM_ASSETS = DYNAMIC_LOADING_BUILD_TYPE.equals(BuildConfig.BUILD_TYPE);
    private static final AtomicReference<DynamicLoader> sDynamicLoader = new AtomicReference<>();
    private static final AtomicBoolean sInitializing = new AtomicBoolean();
    private static boolean sUseLegacyClassLoader = true;

    public interface RemoteClassLoaderFactory {
        ClassLoader create(Context context);
    }

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f22328b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f22329c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MultithreadedBundleWrapper f22330d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AudienceNetworkAds.InitListener f22331e;

        public a(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, boolean z10) {
            this.f22328b = context;
            this.f22329c = z10;
            this.f22330d = multithreadedBundleWrapper;
            this.f22331e = initListener;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"CatchGeneralException"})
        public final void run() {
            Throwable th;
            DynamicLoader dynamicLoader;
            int i;
            ANActivityLifecycleCallbacksListener.registerActivityCallbacks(this.f22328b);
            synchronized (DynamicLoaderFactory.class) {
                DynamicLoader dynamicLoaderDoMakeLoader = null;
                th = null;
                int i10 = 0;
                while (i10 < 3) {
                    try {
                        dynamicLoaderDoMakeLoader = DynamicLoaderFactory.doMakeLoader(this.f22328b, false);
                        break;
                    } finally {
                        if (i10 == i) {
                            try {
                            } catch (Throwable th2) {
                            }
                        }
                    }
                }
                dynamicLoader = dynamicLoaderDoMakeLoader;
            }
            DynamicLoaderFactory.doCallInitialize(this.f22328b, dynamicLoader, th, this.f22329c, this.f22330d, this.f22331e);
            DynamicLoaderFactory.sInitializing.set(false);
        }
    }

    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AudienceNetworkAds.InitListener f22332b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Throwable f22333c;

        public b(AudienceNetworkAds.InitListener initListener, Throwable th) {
            this.f22332b = initListener;
            this.f22333c = th;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f22332b.onInitialized(DynamicLoaderFactory.createErrorInitResult(this.f22333c));
        }
    }

    public class c implements AudienceNetworkAds.InitResult {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f22334a;

        public c(Throwable th) {
            this.f22334a = th;
        }

        @Override // com.facebook.ads.AudienceNetworkAds.InitResult
        public final String getMessage() {
            return DynamicLoaderFactory.createErrorMessage(this.f22334a);
        }

        @Override // com.facebook.ads.AudienceNetworkAds.InitResult
        public final boolean isSuccess() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudienceNetworkAds.InitResult createErrorInitResult(Throwable th) {
        return new c(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createErrorMessage(Throwable th) {
        return "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder.\n" + stackTraceToString(th);
    }

    @SuppressLint({"CatchGeneralException"})
    @TargetApi(26)
    private static ClassLoader createInMemoryClassLoader(Context context) throws IOException {
        try {
            ClassLoader classLoaderCreate = ((RemoteClassLoaderFactory) context.getClassLoader().loadClass("com.facebook.ads.internal.dynamicloading.RemoteClassLoaderFactoryImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).create(context);
            if (classLoaderCreate != null) {
                return classLoaderCreate;
            }
        } catch (Exception unused) {
            FlashPreferences.getSharedPreferences(context).edit().clear().apply();
        }
        InputStream inputStreamOpen = context.getAssets().open(AUDIENCE_NETWORK_DEX);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStreamOpen.read(bArr);
            if (i <= 0) {
                inputStreamOpen.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                d.l();
                return H2.b.g(byteBufferWrap, DynamicLoaderFactory.class.getClassLoader());
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void doCallInitialize(Context context, DynamicLoader dynamicLoader, Throwable th, boolean z10, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener) {
        if (th != null) {
            if (initListener != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new b(initListener, th), 100L);
                return;
            } else {
                Log.e(AudienceNetworkAds.TAG, DEX_LOADING_ERROR_MESSAGE, th);
                return;
            }
        }
        if (dynamicLoader != null) {
            if (z10) {
                dynamicLoader.createAudienceNetworkAdsApi().onContentProviderCreated(context);
            } else {
                dynamicLoader.createAudienceNetworkAdsApi().initialize(context, multithreadedBundleWrapper, initListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DynamicLoader doMakeLoader(Context context, boolean z10) throws Exception {
        DynamicLoader dynamicLoader;
        AtomicReference<DynamicLoader> atomicReference = sDynamicLoader;
        DynamicLoader dynamicLoader2 = atomicReference.get();
        if (dynamicLoader2 != null) {
            return dynamicLoader2;
        }
        if (LOAD_FROM_ASSETS) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            dynamicLoader = (DynamicLoader) makeAdsSdkClassLoader(context.getApplicationContext()).loadClass("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
            Log.d(AudienceNetworkAds.TAG, "SDK dex loading time: " + (System.currentTimeMillis() - jCurrentTimeMillis));
        } else {
            dynamicLoader = (DynamicLoader) Class.forName("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
        }
        if (z10) {
            dynamicLoader.maybeInitInternally(context);
        }
        atomicReference.set(dynamicLoader);
        return dynamicLoader;
    }

    @SuppressLint({"PrivateApi", "CatchGeneralException"})
    private static Context getApplicationContextViaReflection() {
        try {
            return (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
        } catch (Throwable th) {
            Log.e(AudienceNetworkAds.TAG, "Failed to fetch Context from  ActivityThread. Audience Network SDK won't work unless you call AudienceNetworkAds.buildInitSettings().withListener(InitListener).initialize().", th);
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
        File file2 = new File(file, AUDIENCE_NETWORK_CODE_PATH);
        mkdirChecked(file2);
        return file2;
    }

    public static void initialize(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, boolean z10) {
        if (z10 || !sInitializing.getAndSet(true)) {
            new Thread(new a(context, multithreadedBundleWrapper, initListener, z10)).start();
        }
    }

    public static synchronized boolean isFallbackMode() {
        return sFallbackMode;
    }

    private static ClassLoader makeAdsSdkClassLoader(Context context) throws Exception {
        if (Build.VERSION.SDK_INT >= 30) {
            return createInMemoryClassLoader(context);
        }
        if (sUseLegacyClassLoader) {
            return makeLegacyAdsSdkClassLoader(context);
        }
        File secondaryDir = getSecondaryDir(getCodeCacheDir(context, new File(context.getApplicationInfo().dataDir)));
        StringBuilder sb = new StringBuilder();
        sb.append(secondaryDir.getPath());
        String strC = f.c(sb, File.separator, AUDIENCE_NETWORK_DEX);
        InputStream inputStreamOpen = context.getAssets().open(AUDIENCE_NETWORK_DEX);
        FileOutputStream fileOutputStream = new FileOutputStream(strC);
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStreamOpen.read(bArr);
            if (i <= 0) {
                inputStreamOpen.close();
                fileOutputStream.flush();
                fileOutputStream.close();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(secondaryDir.getPath());
                File file = new File(f.c(sb2, File.separator, OPTIMIZED_DEX_PATH));
                mkdirChecked(file);
                return new DexClassLoader(strC, file.getPath(), null, context.getClassLoader());
            }
            fileOutputStream.write(bArr, 0, i);
        }
    }

    private static DexClassLoader makeLegacyAdsSdkClassLoader(Context context) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getPath());
        String strC = f.c(sb, File.separator, AUDIENCE_NETWORK_DEX);
        InputStream inputStreamOpen = context.getAssets().open(AUDIENCE_NETWORK_DEX);
        FileOutputStream fileOutputStream = new FileOutputStream(strC);
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStreamOpen.read(bArr);
            if (i <= 0) {
                inputStreamOpen.close();
                fileOutputStream.flush();
                fileOutputStream.close();
                return new DexClassLoader(strC, context.getDir(OPTIMIZED_DEX_PATH, 0).getPath(), null, DynamicLoaderFactory.class.getClassLoader());
            }
            fileOutputStream.write(bArr, 0, i);
        }
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

    public static synchronized void setFallbackMode(boolean z10) {
        try {
            if (z10) {
                sDynamicLoader.set(DynamicLoaderFallback.makeFallbackLoader());
                sFallbackMode = true;
            } else {
                sDynamicLoader.set(null);
                sFallbackMode = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void setUseLegacyClassLoader(boolean z10) {
        sUseLegacyClassLoader = z10;
    }

    private static String stackTraceToString(Throwable th) {
        return Log.getStackTraceString(th);
    }

    @SuppressLint({"CatchGeneralException"})
    public static synchronized DynamicLoader makeLoader(Context context, boolean z10) {
        Preconditions.checkNotNull(context, "Context can not be null.");
        try {
        } catch (Throwable th) {
            Log.e(AudienceNetworkAds.TAG, DEX_LOADING_ERROR_MESSAGE, th);
            DexLoadErrorReporter.reportDexLoadingIssue(context, createErrorMessage(th), 0.1d);
            DynamicLoader dynamicLoaderMakeFallbackLoader = DynamicLoaderFallback.makeFallbackLoader();
            sDynamicLoader.set(dynamicLoaderMakeFallbackLoader);
            sFallbackMode = true;
            return dynamicLoaderMakeFallbackLoader;
        }
        return doMakeLoader(context, z10);
    }
}
