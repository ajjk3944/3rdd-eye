package com.vungle.ads.internal.presenter;

import a6.C1653b;
import a6.C1656e;
import a6.C1657f;
import a6.C1661j;
import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import b9.C1992A;
import b9.C2001h;
import b9.InterfaceC2000g;
import c6.C2070c;
import com.vungle.ads.C;
import com.vungle.ads.C4045c;
import com.vungle.ads.C4050h;
import com.vungle.ads.C4055m;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.e0;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.k;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.k0;
import e6.C4321c;
import g6.C4393a;
import g6.InterfaceC4395c;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;

/* compiled from: MRAIDPresenter.kt */
/* loaded from: classes2.dex */
public final class g implements InterfaceC4395c.a, InterfaceC4395c.b {
    private static final String ACTION = "action";
    public static final String ACTION_WITH_VALUE = "actionWithValue";
    public static final String CLOSE = "close";
    public static final String CONSENT_ACTION = "consentAction";
    public static final String CREATIVE_HEARTBEAT = "creativeHeartbeat";
    public static final a Companion = new a(null);
    public static final String ERROR = "error";
    public static final String GET_AVAILABLE_DISK_SPACE = "getAvailableDiskSpace";
    private static final double HEARTBEAT_INTERVAL = 6.0d;
    public static final String OPEN = "open";
    private static final String OPEN_NON_MRAID = "openNonMraid";
    public static final String OPEN_PRIVACY = "openPrivacy";
    public static final String SET_ORIENTATION_PROPERTIES = "setOrientationProperties";
    public static final String SUCCESSFUL_VIEW = "successfulView";
    private static final String TAG = "MRAIDPresenter";
    public static final String TPAT = "tpat";
    public static final String UPDATE_SIGNALS = "updateSignals";
    private static final String USE_CUSTOM_CLOSE = "useCustomClose";
    private static final String USE_CUSTOM_PRIVACY = "useCustomPrivacy";
    public static final String VIDEO_LENGTH = "videoLength";
    public static final String VIDEO_VIEWED = "videoViewed";
    private Long adStartTime;
    private boolean adViewed;
    private final C4393a adWidget;
    private final C1653b advertisement;
    private boolean backEnabled;
    private final C1656e bidPayload;
    private com.vungle.ads.internal.presenter.a bus;
    private final InterfaceC2000g clickCoordinateTracker$delegate;
    private Executor executor;
    private final InterfaceC2000g executors$delegate;
    private boolean heartbeatEnabled;
    private final AtomicBoolean isDestroying;
    private final C2070c omTracker;
    private final InterfaceC2000g pathProvider$delegate;
    private final C1661j placement;
    private final com.vungle.ads.internal.platform.b platform;
    private com.vungle.ads.internal.presenter.j presenterDelegate;
    private final InterfaceC2000g scheduler$delegate;
    private final AtomicBoolean sendReportIncentivized;
    private final InterfaceC2000g signalManager$delegate;
    private final InterfaceC2000g suspendableTimer$delegate;
    private String userId;
    private final InterfaceC2000g vungleApiClient$delegate;
    private final com.vungle.ads.internal.ui.e vungleWebClient;

