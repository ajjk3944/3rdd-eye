package com.vungle.ads.internal.ui;

import L0.C0792x;
import L0.Z;
import L0.a0;
import L0.b0;
import a6.C1653b;
import a6.C1656e;
import a6.C1661j;
import a6.m;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.FrameLayout;
import b9.C2001h;
import b9.InterfaceC2000g;
import b9.i;
import c6.C2070c;
import com.vungle.ads.C4044b;
import com.vungle.ads.C4045c;
import com.vungle.ads.C4050h;
import com.vungle.ads.C4063v;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.presenter.j;
import com.vungle.ads.internal.util.k;
import com.vungle.ads.internal.util.n;
import g6.C4393a;
import io.appmetrica.analytics.impl.Oo;
import kotlin.jvm.internal.l;
import p9.InterfaceC5480a;

/* compiled from: AdActivity.kt */
/* loaded from: classes2.dex */
public abstract class a extends Activity {
    public static final C0394a Companion = new C0394a(null);
    public static final String REQUEST_KEY_EVENT_ID_EXTRA = "request_eventId";
    public static final String REQUEST_KEY_EXTRA = "request";
    private static final String TAG = "AdActivity";
    private static C1653b advertisement;
    private static C1656e bidPayload;
    private static com.vungle.ads.internal.presenter.a eventListener;
    private static j presenterDelegate;
    private C4393a mraidAdWidget;
    private com.vungle.ads.internal.presenter.g mraidPresenter;
    private String placementRefId = "";
    private final n ringerModeReceiver = new n();
    private m unclosedAd;

