package com.vungle.ads.internal.presenter;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.LinkError;
import com.vungle.ads.PrivacyUrlError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.network.f;
import com.vungle.ads.internal.omsdk.NativeOMTracker;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.y;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q7.a;

/* loaded from: classes3.dex */
public final class NativeAdPresenter {

    @NotNull
    public static final String DOWNLOAD = "download";

    @NotNull
    public static final String OPEN_PRIVACY = "openPrivacy";

    @NotNull
    private static final String TAG = "NativeAdPresenter";

    @NotNull
    public static final String TPAT = "tpat";

    @NotNull
    public static final String VIDEO_VIEWED = "videoViewed";
    private boolean adClicked;

    @Nullable
    private Long adStartTime;
    private boolean adViewed;

    @Nullable
    private final q7.a advertisement;

    @Nullable
    private com.vungle.ads.internal.presenter.a bus;

    @NotNull
    private final Context context;

    @Nullable
    private Dialog currentDialog;

    @NotNull
    private final i delegate;

    @NotNull
    private final y8.h logEntry$delegate;

    @Nullable
    private NativeOMTracker omTracker;

    @NotNull
    private final com.vungle.ads.internal.platform.d platform;

    @NotNull
    private final y8.h tpatSender$delegate;

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final Map<String, Sdk$SDKMetric.SDKMetricType> eventMap = kotlin.collections.a.k(y8.i.a(com.vungle.ads.internal.b.CHECKPOINT_0, Sdk$SDKMetric.SDKMetricType.AD_START_EVENT), y8.i.a(com.vungle.ads.internal.b.CLICK_URL, Sdk$SDKMetric.SDKMetricType.AD_CLICK_EVENT));

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getEventMap$vungle_ads_release$annotations() {
        }

        @NotNull
        public final Map<String, Sdk$SDKMetric.SDKMetricType> getEventMap$vungle_ads_release() {
            return NativeAdPresenter.eventMap;
        }

