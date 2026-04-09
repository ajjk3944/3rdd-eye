package com.applovin.impl.adview;

import C.E;
import C.T;
import N7.C1154e9;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
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
import com.applovin.impl.AbstractC2119g;
import com.applovin.impl.a2;
import com.applovin.impl.a7;
import com.applovin.impl.adview.k;
import com.applovin.impl.b8;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.h4;
import com.applovin.impl.i1;
import com.applovin.impl.l2;
import com.applovin.impl.l4;
import com.applovin.impl.n2;
import com.applovin.impl.n4;
import com.applovin.impl.r5;
import com.applovin.impl.r7;
import com.applovin.impl.s3;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u3;
import com.applovin.impl.x1;
import com.applovin.impl.y1;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.singular.sdk.internal.Constants;
import io.appmetrica.analytics.impl.Oo;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements AppLovinCommunicatorSubscriber, AppLovinBroadcastManager.Receiver {

    /* renamed from: A, reason: collision with root package name */
    private volatile AppLovinAdLoadListener f18969A;

    /* renamed from: B, reason: collision with root package name */
    private volatile AppLovinAdDisplayListener f18970B;

    /* renamed from: C, reason: collision with root package name */
    private volatile AppLovinAdViewEventListener f18971C;

    /* renamed from: D, reason: collision with root package name */
    private volatile AppLovinAdClickListener f18972D;

    /* renamed from: a, reason: collision with root package name */
    private Context f18973a;

    /* renamed from: b, reason: collision with root package name */
    private ViewGroup f18974b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.impl.sdk.k f18975c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAdServiceImpl f18976d;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.o f18977e;

    /* renamed from: f, reason: collision with root package name */
    private AppLovinCommunicator f18978f;

    /* renamed from: g, reason: collision with root package name */
    private b f18979g;
    private AppLovinAdSize i;

    /* renamed from: j, reason: collision with root package name */
    private String f18981j;

    /* renamed from: k, reason: collision with root package name */
    private s.i f18982k;

    /* renamed from: l, reason: collision with root package name */
    private com.applovin.impl.adview.c f18983l;

    /* renamed from: m, reason: collision with root package name */
    private e f18984m;

    /* renamed from: n, reason: collision with root package name */
    private com.applovin.impl.adview.b f18985n;

    /* renamed from: o, reason: collision with root package name */
    private WebView f18986o;

    /* renamed from: p, reason: collision with root package name */
    private k f18987p;

    /* renamed from: q, reason: collision with root package name */
    private Runnable f18988q;

    /* renamed from: r, reason: collision with root package name */
    private Runnable f18989r;

    /* renamed from: h, reason: collision with root package name */
    private final Map f18980h = Collections.synchronizedMap(new HashMap());

    /* renamed from: s, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.b f18990s = null;

    /* renamed from: t, reason: collision with root package name */
    private volatile AppLovinAd f18991t = null;

    /* renamed from: u, reason: collision with root package name */
    private f f18992u = null;

    /* renamed from: v, reason: collision with root package name */
    private f f18993v = null;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicReference f18994w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f18995x = new AtomicBoolean();

    /* renamed from: y, reason: collision with root package name */
    private volatile boolean f18996y = false;

    /* renamed from: z, reason: collision with root package name */
    private volatile boolean f18997z = false;

    /* renamed from: com.applovin.impl.adview.a$a, reason: collision with other inner class name */
    public class C0304a extends h4 {
        public C0304a() {
        }

        @Override // com.applovin.impl.h4
        public Map a() {
            return CollectionUtils.hashMap(AppMeasurementSdk.ConditionalUserProperty.NAME, "AdViewController:GAWebView");
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
            if (a.this.f18985n != null) {
                a.this.f18985n.setVisibility(8);
            }
        }

        public /* synthetic */ c(a aVar, C0304a c0304a) {
            this();
        }
    }

    public class d implements Runnable {

        /* renamed from: com.applovin.impl.adview.a$d$a, reason: collision with other inner class name */
        public class C0305a implements k.a {
            public C0305a() {
            }

            @Override // com.applovin.impl.adview.k.a
            public void a() {
                a.this.f18985n.addView(a.this.f18987p, new ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.k.a
            public void onFailure() {
                com.applovin.impl.sdk.o unused = a.this.f18977e;
                if (com.applovin.impl.sdk.o.a()) {
                    a.this.f18977e.b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f18990s != null) {
                if (a.this.f18985n == null) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to render advertisement for ad #" + a.this.f18990s.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    l2.a(a.this.f18971C, a.this.f18990s, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap(AdRevenueConstants.SOURCE_KEY, "renderTask");
                    CollectionUtils.putStringIfValid("error_message", "Ad view failed to render due to null adView", mapHashMap);
                    a.this.f18975c.g().a(y1.f21817s, a.this.f18990s, mapHashMap);
                    return;
                }
                a.this.v();
                com.applovin.impl.sdk.o unused = a.this.f18977e;
                if (com.applovin.impl.sdk.o.a()) {
                    a.this.f18977e.a("AppLovinAdView", "Rendering advertisement ad for #" + a.this.f18990s.getAdIdNumber() + "...");
                }
                a.b(a.this.f18985n, a.this.f18990s.getSize(), a.this.f18990s.D0());
                if (a.this.f18987p != null) {
                    r7.c(a.this.f18987p);
                    a.this.f18987p = null;
                }
                x1 x1Var = new x1(a.this.f18980h, a.this.f18975c);
                if (x1Var.c()) {
                    a.this.f18987p = new k(x1Var, a.this.f18973a);
                    a.this.f18987p.a(new C0305a());
                }
                a.this.f18985n.setAdHtmlLoaded(false);
                a.this.f18985n.a(a.this.f18990s);
                if (a.this.f18990s.getSize() == AppLovinAdSize.INTERSTITIAL || a.this.f18997z) {
                    return;
                }
                a.this.f18990s.setHasShown(true);
            }
        }

        public /* synthetic */ d(a aVar, C0304a c0304a) {
            this();
        }
    }

    public static class e implements AppLovinAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        private final a f19002a;

        public e(a aVar, com.applovin.impl.sdk.k kVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f19002a = aVar;
        }

        private a a() {
            return this.f19002a;
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
        public void failedToReceiveAd(int i) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(i);
            }
        }
    }

    private void E() {
        if (this.f18977e != null && com.applovin.impl.sdk.o.a() && com.applovin.impl.sdk.o.a()) {
            this.f18977e.a("AppLovinAdView", "Destroying...");
        }
        b8.b(this.f18985n);
        this.f18985n = null;
        b8.b(this.f18986o);
        this.f18986o = null;
        this.f18982k = null;
        this.f18969A = null;
        this.f18970B = null;
        this.f18972D = null;
        this.f18971C = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f18997z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        com.applovin.impl.sdk.ad.b bVar = this.f18990s;
        n2 n2Var = new n2();
        n2Var.a().a(bVar).a(i());
        if (!a7.a(bVar.getSize())) {
            n2Var.a().a("Fullscreen Ad Properties").b(bVar);
        }
        n2Var.a(this.f18975c);
        n2Var.a();
        if (com.applovin.impl.sdk.o.a()) {
            this.f18977e.a("AppLovinAdView", n2Var.toString());
        }
    }

    private void x() {
        if (this.f18990s.b1()) {
            int iC = this.f18975c.q().c();
            if (com.applovin.impl.sdk.i.a(iC)) {
                this.f18985n.a("javascript:al_muteSwitchOn();");
            } else if (iC == 2) {
                this.f18985n.a("javascript:al_muteSwitchOff();");
            }
        }
    }

    private void y() {
        if (a7.a(this.i)) {
            if (((Boolean) this.f18975c.a(l4.f19711C1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            if (((Boolean) this.f18975c.a(l4.f19719D1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
            }
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
            if (((Boolean) this.f18975c.a(l4.f19727E1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
            }
            if (((Boolean) this.f18975c.a(l4.f19734F1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
            }
        }
    }

    public void A() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f18977e.a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.f18979g;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void B() {
        y();
        if (this.f18990s != null && this.f18990s.C0()) {
            AbstractC2119g.a(this.f18985n, this.f18975c);
        }
        b("javascript:al_onAttachedToWindow();");
    }

    public void C() {
        if (this.f18996y) {
            if (this.f18990s == null || !this.f18990s.i1()) {
                l2.b(this.f18970B, this.f18990s);
            }
            if (this.f18990s != null && this.f18990s.isOpenMeasurementEnabled() && a7.a(this.f18990s.getSize())) {
                this.f18990s.getAdEventTracker().f();
            }
            if (this.f18985n != null && this.f18992u != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f18977e.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                c();
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f18977e.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
            b("javascript:al_onDetachedFromWindow();");
        }
    }

    public void D() {
        if (!this.f18996y || this.f18997z) {
            return;
        }
        this.f18997z = true;
    }

    public void F() {
        if (this.f18996y) {
            AppLovinAd appLovinAd = (AppLovinAd) this.f18994w.getAndSet(null);
            if (appLovinAd != null) {
                c(appLovinAd);
            }
            this.f18997z = false;
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "a";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new Runnable() { // from class: com.applovin.impl.adview.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19072b.t();
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
        if ((this.f18973a instanceof i1) && this.f18990s != null && this.f18990s.U() == b.EnumC0317b.DISMISS) {
            ((i1) this.f18973a).dismiss("postitial_click");
        }
    }

    public void z() {
        if (this.f18992u != null || this.f18993v != null) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f18977e.a("AppLovinAdView", "Ad: " + this.f18990s + " closed.");
        }
        a(this.f18989r);
        l2.b(this.f18970B, this.f18990s);
        this.f18990s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize, boolean z10) {
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        String label = appLovinAdSize.getLabel();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int iApplyDimension = -1;
        int iApplyDimension2 = (label.equals(appLovinAdSize2.getLabel()) || z10) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        if (!appLovinAdSize.getLabel().equals(appLovinAdSize2.getLabel()) && !z10) {
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
        a(new x(this, 2));
    }

    private void m() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f18977e.a("AppLovinAdView", "handleApplicationPaused()");
        }
        b("javascript:al_onAppPaused();");
    }

    private void n() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f18977e.a("AppLovinAdView", "handleApplicationResumed()");
        }
        b("javascript:al_onAppResumed();");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f18985n.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        com.applovin.impl.adview.b bVar;
        d();
        if (this.f18974b == null || (bVar = this.f18985n) == null || bVar.getParent() != null) {
            return;
        }
        this.f18974b.addView(this.f18985n);
        b(this.f18985n, this.f18990s.getSize(), this.f18990s.D0());
        if (this.f18990s.isOpenMeasurementEnabled()) {
            this.f18990s.getAdEventTracker().a((View) this.f18985n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        if (this.f18985n != null && this.f18992u != null) {
            a();
        }
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        if (this.f18992u != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f18977e.a("AppLovinAdView", "Detaching expanded ad: " + this.f18992u.b());
            }
            this.f18993v = this.f18992u;
            this.f18992u = null;
            a(this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        com.applovin.impl.sdk.ad.a aVarB;
        f fVar = this.f18993v;
        if (fVar == null && this.f18992u == null) {
            return;
        }
        if (fVar != null) {
            aVarB = fVar.b();
            this.f18993v.dismiss();
            this.f18993v = null;
        } else {
            aVarB = this.f18992u.b();
            this.f18992u.dismiss();
            this.f18992u = null;
        }
        l2.a(this.f18971C, aVarB, (AppLovinAdView) this.f18974b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        f().loadUrl("chrome://crash");
    }

    public AppLovinAdViewEventListener e() {
        return this.f18971C;
    }

    public com.applovin.impl.adview.b f() {
        return this.f18985n;
    }

    public com.applovin.impl.sdk.ad.b g() {
        return this.f18990s;
    }

    public s.i h() {
        return this.f18982k;
    }

    public AppLovinAdView i() {
        return (AppLovinAdView) this.f18974b;
    }

    public com.applovin.impl.sdk.k j() {
        return this.f18975c;
    }

    public AppLovinAdSize k() {
        return this.i;
    }

    public String l() {
        return this.f18981j;
    }

    public void u() {
        if (this.f18975c == null || this.f18984m == null || this.f18973a == null || !this.f18996y) {
            com.applovin.impl.sdk.o.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f18976d.loadNextAd(this.f18981j, this.i, this.f18984m);
        }
    }

    private void d() {
        a(new o(this, 0));
    }

    public void c(int i) {
        String strA = r7.a(i);
        if (com.applovin.impl.sdk.o.a()) {
            this.f18977e.a("AppLovinAdView", "onWindowVisibilityChanged( " + strA + " )");
        }
        b(C1154e9.i("javascript:al_onWindowVisibilityChanged( ", strA, " );"));
    }

    private void d(String str, Map map) {
        a(b8.d(str, map));
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f18969A = appLovinAdLoadListener;
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f18970B = appLovinAdDisplayListener;
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.f18971C = appLovinAdViewEventListener;
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.f18972D = appLovinAdClickListener;
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize != null) {
            this.f18975c = kVar;
            this.f18976d = kVar.k();
            this.f18977e = kVar.O();
            this.f18978f = AppLovinCommunicator.getInstance(context);
            this.i = appLovinAdSize;
            this.f18981j = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f18973a = context;
            this.f18974b = appLovinAdView;
            this.f18983l = new com.applovin.impl.adview.c(this, kVar);
            C0304a c0304a = null;
            this.f18989r = new c(this, c0304a);
            this.f18988q = new d(this, c0304a);
            this.f18984m = new e(this, kVar);
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
        a(b8.c(str, map));
    }

    public void b() {
        a(new o(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        this.f18990s.getAdEventTracker().c(webView);
        k kVar = this.f18987p;
        if (kVar != null && kVar.a()) {
            s3 adEventTracker = this.f18990s.getAdEventTracker();
            k kVar2 = this.f18987p;
            adEventTracker.b(webView, Collections.singletonList(new u3(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        } else {
            this.f18990s.getAdEventTracker().a((View) webView);
        }
        this.f18990s.getAdEventTracker().h();
        this.f18990s.getAdEventTracker().g();
    }

    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.f18983l, this.f18975c, this.f18973a);
            this.f18985n = bVar;
            bVar.setBackgroundColor(0);
            this.f18985n.setWillNotCacheDrawing(false);
            this.f18974b.setBackgroundColor(0);
            this.f18974b.addView(this.f18985n);
            a(this.f18985n, appLovinAdSize);
            if (!this.f18996y) {
                a(this.f18989r);
            }
            a(new o(this, 2));
            this.f18996y = true;
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.f18975c.E().a("AppLovinAdView", "initAdWebView", th);
            this.f18995x.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MotionEvent motionEvent) {
        a aVar;
        if (this.f18992u == null && (this.f18990s instanceof com.applovin.impl.sdk.ad.a) && this.f18985n != null) {
            com.applovin.impl.sdk.ad.a aVar2 = (com.applovin.impl.sdk.ad.a) this.f18990s;
            Context context = this.f18973a;
            Activity activityB = context instanceof Activity ? (Activity) context : r7.b(this.f18985n, this.f18975c);
            if (activityB != null && !activityB.isFinishing()) {
                ViewGroup viewGroup = this.f18974b;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f18985n);
                }
                f fVar = new f(aVar2, this.f18985n, activityB, this.f18975c);
                this.f18992u = fVar;
                fVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.r
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f19073b.a(dialogInterface);
                    }
                });
                this.f18992u.show();
                l2.c(this.f18971C, this.f18990s, (AppLovinAdView) this.f18974b);
                if (this.f18990s.isOpenMeasurementEnabled()) {
                    this.f18990s.getAdEventTracker().a((View) this.f18992u.c());
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
            Uri uriM = aVar2.m();
            if (uriM != null) {
                aVar = this;
                this.f18976d.trackAndLaunchClick(aVar2, i(), aVar, uriM, motionEvent, null);
            } else {
                aVar = this;
            }
            aVar.f18985n.a("javascript:al_onFailedExpand();");
        }
    }

    private static void a(View view, AppLovinAdSize appLovinAdSize) {
        b(view, appLovinAdSize, false);
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = com.applovin.impl.r.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.a(), appLovinAdSize2, str, context);
            if (com.applovin.impl.r.b(attributeSet)) {
                u();
            }
        }
    }

    public void b(AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f18997z) {
                c(appLovinAd);
            } else {
                this.f18994w.set(appLovinAd);
                if (com.applovin.impl.sdk.o.a()) {
                    this.f18977e.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new T(17, this, appLovinAd));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f18977e.b("AppLovinAdView", "No provided when to the view controller");
        }
        b(-1);
    }

    public void a(String str, Object obj) {
        this.f18980h.put(str, obj);
    }

    public void a(boolean z10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f18977e.a("AppLovinAdView", "onWindowFocusChanged( " + z10 + " )");
        }
        b("javascript:al_onWindowFocusChanged( " + z10 + " );");
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            a7.b(appLovinAd, this.f18975c);
            if (this.f18996y) {
                if (appLovinAd.getSize() != AppLovinAdSize.INTERSTITIAL) {
                    Map mapA = a2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid(AdRevenueConstants.SOURCE_KEY, "renderAd", mapA);
                    this.f18975c.g().d(y1.f21811p, mapA);
                }
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) a7.a(appLovinAd, this.f18975c);
                if (bVar == null) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    l2.a(this.f18970B, "Unable to retrieve the loaded ad");
                    Map mapA2 = a2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid(AdRevenueConstants.SOURCE_KEY, "noAdToRender", mapA2);
                    CollectionUtils.putStringIfValid("error_message", "Unable to retrieve the loaded ad", mapA2);
                    this.f18975c.g().d(y1.f21817s, mapA2);
                    return;
                }
                if (bVar == this.f18990s) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
                    if (((Boolean) this.f18975c.a(l4.f19742G1)).booleanValue()) {
                        if (this.f18970B instanceof f2) {
                            l2.a(this.f18970B, "Attempting to show ad again");
                        } else if (!a7.c(this.f18975c)) {
                            this.f18975c.g().a(y1.f21826w0, bVar, CollectionUtils.hashMap(AdRevenueConstants.SOURCE_KEY, "attemptingAdReRender"));
                        } else {
                            throw new IllegalStateException("Attempting to show ad again");
                        }
                    }
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap(AdRevenueConstants.SOURCE_KEY, "attemptingAdReRender");
                    CollectionUtils.putStringIfValid("error_message", "Attempting to show ad again", mapHashMap);
                    this.f18975c.g().a(y1.f21817s, bVar, mapHashMap);
                    return;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f18977e.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
                }
                l2.b(this.f18970B, this.f18990s);
                if (this.f18990s != null && this.f18990s.isOpenMeasurementEnabled()) {
                    this.f18990s.getAdEventTracker().f();
                }
                this.f18994w.set(null);
                this.f18991t = null;
                this.f18990s = bVar;
                if (this.f18990s.I0()) {
                    this.f18982k = this.f18975c.A().a(this);
                    this.f18975c.A().b(this.f18990s.D(), this.f18982k);
                }
                if (!this.f18997z && a7.a(this.i)) {
                    this.f18975c.k().trackImpression(bVar);
                }
                if (this.f18992u != null) {
                    c();
                }
                a(this.f18988q);
                return;
            }
            com.applovin.impl.sdk.o.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (!this.f18997z) {
            a(this.f18989r);
        }
        a(new B0.h(i, 1, this));
    }

    private void b(String str) {
        if (((Boolean) this.f18975c.a(l4.f19711C1)).booleanValue()) {
            a(str);
        }
    }

    private void b(String str, Map map) {
        a(b8.b(str, map));
    }

    public void b(Uri uri) {
        if (this.f18990s != null && this.f18990s.K0() && this.f18986o == null) {
            String queryParameter = uri.getQueryParameter("tracking_id");
            if (TextUtils.isEmpty(queryParameter)) {
                this.f18975c.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f18975c.O().b("AppLovinAdView", "Invalid tracking id. Cannot initialize GA");
                    return;
                }
                return;
            }
            WebView webView = new WebView(this.f18973a);
            this.f18986o = webView;
            webView.setWebViewClient(new C0304a());
            this.f18986o.getSettings().setJavaScriptEnabled(true);
            this.f18986o.loadDataWithBaseURL((String) this.f18975c.a(l4.f19739F6), "<html><head><link rel=\"icon\" href=\"data:,\"><G-SCRIPT_TAG></head><body></body></html>".replace("<G-SCRIPT_TAG>", "<script src='https://www.googletagmanager.com/gtag/js?id=<G-TRACKING_ID>'></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', '<G-TRACKING_ID>')</script>".replace("<G-TRACKING_ID>", queryParameter)), "text/html", Constants.ENCODING, null);
        }
    }

    public void a(WebView webView, String str) {
        if (this.f18990s == null) {
            return;
        }
        a(new x(webView, 1));
        if (!((Boolean) this.f18975c.a(l4.f19845U5)).booleanValue() || (str != null && str.startsWith(this.f18990s.k()))) {
            try {
                if (this.f18990s != this.f18991t) {
                    this.f18991t = this.f18990s;
                    x();
                    this.f18985n.setAdHtmlLoaded(true);
                    if (this.f18970B != null) {
                        this.f18975c.z().d(this.f18990s);
                        if (this.f18990s.E0()) {
                            this.f18975c.g().a(y1.f21815r, this.f18990s, CollectionUtils.hashMap("details", a2.b(this.f18990s)));
                        } else {
                            this.f18975c.g().a(y1.f21813q, this.f18990s);
                            l2.a(this.f18970B, this.f18990s);
                        }
                        if (this.f18990s.c1()) {
                            String str2 = (String) this.f18975c.p0().a(n4.f20569N, "");
                            JSONObject jSONObject = new JSONObject();
                            JsonUtils.putString(jSONObject, "template_browser_package_name", str2);
                            this.f18985n.a("javascript:al_onAdViewRendered(" + jSONObject + ");");
                        } else {
                            this.f18985n.a("javascript:al_onAdViewRendered();");
                        }
                        if (this.f18990s.E0()) {
                            this.f18985n.a("javascript:al_onAdRestored( '" + this.f18990s.h0() + "' );");
                        }
                    }
                    if ((this.f18990s instanceof com.applovin.impl.sdk.ad.a) && this.f18990s.isOpenMeasurementEnabled()) {
                        this.f18975c.q0().a(new f6(this.f18975c, "StartOMSDK", new E(9, this, webView)), r5.b.OTHER, 500L);
                    }
                }
            } catch (Throwable th) {
                com.applovin.impl.sdk.o.c("AppLovinAdView", "Exception while notifying ad display listener", th);
                com.applovin.impl.sdk.k kVar = this.f18975c;
                if (kVar != null) {
                    kVar.E().a("AppLovinAdView", "onAdHtmlLoaded", th);
                }
            }
        }
    }

    public void a(MotionEvent motionEvent) {
        a(new B.c(11, this, motionEvent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        a();
    }

    public void a() {
        a(new Runnable() { // from class: com.applovin.impl.adview.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f19071b.p();
            }
        });
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent, Bundle bundle) {
        a aVar;
        com.applovin.impl.sdk.ad.b bVar2;
        if (appLovinAdView != null) {
            aVar = this;
            bVar2 = bVar;
            this.f18976d.trackAndLaunchClick(bVar2, appLovinAdView, aVar, uri, motionEvent, bundle);
        } else {
            aVar = this;
            bVar2 = bVar;
            if (com.applovin.impl.sdk.o.a()) {
                aVar.f18977e.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
            }
        }
        l2.a(aVar.f18972D, bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f18995x.compareAndSet(true, false)) {
            a(this.i);
        }
        try {
            if (this.f18969A != null) {
                this.f18969A.adReceived(appLovinAd);
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
            com.applovin.impl.sdk.k kVar = this.f18975c;
            if (kVar != null) {
                kVar.E().a("AppLovinAdView", "notifyAdLoadedCallback", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i) {
        try {
            if (this.f18969A != null) {
                this.f18969A.failedToReceiveAd(i);
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("AppLovinAdView", "Exception while running app load callback", th);
            com.applovin.impl.sdk.k kVar = this.f18975c;
            if (kVar != null) {
                kVar.E().a("AppLovinAdView", "notifyAdLoadFailedCallback", th);
            }
        }
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(b bVar) {
        this.f18979g = bVar;
    }

    private void a(String str, Map map) {
        a(b8.a(str, map));
    }

    private void a(String str) {
        if (this.f18990s == null || this.f18985n == null || !a7.a(this.f18990s.getSize()) || !StringUtils.isValidString(str)) {
            return;
        }
        this.f18985n.a(str);
    }

    public void a(Uri uri) {
        if (this.f18990s == null || !this.f18990s.K0()) {
            return;
        }
        if (this.f18986o == null) {
            this.f18975c.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f18975c.O().a("AppLovinAdView", "GA is not initialized. Cannot fire GA event");
                return;
            }
            return;
        }
        String queryParameter = uri.getQueryParameter("event_name");
        String queryParameter2 = uri.getQueryParameter("event_params_json");
        if (TextUtils.isEmpty(queryParameter)) {
            this.f18975c.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f18975c.O().a("AppLovinAdView", "Invalid GA event name. Cannot fire GA event");
                return;
            }
            return;
        }
        a(new Z.e(this, queryParameter2, queryParameter, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        String strI;
        if (StringUtils.isValidString(str)) {
            strI = Oo.h("gtag('event', '", str2, "', ", str, ");");
        } else {
            strI = C1154e9.i("gtag('event', '", str2, "')");
        }
        b8.a(this.f18986o, strI);
    }
}
