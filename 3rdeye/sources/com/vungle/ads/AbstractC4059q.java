package com.vungle.ads;

import a6.C1653b;
import android.content.Context;
import b9.C2001h;
import b9.InterfaceC2000g;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import p9.InterfaceC5480a;

/* compiled from: BaseAd.kt */
/* renamed from: com.vungle.ads.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4059q implements InterfaceC4043a {
    private final C4045c adConfig;
    private final InterfaceC2000g adInternal$delegate;
    private r adListener;
    private final Context context;
    private String creativeId;
    private final U displayToClickMetric;
    private String eventId;
    private final String placementId;
    private final f0 presentToDisplayMetric;
    private final f0 requestToResponseMetric;
    private final f0 responseToShowMetric;
    private final f0 showToFailMetric;
    private final f0 showToPresentMetric;
    private final InterfaceC2000g signalManager$delegate;
    private com.vungle.ads.internal.signals.c signaledAd;

    /* compiled from: BaseAd.kt */
    /* renamed from: com.vungle.ads.q$a */
    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.a> {
        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.a invoke() {
            AbstractC4059q abstractC4059q = AbstractC4059q.this;
            return abstractC4059q.constructAdInternal$vungle_ads_release(abstractC4059q.getContext());
        }
    }

    /* compiled from: BaseAd.kt */
    /* renamed from: com.vungle.ads.q$b */
    public static final class b implements com.vungle.ads.internal.load.a {
        final /* synthetic */ String $adMarkup;

        public b(String str) {
            this.$adMarkup = str;
        }

        @Override // com.vungle.ads.internal.load.a
        public void onFailure(k0 error) throws Throwable {
            kotlin.jvm.internal.l.f(error, "error");
            AbstractC4059q abstractC4059q = AbstractC4059q.this;
            abstractC4059q.onLoadFailure$vungle_ads_release(abstractC4059q, error);
        }

        @Override // com.vungle.ads.internal.load.a
        public void onSuccess(C1653b advertisement) throws Throwable {
            kotlin.jvm.internal.l.f(advertisement, "advertisement");
            AbstractC4059q.this.onAdLoaded$vungle_ads_release(advertisement);
            AbstractC4059q abstractC4059q = AbstractC4059q.this;
            abstractC4059q.onLoadSuccess$vungle_ads_release(abstractC4059q, this.$adMarkup);
        }
    }

    /* compiled from: ServiceLocator.kt */
    /* renamed from: com.vungle.ads.q$c */
    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.signals.b> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.b, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.signals.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.b.class);
        }
    }

    public AbstractC4059q(Context context, String placementId, C4045c adConfig) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(placementId, "placementId");
        kotlin.jvm.internal.l.f(adConfig, "adConfig");
        this.context = context;
        this.placementId = placementId;
        this.adConfig = adConfig;
        this.adInternal$delegate = C2001h.b(new a());
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.signalManager$delegate = C2001h.a(b9.i.SYNCHRONIZED, new c(context));
        this.requestToResponseMetric = new f0(Sdk$SDKMetric.b.AD_REQUEST_TO_RESPONSE_DURATION_MS);
        this.responseToShowMetric = new f0(Sdk$SDKMetric.b.AD_RESPONSE_TO_SHOW_DURATION_MS);
        this.showToPresentMetric = new f0(Sdk$SDKMetric.b.AD_SHOW_TO_PRESENT_DURATION_MS);
        this.presentToDisplayMetric = new f0(Sdk$SDKMetric.b.AD_PRESENT_TO_DISPLAY_DURATION_MS);
        this.showToFailMetric = new f0(Sdk$SDKMetric.b.AD_SHOW_TO_FAIL_DURATION_MS);
        this.displayToClickMetric = new U(Sdk$SDKMetric.b.AD_DISPLAY_TO_CLICK_DURATION_MS);
    }

    private final void onLoadEnd() throws Throwable {
        this.requestToResponseMetric.markEnd();
        C4055m.logMetric$vungle_ads_release$default(C4055m.INSTANCE, this.requestToResponseMetric, this.placementId, this.creativeId, this.eventId, (String) null, 16, (Object) null);
        this.responseToShowMetric.markStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onLoadFailure$lambda-1, reason: not valid java name */
    public static final void m122onLoadFailure$lambda1(AbstractC4059q this$0, k0 vungleError) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(vungleError, "$vungleError");
        r rVar = this$0.adListener;
        if (rVar != null) {
            rVar.onAdFailedToLoad(this$0, vungleError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onLoadSuccess$lambda-0, reason: not valid java name */
    public static final void m123onLoadSuccess$lambda0(AbstractC4059q this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        r rVar = this$0.adListener;
        if (rVar != null) {
            rVar.onAdLoaded(this$0);
        }
    }

    @Override // com.vungle.ads.InterfaceC4043a
    public Boolean canPlayAd() {
        return Boolean.valueOf(com.vungle.ads.internal.a.canPlayAd$default(getAdInternal$vungle_ads_release(), false, 1, null) == null);
    }

    public abstract com.vungle.ads.internal.a constructAdInternal$vungle_ads_release(Context context);

    public final C4045c getAdConfig() {
        return this.adConfig;
    }

    public final com.vungle.ads.internal.a getAdInternal$vungle_ads_release() {
        return (com.vungle.ads.internal.a) this.adInternal$delegate.getValue();
    }

    public final r getAdListener() {
        return this.adListener;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final U getDisplayToClickMetric$vungle_ads_release() {
        return this.displayToClickMetric;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final f0 getPresentToDisplayMetric$vungle_ads_release() {
        return this.presentToDisplayMetric;
    }

    public final f0 getRequestToResponseMetric$vungle_ads_release() {
        return this.requestToResponseMetric;
    }

    public final f0 getResponseToShowMetric$vungle_ads_release() {
        return this.responseToShowMetric;
    }

    public final f0 getShowToFailMetric$vungle_ads_release() {
        return this.showToFailMetric;
    }

    public final f0 getShowToPresentMetric$vungle_ads_release() {
        return this.showToPresentMetric;
    }

    public final com.vungle.ads.internal.signals.b getSignalManager$vungle_ads_release() {
        return (com.vungle.ads.internal.signals.b) this.signalManager$delegate.getValue();
    }

    public final com.vungle.ads.internal.signals.c getSignaledAd$vungle_ads_release() {
        return this.signaledAd;
    }

    @Override // com.vungle.ads.InterfaceC4043a
    public void load(String str) {
        this.requestToResponseMetric.markStart();
        getAdInternal$vungle_ads_release().loadAd(this.placementId, str, new b(str));
    }

    public void onAdLoaded$vungle_ads_release(C1653b advertisement) {
        kotlin.jvm.internal.l.f(advertisement, "advertisement");
        advertisement.setAdConfig(this.adConfig);
        this.creativeId = advertisement.getCreativeId();
        String strEventId = advertisement.eventId();
        this.eventId = strEventId;
        com.vungle.ads.internal.signals.c cVar = this.signaledAd;
        if (cVar == null) {
            return;
        }
        cVar.setEventId(strEventId);
    }

    public void onLoadFailure$vungle_ads_release(AbstractC4059q baseAd, k0 vungleError) throws Throwable {
        kotlin.jvm.internal.l.f(baseAd, "baseAd");
        kotlin.jvm.internal.l.f(vungleError, "vungleError");
        com.vungle.ads.internal.util.q.INSTANCE.runOnUiThread(new B.a(16, this, vungleError));
        onLoadEnd();
    }

    public void onLoadSuccess$vungle_ads_release(AbstractC4059q baseAd, String str) throws Throwable {
        kotlin.jvm.internal.l.f(baseAd, "baseAd");
        com.vungle.ads.internal.util.q.INSTANCE.runOnUiThread(new C8.a(this, 12));
        onLoadEnd();
    }

    public final void setAdListener(r rVar) {
        this.adListener = rVar;
    }

    public final void setSignaledAd$vungle_ads_release(com.vungle.ads.internal.signals.c cVar) {
        this.signaledAd = cVar;
    }

    public static /* synthetic */ void getRequestToResponseMetric$vungle_ads_release$annotations() {
    }
}
