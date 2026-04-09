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
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements AppLovinCommunicatorSubscriber, AppLovinBroadcastManager.Receiver {
    private volatile AppLovinAdLoadListener A;
    private volatile AppLovinAdDisplayListener B;
    private volatile AppLovinAdViewEventListener C;
    private volatile AppLovinAdClickListener D;

    /* renamed from: a, reason: collision with root package name */
    private Context f5413a;

    /* renamed from: b, reason: collision with root package name */
    private ViewGroup f5414b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.impl.sdk.k f5415c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAdServiceImpl f5416d;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.o f5417e;

    /* renamed from: f, reason: collision with root package name */
    private AppLovinCommunicator f5418f;

    /* renamed from: g, reason: collision with root package name */
    private b f5419g;

    /* renamed from: i, reason: collision with root package name */
    private AppLovinAdSize f5421i;

    /* renamed from: j, reason: collision with root package name */
    private String f5422j;

    /* renamed from: k, reason: collision with root package name */
    private n.e f5423k;

    /* renamed from: l, reason: collision with root package name */
    private com.applovin.impl.adview.c f5424l;

    /* renamed from: m, reason: collision with root package name */
    private e f5425m;

    /* renamed from: n, reason: collision with root package name */
    private com.applovin.impl.adview.b f5426n;

    /* renamed from: o, reason: collision with root package name */
    private WebView f5427o;

    /* renamed from: p, reason: collision with root package name */
    private k f5428p;

    /* renamed from: q, reason: collision with root package name */
    private Runnable f5429q;

    /* renamed from: r, reason: collision with root package name */
    private Runnable f5430r;

    /* renamed from: h, reason: collision with root package name */
    private final Map f5420h = Collections.synchronizedMap(new HashMap());

    /* renamed from: s, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.b f5431s = null;

    /* renamed from: t, reason: collision with root package name */
    private volatile AppLovinAd f5432t = null;

    /* renamed from: u, reason: collision with root package name */
    private f f5433u = null;

    /* renamed from: v, reason: collision with root package name */
    private f f5434v = null;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicReference f5435w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f5436x = new AtomicBoolean();

    /* renamed from: y, reason: collision with root package name */
    private volatile boolean f5437y = false;

    /* renamed from: z, reason: collision with root package name */
    private volatile boolean f5438z = false;

    /* renamed from: com.applovin.impl.adview.a$a, reason: collision with other inner class name */
    public class C0068a extends t4 {
        public C0068a() {
        }

        @Override // com.applovin.impl.t4
        public Map a() {
            return CollectionUtils.hashMap("name", "AdViewController:GAWebView");
        }
    }

    public interface b {
        void a(a aVar);
    }

    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f5426n != null) {
                a.this.f5426n.setVisibility(8);
            }
        }

        public /* synthetic */ c(a aVar, C0068a c0068a) {
            this();
        }
    }

    public class d implements Runnable {

        /* renamed from: com.applovin.impl.adview.a$d$a, reason: collision with other inner class name */
        public class C0069a implements k.a {
            public C0069a() {
            }

            @Override // com.applovin.impl.adview.k.a
            public void a() {
                a.this.f5426n.addView(a.this.f5428p, new ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.k.a
            public void b() {
                com.applovin.impl.sdk.o unused = a.this.f5417e;
                if (com.applovin.impl.sdk.o.a()) {
                    a.this.f5417e.b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f5431s != null) {
                if (a.this.f5426n == null) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to render advertisement for ad #" + a.this.f5431s.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    t2.a(a.this.C, a.this.f5431s, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "renderTask");
                    CollectionUtils.putStringIfValid("error_message", "Ad view failed to render due to null adView", mapHashMap);
                    a.this.f5415c.g().a(d2.F, a.this.f5431s, mapHashMap);
                    return;
                }
                a.this.v();
                com.applovin.impl.sdk.o unused = a.this.f5417e;
                if (com.applovin.impl.sdk.o.a()) {
                    a.this.f5417e.a("AppLovinAdView", "Rendering advertisement ad for #" + a.this.f5431s.getAdIdNumber() + "...");
                }
                a.b(a.this.f5426n, a.this.f5431s.getSize());
                if (a.this.f5428p != null) {
                    e8.c(a.this.f5428p);
                    a.this.f5428p = null;
                }
                c2 c2Var = new c2(a.this.f5420h, a.this.f5415c);
                if (c2Var.c()) {
                    a.this.f5428p = new k(c2Var, a.this.f5413a);
                    a.this.f5428p.a(new C0069a());
                }
                a.this.f5426n.setAdHtmlLoaded(false);
                a.this.f5426n.a(a.this.f5431s);
                if (a.this.f5431s.getSize() == AppLovinAdSize.INTERSTITIAL || a.this.f5438z) {
                    return;
                }
                a.this.f5431s.setHasShown(true);
            }
        }

        public /* synthetic */ d(a aVar, C0068a c0068a) {
            this();
        }
    }

    public static class e implements AppLovinAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        private final a f5443a;

        public e(a aVar, com.applovin.impl.sdk.k kVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f5443a = aVar;
        }

        private a a() {
            return this.f5443a;
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
        public void failedToReceiveAd(int i10) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(i10);
            }
        }
    }

    private void E() {
        if (this.f5417e != null && com.applovin.impl.sdk.o.a() && com.applovin.impl.sdk.o.a()) {
            this.f5417e.a("AppLovinAdView", "Destroying...");
        }
        o8.b(this.f5426n);
        this.f5426n = null;
        o8.b(this.f5427o);
        this.f5427o = null;
        this.f5423k = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.C = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f5438z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        com.applovin.impl.sdk.ad.b bVar = this.f5431s;
        v2 v2Var = new v2();
        v2Var.a().a(bVar).a(i());
        if (!n7.a(bVar.getSize())) {
            v2Var.a().a("Fullscreen Ad Properties").b(bVar);
        }
        v2Var.a(this.f5415c);
        v2Var.a();
        if (com.applovin.impl.sdk.o.a()) {
            this.f5417e.a("AppLovinAdView", v2Var.toString());
        }
    }

    private void x() {
        if (this.f5431s.P0()) {
            int iC = this.f5415c.p().c();
            if (com.applovin.impl.sdk.i.a(iC)) {
                this.f5426n.a("javascript:al_muteSwitchOn();");
            } else if (iC == 2) {
                this.f5426n.a("javascript:al_muteSwitchOff();");
            }
        }
    }

    private void y() {
        if (n7.a(this.f5421i)) {
            if (((Boolean) this.f5415c.a(x4.E1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            if (((Boolean) this.f5415c.a(x4.F1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
            }
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
            if (((Boolean) this.f5415c.a(x4.G1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
            }
            if (((Boolean) this.f5415c.a(x4.H1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
            }
        }
    }

    public void A() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5417e.a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.f5419g;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void B() {
        y();
        if (this.f5431s != null && this.f5431s.r0()) {
            com.applovin.impl.g.a(this.f5426n, this.f5415c);
        }
        b("javascript:al_onAttachedToWindow();");
    }

    public void C() {
        if (this.f5437y) {
            if (this.f5431s == null || !this.f5431s.Z0()) {
                t2.b(this.B, this.f5431s);
            }
            if (this.f5431s != null && this.f5431s.isOpenMeasurementEnabled() && n7.a(this.f5431s.getSize())) {
                this.f5431s.getAdEventTracker().f();
            }
            if (this.f5426n != null && this.f5433u != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f5417e.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                c();
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f5417e.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
            b("javascript:al_onDetachedFromWindow();");
        }
    }

    public void D() {
        if (!this.f5437y || this.f5438z) {
            return;
        }
        this.f5438z = true;
    }

    public void F() {
        if (this.f5437y) {
            AppLovinAd appLovinAd = (AppLovinAd) this.f5435w.getAndSet(null);
            if (appLovinAd != null) {
                c(appLovinAd);
            }
            this.f5438z = false;
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return a.class.getSimpleName();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new Runnable() { // from class: com.applovin.impl.adview.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5530a.t();
                }
            });
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
        if ((this.f5413a instanceof n1) && this.f5431s != null && this.f5431s.K() == b.EnumC0083b.DISMISS) {
            ((n1) this.f5413a).dismiss("postitial_click");
        }
    }

    public void z() {
        if (this.f5433u != null || this.f5434v != null) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f5417e.a("AppLovinAdView", "Ad: " + this.f5431s + " closed.");
        }
        a(this.f5430r);
        t2.b(this.B, this.f5431s);
        this.f5431s = null;
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
        a(new Runnable() { // from class: com.applovin.impl.adview.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f5526a.r();
            }
        });
    }

    private void m() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5417e.a("AppLovinAdView", "handleApplicationPaused()");
        }
        b("javascript:al_onAppPaused();");
    }

    private void n() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5417e.a("AppLovinAdView", "handleApplicationResumed()");
        }
        b("javascript:al_onAppResumed();");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f5426n.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        com.applovin.impl.adview.b bVar;
        d();
        if (this.f5414b == null || (bVar = this.f5426n) == null || bVar.getParent() != null) {
            return;
        }
        this.f5414b.addView(this.f5426n);
        b(this.f5426n, this.f5431s.getSize());
        if (this.f5431s.isOpenMeasurementEnabled()) {
            this.f5431s.getAdEventTracker().a((View) this.f5426n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        if (this.f5426n != null && this.f5433u != null) {
            a();
        }
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        if (this.f5433u != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5417e.a("AppLovinAdView", "Detaching expanded ad: " + this.f5433u.b());
            }
            this.f5434v = this.f5433u;
            this.f5433u = null;
            a(this.f5421i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        com.applovin.impl.sdk.ad.a aVarB;
        f fVar = this.f5434v;
        if (fVar == null && this.f5433u == null) {
            return;
        }
        if (fVar != null) {
            aVarB = fVar.b();
            this.f5434v.dismiss();
            this.f5434v = null;
        } else {
            aVarB = this.f5433u.b();
            this.f5433u.dismiss();
            this.f5433u = null;
        }
        t2.a(this.C, aVarB, (AppLovinAdView) this.f5414b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        f().loadUrl("chrome://crash");
    }

    public AppLovinAdViewEventListener e() {
        return this.C;
    }

    public com.applovin.impl.adview.b f() {
        return this.f5426n;
    }

    public com.applovin.impl.sdk.ad.b g() {
        return this.f5431s;
    }

    public n.e h() {
        return this.f5423k;
    }

    public AppLovinAdView i() {
        return (AppLovinAdView) this.f5414b;
    }

    public com.applovin.impl.sdk.k j() {
        return this.f5415c;
    }

    public AppLovinAdSize k() {
        return this.f5421i;
    }

    public String l() {
        return this.f5422j;
    }

    public void u() {
        if (this.f5415c == null || this.f5425m == null || this.f5413a == null || !this.f5437y) {
            com.applovin.impl.sdk.o.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f5416d.loadNextAd(this.f5422j, this.f5421i, this.f5425m);
        }
    }

    private void d() {
        a(new Runnable() { // from class: com.applovin.impl.adview.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f5520a.s();
            }
        });
    }

    public void c(int i10) {
        String strA = e8.a(i10);
        if (com.applovin.impl.sdk.o.a()) {
            this.f5417e.a("AppLovinAdView", "onWindowVisibilityChanged( " + strA + " )");
        }
        b("javascript:al_onWindowVisibilityChanged( " + strA + " );");
    }

    private void d(String str, Map map) {
        a(o8.d(str, map));
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.A = appLovinAdLoadListener;
    }

    public void c(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.B = appLovinAdDisplayListener;
    }

    public void c(WebView webView) {
        a(webView, (String) null);
    }

    private void c(String str, Map map) {
        a(o8.c(str, map));
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
            this.f5415c = kVar;
            this.f5416d = kVar.k();
            this.f5417e = kVar.O();
            this.f5418f = AppLovinCommunicator.getInstance(context);
            this.f5421i = appLovinAdSize;
            this.f5422j = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f5413a = context;
            this.f5414b = appLovinAdView;
            this.f5424l = new com.applovin.impl.adview.c(this, kVar);
            C0068a c0068a = null;
            this.f5430r = new c(this, c0068a);
            this.f5429q = new d(this, c0068a);
            this.f5425m = new e(this, kVar);
            a(appLovinAdSize);
            return;
        }
        throw new IllegalArgumentException("No ad size specified");
    }

    public void b() {
        a(new Runnable() { // from class: com.applovin.impl.adview.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f5527a.q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        this.f5431s.getAdEventTracker().c(webView);
        k kVar = this.f5428p;
        if (kVar != null && kVar.a()) {
            f4 adEventTracker = this.f5431s.getAdEventTracker();
            k kVar2 = this.f5428p;
            adEventTracker.b(webView, Collections.singletonList(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        } else {
            this.f5431s.getAdEventTracker().a((View) webView);
        }
        this.f5431s.getAdEventTracker().h();
        this.f5431s.getAdEventTracker().g();
    }

    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.f5424l, this.f5415c, this.f5413a);
            this.f5426n = bVar;
            bVar.setBackgroundColor(0);
            this.f5426n.setWillNotCacheDrawing(false);
            this.f5414b.setBackgroundColor(0);
            this.f5414b.addView(this.f5426n);
            b(this.f5426n, appLovinAdSize);
            if (!this.f5437y) {
                a(this.f5430r);
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5444a.o();
                }
            });
            this.f5437y = true;
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.f5415c.D().a("AppLovinAdView", "initAdWebView", th);
            this.f5436x.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MotionEvent motionEvent) {
        a aVar;
        if (this.f5433u == null && (this.f5431s instanceof com.applovin.impl.sdk.ad.a) && this.f5426n != null) {
            com.applovin.impl.sdk.ad.a aVar2 = (com.applovin.impl.sdk.ad.a) this.f5431s;
            Context context = this.f5413a;
            Activity activityB = context instanceof Activity ? (Activity) context : e8.b(this.f5426n, this.f5415c);
            if (activityB != null && !activityB.isFinishing()) {
                ViewGroup viewGroup = this.f5414b;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f5426n);
                }
                f fVar = new f(aVar2, this.f5426n, activityB, this.f5415c);
                this.f5433u = fVar;
                fVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.z
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f5534a.a(dialogInterface);
                    }
                });
                this.f5433u.show();
                t2.c(this.C, this.f5431s, (AppLovinAdView) this.f5414b);
                if (this.f5431s.isOpenMeasurementEnabled()) {
                    this.f5431s.getAdEventTracker().a((View) this.f5433u.c());
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
            Uri uriE1 = aVar2.e1();
            if (uriE1 != null) {
                aVar = this;
                this.f5416d.trackAndLaunchClick(aVar2, i(), aVar, uriE1, motionEvent);
            } else {
                aVar = this;
            }
            aVar.f5426n.a("javascript:al_onFailedExpand();");
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

    public void b(final AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f5438z) {
                c(appLovinAd);
            } else {
                this.f5435w.set(appLovinAd);
                if (com.applovin.impl.sdk.o.a()) {
                    this.f5417e.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5475a.a(appLovinAd);
                }
            });
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f5417e.b("AppLovinAdView", "No provided when to the view controller");
        }
        b(-1);
    }

    public void a(String str, Object obj) {
        this.f5420h.put(str, obj);
    }

    public void a(boolean z10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5417e.a("AppLovinAdView", "onWindowFocusChanged( " + z10 + " )");
        }
        b("javascript:al_onWindowFocusChanged( " + z10 + " );");
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            n7.b(appLovinAd, this.f5415c);
            if (this.f5437y) {
                if (appLovinAd.getSize() != AppLovinAdSize.INTERSTITIAL) {
                    Map mapA = f2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "renderAd", mapA);
                    this.f5415c.g().d(d2.C, mapA);
                }
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) n7.a(appLovinAd, this.f5415c);
                if (bVar == null) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    t2.a(this.B, "Unable to retrieve the loaded ad");
                    Map mapA2 = f2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "noAdToRender", mapA2);
                    CollectionUtils.putStringIfValid("error_message", "Unable to retrieve the loaded ad", mapA2);
                    this.f5415c.g().d(d2.F, mapA2);
                    return;
                }
                if (bVar == this.f5431s) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
                    if (((Boolean) this.f5415c.a(x4.I1)).booleanValue()) {
                        if (this.B instanceof l2) {
                            t2.a(this.B, "Attempting to show ad again");
                        } else if (!n7.c(this.f5415c)) {
                            this.f5415c.g().a(d2.S0, bVar, CollectionUtils.hashMap("source", "attemptingAdReRender"));
                        } else {
                            throw new IllegalStateException("Attempting to show ad again");
                        }
                    }
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "attemptingAdReRender");
                    CollectionUtils.putStringIfValid("error_message", "Attempting to show ad again", mapHashMap);
                    this.f5415c.g().a(d2.F, bVar, mapHashMap);
                    return;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f5417e.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
                }
                t2.b(this.B, this.f5431s);
                if (this.f5431s != null && this.f5431s.isOpenMeasurementEnabled()) {
                    this.f5431s.getAdEventTracker().f();
                }
                this.f5435w.set(null);
                this.f5432t = null;
                this.f5431s = bVar;
                if (this.f5431s.isCustomTabsEnabled()) {
                    this.f5423k = this.f5415c.z().a(this);
                    this.f5415c.z().b(this.f5431s.getCustomTabsWarmupUrls(), this.f5423k);
                }
                if (!this.f5438z && n7.a(this.f5421i)) {
                    this.f5415c.k().trackImpression(bVar);
                }
                if (this.f5433u != null) {
                    c();
                }
                a(this.f5429q);
                return;
            }
            com.applovin.impl.sdk.o.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i10) {
        if (!this.f5438z) {
            a(this.f5430r);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f5528a.a(i10);
            }
        });
    }

    private void b(String str) {
        if (((Boolean) this.f5415c.a(x4.E1)).booleanValue()) {
            a(str);
        }
    }

    private void b(String str, Map map) {
        a(o8.b(str, map));
    }

    public void b(Uri uri) {
        if (this.f5431s != null && this.f5431s.w0() && this.f5427o == null) {
            String queryParameter = uri.getQueryParameter("tracking_id");
            if (TextUtils.isEmpty(queryParameter)) {
                this.f5415c.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f5415c.O().b("AppLovinAdView", "Invalid tracking id. Cannot initialize GA");
                    return;
                }
                return;
            }
            WebView webView = new WebView(this.f5413a);
            this.f5427o = webView;
            webView.setWebViewClient(new C0068a());
            this.f5427o.getSettings().setJavaScriptEnabled(true);
            this.f5427o.loadDataWithBaseURL((String) this.f5415c.a(x4.f8494i7), "<html><head><link rel=\"icon\" href=\"data:,\"><G-SCRIPT_TAG></head><body></body></html>".replace("<G-SCRIPT_TAG>", "<script src='https://www.googletagmanager.com/gtag/js?id=<G-TRACKING_ID>'></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', '<G-TRACKING_ID>')</script>".replace("<G-TRACKING_ID>", queryParameter)), "text/html", C.UTF8_NAME, null);
        }
    }

    public void a(final WebView webView, String str) {
        if (this.f5431s == null) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.p
            @Override // java.lang.Runnable
            public final void run() {
                webView.setVisibility(0);
            }
        });
        if (!((Boolean) this.f5415c.a(x4.f8625y6)).booleanValue() || (str != null && str.startsWith(this.f5431s.k()))) {
            try {
                if (this.f5431s != this.f5432t) {
                    this.f5432t = this.f5431s;
                    x();
                    this.f5426n.setAdHtmlLoaded(true);
                    if (this.B != null) {
                        this.f5415c.y().d(this.f5431s);
                        if (this.f5431s.s0()) {
                            this.f5415c.g().a(d2.E, this.f5431s, CollectionUtils.hashMap("details", f2.b(this.f5431s)));
                        } else {
                            this.f5415c.g().a(d2.D, this.f5431s, CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f5431s.z())));
                            t2.a(this.B, this.f5431s);
                        }
                        if (this.f5431s.Q0()) {
                            String str2 = (String) this.f5415c.p0().a(z4.T, "");
                            JSONObject jSONObject = new JSONObject();
                            JsonUtils.putString(jSONObject, "template_browser_package_name", str2);
                            this.f5426n.a("javascript:al_onAdViewRendered(" + jSONObject + ");");
                        } else {
                            this.f5426n.a("javascript:al_onAdViewRendered();");
                        }
                        if (this.f5431s.s0()) {
                            this.f5426n.a("javascript:al_onAdRestored( '" + this.f5431s.X() + "' );");
                        }
                    }
                    if ((this.f5431s instanceof com.applovin.impl.sdk.ad.a) && this.f5431s.isOpenMeasurementEnabled()) {
                        this.f5415c.q0().a(new r6(this.f5415c, "StartOMSDK", new Runnable() { // from class: com.applovin.impl.adview.t
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f5524a.b(webView);
                            }
                        }), d6.b.OTHER, 500L);
                    }
                }
            } catch (Throwable th) {
                com.applovin.impl.sdk.o.c("AppLovinAdView", "Exception while notifying ad display listener", th);
                com.applovin.impl.sdk.k kVar = this.f5415c;
                if (kVar != null) {
                    kVar.D().a("AppLovinAdView", "onAdHtmlLoaded", th);
                }
            }
        }
    }

    public void a(final MotionEvent motionEvent) {
        a(new Runnable() { // from class: com.applovin.impl.adview.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f5522a.b(motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        a();
    }

    public void a() {
        a(new Runnable() { // from class: com.applovin.impl.adview.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f5521a.p();
            }
        });
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent) {
        a aVar;
        com.applovin.impl.sdk.ad.b bVar2;
        if (appLovinAdView != null) {
            aVar = this;
            bVar2 = bVar;
            this.f5416d.trackAndLaunchClick(bVar2, appLovinAdView, aVar, uri, motionEvent);
        } else {
            aVar = this;
            bVar2 = bVar;
            if (com.applovin.impl.sdk.o.a()) {
                aVar.f5417e.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
            }
        }
        t2.a(aVar.D, bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f5436x.compareAndSet(true, false)) {
            a(this.f5421i);
        }
        try {
            if (this.A != null) {
                this.A.adReceived(appLovinAd);
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
            com.applovin.impl.sdk.k kVar = this.f5415c;
            if (kVar != null) {
                kVar.D().a("AppLovinAdView", "notifyAdLoadedCallback", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        try {
            if (this.A != null) {
                this.A.failedToReceiveAd(i10);
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("AppLovinAdView", "Exception while running app load callback", th);
            com.applovin.impl.sdk.k kVar = this.f5415c;
            if (kVar != null) {
                kVar.D().a("AppLovinAdView", "notifyAdLoadFailedCallback", th);
            }
        }
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(b bVar) {
        this.f5419g = bVar;
    }

    private void a(String str, Map map) {
        a(o8.a(str, map));
    }

    private void a(String str) {
        if (this.f5431s == null || this.f5426n == null || !n7.a(this.f5431s.getSize()) || !StringUtils.isValidString(str)) {
            return;
        }
        this.f5426n.a(str);
    }

    public void a(Uri uri) {
        if (this.f5431s == null || !this.f5431s.w0()) {
            return;
        }
        if (this.f5427o == null) {
            this.f5415c.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f5415c.O().a("AppLovinAdView", "GA is not initialized. Cannot fire GA event");
                return;
            }
            return;
        }
        final String queryParameter = uri.getQueryParameter("event_name");
        final String queryParameter2 = uri.getQueryParameter("event_params_json");
        if (TextUtils.isEmpty(queryParameter)) {
            this.f5415c.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f5415c.O().a("AppLovinAdView", "Invalid GA event name. Cannot fire GA event");
                return;
            }
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f5531a.a(queryParameter2, queryParameter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        String str3;
        if (StringUtils.isValidString(str)) {
            str3 = "gtag('event', '" + str2 + "', " + str + ");";
        } else {
            str3 = "gtag('event', '" + str2 + "')";
        }
        if (((Boolean) this.f5415c.a(x4.Q2)).booleanValue()) {
            o8.a(this.f5427o, str3, this.f5415c);
        } else {
            o8.a(this.f5427o, str3);
        }
    }
}
