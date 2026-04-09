package com.vungle.ads.internal.downloader;

import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.NoSpaceError;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.AssetDownloader;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.task.e;
import com.vungle.ads.internal.util.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;
import okio.GzipSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s9.r;
import y8.h;

/* loaded from: classes3.dex */
public final class AssetDownloader implements Downloader {

    @NotNull
    private static final String CONTENT_ENCODING = "Content-Encoding";

    @NotNull
    private static final String CONTENT_TYPE = "Content-Type";

    @NotNull
    public static final a Companion = new a(null);
    private static final int DOWNLOAD_CHUNK_SIZE = 2048;

    @NotNull
    private static final String GZIP = "gzip";
    private static final int MAX_PERCENT = 100;
    private static final int MINIMUM_SPACE_REQUIRED_MB = 20971520;
    private static final int PROGRESS_STEP = 1;

    @NotNull
    private static final String TAG = "AssetDownloader";

    @NotNull
    private final VungleThreadPoolExecutor downloadExecutor;

    @NotNull
    private final h okHttpClient$delegate;

    @NotNull
    private final q pathProvider;

    @NotNull
    private final List<DownloadRequest> transitioning;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        @NotNull
        public static final b INSTANCE = new b();

        @Nullable
        private static OkHttpClient client;

        private b() {
        }

        @NotNull
        public final OkHttpClient createOkHttpClient(@NotNull q pathProvider) {
            p.e(pathProvider, "pathProvider");
            OkHttpClient okHttpClient = client;
            if (okHttpClient != null) {
                return okHttpClient;
            }
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient.Builder builderFollowSslRedirects = builder.readTimeout(60L, timeUnit).connectTimeout(60L, timeUnit).cache(null).followRedirects(true).followSslRedirects(true);
            ConfigManager configManager = ConfigManager.INSTANCE;
            if (configManager.isCleverCacheEnabled()) {
                long cleverCacheDiskSize = configManager.getCleverCacheDiskSize();
                int cleverCacheDiskPercentage = configManager.getCleverCacheDiskPercentage();
                String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
                p.d(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
                long jMin = Math.min(cleverCacheDiskSize, (pathProvider.getAvailableBytes(absolutePath) * cleverCacheDiskPercentage) / 100);
                if (jMin > 0) {
                    builderFollowSslRedirects.cache(new Cache(pathProvider.getCleverCacheDir(), jMin));
                } else {
                    com.vungle.ads.internal.util.p.Companion.w("OkHttpClientWrapper", "cache disk capacity size <=0, no clever cache active.");
                }
            }
            OkHttpClient okHttpClientBuild = builderFollowSslRedirects.build();
            client = okHttpClientBuild;
            return okHttpClientBuild;
        }
    }

    public static final class c extends e {
        final /* synthetic */ AssetDownloadListener $downloadListener;
        final /* synthetic */ DownloadRequest $downloadRequest;

        public c(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) {
            this.$downloadRequest = downloadRequest;
            this.$downloadListener = assetDownloadListener;
        }

        @Override // com.vungle.ads.internal.task.e
        public int getPriority() {
            return this.$downloadRequest.getPriority();
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            AssetDownloader.this.launchRequest(this.$downloadRequest, this.$downloadListener);
        }
    }

    public AssetDownloader(@NotNull VungleThreadPoolExecutor downloadExecutor, @NotNull q pathProvider) {
        p.e(downloadExecutor, "downloadExecutor");
        p.e(pathProvider, "pathProvider");
        this.downloadExecutor = downloadExecutor;
        this.pathProvider = pathProvider;
        this.okHttpClient$delegate = kotlin.b.b(new l9.a() { // from class: com.vungle.ads.internal.downloader.AssetDownloader$okHttpClient$2
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final OkHttpClient invoke() {
                return AssetDownloader.b.INSTANCE.createOkHttpClient(this.this$0.pathProvider);
            }
        });
        this.transitioning = new ArrayList();
    }

