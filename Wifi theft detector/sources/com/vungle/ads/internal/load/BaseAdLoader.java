package com.vungle.ads.internal.load;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdPayloadError;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.AssetRequestError;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.InvalidEventIdError;
import com.vungle.ads.InvalidTemplateURLError;
import com.vungle.ads.NativeAssetError;
import com.vungle.ads.OmSdkJsError;
import com.vungle.ads.PlacementMismatchError;
import com.vungle.ads.PrivacyIconFallbackError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.f;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.presenter.k;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.task.ResendTpatJob;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.w;
import com.vungle.ads.y;
import com.vungle.ads.z;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q7.a;

/* loaded from: classes3.dex */
public abstract class BaseAdLoader {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final String DOWNLOADED_FILE_NOT_FOUND = "Downloaded file not found!";

    @NotNull
    private static final String TAG = "BaseAdLoader";

    @NotNull
    private final List<AdAsset> adAssets;

    @Nullable
    private com.vungle.ads.internal.load.a adLoaderCallback;

    @NotNull
    private z adOptionalDownloadDurationMetric;

    @NotNull
    private z adPreloadToReadyDurationMetric;

    @NotNull
    private final AdRequest adRequest;

    @NotNull
    private z adRequiredDownloadDurationMetric;

    @Nullable
    private q7.a advertisement;

    @NotNull
    private z assetDownloadDurationMetric;

    @NotNull
    private final Context context;

    @NotNull
    private final AtomicLong downloadCount;

    @NotNull
    private final Set<String> downloadRequiredAssets;

    @NotNull
    private final Downloader downloader;

    @NotNull
    private AtomicBoolean fullyDownloaded;
    private long loadStart;

    @Nullable
    private o logEntry;

    @NotNull
    private y mainVideoSizeMetric;

    @NotNull
    private AtomicBoolean notifyFailed;

    @NotNull
    private AtomicBoolean notifySuccess;

    @NotNull
    private final s7.b omInjector;

    @NotNull
    private final q pathProvider;

    @NotNull
    private final z requestToResponseMetric;

    @NotNull
    private AtomicBoolean requiredAssetDownloaded;

    @NotNull
    private final com.vungle.ads.internal.executor.a sdkExecutors;

    @NotNull
    private y templateHtmlSizeMetric;

