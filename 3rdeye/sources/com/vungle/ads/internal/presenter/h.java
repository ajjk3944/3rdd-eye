package com.vungle.ads.internal.presenter;

import a6.C1653b;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;
import b9.C2001h;
import b9.InterfaceC2000g;
import c6.C2068a;
import com.applovin.impl.N;
import com.vungle.ads.C4055m;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.Y;
import com.vungle.ads.internal.util.k;
import com.vungle.ads.internal.util.l;
import com.vungle.ads.k0;
import e6.C4321c;
import e6.EnumC4320b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;

/* compiled from: NativeAdPresenter.kt */
/* loaded from: classes2.dex */
public final class h {
    public static final a Companion = new a(null);
    public static final String DOWNLOAD = "download";
    public static final String OPEN_PRIVACY = "openPrivacy";
    private static final String TAG = "NativeAdPresenter";
    public static final String TPAT = "tpat";
    public static final String VIDEO_VIEWED = "videoViewed";
    private Long adStartTime;
    private boolean adViewed;
    private final C1653b advertisement;
    private com.vungle.ads.internal.presenter.a bus;
    private final Context context;
    private Dialog currentDialog;
    private final i delegate;
    private Executor executor;
    private final InterfaceC2000g executors$delegate;
    private C2068a omTracker;
    private final InterfaceC2000g pathProvider$delegate;
    private final com.vungle.ads.internal.platform.b platform;
    private final InterfaceC2000g signalManager$delegate;
    private final InterfaceC2000g vungleApiClient$delegate;

    /* compiled from: NativeAdPresenter.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: NativeAdPresenter.kt */
    public static final class b implements com.vungle.ads.internal.ui.b {
        final /* synthetic */ com.vungle.ads.internal.network.e $tpatSender;

        public b(com.vungle.ads.internal.network.e eVar) {
            this.$tpatSender = eVar;
        }

        @Override // com.vungle.ads.internal.ui.b
        public void onDeeplinkClick(boolean z10) {
            C1653b c1653b = h.this.advertisement;
            List tpatUrls$default = c1653b != null ? C1653b.getTpatUrls$default(c1653b, com.vungle.ads.internal.g.DEEPLINK_CLICK, String.valueOf(z10), null, 4, null) : null;
            if (tpatUrls$default != null) {
                com.vungle.ads.internal.network.e eVar = this.$tpatSender;
                h hVar = h.this;
                Iterator it = tpatUrls$default.iterator();
                while (it.hasNext()) {
                    eVar.sendTpat((String) it.next(), hVar.executor);
                }
            }
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class c extends m implements InterfaceC5480a<com.vungle.ads.internal.network.g> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
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
    public static final class d extends m implements InterfaceC5480a<com.vungle.ads.internal.executor.a> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
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
    public static final class e extends m implements InterfaceC5480a<l> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.l, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final l invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(l.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class f extends m implements InterfaceC5480a<com.vungle.ads.internal.signals.b> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.b, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.signals.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.b.class);
        }
    }