    /* compiled from: MRAIDPresenter.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }

        public static /* synthetic */ void getACTION_WITH_VALUE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCLOSE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCONSENT_ACTION$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCREATIVE_HEARTBEAT$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getERROR$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getGET_AVAILABLE_DISK_SPACE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getOPEN$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getOPEN_PRIVACY$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getSUCCESSFUL_VIEW$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getTPAT$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getUPDATE_SIGNALS$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getVIDEO_LENGTH$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getVIDEO_VIEWED$vungle_ads_release$annotations() {
        }
    }

    /* compiled from: MRAIDPresenter.kt */
    public static final class b extends m implements InterfaceC5480a<com.vungle.ads.internal.e> {
        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.e invoke() {
            Context context = g.this.adWidget.getContext();
            l.e(context, "adWidget.context");
            return new com.vungle.ads.internal.e(context, g.this.advertisement, g.this.executor);
        }
    }

    /* compiled from: MRAIDPresenter.kt */
    public static final class c implements com.vungle.ads.internal.ui.b {
        public c() {
        }

        @Override // com.vungle.ads.internal.ui.b
        public void onDeeplinkClick(boolean z10) {
            List tpatUrls$default = C1653b.getTpatUrls$default(g.this.advertisement, com.vungle.ads.internal.g.DEEPLINK_CLICK, String.valueOf(z10), null, 4, null);
            com.vungle.ads.internal.network.e eVar = new com.vungle.ads.internal.network.e(g.this.getVungleApiClient$vungle_ads_release(), g.this.placement.getReferenceId(), g.this.advertisement.getCreativeId(), g.this.advertisement.eventId(), g.this.getExecutors().getIoExecutor(), g.this.getPathProvider(), g.this.getSignalManager());
            if (tpatUrls$default != null) {
                g gVar = g.this;
                Iterator it = tpatUrls$default.iterator();
                while (it.hasNext()) {
                    eVar.sendTpat((String) it.next(), gVar.executor);
                }
            }
        }
    }

    /* compiled from: MRAIDPresenter.kt */
    public static final class d implements com.vungle.ads.internal.network.b<Void> {
        @Override // com.vungle.ads.internal.network.b
        public void onFailure(com.vungle.ads.internal.network.a<Void> aVar, Throwable th) {
            k.Companion.d(g.TAG, "send RI Failure");
        }

        @Override // com.vungle.ads.internal.network.b
        public void onResponse(com.vungle.ads.internal.network.a<Void> aVar, com.vungle.ads.internal.network.d<Void> dVar) {
            k.Companion.d(g.TAG, "send RI success");
        }
    }

    /* compiled from: MRAIDPresenter.kt */
    public static final class e extends m implements InterfaceC5480a<com.vungle.ads.internal.util.g> {
        public static final e INSTANCE = new e();

        public e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.util.g invoke() {
            return new com.vungle.ads.internal.util.g();
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class f extends m implements InterfaceC5480a<com.vungle.ads.internal.network.g> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.g, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.network.g invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.g.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    /* renamed from: com.vungle.ads.internal.presenter.g$g, reason: collision with other inner class name */
    public static final class C0388g extends m implements InterfaceC5480a<com.vungle.ads.internal.executor.a> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0388g(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.executor.a invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class h extends m implements InterfaceC5480a<com.vungle.ads.internal.util.l> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.l, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.util.l invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.util.l.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class i extends m implements InterfaceC5480a<com.vungle.ads.internal.signals.b> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.b, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.signals.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.b.class);
        }
    }

    /* compiled from: MRAIDPresenter.kt */
    public static final class j extends m implements InterfaceC5480a<p> {

        /* compiled from: MRAIDPresenter.kt */
        public static final class a extends m implements InterfaceC5480a<C1992A> {
            final /* synthetic */ g this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar) {
                super(0);
                this.this$0 = gVar;
            }

            @Override // p9.InterfaceC5480a
            public /* bridge */ /* synthetic */ C1992A invoke() {
                invoke2();
                return C1992A.f18074a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C4055m.INSTANCE.logError$vungle_ads_release(318, "Error ad template missing Heartbeat", this.this$0.placement.getReferenceId(), this.this$0.advertisement.getCreativeId(), this.this$0.advertisement.eventId());
                this.this$0.reportErrorAndCloseAd(new C(k0.HEARTBEAT_ERROR, null, 2, 0 == true ? 1 : 0));
            }
        }

        public j() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p9.InterfaceC5480a
        public final p invoke() {
            return new p(g.HEARTBEAT_INTERVAL, true, null, new a(g.this), 4, null);
        }
    }

    public g(C4393a adWidget, C1653b advertisement, C1661j placement, com.vungle.ads.internal.ui.e vungleWebClient, Executor executor, C2070c omTracker, C1656e c1656e, com.vungle.ads.internal.platform.b platform) {
        l.f(adWidget, "adWidget");
        l.f(advertisement, "advertisement");
        l.f(placement, "placement");
        l.f(vungleWebClient, "vungleWebClient");
        l.f(executor, "executor");
        l.f(omTracker, "omTracker");
        l.f(platform, "platform");
        this.adWidget = adWidget;
        this.advertisement = advertisement;
        this.placement = placement;
        this.vungleWebClient = vungleWebClient;
        this.executor = executor;
        this.omTracker = omTracker;
        this.bidPayload = c1656e;
        this.platform = platform;
        this.isDestroying = new AtomicBoolean(false);
        this.sendReportIncentivized = new AtomicBoolean(false);
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        Context context = adWidget.getContext();
        l.e(context, "adWidget.context");
        b9.i iVar = b9.i.SYNCHRONIZED;
        this.vungleApiClient$delegate = C2001h.a(iVar, new f(context));
        Context context2 = adWidget.getContext();
        l.e(context2, "adWidget.context");
        this.executors$delegate = C2001h.a(iVar, new C0388g(context2));
        Context context3 = adWidget.getContext();
        l.e(context3, "adWidget.context");
        this.pathProvider$delegate = C2001h.a(iVar, new h(context3));
        Context context4 = adWidget.getContext();
        l.e(context4, "adWidget.context");
        this.signalManager$delegate = C2001h.a(iVar, new i(context4));
        this.scheduler$delegate = C2001h.b(e.INSTANCE);
        this.suspendableTimer$delegate = C2001h.b(new j());
        this.clickCoordinateTracker$delegate = C2001h.b(new b());
    }

    private final void closeView() {
        Long l5 = this.adStartTime;
        if (l5 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l5.longValue();
            com.vungle.ads.internal.network.e eVar = new com.vungle.ads.internal.network.e(getVungleApiClient$vungle_ads_release(), this.placement.getReferenceId(), this.advertisement.getCreativeId(), this.advertisement.eventId(), getExecutors().getIoExecutor(), getPathProvider(), getSignalManager());
            List<String> tpatUrls = this.advertisement.getTpatUrls(com.vungle.ads.internal.g.AD_CLOSE_TPAT_KEY, String.valueOf(jCurrentTimeMillis), String.valueOf(this.platform.getVolumeLevel()));
            if (tpatUrls != null) {
                eVar.sendTpats(tpatUrls, this.executor);
            }
        }
        this.adWidget.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.executor.a getExecutors() {
        return (com.vungle.ads.internal.executor.a) this.executors$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.util.l getPathProvider() {
        return (com.vungle.ads.internal.util.l) this.pathProvider$delegate.getValue();
    }

    private final com.vungle.ads.internal.util.g getScheduler() {
        return (com.vungle.ads.internal.util.g) this.scheduler$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.signals.b getSignalManager() {
        return (com.vungle.ads.internal.signals.b) this.signalManager$delegate.getValue();
    }

    private final void handleWebViewException(k0 k0Var, boolean z10, String str) {
        k.Companion.e(TAG, "handleWebViewException: " + k0Var.getLocalizedMessage() + ", fatal: " + z10 + ", errorMsg: " + str);
        if (z10) {
            makeBusError(k0Var);
            closeView();
        }
    }

    public static /* synthetic */ void handleWebViewException$default(g gVar, k0 k0Var, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        gVar.handleWebViewException(k0Var, z10, str);
    }

    private final boolean loadMraid(File file) {
        File file2 = new File(file.getPath(), com.vungle.ads.internal.g.AD_INDEX_FILE_NAME);
        if (file2.exists()) {
            this.adWidget.showWebsite(C1653b.FILE_SCHEME + file2.getPath());
            return true;
        }
        C4055m.INSTANCE.logError$vungle_ads_release(310, "Fail to load html " + file2.getPath(), this.placement.getReferenceId(), this.advertisement.getCreativeId(), this.advertisement.eventId());
        return false;
    }

    private final void makeBusError(k0 k0Var) {
        com.vungle.ads.internal.presenter.a aVar = this.bus;
        if (aVar != null) {
            aVar.onError(k0Var, this.placement.getReferenceId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: prepare$lambda-14, reason: not valid java name */
    public static final void m88prepare$lambda14(g this$0) {
        l.f(this$0, "this$0");
        this$0.backEnabled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-10, reason: not valid java name */
    public static final void m89processCommand$lambda10(g this$0, boolean z10, String str, String str2) {
        l.f(this$0, "this$0");
        this$0.handleWebViewException(new C(k0.CREATIVE_ERROR, null, 2, 0 == true ? 1 : 0), z10, B4.g.o(str, " : ", str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-11, reason: not valid java name */
    public static final void m90processCommand$lambda11(g this$0) {
        l.f(this$0, "this$0");
        this$0.getSuspendableTimer$vungle_ads_release().reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-12, reason: not valid java name */
    public static final void m91processCommand$lambda12(g this$0, long j4) {
        l.f(this$0, "this$0");
        this$0.vungleWebClient.notifyDiskAvailableSize(j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-3, reason: not valid java name */
    public static final void m92processCommand$lambda3(g this$0) {
        l.f(this$0, "this$0");
        this$0.closeView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-6, reason: not valid java name */
    public static final void m93processCommand$lambda6(g this$0) {
        l.f(this$0, "this$0");
        this$0.vungleWebClient.notifyPropertiesChange(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-7, reason: not valid java name */
    public static final void m94processCommand$lambda7(g this$0) {
        l.f(this$0, "this$0");
        this$0.adWidget.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-9, reason: not valid java name */
    public static final void m95processCommand$lambda9(g this$0) {
        l.f(this$0, "this$0");
        String referenceId = this$0.placement.getReferenceId();
        List list = null;
        C1657f.b bVar = null;
        com.vungle.ads.internal.network.a<Void> aVarRi = this$0.getVungleApiClient$vungle_ads_release().ri(new C1657f.i(list, bVar, this$0.adStartTime, this$0.advertisement.advAppId(), referenceId, this$0.userId, 3, (kotlin.jvm.internal.g) null));
        if (aVarRi == null) {
            k.Companion.e(TAG, "Invalid ri call.");
        } else {
            aVarRi.enqueue(new d());
        }
    }

    private final void recordPlayAssetMetric() throws Throwable {
        C4055m.logMetric$vungle_ads_release$default(C4055m.INSTANCE, new e0(this.advertisement.getAssetsFullyDownloaded() ? Sdk$SDKMetric.b.LOCAL_ASSETS_USED : Sdk$SDKMetric.b.REMOTE_ASSETS_USED), this.placement.getReferenceId(), this.advertisement.getCreativeId(), this.advertisement.eventId(), (String) null, 16, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportErrorAndCloseAd(k0 k0Var) {
        makeBusError(k0Var);
        closeView();
    }

    public final void detach(int i10) {
        com.vungle.ads.internal.presenter.a aVar;
        k.Companion.d(TAG, "detach()");
        boolean z10 = (i10 & 1) != 0;
        boolean z11 = (i10 & 2) != 0;
        this.vungleWebClient.setWebViewObserver(null);
        this.vungleWebClient.setMraidDelegate(null);
        if (!z10 && z11 && !this.isDestroying.getAndSet(true) && (aVar = this.bus) != null) {
            aVar.onNext("end", null, this.placement.getReferenceId());
        }
        this.adWidget.destroyWebView(this.omTracker.stop());
        if (this.heartbeatEnabled) {
            getSuspendableTimer$vungle_ads_release().cancel();
        }
    }

    public final Long getAdStartTime$vungle_ads_release() {
        return this.adStartTime;
    }

    public final boolean getBackEnabled$vungle_ads_release() {
        return this.backEnabled;
    }

    public final com.vungle.ads.internal.presenter.a getBus() {
        return this.bus;
    }

    public final com.vungle.ads.internal.e getClickCoordinateTracker$vungle_ads_release() {
        return (com.vungle.ads.internal.e) this.clickCoordinateTracker$delegate.getValue();
    }

    public final boolean getHeartbeatEnabled$vungle_ads_release() {
        return this.heartbeatEnabled;
    }

    public final p getSuspendableTimer$vungle_ads_release() {
        return (p) this.suspendableTimer$delegate.getValue();
    }

    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    public final com.vungle.ads.internal.network.g getVungleApiClient$vungle_ads_release() {
        return (com.vungle.ads.internal.network.g) this.vungleApiClient$delegate.getValue();
    }

    public final void handleExit() {
        if (this.backEnabled) {
            this.adWidget.showWebsite("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    public final AtomicBoolean isDestroying$vungle_ads_release() {
        return this.isDestroying;
    }

    @Override // g6.InterfaceC4395c.b
    public void onReceivedError(String errorDesc, boolean z10) {
        l.f(errorDesc, "errorDesc");
        if (z10) {
            reportErrorAndCloseAd(new C(k0.AD_RENDER_NETWORK_ERROR, null, 2, 0 == true ? 1 : 0));
        }
    }

    @Override // g6.InterfaceC4395c.b
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException$default(this, new C(k0.WEBVIEW_RENDER_UNRESPONSIVE, null, 2, 0 == true ? 1 : 0), true, null, 4, null);
    }

    public final void onViewConfigurationChanged() {
        this.vungleWebClient.notifyPropertiesChange(true);
    }

    public final void onViewTouched(MotionEvent motionEvent) {
        if (motionEvent != null) {
            getClickCoordinateTracker$vungle_ads_release().trackCoordinate(motionEvent);
        }
    }

    @Override // g6.InterfaceC4395c.b
    public boolean onWebRenderingProcessGone(WebView webView, Boolean bool) {
        handleWebViewException$default(this, new C(k0.WEB_CRASH, null, 2, 0 == true ? 1 : 0), true, null, 4, null);
        return true;
    }

    public final void prepare() {
        String alertTitleText;
        String alertBodyText;
        String alertContinueButtonText;
        String alertCloseButtonText;
        int settings;
        this.isDestroying.set(false);
        this.adWidget.linkWebView(this.vungleWebClient);
        C4045c adConfig = this.advertisement.getAdConfig();
        if (adConfig != null && (settings = adConfig.getSettings()) > 0) {
            this.backEnabled = (settings & 2) == 2;
        }
        this.heartbeatEnabled = this.advertisement.heartbeatEnabled();
        C4045c adConfig2 = this.advertisement.getAdConfig();
        Integer numValueOf = adConfig2 != null ? Integer.valueOf(adConfig2.getAdOrientation()) : null;
        this.adWidget.setOrientation((numValueOf != null && numValueOf.intValue() == 0) ? 7 : (numValueOf != null && numValueOf.intValue() == 1) ? 6 : 4);
        this.omTracker.start();
        this.vungleWebClient.setMraidDelegate(this);
        this.vungleWebClient.setErrorHandler(this);
        File assetDirectory = this.advertisement.getAssetDirectory();
        if (assetDirectory == null || !assetDirectory.exists()) {
            reportErrorAndCloseAd(new C4050h());
            return;
        }
        if (!loadMraid(assetDirectory)) {
            reportErrorAndCloseAd(new C4050h());
            return;
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
        com.vungle.ads.internal.presenter.j jVar = this.presenterDelegate;
        this.userId = jVar != null ? jVar.getUserId() : null;
        com.vungle.ads.internal.presenter.j jVar2 = this.presenterDelegate;
        if (jVar2 == null || (alertTitleText = jVar2.getAlertTitleText()) == null) {
            alertTitleText = "";
        }
        com.vungle.ads.internal.presenter.j jVar3 = this.presenterDelegate;
        if (jVar3 == null || (alertBodyText = jVar3.getAlertBodyText()) == null) {
            alertBodyText = "";
        }
        com.vungle.ads.internal.presenter.j jVar4 = this.presenterDelegate;
        if (jVar4 == null || (alertContinueButtonText = jVar4.getAlertContinueButtonText()) == null) {
            alertContinueButtonText = "";
        }
        com.vungle.ads.internal.presenter.j jVar5 = this.presenterDelegate;
        if (jVar5 == null || (alertCloseButtonText = jVar5.getAlertCloseButtonText()) == null) {
            alertCloseButtonText = "";
        }
        this.advertisement.setIncentivizedText(alertTitleText, alertBodyText, alertContinueButtonText, alertCloseButtonText);
        com.vungle.ads.internal.f fVar = com.vungle.ads.internal.f.INSTANCE;
        boolean z10 = fVar.getGDPRIsCountryDataProtected() && "unknown".equals(C4321c.INSTANCE.getConsentStatus());
        this.vungleWebClient.setConsentStatus(z10, fVar.getGDPRConsentTitle(), fVar.getGDPRConsentMessage(), fVar.getGDPRButtonAccept(), fVar.getGDPRButtonDeny());
        if (z10) {
            C4321c.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", "");
        }
        int showCloseDelay = this.advertisement.getShowCloseDelay(Boolean.valueOf(this.placement.isRewardedVideo()));
        if (showCloseDelay > 0) {
            getScheduler().schedule(new com.vungle.ads.internal.presenter.e(this, 1), showCloseDelay);
        } else {
            this.backEnabled = true;
        }
        com.vungle.ads.internal.presenter.a aVar = this.bus;
        if (aVar != null) {
            aVar.onNext("start", null, this.placement.getReferenceId());
        }
        if (this.heartbeatEnabled) {
            getSuspendableTimer$vungle_ads_release().start();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x024e, code lost:
    
        com.vungle.ads.internal.util.k.Companion.e(com.vungle.ads.internal.presenter.g.TAG, "CTA destination URL is not configured properly");
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0255, code lost:
    
        r1 = r20.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0257, code lost:
    
        if (r1 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0259, code lost:
    
        r1.onNext(com.vungle.ads.internal.presenter.g.OPEN, "adClick", r20.placement.getReferenceId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r21.equals(com.vungle.ads.internal.presenter.g.USE_CUSTOM_CLOSE) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03bc, code lost:
    
        if (r21.equals(com.vungle.ads.internal.presenter.g.ACTION) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f4, code lost:
    
        if (r21.equals(com.vungle.ads.internal.presenter.g.OPEN) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01fe, code lost:
    
        if (r21.equals(com.vungle.ads.internal.presenter.g.USE_CUSTOM_PRIVACY) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0208, code lost:
    
        if (r21.equals(com.vungle.ads.internal.presenter.g.OPEN_NON_MRAID) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x020c, code lost:
    
        r1 = r20.advertisement.adUnit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0212, code lost:
    
        if (r1 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0214, code lost:
    
        r10 = r1.getDeeplinkUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0218, code lost:
    
        r1 = com.vungle.ads.internal.util.j.INSTANCE.getContentStringValue(r22, com.google.android.gms.common.internal.ImagesContract.URL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x021e, code lost:
    
        if (r10 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0224, code lost:
    
        if (r10.length() != 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0226, code lost:
    
        if (r1 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x022c, code lost:
    
        if (r1.length() != 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x022f, code lost:
    
        r2 = r20.adWidget.getContext();
        kotlin.jvm.internal.l.e(r2, "adWidget.context");
        com.vungle.ads.internal.util.e.launch(r10, r1, r2, new com.vungle.ads.internal.ui.c(r20.bus, r20.placement.getReferenceId()), new com.vungle.ads.internal.presenter.g.c(r20));
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0351  */
    @Override // g6.InterfaceC4395c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean processCommand(java.lang.String r21, R9.z r22) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.presenter.g.processCommand(java.lang.String, R9.z):boolean");
    }

    public final void setAdStartTime$vungle_ads_release(Long l5) {
        this.adStartTime = l5;
    }

    public final void setAdVisibility(boolean z10) {
        this.vungleWebClient.setAdVisibility(z10);
    }

    public final void setBackEnabled$vungle_ads_release(boolean z10) {
        this.backEnabled = z10;
    }

    public final void setBus(com.vungle.ads.internal.presenter.a aVar) {
        this.bus = aVar;
    }

    public final void setEventListener(com.vungle.ads.internal.presenter.a aVar) {
        this.bus = aVar;
    }

    public final void setHeartbeatEnabled$vungle_ads_release(boolean z10) {
        this.heartbeatEnabled = z10;
    }

    public final void setPresenterDelegate$vungle_ads_release(com.vungle.ads.internal.presenter.j jVar) {
        this.presenterDelegate = jVar;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }

    public final void start() throws Throwable {
        k.Companion.d(TAG, "start()");
        this.adWidget.resumeWeb();
        setAdVisibility(true);
        if (this.advertisement.adLoadOptimizationEnabled()) {
            recordPlayAssetMetric();
        }
    }

    public final void stop() {
        k.Companion.d(TAG, "stop()");
        this.adWidget.pauseWeb();
        setAdVisibility(false);
    }

    public static /* synthetic */ void getAdStartTime$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBackEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBus$annotations() {
    }

    public static /* synthetic */ void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getHeartbeatEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getSuspendableTimer$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getUserId$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getVungleApiClient$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isDestroying$vungle_ads_release$annotations() {
    }
}
