package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.k;
import com.applovin.impl.c2;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.e8;
import com.applovin.impl.f2;
import com.applovin.impl.f4;
import com.applovin.impl.h4;
import com.applovin.impl.l2;
import com.applovin.impl.n1;
import com.applovin.impl.n7;
import com.applovin.impl.o8;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t4;
import com.applovin.impl.v2;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a implements AppLovinCommunicatorSubscriber, AppLovinBroadcastManager.Receiver {
    private volatile AppLovinAdLoadListener A;
    private volatile AppLovinAdDisplayListener B;
    private volatile AppLovinAdViewEventListener C;
    private volatile AppLovinAdClickListener D;

    /* renamed from: a, reason: collision with root package name */
    private Context f3615a;

    /* renamed from: b, reason: collision with root package name */
    private ViewGroup f3616b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.impl.sdk.k f3617c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAdServiceImpl f3618d;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.o f3619e;

    /* renamed from: f, reason: collision with root package name */
    private AppLovinCommunicator f3620f;
    private b g;

    /* renamed from: i, reason: collision with root package name */
    private AppLovinAdSize f3622i;
    private String j;

    /* renamed from: k, reason: collision with root package name */
    private u.p f3623k;

    /* renamed from: l, reason: collision with root package name */
    private com.applovin.impl.adview.c f3624l;

    /* renamed from: m, reason: collision with root package name */
    private e f3625m;

    /* renamed from: n, reason: collision with root package name */
    private com.applovin.impl.adview.b f3626n;

    /* renamed from: o, reason: collision with root package name */
    private WebView f3627o;

    /* renamed from: p, reason: collision with root package name */
    private k f3628p;

    /* renamed from: q, reason: collision with root package name */
    private Runnable f3629q;

    /* renamed from: r, reason: collision with root package name */
    private Runnable f3630r;

    /* renamed from: h, reason: collision with root package name */
    private final Map f3621h = a0.g.r();

    /* renamed from: s, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.b f3631s = null;

    /* renamed from: t, reason: collision with root package name */
    private volatile AppLovinAd f3632t = null;

    /* renamed from: u, reason: collision with root package name */
    private f f3633u = null;

    /* renamed from: v, reason: collision with root package name */
    private f f3634v = null;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicReference f3635w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f3636x = new AtomicBoolean();

    /* renamed from: y, reason: collision with root package name */
    private volatile boolean f3637y = false;

    /* renamed from: z, reason: collision with root package name */
    private volatile boolean f3638z = false;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.applovin.impl.adview.a$a, reason: collision with other inner class name */
    public class C0004a extends t4 {
        public C0004a() {
        }

        @Override // com.applovin.impl.t4
        public Map a() {
            return CollectionUtils.hashMap("name", "AdViewController:GAWebView");
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface b {
        void a(a aVar);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f3626n != null) {
                a.this.f3626n.setVisibility(8);
            }
        }

        public /* synthetic */ c(a aVar, C0004a c0004a) {
            this();
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class d implements Runnable {

        /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
        /* renamed from: com.applovin.impl.adview.a$d$a, reason: collision with other inner class name */
        public class C0005a implements k.a {
            public C0005a() {
            }

            @Override // com.applovin.impl.adview.k.a
            public void a() {
                a.this.f3626n.addView(a.this.f3628p, new ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.k.a
            public void b() {
                com.applovin.impl.sdk.o unused = a.this.f3619e;
                if (com.applovin.impl.sdk.o.a()) {
                    a.this.f3619e.b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f3631s != null) {
                if (a.this.f3626n == null) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to render advertisement for ad #" + a.this.f3631s.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    t2.a(a.this.C, a.this.f3631s, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "renderTask");
                    CollectionUtils.putStringIfValid("error_message", "Ad view failed to render due to null adView", mapHashMap);
                    a.this.f3617c.g().a(d2.F, a.this.f3631s, mapHashMap);
                    return;
                }
                a.this.v();
                com.applovin.impl.sdk.o unused = a.this.f3619e;
                if (com.applovin.impl.sdk.o.a()) {
                    a.this.f3619e.a("AppLovinAdView", "Rendering advertisement ad for #" + a.this.f3631s.getAdIdNumber() + "...");
                }
                a.b(a.this.f3626n, a.this.f3631s.getSize());
                if (a.this.f3628p != null) {
                    e8.c(a.this.f3628p);
                    a.this.f3628p = null;
                }
                c2 c2Var = new c2(a.this.f3621h, a.this.f3617c);
                if (c2Var.c()) {
                    a.this.f3628p = new k(c2Var, a.this.f3615a);
                    a.this.f3628p.a(new C0005a());
                }
                a.this.f3626n.setAdHtmlLoaded(false);
                a.this.f3626n.a(a.this.f3631s);
                if (a.this.f3631s.getSize() == AppLovinAdSize.INTERSTITIAL || a.this.f3638z) {
                    return;
                }
                a.this.f3631s.setHasShown(true);
            }
        }

        public /* synthetic */ d(a aVar, C0004a c0004a) {
            this();
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class e implements AppLovinAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        private final a f3643a;

        public e(a aVar, com.applovin.impl.sdk.k kVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f3643a = aVar;
        }

        private a a() {
            return this.f3643a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(appLovinAd);
            } else {
                com.applovin.impl.sdk.o.h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i4) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(i4);
            }
        }
    }

    private void E() {
        if (this.f3619e != null && com.applovin.impl.sdk.o.a() && com.applovin.impl.sdk.o.a()) {
            this.f3619e.a("AppLovinAdView", "Destroying...");
        }
        o8.b(this.f3626n);
        this.f3626n = null;
        o8.b(this.f3627o);
        this.f3627o = null;
        this.f3623k = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.C = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f3638z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        com.applovin.impl.sdk.ad.b bVar = this.f3631s;
        v2 v2Var = new v2();
        v2Var.a().a(bVar).a(i());
        if (!n7.a(bVar.getSize())) {
            v2Var.a().a("Fullscreen Ad Properties").b(bVar);
        }
        v2Var.a(this.f3617c);
        v2Var.a();
        if (com.applovin.impl.sdk.o.a()) {
            this.f3619e.a("AppLovinAdView", v2Var.toString());
        }
    }

    private void x() {
        if (this.f3631s.P0()) {
            int iC = this.f3617c.p().c();
            if (com.applovin.impl.sdk.i.a(iC)) {
                this.f3626n.a("javascript:al_muteSwitchOn();");
            } else if (iC == 2) {
                this.f3626n.a("javascript:al_muteSwitchOff();");
            }
        }
    }

    private void y() {
        if (n7.a(this.f3622i)) {
            if (((Boolean) this.f3617c.a(x4.E1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            if (((Boolean) this.f3617c.a(x4.F1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
            }
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
            if (((Boolean) this.f3617c.a(x4.G1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
            }
            if (((Boolean) this.f3617c.a(x4.H1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
            }
        }
    }

    public void A() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f3619e.a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.g;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void B() {
        y();
        if (this.f3631s != null && this.f3631s.r0()) {
            com.applovin.impl.g.a(this.f3626n, this.f3617c);
        }
        b("javascript:al_onAttachedToWindow();");
    }

    public void C() {
        if (this.f3637y) {
            if (this.f3631s == null || !this.f3631s.Z0()) {
                t2.b(this.B, this.f3631s);
            }
            if (this.f3631s != null && this.f3631s.isOpenMeasurementEnabled() && n7.a(this.f3631s.getSize())) {
                this.f3631s.getAdEventTracker().f();
            }
            if (this.f3626n != null && this.f3633u != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f3619e.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                c();
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f3619e.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
            b("javascript:al_onDetachedFromWindow();");
        }
    }

    public void D() {
        if (!this.f3637y || this.f3638z) {
            return;
        }
        this.f3638z = true;
    }

    public void F() {
        if (this.f3637y) {
            AppLovinAd appLovinAd = (AppLovinAd) this.f3635w.getAndSet(null);
            if (appLovinAd != null) {
                c(appLovinAd);
            }
            this.f3638z = false;
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "a";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new o(this, 4));
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        switch (action) {
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                b(action, map);
                break;
            case "com.applovin.application_paused":
                m();
                break;
            case "com.applovin.application_resumed":
                n();
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                d(action, map);
                break;
        }
    }

    public void w() {
        if ((this.f3615a instanceof n1) && this.f3631s != null && this.f3631s.K() == b.EnumC0019b.DISMISS) {
            ((n1) this.f3615a).dismiss("postitial_click");
        }
    }

    public void z() {
        if (this.f3633u != null || this.f3634v != null) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f3619e.a("AppLovinAdView", "Ad: " + this.f3631s + " closed.");
        }
        a(this.f3630r);
        t2.b(this.B, this.f3631s);
        this.f3631s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int iApplyDimension = -1;
        int iApplyDimension2 = (appLovinAdSize == appLovinAdSize2 || appLovinAdSize == AppLovinAdSize.BANNER) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        if (appLovinAdSize != appLovinAdSize2 && appLovinAdSize != AppLovinAdSize.BANNER) {
            iApplyDimension = appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = iApplyDimension2;
        layoutParams.height = iApplyDimension;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    private void c() {
        a(new o(this, 2));
    }

    private void m() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f3619e.a("AppLovinAdView", "handleApplicationPaused()");
        }
        b("javascript:al_onAppPaused();");
    }

    private void n() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f3619e.a("AppLovinAdView", "handleApplicationResumed()");
        }
        b("javascript:al_onAppResumed();");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f3626n.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        com.applovin.impl.adview.b bVar;
        d();
        if (this.f3616b == null || (bVar = this.f3626n) == null || bVar.getParent() != null) {
            return;
        }
        this.f3616b.addView(this.f3626n);
        b(this.f3626n, this.f3631s.getSize());
        if (this.f3631s.isOpenMeasurementEnabled()) {
            this.f3631s.getAdEventTracker().a((View) this.f3626n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        if (this.f3626n != null && this.f3633u != null) {
            a();
        }
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        if (this.f3633u != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f3619e.a("AppLovinAdView", "Detaching expanded ad: " + this.f3633u.b());
            }
            this.f3634v = this.f3633u;
            this.f3633u = null;
            a(this.f3622i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        com.applovin.impl.sdk.ad.a aVarB;
        f fVar = this.f3634v;
        if (fVar == null && this.f3633u == null) {
            return;
        }
        if (fVar != null) {
            aVarB = fVar.b();
            this.f3634v.dismiss();
            this.f3634v = null;
        } else {
            aVarB = this.f3633u.b();
            this.f3633u.dismiss();
            this.f3633u = null;
        }
        t2.a(this.C, aVarB, (AppLovinAdView) this.f3616b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        f().loadUrl("chrome://crash");
    }

    public AppLovinAdViewEventListener e() {
        return this.C;
    }

    public com.applovin.impl.adview.b f() {
        return this.f3626n;
    }

    public com.applovin.impl.sdk.ad.b g() {
        return this.f3631s;
    }

    public u.p h() {
        return this.f3623k;
    }

    public AppLovinAdView i() {
        return (AppLovinAdView) this.f3616b;
    }

    public com.applovin.impl.sdk.k j() {
        return this.f3617c;
    }

    public AppLovinAdSize k() {
        return this.f3622i;
    }

    public String l() {
        return this.j;
    }

    public void u() {
        if (this.f3617c == null || this.f3625m == null || this.f3615a == null || !this.f3637y) {
            com.applovin.impl.sdk.o.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f3618d.loadNextAd(this.j, this.f3622i, this.f3625m);
        }
    }

    private void d() {
        a(new o(this, 0));
    }

    public void c(int i4) {
        String strA = e8.a(i4);
        if (com.applovin.impl.sdk.o.a()) {
            this.f3619e.a("AppLovinAdView", "onWindowVisibilityChanged( " + strA + " )");
        }
        b(d.h.t("javascript:al_onWindowVisibilityChanged( ", strA, " );"));
    }

    private void d(String str, Map map) {
        a(o8.d(str, map));
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.A = appLovinAdLoadListener;
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.B = appLovinAdDisplayListener;
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.C = appLovinAdViewEventListener;
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.D = appLovinAdClickListener;
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize != null) {
            this.f3617c = kVar;
            this.f3618d = kVar.k();
            this.f3619e = kVar.O();
            this.f3620f = AppLovinCommunicator.getInstance(context);
            this.f3622i = appLovinAdSize;
            this.j = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f3615a = context;
            this.f3616b = appLovinAdView;
            this.f3624l = new com.applovin.impl.adview.c(this, kVar);
            C0004a c0004a = null;
            this.f3630r = new c(this, c0004a);
            this.f3629q = new d(this, c0004a);
            this.f3625m = new e(this, kVar);
            a(appLovinAdSize);
            return;
        }
        throw new IllegalArgumentException("No ad size specified");
    }

    public void c(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void c(WebView webView) {
        a(webView, (String) null);
    }

    private void c(String str, Map map) {
        a(o8.c(str, map));
    }

    public void b() {
        a(new o(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        this.f3631s.getAdEventTracker().c(webView);
        k kVar = this.f3628p;
        if (kVar != null && kVar.a()) {
            f4 adEventTracker = this.f3631s.getAdEventTracker();
            k kVar2 = this.f3628p;
            adEventTracker.b(webView, Collections.singletonList(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        } else {
            this.f3631s.getAdEventTracker().a((View) webView);
        }
        this.f3631s.getAdEventTracker().h();
        this.f3631s.getAdEventTracker().g();
    }

    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.f3624l, this.f3617c, this.f3615a);
            this.f3626n = bVar;
            bVar.setBackgroundColor(0);
            this.f3626n.setWillNotCacheDrawing(false);
            this.f3616b.setBackgroundColor(0);
            this.f3616b.addView(this.f3626n);
            b(this.f3626n, appLovinAdSize);
            if (!this.f3637y) {
                a(this.f3630r);
            }
            a(new o(this, 5));
            this.f3637y = true;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("AppLovinAdView", "Failed to initialize AdWebView", th2);
            this.f3617c.D().a("AppLovinAdView", "initAdWebView", th2);
            this.f3636x.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MotionEvent motionEvent) {
        a aVar;
        if (this.f3633u == null && (this.f3631s instanceof com.applovin.impl.sdk.ad.a) && this.f3626n != null) {
            com.applovin.impl.sdk.ad.a aVar2 = (com.applovin.impl.sdk.ad.a) this.f3631s;
            Context context = this.f3615a;
            Activity activityB = context instanceof Activity ? (Activity) context : e8.b(this.f3626n, this.f3617c);
            if (activityB != null && !activityB.isFinishing()) {
                ViewGroup viewGroup = this.f3616b;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f3626n);
                }
                f fVar = new f(aVar2, this.f3626n, activityB, this.f3617c);
                this.f3633u = fVar;
                fVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.q
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f3712a.a(dialogInterface);
                    }
                });
                this.f3633u.show();
                t2.c(this.C, this.f3631s, (AppLovinAdView) this.f3616b);
                if (this.f3631s.isOpenMeasurementEnabled()) {
                    this.f3631s.getAdEventTracker().a((View) this.f3633u.c());
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
            Uri uriE1 = aVar2.e1();
            if (uriE1 != null) {
                aVar = this;
                this.f3618d.trackAndLaunchClick(aVar2, i(), aVar, uriE1, motionEvent);
            } else {
                aVar = this;
            }
            aVar.f3626n.a("javascript:al_onFailedExpand();");
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = com.applovin.impl.s.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.a(), appLovinAdSize2, str, context);
            if (com.applovin.impl.s.b(attributeSet)) {
                u();
            }
        }
    }

    public void b(AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f3638z) {
                c(appLovinAd);
            } else {
                this.f3635w.set(appLovinAd);
                if (com.applovin.impl.sdk.o.a()) {
                    this.f3619e.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new aj.d(5, this, appLovinAd));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f3619e.b("AppLovinAdView", "No provided when to the view controller");
        }
        b(-1);
    }

    public void a(String str, Object obj) {
        this.f3621h.put(str, obj);
    }

    public void a(boolean z3) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f3619e.a("AppLovinAdView", "onWindowFocusChanged( " + z3 + " )");
        }
        b("javascript:al_onWindowFocusChanged( " + z3 + " );");
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            n7.b(appLovinAd, this.f3617c);
            if (this.f3637y) {
                if (appLovinAd.getSize() != AppLovinAdSize.INTERSTITIAL) {
                    Map mapA = f2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "renderAd", mapA);
                    this.f3617c.g().d(d2.C, mapA);
                }
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) n7.a(appLovinAd, this.f3617c);
                if (bVar == null) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    t2.a(this.B, "Unable to retrieve the loaded ad");
                    Map mapA2 = f2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "noAdToRender", mapA2);
                    CollectionUtils.putStringIfValid("error_message", "Unable to retrieve the loaded ad", mapA2);
                    this.f3617c.g().d(d2.F, mapA2);
                    return;
                }
                if (bVar == this.f3631s) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
                    if (((Boolean) this.f3617c.a(x4.I1)).booleanValue()) {
                        if (this.B instanceof l2) {
                            t2.a(this.B, "Attempting to show ad again");
                        } else if (!n7.c(this.f3617c)) {
                            this.f3617c.g().a(d2.S0, bVar, CollectionUtils.hashMap("source", "attemptingAdReRender"));
                        } else {
                            throw new IllegalStateException("Attempting to show ad again");
                        }
                    }
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "attemptingAdReRender");
                    CollectionUtils.putStringIfValid("error_message", "Attempting to show ad again", mapHashMap);
                    this.f3617c.g().a(d2.F, bVar, mapHashMap);
                    return;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f3619e.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
                }
                t2.b(this.B, this.f3631s);
                if (this.f3631s != null && this.f3631s.isOpenMeasurementEnabled()) {
                    this.f3631s.getAdEventTracker().f();
                }
                this.f3635w.set(null);
                this.f3632t = null;
                this.f3631s = bVar;
                if (this.f3631s.isCustomTabsEnabled()) {
                    this.f3623k = this.f3617c.z().a(this);
                    this.f3617c.z().b(this.f3631s.getCustomTabsWarmupUrls(), this.f3623k);
                }
                if (!this.f3638z && n7.a(this.f3622i)) {
                    this.f3617c.k().trackImpression(bVar);
                }
                if (this.f3633u != null) {
                    c();
                }
                a(this.f3629q);
                return;
            }
            com.applovin.impl.sdk.o.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i4) {
        if (!this.f3638z) {
            a(this.f3630r);
        }
        a(new p(this, i4, 0));
    }

    private void b(String str) {
        if (((Boolean) this.f3617c.a(x4.E1)).booleanValue()) {
            a(str);
        }
    }

    private void b(String str, Map map) {
        a(o8.b(str, map));
    }

    public void b(Uri uri) {
        if (this.f3631s != null && this.f3631s.w0() && this.f3627o == null) {
            String queryParameter = uri.getQueryParameter("tracking_id");
            if (TextUtils.isEmpty(queryParameter)) {
                this.f3617c.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f3617c.O().b("AppLovinAdView", "Invalid tracking id. Cannot initialize GA");
                    return;
                }
                return;
            }
            WebView webView = new WebView(this.f3615a);
            this.f3627o = webView;
            webView.setWebViewClient(new C0004a());
            this.f3627o.getSettings().setJavaScriptEnabled(true);
            this.f3627o.loadDataWithBaseURL((String) this.f3617c.a(x4.f6060i7), "<html><head><link rel=\"icon\" href=\"data:,\"><G-SCRIPT_TAG></head><body></body></html>".replace("<G-SCRIPT_TAG>", "<script src='https://www.googletagmanager.com/gtag/js?id=<G-TRACKING_ID>'></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', '<G-TRACKING_ID>')</script>".replace("<G-TRACKING_ID>", queryParameter)), "text/html", "UTF-8", null);
        }
    }

    public void a(WebView webView, String str) {
        if (this.f3631s == null) {
            return;
        }
        a(new t(webView, 2));
        if (!((Boolean) this.f3617c.a(x4.f6184y6)).booleanValue() || (str != null && str.startsWith(this.f3631s.k()))) {
            try {
                if (this.f3631s != this.f3632t) {
                    this.f3632t = this.f3631s;
                    x();
                    this.f3626n.setAdHtmlLoaded(true);
                    if (this.B != null) {
                        this.f3617c.y().d(this.f3631s);
                        if (this.f3631s.s0()) {
                            this.f3617c.g().a(d2.E, this.f3631s, CollectionUtils.hashMap("details", f2.b(this.f3631s)));
                        } else {
                            this.f3617c.g().a(d2.D, this.f3631s, CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f3631s.z())));
                            t2.a(this.B, this.f3631s);
                        }
                        if (this.f3631s.Q0()) {
                            String str2 = (String) this.f3617c.p0().a(z4.T, "");
                            JSONObject jSONObject = new JSONObject();
                            JsonUtils.putString(jSONObject, "template_browser_package_name", str2);
                            this.f3626n.a("javascript:al_onAdViewRendered(" + jSONObject + ");");
                        } else {
                            this.f3626n.a("javascript:al_onAdViewRendered();");
                        }
                        if (this.f3631s.s0()) {
                            this.f3626n.a("javascript:al_onAdRestored( '" + this.f3631s.X() + "' );");
                        }
                    }
                    if ((this.f3631s instanceof com.applovin.impl.sdk.ad.a) && this.f3631s.isOpenMeasurementEnabled()) {
                        this.f3617c.q0().a(new r6(this.f3617c, "StartOMSDK", new aj.d(7, this, webView)), d6.b.OTHER, 500L);
                    }
                }
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("AppLovinAdView", "Exception while notifying ad display listener", th2);
                com.applovin.impl.sdk.k kVar = this.f3617c;
                if (kVar != null) {
                    kVar.D().a("AppLovinAdView", "onAdHtmlLoaded", th2);
                }
            }
        }
    }

    public void a(MotionEvent motionEvent) {
        a(new aj.d(6, this, motionEvent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        a();
    }

    public void a() {
        a(new o(this, 1));
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent) {
        a aVar;
        com.applovin.impl.sdk.ad.b bVar2;
        if (appLovinAdView != null) {
            aVar = this;
            bVar2 = bVar;
            this.f3618d.trackAndLaunchClick(bVar2, appLovinAdView, aVar, uri, motionEvent);
        } else {
            aVar = this;
            bVar2 = bVar;
            if (com.applovin.impl.sdk.o.a()) {
                aVar.f3619e.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
            }
        }
        t2.a(aVar.D, bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f3636x.compareAndSet(true, false)) {
            a(this.f3622i);
        }
        try {
            if (this.A != null) {
                this.A.adReceived(appLovinAd);
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Exception while running ad load callback: " + th2.getMessage());
            com.applovin.impl.sdk.k kVar = this.f3617c;
            if (kVar != null) {
                kVar.D().a("AppLovinAdView", "notifyAdLoadedCallback", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i4) {
        try {
            if (this.A != null) {
                this.A.failedToReceiveAd(i4);
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("AppLovinAdView", "Exception while running app load callback", th2);
            com.applovin.impl.sdk.k kVar = this.f3617c;
            if (kVar != null) {
                kVar.D().a("AppLovinAdView", "notifyAdLoadFailedCallback", th2);
            }
        }
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(b bVar) {
        this.g = bVar;
    }

    private void a(String str, Map map) {
        a(o8.a(str, map));
    }

    private void a(String str) {
        if (this.f3631s == null || this.f3626n == null || !n7.a(this.f3631s.getSize()) || !StringUtils.isValidString(str)) {
            return;
        }
        this.f3626n.a(str);
    }

    public void a(Uri uri) {
        if (this.f3631s == null || !this.f3631s.w0()) {
            return;
        }
        if (this.f3627o == null) {
            this.f3617c.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f3617c.O().a("AppLovinAdView", "GA is not initialized. Cannot fire GA event");
                return;
            }
            return;
        }
        String queryParameter = uri.getQueryParameter("event_name");
        String queryParameter2 = uri.getQueryParameter("event_params_json");
        if (TextUtils.isEmpty(queryParameter)) {
            this.f3617c.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f3617c.O().a("AppLovinAdView", "Invalid GA event name. Cannot fire GA event");
                return;
            }
            return;
        }
        a(new b5.e(this, queryParameter2, queryParameter, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        String strT;
        if (StringUtils.isValidString(str)) {
            strT = a0.g.n("gtag('event', '", str2, "', ", str, ");");
        } else {
            strT = d.h.t("gtag('event', '", str2, "')");
        }
        if (((Boolean) this.f3617c.a(x4.Q2)).booleanValue()) {
            o8.a(this.f3627o, strT, this.f3617c);
        } else {
            o8.a(this.f3627o, strT);
        }
    }
}
