package com.google.android.gms.internal.ads;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e00 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, qz {

    /* renamed from: c0, reason: collision with root package name */
    public static final /* synthetic */ int f10631c0 = 0;
    public g00 A;
    public boolean B;
    public boolean C;
    public pm D;
    public wb0 E;
    public mh F;
    public int G;
    public int H;
    public uk I;
    public final uk J;
    public uk K;
    public final rt L;
    public int M;
    public xa.i N;
    public boolean O;
    public final p.r P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public HashMap V;
    public final WindowManager W;

    /* renamed from: a, reason: collision with root package name */
    public final p00 f10632a;

    /* renamed from: a0, reason: collision with root package name */
    public final li f10633a0;

    /* renamed from: b, reason: collision with root package name */
    public final oe f10634b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f10635b0;

    /* renamed from: c, reason: collision with root package name */
    public final jq0 f10636c;

    /* renamed from: d, reason: collision with root package name */
    public final fl f10637d;

    /* renamed from: e, reason: collision with root package name */
    public final za.a f10638e;

    /* renamed from: f, reason: collision with root package name */
    public ua.g f10639f;
    public final km.n g;

    /* renamed from: h, reason: collision with root package name */
    public final DisplayMetrics f10640h;

    /* renamed from: i, reason: collision with root package name */
    public final float f10641i;
    public wp0 j;

    /* renamed from: k, reason: collision with root package name */
    public yp0 f10642k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10643l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10644m;

    /* renamed from: n, reason: collision with root package name */
    public i00 f10645n;

    /* renamed from: o, reason: collision with root package name */
    public xa.i f10646o;

    /* renamed from: p, reason: collision with root package name */
    public xh0 f10647p;

    /* renamed from: q, reason: collision with root package name */
    public wh0 f10648q;

    /* renamed from: r, reason: collision with root package name */
    public h0 f10649r;

    /* renamed from: s, reason: collision with root package name */
    public final String f10650s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10651t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10652u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10653v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10654w;

    /* renamed from: x, reason: collision with root package name */
    public Boolean f10655x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10656y;

    /* renamed from: z, reason: collision with root package name */
    public final String f10657z;

    public e00(p00 p00Var, h0 h0Var, String str, boolean z3, oe oeVar, fl flVar, za.a aVar, ua.g gVar, km.n nVar, li liVar, wp0 wp0Var, yp0 yp0Var, jq0 jq0Var) throws PackageManager.NameNotFoundException {
        yp0 yp0Var2;
        String str2;
        super(p00Var);
        this.f10643l = false;
        this.f10644m = false;
        this.f10656y = true;
        this.f10657z = "";
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.f10632a = p00Var;
        this.f10649r = h0Var;
        this.f10650s = str;
        this.f10653v = z3;
        this.f10634b = oeVar;
        this.f10636c = jq0Var;
        this.f10637d = flVar;
        this.f10638e = aVar;
        this.f10639f = gVar;
        this.g = nVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.W = windowManager;
        ya.f0 f0Var = ua.j.C.f35261c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.f10640h = displayMetrics;
        this.f10641i = displayMetrics.density;
        this.f10633a0 = liVar;
        this.j = wp0Var;
        this.f10642k = yp0Var;
        this.P = new p.r(p00Var.f14823a, this, this);
        this.f10635b0 = false;
        setBackgroundColor(0);
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Qc)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            za.i.f("Unable to enable Javascript.", e2);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        pk pkVar = sk.Pc;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) sVar.f36166c.a(sk.f16391we)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        ua.j jVar = ua.j.C;
        settings.setUserAgentString(jVar.f35261c.F(p00Var, aVar.f38129a));
        Context context = getContext();
        t6.i0.y(context, new ec.p1(6, context, (Object) settings));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        F();
        addJavascriptInterface(new h00(this, new mx0(15, this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        rt rtVar = this.L;
        if (rtVar != null) {
            vk vkVar = (vk) rtVar.f15754c;
            com.google.android.gms.internal.consent_sdk.d dVarA = jVar.f35265h.a();
            if (dVarA != null) {
                ((ArrayBlockingQueue) dVarA.f19295a).offer(vkVar);
            }
        }
        vk vkVar2 = new vk(this.f10650s);
        rt rtVar2 = new rt(vkVar2);
        this.L = rtVar2;
        synchronized (vkVar2.f17639c) {
        }
        if (((Boolean) sVar.f36166c.a(sk.f16237n2)).booleanValue() && (yp0Var2 = this.f10642k) != null && (str2 = yp0Var2.f18820b) != null) {
            vkVar2.c("gqi", str2);
        }
        uk ukVarD = vk.d();
        this.J = ukVarD;
        ((HashMap) rtVar2.f15753b).put("native:view_create", ukVarD);
        Context contextCreatePackageContext = null;
        this.K = null;
        this.I = null;
        if (gb.a.f24624c == null) {
            gb.a.f24624c = new gb.a(2);
        }
        gb.a aVar2 = gb.a.f24624c;
        aVar2.getClass();
        ya.a0.m("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(p00Var);
        if (!defaultUserAgent.equals(aVar2.f24626b)) {
            AtomicBoolean atomicBoolean = nb.i.f29900a;
            try {
                contextCreatePackageContext = p00Var.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (contextCreatePackageContext == null) {
                p00Var.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(p00Var)).apply();
            }
            aVar2.f24626b = defaultUserAgent;
        }
        ya.a0.m("User agent is updated.");
        jVar.f35265h.f19201k.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void A0(long j, boolean z3) {
        HashMap map = new HashMap(2);
        map.put("success", true != z3 ? "0" : "1");
        map.put("duration", Long.toString(j));
        a("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final Activity A1() {
        return this.f10632a.f14823a;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized String B() {
        return this.f10650s;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void B0(String str, uy uyVar) {
        try {
            if (this.V == null) {
                this.V = new HashMap();
            }
            this.V.put(str, uyVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void B1() {
        xa.i iVarK0 = k0();
        if (iVarK0 != null) {
            iVarK0.f37052l.f37042b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void C() {
        wb0 wb0Var = this.E;
        if (wb0Var != null) {
            ya.f0.f37440l.post(new s30(8, wb0Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void C0(xa.e eVar, boolean z3, boolean z10, String str) {
        this.f10645n.I(eVar, z3, z10, str);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final uk C1() {
        return this.J;
    }

    @Override // com.google.android.gms.internal.ads.t80
    public final void D() {
        i00 i00Var = this.f10645n;
        if (i00Var != null) {
            i00Var.D();
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void D0(h0 h0Var) {
        this.f10649r = h0Var;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final km.n D1() {
        return this.g;
    }

    public final synchronized void E() {
        try {
            ya.f0.f37440l.post(new c00(this, 1));
        } catch (Throwable th2) {
            ua.j.C.f35265h.f("AdWebViewImpl.loadUrlUnsafe", th2);
            za.i.i("Could not call loadUrl in destroy(). ", th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void E0(boolean z3, int i4, String str, boolean z10, boolean z11) {
        i00 i00Var = this.f10645n;
        b00 b00Var = i00Var.f12081a;
        boolean zV0 = b00Var.f9521a.v0();
        boolean zP = i00.p(zV0, b00Var);
        boolean z12 = true;
        if (!zP && z10) {
            z12 = false;
        }
        va.a aVar = zP ? null : i00Var.f12085e;
        uz uzVar = zV0 ? null : new uz(b00Var, i00Var.f12086f);
        eo eoVar = i00Var.f12088i;
        qh0 qh0Var = null;
        fo foVar = i00Var.j;
        boolean z13 = z12;
        uz uzVar2 = uzVar;
        xa.c cVar = i00Var.f12099u;
        za.a aVar2 = b00Var.f9521a.f10638e;
        t80 t80Var = z13 ? null : i00Var.f12089k;
        if (i00.o(b00Var)) {
            qh0Var = i00Var.G;
        }
        i00Var.a(new AdOverlayInfoParcel(aVar, uzVar2, eoVar, foVar, cVar, b00Var, z3, i4, str, aVar2, t80Var, qh0Var, z11));
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final rt E1() {
        return this.L;
    }

    public final synchronized void F() {
        wp0 wp0Var = this.j;
        if (wp0Var != null && wp0Var.f18095m0) {
            za.i.c("Disabling hardware acceleration on an overlay.");
            G();
            return;
        }
        if (!this.f10653v && !this.f10649r.b()) {
            za.i.c("Enabling hardware acceleration on an AdView.");
            H();
            return;
        }
        za.i.c("Enabling hardware acceleration on an overlay.");
        H();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void F0() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized String F1() {
        return this.f10657z;
    }

    public final synchronized void G() {
        try {
            if (!this.f10654w) {
                setLayerType(1, null);
            }
            this.f10654w = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void G0(boolean z3, int i4, String str, boolean z10, String str2) {
        i00 i00Var = this.f10645n;
        b00 b00Var = i00Var.f12081a;
        boolean zV0 = b00Var.f9521a.v0();
        boolean zP = i00.p(zV0, b00Var);
        boolean z11 = true;
        if (!zP && z10) {
            z11 = false;
        }
        va.a aVar = zP ? null : i00Var.f12085e;
        uz uzVar = zV0 ? null : new uz(b00Var, i00Var.f12086f);
        eo eoVar = i00Var.f12088i;
        qh0 qh0Var = null;
        fo foVar = i00Var.j;
        boolean z12 = z11;
        uz uzVar2 = uzVar;
        xa.c cVar = i00Var.f12099u;
        za.a aVar2 = b00Var.f9521a.f10638e;
        t80 t80Var = z12 ? null : i00Var.f12089k;
        if (i00.o(b00Var)) {
            qh0Var = i00Var.G;
        }
        i00Var.a(new AdOverlayInfoParcel(aVar, uzVar2, eoVar, foVar, cVar, b00Var, z3, i4, str, str2, aVar2, t80Var, qh0Var));
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized String G1() {
        yp0 yp0Var = this.f10642k;
        if (yp0Var == null) {
            return null;
        }
        return yp0Var.f18820b;
    }

    public final synchronized void H() {
        try {
            if (this.f10654w) {
                setLayerType(0, null);
            }
            this.f10654w = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final oe H0() {
        return this.f10634b;
    }

    public final synchronized void I() {
        if (this.O) {
            return;
        }
        this.O = true;
        ua.j.C.f35265h.f19201k.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void I0(mh mhVar) {
        this.F = mhVar;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized int I1() {
        return this.M;
    }

    public final synchronized void J() {
        try {
            HashMap map = this.V;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((uy) it.next()).a();
                }
            }
            this.V = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void J0(int i4) {
        uk ukVar = this.J;
        rt rtVar = this.L;
        if (i4 == 0) {
            a80.h((vk) rtVar.f15754c, ukVar, "aebb2");
        }
        a80.h((vk) rtVar.f15754c, ukVar, "aeh2");
        rtVar.getClass();
        ((vk) rtVar.f15754c).c("close_type", String.valueOf(i4));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i4));
        map.put("version", this.f10638e.f38129a);
        a("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final za.a J1() {
        return this.f10638e;
    }

    public final void K(boolean z3) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z3 ? "0" : "1");
        a("onAdVisibilityChanged", map);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final boolean K0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final jq0 L0() {
        return this.f10636c;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized xh0 M() {
        return this.f10647p;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final r7 M0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void N0(boolean z3) {
        this.f10645n.E = z3;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized boolean O0() {
        return this.G > 0;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final int O1() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized uy P(String str) {
        HashMap map = this.V;
        if (map == null) {
            return null;
        }
        return (uy) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized pm P0() {
        return this.D;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void Q(g00 g00Var) {
        if (this.A != null) {
            za.i.e("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.A = g00Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void Q0() {
        this.f10635b0 = true;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized h0 R() {
        return this.f10649r;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void R0() {
        HashMap map = new HashMap(3);
        ua.j jVar = ua.j.C;
        map.put("app_muted", String.valueOf(jVar.f35266i.d()));
        map.put("app_volume", String.valueOf(jVar.f35266i.b()));
        map.put("device_volume", String.valueOf(ya.a.e(getContext())));
        a("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void S(int i4) {
        xa.i iVar = this.f10646o;
        if (iVar != null) {
            iVar.p4(i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void S0(boolean z3) {
        if (z3) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        xa.i iVar = this.f10646o;
        if (iVar != null) {
            if (z3) {
                iVar.f37052l.setBackgroundColor(0);
            } else {
                iVar.f37052l.setBackgroundColor(-16777216);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void T0(boolean z3) {
        try {
            boolean z10 = this.f10653v;
            this.f10653v = z3;
            F();
            if (z3 != z10) {
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16283q0)).booleanValue()) {
                    if (!this.f10649r.b()) {
                    }
                }
                try {
                    h("onStateChanged", new JSONObject().put("state", true != z3 ? "default" : "expanded"));
                } catch (JSONException e2) {
                    za.i.f("Error occurred while dispatching state change.", e2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final Context U() {
        return this.f10632a.f14825c;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void V(String str, String str2) {
        i00 i00Var = this.f10645n;
        qh0 qh0Var = i00Var.G;
        b00 b00Var = i00Var.f12081a;
        i00Var.a(new AdOverlayInfoParcel(b00Var, b00Var.f9521a.f10638e, str, str2, qh0Var));
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized boolean V0() {
        return this.f10656y;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void W(String str, ix0 ix0Var) {
        i00 i00Var = this.f10645n;
        if (i00Var != null) {
            synchronized (i00Var.f12084d) {
                try {
                    List<oo> list = (List) i00Var.f12083c.get(str);
                    if (list == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (oo ooVar : list) {
                        if (ooVar instanceof xp) {
                            if (((xp) ooVar).f18438a.equals((oo) ix0Var.f12502b)) {
                                arrayList.add(ooVar);
                            }
                        }
                    }
                    list.removeAll(arrayList);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void W0(String str, oo ooVar) {
        i00 i00Var = this.f10645n;
        if (i00Var != null) {
            synchronized (i00Var.f12084d) {
                try {
                    List list = (List) i00Var.f12083c.get(str);
                    if (list == null) {
                        return;
                    }
                    list.remove(ooVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final /* synthetic */ i00 X() {
        return this.f10645n;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void X0(boolean z3) {
        this.f10656y = z3;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized boolean Y0() {
        return this.f10651t;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void Z(String str, oo ooVar) {
        i00 i00Var = this.f10645n;
        if (i00Var != null) {
            i00Var.b(str, ooVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.vp
    public final void a(String str, Map map) {
        try {
            h(str, va.r.g.f36157a.j(map));
        } catch (JSONException unused) {
            za.i.h("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void a0() {
        if (this.I == null) {
            rt rtVar = this.L;
            a80.h((vk) rtVar.f15754c, this.J, "aes2");
            uk ukVarD = vk.d();
            this.I = ukVarD;
            ((HashMap) rtVar.f15753b).put("native:view_show", ukVarD);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.f10638e.f38129a);
        a("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void b0(pm pmVar) {
        this.D = pmVar;
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final void c(String str, JSONObject jSONObject) {
        f(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized mh c0() {
        return this.F;
    }

    @Override // ua.g
    public final synchronized void d() {
        ua.g gVar = this.f10639f;
        if (gVar != null) {
            gVar.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void d0(xh0 xh0Var) {
        this.f10647p = xh0Var;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.qz
    public final synchronized void destroy() {
        View decorView;
        try {
            rt rtVar = this.L;
            if (rtVar != null) {
                vk vkVar = (vk) rtVar.f15754c;
                com.google.android.gms.internal.consent_sdk.d dVarA = ua.j.C.f35265h.a();
                if (dVarA != null) {
                    ((ArrayBlockingQueue) dVarA.f19295a).offer(vkVar);
                }
            }
            p.r rVar = this.P;
            rVar.f30839e = false;
            Activity activity = (Activity) rVar.f30835a;
            if (activity != null && rVar.f30837c) {
                e00 e00Var = (e00) rVar.f30836b;
                Window window = activity.getWindow();
                ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(e00Var);
                }
                rVar.f30837c = false;
            }
            xa.i iVar = this.f10646o;
            if (iVar != null) {
                iVar.m();
                this.f10646o.l();
                this.f10646o = null;
            }
            this.f10647p = null;
            this.f10648q = null;
            this.f10645n.d();
            this.F = null;
            this.f10639f = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.f10652u) {
                return;
            }
            ua.j.C.A.a(this);
            J();
            this.f10652u = true;
            if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16046ac)).booleanValue()) {
                ya.a0.m("Destroying the WebView immediately...");
                j();
                return;
            }
            Activity activity2 = this.f10632a.f14823a;
            if (activity2 != null && activity2.isDestroyed()) {
                ya.a0.m("Destroying the WebView immediately...");
                j();
            } else {
                ya.a0.m("Initiating WebView self destruct sequence in 3...");
                ya.a0.m("Loading blank page in WebView, 2...");
                E();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (g0()) {
            za.i.k("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16063bc)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            fx.f11279f.c(new d1(this, str, valueCallback, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final void f(String str, String str2) {
        o(a0.g.p(new StringBuilder(r5.c.f(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void f0() {
        a80.h((vk) this.L.f15754c, this.J, "aeh2");
        HashMap map = new HashMap(1);
        map.put("version", this.f10638e.f38129a);
        a("onhide", map);
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.f10652u) {
                        this.f10645n.d();
                        ua.j.C.A.a(this);
                        J();
                        I();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final void g(String str) {
        o(str);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized boolean g0() {
        return this.f10652u;
    }

    @Override // com.google.android.gms.internal.ads.vp
    public final void h(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbO = r5.c.o("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        za.i.c("Dispatching AFMA event: ".concat(sbO.toString()));
        o(sbO.toString());
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final vd.b h0() {
        fl flVar = this.f10637d;
        return flVar == null ? s81.f15906b : (n81) yo0.E(n81.s(s81.f15906b), ((Long) tl.f16871c.u()).longValue(), TimeUnit.MILLISECONDS, flVar.f11201c);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void i0(wp0 wp0Var, yp0 yp0Var) {
        this.j = wp0Var;
        this.f10642k = yp0Var;
    }

    public final synchronized void j() {
        ya.a0.m("Destroying WebView!");
        I();
        ya.f0.f37440l.post(new c00(this, 0));
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void j0(boolean z3) {
        xa.i iVar = this.f10646o;
        if (iVar != null) {
            iVar.o4(this.f10645n.t(), z3);
        } else {
            this.f10651t = z3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        if (r10.U != r9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.i00 r0 = r10.f10645n
            boolean r0 = r0.t()
            r1 = 0
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.i00 r0 = r10.f10645n
            boolean r0 = r0.u()
            if (r0 == 0) goto L8e
        L11:
            va.r r0 = va.r.g
            za.d r0 = r0.f36157a
            android.util.DisplayMetrics r0 = r10.f10640h
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
            com.google.android.gms.internal.ads.p00 r2 = r10.f10632a
            android.app.Activity r2 = r2.f14823a
            r3 = 1
            if (r2 == 0) goto L57
            android.view.Window r6 = r2.getWindow()
            if (r6 != 0) goto L39
            goto L57
        L39:
            ua.j r6 = ua.j.C
            ya.f0 r6 = r6.f35261c
            int[] r2 = ya.f0.q(r2)
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
            ua.j r2 = ua.j.C
            ya.f0 r2 = r2.f35261c
            android.view.WindowManager r2 = r10.W
            android.view.Display r2 = r2.getDefaultDisplay()
            int r9 = r2.getRotation()
            int r2 = r10.R
            if (r2 != r4) goto L8f
            int r2 = r10.Q
            if (r2 != r5) goto L8f
            int r2 = r10.S
            if (r2 != r6) goto L8f
            int r2 = r10.T
            if (r2 != r7) goto L8f
            com.google.android.gms.internal.ads.pk r2 = com.google.android.gms.internal.ads.sk.f16314s0
            va.s r8 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r8 = r8.f36166c
            java.lang.Object r2 = r8.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L8e
            int r2 = r10.U
            if (r2 == r9) goto L8e
            goto L8f
        L8e:
            return r1
        L8f:
            int r2 = r10.R
            if (r2 != r4) goto Lad
            int r2 = r10.Q
            if (r2 != r5) goto Lad
            com.google.android.gms.internal.ads.pk r2 = com.google.android.gms.internal.ads.sk.f16314s0
            va.s r8 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r8 = r8.f36166c
            java.lang.Object r2 = r8.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lae
            int r2 = r10.U
            if (r2 == r9) goto Lae
        Lad:
            r1 = r3
        Lae:
            r10.R = r4
            r10.Q = r5
            r10.S = r6
            r10.T = r7
            r10.U = r9
            com.google.android.gms.internal.ads.rt r3 = new com.google.android.gms.internal.ads.rt
            r2 = 7
            java.lang.String r8 = ""
            r3.<init>(r2, r10, r8)
            float r8 = r0.density
            r3.B(r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e00.k():boolean");
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized xa.i k0() {
        return this.f10646o;
    }

    public final synchronized void l(String str) {
        if (g0()) {
            za.i.h("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void l0(xa.i iVar) {
        this.f10646o = iVar;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.qz
    public final synchronized void loadData(String str, String str2, String str3) {
        if (g0()) {
            za.i.h("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.qz
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (g0()) {
                    za.i.h("#004 The webview is destroyed. Ignoring action.");
                } else {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.qz
    public final synchronized void loadUrl(String str) {
        if (g0()) {
            za.i.h("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            ya.f0.f37440l.post(new q81(15, this, str));
        } catch (Throwable th2) {
            ua.j.C.f35265h.f("AdWebViewImpl.loadUrl", th2);
            za.i.i("Could not call loadUrl. ", th2);
        }
    }

    @Override // ua.g
    public final synchronized void m() {
        ua.g gVar = this.f10639f;
        if (gVar != null) {
            gVar.m();
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void m0(wb0 wb0Var) {
        this.E = wb0Var;
    }

    public final synchronized void n(String str) {
        if (g0()) {
            za.i.h("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final yp0 n0() {
        return this.f10642k;
    }

    public final void o(String str) {
        if (q() == null) {
            synchronized (this) {
                Boolean boolC = ua.j.C.f35265h.c();
                this.f10655x = boolC;
                if (boolC == null) {
                    try {
                        evaluateJavascript("(function(){})()", null);
                        p(Boolean.TRUE);
                    } catch (IllegalStateException unused) {
                        p(Boolean.FALSE);
                    }
                }
            }
        }
        if (q().booleanValue()) {
            n(str);
        } else {
            l("javascript:".concat(str));
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void o0() {
        ya.a0.m("Cannot add text view to inner AdWebView");
    }

    @Override // va.a
    public final void onAdClicked() {
        i00 i00Var = this.f10645n;
        if (i00Var != null) {
            i00Var.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            boolean z3 = true;
            if (!g0()) {
                p.r rVar = this.P;
                rVar.f30838d = true;
                if (rVar.f30839e) {
                    rVar.e();
                }
            }
            if (this.f10635b0) {
                onResume();
                this.f10635b0 = false;
            }
            boolean z10 = this.B;
            i00 i00Var = this.f10645n;
            if (i00Var == null || !i00Var.u()) {
                z3 = z10;
            } else {
                if (!this.C) {
                    this.f10645n.E();
                    this.f10645n.F();
                    this.C = true;
                }
                k();
            }
            K(z3);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        i00 i00Var;
        View decorView;
        synchronized (this) {
            try {
                if (!g0()) {
                    p.r rVar = this.P;
                    rVar.f30838d = false;
                    Activity activity = (Activity) rVar.f30835a;
                    if (activity != null && rVar.f30837c) {
                        e00 e00Var = (e00) rVar.f30836b;
                        Window window = activity.getWindow();
                        ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeOnGlobalLayoutListener(e00Var);
                        }
                        rVar.f30837c = false;
                    }
                }
                super.onDetachedFromWindow();
                if (this.C && (i00Var = this.f10645n) != null && i00Var.u() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.f10645n.E();
                    this.f10645n.F();
                    this.C = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        K(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16278pc)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            ya.f0 f0Var = ua.j.C.f35261c;
            ya.f0.u(getContext(), intent);
        } catch (ActivityNotFoundException e2) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb2.append("Couldn't find an Activity to view url/mimetype: ");
            sb2.append(str);
            sb2.append(" / ");
            sb2.append(str4);
            za.i.c(sb2.toString());
            ua.j.C.f35265h.f("AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)), e2);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (g0()) {
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
        boolean zK = k();
        xa.i iVarK0 = k0();
        if (iVarK0 != null && zK && iVarK0.f37053m) {
            iVarK0.f37053m = false;
            iVarK0.f37046d.a0();
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e00.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.qz
    public final void onPause() {
        if (g0()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) va.s.f36163e.f36166c.a(sk.Qd)).booleanValue() && ii.a.s("MUTE_AUDIO")) {
                za.i.c("Muting webview");
                int i4 = o6.f.f30411a;
                if (!p6.l.f31393h.b()) {
                    throw p6.l.a();
                }
                ((WebViewProviderBoundaryInterface) o6.f.c(this).f30195b).setAudioMuted(true);
            }
        } catch (Exception e2) {
            za.i.f("Could not pause webview.", e2);
            if (((Boolean) va.s.f36163e.f36166c.a(sk.Td)).booleanValue()) {
                ua.j.C.f35265h.f("AdWebViewImpl.onPause", e2);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.qz
    public final void onResume() {
        if (g0()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) va.s.f36163e.f36166c.a(sk.Qd)).booleanValue() && ii.a.s("MUTE_AUDIO")) {
                za.i.c("Unmuting webview");
                int i4 = o6.f.f30411a;
                if (!p6.l.f31393h.b()) {
                    throw p6.l.a();
                }
                ((WebViewProviderBoundaryInterface) o6.f.c(this).f30195b).setAudioMuted(false);
            }
        } catch (Exception e2) {
            za.i.f("Could not resume webview.", e2);
            if (((Boolean) va.s.f36163e.f36166c.a(sk.Td)).booleanValue()) {
                ua.j.C.f35265h.f("AdWebViewImpl.onResume", e2);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3 = ((Boolean) va.s.f36163e.f36166c.a(sk.i4)).booleanValue() && this.f10645n.v();
        if ((!this.f10645n.u() || this.f10645n.w()) && !z3) {
            oe oeVar = this.f10634b;
            if (oeVar != null) {
                oeVar.f14684b.b(motionEvent);
            }
            fl flVar = this.f10637d;
            if (flVar != null) {
                if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > flVar.f11199a.getEventTime()) {
                    flVar.f11199a = MotionEvent.obtain(motionEvent);
                } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > flVar.f11200b.getEventTime()) {
                    flVar.f11200b = MotionEvent.obtain(motionEvent);
                }
            }
        } else {
            synchronized (this) {
                try {
                    pm pmVar = this.D;
                    if (pmVar != null) {
                        pmVar.j(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (g0()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(Boolean bool) {
        synchronized (this) {
            this.f10655x = bool;
        }
        ua.j.C.f35265h.b(bool);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void p0(String str, String str2) throws Throwable {
        Throwable th2;
        String str3;
        try {
            try {
                if (g0()) {
                    za.i.h("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str4 = (String) va.s.f36163e.f36166c.a(sk.f16266p0);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str4);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str3 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (JSONException e2) {
                        za.i.i("Unable to build MRAID_ENV", e2);
                        str3 = null;
                    }
                    super.loadDataWithBaseURL(str, l00.a(str2, str3), "text/html", "UTF-8", null);
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public final synchronized Boolean q() {
        return this.f10655x;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void q0(xa.i iVar) {
        this.N = iVar;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final wp0 s() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void s0(Context context) {
        p00 p00Var = this.f10632a;
        p00Var.setBaseContext(context);
        this.P.f30835a = p00Var.f14823a;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.qz
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof i00) {
            this.f10645n = (i00) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (g0()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e2) {
            za.i.f("Could not stop loading webview.", e2);
        }
    }

    public final /* synthetic */ void t(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized xa.i t0() {
        return this.N;
    }

    public final /* synthetic */ void u(String str) {
        super.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized wh0 u0() {
        return this.f10648q;
    }

    public final /* synthetic */ void v() {
        super.loadUrl("about:blank");
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized boolean v0() {
        return this.f10653v;
    }

    @Override // com.google.android.gms.internal.ads.xg
    public final void w(wg wgVar) {
        boolean z3;
        synchronized (this) {
            z3 = wgVar.j;
            this.B = z3;
        }
        K(z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.qz
    public final void w0(int i4, boolean z3, boolean z10) {
        va.a aVar;
        t80 t80Var;
        qh0 qh0Var;
        int i10;
        va.a aVar2;
        boolean z11;
        i00 i00Var = this.f10645n;
        b00 b00Var = i00Var.f12081a;
        boolean zP = i00.p(b00Var.f9521a.v0(), b00Var);
        boolean z12 = true;
        if (!zP && z10) {
            z12 = false;
        }
        if (zP) {
            aVar = null;
            t80Var = null;
        } else {
            aVar = i00Var.f12085e;
            t80Var = null;
        }
        xa.l lVar = i00Var.f12086f;
        t80 t80Var2 = t80Var;
        xa.c cVar = i00Var.f12099u;
        za.a aVar3 = b00Var.f9521a.f10638e;
        t80 t80Var3 = z12 ? t80Var2 : i00Var.f12089k;
        if (i00.o(b00Var)) {
            qh0Var = i00Var.G;
            i10 = i4;
            z11 = z3;
            aVar2 = aVar;
        } else {
            qh0Var = t80Var2;
            i10 = i4;
            aVar2 = aVar;
            z11 = z3;
        }
        i00Var.a(new AdOverlayInfoParcel(aVar2, lVar, cVar, b00Var, z11, i10, aVar3, t80Var3, qh0Var));
    }

    @Override // com.google.android.gms.internal.ads.t80
    public final void x() {
        i00 i00Var = this.f10645n;
        if (i00Var != null) {
            i00Var.x();
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void x0(wh0 wh0Var) {
        this.f10648q = wh0Var;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final ArrayList y() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void y0(int i4) {
        this.M = i4;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final int z() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized void z0(boolean z3) {
        xa.i iVar;
        int i4 = this.G + (true != z3 ? -1 : 1);
        this.G = i4;
        if (i4 > 0 || (iVar = this.f10646o) == null) {
            return;
        }
        iVar.j4();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final synchronized g00 z1() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final View N() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final WebView i() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void A(int i4) {
    }
}