    @NotNull
    private final VungleApiClient vungleApiClient;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements AssetDownloadListener {
        private boolean partialDownloadRecorded;

        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onError$lambda-1, reason: not valid java name */
        public static final void m319onError$lambda1(DownloadRequest downloadRequest, BaseAdLoader this$0, b this$1, AssetDownloadListener.DownloadError downloadError) {
            p.e(downloadRequest, "$downloadRequest");
            p.e(this$0, "this$0");
            p.e(this$1, "this$1");
            AdAsset asset = downloadRequest.getAsset();
            if (asset.isPrivacyIcon()) {
                File fileInjectPrivacyIcon = com.vungle.ads.internal.downloader.b.INSTANCE.injectPrivacyIcon(this$0.getPathProvider().getVmDir());
                if (fileInjectPrivacyIcon != null && fileInjectPrivacyIcon.exists()) {
                    this$1.onSuccess(fileInjectPrivacyIcon, downloadRequest);
                    return;
                }
                new PrivacyIconFallbackError("Failed to inject default privacy icon").setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
            }
            this$0.fullyDownloaded.set(false);
            if (asset.isRequired()) {
                this$0.requiredAssetDownloaded.set(false);
            }
            new AssetRequestError("Failed to download assets " + asset.getServerPath() + ". error: " + downloadError + " proxyEnabled=" + com.vungle.ads.internal.platform.c.INSTANCE.isProxyEnabled(this$0.getContext())).setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
            if (asset.isRequired()) {
                this$0.downloadRequiredAssets.remove(downloadRequest.getAsset().getServerPath());
                if (this$0.downloadRequiredAssets.isEmpty()) {
                    this$0.onAdLoadFailed(new AssetRequestError("Error: Failed to download required assets."));
                    this$0.cancel();
                    return;
                }
            }
            if (this$0.downloadCount.decrementAndGet() <= 0) {
                this$0.onAdLoadFailed(new AssetRequestError("Error: Failed to download assets."));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onProgress$lambda-0, reason: not valid java name */
        public static final void m320onProgress$lambda0(BaseAdLoader this$0, AdAsset adAsset) throws Throwable {
            p.e(this$0, "this$0");
            p.e(adAsset, "$adAsset");
            this$0.downloadRequiredAssets.remove(adAsset.getServerPath());
            if (this$0.downloadRequiredAssets.isEmpty()) {
                if (this$0.requiredAssetDownloaded.get()) {
                    this$0.onRequiredDownloadCompleted();
                } else {
                    this$0.onAdLoadFailed(new AssetRequestError("Failed to download required assets."));
                    this$0.cancel();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onSuccess$lambda-2, reason: not valid java name */
        public static final void m321onSuccess$lambda2(File file, b this$0, DownloadRequest downloadRequest, BaseAdLoader this$1) throws Throwable {
            p.e(file, "$file");
            p.e(this$0, "this$0");
            p.e(downloadRequest, "$downloadRequest");
            p.e(this$1, "this$1");
            if (!file.exists()) {
                this$0.onError(new AssetDownloadListener.DownloadError(-1, new IOException(BaseAdLoader.DOWNLOADED_FILE_NOT_FOUND), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getFILE_NOT_FOUND_ERROR()), downloadRequest);
                return;
            }
            AdAsset asset = downloadRequest.getAsset();
            asset.setFileSize(file.length());
            asset.setStatus(AdAsset.Status.DOWNLOAD_SUCCESS);
            if (asset.isHtmlTemplate()) {
                downloadRequest.stopTemplateRecord();
                this$1.templateHtmlSizeMetric.setValue(Long.valueOf(file.length()));
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this$1.templateHtmlSizeMetric, this$1.getLogEntry$vungle_ads_release(), asset.getServerPath());
            } else if (asset.isMainVideo()) {
                this$1.mainVideoSizeMetric.setValue(Long.valueOf(file.length()));
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this$1.mainVideoSizeMetric, this$1.getLogEntry$vungle_ads_release(), asset.getServerPath());
            }
            q7.a advertisement$vungle_ads_release = this$1.getAdvertisement$vungle_ads_release();
            if (advertisement$vungle_ads_release != null) {
                advertisement$vungle_ads_release.updateAdAssetPath(asset.getAdIdentifier(), file);
            }
            if (asset.isHtmlTemplate() && !this$1.processVmTemplate(asset, this$1.getAdvertisement$vungle_ads_release())) {
                this$1.fullyDownloaded.set(false);
                if (asset.isRequired()) {
                    this$1.requiredAssetDownloaded.set(false);
                }
            }
            if (asset.isRequired()) {
                this$1.downloadRequiredAssets.remove(asset.getServerPath());
                if (this$1.downloadRequiredAssets.isEmpty()) {
                    if (!this$1.requiredAssetDownloaded.get()) {
                        this$1.onAdLoadFailed(new AssetRequestError("Failed to download required assets."));
                        this$1.cancel();
                        return;
                    }
                    this$1.onRequiredDownloadCompleted();
                }
            }
            if (this$1.downloadCount.decrementAndGet() <= 0) {
                if (this$1.fullyDownloaded.get()) {
                    this$1.onDownloadCompleted(this$1.getAdRequest());
                } else {
                    this$1.onAdLoadFailed(new AssetRequestError("Failed to download assets."));
                }
            }
        }

        @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
        public void onError(@Nullable final AssetDownloadListener.DownloadError downloadError, @NotNull final DownloadRequest downloadRequest) {
            p.e(downloadRequest, "downloadRequest");
            com.vungle.ads.internal.util.p.Companion.e(BaseAdLoader.TAG, "onError called: " + downloadError);
            VungleThreadPoolExecutor backgroundExecutor = BaseAdLoader.this.getSdkExecutors().getBackgroundExecutor();
            final BaseAdLoader baseAdLoader = BaseAdLoader.this;
            backgroundExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.e
                @Override // java.lang.Runnable
                public final void run() {
                    BaseAdLoader.b.m319onError$lambda1(downloadRequest, baseAdLoader, this, downloadError);
                }
            });
        }

        @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
        public void onProgress(@NotNull AssetDownloadListener.Progress progress, @NotNull DownloadRequest downloadRequest) throws Throwable {
            p.e(progress, "progress");
            p.e(downloadRequest, "downloadRequest");
            final AdAsset asset = downloadRequest.getAsset();
            p.a aVar = com.vungle.ads.internal.util.p.Companion;
            aVar.d(BaseAdLoader.TAG, "Download progress: " + progress + " url: " + asset.getServerPath());
            if (!asset.isRequired() || asset.getPercentage() == null || progress.getProgressPercent() < asset.getPercentage().intValue() || this.partialDownloadRecorded) {
                return;
            }
            this.partialDownloadRecorded = true;
            downloadRequest.stopPartialDownloadRecord();
            aVar.w(BaseAdLoader.TAG, "Download progress: hit chunk percentage=" + asset.getPercentage() + " for url: " + asset.getServerPath());
            VungleThreadPoolExecutor backgroundExecutor = BaseAdLoader.this.getSdkExecutors().getBackgroundExecutor();
            final BaseAdLoader baseAdLoader = BaseAdLoader.this;
            backgroundExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.c
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    BaseAdLoader.b.m320onProgress$lambda0(baseAdLoader, asset);
                }
            });
        }

        @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
        public void onStart(@NotNull DownloadRequest downloadRequest) {
            kotlin.jvm.internal.p.e(downloadRequest, "downloadRequest");
            com.vungle.ads.internal.util.p.Companion.w(BaseAdLoader.TAG, "onStart called: " + downloadRequest.getAsset().getServerPath());
            AdAsset asset = downloadRequest.getAsset();
            if (asset.isRequired()) {
                Integer percentage = asset.getPercentage();
                if ((percentage != null ? percentage.intValue() : 0) > 0) {
                    downloadRequest.startPartialDownloadRecord();
                }
            }
        }

        @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
        public void onSuccess(@NotNull final File file, @NotNull final DownloadRequest downloadRequest) {
            kotlin.jvm.internal.p.e(file, "file");
            kotlin.jvm.internal.p.e(downloadRequest, "downloadRequest");
            VungleThreadPoolExecutor backgroundExecutor = BaseAdLoader.this.getSdkExecutors().getBackgroundExecutor();
            final BaseAdLoader baseAdLoader = BaseAdLoader.this;
            backgroundExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.d
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    BaseAdLoader.b.m321onSuccess$lambda2(file, this, downloadRequest, baseAdLoader);
                }
            });
        }
    }

    public static final class c implements k {
        final /* synthetic */ q7.a $it;

        public c(q7.a aVar) {
            this.$it = aVar;
        }

        @Override // com.vungle.ads.internal.presenter.k
        public void onAdFailedToPlay() throws Throwable {
            BaseAdLoader.this.adPreloadToReadyDurationMetric.markEnd();
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, BaseAdLoader.this.adPreloadToReadyDurationMetric, BaseAdLoader.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            com.vungle.ads.internal.util.p.Companion.e(BaseAdLoader.TAG, "fail to load ad");
            BaseAdLoader.this.onAdLoadReady();
            com.vungle.ads.internal.load.a aVar = BaseAdLoader.this.adLoaderCallback;
            if (aVar != null) {
                aVar.onSuccess(this.$it);
            }
        }

        @Override // com.vungle.ads.internal.presenter.k
        public void onAdReadyToPlay() throws Throwable {
            BaseAdLoader.this.adPreloadToReadyDurationMetric.markEnd();
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, BaseAdLoader.this.adPreloadToReadyDurationMetric, BaseAdLoader.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            BaseAdLoader.this.onAdLoadReady();
            com.vungle.ads.internal.load.a aVar = BaseAdLoader.this.adLoaderCallback;
            if (aVar != null) {
                aVar.onSuccess(this.$it);
            }
        }
    }

    public BaseAdLoader(@NotNull Context context, @NotNull VungleApiClient vungleApiClient, @NotNull com.vungle.ads.internal.executor.a sdkExecutors, @NotNull s7.b omInjector, @NotNull Downloader downloader, @NotNull q pathProvider, @NotNull AdRequest adRequest) {
        kotlin.jvm.internal.p.e(context, "context");
        kotlin.jvm.internal.p.e(vungleApiClient, "vungleApiClient");
        kotlin.jvm.internal.p.e(sdkExecutors, "sdkExecutors");
        kotlin.jvm.internal.p.e(omInjector, "omInjector");
        kotlin.jvm.internal.p.e(downloader, "downloader");
        kotlin.jvm.internal.p.e(pathProvider, "pathProvider");
        kotlin.jvm.internal.p.e(adRequest, "adRequest");
        this.context = context;
        this.vungleApiClient = vungleApiClient;
        this.sdkExecutors = sdkExecutors;
        this.omInjector = omInjector;
        this.downloader = downloader;
        this.pathProvider = pathProvider;
        this.adRequest = adRequest;
        this.downloadCount = new AtomicLong(0L);
        this.downloadRequiredAssets = new LinkedHashSet();
        this.notifySuccess = new AtomicBoolean(false);
        this.notifyFailed = new AtomicBoolean(false);
        this.adAssets = new ArrayList();
        this.fullyDownloaded = new AtomicBoolean(true);
        this.requiredAssetDownloaded = new AtomicBoolean(true);
        this.requestToResponseMetric = new z(Sdk$SDKMetric.SDKMetricType.AD_REQUEST_TO_RESPONSE_DURATION_MS);
        this.mainVideoSizeMetric = new y(Sdk$SDKMetric.SDKMetricType.ASSET_FILE_SIZE);
        this.templateHtmlSizeMetric = new y(Sdk$SDKMetric.SDKMetricType.TEMPLATE_HTML_SIZE);
        this.assetDownloadDurationMetric = new z(Sdk$SDKMetric.SDKMetricType.ASSET_DOWNLOAD_DURATION_MS);
        this.adRequiredDownloadDurationMetric = new z(Sdk$SDKMetric.SDKMetricType.AD_REQUIRED_DOWNLOAD_DURATION_MS);
        this.adOptionalDownloadDurationMetric = new z(Sdk$SDKMetric.SDKMetricType.AD_OPTIONAL_DOWNLOAD_DURATION_MS);
        this.adPreloadToReadyDurationMetric = new z(Sdk$SDKMetric.SDKMetricType.AD_PRELOAD_TO_READY_DURATION_MS);
    }

    private final void downloadAssets() {
        this.assetDownloadDurationMetric.markStart();
        this.adRequiredDownloadDurationMetric.markStart();
        this.adOptionalDownloadDurationMetric.markStart();
        this.downloadCount.set(this.adAssets.size());
        for (AdAsset adAsset : this.adAssets) {
            DownloadRequest downloadRequest = new DownloadRequest(getAssetPriority(adAsset), adAsset, this.logEntry);
            if (adAsset.isHtmlTemplate()) {
                downloadRequest.startTemplateRecord();
            }
            if (adAsset.isRequired()) {
                this.downloadRequiredAssets.add(adAsset.getServerPath());
            }
            this.downloader.download(downloadRequest, getAssetDownloadListener());
        }
    }

    private final boolean fileIsValid(File file, AdAsset adAsset) {
        return file.exists() && file.length() == adAsset.getFileSize();
    }

    private final AssetDownloadListener getAssetDownloadListener() {
        return new b();
    }

    private final DownloadRequest.Priority getAssetPriority(AdAsset adAsset) {
        return adAsset.isRequired() ? DownloadRequest.Priority.CRITICAL : DownloadRequest.Priority.HIGHEST;
    }

    private final File getDestinationDir(q7.a aVar) {
        return this.pathProvider.getDownloadsDirForAd(aVar.eventId());
    }

    private final VungleError getErrorInfo(q7.a aVar) {
        a.c cVarAdUnit = aVar.adUnit();
        Integer errorCode = cVarAdUnit != null ? cVarAdUnit.getErrorCode() : null;
        a.c cVarAdUnit2 = aVar.adUnit();
        Integer sleep = cVarAdUnit2 != null ? cVarAdUnit2.getSleep() : null;
        a.c cVarAdUnit3 = aVar.adUnit();
        String str = "Response error: " + sleep + ", Request failed with error: " + errorCode + ", " + (cVarAdUnit3 != null ? cVarAdUnit3.getInfo() : null);
        if ((errorCode == null || errorCode.intValue() != 10001) && ((errorCode == null || errorCode.intValue() != 10002) && ((errorCode == null || errorCode.intValue() != 20001) && ((errorCode == null || errorCode.intValue() != 30001) && (errorCode == null || errorCode.intValue() != 30002))))) {
            return new AdPayloadError(Sdk$SDKError.Reason.PLACEMENT_SLEEP, str);
        }
        Sdk$SDKError.Reason reasonForNumber = Sdk$SDKError.Reason.forNumber(errorCode.intValue());
        kotlin.jvm.internal.p.d(reasonForNumber, "forNumber(errorCode)");
        return new AdPayloadError(reasonForNumber, str);
    }

    private final VungleError getTemplateError(q7.a aVar) {
        a.c cVarAdUnit = aVar.adUnit();
        a.g templateSettings = cVarAdUnit != null ? cVarAdUnit.getTemplateSettings() : null;
        if (templateSettings == null) {
            return new AdResponseEmptyError("Missing template settings");
        }
        Map<String, a.d> cacheableReplacements = templateSettings.getCacheableReplacements();
        if (!aVar.isNativeTemplateType()) {
            a.c cVarAdUnit2 = aVar.adUnit();
            String vmURL = cVarAdUnit2 != null ? cVarAdUnit2.getVmURL() : null;
            if (vmURL == null || vmURL.length() == 0) {
                return new InvalidTemplateURLError("Failed to prepare null vmURL for downloading.");
            }
            if (!w.INSTANCE.isUrlValid(vmURL)) {
                return new InvalidTemplateURLError("Failed to load vm url: " + vmURL);
            }
        } else if (cacheableReplacements != null) {
            a.d dVar = cacheableReplacements.get(com.vungle.ads.internal.g.TOKEN_MAIN_IMAGE);
            if ((dVar != null ? dVar.getUrl() : null) == null) {
                return new NativeAssetError("Unable to load null main image.");
            }
            a.d dVar2 = cacheableReplacements.get("VUNGLE_PRIVACY_ICON_URL");
            if ((dVar2 != null ? dVar2.getUrl() : null) == null) {
                return new NativeAssetError("Unable to load null privacy image.");
            }
        }
        if (cacheableReplacements != null) {
            for (Map.Entry<String, a.d> entry : cacheableReplacements.entrySet()) {
                String url = entry.getValue().getUrl();
                if (url == null || url.length() == 0) {
                    return new InvalidAssetUrlError("None asset URL for " + entry.getKey());
                }
                if (!w.INSTANCE.isUrlValid(url)) {
                    return new InvalidAssetUrlError("Invalid asset URL " + url);
                }
            }
        }
        return null;
    }

    /* renamed from: handleAdMetaData$lambda-4, reason: not valid java name */
    private static final com.vungle.ads.internal.network.h m316handleAdMetaData$lambda4(y8.h hVar) {
        return (com.vungle.ads.internal.network.h) hVar.getValue();
    }

    public static /* synthetic */ void handleAdMetaData$vungle_ads_release$default(BaseAdLoader baseAdLoader, q7.a aVar, y yVar, int i10, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAdMetaData");
        }
        if ((i10 & 2) != 0) {
            yVar = null;
        }
        baseAdLoader.handleAdMetaData$vungle_ads_release(aVar, yVar);
    }

    private final void injectOMSDKIfNeeded() {
        q7.a aVar = this.advertisement;
        if (aVar == null || !aVar.omEnabled()) {
            return;
        }
        try {
            this.omInjector.init();
            this.omInjector.injectJsFiles$vungle_ads_release(this.pathProvider.getVmDir());
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Failed to inject OMSDK: " + e10.getMessage());
            new OmSdkJsError(Sdk$SDKError.Reason.OMSDK_JS_WRITE_FAILED, "Failed to inject OMSDK: " + e10.getMessage()).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAd$lambda-0, reason: not valid java name */
    public static final void m317loadAd$lambda0(BaseAdLoader this$0) {
        kotlin.jvm.internal.p.e(this$0, "this$0");
        this$0.requestToResponseMetric.markStart();
        this$0.requestAd();
    }

    private final void onAdReady() {
        q7.a aVar = this.advertisement;
        if (aVar == null || this.notifyFailed.get() || !this.notifySuccess.compareAndSet(false, true)) {
            return;
        }
        if (aVar.usePreloading()) {
            this.adPreloadToReadyDurationMetric.markStart();
            String strValueOf = String.valueOf(aVar.getIndexFilePath());
            com.vungle.ads.internal.util.p.Companion.w(TAG, "start preloading");
            WebViewManager.INSTANCE.preloadWebView$vungle_ads_release(this.context, aVar, this.adRequest.getPlacement(), strValueOf, aVar.getWebViewSettings(), new c(aVar), Long.valueOf(System.currentTimeMillis() - this.loadStart));
        } else {
            onAdLoadReady();
            com.vungle.ads.internal.load.a aVar2 = this.adLoaderCallback;
            if (aVar2 != null) {
                aVar2.onSuccess(aVar);
            }
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        final Context context = this.context;
        m318onAdReady$lambda2$lambda1(kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.load.BaseAdLoader$onAdReady$lambda-2$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.c, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final com.vungle.ads.internal.task.c invoke() {
                return ServiceLocator.Companion.getInstance(context).getService(com.vungle.ads.internal.task.c.class);
            }
        })).execute(ResendTpatJob.Companion.makeJobInfo());
    }

    /* renamed from: onAdReady$lambda-2$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.task.c m318onAdReady$lambda2$lambda1(y8.h hVar) {
        return (com.vungle.ads.internal.task.c) hVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void onDownloadCompleted(AdRequest adRequest) throws Throwable {
        com.vungle.ads.internal.util.p.Companion.d(TAG, "All download completed " + adRequest);
        q7.a aVar = this.advertisement;
        if (aVar != null) {
            aVar.setAssetFullyDownloaded();
        }
        onAdReady();
        this.assetDownloadDurationMetric.markEnd();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, this.assetDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
        this.adOptionalDownloadDurationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, this.adOptionalDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRequiredDownloadCompleted() throws Throwable {
        this.adRequiredDownloadDurationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.adRequiredDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
        onAdReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean processVmTemplate(AdAsset adAsset, q7.a aVar) {
        if (aVar == null || adAsset.getStatus() != AdAsset.Status.DOWNLOAD_SUCCESS || adAsset.getLocalPath().length() == 0 || !fileIsValid(new File(adAsset.getLocalPath()), adAsset)) {
            return false;
        }
        File destinationDir = getDestinationDir(aVar);
        if (destinationDir == null || !destinationDir.isDirectory()) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Unable to access Destination Directory");
            return false;
        }
        com.vungle.ads.internal.util.i.printDirectoryTree(destinationDir);
        return true;
    }

    private final VungleError validateAdMetadata(q7.a aVar) {
        a.c cVarAdUnit = aVar.adUnit();
        if (cVarAdUnit != null && cVarAdUnit.getSleep() != null) {
            return getErrorInfo(aVar);
        }
        String referenceId = this.adRequest.getPlacement().getReferenceId();
        q7.a aVar2 = this.advertisement;
        if (!kotlin.jvm.internal.p.a(referenceId, aVar2 != null ? aVar2.placementId() : null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Waterfall request and responses placement don't match ");
            q7.a aVar3 = this.advertisement;
            sb.append(aVar3 != null ? aVar3.placementId() : null);
            sb.append('.');
            return new PlacementMismatchError(sb.toString());
        }
        VungleError templateError = getTemplateError(aVar);
        if (templateError != null) {
            return templateError;
        }
        if (!aVar.hasExpired()) {
            String strEventId = aVar.eventId();
            if (strEventId == null || strEventId.length() == 0) {
                return new InvalidEventIdError("Event id is invalid.");
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("The ad markup has expired for playback. Ad expiry: ");
        a.c cVarAdUnit2 = aVar.adUnit();
        sb2.append(cVarAdUnit2 != null ? cVarAdUnit2.getExpiry() : null);
        sb2.append(", device: ");
        sb2.append(System.currentTimeMillis());
        return new AdExpiredError(sb2.toString());
    }

    public final void cancel() {
        this.downloader.cancelAll();
    }

    @NotNull
    public final AdRequest getAdRequest() {
        return this.adRequest;
    }

    @Nullable
    public final q7.a getAdvertisement$vungle_ads_release() {
        return this.advertisement;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final o getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    @NotNull
    public final q getPathProvider() {
        return this.pathProvider;
    }

    @NotNull
    public final com.vungle.ads.internal.executor.a getSdkExecutors() {
        return this.sdkExecutors;
    }

    @NotNull
    public final VungleApiClient getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final void handleAdMetaData$vungle_ads_release(@NotNull q7.a advertisement, @Nullable y yVar) throws Throwable {
        List<String> loadAdUrls;
        kotlin.jvm.internal.p.e(advertisement, "advertisement");
        this.advertisement = advertisement;
        if (advertisement != null) {
            advertisement.recordExpiryWindowStart();
        }
        advertisement.setLogEntry$vungle_ads_release(this.logEntry);
        o oVar = this.logEntry;
        if (oVar != null) {
            oVar.setEventId$vungle_ads_release(advertisement.eventId());
        }
        o oVar2 = this.logEntry;
        if (oVar2 != null) {
            oVar2.setCreativeId$vungle_ads_release(advertisement.getCreativeId());
        }
        o oVar3 = this.logEntry;
        if (oVar3 != null) {
            oVar3.setAdSource$vungle_ads_release(advertisement.getAdSource());
        }
        o oVar4 = this.logEntry;
        if (oVar4 != null) {
            oVar4.setMediationName$vungle_ads_release(advertisement.getMediationName());
        }
        o oVar5 = this.logEntry;
        if (oVar5 != null) {
            oVar5.setVmVersion$vungle_ads_release(advertisement.getViewMasterVersion());
        }
        o oVar6 = this.logEntry;
        if (oVar6 != null) {
            oVar6.setPartialDownloadEnabled$vungle_ads_release(Boolean.valueOf(advertisement.isPartialDownloadEnabled()));
        }
        o oVar7 = this.logEntry;
        if (oVar7 != null) {
            oVar7.setAdoEnabled$vungle_ads_release(Boolean.valueOf(advertisement.adLoadOptimizationEnabled()));
        }
        this.requestToResponseMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.requestToResponseMetric, this.logEntry, (String) null, 4, (Object) null);
        ConfigPayload configPayloadConfig = advertisement.config();
        if (configPayloadConfig != null) {
            ConfigManager.INSTANCE.initWithConfig$vungle_ads_release(this.context, configPayloadConfig, false, yVar);
        }
        VungleError vungleErrorValidateAdMetadata = validateAdMetadata(advertisement);
        if (vungleErrorValidateAdMetadata != null) {
            onAdLoadFailed(vungleErrorValidateAdMetadata.setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        File destinationDir = getDestinationDir(advertisement);
        if (destinationDir == null || !destinationDir.isDirectory() || !destinationDir.exists()) {
            onAdLoadFailed(new AssetWriteError("Invalid directory. " + destinationDir).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        injectOMSDKIfNeeded();
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        final Context context = this.context;
        y8.h hVarA = kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.load.BaseAdLoader$handleAdMetaData$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.h, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final com.vungle.ads.internal.network.h invoke() {
                return ServiceLocator.Companion.getInstance(context).getService(com.vungle.ads.internal.network.h.class);
            }
        });
        a.c cVarAdUnit = advertisement.adUnit();
        if (cVarAdUnit != null && (loadAdUrls = cVarAdUnit.getLoadAdUrls()) != null) {
            Iterator<T> it = loadAdUrls.iterator();
            while (it.hasNext()) {
                com.vungle.ads.internal.network.h.sendTpat$default(m316handleAdMetaData$lambda4(hVarA), new f.a((String) it.next()).tpatKey(com.vungle.ads.internal.b.LOAD_AD).withLogEntry(this.logEntry).build(), false, 2, null);
            }
        }
        if (!this.adAssets.isEmpty()) {
            this.adAssets.clear();
        }
        this.adAssets.addAll(advertisement.getDownloadableAssets(destinationDir));
        if (this.adAssets.isEmpty()) {
            onAdReady();
        } else {
            downloadAssets();
        }
    }

    public final void loadAd(@NotNull com.vungle.ads.internal.load.a adLoaderCallback) {
        kotlin.jvm.internal.p.e(adLoaderCallback, "adLoaderCallback");
        this.adLoaderCallback = adLoaderCallback;
        this.loadStart = System.currentTimeMillis();
        this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.ads.internal.load.b
            @Override // java.lang.Runnable
            public final void run() {
                BaseAdLoader.m317loadAd$lambda0(this.f20177a);
            }
        });
    }

    public final void onAdLoadFailed(@NotNull VungleError error) {
        com.vungle.ads.internal.load.a aVar;
        kotlin.jvm.internal.p.e(error, "error");
        if (this.notifySuccess.get() || !this.notifyFailed.compareAndSet(false, true) || (aVar = this.adLoaderCallback) == null) {
            return;
        }
        aVar.onFailure(error);
    }

    public abstract void onAdLoadReady();

    public abstract void requestAd();

    public final void setAdvertisement$vungle_ads_release(@Nullable q7.a aVar) {
        this.advertisement = aVar;
    }

    public final void setLogEntry$vungle_ads_release(@Nullable o oVar) {
        this.logEntry = oVar;
    }
}