    public h(Context context, i delegate, C1653b c1653b, Executor executor, com.vungle.ads.internal.platform.b platform) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(delegate, "delegate");
        kotlin.jvm.internal.l.f(executor, "executor");
        kotlin.jvm.internal.l.f(platform, "platform");
        this.context = context;
        this.delegate = delegate;
        this.advertisement = c1653b;
        this.executor = executor;
        this.platform = platform;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        b9.i iVar = b9.i.SYNCHRONIZED;
        this.vungleApiClient$delegate = C2001h.a(iVar, new c(context));
        this.executors$delegate = C2001h.a(iVar, new d(context));
        this.pathProvider$delegate = C2001h.a(iVar, new e(context));
        this.signalManager$delegate = C2001h.a(iVar, new f(context));
    }

    private final com.vungle.ads.internal.executor.a getExecutors() {
        return (com.vungle.ads.internal.executor.a) this.executors$delegate.getValue();
    }

    private final l getPathProvider() {
        return (l) this.pathProvider$delegate.getValue();
    }

    private final com.vungle.ads.internal.signals.b getSignalManager() {
        return (com.vungle.ads.internal.signals.b) this.signalManager$delegate.getValue();
    }

    private final com.vungle.ads.internal.network.g getVungleApiClient() {
        return (com.vungle.ads.internal.network.g) this.vungleApiClient$delegate.getValue();
    }

    private final boolean needShowGdpr() {
        return com.vungle.ads.internal.f.INSTANCE.getGDPRIsCountryDataProtected() && "unknown".equals(C4321c.INSTANCE.getConsentStatus());
    }

    private final void onDownload(String str) {
        C1653b.c cVarAdUnit;
        C1653b c1653b = this.advertisement;
        List tpatUrls$default = c1653b != null ? C1653b.getTpatUrls$default(c1653b, "clickUrl", null, null, 6, null) : null;
        com.vungle.ads.internal.network.g vungleApiClient = getVungleApiClient();
        String placementRefId = this.delegate.getPlacementRefId();
        C1653b c1653b2 = this.advertisement;
        String creativeId = c1653b2 != null ? c1653b2.getCreativeId() : null;
        C1653b c1653b3 = this.advertisement;
        com.vungle.ads.internal.network.e eVar = new com.vungle.ads.internal.network.e(vungleApiClient, placementRefId, creativeId, c1653b3 != null ? c1653b3.eventId() : null, getExecutors().getIoExecutor(), getPathProvider(), getSignalManager());
        List list = tpatUrls$default;
        if (list == null || list.isEmpty()) {
            C4055m c4055m = C4055m.INSTANCE;
            String placementRefId2 = this.delegate.getPlacementRefId();
            C1653b c1653b4 = this.advertisement;
            C4055m.logError$vungle_ads_release$default(c4055m, 129, "Empty tpat key: clickUrl", placementRefId2, c1653b4 != null ? c1653b4.getCreativeId() : null, (String) null, 16, (Object) null);
        } else {
            Iterator it = tpatUrls$default.iterator();
            while (it.hasNext()) {
                eVar.sendTpat((String) it.next(), this.executor);
            }
        }
        if (str != null) {
            eVar.sendTpat(str, this.executor);
        }
        C1653b c1653b5 = this.advertisement;
        com.vungle.ads.internal.util.e.launch((c1653b5 == null || (cVarAdUnit = c1653b5.adUnit()) == null) ? null : cVarAdUnit.getDeeplinkUrl(), str, this.context, new com.vungle.ads.internal.ui.c(this.bus, null), new b(eVar));
        com.vungle.ads.internal.presenter.a aVar = this.bus;
        if (aVar != null) {
            aVar.onNext(g.OPEN, "adClick", this.delegate.getPlacementRefId());
        }
    }

    private final void onPrivacy(String str) {
        if (str != null) {
            if (com.vungle.ads.internal.util.f.INSTANCE.isValidUrl(str)) {
                if (com.vungle.ads.internal.util.e.launch(null, str, this.context, new com.vungle.ads.internal.ui.c(this.bus, this.delegate.getPlacementRefId()), null)) {
                    return;
                }
                new Y(str).logErrorNoReturnValue$vungle_ads_release();
            } else {
                k0 placementId$vungle_ads_release = new Y(str).setPlacementId$vungle_ads_release(this.delegate.getPlacementRefId());
                C1653b c1653b = this.advertisement;
                k0 creativeId$vungle_ads_release = placementId$vungle_ads_release.setCreativeId$vungle_ads_release(c1653b != null ? c1653b.getCreativeId() : null);
                C1653b c1653b2 = this.advertisement;
                creativeId$vungle_ads_release.setEventId$vungle_ads_release(c1653b2 != null ? c1653b2.eventId() : null).logErrorNoReturnValue$vungle_ads_release();
            }
        }
    }

    public static /* synthetic */ void processCommand$default(h hVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        hVar.processCommand(str, str2);
    }

    private final void showGdpr() {
        C4321c.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", null);
        if (!(this.context instanceof Activity)) {
            k.Companion.w(TAG, "We can not show GDPR dialog with application context.");
            return;
        }
        C2.c cVar = new C2.c(this, 2);
        com.vungle.ads.internal.f fVar = com.vungle.ads.internal.f.INSTANCE;
        String gDPRConsentTitle = fVar.getGDPRConsentTitle();
        String gDPRConsentMessage = fVar.getGDPRConsentMessage();
        String gDPRButtonAccept = fVar.getGDPRButtonAccept();
        String gDPRButtonDeny = fVar.getGDPRButtonDeny();
        Context context = this.context;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, ((Activity) context).getApplicationInfo().theme));
        if (gDPRConsentTitle != null && gDPRConsentTitle.length() != 0) {
            builder.setTitle(gDPRConsentTitle);
        }
        if (gDPRConsentMessage != null && gDPRConsentMessage.length() != 0) {
            builder.setMessage(gDPRConsentMessage);
        }
        builder.setPositiveButton(gDPRButtonAccept, cVar);
        builder.setNegativeButton(gDPRButtonDeny, cVar);
        builder.setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnDismissListener(new N(this, 1));
        this.currentDialog = alertDialogCreate;
        alertDialogCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showGdpr$lambda-8, reason: not valid java name */
    public static final void m96showGdpr$lambda8(h this$0, DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        C4321c.INSTANCE.updateGdprConsent(i != -2 ? i != -1 ? "opted_out_by_timeout" : EnumC4320b.OPT_IN.getValue() : EnumC4320b.OPT_OUT.getValue(), "vungle_modal", null);
        this$0.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showGdpr$lambda-9, reason: not valid java name */
    public static final void m97showGdpr$lambda9(h this$0, DialogInterface dialogInterface) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.currentDialog = null;
    }

    private final void start() {
        if (needShowGdpr()) {
            showGdpr();
        }
    }

    public final void detach() {
        List<String> tpatUrls;
        C2068a c2068a = this.omTracker;
        if (c2068a != null) {
            c2068a.stop();
        }
        Dialog dialog = this.currentDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        Long l5 = this.adStartTime;
        if (l5 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l5.longValue();
            com.vungle.ads.internal.network.g vungleApiClient = getVungleApiClient();
            C1653b c1653b = this.advertisement;
            String strPlacementId = c1653b != null ? c1653b.placementId() : null;
            C1653b c1653b2 = this.advertisement;
            String creativeId = c1653b2 != null ? c1653b2.getCreativeId() : null;
            C1653b c1653b3 = this.advertisement;
            com.vungle.ads.internal.network.e eVar = new com.vungle.ads.internal.network.e(vungleApiClient, strPlacementId, creativeId, c1653b3 != null ? c1653b3.eventId() : null, getExecutors().getIoExecutor(), getPathProvider(), getSignalManager());
            C1653b c1653b4 = this.advertisement;
            if (c1653b4 != null && (tpatUrls = c1653b4.getTpatUrls(com.vungle.ads.internal.g.AD_CLOSE_TPAT_KEY, String.valueOf(jCurrentTimeMillis), String.valueOf(this.platform.getVolumeLevel()))) != null) {
                eVar.sendTpats(tpatUrls, this.executor);
            }
        }
        com.vungle.ads.internal.presenter.a aVar = this.bus;
        if (aVar != null) {
            aVar.onNext("end", null, this.delegate.getPlacementRefId());
        }
    }

    public final void initOMTracker(String omSdkData) {
        kotlin.jvm.internal.l.f(omSdkData, "omSdkData");
        C1653b c1653b = this.advertisement;
        boolean zOmEnabled = c1653b != null ? c1653b.omEnabled() : false;
        if (omSdkData.length() > 0 && com.vungle.ads.internal.f.INSTANCE.omEnabled() && zOmEnabled) {
            this.omTracker = new C2068a(omSdkData);
        }
    }

    public final void onImpression() {
        C2068a c2068a = this.omTracker;
        if (c2068a != null) {
            c2068a.impressionOccurred();
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
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void processCommand(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.presenter.h.processCommand(java.lang.String, java.lang.String):void");
    }

    public final void setEventListener(com.vungle.ads.internal.presenter.a aVar) {
        this.bus = aVar;
    }

    public final void startTracking(View rootView) {
        kotlin.jvm.internal.l.f(rootView, "rootView");
        C2068a c2068a = this.omTracker;
        if (c2068a != null) {
            c2068a.start(rootView);
        }
    }
}
