package com.vungle.ads.internal.load;

import C.E;
import N.i;
import a6.C1652a;
import a6.C1653b;
import a6.C1658g;
import android.content.Context;
import android.webkit.URLUtil;
import androidx.work.s;
import b9.C2001h;
import b9.InterfaceC2000g;
import c6.C2069b;
import com.vungle.ads.C;
import com.vungle.ads.C4055m;
import com.vungle.ads.C4056n;
import com.vungle.ads.K;
import com.vungle.ads.N;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.e0;
import com.vungle.ads.f0;
import com.vungle.ads.internal.downloader.a;
import com.vungle.ads.internal.downloader.c;
import com.vungle.ads.internal.load.e;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.k;
import com.vungle.ads.internal.util.l;
import com.vungle.ads.internal.util.r;
import com.vungle.ads.k0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.m;
import m9.C5338c;
import p9.InterfaceC5480a;
import y9.n;

/* compiled from: BaseAdLoader.kt */
/* loaded from: classes2.dex */
public abstract class c {
    public static final a Companion = new a(null);
    private static final String DOWNLOADED_FILE_NOT_FOUND = "Downloaded file not found!";
    private static final String TAG = "BaseAdLoader";
    private final List<C1652a> adAssets;
    private com.vungle.ads.internal.load.a adLoaderCallback;
    private final com.vungle.ads.internal.load.b adRequest;
    private C1653b advertisement;
    private f0 assetDownloadDurationMetric;
    private final Context context;
    private final AtomicLong downloadCount;
    private final AtomicLong downloadRequiredCount;
    private final com.vungle.ads.internal.downloader.d downloader;
    private AtomicBoolean fullyDownloaded;
    private e0 mainVideoSizeMetric;
    private AtomicBoolean notifyFailed;
    private AtomicBoolean notifySuccess;
    private final C2069b omInjector;
    private final l pathProvider;
    private AtomicBoolean requiredAssetDownloaded;
    private final com.vungle.ads.internal.executor.a sdkExecutors;
    private e0 templateHtmlSizeMetric;
    private e0 templateSizeMetric;
    private final com.vungle.ads.internal.network.g vungleApiClient;

