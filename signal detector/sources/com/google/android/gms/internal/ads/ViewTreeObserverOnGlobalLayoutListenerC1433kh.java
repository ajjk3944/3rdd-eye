package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import f4.InterfaceFutureC2326a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import o4.AbstractC2763b;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import q2.InterfaceC2806a;
import s2.BinderC2894d;
import s2.InterfaceC2893c;
import t2.AbstractC2907C;
import t2.C2911G;
import t2.C2917a;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.kh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1433kh extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, InterfaceC0828Yg {

    /* renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f15183q0 = 0;

    /* renamed from: C, reason: collision with root package name */
    public BinderC2894d f15184C;

    /* renamed from: D, reason: collision with root package name */
    public C0837Yp f15185D;

    /* renamed from: E, reason: collision with root package name */
    public C0820Xp f15186E;

    /* renamed from: F, reason: collision with root package name */
    public T2.d f15187F;

    /* renamed from: G, reason: collision with root package name */
    public final String f15188G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f15189H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f15190I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f15191J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f15192K;

    /* renamed from: L, reason: collision with root package name */
    public Boolean f15193L;
    public boolean M;

    /* renamed from: N, reason: collision with root package name */
    public final String f15194N;

    /* renamed from: O, reason: collision with root package name */
    public BinderC1541mh f15195O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f15196P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f15197Q;

    /* renamed from: R, reason: collision with root package name */
    public InterfaceC0482Ea f15198R;

    /* renamed from: S, reason: collision with root package name */
    public ViewTreeObserverOnGlobalLayoutListenerC0953bn f15199S;

    /* renamed from: T, reason: collision with root package name */
    public InterfaceC0920b8 f15200T;

    /* renamed from: U, reason: collision with root package name */
    public int f15201U;

    /* renamed from: V, reason: collision with root package name */
    public int f15202V;

    /* renamed from: W, reason: collision with root package name */
    public J9 f15203W;

    /* renamed from: a, reason: collision with root package name */
    public final C2026vh f15204a;

    /* renamed from: a0, reason: collision with root package name */
    public final J9 f15205a0;

    /* renamed from: b, reason: collision with root package name */
    public final H6 f15206b;
    public J9 b0;

    /* renamed from: c, reason: collision with root package name */
    public final C1068du f15207c;

    /* renamed from: c0, reason: collision with root package name */
    public final C0889ae f15208c0;

    /* renamed from: d, reason: collision with root package name */
    public final U9 f15209d;

    /* renamed from: d0, reason: collision with root package name */
    public int f15210d0;

    /* renamed from: e, reason: collision with root package name */
    public final C2951a f15211e;

    /* renamed from: e0, reason: collision with root package name */
    public BinderC2894d f15212e0;

    /* renamed from: f, reason: collision with root package name */
    public p2.g f15213f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f15214f0;

    /* renamed from: g, reason: collision with root package name */
    public final V2.h f15215g;

    /* renamed from: g0, reason: collision with root package name */
    public final F0.f f15216g0;

    /* renamed from: h, reason: collision with root package name */
    public final DisplayMetrics f15217h;

    /* renamed from: h0, reason: collision with root package name */
    public int f15218h0;
    public final float i;

    /* renamed from: i0, reason: collision with root package name */
    public int f15219i0;

    /* renamed from: j, reason: collision with root package name */
    public Qt f15220j;

    /* renamed from: j0, reason: collision with root package name */
    public int f15221j0;

    /* renamed from: k, reason: collision with root package name */
    public St f15222k;

    /* renamed from: k0, reason: collision with root package name */
    public int f15223k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15224l;

    /* renamed from: l0, reason: collision with root package name */
    public int f15225l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15226m;

    /* renamed from: m0, reason: collision with root package name */
    public HashMap f15227m0;

    /* renamed from: n, reason: collision with root package name */
    public C1649oh f15228n;

    /* renamed from: n0, reason: collision with root package name */
    public final WindowManager f15229n0;

    /* renamed from: o0, reason: collision with root package name */
    public final A8 f15230o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f15231p0;

    public ViewTreeObserverOnGlobalLayoutListenerC1433kh(C2026vh c2026vh, T2.d dVar, String str, boolean z6, H6 h6, U9 u9, C2951a c2951a, p2.g gVar, V2.h hVar, A8 a8, Qt qt, St st, C1068du c1068du) throws PackageManager.NameNotFoundException {
        St st2;
        String str2;
        super(c2026vh);
        this.f15224l = false;
        this.f15226m = false;
        this.M = true;
        this.f15194N = "";
        this.f15218h0 = -1;
        this.f15219i0 = -1;
        this.f15221j0 = -1;
        this.f15223k0 = -1;
        this.f15225l0 = -1;
        this.f15204a = c2026vh;
        this.f15187F = dVar;
        this.f15188G = str;
        this.f15191J = z6;
        this.f15206b = h6;
        this.f15207c = c1068du;
        this.f15209d = u9;
        this.f15211e = c2951a;
        this.f15213f = gVar;
        this.f15215g = hVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f15229n0 = windowManager;
        C2911G c2911g = p2.j.f22785C.f22790c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.f15217h = displayMetrics;
        this.i = displayMetrics.density;
        this.f15230o0 = a8;
        this.f15220j = qt;
        this.f15222k = st;
        this.f15216g0 = new F0.f(c2026vh.f17316a, this, this);
        this.f15231p0 = false;
        setBackgroundColor(0);
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Oc)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e6) {
            u2.k.f("Unable to enable Javascript.", e6);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        E9 e9 = H9.Nc;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) c2841s.f23270c.a(H9.ue)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        p2.j jVar = p2.j.f22785C;
        settings.setUserAgentString(jVar.f22790c.F(c2026vh, c2951a.f23784a));
        Context context = getContext();
        d5.y.s(context, new A2.B(settings, 4, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        N();
        addJavascriptInterface(new C1595nh(this, new L6(12, this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        C0889ae c0889ae = this.f15208c0;
        if (c0889ae != null) {
            L9 l9 = (L9) c0889ae.f13151c;
            K4.c cVarA = jVar.f22795h.a();
            if (cVarA != null) {
                ((ArrayBlockingQueue) cVarA.f2209b).offer(l9);
            }
        }
        L9 l92 = new L9(this.f15188G);
        C0889ae c0889ae2 = new C0889ae(l92);
        this.f15208c0 = c0889ae2;
        synchronized (l92.f9633c) {
        }
        if (((Boolean) c2841s.f23270c.a(H9.f8792n2)).booleanValue() && (st2 = this.f15222k) != null && (str2 = st2.f11269b) != null) {
            l92.c("gqi", str2);
        }
        J9 j9D = L9.d();
        this.f15205a0 = j9D;
        ((HashMap) c0889ae2.f13150b).put("native:view_create", j9D);
        Context contextCreatePackageContext = null;
        this.b0 = null;
        this.f15203W = null;
        if (B2.a.f519c == null) {
            B2.a.f519c = new B2.a(6);
        }
        B2.a aVar = B2.a.f519c;
        aVar.getClass();
        AbstractC2907C.m("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(c2026vh);
        if (!defaultUserAgent.equals(aVar.f521b)) {
            int i = J2.h.f2062c;
            try {
                contextCreatePackageContext = c2026vh.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (contextCreatePackageContext == null) {
                c2026vh.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(c2026vh)).apply();
            }
            aVar.f521b = defaultUserAgent;
        }
        AbstractC2907C.m("User agent is updated.");
        jVar.f22795h.f8977k.incrementAndGet();
    }

    public final void A(Boolean bool) {
        synchronized (this) {
            this.f15193L = bool;
        }
        p2.j.f22785C.f22795h.b(bool);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void A0() {
        AbstractC2907C.m("Cannot add text view to inner AdWebView");
    }

    public final synchronized Boolean B() {
        return this.f15193L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void B0(String str, String str2) throws Throwable {
        Throwable th;
        String str3;
        try {
            try {
                if (t0()) {
                    u2.k.h("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str4 = (String) C2841s.f23267e.f23270c.a(H9.f8803p0);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str4);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str3 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (JSONException e6) {
                        u2.k.i("Unable to build MRAID_ENV", e6);
                        str3 = null;
                    }
                    super.loadDataWithBaseURL(str, AbstractC1810rh.a(str2, str3), "text/html", "UTF-8", null);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final ArrayList C() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void C0(Context context) {
        C2026vh c2026vh = this.f15204a;
        c2026vh.setBaseContext(context);
        this.f15216g0.f1439e = c2026vh.f17316a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized BinderC2894d D0() {
        return this.f15212e0;
    }

    public final /* synthetic */ void E(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized C0820Xp E0() {
        return this.f15186E;
    }

    public final /* synthetic */ void F(String str) {
        super.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized boolean F0() {
        return this.f15191J;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final int G() {
        return getMeasuredHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void G0(int i, boolean z6, boolean z7) {
        InterfaceC2806a interfaceC2806a;
        InterfaceC2084wl interfaceC2084wl;
        BinderC0718Rp binderC0718Rp;
        int i3;
        InterfaceC2806a interfaceC2806a2;
        boolean z8;
        C1649oh c1649oh = this.f15228n;
        C1273hh c1273hh = c1649oh.f16008a;
        boolean zA = C1649oh.A(c1273hh.f14532a.F0(), c1273hh);
        boolean z9 = true;
        if (!zA && z7) {
            z9 = false;
        }
        if (zA) {
            interfaceC2806a = null;
            interfaceC2084wl = null;
        } else {
            interfaceC2806a = c1649oh.f16012e;
            interfaceC2084wl = null;
        }
        s2.k kVar = c1649oh.f16013f;
        InterfaceC2084wl interfaceC2084wl2 = interfaceC2084wl;
        InterfaceC2893c interfaceC2893c = c1649oh.f15995I;
        C2951a c2951a = c1273hh.f14532a.f15211e;
        InterfaceC2084wl interfaceC2084wl3 = z9 ? interfaceC2084wl2 : c1649oh.f16017k;
        if (C1649oh.z(c1273hh)) {
            binderC0718Rp = c1649oh.f16006U;
            i3 = i;
            z8 = z6;
            interfaceC2806a2 = interfaceC2806a;
        } else {
            binderC0718Rp = interfaceC2084wl2;
            i3 = i;
            interfaceC2806a2 = interfaceC2806a;
            z8 = z6;
        }
        c1649oh.a(new AdOverlayInfoParcel(interfaceC2806a2, kVar, interfaceC2893c, c1273hh, z8, i3, c2951a, interfaceC2084wl3, binderC0718Rp));
    }

    public final /* synthetic */ void H() {
        super.loadUrl("about:blank");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void H0(C0820Xp c0820Xp) {
        this.f15186E = c0820Xp;
    }

    public final synchronized void I() {
        try {
            C2911G.f23576l.post(new RunnableC1326ih(this, 1));
        } catch (Throwable th) {
            p2.j.f22785C.f22795h.f("AdWebViewImpl.loadUrlUnsafe", th);
            u2.k.i("Could not call loadUrl in destroy(). ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final Qt J() {
        return this.f15220j;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void J0(int i) {
        this.f15210d0 = i;
    }

    @Override // com.google.android.gms.internal.ads.M7
    public final void K(L7 l7) {
        boolean z6;
        synchronized (this) {
            z6 = l7.f9629j;
            this.f15196P = z6;
        }
        V(z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void K0(boolean z6) {
        BinderC2894d binderC2894d;
        int i = this.f15201U + (true != z6 ? -1 : 1);
        this.f15201U = i;
        if (i > 0 || (binderC2894d = this.f15184C) == null) {
            return;
        }
        binderC2894d.M3();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2084wl
    public final void L() {
        C1649oh c1649oh = this.f15228n;
        if (c1649oh != null) {
            c1649oh.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void L0(long j6, boolean z6) {
        HashMap map = new HashMap(2);
        map.put("success", true != z6 ? "0" : "1");
        map.put("duration", Long.toString(j6));
        a("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2084wl
    public final void M() {
        C1649oh c1649oh = this.f15228n;
        if (c1649oh != null) {
            c1649oh.M();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void M0(String str, AbstractC0454Cg abstractC0454Cg) {
        try {
            if (this.f15227m0 == null) {
                this.f15227m0 = new HashMap();
            }
            this.f15227m0.put(str, abstractC0454Cg);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void N() {
        Qt qt = this.f15220j;
        if (qt != null && qt.f10780m0) {
            u2.k.c("Disabling hardware acceleration on an overlay.");
            O();
            return;
        }
        if (!this.f15191J && !this.f15187F.b()) {
            u2.k.c("Enabling hardware acceleration on an AdView.");
            Q();
            return;
        }
        u2.k.c("Enabling hardware acceleration on an overlay.");
        Q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void N0(boolean z6, int i, String str, boolean z7, boolean z8) {
        C1649oh c1649oh = this.f15228n;
        C1273hh c1273hh = c1649oh.f16008a;
        boolean zF0 = c1273hh.f14532a.F0();
        boolean zA = C1649oh.A(zF0, c1273hh);
        boolean z9 = true;
        if (!zA && z7) {
            z9 = false;
        }
        InterfaceC2806a interfaceC2806a = zA ? null : c1649oh.f16012e;
        C0947bh c0947bh = zF0 ? null : new C0947bh(c1273hh, c1649oh.f16013f);
        InterfaceC1912tb interfaceC1912tb = c1649oh.i;
        BinderC0718Rp binderC0718Rp = null;
        InterfaceC1966ub interfaceC1966ub = c1649oh.f16016j;
        boolean z10 = z9;
        C0947bh c0947bh2 = c0947bh;
        InterfaceC2893c interfaceC2893c = c1649oh.f15995I;
        C2951a c2951a = c1273hh.f14532a.f15211e;
        InterfaceC2084wl interfaceC2084wl = z10 ? null : c1649oh.f16017k;
        if (C1649oh.z(c1273hh)) {
            binderC0718Rp = c1649oh.f16006U;
        }
        c1649oh.a(new AdOverlayInfoParcel(interfaceC2806a, c0947bh2, interfaceC1912tb, interfaceC1966ub, interfaceC2893c, c1273hh, z6, i, str, c2951a, interfaceC2084wl, binderC0718Rp, z8));
    }

    public final synchronized void O() {
        try {
            if (!this.f15192K) {
                setLayerType(1, null);
            }
            this.f15192K = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void O0() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void P(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void P0(boolean z6, int i, String str, boolean z7, String str2) {
        C1649oh c1649oh = this.f15228n;
        C1273hh c1273hh = c1649oh.f16008a;
        boolean zF0 = c1273hh.f14532a.F0();
        boolean zA = C1649oh.A(zF0, c1273hh);
        boolean z8 = true;
        if (!zA && z7) {
            z8 = false;
        }
        InterfaceC2806a interfaceC2806a = zA ? null : c1649oh.f16012e;
        C0947bh c0947bh = zF0 ? null : new C0947bh(c1273hh, c1649oh.f16013f);
        InterfaceC1912tb interfaceC1912tb = c1649oh.i;
        BinderC0718Rp binderC0718Rp = null;
        InterfaceC1966ub interfaceC1966ub = c1649oh.f16016j;
        boolean z9 = z8;
        C0947bh c0947bh2 = c0947bh;
        InterfaceC2893c interfaceC2893c = c1649oh.f15995I;
        C2951a c2951a = c1273hh.f14532a.f15211e;
        InterfaceC2084wl interfaceC2084wl = z9 ? null : c1649oh.f16017k;
        if (C1649oh.z(c1273hh)) {
            binderC0718Rp = c1649oh.f16006U;
        }
        c1649oh.a(new AdOverlayInfoParcel(interfaceC2806a, c0947bh2, interfaceC1912tb, interfaceC1966ub, interfaceC2893c, c1273hh, z6, i, str, str2, c2951a, interfaceC2084wl, binderC0718Rp));
    }

    public final synchronized void Q() {
        try {
            if (this.f15192K) {
                setLayerType(0, null);
            }
            this.f15192K = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final H6 Q0() {
        return this.f15206b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized String R() {
        return this.f15188G;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void R0(String str, Rx rx) {
        C1649oh c1649oh = this.f15228n;
        if (c1649oh != null) {
            synchronized (c1649oh.f16011d) {
                try {
                    List<InterfaceC0466Db> list = (List) c1649oh.f16010c.get(str);
                    if (list == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (InterfaceC0466Db interfaceC0466Db : list) {
                        if (interfaceC0466Db instanceof C1428kc) {
                            if (((C1428kc) interfaceC0466Db).f15169a.equals((InterfaceC0466Db) rx.f11090b)) {
                                arrayList.add(interfaceC0466Db);
                            }
                        }
                    }
                    list.removeAll(arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final synchronized void S() {
        if (this.f15214f0) {
            return;
        }
        this.f15214f0 = true;
        p2.j.f22785C.f22795h.f8977k.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void S0(InterfaceC0920b8 interfaceC0920b8) {
        this.f15200T = interfaceC0920b8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void T() {
        ViewTreeObserverOnGlobalLayoutListenerC0953bn viewTreeObserverOnGlobalLayoutListenerC0953bn = this.f15199S;
        if (viewTreeObserverOnGlobalLayoutListenerC0953bn != null) {
            C2911G.f23576l.post(new RunnableC0558Ii(9, viewTreeObserverOnGlobalLayoutListenerC0953bn));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void T0(int i) {
        J9 j9 = this.f15205a0;
        C0889ae c0889ae = this.f15208c0;
        if (i == 0) {
            AbstractC0933bL.g((L9) c0889ae.f13151c, j9, "aebb2");
        }
        AbstractC0933bL.g((L9) c0889ae.f13151c, j9, "aeh2");
        c0889ae.getClass();
        ((L9) c0889ae.f13151c).c("close_type", String.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put("version", this.f15211e.f23784a);
        a("onhide", map);
    }

    public final synchronized void U() {
        try {
            HashMap map = this.f15227m0;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((AbstractC0454Cg) it.next()).a();
                }
            }
            this.f15227m0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final boolean U0() {
        return false;
    }

    public final void V(boolean z6) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z6 ? "0" : "1");
        a("onAdVisibilityChanged", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void V0(s2.e eVar, boolean z6, boolean z7, String str) {
        this.f15228n.S(eVar, z6, z7, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final C1068du W0() {
        return this.f15207c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final C1726q3 X0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized AbstractC0454Cg Y0(String str) {
        HashMap map = this.f15227m0;
        if (map == null) {
            return null;
        }
        return (AbstractC0454Cg) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void Z0(boolean z6) {
        this.f15228n.f16004S = z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1322ic
    public final void a(String str, Map map) {
        try {
            p(str, q2.r.f23260g.f23261a.j(map));
        } catch (JSONException unused) {
            u2.k.h("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized C0837Yp a0() {
        return this.f15185D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized boolean a1() {
        return this.f15201U > 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1590nc
    public final void b(String str, JSONObject jSONObject) {
        f(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final View b0() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized InterfaceC0482Ea b1() {
        return this.f15198R;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1590nc
    public final void c(String str) {
        z(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void c0(BinderC1541mh binderC1541mh) {
        if (this.f15195O != null) {
            u2.k.e("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f15195O = binderC1541mh;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void c1() {
        this.f15231p0 = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized T2.d d0() {
        return this.f15187F;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void destroy() {
        View decorView;
        try {
            C0889ae c0889ae = this.f15208c0;
            if (c0889ae != null) {
                L9 l9 = (L9) c0889ae.f13151c;
                K4.c cVarA = p2.j.f22785C.f22795h.a();
                if (cVarA != null) {
                    ((ArrayBlockingQueue) cVarA.f2209b).offer(l9);
                }
            }
            F0.f fVar = this.f15216g0;
            fVar.f1437c = false;
            Activity activity = (Activity) fVar.f1439e;
            if (activity != null && fVar.f1435a) {
                ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = (ViewTreeObserverOnGlobalLayoutListenerC1433kh) fVar.f1440f;
                Window window = activity.getWindow();
                ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1433kh);
                }
                fVar.f1435a = false;
            }
            BinderC2894d binderC2894d = this.f15184C;
            if (binderC2894d != null) {
                binderC2894d.z();
                this.f15184C.y();
                this.f15184C = null;
            }
            this.f15185D = null;
            this.f15186E = null;
            this.f15228n.d();
            this.f15200T = null;
            this.f15213f = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.f15190I) {
                return;
            }
            p2.j.f22785C.f22786A.a(this);
            U();
            this.f15190I = true;
            if (!((Boolean) C2841s.f23267e.f23270c.a(H9.Yb)).booleanValue()) {
                AbstractC2907C.m("Destroying the WebView immediately...");
                s();
                return;
            }
            Activity activity2 = this.f15204a.f17316a;
            if (activity2 != null && activity2.isDestroyed()) {
                AbstractC2907C.m("Destroying the WebView immediately...");
                s();
            } else {
                AbstractC2907C.m("Initiating WebView self destruct sequence in 3...");
                AbstractC2907C.m("Loading blank page in WebView, 2...");
                I();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void e0(int i) {
        BinderC2894d binderC2894d = this.f15184C;
        if (binderC2894d != null) {
            binderC2894d.S3(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void e1() {
        HashMap map = new HashMap(3);
        p2.j jVar = p2.j.f22785C;
        map.put("app_muted", String.valueOf(jVar.i.d()));
        map.put("app_volume", String.valueOf(jVar.i.b()));
        map.put("device_volume", String.valueOf(C2917a.e(getContext())));
        a("volume", map);
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (t0()) {
            u2.k.k("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.Zb)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            AbstractC0640Nf.f10010f.a(new RunnableC0912b0(this, str, valueCallback, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1590nc
    public final void f(String str, String str2) {
        z(AbstractC1135f5.o(new StringBuilder(AbstractC2763b.b(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void f0(String str, String str2) {
        C1649oh c1649oh = this.f15228n;
        BinderC0718Rp binderC0718Rp = c1649oh.f16006U;
        C1273hh c1273hh = c1649oh.f16008a;
        c1649oh.a(new AdOverlayInfoParcel(c1273hh, c1273hh.f14532a.f15211e, str, str2, binderC0718Rp));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void f1(T2.d dVar) {
        this.f15187F = dVar;
        requestLayout();
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.f15190I) {
                        this.f15228n.d();
                        p2.j.f22785C.f22786A.a(this);
                        U();
                        S();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized BinderC1541mh g() {
        return this.f15195O;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void g0(String str, InterfaceC0466Db interfaceC0466Db) {
        C1649oh c1649oh = this.f15228n;
        if (c1649oh != null) {
            c1649oh.b(str, interfaceC0466Db);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void g1(boolean z6) {
        if (z6) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        BinderC2894d binderC2894d = this.f15184C;
        if (binderC2894d != null) {
            if (z6) {
                binderC2894d.f23469l.setBackgroundColor(0);
            } else {
                binderC2894d.f23469l.setBackgroundColor(-16777216);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final Activity h() {
        return this.f15204a.f17316a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void h1(boolean z6) {
        try {
            boolean z7 = this.f15191J;
            this.f15191J = z6;
            N();
            if (z6 != z7) {
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8810q0)).booleanValue()) {
                    if (!this.f15187F.b()) {
                    }
                }
                try {
                    p("onStateChanged", new JSONObject().put("state", true != z6 ? "default" : "expanded"));
                } catch (JSONException e6) {
                    u2.k.f("Error occurred while dispatching state change.", e6);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void i() {
        BinderC2894d binderC2894dX0 = x0();
        if (binderC2894dX0 != null) {
            binderC2894dX0.f23469l.f23484b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final Context i0() {
        return this.f15204a.f17318c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized boolean i1() {
        return this.M;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final J9 j() {
        return this.f15205a0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void j0() {
        if (this.f15203W == null) {
            C0889ae c0889ae = this.f15208c0;
            AbstractC0933bL.g((L9) c0889ae.f13151c, this.f15205a0, "aes2");
            J9 j9D = L9.d();
            this.f15203W = j9D;
            ((HashMap) c0889ae.f13150b).put("native:view_show", j9D);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.f15211e.f23784a);
        a("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void j1(String str, InterfaceC0466Db interfaceC0466Db) {
        C1649oh c1649oh = this.f15228n;
        if (c1649oh != null) {
            synchronized (c1649oh.f16011d) {
                try {
                    List list = (List) c1649oh.f16010c.get(str);
                    if (list == null) {
                        return;
                    }
                    list.remove(interfaceC0466Db);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final V2.h k() {
        return this.f15215g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void k1(boolean z6) {
        this.M = z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final C0889ae l() {
        return this.f15208c0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final /* synthetic */ C1649oh l0() {
        return this.f15228n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized boolean l1() {
        return this.f15189H;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void loadData(String str, String str2, String str3) {
        if (t0()) {
            u2.k.h("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (t0()) {
                    u2.k.h("#004 The webview is destroyed. Ignoring action.");
                } else {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void loadUrl(String str) {
        if (t0()) {
            u2.k.h("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            C2911G.f23576l.post(new CD(this, 16, str));
        } catch (Throwable th) {
            p2.j.f22785C.f22795h.f("AdWebViewImpl.loadUrl", th);
            u2.k.i("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final int m() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void m0(InterfaceC0482Ea interfaceC0482Ea) {
        this.f15198R = interfaceC0482Ea;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized String n() {
        return this.f15194N;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized InterfaceC0920b8 n0() {
        return this.f15200T;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized String o() {
        St st = this.f15222k;
        if (st == null) {
            return null;
        }
        return st.f11269b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void o0(C0837Yp c0837Yp) {
        this.f15185D = c0837Yp;
    }

    @Override // q2.InterfaceC2806a
    public final void onAdClicked() {
        C1649oh c1649oh = this.f15228n;
        if (c1649oh != null) {
            c1649oh.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            boolean z6 = true;
            if (!t0()) {
                F0.f fVar = this.f15216g0;
                fVar.f1436b = true;
                if (fVar.f1437c) {
                    fVar.h();
                }
            }
            if (this.f15231p0) {
                onResume();
                this.f15231p0 = false;
            }
            boolean z7 = this.f15196P;
            C1649oh c1649oh = this.f15228n;
            if (c1649oh == null || !c1649oh.F()) {
                z6 = z7;
            } else {
                if (!this.f15197Q) {
                    this.f15228n.K();
                    this.f15228n.N();
                    this.f15197Q = true;
                }
                u();
            }
            V(z6);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1649oh c1649oh;
        View decorView;
        synchronized (this) {
            try {
                if (!t0()) {
                    F0.f fVar = this.f15216g0;
                    fVar.f1436b = false;
                    Activity activity = (Activity) fVar.f1439e;
                    if (activity != null && fVar.f1435a) {
                        ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = (ViewTreeObserverOnGlobalLayoutListenerC1433kh) fVar.f1440f;
                        Window window = activity.getWindow();
                        ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1433kh);
                        }
                        fVar.f1435a = false;
                    }
                }
                super.onDetachedFromWindow();
                if (this.f15197Q && (c1649oh = this.f15228n) != null && c1649oh.F() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.f15228n.K();
                    this.f15228n.N();
                    this.f15197Q = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        V(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j6) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.nc)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            C2911G c2911g = p2.j.f22785C.f22790c;
            C2911G.u(getContext(), intent);
        } catch (ActivityNotFoundException e6) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            u2.k.c(sb.toString());
            p2.j.f22785C.f22795h.f("AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)), e6);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (t0()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zU = u();
        BinderC2894d binderC2894dX0 = x0();
        if (binderC2894dX0 != null && zU && binderC2894dX0.f23470m) {
            binderC2894dX0.f23470m = false;
            binderC2894dX0.f23462d.j0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC1433kh.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void onPause() {
        if (t0()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.Od)).booleanValue() && AbstractC0241a.k("MUTE_AUDIO")) {
                u2.k.c("Muting webview");
                int i = T0.f.f3557a;
                if (!U0.m.f3686h.b()) {
                    throw U0.m.a();
                }
                ((WebViewProviderBoundaryInterface) T0.f.c(this).f73b).setAudioMuted(true);
            }
        } catch (Exception e6) {
            u2.k.f("Could not pause webview.", e6);
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.Rd)).booleanValue()) {
                p2.j.f22785C.f22795h.f("AdWebViewImpl.onPause", e6);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void onResume() {
        if (t0()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.Od)).booleanValue() && AbstractC0241a.k("MUTE_AUDIO")) {
                u2.k.c("Unmuting webview");
                int i = T0.f.f3557a;
                if (!U0.m.f3686h.b()) {
                    throw U0.m.a();
                }
                ((WebViewProviderBoundaryInterface) T0.f.c(this).f73b).setAudioMuted(false);
            }
        } catch (Exception e6) {
            u2.k.f("Could not resume webview.", e6);
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.Rd)).booleanValue()) {
                p2.j.f22785C.f22795h.f("AdWebViewImpl.onResume", e6);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6 = ((Boolean) C2841s.f23267e.f23270c.a(H9.f8760i4)).booleanValue() && this.f15228n.H();
        if ((!this.f15228n.F() || this.f15228n.I()) && !z6) {
            H6 h6 = this.f15206b;
            if (h6 != null) {
                h6.f8555b.b(motionEvent);
            }
            U9 u9 = this.f15209d;
            if (u9 != null) {
                if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > u9.f11614a.getEventTime()) {
                    u9.f11614a = MotionEvent.obtain(motionEvent);
                } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > u9.f11615b.getEventTime()) {
                    u9.f11615b = MotionEvent.obtain(motionEvent);
                }
            }
        } else {
            synchronized (this) {
                try {
                    InterfaceC0482Ea interfaceC0482Ea = this.f15198R;
                    if (interfaceC0482Ea != null) {
                        interfaceC0482Ea.h(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (t0()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1322ic
    public final void p(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        u2.k.c("Dispatching AFMA event: ".concat(sb.toString()));
        z(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void p0(BinderC2894d binderC2894d) {
        this.f15184C = binderC2894d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized int q() {
        return this.f15210d0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final C2951a r() {
        return this.f15211e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void r0(BinderC2894d binderC2894d) {
        this.f15212e0 = binderC2894d;
    }

    public final synchronized void s() {
        AbstractC2907C.m("Destroying WebView!");
        S();
        C2911G.f23576l.post(new RunnableC1326ih(this, 0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void s0() {
        AbstractC0933bL.g((L9) this.f15208c0.f13151c, this.f15205a0, "aeh2");
        HashMap map = new HashMap(1);
        map.put("version", this.f15211e.f23784a);
        a("onhide", map);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C1649oh) {
            this.f15228n = (C1649oh) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (t0()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e6) {
            u2.k.f("Could not stop loading webview.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final WebView t() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized boolean t0() {
        return this.f15190I;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        if (r10.f15225l0 != r8) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.oh r0 = r10.f15228n
            boolean r0 = r0.E()
            r1 = 0
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.oh r0 = r10.f15228n
            boolean r0 = r0.F()
            if (r0 == 0) goto L8e
        L11:
            q2.r r0 = q2.r.f23260g
            u2.f r0 = r0.f23261a
            android.util.DisplayMetrics r0 = r10.f15217h
            int r2 = r0.widthPixels
            float r2 = (float) r2
            float r3 = r0.density
            float r2 = r2 / r3
            int r4 = java.lang.Math.round(r2)
            int r2 = r0.heightPixels
            float r2 = (float) r2
            float r3 = r0.density
            float r2 = r2 / r3
            int r5 = java.lang.Math.round(r2)
            com.google.android.gms.internal.ads.vh r2 = r10.f15204a
            android.app.Activity r2 = r2.f17316a
            r3 = 1
            if (r2 == 0) goto L57
            android.view.Window r6 = r2.getWindow()
            if (r6 != 0) goto L39
            goto L57
        L39:
            p2.j r6 = p2.j.f22785C
            t2.G r6 = r6.f22790c
            int[] r2 = t2.C2911G.q(r2)
            r6 = r2[r1]
            float r6 = (float) r6
            float r7 = r0.density
            float r6 = r6 / r7
            int r6 = java.lang.Math.round(r6)
            r2 = r2[r3]
            float r2 = (float) r2
            float r7 = r0.density
            float r2 = r2 / r7
            int r2 = java.lang.Math.round(r2)
            r7 = r2
            goto L59
        L57:
            r6 = r4
            r7 = r5
        L59:
            p2.j r2 = p2.j.f22785C
            t2.G r2 = r2.f22790c
            android.view.WindowManager r2 = r10.f15229n0
            android.view.Display r2 = r2.getDefaultDisplay()
            int r8 = r2.getRotation()
            int r2 = r10.f15219i0
            if (r2 != r4) goto L8f
            int r2 = r10.f15218h0
            if (r2 != r5) goto L8f
            int r2 = r10.f15221j0
            if (r2 != r6) goto L8f
            int r2 = r10.f15223k0
            if (r2 != r7) goto L8f
            com.google.android.gms.internal.ads.E9 r2 = com.google.android.gms.internal.ads.H9.f8823s0
            q2.s r9 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r9 = r9.f23270c
            java.lang.Object r2 = r9.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L8e
            int r2 = r10.f15225l0
            if (r2 == r8) goto L8e
            goto L8f
        L8e:
            return r1
        L8f:
            int r2 = r10.f15219i0
            if (r2 != r4) goto Lad
            int r2 = r10.f15218h0
            if (r2 != r5) goto Lad
            com.google.android.gms.internal.ads.E9 r2 = com.google.android.gms.internal.ads.H9.f8823s0
            q2.s r9 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r9 = r9.f23270c
            java.lang.Object r2 = r9.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lae
            int r2 = r10.f15225l0
            if (r2 == r8) goto Lae
        Lad:
            r1 = r3
        Lae:
            r10.f15219i0 = r4
            r10.f15218h0 = r5
            r10.f15221j0 = r6
            r10.f15223k0 = r7
            r10.f15225l0 = r8
            com.google.android.gms.internal.ads.Ql r3 = new com.google.android.gms.internal.ads.Ql
            r2 = 9
            java.lang.String r9 = ""
            r3.<init>(r10, r2, r9)
            float r9 = r0.density
            r3.D(r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC1433kh.u():boolean");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final InterfaceFutureC2326a u0() {
        U9 u9 = this.f15209d;
        return u9 == null ? ED.f7928b : (AbstractC2221zD) AbstractC1984ut.E(AbstractC2221zD.r(ED.f7928b), ((Long) AbstractC1320ia.f14725c.v()).longValue(), TimeUnit.MILLISECONDS, u9.f11616c);
    }

    public final synchronized void v(String str) {
        if (t0()) {
            u2.k.h("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void v0(Qt qt, St st) {
        this.f15220j = qt;
        this.f15222k = st;
    }

    @Override // p2.g
    public final synchronized void w() {
        p2.g gVar = this.f15213f;
        if (gVar != null) {
            gVar.w();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void w0(boolean z6) {
        BinderC2894d binderC2894d = this.f15184C;
        if (binderC2894d != null) {
            binderC2894d.R3(this.f15228n.E(), z6);
        } else {
            this.f15189H = z6;
        }
    }

    @Override // p2.g
    public final synchronized void x() {
        p2.g gVar = this.f15213f;
        if (gVar != null) {
            gVar.x();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized BinderC2894d x0() {
        return this.f15184C;
    }

    public final synchronized void y(String str) {
        if (t0()) {
            u2.k.h("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final synchronized void y0(ViewTreeObserverOnGlobalLayoutListenerC0953bn viewTreeObserverOnGlobalLayoutListenerC0953bn) {
        this.f15199S = viewTreeObserverOnGlobalLayoutListenerC0953bn;
    }

    public final void z(String str) {
        if (B() == null) {
            synchronized (this) {
                Boolean boolC = p2.j.f22785C.f22795h.c();
                this.f15193L = boolC;
                if (boolC == null) {
                    try {
                        evaluateJavascript("(function(){})()", null);
                        A(Boolean.TRUE);
                    } catch (IllegalStateException unused) {
                        A(Boolean.FALSE);
                    }
                }
            }
        }
        if (B().booleanValue()) {
            y(str);
        } else {
            v("javascript:".concat(str));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final St z0() {
        return this.f15222k;
    }
}
