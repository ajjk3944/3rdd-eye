package com.vungle.ads.internal.presenter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import androidx.annotation.VisibleForTesting;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.HeartbeatMissingError;
import com.vungle.ads.IndexHtmlError;
import com.vungle.ads.LinkError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.VungleError;
import com.vungle.ads.WebViewError;
import com.vungle.ads.WebViewRenderProcessUnresponsive;
import com.vungle.ads.WebViewRenderingProcessGone;
import com.vungle.ads.internal.ClickCoordinateTracker;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.f;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.ui.view.e;
import com.vungle.ads.internal.util.SuspendableTimer;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.y;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q7.d;
import y8.s;

/* loaded from: classes3.dex */
public final class MRAIDPresenter implements e.a, e.b {

    @NotNull
    private static final String ACTION = "action";

    @NotNull
    public static final String ACTION_WITH_VALUE = "actionWithValue";

    @NotNull
    public static final String CLOSE = "close";

    @NotNull
    public static final String CONSENT_ACTION = "consentAction";

    @NotNull
    public static final String CREATIVE_HEARTBEAT = "creativeHeartbeat";

    @NotNull
    public static final String DETECT_BLACK_SCREEN = "detectBlackScreen";

    @NotNull
    public static final String ERROR = "error";

    @NotNull
    public static final String GET_AVAILABLE_DISK_SPACE = "getAvailableDiskSpace";
    private static final double HEARTBEAT_INTERVAL = 6.0d;

    @NotNull
    public static final String OPEN = "open";

    @NotNull
    private static final String OPEN_APP_STORE = "openAppStore";

    @NotNull
    private static final String OPEN_NON_MRAID = "openNonMraid";

    @NotNull
    public static final String OPEN_PRIVACY = "openPrivacy";

    @NotNull
    public static final String PING_URL = "pingUrl";

    @NotNull
    public static final String SET_ORIENTATION_PROPERTIES = "setOrientationProperties";

    @NotNull
    public static final String SUCCESSFUL_VIEW = "successfulView";

    @NotNull
    private static final String TAG = "MRAIDPresenter";

    @NotNull
    public static final String TPAT = "tpat";

    @NotNull
    public static final String UPDATE_SIGNALS = "updateSignals";

    @NotNull
    private static final String USE_CUSTOM_CLOSE = "useCustomClose";

    @NotNull
    private static final String USE_CUSTOM_PRIVACY = "useCustomPrivacy";

    @NotNull
    public static final String VIDEO_LENGTH = "videoLength";

    @Nullable
    private Long adStartTime;

    @NotNull
    private final MRAIDAdWidget adWidget;

    @NotNull
    private final q7.a advertisement;

    @Nullable
    private j appStoreDelegate;
    private boolean backEnabled;

    @Nullable
    private com.vungle.ads.internal.presenter.a bus;

    @NotNull
    private final y8.h clickCoordinateTracker$delegate;
    private boolean cp0Fired;

    @NotNull
    private Executor executor;
    private boolean heartbeatEnabled;

    @NotNull
    private final AtomicBoolean isDestroying;
    private long lastUserInteractionTimestamp;

    @NotNull
    private final y8.h logEntry$delegate;

    @NotNull
    private final s7.c omTracker;

    @NotNull
    private final y8.h pathProvider$delegate;

    @NotNull
    private final q7.h placement;

    @NotNull
    private final com.vungle.ads.internal.platform.d platform;

    @Nullable
    private l presenterDelegate;

    @NotNull
    private final y8.h scheduler$delegate;

    @NotNull
    private final AtomicBoolean sendReportIncentivized;

    @NotNull
    private final y8.h signalManager$delegate;

    @NotNull
    private final y8.h suspendableTimer$delegate;

    @NotNull
    private final y8.h tpatSender$delegate;

    @Nullable
    private String userId;
    private long videoLength;

    @NotNull
    private final y8.h vungleApiClient$delegate;