        private a() {
        }
    }

    public static final class b implements com.vungle.ads.internal.ui.b {
        final /* synthetic */ String $deeplinkUrl;
        final /* synthetic */ NativeAdPresenter this$0;

        public b(String str, NativeAdPresenter nativeAdPresenter) {
            this.$deeplinkUrl = str;
            this.this$0 = nativeAdPresenter;
        }

        @Override // com.vungle.ads.internal.ui.b
        public void onDeeplinkClick(boolean z10) {
            if (!z10) {
                new LinkError(Sdk$SDKError.Reason.DEEPLINK_OPEN_FAILED, "Fail to open " + this.$deeplinkUrl).setLogEntry$vungle_ads_release(this.this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
            }
            q7.a aVar = this.this$0.advertisement;
            List tpatUrls$default = aVar != null ? q7.a.getTpatUrls$default(aVar, com.vungle.ads.internal.b.DEEPLINK_CLICK, String.valueOf(z10), null, 4, null) : null;
            if (tpatUrls$default != null) {
                NativeAdPresenter nativeAdPresenter = this.this$0;
                Iterator it = tpatUrls$default.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.h.sendTpat$default(nativeAdPresenter.getTpatSender(), new f.a((String) it.next()).tpatKey(com.vungle.ads.internal.b.DEEPLINK_CLICK).withLogEntry(nativeAdPresenter.getLogEntry()).build(), false, 2, null);
                }
            }
        }
    }

    public NativeAdPresenter(@NotNull final Context context, @NotNull i delegate, @Nullable q7.a aVar, @NotNull com.vungle.ads.internal.platform.d platform) {
        p.e(context, "context");
        p.e(delegate, "delegate");
        p.e(platform, "platform");
        this.context = context;
        this.delegate = delegate;
        this.advertisement = aVar;
        this.platform = platform;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.tpatSender$delegate = kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$special$$inlined$inject$1
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
        this.logEntry$delegate = kotlin.b.b(new l9.a() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$logEntry$2
            {
                super(0);
            }

            @Override // l9.a
            @Nullable
            public final o invoke() {
                q7.a aVar2 = this.this$0.advertisement;
                if (aVar2 != null) {
                    return aVar2.getLogEntry$vungle_ads_release();
                }
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o getLogEntry() {
        return (o) this.logEntry$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.network.h getTpatSender() {
        return (com.vungle.ads.internal.network.h) this.tpatSender$delegate.getValue();
    }

    /* renamed from: initOMTracker$lambda-10, reason: not valid java name */
    private static final s7.b m341initOMTracker$lambda10(y8.h hVar) {
        return (s7.b) hVar.getValue();
    }

    private final boolean needShowGdpr() {
        return ConfigManager.INSTANCE.getGDPRIsCountryDataProtected() && p.a("unknown", PrivacyManager.INSTANCE.getConsentStatus());
    }

    private final void onDownload(String str) {
        com.vungle.ads.internal.presenter.a aVar;
        a.c cVarAdUnit;
        String deeplinkUrl = null;
        if (!this.adClicked) {
            this.adClicked = true;
            q7.a aVar2 = this.advertisement;
            List tpatUrls$default = aVar2 != null ? q7.a.getTpatUrls$default(aVar2, com.vungle.ads.internal.b.CLICK_URL, null, null, 6, null) : null;
            List list = tpatUrls$default;
            if (list == null || list.isEmpty()) {
                new TpatError(Sdk$SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key: clickUrl").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
            } else {
                Iterator it = tpatUrls$default.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.h.sendTpat$default(getTpatSender(), new f.a((String) it.next()).tpatKey(com.vungle.ads.internal.b.CLICK_URL).withLogEntry(getLogEntry()).build(), false, 2, null);
                }
            }
            if (str != null) {
                com.vungle.ads.internal.network.h.sendTpat$default(getTpatSender(), new f.a(str).tpatKey(com.vungle.ads.internal.b.CTA_URL).withLogEntry(getLogEntry()).build(), false, 2, null);
            }
        }
        q7.a aVar3 = this.advertisement;
        if (aVar3 != null && (cVarAdUnit = aVar3.adUnit()) != null) {
            deeplinkUrl = cVarAdUnit.getDeeplinkUrl();
        }
        String str2 = deeplinkUrl;
        boolean zLaunch$vungle_ads_release = com.vungle.ads.internal.util.g.INSTANCE.launch$vungle_ads_release(str2, str, this.context, getLogEntry(), new b(str2, this));
        com.vungle.ads.internal.presenter.a aVar4 = this.bus;
        if (aVar4 != null) {
            aVar4.onNext(MRAIDPresenter.OPEN, "adClick", this.delegate.getPlacementRefId());
        }
        if (!zLaunch$vungle_ads_release || (aVar = this.bus) == null) {
            return;
        }
        aVar.onNext(MRAIDPresenter.OPEN, "adLeftApplication", this.delegate.getPlacementRefId());
    }

    private final void onPrivacy(String str) throws Throwable {
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new y(Sdk$SDKMetric.SDKMetricType.PRIVACY_URL_OPENED), getLogEntry(), (String) null, 4, (Object) null);
        if (str != null) {
            if (!com.vungle.ads.internal.util.i.INSTANCE.isValidUrl(str)) {
                new PrivacyUrlError(str).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            if (!com.vungle.ads.internal.util.g.launch$vungle_ads_release$default(com.vungle.ads.internal.util.g.INSTANCE, null, str, this.context, getLogEntry(), null, 16, null)) {
                new PrivacyUrlError(str).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            com.vungle.ads.internal.presenter.a aVar = this.bus;
            if (aVar != null) {
                aVar.onNext(MRAIDPresenter.OPEN, "adLeftApplication", this.delegate.getPlacementRefId());
            }
        }
    }

    public static /* synthetic */ void processCommand$default(NativeAdPresenter nativeAdPresenter, String str, String str2, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        nativeAdPresenter.processCommand(str, str2);
    }

    private final void showGdpr() {
        PrivacyManager.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", null);
        if (!(this.context instanceof Activity)) {
            com.vungle.ads.internal.util.p.Companion.w(TAG, "We can not show GDPR dialog with application context.");
            return;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.vungle.ads.internal.presenter.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                NativeAdPresenter.m342showGdpr$lambda8(this.f20204a, dialogInterface, i10);
            }
        };
        ConfigManager configManager = ConfigManager.INSTANCE;
        String gDPRConsentTitle = configManager.getGDPRConsentTitle();
        String gDPRConsentMessage = configManager.getGDPRConsentMessage();
        String gDPRButtonAccept = configManager.getGDPRButtonAccept();
        String gDPRButtonDeny = configManager.getGDPRButtonDeny();
        Context context = this.context;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, ((Activity) context).getApplicationInfo().theme));
        if (gDPRConsentTitle != null && gDPRConsentTitle.length() != 0) {
            builder.setTitle(gDPRConsentTitle);
        }
        if (gDPRConsentMessage != null && gDPRConsentMessage.length() != 0) {
            builder.setMessage(gDPRConsentMessage);
        }
        builder.setPositiveButton(gDPRButtonAccept, onClickListener);
        builder.setNegativeButton(gDPRButtonDeny, onClickListener);
        builder.setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.vungle.ads.internal.presenter.h
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                NativeAdPresenter.m343showGdpr$lambda9(this.f20205a, dialogInterface);
            }
        });
        this.currentDialog = alertDialogCreate;
        alertDialogCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showGdpr$lambda-8, reason: not valid java name */
    public static final void m342showGdpr$lambda8(NativeAdPresenter this$0, DialogInterface dialogInterface, int i10) {
        p.e(this$0, "this$0");
        PrivacyManager.INSTANCE.updateGdprConsent(i10 != -2 ? i10 != -1 ? "opted_out_by_timeout" : PrivacyConsent.OPT_IN.getValue() : PrivacyConsent.OPT_OUT.getValue(), "vungle_modal", null);
        this$0.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showGdpr$lambda-9, reason: not valid java name */
    public static final void m343showGdpr$lambda9(NativeAdPresenter this$0, DialogInterface dialogInterface) {
        p.e(this$0, "this$0");
        this$0.currentDialog = null;
    }

    private final void start() {
        if (needShowGdpr()) {
            showGdpr();
        }
    }

    private final void triggerEventMetricForTpat(String str) throws Throwable {
        Sdk$SDKMetric.SDKMetricType sDKMetricType = eventMap.get(str);
        if (sDKMetricType != null) {
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new y(sDKMetricType), getLogEntry(), (String) null, 4, (Object) null);
        }
    }

    public final void detach() {
        List<String> tpatUrls;
        NativeOMTracker nativeOMTracker = this.omTracker;
        if (nativeOMTracker != null) {
            nativeOMTracker.stop();
        }
        Dialog dialog = this.currentDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        Long l10 = this.adStartTime;
        if (l10 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l10.longValue();
            q7.a aVar = this.advertisement;
            if (aVar != null && (tpatUrls = aVar.getTpatUrls(com.vungle.ads.internal.b.AD_CLOSE, String.valueOf(jCurrentTimeMillis), String.valueOf(this.platform.getVolumeLevel()))) != null) {
                Iterator<T> it = tpatUrls.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.h.sendTpat$default(getTpatSender(), new f.a((String) it.next()).tpatKey(com.vungle.ads.internal.b.AD_CLOSE).withLogEntry(getLogEntry()).build(), false, 2, null);
                }
            }
        }
        com.vungle.ads.internal.presenter.a aVar2 = this.bus;
        if (aVar2 != null) {
            aVar2.onNext(TtmlNode.END, null, this.delegate.getPlacementRefId());
        }
    }

    public final void initOMTracker(@NotNull String omSdkData) {
        p.e(omSdkData, "omSdkData");
        q7.a aVar = this.advertisement;
        boolean zOmEnabled = aVar != null ? aVar.omEnabled() : false;
        if (omSdkData.length() <= 0 || !zOmEnabled) {
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        final Context context = this.context;
        String oMSDKJS$vungle_ads_release = m341initOMTracker$lambda10(kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$initOMTracker$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, s7.b] */
            @Override // l9.a
            @NotNull
            public final s7.b invoke() {
                return ServiceLocator.Companion.getInstance(context).getService(s7.b.class);
            }
        })).getOMSDKJS$vungle_ads_release();
        if (oMSDKJS$vungle_ads_release != null) {
            this.omTracker = new NativeOMTracker(omSdkData, oMSDKJS$vungle_ads_release);
        }
    }

    public final void onImpression() {
        NativeOMTracker nativeOMTracker = this.omTracker;
        if (nativeOMTracker != null) {
            nativeOMTracker.impressionOccurred();
        }
    }

    public final void prepare() {
        start();
        com.vungle.ads.internal.presenter.a aVar = this.bus;
        if (aVar != null) {
            aVar.onNext("start", null, this.delegate.getPlacementRefId());
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void processCommand(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.Nullable java.lang.String r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.presenter.NativeAdPresenter.processCommand(java.lang.String, java.lang.String):void");
    }

    public final void setEventListener(@Nullable com.vungle.ads.internal.presenter.a aVar) {
        this.bus = aVar;
    }

    public final void startTracking(@NotNull View rootView) {
        p.e(rootView, "rootView");
        NativeOMTracker nativeOMTracker = this.omTracker;
        if (nativeOMTracker != null) {
            nativeOMTracker.start(rootView);
        }
    }
}