    private final boolean checkSpaceAvailable(DownloadRequest downloadRequest) {
        q qVar = this.pathProvider;
        String absolutePath = qVar.getVungleDir().getAbsolutePath();
        p.d(absolutePath, "pathProvider.getVungleDir().absolutePath");
        long availableBytes = qVar.getAvailableBytes(absolutePath);
        if (availableBytes >= ServiceProvider.HTTP_CACHE_DISK_SIZE) {
            return true;
        }
        new NoSpaceError("Insufficient space " + availableBytes).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
        return false;
    }

    private final ResponseBody decodeGzipIfNeeded(Response response) {
        ResponseBody responseBodyBody = response.body();
        if (!r.x(GZIP, Response.header$default(response, CONTENT_ENCODING, null, 2, null), true) || responseBodyBody == null) {
            return responseBodyBody;
        }
        return new RealResponseBody(Response.header$default(response, "Content-Type", null, 2, null), -1L, Okio.buffer(new GzipSource(responseBodyBody.getBodySource())));
    }

    private final void deliverError(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener, AssetDownloadListener.DownloadError downloadError) {
        if (assetDownloadListener != null) {
            assetDownloadListener.onError(downloadError, downloadRequest);
        }
    }

    private final void deliverSuccess(File file, DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) {
        com.vungle.ads.internal.util.p.Companion.d(TAG, "On success " + downloadRequest);
        if (assetDownloadListener != null) {
            assetDownloadListener.onSuccess(file, downloadRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: download$lambda-0, reason: not valid java name */
    public static final void m308download$lambda0(DownloadRequest downloadRequest, AssetDownloader this$0, AssetDownloadListener assetDownloadListener) {
        p.e(this$0, "this$0");
        this$0.deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new OutOfMemory("Failed to execute download request: " + downloadRequest.getAsset().getServerPath()), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getINTERNAL_ERROR()));
    }

    private final OkHttpClient getOkHttpClient() {
        return (OkHttpClient) this.okHttpClient$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0262, code lost:
    
        r7.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED());
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0171 A[Catch: all -> 0x046f, Exception -> 0x0474, TRY_LEAVE, TryCatch #4 {Exception -> 0x0474, blocks: (B:39:0x016b, B:41:0x0171), top: B:254:0x016b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void launchRequest(com.vungle.ads.internal.downloader.DownloadRequest r29, com.vungle.ads.internal.downloader.AssetDownloadListener r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.downloader.AssetDownloader.launchRequest(com.vungle.ads.internal.downloader.DownloadRequest, com.vungle.ads.internal.downloader.AssetDownloadListener):void");
    }

    private final void onProgressChanged(DownloadRequest downloadRequest, AssetDownloadListener.Progress progress, AssetDownloadListener assetDownloadListener) {
        if (assetDownloadListener != null) {
            assetDownloadListener.onProgress(progress, downloadRequest);
        }
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancel(@Nullable DownloadRequest downloadRequest) {
        if (downloadRequest == null || downloadRequest.isCancelled()) {
            return;
        }
        downloadRequest.cancel();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancelAll() {
        Iterator<T> it = this.transitioning.iterator();
        while (it.hasNext()) {
            cancel((DownloadRequest) it.next());
        }
        this.transitioning.clear();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void download(@Nullable final DownloadRequest downloadRequest, @Nullable final AssetDownloadListener assetDownloadListener) {
        if (downloadRequest == null) {
            return;
        }
        this.transitioning.add(downloadRequest);
        this.downloadExecutor.execute(new c(downloadRequest, assetDownloadListener), new Runnable() { // from class: com.vungle.ads.internal.downloader.a
            @Override // java.lang.Runnable
            public final void run() {
                AssetDownloader.m308download$lambda0(downloadRequest, this, assetDownloadListener);
            }
        });
    }
}