    @NotNull
    private final VungleWebClient vungleWebClient;

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final Map<String, Sdk$SDKMetric.SDKMetricType> eventMap = kotlin.collections.a.k(y8.i.a(com.vungle.ads.internal.b.CHECKPOINT_0, Sdk$SDKMetric.SDKMetricType.AD_START_EVENT), y8.i.a(com.vungle.ads.internal.b.CLICK_URL, Sdk$SDKMetric.SDKMetricType.AD_CLICK_EVENT));

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getACTION_WITH_VALUE$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getCLOSE$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getCONSENT_ACTION$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getCREATIVE_HEARTBEAT$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getDETECT_BLACK_SCREEN$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getERROR$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getEventMap$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getGET_AVAILABLE_DISK_SPACE$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getOPEN$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getOPEN_PRIVACY$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getPING_URL$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getSUCCESSFUL_VIEW$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getTPAT$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getUPDATE_SIGNALS$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getVIDEO_LENGTH$vungle_ads_release$annotations() {
        }

        @NotNull
        public final Map<String, Sdk$SDKMetric.SDKMetricType> getEventMap$vungle_ads_release() {
            return MRAIDPresenter.eventMap;
        }

        private a() {
        }
    }

    public static final class b implements com.vungle.ads.internal.ui.b {
        final /* synthetic */ String $deeplinkUrl;
        final /* synthetic */ MRAIDPresenter this$0;

        public b(String str, MRAIDPresenter mRAIDPresenter) {
            this.$deeplinkUrl = str;
            this.this$0 = mRAIDPresenter;
        }

        @Override // com.vungle.ads.internal.ui.b
        public void onDeeplinkClick(boolean z10) {
            if (!z10) {
                new LinkError(Sdk$SDKError.Reason.DEEPLINK_OPEN_FAILED, "Fail to open " + this.$deeplinkUrl).setLogEntry$vungle_ads_release(this.this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
            }
            List tpatUrls$default = q7.a.getTpatUrls$default(this.this$0.advertisement, com.vungle.ads.internal.b.DEEPLINK_CLICK, String.valueOf(z10), null, 4, null);
            if (tpatUrls$default != null) {
                MRAIDPresenter mRAIDPresenter = this.this$0;
                Iterator it = tpatUrls$default.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.h.sendTpat$default(mRAIDPresenter.getTpatSender(), new f.a((String) it.next()).tpatKey(com.vungle.ads.internal.b.DEEPLINK_CLICK).withLogEntry(mRAIDPresenter.getLogEntry()).build(), false, 2, null);
                }
            }
        }
    }

    public static final class c implements com.vungle.ads.internal.network.b {
        public c() {
        }

        @Override // com.vungle.ads.internal.network.b
        public void onFailure(@Nullable com.vungle.ads.internal.network.a aVar, @Nullable Throwable th) {
            p.Companion.d(MRAIDPresenter.TAG, "send RI Failure");
            StringBuilder sb = new StringBuilder();
            sb.append("Error RI API calls: ");
            sb.append(th != null ? th.getLocalizedMessage() : null);
            new NetworkUnreachable(sb.toString()).setLogEntry$vungle_ads_release(MRAIDPresenter.this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }

        @Override // com.vungle.ads.internal.network.b
        public void onResponse(@Nullable com.vungle.ads.internal.network.a aVar, @Nullable com.vungle.ads.internal.network.e eVar) {
            p.Companion.d(MRAIDPresenter.TAG, "send RI success");
        }
    }

    public MRAIDPresenter(@NotNull MRAIDAdWidget adWidget, @NotNull q7.a advertisement, @NotNull q7.h placement, @NotNull VungleWebClient vungleWebClient, @NotNull Executor executor, @NotNull s7.c omTracker, @NotNull com.vungle.ads.internal.platform.d platform) {
        kotlin.jvm.internal.p.e(adWidget, "adWidget");
        kotlin.jvm.internal.p.e(advertisement, "advertisement");
        kotlin.jvm.internal.p.e(placement, "placement");
        kotlin.jvm.internal.p.e(vungleWebClient, "vungleWebClient");
        kotlin.jvm.internal.p.e(executor, "executor");
        kotlin.jvm.internal.p.e(omTracker, "omTracker");
        kotlin.jvm.internal.p.e(platform, "platform");
        this.adWidget = adWidget;
        this.advertisement = advertisement;
        this.placement = placement;
        this.vungleWebClient = vungleWebClient;
        this.executor = executor;
        this.omTracker = omTracker;
        this.platform = platform;
        this.isDestroying = new AtomicBoolean(false);
        this.sendReportIncentivized = new AtomicBoolean(false);
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        final Context context = adWidget.getContext();
        kotlin.jvm.internal.p.d(context, "adWidget.context");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f21907a;
        this.vungleApiClient$delegate = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final VungleApiClient invoke() {
                return ServiceLocator.Companion.getInstance(context).getService(VungleApiClient.class);
            }
        });
        final Context context2 = adWidget.getContext();
        kotlin.jvm.internal.p.d(context2, "adWidget.context");
        this.pathProvider$delegate = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.q, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final q invoke() {
                return ServiceLocator.Companion.getInstance(context2).getService(q.class);
            }
        });
        final Context context3 = adWidget.getContext();
        kotlin.jvm.internal.p.d(context3, "adWidget.context");
        this.signalManager$delegate = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final SignalManager invoke() {
                return ServiceLocator.Companion.getInstance(context3).getService(SignalManager.class);
            }
        });
        final Context context4 = adWidget.getContext();
        kotlin.jvm.internal.p.d(context4, "adWidget.context");
        this.tpatSender$delegate = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.h, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final com.vungle.ads.internal.network.h invoke() {
                return ServiceLocator.Companion.getInstance(context4).getService(com.vungle.ads.internal.network.h.class);
            }
        });
        this.scheduler$delegate = kotlin.b.b(new l9.a() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$scheduler$2
            @Override // l9.a
            @NotNull
            public final com.vungle.ads.internal.util.j invoke() {
                return new com.vungle.ads.internal.util.j();
            }
        });
        this.logEntry$delegate = kotlin.b.b(new l9.a() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$logEntry$2
            {
                super(0);
            }

            @Override // l9.a
            @Nullable
            public final o invoke() {
                return this.this$0.advertisement.getLogEntry$vungle_ads_release();
            }
        });
        this.suspendableTimer$delegate = kotlin.b.b(new l9.a() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$suspendableTimer$2
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final SuspendableTimer invoke() {
                final MRAIDPresenter mRAIDPresenter = this.this$0;
                return new SuspendableTimer(6.0d, true, null, new l9.a() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$suspendableTimer$2.1
                    {
                        super(0);
                    }

                    @Override // l9.a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m340invoke();
                        return s.f25199a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m340invoke() {
                        mRAIDPresenter.reportErrorAndCloseAd(new HeartbeatMissingError());
                    }
                }, 4, null);
            }
        });
        this.clickCoordinateTracker$delegate = kotlin.b.b(new l9.a() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$clickCoordinateTracker$2
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ClickCoordinateTracker invoke() {
                Context context5 = this.this$0.adWidget.getContext();
                kotlin.jvm.internal.p.d(context5, "adWidget.context");
                return new ClickCoordinateTracker(context5, this.this$0.advertisement);
            }
        });
    }

    private final void closeView() {
        v vVar = v.INSTANCE;
        if (vVar.isMainThread()) {
            this.executor.execute(new Runnable() { // from class: com.vungle.ads.internal.presenter.d
                @Override // java.lang.Runnable
                public final void run() {
                    MRAIDPresenter.m331closeView$lambda3(this.f20201a);
                }
            });
        } else {
            sendAdCloseEvent();
        }
        vVar.runOnUiThread(new l9.a() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter.closeView.2
            {
                super(0);
            }

            @Override // l9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m334invoke();
                return s.f25199a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m334invoke() {
                MRAIDPresenter.this.adWidget.close();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: closeView$lambda-3, reason: not valid java name */
    public static final void m331closeView$lambda3(MRAIDPresenter this$0) {
        kotlin.jvm.internal.p.e(this$0, "this$0");
        this$0.sendAdCloseEvent();
    }

    private final com.vungle.ads.internal.ui.b createDeeplinkCallback(String str) {
        return new b(str, this);
    }

    @VisibleForTesting
    public static /* synthetic */ void getAdStartTime$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getBackEnabled$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getBus$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getHeartbeatEnabled$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastUserInteractionTimestamp$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o getLogEntry() {
        return (o) this.logEntry$delegate.getValue();
    }

    private final q getPathProvider() {
        return (q) this.pathProvider$delegate.getValue();
    }

    private final com.vungle.ads.internal.util.j getScheduler() {
        return (com.vungle.ads.internal.util.j) this.scheduler$delegate.getValue();
    }

    private final SignalManager getSignalManager() {
        return (SignalManager) this.signalManager$delegate.getValue();
    }

    @VisibleForTesting
    public static /* synthetic */ void getSuspendableTimer$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.network.h getTpatSender() {
        return (com.vungle.ads.internal.network.h) this.tpatSender$delegate.getValue();
    }

    @VisibleForTesting
    public static /* synthetic */ void getUserId$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getVideoLength$vungle_ads_release$annotations() {
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebViewException(VungleError vungleError, boolean z10, String str) {
        p.Companion.e(TAG, "handleWebViewException: " + vungleError.getLocalizedMessage() + ", fatal: " + z10 + ", errorMsg: " + str);
        vungleError.setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        if (z10) {
            makeBusError(vungleError);
            closeView();
        }
    }

    public static /* synthetic */ void handleWebViewException$default(MRAIDPresenter mRAIDPresenter, VungleError vungleError, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        mRAIDPresenter.handleWebViewException(vungleError, z10, str);
    }

    @VisibleForTesting
    public static /* synthetic */ void isDestroying$vungle_ads_release$annotations() {
    }

    private final boolean launchInlineInstall(String str) throws Throwable {
        Pair<Boolean, String> pair;
        com.vungle.ads.internal.util.g gVar = com.vungle.ads.internal.util.g.INSTANCE;
        Context context = this.adWidget.getContext();
        kotlin.jvm.internal.p.d(context, "adWidget.context");
        Intent intentFromUrl$vungle_ads_release = gVar.getIntentFromUrl$vungle_ads_release(context, str);
        if (intentFromUrl$vungle_ads_release == null) {
            logInlineInstallFailure("url: " + str + ", message: intent is null");
            return false;
        }
        Pair<Boolean, String> pairCheckInlineInstallIntent$vungle_ads_release = checkInlineInstallIntent$vungle_ads_release(intentFromUrl$vungle_ads_release);
        boolean zBooleanValue = ((Boolean) pairCheckInlineInstallIntent$vungle_ads_release.getFirst()).booleanValue();
        String str2 = (String) pairCheckInlineInstallIntent$vungle_ads_release.getSecond();
        if (!zBooleanValue) {
            logInlineInstallFailure("url: " + str + ", message: resolveInfo " + str2);
            return false;
        }
        j jVar = this.appStoreDelegate;
        if (jVar == null || (pair = jVar.openInlineInstall(intentFromUrl$vungle_ads_release)) == null) {
            pair = new Pair<>(Boolean.FALSE, null);
        }
        boolean zBooleanValue2 = ((Boolean) pair.getFirst()).booleanValue();
        String str3 = (String) pair.getSecond();
        if (zBooleanValue2) {
            logInlineInstallSuccess$vungle_ads_release("url: " + str);
            return true;
        }
        logInlineInstallFailure("url: " + str + ", message: " + str3);
        return false;
    }

    private final VungleError loadMraidAd() {
        String indexFilePath = this.advertisement.getIndexFilePath();
        File file = indexFilePath != null ? new File(indexFilePath) : null;
        if (file == null || !file.exists()) {
            Sdk$SDKError.Reason reason = Sdk$SDKError.Reason.AD_HTML_FAILED_TO_LOAD;
            StringBuilder sb = new StringBuilder();
            sb.append("Fail to load html ");
            sb.append(file != null ? file.getPath() : null);
            return new IndexHtmlError(reason, sb.toString());
        }
        this.adWidget.linkWebView(this.vungleWebClient, this.advertisement.getWebViewSettings());
        this.adWidget.showWebsite(q7.a.FILE_SCHEME + file.getPath());
        return null;
    }

    private final void logInlineInstallFailure(String str) throws Throwable {
        v.INSTANCE.runOnUiThread(new l9.a() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter.logInlineInstallFailure.1
            {
                super(0);
            }

            @Override // l9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m335invoke();
                return s.f25199a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m335invoke() {
                MRAIDPresenter.this.vungleWebClient.notifyPresentAppStoreFailed();
            }
        });
        y yVar = new y(Sdk$SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
        yVar.setValue(2L);
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        analyticsClient.logMetric$vungle_ads_release(yVar, getLogEntry(), str);
        analyticsClient.logError$vungle_ads_release(Sdk$SDKError.Reason.INLINE_INSTALL_ERROR, String.valueOf(str), getLogEntry());
    }

    public static /* synthetic */ void logInlineInstallFailure$default(MRAIDPresenter mRAIDPresenter, String str, int i10, Object obj) throws Throwable {
        if ((i10 & 1) != 0) {
            str = null;
        }
        mRAIDPresenter.logInlineInstallFailure(str);
    }

    public static /* synthetic */ void logInlineInstallSuccess$vungle_ads_release$default(MRAIDPresenter mRAIDPresenter, String str, int i10, Object obj) throws Throwable {
        if ((i10 & 1) != 0) {
            str = null;
        }
        mRAIDPresenter.logInlineInstallSuccess$vungle_ads_release(str);
    }

    private final void makeBusError(VungleError vungleError) {
        com.vungle.ads.internal.presenter.a aVar = this.bus;
        if (aVar != null) {
            aVar.onError(vungleError, this.placement.getReferenceId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: prepare$lambda-15, reason: not valid java name */
    public static final void m332prepare$lambda15(MRAIDPresenter this$0) {
        kotlin.jvm.internal.p.e(this$0, "this$0");
        this$0.backEnabled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-11, reason: not valid java name */
    public static final void m333processCommand$lambda11(MRAIDPresenter this$0) {
        kotlin.jvm.internal.p.e(this$0, "this$0");
        List list = null;
        d.b bVar = null;
        com.vungle.ads.internal.network.a aVarRi = this$0.getVungleApiClient().ri(new d.i(list, bVar, this$0.adStartTime, this$0.advertisement.advAppId(), this$0.placement.getReferenceId(), this$0.userId, 3, (kotlin.jvm.internal.i) null));
        if (aVarRi != null) {
            aVarRi.enqueue(this$0.new c());
            return;
        }
        p.Companion.e(TAG, "Invalid ri call.");
        new NetworkUnreachable("Error RI API for placement: " + this$0.placement.getReferenceId()).setLogEntry$vungle_ads_release(this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportErrorAndCloseAd(VungleError vungleError) {
        vungleError.setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        makeBusError(vungleError);
        closeView();
    }

    private final void sendAdCloseEvent() {
        Long l10 = this.adStartTime;
        if (l10 != null) {
            List<String> tpatUrls = this.advertisement.getTpatUrls(com.vungle.ads.internal.b.AD_CLOSE, String.valueOf(System.currentTimeMillis() - l10.longValue()), String.valueOf(this.platform.getVolumeLevel()));
            if (tpatUrls != null) {
                Iterator<T> it = tpatUrls.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.h.sendTpat$default(getTpatSender(), new f.a((String) it.next()).tpatKey(com.vungle.ads.internal.b.AD_CLOSE).withLogEntry(getLogEntry()).build(), false, 2, null);
                }
            }
        }
    }

    private final void triggerEventMetricForTpat(String str) throws Throwable {
        Sdk$SDKMetric.SDKMetricType sDKMetricType = eventMap.get(str);
        if (sDKMetricType != null) {
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new y(sDKMetricType), getLogEntry(), (String) null, 4, (Object) null);
        }
    }

    @VisibleForTesting
    @NotNull
    public final Pair<Boolean, String> checkInlineInstallIntent$vungle_ads_release(@NotNull Intent intent) {
        kotlin.jvm.internal.p.e(intent, "intent");
        ComponentName componentNameResolveActivity = intent.resolveActivity(this.adWidget.getContext().getPackageManager());
        String packageName = componentNameResolveActivity != null ? componentNameResolveActivity.getPackageName() : null;
        return new Pair<>(Boolean.valueOf(kotlin.jvm.internal.p.a(packageName, "com.android.vending")), packageName);
    }

    public final void detach(@MRAIDAdWidget.AdStopReason int i10) {
        com.vungle.ads.internal.presenter.a aVar;
        p.Companion.d(TAG, "detach()");
        boolean z10 = (i10 & 1) != 0;
        boolean z11 = (i10 & 2) != 0;
        this.vungleWebClient.setWebViewObserver(null);
        this.vungleWebClient.setMraidDelegate(null);
        if (!z10 && z11 && !this.isDestroying.getAndSet(true) && (aVar = this.bus) != null) {
            aVar.onNext(TtmlNode.END, null, this.placement.getReferenceId());
        }
        this.adWidget.destroyWebView(this.omTracker.stop(), this.platform.isProblematicMaliDevice());
        if (this.heartbeatEnabled) {
            getSuspendableTimer$vungle_ads_release().cancel();
        }
    }

    @Nullable
    public final Long getAdStartTime$vungle_ads_release() {
        return this.adStartTime;
    }

    public final boolean getBackEnabled$vungle_ads_release() {
        return this.backEnabled;
    }

    @Nullable
    public final com.vungle.ads.internal.presenter.a getBus() {
        return this.bus;
    }

    @NotNull
    public final ClickCoordinateTracker getClickCoordinateTracker$vungle_ads_release() {
        return (ClickCoordinateTracker) this.clickCoordinateTracker$delegate.getValue();
    }

    public final boolean getHeartbeatEnabled$vungle_ads_release() {
        return this.heartbeatEnabled;
    }

    public final long getLastUserInteractionTimestamp$vungle_ads_release() {
        return this.lastUserInteractionTimestamp;
    }

    @NotNull
    public final SuspendableTimer getSuspendableTimer$vungle_ads_release() {
        return (SuspendableTimer) this.suspendableTimer$delegate.getValue();
    }

    @Nullable
    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    public final long getVideoLength$vungle_ads_release() {
        return this.videoLength;
    }

    @Nullable
    public final Long getViewStatus() {
        return !this.cp0Fired ? 1L : null;
    }

    public final void handleExit() {
        if (this.backEnabled) {
            this.adWidget.showWebsite("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    @NotNull
    public final AtomicBoolean isDestroying$vungle_ads_release() {
        return this.isDestroying;
    }

    public final void logInlineInstallSuccess$vungle_ads_release(@Nullable String str) throws Throwable {
        y yVar = new y(Sdk$SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
        yVar.setValue(1L);
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(yVar, getLogEntry(), str);
    }

    @Override // com.vungle.ads.internal.ui.view.e.b
    public void onReceivedError(@NotNull String errorDesc, boolean z10) {
        kotlin.jvm.internal.p.e(errorDesc, "errorDesc");
        if (z10) {
            reportErrorAndCloseAd(new WebViewError(errorDesc));
        }
    }

    @Override // com.vungle.ads.internal.ui.view.e.b
    public void onRenderProcessUnresponsive(@Nullable WebView webView, @Nullable WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException$default(this, new WebViewRenderProcessUnresponsive("fatal=true"), true, null, 4, null);
    }

    public final void onViewConfigurationChanged() {
        this.vungleWebClient.notifyPropertiesChange(true);
    }

    public final void onViewTouched(@Nullable MotionEvent motionEvent) {
        if (motionEvent != null) {
            p.Companion.d(TAG, "user interaction");
            this.lastUserInteractionTimestamp = System.currentTimeMillis();
            getClickCoordinateTracker$vungle_ads_release().trackCoordinate(motionEvent);
        }
    }

    @Override // com.vungle.ads.internal.ui.view.e.b
    public boolean onWebRenderingProcessGone(@Nullable WebView webView, @Nullable Boolean bool) {
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        handleWebViewException$default(this, new WebViewRenderingProcessGone("didCrash=" + zBooleanValue), zBooleanValue, null, 4, null);
        return true;
    }

    public final void prepare() {
        String alertTitleText;
        String alertBodyText;
        String alertContinueButtonText;
        String alertCloseButtonText;
        VungleError vungleErrorLoadMraidAd;
        int settings;
        this.isDestroying.set(false);
        AdConfig adConfig = this.advertisement.getAdConfig();
        if (adConfig != null && (settings = adConfig.getSettings()) > 0) {
            this.backEnabled = (settings & 2) == 2;
        }
        this.heartbeatEnabled = this.advertisement.heartbeatEnabled();
        AdConfig adConfig2 = this.advertisement.getAdConfig();
        Integer numValueOf = adConfig2 != null ? Integer.valueOf(adConfig2.getAdOrientation()) : null;
        this.adWidget.setOrientation((numValueOf != null && numValueOf.intValue() == 0) ? 7 : (numValueOf != null && numValueOf.intValue() == 1) ? 6 : 4);
        this.omTracker.start();
        this.vungleWebClient.setMraidDelegate(this);
        this.vungleWebClient.setErrorHandler(this);
        this.vungleWebClient.setAdVisibility(false);
        if (!this.advertisement.usePreloading() && (vungleErrorLoadMraidAd = loadMraidAd()) != null) {
            reportErrorAndCloseAd(vungleErrorLoadMraidAd);
            return;
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
        l lVar = this.presenterDelegate;
        this.userId = lVar != null ? lVar.getUserId() : null;
        l lVar2 = this.presenterDelegate;
        if (lVar2 == null || (alertTitleText = lVar2.getAlertTitleText()) == null) {
            alertTitleText = "";
        }
        l lVar3 = this.presenterDelegate;
        if (lVar3 == null || (alertBodyText = lVar3.getAlertBodyText()) == null) {
            alertBodyText = "";
        }
        l lVar4 = this.presenterDelegate;
        if (lVar4 == null || (alertContinueButtonText = lVar4.getAlertContinueButtonText()) == null) {
            alertContinueButtonText = "";
        }
        l lVar5 = this.presenterDelegate;
        if (lVar5 == null || (alertCloseButtonText = lVar5.getAlertCloseButtonText()) == null) {
            alertCloseButtonText = "";
        }
        this.advertisement.setIncentivizedText(alertTitleText, alertBodyText, alertContinueButtonText, alertCloseButtonText);
        ConfigManager configManager = ConfigManager.INSTANCE;
        boolean z10 = configManager.getGDPRIsCountryDataProtected() && kotlin.jvm.internal.p.a("unknown", PrivacyManager.INSTANCE.getConsentStatus());
        this.vungleWebClient.setConsentStatus(z10, configManager.getGDPRConsentTitle(), configManager.getGDPRConsentMessage(), configManager.getGDPRButtonAccept(), configManager.getGDPRButtonDeny());
        if (z10) {
            PrivacyManager.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", "");
        }
        int showCloseDelay = this.advertisement.getShowCloseDelay(Boolean.valueOf(this.placement.isRewardedVideo()));
        if (showCloseDelay > 0) {
            getScheduler().schedule(new Runnable() { // from class: com.vungle.ads.internal.presenter.f
                @Override // java.lang.Runnable
                public final void run() {
                    MRAIDPresenter.m332prepare$lambda15(this.f20203a);
                }
            }, showCloseDelay);
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
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0261, code lost:
    
        if (r26.equals(com.vungle.ads.internal.presenter.MRAIDPresenter.OPEN_NON_MRAID) == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0265, code lost:
    
        r0 = r25.advertisement.adUnit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026b, code lost:
    
        if (r0 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x026d, code lost:
    
        r12 = r0.getDeeplinkUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0271, code lost:
    
        r0 = com.vungle.ads.internal.util.n.INSTANCE.getContentStringValue(r27, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x027d, code lost:
    
        if (com.vungle.ads.internal.util.i.INSTANCE.isValidUrl(r0) != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x027f, code lost:
    
        new com.vungle.ads.InvalidCTAUrl("Invalid CTA Url (" + r0 + ')').setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02a9, code lost:
    
        if (shouldBlockAutoRedirect$vungle_ads_release() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02ab, code lost:
    
        r25.lastUserInteractionTimestamp = 0;
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, new com.vungle.ads.y(com.vungle.ads.internal.protos.Sdk$SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02c6, code lost:
    
        r25.lastUserInteractionTimestamp = 0;
        r19 = com.vungle.ads.internal.util.g.INSTANCE;
        r2 = r25.adWidget.getContext();
        kotlin.jvm.internal.p.d(r2, "adWidget.context");
        r0 = r19.launch$vungle_ads_release(r12, r0, r2, getLogEntry(), createDeeplinkCallback(r12));
        r2 = r25.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e9, code lost:
    
        if (r2 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02eb, code lost:
    
        r2.onNext(com.vungle.ads.internal.presenter.MRAIDPresenter.OPEN, "adClick", r25.placement.getReferenceId());
        r2 = y8.s.f25199a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02f6, code lost:
    
        if (r0 == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02f8, code lost:
    
        r0 = r25.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02fa, code lost:
    
        if (r0 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02fc, code lost:
    
        r0.onNext(com.vungle.ads.internal.presenter.MRAIDPresenter.OPEN, "adLeftApplication", r25.placement.getReferenceId());
        r0 = y8.s.f25199a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x024c, code lost:
    
        if (r26.equals(com.vungle.ads.internal.presenter.MRAIDPresenter.OPEN) == false) goto L253;
     */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0697  */
    @Override // com.vungle.ads.internal.ui.view.e.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean processCommand(@org.jetbrains.annotations.NotNull java.lang.String r26, @org.jetbrains.annotations.NotNull kotlinx.serialization.json.JsonObject r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.presenter.MRAIDPresenter.processCommand(java.lang.String, kotlinx.serialization.json.JsonObject):boolean");
    }

    public final void setAdStartTime$vungle_ads_release(@Nullable Long l10) {
        this.adStartTime = l10;
    }

    public final void setAdVisibility(boolean z10) {
        this.vungleWebClient.setAdVisibility(z10);
    }

    public final void setBackEnabled$vungle_ads_release(boolean z10) {
        this.backEnabled = z10;
    }

    public final void setBus(@Nullable com.vungle.ads.internal.presenter.a aVar) {
        this.bus = aVar;
    }

    public final void setEventListener(@Nullable com.vungle.ads.internal.presenter.a aVar) {
        this.bus = aVar;
    }

    public final void setHeartbeatEnabled$vungle_ads_release(boolean z10) {
        this.heartbeatEnabled = z10;
    }

    public final void setLastUserInteractionTimestamp$vungle_ads_release(long j10) {
        this.lastUserInteractionTimestamp = j10;
    }

    public final void setOpenActivityDelegate$vungle_ads_release(@Nullable j jVar) {
        this.appStoreDelegate = jVar;
    }

    public final void setPresenterDelegate$vungle_ads_release(@Nullable l lVar) {
        this.presenterDelegate = lVar;
    }

    public final void setUserId$vungle_ads_release(@Nullable String str) {
        this.userId = str;
    }

    public final void setVideoLength$vungle_ads_release(long j10) {
        this.videoLength = j10;
    }

    public final boolean shouldBlockAutoRedirect$vungle_ads_release() {
        ConfigManager configManager = ConfigManager.INSTANCE;
        if (configManager.allowAutoRedirects()) {
            return false;
        }
        return this.lastUserInteractionTimestamp == 0 || System.currentTimeMillis() - this.lastUserInteractionTimestamp > configManager.afterClickDuration();
    }

    public final void start() {
        p.Companion.d(TAG, "start()");
        this.adWidget.resumeWeb();
        setAdVisibility(true);
    }

    public final void stop() {
        p.Companion.d(TAG, "stop()");
        this.adWidget.pauseWeb();
        setAdVisibility(false);
    }
}