    /* compiled from: AdActivity.kt */
    /* renamed from: com.vungle.ads.internal.ui.a$a, reason: collision with other inner class name */
    public static final class C0394a {
        public /* synthetic */ C0394a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getEventId(Intent intent) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras.getString(a.REQUEST_KEY_EVENT_ID_EXTRA);
                }
            } catch (Exception unused) {
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getPlacement(Intent intent) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras.getString(a.REQUEST_KEY_EXTRA);
                }
            } catch (Exception unused) {
            }
            return null;
        }

        public final Intent createIntent(Context context, String placement, String str) {
            l.f(placement, "placement");
            Intent intent = new Intent(context, (Class<?>) VungleActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            Bundle bundle = new Bundle();
            bundle.putString(a.REQUEST_KEY_EXTRA, placement);
            bundle.putString(a.REQUEST_KEY_EVENT_ID_EXTRA, str);
            intent.putExtras(bundle);
            return intent;
        }

        public final C1653b getAdvertisement$vungle_ads_release() {
            return a.advertisement;
        }

        public final C1656e getBidPayload$vungle_ads_release() {
            return a.bidPayload;
        }

        public final com.vungle.ads.internal.presenter.a getEventListener$vungle_ads_release() {
            return a.eventListener;
        }

        public final j getPresenterDelegate$vungle_ads_release() {
            return a.presenterDelegate;
        }

        public final void setAdvertisement$vungle_ads_release(C1653b c1653b) {
            a.advertisement = c1653b;
        }

        public final void setBidPayload$vungle_ads_release(C1656e c1656e) {
            a.bidPayload = c1656e;
        }

        public final void setEventListener$vungle_ads_release(com.vungle.ads.internal.presenter.a aVar) {
            a.eventListener = aVar;
        }

        public final void setPresenterDelegate$vungle_ads_release(j jVar) {
            a.presenterDelegate = jVar;
        }

        private C0394a() {
        }

        public static /* synthetic */ void getREQUEST_KEY_EVENT_ID_EXTRA$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getREQUEST_KEY_EXTRA$vungle_ads_release$annotations() {
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.signals.b> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.b, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.signals.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.b.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.executor.a> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
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
    public static final class d extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.platform.b> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.b, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.platform.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.platform.b.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class e extends kotlin.jvm.internal.m implements InterfaceC5480a<C2070c.b> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [c6.c$b, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final C2070c.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(C2070c.b.class);
        }
    }

    /* compiled from: AdActivity.kt */
    public static final class f implements C4393a.InterfaceC0460a {
        final /* synthetic */ InterfaceC2000g<com.vungle.ads.internal.signals.b> $signalManager$delegate;

        public f(InterfaceC2000g<com.vungle.ads.internal.signals.b> interfaceC2000g) {
            this.$signalManager$delegate = interfaceC2000g;
        }

        @Override // g6.C4393a.InterfaceC0460a
        public void close() {
            m mVar = a.this.unclosedAd;
            if (mVar != null) {
                a.m104onCreate$lambda2(this.$signalManager$delegate).removeUnclosedAd(mVar);
            }
            a.this.finish();
        }
    }

    /* compiled from: AdActivity.kt */
    public static final class g implements C4393a.d {
        public g() {
        }

        @Override // g6.C4393a.d
        public boolean onTouch(MotionEvent motionEvent) {
            com.vungle.ads.internal.presenter.g mraidPresenter$vungle_ads_release = a.this.getMraidPresenter$vungle_ads_release();
            if (mraidPresenter$vungle_ads_release == null) {
                return false;
            }
            mraidPresenter$vungle_ads_release.onViewTouched(motionEvent);
            return false;
        }
    }

    /* compiled from: AdActivity.kt */
    public static final class h implements C4393a.e {
        public h() {
        }

        @Override // g6.C4393a.e
        public void setOrientation(int i) {
            a.this.setRequestedOrientation(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideSystemUi() {
        Z a0Var;
        Window window = getWindow();
        C0792x c0792x = new C0792x(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            b0 b0Var = new b0(window.getInsetsController(), c0792x);
            b0Var.f3888c = window;
            a0Var = b0Var;
        } else {
            a0Var = i >= 26 ? new a0(window, c0792x) : new Z(window, c0792x);
        }
        a0Var.z();
        a0Var.o(7);
    }

    private final void onConcurrentPlaybackError(String str) {
        C4063v c4063v = new C4063v();
        com.vungle.ads.internal.presenter.a aVar = eventListener;
        if (aVar != null) {
            aVar.onError(c4063v, str);
        }
        c4063v.setPlacementId(this.placementRefId);
        C1653b c1653b = advertisement;
        c4063v.setCreativeId(c1653b != null ? c1653b.getCreativeId() : null);
        C1653b c1653b2 = advertisement;
        c4063v.setEventId(c1653b2 != null ? c1653b2.eventId() : null);
        c4063v.logErrorNoReturnValue$vungle_ads_release();
        k.Companion.e(TAG, "onConcurrentPlaybackError: " + c4063v.getLocalizedMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-2, reason: not valid java name */
    public static final com.vungle.ads.internal.signals.b m104onCreate$lambda2(InterfaceC2000g<com.vungle.ads.internal.signals.b> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: onCreate$lambda-6, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m105onCreate$lambda6(InterfaceC2000g<? extends com.vungle.ads.internal.executor.a> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: onCreate$lambda-7, reason: not valid java name */
    private static final com.vungle.ads.internal.platform.b m106onCreate$lambda7(InterfaceC2000g<? extends com.vungle.ads.internal.platform.b> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: onCreate$lambda-8, reason: not valid java name */
    private static final C2070c.b m107onCreate$lambda8(InterfaceC2000g<C2070c.b> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    public boolean canRotate$vungle_ads_release() {
        return false;
    }

    public final C4393a getMraidAdWidget$vungle_ads_release() {
        return this.mraidAdWidget;
    }

    public final com.vungle.ads.internal.presenter.g getMraidPresenter$vungle_ads_release() {
        return this.mraidPresenter;
    }

    public final String getPlacementRefId$vungle_ads_release() {
        return this.placementRefId;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.vungle.ads.internal.presenter.g gVar = this.mraidPresenter;
        if (gVar != null) {
            gVar.handleExit();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        l.f(newConfig, "newConfig");
        try {
            super.onConfigurationChanged(newConfig);
            int i = newConfig.orientation;
            if (i == 2) {
                k.Companion.d(TAG, "landscape");
            } else if (i == 1) {
                k.Companion.d(TAG, "portrait");
            }
            com.vungle.ads.internal.presenter.g gVar = this.mraidPresenter;
            if (gVar != null) {
                gVar.onViewConfigurationChanged();
            }
        } catch (Exception e4) {
            k.Companion.e(TAG, "onConfigurationChanged: " + e4.getLocalizedMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.String, kotlin.jvm.internal.g] */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String watermark$vungle_ads_release;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(16777216, 16777216);
        C0394a c0394a = Companion;
        Intent intent = getIntent();
        l.e(intent, "intent");
        String strValueOf = String.valueOf(c0394a.getPlacement(intent));
        this.placementRefId = strValueOf;
        C1653b c1653b = advertisement;
        com.vungle.ads.internal.f fVar = com.vungle.ads.internal.f.INSTANCE;
        C1661j placement = fVar.getPlacement(strValueOf);
        if (placement == null || c1653b == null) {
            com.vungle.ads.internal.presenter.a aVar = eventListener;
            if (aVar != null) {
                aVar.onError(new C4050h(), this.placementRefId);
            }
            finish();
            return;
        }
        getWindow().getDecorView().setBackgroundColor(-16777216);
        try {
            C4393a c4393a = new C4393a(this);
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            i iVar = i.SYNCHRONIZED;
            InterfaceC2000g interfaceC2000gA = C2001h.a(iVar, new b(this));
            Intent intent2 = getIntent();
            l.e(intent2, "intent");
            String eventId = c0394a.getEventId(intent2);
            m mVar = eventId != null ? new m(eventId, (String) str, 2, (kotlin.jvm.internal.g) str) : null;
            this.unclosedAd = mVar;
            if (mVar != null) {
                m104onCreate$lambda2(interfaceC2000gA).recordUnclosedAd(mVar);
            }
            c4393a.setCloseDelegate(new f(interfaceC2000gA));
            c4393a.setOnViewTouchListener(new g());
            c4393a.setOrientationDelegate(new h());
            InterfaceC2000g interfaceC2000gA2 = C2001h.a(iVar, new c(this));
            InterfaceC2000g interfaceC2000gA3 = C2001h.a(iVar, new d(this));
            com.vungle.ads.internal.ui.e eVar = new com.vungle.ads.internal.ui.e(c1653b, placement, m105onCreate$lambda6(interfaceC2000gA2).getOffloadExecutor(), m104onCreate$lambda2(interfaceC2000gA), m106onCreate$lambda7(interfaceC2000gA3));
            C2070c c2070cMake = m107onCreate$lambda8(C2001h.a(iVar, new e(this))).make(fVar.omEnabled() && c1653b.omEnabled());
            com.vungle.ads.internal.executor.i jobExecutor = m105onCreate$lambda6(interfaceC2000gA2).getJobExecutor();
            eVar.setWebViewObserver(c2070cMake);
            this.ringerModeReceiver.setWebClient(eVar);
            com.vungle.ads.internal.presenter.g gVar = new com.vungle.ads.internal.presenter.g(c4393a, c1653b, placement, eVar, jobExecutor, c2070cMake, bidPayload, m106onCreate$lambda7(interfaceC2000gA3));
            gVar.setEventListener(eventListener);
            gVar.setPresenterDelegate$vungle_ads_release(presenterDelegate);
            gVar.prepare();
            setContentView(c4393a, c4393a.getLayoutParams());
            C4045c adConfig = c1653b.getAdConfig();
            if (adConfig != null && (watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release()) != null) {
                com.vungle.ads.internal.ui.f fVar2 = new com.vungle.ads.internal.ui.f(this, watermark$vungle_ads_release);
                ((FrameLayout) getWindow().getDecorView().findViewById(R.id.content)).addView(fVar2);
                fVar2.bringToFront();
            }
            this.mraidAdWidget = c4393a;
            this.mraidPresenter = gVar;
        } catch (InstantiationException unused) {
            com.vungle.ads.internal.presenter.a aVar2 = eventListener;
            if (aVar2 != null) {
                C4044b c4044b = new C4044b();
                c4044b.setPlacementId$vungle_ads_release(this.placementRefId);
                C1653b c1653b2 = advertisement;
                c4044b.setEventId$vungle_ads_release(c1653b2 != null ? c1653b2.eventId() : null);
                C1653b c1653b3 = advertisement;
                c4044b.setCreativeId$vungle_ads_release(c1653b3 != null ? c1653b3.getCreativeId() : 0);
                aVar2.onError(c4044b.logError$vungle_ads_release(), this.placementRefId);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        com.vungle.ads.internal.presenter.g gVar = this.mraidPresenter;
        if (gVar != null) {
            gVar.detach((isChangingConfigurations() ? 1 : 0) | 2);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        l.f(intent, "intent");
        super.onNewIntent(intent);
        C0394a c0394a = Companion;
        Intent intent2 = getIntent();
        l.e(intent2, "getIntent()");
        String placement = c0394a.getPlacement(intent2);
        String placement2 = c0394a.getPlacement(intent);
        Intent intent3 = getIntent();
        l.e(intent3, "getIntent()");
        String eventId = c0394a.getEventId(intent3);
        String eventId2 = c0394a.getEventId(intent);
        if ((placement == null || placement2 == null || placement.equals(placement2)) && (eventId == null || eventId2 == null || eventId.equals(eventId2))) {
            return;
        }
        k.Companion.d(TAG, Oo.f("Tried to play another placement ", placement2, " while playing ", placement));
        onConcurrentPlaybackError(placement2);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        unregisterReceiver(this.ringerModeReceiver);
        k.Companion.d(TAG, "unregisterReceiver(): " + this.ringerModeReceiver.hashCode());
        com.vungle.ads.internal.presenter.g gVar = this.mraidPresenter;
        if (gVar != null) {
            gVar.stop();
        }
    }

    @Override // android.app.Activity
    public void onResume() throws Throwable {
        super.onResume();
        hideSystemUi();
        registerReceiver(this.ringerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        k.Companion.d(TAG, "registerReceiver(): " + this.ringerModeReceiver.hashCode());
        com.vungle.ads.internal.presenter.g gVar = this.mraidPresenter;
        if (gVar != null) {
            gVar.start();
        }
    }

    public final void setMraidAdWidget$vungle_ads_release(C4393a c4393a) {
        this.mraidAdWidget = c4393a;
    }

    public final void setMraidPresenter$vungle_ads_release(com.vungle.ads.internal.presenter.g gVar) {
        this.mraidPresenter = gVar;
    }

    public final void setPlacementRefId$vungle_ads_release(String str) {
        l.f(str, "<set-?>");
        this.placementRefId = str;
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (canRotate$vungle_ads_release()) {
            super.setRequestedOrientation(i);
        }
    }

    public static /* synthetic */ void getMraidAdWidget$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidPresenter$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getPlacementRefId$vungle_ads_release$annotations() {
    }
}
