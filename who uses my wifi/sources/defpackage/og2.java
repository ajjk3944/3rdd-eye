package defpackage;

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
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class og2 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, ag2 {
    public static final /* synthetic */ int h0 = 0;
    public boolean A;
    public boolean B;
    public Boolean C;
    public boolean D;
    public final String E;
    public qg2 F;
    public boolean G;
    public boolean H;
    public q12 I;
    public pt2 J;
    public fw1 K;
    public int L;
    public int M;
    public rz1 N;
    public final rz1 O;
    public rz1 P;
    public final vq2 Q;
    public int R;
    public jh1 S;
    public boolean T;
    public final n5 U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public int c0;
    public HashMap d0;
    public final WindowManager e0;
    public final yg2 f;
    public final cx1 f0;
    public final vs1 g;
    public boolean g0;
    public final m83 h;
    public final f02 i;
    public final e51 j;
    public gd4 k;
    public final l92 l;
    public final DisplayMetrics m;
    public final float n;
    public a83 o;
    public c83 p;
    public boolean q;
    public boolean r;
    public sg2 s;
    public jh1 t;
    public xz2 u;
    public wz2 v;
    public zq w;
    public final String x;
    public boolean y;
    public boolean z;

    public og2(yg2 yg2Var, zq zqVar, String str, boolean z, vs1 vs1Var, f02 f02Var, e51 e51Var, gd4 gd4Var, l92 l92Var, cx1 cx1Var, a83 a83Var, c83 c83Var, m83 m83Var) throws PackageManager.NameNotFoundException {
        c83 c83Var2;
        String str2;
        super(yg2Var);
        this.q = false;
        this.r = false;
        this.D = true;
        this.E = "";
        this.V = -1;
        this.W = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.f = yg2Var;
        this.w = zqVar;
        this.x = str;
        this.A = z;
        this.g = vs1Var;
        this.h = m83Var;
        this.i = f02Var;
        this.j = e51Var;
        this.k = gd4Var;
        this.l = l92Var;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.e0 = windowManager;
        lf4 lf4Var = hg4.C.c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.m = displayMetrics;
        this.n = displayMetrics.density;
        this.f0 = cx1Var;
        this.o = a83Var;
        this.p = c83Var;
        this.U = new n5(yg2Var.a, this, this);
        this.g0 = false;
        setBackgroundColor(0);
        if (((Boolean) tw1.e.c.a(mz1.rc)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            gi2.c0("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        iz1 iz1Var = mz1.qc;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) tw1Var.c.a(mz1.Xd)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        hg4 hg4Var = hg4.C;
        settings.setUserAgentString(hg4Var.c.D(yg2Var, e51Var.f));
        Context context = getContext();
        yb.u(context, new gs1(settings, context, 17));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        U();
        addJavascriptInterface(new rg2(this, new kf3(19, this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        vq2 vq2Var = this.Q;
        if (vq2Var != null) {
            tz1 tz1Var = (tz1) vq2Var.h;
            h2 h2VarA = hg4Var.h.a();
            if (h2VarA != null) {
                ((ArrayBlockingQueue) h2VarA.a).offer(tz1Var);
            }
        }
        tz1 tz1Var2 = new tz1(this.x);
        vq2 vq2Var2 = new vq2(tz1Var2);
        this.Q = vq2Var2;
        synchronized (tz1Var2.c) {
        }
        if (((Boolean) tw1Var.c.a(mz1.Y1)).booleanValue() && (c83Var2 = this.p) != null && (str2 = c83Var2.b) != null) {
            tz1Var2.c("gqi", str2);
        }
        rz1 rz1VarD = tz1.d();
        this.O = rz1VarD;
        ((HashMap) vq2Var2.g).put("native:view_create", rz1VarD);
        Context contextCreatePackageContext = null;
        this.P = null;
        this.N = null;
        if (gs3.o == null) {
            gs3.o = new gs3(4);
        }
        gs3 gs3Var = gs3.o;
        gs3Var.getClass();
        gi2.G("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(yg2Var);
        if (!defaultUserAgent.equals(gs3Var.g)) {
            int i = oz.c;
            try {
                contextCreatePackageContext = yg2Var.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (contextCreatePackageContext == null) {
                yg2Var.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(yg2Var)).apply();
            }
            gs3Var.g = defaultUserAgent;
        }
        gi2.G("User agent is updated.");
        hg4Var.h.k.incrementAndGet();
    }

    @Override // defpackage.ag2
    public final ArrayList A() {
        return new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Boolean r0 = r3.C     // Catch: java.lang.Throwable -> L71
            monitor-exit(r3)
            r1 = 0
            if (r0 != 0) goto L30
            monitor-enter(r3)
            hg4 r0 = defpackage.hg4.C     // Catch: java.lang.Throwable -> L22
            gd2 r0 = r0.h     // Catch: java.lang.Throwable -> L22
            java.lang.Object r2 = r0.a     // Catch: java.lang.Throwable -> L22
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.Boolean r0 = r0.j     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            r3.C = r0     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L20
            java.lang.String r0 = "(function(){})()"
            r3.evaluateJavascript(r0, r1)     // Catch: java.lang.Throwable -> L22 java.lang.IllegalStateException -> L24
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L22 java.lang.IllegalStateException -> L24
            r3.H(r0)     // Catch: java.lang.Throwable -> L22 java.lang.IllegalStateException -> L24
        L20:
            monitor-exit(r3)
            goto L30
        L22:
            r4 = move-exception
            goto L2e
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L22
            r3.H(r0)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r3)
            goto L30
        L2b:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r4     // Catch: java.lang.Throwable -> L22
        L2e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r4
        L30:
            monitor-enter(r3)
            java.lang.Boolean r0 = r3.C     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L51
            monitor-enter(r3)
            boolean r0 = r3.o0()     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L48
            r3.evaluateJavascript(r4, r1)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r3)
            goto L6b
        L46:
            r4 = move-exception
            goto L4f
        L48:
            java.lang.String r4 = "#004 The webview is destroyed. Ignoring action."
            defpackage.gi2.i0(r4)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r3)
            goto L6b
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L46
            throw r4
        L51:
            java.lang.String r0 = "javascript:"
            java.lang.String r4 = r0.concat(r4)
            monitor-enter(r3)
            boolean r0 = r3.o0()     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L65
            r3.loadUrl(r4)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r3)
            goto L6b
        L63:
            r4 = move-exception
            goto L6c
        L65:
            java.lang.String r4 = "#004 The webview is destroyed. Ignoring action."
            defpackage.gi2.i0(r4)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r3)
        L6b:
            return
        L6c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L63
            throw r4
        L6e:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6e
            throw r4
        L71:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og2.B(java.lang.String):void");
    }

    @Override // defpackage.ag2
    public final synchronized boolean B0() {
        return this.L > 0;
    }

    @Override // defpackage.fd1
    public final void C() {
        sg2 sg2Var = this.s;
        if (sg2Var != null) {
            sg2Var.C();
        }
    }

    @Override // defpackage.ag2
    public final synchronized q12 C0() {
        return this.I;
    }

    @Override // defpackage.ag2
    public final void D(String str, String str2) {
        sg2 sg2Var = this.s;
        pz2 pz2Var = sg2Var.K;
        jg2 jg2Var = sg2Var.f;
        sg2Var.a(new AdOverlayInfoParcel(jg2Var, jg2Var.f.j, str, str2, pz2Var));
    }

    @Override // defpackage.ag2
    public final void E(String str, vg0 vg0Var) {
        sg2 sg2Var = this.s;
        if (sg2Var != null) {
            synchronized (sg2Var.i) {
                try {
                    List<y32> list = (List) sg2Var.h.get(str);
                    if (list == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (y32 y32Var : list) {
                        if (y32Var instanceof n52) {
                            if (((n52) y32Var).f.equals((y32) vg0Var.g)) {
                                arrayList.add(y32Var);
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

    @Override // defpackage.ag2
    public final void E0(a83 a83Var, c83 c83Var) {
        this.o = a83Var;
        this.p = c83Var;
    }

    @Override // defpackage.ag2
    public final a83 F() {
        return this.o;
    }

    @Override // defpackage.ag2
    public final c83 F0() {
        return this.p;
    }

    @Override // defpackage.ag2
    public final synchronized void G(wz2 wz2Var) {
        this.v = wz2Var;
    }

    public final void H(Boolean bool) {
        synchronized (this) {
            this.C = bool;
        }
        gd2 gd2Var = hg4.C.h;
        synchronized (gd2Var.a) {
            gd2Var.j = bool;
        }
    }

    @Override // defpackage.ag2
    public final void H0() {
        gi2.G("Cannot add text view to inner AdWebView");
    }

    @Override // defpackage.ag2
    public final void I(boolean z, int i, String str, boolean z2, boolean z3) {
        sg2 sg2Var = this.s;
        jg2 jg2Var = sg2Var.f;
        boolean zY0 = jg2Var.f.Y0();
        boolean zO = sg2.O(zY0, jg2Var);
        boolean z4 = true;
        if (!zO && z2) {
            z4 = false;
        }
        fd1 fd1Var = zO ? null : sg2Var.j;
        fg2 fg2Var = zY0 ? null : new fg2(jg2Var, sg2Var.k);
        l32 l32Var = sg2Var.n;
        pz2 pz2Var = null;
        m32 m32Var = sg2Var.o;
        boolean z5 = z4;
        fg2 fg2Var2 = fg2Var;
        kf1 kf1Var = sg2Var.z;
        e51 e51Var = jg2Var.f.j;
        xp2 xp2Var = z5 ? null : sg2Var.p;
        if (sg2.J(jg2Var)) {
            pz2Var = sg2Var.K;
        }
        sg2Var.a(new AdOverlayInfoParcel(fd1Var, fg2Var2, l32Var, m32Var, kf1Var, jg2Var, z, i, str, e51Var, xp2Var, pz2Var, z3));
    }

    @Override // defpackage.ag2
    public final synchronized void J0(String str, String str2) throws Throwable {
        Throwable th;
        String str3;
        try {
            try {
                if (o0()) {
                    gi2.i0("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str4 = (String) tw1.e.c.a(mz1.a0);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str4);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str3 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (JSONException unused) {
                        gi2.q0(5);
                        str3 = null;
                    }
                    super.loadDataWithBaseURL(str, tg2.a(str2, str3), "text/html", "UTF-8", null);
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

    @Override // defpackage.ag2
    public final int K() {
        return getMeasuredHeight();
    }

    @Override // defpackage.ag2
    public final void K0() {
        this.g0 = true;
    }

    @Override // defpackage.ag2
    public final void L() {
        setBackgroundColor(0);
    }

    @Override // defpackage.ag2
    public final void L0() {
        boolean z;
        HashMap map = new HashMap(3);
        hg4 hg4Var = hg4.C;
        jd1 jd1Var = hg4Var.i;
        synchronized (jd1Var) {
            z = jd1Var.a;
        }
        map.put("app_muted", String.valueOf(z));
        map.put("app_volume", String.valueOf(hg4Var.i.a()));
        map.put("device_volume", String.valueOf(jd1.b(getContext())));
        a("volume", map);
    }

    @Override // defpackage.ag2
    public final void M(fc2 fc2Var, boolean z, boolean z2, String str) {
        this.s.d0(fc2Var, z, z2, str);
    }

    @Override // defpackage.ag2
    public final void M0(Context context) {
        yg2 yg2Var = this.f;
        yg2Var.setBaseContext(context);
        this.U.a = yg2Var.a;
    }

    @Override // defpackage.ag2
    public final synchronized void N(q12 q12Var) {
        this.I = q12Var;
    }

    @Override // defpackage.ag2
    public final synchronized void N0(boolean z) {
        if (z) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        jh1 jh1Var = this.t;
        if (jh1Var != null) {
            if (z) {
                jh1Var.q.setBackgroundColor(0);
            } else {
                jh1Var.q.setBackgroundColor(-16777216);
            }
        }
    }

    @Override // defpackage.gd4
    public final synchronized void O() {
        gd4 gd4Var = this.k;
        if (gd4Var != null) {
            gd4Var.O();
        }
    }

    @Override // defpackage.ag2
    public final synchronized jh1 O0() {
        return this.S;
    }

    @Override // defpackage.ag2
    public final void P() {
        if (this.N == null) {
            vq2 vq2Var = this.Q;
            pu1.t((tz1) vq2Var.h, this.O, "aes2");
            rz1 rz1VarD = tz1.d();
            this.N = rz1VarD;
            ((HashMap) vq2Var.g).put("native:view_show", rz1VarD);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.j.f);
        a("onshow", map);
    }

    @Override // defpackage.ag2
    public final synchronized void P0(boolean z) {
        try {
            boolean z2 = this.A;
            this.A = z;
            U();
            if (z != z2) {
                if (((Boolean) tw1.e.c.a(mz1.b0)).booleanValue()) {
                    if (!this.w.b()) {
                    }
                }
                try {
                    c("onStateChanged", new JSONObject().put("state", true != z ? "default" : "expanded"));
                } catch (JSONException e) {
                    gi2.c0("Error occurred while dispatching state change.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ void R(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // defpackage.ag2
    public final synchronized boolean R0() {
        return this.D;
    }

    public final /* synthetic */ void S(String str) {
        super.loadUrl(str);
    }

    @Override // defpackage.ov1
    public final void S0(nv1 nv1Var) {
        boolean z;
        synchronized (this) {
            z = nv1Var.j;
            this.G = z;
        }
        g0(z);
    }

    public final /* synthetic */ void T() {
        super.loadUrl("about:blank");
    }

    @Override // defpackage.ag2
    public final synchronized void T0(pt2 pt2Var) {
        this.J = pt2Var;
    }

    public final synchronized void U() {
        try {
            a83 a83Var = this.o;
            if (a83Var != null && a83Var.m0) {
                gi2.U("Disabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (!this.B) {
                            setLayerType(1, null);
                        }
                        this.B = true;
                    } finally {
                    }
                }
                return;
            }
            if (this.A || this.w.b()) {
                gi2.U("Enabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (this.B) {
                            setLayerType(0, null);
                        }
                        this.B = false;
                    } finally {
                    }
                }
                return;
            }
            gi2.U("Enabling hardware acceleration on an AdView.");
            synchronized (this) {
                try {
                    if (this.B) {
                        setLayerType(0, null);
                    }
                    this.B = false;
                } finally {
                }
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // defpackage.xp2
    public final void U0() {
        sg2 sg2Var = this.s;
        if (sg2Var != null) {
            sg2Var.U0();
        }
    }

    @Override // defpackage.ag2
    public final synchronized String V() {
        return this.x;
    }

    @Override // defpackage.ag2
    public final synchronized void V0(qg2 qg2Var) {
        if (this.F != null) {
            gi2.Z("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.F = qg2Var;
        }
    }

    @Override // defpackage.ag2
    public final vs1 W() {
        return this.g;
    }

    @Override // defpackage.ag2
    public final synchronized wz2 W0() {
        return this.v;
    }

    @Override // defpackage.ag2
    public final synchronized fw1 X() {
        return this.K;
    }

    @Override // defpackage.ag2
    public final synchronized void X0(boolean z) {
        this.D = z;
    }

    public final synchronized void Y() {
        if (this.T) {
            return;
        }
        this.T = true;
        hg4.C.h.k.decrementAndGet();
    }

    @Override // defpackage.ag2
    public final synchronized boolean Y0() {
        return this.A;
    }

    @Override // defpackage.ag2
    public final synchronized void Z(zq zqVar) {
        this.w = zqVar;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ag2
    public final void Z0(int i, boolean z, boolean z2) {
        fd1 fd1Var;
        xp2 xp2Var;
        pz2 pz2Var;
        int i2;
        fd1 fd1Var2;
        boolean z3;
        sg2 sg2Var = this.s;
        jg2 jg2Var = sg2Var.f;
        boolean zO = sg2.O(jg2Var.f.Y0(), jg2Var);
        boolean z4 = true;
        if (!zO && z2) {
            z4 = false;
        }
        if (zO) {
            fd1Var = null;
            xp2Var = null;
        } else {
            fd1Var = sg2Var.j;
            xp2Var = null;
        }
        ye4 ye4Var = sg2Var.k;
        xp2 xp2Var2 = xp2Var;
        kf1 kf1Var = sg2Var.z;
        e51 e51Var = jg2Var.f.j;
        xp2 xp2Var3 = z4 ? xp2Var2 : sg2Var.p;
        if (sg2.J(jg2Var)) {
            pz2Var = sg2Var.K;
            i2 = i;
            z3 = z;
            fd1Var2 = fd1Var;
        } else {
            pz2Var = xp2Var2;
            i2 = i;
            fd1Var2 = fd1Var;
            z3 = z;
        }
        sg2Var.a(new AdOverlayInfoParcel(fd1Var2, ye4Var, kf1Var, jg2Var, z3, i2, e51Var, xp2Var3, pz2Var));
    }

    @Override // defpackage.l52
    public final void a(String str, Map map) {
        try {
            c(str, sv1.f.a.i(map));
        } catch (JSONException unused) {
            gi2.i0("Could not convert parameters to JSON.");
        }
    }

    @Override // defpackage.ag2
    public final Context a0() {
        return this.f.c;
    }

    @Override // defpackage.ag2
    public final synchronized boolean a1() {
        return this.y;
    }

    @Override // defpackage.r52
    public final void b(String str, JSONObject jSONObject) {
        s(str, jSONObject.toString());
    }

    @Override // defpackage.ag2
    public final synchronized void b0() {
        pt2 pt2Var = this.J;
        if (pt2Var != null) {
            lf4.l.post(new bs2(1, pt2Var));
        }
    }

    @Override // defpackage.ag2
    public final synchronized void b1(int i) {
        this.R = i;
    }

    @Override // defpackage.l52
    public final void c(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        gi2.U("Dispatching AFMA event: ".concat(sb.toString()));
        B(sb.toString());
    }

    @Override // defpackage.ag2
    public final synchronized void c0(jh1 jh1Var) {
        this.S = jh1Var;
    }

    @Override // defpackage.ag2
    public final int d() {
        return getMeasuredWidth();
    }

    public final synchronized void d0() {
        try {
            HashMap map = this.d0;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((ff2) it.next()).a();
                }
            }
            this.d0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ag2
    public final synchronized void d1(String str, ff2 ff2Var) {
        try {
            if (this.d0 == null) {
                this.d0 = new HashMap();
            }
            this.d0.put(str, ff2Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.webkit.WebView, defpackage.ag2
    public final synchronized void destroy() {
        View decorView;
        try {
            vq2 vq2Var = this.Q;
            if (vq2Var != null) {
                tz1 tz1Var = (tz1) vq2Var.h;
                h2 h2VarA = hg4.C.h.a();
                if (h2VarA != null) {
                    ((ArrayBlockingQueue) h2VarA.a).offer(tz1Var);
                }
            }
            n5 n5Var = this.U;
            n5Var.e = false;
            Activity activity = (Activity) n5Var.a;
            if (activity != null && n5Var.c) {
                og2 og2Var = (og2) n5Var.b;
                Window window = activity.getWindow();
                ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(og2Var);
                }
                n5Var.c = false;
            }
            jh1 jh1Var = this.t;
            if (jh1Var != null) {
                jh1Var.y();
                this.t.x();
                this.t = null;
            }
            this.u = null;
            this.v = null;
            this.s.e();
            this.K = null;
            this.k = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.z) {
                return;
            }
            hg4.C.A.a(this);
            d0();
            this.z = true;
            if (!((Boolean) tw1.e.c.a(mz1.Bb)).booleanValue()) {
                gi2.G("Destroying the WebView immediately...");
                r();
                return;
            }
            Activity activity2 = this.f.a;
            if (activity2 != null && activity2.isDestroyed()) {
                gi2.G("Destroying the WebView immediately...");
                r();
                return;
            }
            gi2.G("Initiating WebView self destruct sequence in 3...");
            gi2.G("Loading blank page in WebView, 2...");
            synchronized (this) {
                try {
                    lf4.l.post(new kg2(this, 1));
                } catch (Throwable th) {
                    hg4.C.h.d("AdWebViewImpl.loadUrlUnsafe", th);
                    gi2.q0(5);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // defpackage.gd4
    public final synchronized void e() {
        gd4 gd4Var = this.k;
        if (gd4Var != null) {
            gd4Var.e();
        }
    }

    @Override // defpackage.ag2
    public final /* synthetic */ sg2 e0() {
        return this.s;
    }

    @Override // defpackage.ag2
    public final synchronized void e1(boolean z) {
        jh1 jh1Var;
        int i = this.L + (true != z ? -1 : 1);
        this.L = i;
        if (i > 0 || (jh1Var = this.t) == null) {
            return;
        }
        synchronized (jh1Var.s) {
            try {
                jh1Var.v = true;
                bs2 bs2Var = jh1Var.u;
                if (bs2Var != null) {
                    i63 i63Var = lf4.l;
                    i63Var.removeCallbacks(bs2Var);
                    i63Var.post(jh1Var.u);
                }
            } finally {
            }
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (o0()) {
            gi2.p0("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) tw1.e.c.a(mz1.Cb)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            md2.f.a(new gi(this, str, valueCallback, 16));
        }
    }

    @Override // defpackage.ag2
    public final synchronized qg2 f() {
        return this.F;
    }

    @Override // defpackage.ag2
    public final g4 f0() {
        return null;
    }

    @Override // defpackage.ag2
    public final void f1(String str, y32 y32Var) {
        sg2 sg2Var = this.s;
        if (sg2Var != null) {
            synchronized (sg2Var.i) {
                try {
                    List list = (List) sg2Var.h.get(str);
                    if (list == null) {
                        return;
                    }
                    list.remove(y32Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.z) {
                        this.s.e();
                        hg4.C.A.a(this);
                        d0();
                        Y();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // defpackage.ag2
    public final Activity g() {
        return this.f.a;
    }

    public final void g0(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z ? "0" : "1");
        a("onAdVisibilityChanged", map);
    }

    @Override // defpackage.ag2
    public final void h0(int i) {
        rz1 rz1Var = this.O;
        vq2 vq2Var = this.Q;
        if (i == 0) {
            pu1.t((tz1) vq2Var.h, rz1Var, "aebb2");
        }
        pu1.t((tz1) vq2Var.h, rz1Var, "aeh2");
        vq2Var.getClass();
        ((tz1) vq2Var.h).c("close_type", String.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put("version", this.j.f);
        a("onhide", map);
    }

    @Override // defpackage.ag2
    public final void i() {
        jh1 jh1VarZ0 = z0();
        if (jh1VarZ0 != null) {
            jh1VarZ0.q.g = true;
        }
    }

    @Override // defpackage.ag2
    public final boolean i0() {
        return false;
    }

    @Override // defpackage.ag2
    public final rz1 j() {
        return this.O;
    }

    @Override // defpackage.ag2
    public final synchronized void j0(fw1 fw1Var) {
        this.K = fw1Var;
    }

    @Override // defpackage.ag2
    public final l92 k() {
        return this.l;
    }

    @Override // defpackage.ag2
    public final synchronized xz2 k0() {
        return this.u;
    }

    @Override // defpackage.r52
    public final void l(String str) {
        B(str);
    }

    @Override // defpackage.ag2
    public final void l0() {
        pu1.t((tz1) this.Q.h, this.O, "aeh2");
        HashMap map = new HashMap(1);
        map.put("version", this.j.f);
        a("onhide", map);
    }

    @Override // android.webkit.WebView, defpackage.ag2
    public final synchronized void loadData(String str, String str2, String str3) {
        if (o0()) {
            gi2.i0("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, defpackage.ag2
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (o0()) {
                    gi2.i0("#004 The webview is destroyed. Ignoring action.");
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

    @Override // android.webkit.WebView, defpackage.ag2
    public final synchronized void loadUrl(String str) {
        if (o0()) {
            gi2.i0("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            lf4.l.post(new n62(this, str, 11));
        } catch (Throwable th) {
            hg4.C.h.d("AdWebViewImpl.loadUrl", th);
            gi2.q0(5);
        }
    }

    @Override // defpackage.ag2
    public final vq2 m() {
        return this.Q;
    }

    @Override // defpackage.ag2
    public final synchronized void m0(xz2 xz2Var) {
        this.u = xz2Var;
    }

    @Override // defpackage.ag2
    public final synchronized String n() {
        return this.E;
    }

    @Override // defpackage.ag2
    public final synchronized String o() {
        c83 c83Var = this.p;
        if (c83Var == null) {
            return null;
        }
        return c83Var.b;
    }

    @Override // defpackage.ag2
    public final synchronized boolean o0() {
        return this.z;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            boolean z = true;
            if (!o0()) {
                n5 n5Var = this.U;
                n5Var.d = true;
                if (n5Var.e) {
                    n5Var.d();
                }
            }
            if (this.g0) {
                onResume();
                this.g0 = false;
            }
            boolean z2 = this.G;
            sg2 sg2Var = this.s;
            if (sg2Var == null || !sg2Var.T()) {
                z = z2;
            } else {
                if (!this.H) {
                    synchronized (this.s.i) {
                    }
                    synchronized (this.s.i) {
                    }
                    this.H = true;
                }
                w();
            }
            g0(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        sg2 sg2Var;
        View decorView;
        synchronized (this) {
            try {
                if (!o0()) {
                    n5 n5Var = this.U;
                    n5Var.d = false;
                    Activity activity = (Activity) n5Var.a;
                    if (activity != null && n5Var.c) {
                        og2 og2Var = (og2) n5Var.b;
                        Window window = activity.getWindow();
                        ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeOnGlobalLayoutListener(og2Var);
                        }
                        n5Var.c = false;
                    }
                }
                super.onDetachedFromWindow();
                if (this.H && (sg2Var = this.s) != null && sg2Var.T() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    synchronized (this.s.i) {
                    }
                    synchronized (this.s.i) {
                    }
                    this.H = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) tw1.e.c.a(mz1.Qb)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            lf4 lf4Var = hg4.C.c;
            lf4.s(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            gi2.U(sb.toString());
            hg4.C.h.d("AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)), e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (o0()) {
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
        boolean zW = w();
        jh1 jh1VarZ0 = z0();
        if (jh1VarZ0 != null && zW && jh1VarZ0.r) {
            jh1VarZ0.r = false;
            jh1VarZ0.i.P();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og2.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, defpackage.ag2
    public final void onPause() {
        if (o0()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) tw1.e.c.a(mz1.rd)).booleanValue() && ob1.n("MUTE_AUDIO")) {
                gi2.U("Muting webview");
                int i = c81.a;
                if (!f81.g.b()) {
                    throw f81.a();
                }
                ((WebViewProviderBoundaryInterface) c81.a(this).g).setAudioMuted(true);
            }
        } catch (Exception e) {
            gi2.c0("Could not pause webview.", e);
            if (((Boolean) tw1.e.c.a(mz1.ud)).booleanValue()) {
                hg4.C.h.d("AdWebViewImpl.onPause", e);
            }
        }
    }

    @Override // android.webkit.WebView, defpackage.ag2
    public final void onResume() {
        if (o0()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) tw1.e.c.a(mz1.rd)).booleanValue() && ob1.n("MUTE_AUDIO")) {
                gi2.U("Unmuting webview");
                int i = c81.a;
                if (!f81.g.b()) {
                    throw f81.a();
                }
                ((WebViewProviderBoundaryInterface) c81.a(this).g).setAudioMuted(false);
            }
        } catch (Exception e) {
            gi2.c0("Could not resume webview.", e);
            if (((Boolean) tw1.e.c.a(mz1.ud)).booleanValue()) {
                hg4.C.h.d("AdWebViewImpl.onResume", e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            iz1 r0 = defpackage.mz1.R3
            tw1 r1 = defpackage.tw1.e
            kz1 r1 = r1.c
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L20
            sg2 r0 = r7.s
            java.lang.Object r3 = r0.i
            monitor-enter(r3)
            boolean r0 = r0.x     // Catch: java.lang.Throwable -> L22
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L20
            r0 = r1
            goto L25
        L20:
            r0 = r2
            goto L25
        L22:
            r8 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r8
        L25:
            sg2 r3 = r7.s
            boolean r3 = r3.T()
            if (r3 == 0) goto L3b
            sg2 r3 = r7.s
            java.lang.Object r4 = r3.i
            monitor-enter(r4)
            boolean r3 = r3.y     // Catch: java.lang.Throwable -> L38
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L3d
            goto L3b
        L38:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            throw r8
        L3b:
            if (r0 == 0) goto L4c
        L3d:
            monitor-enter(r7)
            q12 r0 = r7.I     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L48
            r0.e(r8)     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r8 = move-exception
            goto L4a
        L48:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L46
            goto L8f
        L4a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L46
            throw r8
        L4c:
            vs1 r0 = r7.g
            if (r0 == 0) goto L55
            rs1 r0 = r0.b
            r0.f(r8)
        L55:
            f02 r0 = r7.i
            if (r0 == 0) goto L8f
            int r3 = r8.getAction()
            if (r3 != r1) goto L75
            long r3 = r8.getEventTime()
            android.view.MotionEvent r1 = r0.a
            long r5 = r1.getEventTime()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L6e
            goto L75
        L6e:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r8)
            r0.a = r1
            goto L8f
        L75:
            int r1 = r8.getAction()
            if (r1 != 0) goto L8f
            long r3 = r8.getEventTime()
            android.view.MotionEvent r1 = r0.b
            long r5 = r1.getEventTime()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L8f
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r8)
            r0.b = r1
        L8f:
            boolean r0 = r7.o0()
            if (r0 == 0) goto L96
            return r2
        L96:
            boolean r8 = super.onTouchEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // defpackage.ag2
    public final synchronized int q() {
        return this.R;
    }

    @Override // defpackage.ag2
    public final synchronized void q0(jh1 jh1Var) {
        this.t = jh1Var;
    }

    public final synchronized void r() {
        gi2.G("Destroying WebView!");
        Y();
        lf4.l.post(new kg2(this, 0));
    }

    @Override // defpackage.r52
    public final void s(String str, String str2) {
        B(ex0.m(new StringBuilder(ga1.i(str, 1, String.valueOf(str2).length()) + 2), str, "(", str2, ");"));
    }

    @Override // defpackage.xp2
    public final void s0() {
        sg2 sg2Var = this.s;
        if (sg2Var != null) {
            sg2Var.s0();
        }
    }

    @Override // android.webkit.WebView, defpackage.ag2
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof sg2) {
            this.s = (sg2) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (o0()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            gi2.c0("Could not stop loading webview.", e);
        }
    }

    @Override // defpackage.ag2
    public final n70 t0() {
        f02 f02Var = this.i;
        return f02Var == null ? lq3.g : (gq3) pu1.N(gq3.r(lq3.g), ((Long) r02.c.w()).longValue(), TimeUnit.MILLISECONDS, f02Var.c);
    }

    @Override // defpackage.ag2
    public final e51 u() {
        return this.j;
    }

    @Override // defpackage.ag2
    public final m83 u0() {
        return this.h;
    }

    @Override // defpackage.ag2
    public final void v(boolean z, int i, String str, String str2, boolean z2) {
        sg2 sg2Var = this.s;
        jg2 jg2Var = sg2Var.f;
        boolean zY0 = jg2Var.f.Y0();
        boolean zO = sg2.O(zY0, jg2Var);
        boolean z3 = true;
        if (!zO && z2) {
            z3 = false;
        }
        fd1 fd1Var = zO ? null : sg2Var.j;
        fg2 fg2Var = zY0 ? null : new fg2(jg2Var, sg2Var.k);
        l32 l32Var = sg2Var.n;
        pz2 pz2Var = null;
        m32 m32Var = sg2Var.o;
        boolean z4 = z3;
        fg2 fg2Var2 = fg2Var;
        kf1 kf1Var = sg2Var.z;
        e51 e51Var = jg2Var.f.j;
        xp2 xp2Var = z4 ? null : sg2Var.p;
        if (sg2.J(jg2Var)) {
            pz2Var = sg2Var.K;
        }
        sg2Var.a(new AdOverlayInfoParcel(fd1Var, fg2Var2, l32Var, m32Var, kf1Var, jg2Var, z, i, str, str2, e51Var, xp2Var, pz2Var));
    }

    @Override // defpackage.ag2
    public final void v0(String str, y32 y32Var) {
        sg2 sg2Var = this.s;
        if (sg2Var != null) {
            sg2Var.b(str, y32Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (r11.c0 != r9) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w() {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og2.w():boolean");
    }

    @Override // defpackage.ag2
    public final synchronized ff2 w0(String str) {
        HashMap map = this.d0;
        if (map == null) {
            return null;
        }
        return (ff2) map.get(str);
    }

    @Override // defpackage.ag2
    public final synchronized zq x() {
        return this.w;
    }

    @Override // defpackage.ag2
    public final void x0(boolean z) {
        this.s.I = z;
    }

    @Override // defpackage.ag2
    public final synchronized void y(int i) {
        jh1 jh1Var = this.t;
        if (jh1Var != null) {
            jh1Var.I3(i);
        }
    }

    @Override // defpackage.ag2
    public final synchronized void y0(boolean z) {
        boolean z2;
        jh1 jh1Var = this.t;
        if (jh1Var == null) {
            this.y = z;
            return;
        }
        sg2 sg2Var = this.s;
        synchronized (sg2Var.i) {
            z2 = sg2Var.v;
        }
        jh1Var.H3(z2, z);
    }

    @Override // defpackage.ag2
    public final void z(long j, boolean z) {
        HashMap map = new HashMap(2);
        map.put("success", true != z ? "0" : "1");
        map.put("duration", Long.toString(j));
        a("onCacheAccessComplete", map);
    }

    @Override // defpackage.ag2
    public final synchronized jh1 z0() {
        return this.t;
    }

    @Override // defpackage.ag2
    public final View p0() {
        return this;
    }

    @Override // defpackage.ag2
    public final WebView t() {
        return this;
    }

    @Override // defpackage.ag2
    public final void Q(int i) {
    }
}