    /* compiled from: BaseAdLoader.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: BaseAdLoader.kt */
    /* renamed from: com.vungle.ads.internal.load.c$c, reason: collision with other inner class name */
    public static final class C0383c implements com.vungle.ads.internal.downloader.a {
        public C0383c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onError$lambda-0, reason: not valid java name */
        public static final void m74onError$lambda0(c this$0, com.vungle.ads.internal.downloader.c downloadRequest) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            kotlin.jvm.internal.l.f(downloadRequest, "$downloadRequest");
            this$0.fullyDownloaded.set(false);
            if (downloadRequest.getAsset().isRequired()) {
                this$0.requiredAssetDownloaded.set(false);
            }
            if (downloadRequest.getAsset().isRequired() && this$0.downloadRequiredCount.decrementAndGet() <= 0) {
                this$0.onAdLoadFailed(new C4056n());
                this$0.cancel();
            } else if (this$0.downloadCount.decrementAndGet() <= 0) {
                this$0.onAdLoadFailed(new C4056n());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onSuccess$lambda-1, reason: not valid java name */
        public static final void m75onSuccess$lambda1(File file, C0383c this$0, com.vungle.ads.internal.downloader.c downloadRequest, c this$1) throws Throwable {
            kotlin.jvm.internal.l.f(file, "$file");
            kotlin.jvm.internal.l.f(this$0, "this$0");
            kotlin.jvm.internal.l.f(downloadRequest, "$downloadRequest");
            kotlin.jvm.internal.l.f(this$1, "this$1");
            if (!file.exists()) {
                this$0.onError(new a.C0372a(-1, new IOException(c.DOWNLOADED_FILE_NOT_FOUND), a.C0372a.b.Companion.getFILE_NOT_FOUND_ERROR()), downloadRequest);
                return;
            }
            C1652a asset = downloadRequest.getAsset();
            asset.setFileSize(file.length());
            asset.setStatus(C1652a.b.DOWNLOAD_SUCCESS);
            if (downloadRequest.isTemplate()) {
                downloadRequest.stopRecord();
                e0 e0Var = downloadRequest.isHtmlTemplate() ? this$1.templateHtmlSizeMetric : this$1.templateSizeMetric;
                e0Var.setValue(Long.valueOf(file.length()));
                C4055m c4055m = C4055m.INSTANCE;
                String referenceId = this$1.getAdRequest().getPlacement().getReferenceId();
                C1653b advertisement$vungle_ads_release = this$1.getAdvertisement$vungle_ads_release();
                String creativeId = advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getCreativeId() : null;
                C1653b advertisement$vungle_ads_release2 = this$1.getAdvertisement$vungle_ads_release();
                c4055m.logMetric$vungle_ads_release(e0Var, referenceId, creativeId, advertisement$vungle_ads_release2 != null ? advertisement$vungle_ads_release2.eventId() : null, asset.getServerPath());
            } else if (downloadRequest.isMainVideo()) {
                this$1.mainVideoSizeMetric.setValue(Long.valueOf(file.length()));
                C4055m c4055m2 = C4055m.INSTANCE;
                e0 e0Var2 = this$1.mainVideoSizeMetric;
                String referenceId2 = this$1.getAdRequest().getPlacement().getReferenceId();
                C1653b advertisement$vungle_ads_release3 = this$1.getAdvertisement$vungle_ads_release();
                String creativeId2 = advertisement$vungle_ads_release3 != null ? advertisement$vungle_ads_release3.getCreativeId() : null;
                C1653b advertisement$vungle_ads_release4 = this$1.getAdvertisement$vungle_ads_release();
                c4055m2.logMetric$vungle_ads_release(e0Var2, referenceId2, creativeId2, advertisement$vungle_ads_release4 != null ? advertisement$vungle_ads_release4.eventId() : null, asset.getServerPath());
            }
            C1653b advertisement$vungle_ads_release5 = this$1.getAdvertisement$vungle_ads_release();
            if (advertisement$vungle_ads_release5 != null) {
                advertisement$vungle_ads_release5.updateAdAssetPath(asset);
            }
            if (downloadRequest.isTemplate() && !this$1.processVmTemplate(asset, this$1.getAdvertisement$vungle_ads_release())) {
                this$1.fullyDownloaded.set(false);
                if (asset.isRequired()) {
                    this$1.requiredAssetDownloaded.set(false);
                }
            }
            if (asset.isRequired() && this$1.downloadRequiredCount.decrementAndGet() <= 0) {
                if (!this$1.requiredAssetDownloaded.get()) {
                    this$1.onAdLoadFailed(new C4056n());
                    this$1.cancel();
                    return;
                }
                this$1.onAdReady();
            }
            if (this$1.downloadCount.decrementAndGet() <= 0) {
                if (!this$1.fullyDownloaded.get()) {
                    this$1.onAdLoadFailed(new C4056n());
                    return;
                }
                com.vungle.ads.internal.load.b adRequest = this$1.getAdRequest();
                C1653b advertisement$vungle_ads_release6 = this$1.getAdvertisement$vungle_ads_release();
                this$1.onDownloadCompleted(adRequest, advertisement$vungle_ads_release6 != null ? advertisement$vungle_ads_release6.eventId() : null);
            }
        }

        @Override // com.vungle.ads.internal.downloader.a
        public void onError(a.C0372a c0372a, com.vungle.ads.internal.downloader.c downloadRequest) {
            kotlin.jvm.internal.l.f(downloadRequest, "downloadRequest");
            k.a aVar = k.Companion;
            StringBuilder sb = new StringBuilder("onError called: reason ");
            sb.append(c0372a != null ? Integer.valueOf(c0372a.getReason()) : null);
            sb.append("; cause ");
            sb.append(c0372a != null ? c0372a.getCause() : null);
            aVar.e(c.TAG, sb.toString());
            c.this.getSdkExecutors().getBackgroundExecutor().execute(new E(16, c.this, downloadRequest));
        }

        @Override // com.vungle.ads.internal.downloader.a
        public void onSuccess(File file, com.vungle.ads.internal.downloader.c downloadRequest) {
            kotlin.jvm.internal.l.f(file, "file");
            kotlin.jvm.internal.l.f(downloadRequest, "downloadRequest");
            c.this.getSdkExecutors().getBackgroundExecutor().execute(new i(file, this, downloadRequest, c.this, 4));
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class d extends m implements InterfaceC5480a<com.vungle.ads.internal.signals.b> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.b, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.signals.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.b.class);
        }
    }

    /* compiled from: BaseAdLoader.kt */
    public static final class e implements e.a {
        final /* synthetic */ C1653b $advertisement;

        public e(C1653b c1653b) {
            this.$advertisement = c1653b;
        }

        @Override // com.vungle.ads.internal.load.e.a
        public void onDownloadResult(int i) {
            if (i == 10 || i == 13) {
                if (i == 10) {
                    C4055m.INSTANCE.logMetric$vungle_ads_release(Sdk$SDKMetric.b.MRAID_DOWNLOAD_JS_RETRY_SUCCESS, (58 & 2) != 0 ? 0L : 0L, (58 & 4) != 0 ? null : c.this.getAdRequest().getPlacement().getReferenceId(), (58 & 8) != 0 ? null : null, (58 & 16) != 0 ? null : null, (58 & 32) != 0 ? null : null);
                }
                c.this.downloadAssets(this.$advertisement);
            } else {
                com.vungle.ads.internal.load.a aVar = c.this.adLoaderCallback;
                if (aVar != null) {
                    aVar.onFailure(new K(null, 1, 0 == true ? 1 : 0));
                }
            }
        }
    }

    /* compiled from: BaseAdLoader.kt */
    public static final class f implements r.a {
        final /* synthetic */ List<String> $existingPaths;

        public f(List<String> list) {
            this.$existingPaths = list;
        }

        @Override // com.vungle.ads.internal.util.r.a
        public boolean matches(String str) {
            if (str == null || str.length() == 0) {
                return true;
            }
            File file = new File(str);
            Iterator<String> it = this.$existingPaths.iterator();
            while (it.hasNext()) {
                File file2 = new File(it.next());
                if (!file2.equals(file)) {
                    String path = file.getPath();
                    kotlin.jvm.internal.l.e(path, "toExtract.path");
                    if (n.a0(path, file2.getPath() + File.separator, false)) {
                    }
                }
                return false;
            }
            return true;
        }
    }

    public c(Context context, com.vungle.ads.internal.network.g vungleApiClient, com.vungle.ads.internal.executor.a sdkExecutors, C2069b omInjector, com.vungle.ads.internal.downloader.d downloader, l pathProvider, com.vungle.ads.internal.load.b adRequest) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(vungleApiClient, "vungleApiClient");
        kotlin.jvm.internal.l.f(sdkExecutors, "sdkExecutors");
        kotlin.jvm.internal.l.f(omInjector, "omInjector");
        kotlin.jvm.internal.l.f(downloader, "downloader");
        kotlin.jvm.internal.l.f(pathProvider, "pathProvider");
        kotlin.jvm.internal.l.f(adRequest, "adRequest");
        this.context = context;
        this.vungleApiClient = vungleApiClient;
        this.sdkExecutors = sdkExecutors;
        this.omInjector = omInjector;
        this.downloader = downloader;
        this.pathProvider = pathProvider;
        this.adRequest = adRequest;
        this.downloadCount = new AtomicLong(0L);
        this.downloadRequiredCount = new AtomicLong(0L);
        this.notifySuccess = new AtomicBoolean(false);
        this.notifyFailed = new AtomicBoolean(false);
        this.adAssets = new ArrayList();
        this.fullyDownloaded = new AtomicBoolean(true);
        this.requiredAssetDownloaded = new AtomicBoolean(true);
        this.mainVideoSizeMetric = new e0(Sdk$SDKMetric.b.ASSET_FILE_SIZE);
        this.templateSizeMetric = new e0(Sdk$SDKMetric.b.TEMPLATE_ZIP_SIZE);
        this.templateHtmlSizeMetric = new e0(Sdk$SDKMetric.b.TEMPLATE_HTML_SIZE);
        this.assetDownloadDurationMetric = new f0(Sdk$SDKMetric.b.ASSET_DOWNLOAD_DURATION_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downloadAssets(C1653b c1653b) {
        this.assetDownloadDurationMetric.markStart();
        this.downloadCount.set(this.adAssets.size());
        AtomicLong atomicLong = this.downloadRequiredCount;
        List<C1652a> list = this.adAssets;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C1652a) obj).isRequired()) {
                arrayList.add(obj);
            }
        }
        atomicLong.set(arrayList.size());
        for (C1652a c1652a : this.adAssets) {
            com.vungle.ads.internal.downloader.c cVar = new com.vungle.ads.internal.downloader.c(getAssetPriority(c1652a), c1652a, this.adRequest.getPlacement().getReferenceId(), c1653b.getCreativeId(), c1653b.eventId());
            if (cVar.isTemplate()) {
                cVar.startRecord();
            }
            this.downloader.download(cVar, getAssetDownloadListener());
        }
    }

    private final boolean fileIsValid(File file, C1652a c1652a) {
        return file.exists() && file.length() == c1652a.getFileSize();
    }

    private final com.vungle.ads.internal.downloader.a getAssetDownloadListener() {
        return new C0383c();
    }

    private final c.a getAssetPriority(C1652a c1652a) {
        return c1652a.isRequired() ? c.a.CRITICAL : c.a.HIGHEST;
    }

    private final File getDestinationDir(C1653b c1653b) {
        return this.pathProvider.getDownloadsDirForAd(c1653b.eventId());
    }

    private final b getErrorInfo(C1653b c1653b) {
        Integer errorCode;
        C1653b.c cVarAdUnit = c1653b.adUnit();
        int iIntValue = (cVarAdUnit == null || (errorCode = cVarAdUnit.getErrorCode()) == null) ? 212 : errorCode.intValue();
        C1653b.c cVarAdUnit2 = c1653b.adUnit();
        Integer sleep = cVarAdUnit2 != null ? cVarAdUnit2.getSleep() : null;
        C1653b.c cVarAdUnit3 = c1653b.adUnit();
        String info = cVarAdUnit3 != null ? cVarAdUnit3.getInfo() : null;
        if (iIntValue != 10001 && iIntValue != 10002 && iIntValue != 20001 && iIntValue != 30001 && iIntValue != 30002) {
            return new b(212, "Response error: " + sleep, s.d("Request failed with error: 212, ", info), false, 8, null);
        }
        return new b(iIntValue, "Response error: " + sleep, "Request failed with error: " + iIntValue + ", " + info, false, 8, null);
    }

    /* renamed from: handleAdMetaData$lambda-5, reason: not valid java name */
    private static final com.vungle.ads.internal.signals.b m72handleAdMetaData$lambda5(InterfaceC2000g<com.vungle.ads.internal.signals.b> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    public static /* synthetic */ void handleAdMetaData$vungle_ads_release$default(c cVar, C1653b c1653b, e0 e0Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAdMetaData");
        }
        if ((i & 2) != 0) {
            e0Var = null;
        }
        cVar.handleAdMetaData$vungle_ads_release(c1653b, e0Var);
    }

    private final boolean injectMraidJS(File file) {
        try {
            File file2 = new File(file.getPath(), com.vungle.ads.internal.g.AD_MRAID_JS_FILE_NAME);
            File file3 = new File(this.pathProvider.getJsAssetDir(com.vungle.ads.internal.f.INSTANCE.getMraidJsVersion()), com.vungle.ads.internal.g.MRAID_JS_FILE_NAME);
            if (!file3.exists()) {
                return true;
            }
            C5338c.K(file3, file2, 4);
            return true;
        } catch (Exception e4) {
            k.Companion.e(TAG, "Failed to inject mraid.js: " + e4.getMessage());
            return false;
        }
    }

    private final boolean isUrlValid(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAd$lambda-0, reason: not valid java name */
    public static final void m73loadAd$lambda0(c this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        C4055m.INSTANCE.logMetric$vungle_ads_release(Sdk$SDKMetric.b.LOAD_AD_API, (58 & 2) != 0 ? 0L : 0L, (58 & 4) != 0 ? null : this$0.adRequest.getPlacement().getReferenceId(), (58 & 8) != 0 ? null : null, (58 & 16) != 0 ? null : null, (58 & 32) != 0 ? null : null);
        this$0.requestAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAdReady() {
        C1653b c1653b = this.advertisement;
        if (c1653b == null || this.notifyFailed.get() || !this.notifySuccess.compareAndSet(false, true)) {
            return;
        }
        onAdLoadReady();
        com.vungle.ads.internal.load.a aVar = this.adLoaderCallback;
        if (aVar != null) {
            aVar.onSuccess(c1653b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean processVmTemplate(C1652a c1652a, C1653b c1653b) {
        if (c1653b == null || c1652a.getStatus() != C1652a.b.DOWNLOAD_SUCCESS || c1652a.getLocalPath().length() == 0) {
            return false;
        }
        File file = new File(c1652a.getLocalPath());
        if (!fileIsValid(file, c1652a)) {
            return false;
        }
        File destinationDir = getDestinationDir(c1653b);
        if (destinationDir == null || !destinationDir.isDirectory()) {
            k.Companion.e(TAG, "Unable to access Destination Directory");
            return false;
        }
        if (c1652a.getFileType() == C1652a.EnumC0211a.ZIP && !unzipFile(c1653b, file, destinationDir)) {
            return false;
        }
        if (c1653b.omEnabled()) {
            try {
                this.omInjector.injectJsFiles(destinationDir);
            } catch (Exception e4) {
                k.Companion.e(TAG, "Failed to inject OMSDK: " + e4.getMessage());
                return false;
            }
        }
        boolean zInjectMraidJS = injectMraidJS(destinationDir);
        com.vungle.ads.internal.util.f.printDirectoryTree(destinationDir);
        return zInjectMraidJS;
    }

    private final boolean unzipFile(C1653b c1653b, File file, File file2) {
        ArrayList arrayList = new ArrayList();
        for (C1652a c1652a : this.adAssets) {
            if (c1652a.getFileType() == C1652a.EnumC0211a.ASSET) {
                arrayList.add(c1652a.getLocalPath());
            }
        }
        try {
            r rVar = r.INSTANCE;
            String path = file.getPath();
            String path2 = file2.getPath();
            kotlin.jvm.internal.l.e(path2, "destinationDir.path");
            rVar.unzip(path, path2, new f(arrayList));
            if (new File(file2.getPath(), com.vungle.ads.internal.g.AD_INDEX_FILE_NAME).exists()) {
                com.vungle.ads.internal.util.f.delete(file);
                return true;
            }
            C4055m.INSTANCE.logError$vungle_ads_release(115, "Failed to retrieve indexFileUrl from the Ad.", this.adRequest.getPlacement().getReferenceId(), c1653b.getCreativeId(), c1653b.eventId());
            return false;
        } catch (Exception e4) {
            C4055m.INSTANCE.logError$vungle_ads_release(109, "Unzip failed: " + e4.getMessage(), this.adRequest.getPlacement().getReferenceId(), c1653b.getCreativeId(), c1653b.eventId());
            return false;
        }
    }

    private final b validateAdMetadata(C1653b c1653b) {
        C1653b.c cVarAdUnit = c1653b.adUnit();
        if ((cVarAdUnit != null ? cVarAdUnit.getSleep() : null) != null) {
            return getErrorInfo(c1653b);
        }
        String referenceId = this.adRequest.getPlacement().getReferenceId();
        C1653b c1653b2 = this.advertisement;
        if (!kotlin.jvm.internal.l.b(referenceId, c1653b2 != null ? c1653b2.placementId() : null)) {
            return new b(215, "Requests and responses don't match the placement Id.", null, false, 12, null);
        }
        C1653b.c cVarAdUnit2 = c1653b.adUnit();
        C1653b.g templateSettings = cVarAdUnit2 != null ? cVarAdUnit2.getTemplateSettings() : null;
        if (templateSettings == null) {
            return new b(113, "Missing template settings", null, false, 12, null);
        }
        Map<String, C1653b.d> cacheableReplacements = templateSettings.getCacheableReplacements();
        if (!c1653b.isNativeTemplateType()) {
            C1653b.c cVarAdUnit3 = c1653b.adUnit();
            String templateURL = cVarAdUnit3 != null ? cVarAdUnit3.getTemplateURL() : null;
            C1653b.c cVarAdUnit4 = c1653b.adUnit();
            String vmURL = cVarAdUnit4 != null ? cVarAdUnit4.getVmURL() : null;
            if ((templateURL == null || templateURL.length() == 0) && (vmURL == null || vmURL.length() == 0)) {
                return new b(105, "Failed to prepare vmURL or templateURL for downloading.", null, false, 12, null);
            }
            if (templateURL != null && templateURL.length() != 0 && !isUrlValid(templateURL)) {
                return new b(112, "Failed to load template asset.", null, false, 12, null);
            }
            if (vmURL != null && vmURL.length() != 0 && !isUrlValid(vmURL)) {
                return new b(112, "Failed to load vm url asset.", null, false, 12, null);
            }
        } else if (cacheableReplacements != null) {
            C1653b.d dVar = cacheableReplacements.get(N.TOKEN_MAIN_IMAGE);
            if ((dVar != null ? dVar.getUrl() : null) == null) {
                return new b(600, "Unable to load main image.", null, false, 12, null);
            }
            C1653b.d dVar2 = cacheableReplacements.get(N.TOKEN_VUNGLE_PRIVACY_ICON_URL);
            if ((dVar2 != null ? dVar2.getUrl() : null) == null) {
                return new b(600, "Unable to load privacy image.", null, false, 12, null);
            }
        }
        if (c1653b.hasExpired()) {
            return new b(304, "The ad markup has expired for playback.", null, false, 12, null);
        }
        String strEventId = c1653b.eventId();
        if (strEventId == null || strEventId.length() == 0) {
            return new b(200, "Event id is invalid.", null, false, 12, null);
        }
        if (cacheableReplacements != null) {
            Iterator<Map.Entry<String, C1653b.d>> it = cacheableReplacements.entrySet().iterator();
            while (it.hasNext()) {
                String url = it.next().getValue().getUrl();
                if (url == null || url.length() == 0) {
                    return new b(111, s.d("Invalid asset URL ", url), null, false, 12, null);
                }
                if (!isUrlValid(url)) {
                    return new b(112, s.d("Invalid asset URL ", url), null, false, 12, null);
                }
            }
        }
        return null;
    }

    public final void cancel() {
        this.downloader.cancelAll();
    }

    public final com.vungle.ads.internal.load.b getAdRequest() {
        return this.adRequest;
    }

    public final C1653b getAdvertisement$vungle_ads_release() {
        return this.advertisement;
    }

    public final Context getContext() {
        return this.context;
    }

    public final l getPathProvider() {
        return this.pathProvider;
    }

    public final com.vungle.ads.internal.executor.a getSdkExecutors() {
        return this.sdkExecutors;
    }

    public final com.vungle.ads.internal.network.g getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final void handleAdMetaData$vungle_ads_release(C1653b advertisement, e0 e0Var) {
        List<String> loadAdUrls;
        kotlin.jvm.internal.l.f(advertisement, "advertisement");
        this.advertisement = advertisement;
        C1658g c1658gConfig = advertisement.config();
        if (c1658gConfig != null) {
            com.vungle.ads.internal.f.INSTANCE.initWithConfig$vungle_ads_release(this.context, c1658gConfig, false, e0Var);
        }
        b bVarValidateAdMetadata = validateAdMetadata(advertisement);
        if (bVarValidateAdMetadata != null) {
            C4055m.INSTANCE.logError$vungle_ads_release(bVarValidateAdMetadata.getReason(), bVarValidateAdMetadata.getDescription(), this.adRequest.getPlacement().getReferenceId(), advertisement.getCreativeId(), advertisement.eventId());
            onAdLoadFailed(new C(bVarValidateAdMetadata.getReason(), bVarValidateAdMetadata.getDescriptionExternal()));
            return;
        }
        File destinationDir = getDestinationDir(advertisement);
        if (destinationDir == null || !destinationDir.isDirectory() || !destinationDir.exists()) {
            onAdLoadFailed(new C4056n());
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        InterfaceC2000g interfaceC2000gA = C2001h.a(b9.i.SYNCHRONIZED, new d(this.context));
        C1653b.c cVarAdUnit = advertisement.adUnit();
        if (cVarAdUnit != null && (loadAdUrls = cVarAdUnit.getLoadAdUrls()) != null) {
            com.vungle.ads.internal.network.e eVar = new com.vungle.ads.internal.network.e(this.vungleApiClient, advertisement.placementId(), advertisement.getCreativeId(), advertisement.eventId(), this.sdkExecutors.getIoExecutor(), this.pathProvider, m72handleAdMetaData$lambda5(interfaceC2000gA));
            Iterator<T> it = loadAdUrls.iterator();
            while (it.hasNext()) {
                eVar.sendTpat((String) it.next(), this.sdkExecutors.getJobExecutor());
            }
        }
        if (!this.adAssets.isEmpty()) {
            this.adAssets.clear();
        }
        this.adAssets.addAll(advertisement.getDownloadableAssets(destinationDir));
        if (this.adAssets.isEmpty()) {
            onAdLoadFailed(new C4056n());
        } else {
            com.vungle.ads.internal.load.e.INSTANCE.downloadJs(this.pathProvider, this.downloader, this.sdkExecutors.getBackgroundExecutor(), new e(advertisement));
        }
    }

    public final void loadAd(com.vungle.ads.internal.load.a adLoaderCallback) {
        kotlin.jvm.internal.l.f(adLoaderCallback, "adLoaderCallback");
        this.adLoaderCallback = adLoaderCallback;
        this.sdkExecutors.getBackgroundExecutor().execute(new B.b(this, 29));
    }

    public final void onAdLoadFailed(k0 error) {
        com.vungle.ads.internal.load.a aVar;
        kotlin.jvm.internal.l.f(error, "error");
        if (this.notifySuccess.get() || !this.notifyFailed.compareAndSet(false, true) || (aVar = this.adLoaderCallback) == null) {
            return;
        }
        aVar.onFailure(error);
    }

    public abstract void onAdLoadReady();

    public void onDownloadCompleted(com.vungle.ads.internal.load.b request, String str) throws Throwable {
        kotlin.jvm.internal.l.f(request, "request");
        k.Companion.d(TAG, "download completed " + request);
        C1653b c1653b = this.advertisement;
        if (c1653b != null) {
            c1653b.setAssetFullyDownloaded();
        }
        onAdReady();
        this.assetDownloadDurationMetric.markEnd();
        C1653b c1653b2 = this.advertisement;
        String strPlacementId = c1653b2 != null ? c1653b2.placementId() : null;
        C1653b c1653b3 = this.advertisement;
        String creativeId = c1653b3 != null ? c1653b3.getCreativeId() : null;
        C1653b c1653b4 = this.advertisement;
        C4055m.logMetric$vungle_ads_release$default(C4055m.INSTANCE, this.assetDownloadDurationMetric, strPlacementId, creativeId, c1653b4 != null ? c1653b4.eventId() : null, (String) null, 16, (Object) null);
    }

    public abstract void requestAd();

    public final void setAdvertisement$vungle_ads_release(C1653b c1653b) {
        this.advertisement = c1653b;
    }

    /* compiled from: BaseAdLoader.kt */
    public static final class b {
        private final String description;
        private final String descriptionExternal;
        private final boolean errorIsTerminal;
        private final int reason;

        public b(int i, String description, String descriptionExternal, boolean z10) {
            kotlin.jvm.internal.l.f(description, "description");
            kotlin.jvm.internal.l.f(descriptionExternal, "descriptionExternal");
            this.reason = i;
            this.description = description;
            this.descriptionExternal = descriptionExternal;
            this.errorIsTerminal = z10;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getDescriptionExternal() {
            return this.descriptionExternal;
        }

        public final boolean getErrorIsTerminal() {
            return this.errorIsTerminal;
        }

        public final int getReason() {
            return this.reason;
        }

        public /* synthetic */ b(int i, String str, String str2, boolean z10, int i10, kotlin.jvm.internal.g gVar) {
            this(i, str, (i10 & 4) != 0 ? str : str2, (i10 & 8) != 0 ? false : z10);
        }
    }
}
