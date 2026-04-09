package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class i00 extends WebViewClient implements va.a, t80 {
    public static final /* synthetic */ int I = 0;
    public o50 A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public final HashSet F;
    public final qh0 G;
    public rz H;

    /* renamed from: a, reason: collision with root package name */
    public final b00 f12081a;

    /* renamed from: b, reason: collision with root package name */
    public final li f12082b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f12083c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12084d;

    /* renamed from: e, reason: collision with root package name */
    public va.a f12085e;

    /* renamed from: f, reason: collision with root package name */
    public xa.l f12086f;
    public m00 g;

    /* renamed from: h, reason: collision with root package name */
    public n00 f12087h;

    /* renamed from: i, reason: collision with root package name */
    public eo f12088i;
    public fo j;

    /* renamed from: k, reason: collision with root package name */
    public t80 f12089k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12090l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12091m;

    /* renamed from: n, reason: collision with root package name */
    public int f12092n;

    /* renamed from: o, reason: collision with root package name */
    public String f12093o;

    /* renamed from: p, reason: collision with root package name */
    public String f12094p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f12095q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12096r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12097s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f12098t;

    /* renamed from: u, reason: collision with root package name */
    public xa.c f12099u;

    /* renamed from: v, reason: collision with root package name */
    public ws f12100v;

    /* renamed from: w, reason: collision with root package name */
    public ua.a f12101w;

    /* renamed from: x, reason: collision with root package name */
    public ts f12102x;

    /* renamed from: y, reason: collision with root package name */
    public uv f12103y;

    /* renamed from: z, reason: collision with root package name */
    public qd0 f12104z;

    public i00(b00 b00Var, li liVar, boolean z3, qh0 qh0Var) {
        ws wsVar = new ws(b00Var, b00Var.U(), new nk(b00Var.getContext()));
        this.f12083c = new HashMap();
        this.f12084d = new Object();
        this.f12092n = 0;
        this.f12093o = "";
        this.f12094p = "";
        this.f12082b = liVar;
        this.f12081a = b00Var;
        this.f12095q = z3;
        this.f12100v = wsVar;
        this.f12102x = null;
        this.F = new HashSet(Arrays.asList(((String) va.s.f36163e.f36166c.a(sk.f16400x6)).split(",")));
        this.G = qh0Var;
    }

    public static WebResourceResponse l() {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16148h1)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public static final boolean o(b00 b00Var) {
        wp0 wp0Var = b00Var.f9521a.j;
        return wp0Var != null && wp0Var.b();
    }

    public static final boolean p(boolean z3, b00 b00Var) {
        return (!z3 || b00Var.f9521a.R().b() || b00Var.f9521a.B().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.t80
    public final void D() {
        t80 t80Var = this.f12089k;
        if (t80Var != null) {
            t80Var.D();
        }
    }

    public final void E() {
        synchronized (this.f12084d) {
        }
    }

    public final void F() {
        synchronized (this.f12084d) {
        }
    }

    public final void G() {
        uv uvVar = this.f12103y;
        if (uvVar != null) {
            b00 b00Var = this.f12081a;
            e00 e00Var = b00Var.f9521a;
            WeakHashMap weakHashMap = e4.v0.f22405a;
            if (e00Var.isAttachedToWindow()) {
                k(e00Var, uvVar, 10);
                return;
            }
            rz rzVar = this.H;
            if (rzVar != null) {
                b00Var.removeOnAttachStateChangeListener(rzVar);
            }
            rz rzVar2 = new rz(this, uvVar);
            this.H = rzVar2;
            b00Var.addOnAttachStateChangeListener(rzVar2);
        }
    }

    public final void H() {
        e00 e00Var;
        rt rtVar;
        m00 m00Var = this.g;
        b00 b00Var = this.f12081a;
        if (m00Var != null && ((this.B && this.D <= 0) || this.C || this.f12091m)) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16237n2)).booleanValue() && (rtVar = (e00Var = b00Var.f9521a).L) != null) {
                a80.h((vk) rtVar.f15754c, e00Var.J, "awfllc");
            }
            m00 m00Var2 = this.g;
            boolean z3 = false;
            if (!this.C && !this.f12091m) {
                z3 = true;
            }
            m00Var2.p(this.f12093o, this.f12092n, this.f12094p, z3);
            this.g = null;
        }
        e00 e00Var2 = b00Var.f9521a;
        if (e00Var2.K == null) {
            rt rtVar2 = e00Var2.L;
            rtVar2.getClass();
            uk ukVarD = vk.d();
            e00Var2.K = ukVarD;
            ((HashMap) rtVar2.f15753b).put("native:view_load", ukVarD);
        }
    }

    public final void I(xa.e eVar, boolean z3, boolean z10, String str) {
        boolean z11;
        b00 b00Var = this.f12081a;
        boolean zV0 = b00Var.f9521a.v0();
        boolean z12 = false;
        boolean z13 = p(zV0, b00Var) || z10;
        if (z13 || !z3) {
            z11 = zV0;
            z12 = true;
        } else {
            z11 = zV0;
        }
        a(new AdOverlayInfoParcel(eVar, z13 ? null : this.f12085e, z11 ? null : this.f12086f, this.f12099u, b00Var.f9521a.f10638e, b00Var, z12 ? null : this.f12089k, str));
    }

    public final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        xa.e eVar;
        ts tsVar = this.f12102x;
        if (tsVar != null) {
            synchronized (tsVar.f16931m) {
                z = tsVar.f16938t != null;
            }
        }
        ja.c cVar = ua.j.C.f35260b;
        ja.c.E(this.f12081a.getContext(), adOverlayInfoParcel, !z, this.f12104z);
        uv uvVar = this.f12103y;
        if (uvVar != null) {
            String str = adOverlayInfoParcel.f9028l;
            if (str == null && (eVar = adOverlayInfoParcel.f9019a) != null) {
                str = eVar.f37032b;
            }
            ((sv) uvVar).a(str);
        }
    }

    public final void b(String str, oo ooVar) {
        synchronized (this.f12084d) {
            try {
                HashMap map = this.f12083c;
                List copyOnWriteArrayList = (List) map.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    map.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(ooVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(String str) {
        synchronized (this.f12084d) {
            try {
                List list = (List) this.f12083c.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        uv uvVar = this.f12103y;
        if (uvVar != null) {
            ((sv) uvVar).c();
            this.f12103y = null;
        }
        rz rzVar = this.H;
        if (rzVar != null) {
            this.f12081a.removeOnAttachStateChangeListener(rzVar);
        }
        synchronized (this.f12084d) {
            try {
                this.f12083c.clear();
                this.f12085e = null;
                this.f12086f = null;
                this.g = null;
                this.f12087h = null;
                this.f12088i = null;
                this.j = null;
                this.f12090l = false;
                this.f12095q = false;
                this.f12096r = false;
                this.f12097s = false;
                this.f12099u = null;
                this.f12101w = null;
                this.f12100v = null;
                ts tsVar = this.f12102x;
                if (tsVar != null) {
                    tsVar.C(true);
                    this.f12102x = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02ea A[Catch: NoClassDefFoundError -> 0x001e, Exception -> 0x0021, TryCatch #14 {Exception -> 0x0021, NoClassDefFoundError -> 0x001e, blocks: (B:3:0x000c, B:5:0x001b, B:10:0x0024, B:12:0x0034, B:14:0x003b, B:16:0x0047, B:18:0x0065, B:20:0x007f, B:22:0x0096, B:23:0x0099, B:25:0x009c, B:28:0x00ba, B:31:0x00c2, B:33:0x00ce, B:35:0x00df, B:94:0x0226, B:84:0x01fc, B:106:0x02ea, B:109:0x02fc, B:111:0x0302, B:113:0x0310, B:95:0x025e, B:96:0x0297, B:83:0x01c6, B:52:0x0140, B:34:0x00d7, B:97:0x0298, B:99:0x02a2, B:101:0x02a8, B:103:0x02db), top: B:124:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0302 A[Catch: NoClassDefFoundError -> 0x001e, Exception -> 0x0021, TryCatch #14 {Exception -> 0x0021, NoClassDefFoundError -> 0x001e, blocks: (B:3:0x000c, B:5:0x001b, B:10:0x0024, B:12:0x0034, B:14:0x003b, B:16:0x0047, B:18:0x0065, B:20:0x007f, B:22:0x0096, B:23:0x0099, B:25:0x009c, B:28:0x00ba, B:31:0x00c2, B:33:0x00ce, B:35:0x00df, B:94:0x0226, B:84:0x01fc, B:106:0x02ea, B:109:0x02fc, B:111:0x0302, B:113:0x0310, B:95:0x025e, B:96:0x0297, B:83:0x01c6, B:52:0x0140, B:34:0x00d7, B:97:0x0298, B:99:0x02a2, B:101:0x02a8, B:103:0x02db), top: B:124:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0218 A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:87:0x0206, B:89:0x0218, B:93:0x0223), top: B:118:0x0206 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse e(java.lang.String r23, java.util.Map r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i00.e(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void f(Uri uri) {
        ya.a0.m("Received GMSG: ".concat(String.valueOf(uri)));
        String path = uri.getPath();
        List list = (List) this.f12083c.get(path);
        if (path == null || list == null) {
            ya.a0.m("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16384w7)).booleanValue() || ua.j.C.f35265h.a() == null) {
                return;
            }
            fx.f11274a.execute(new s(23, (path == null || path.length() < 2) ? "null" : path.substring(1)));
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        pk pkVar = sk.f16383w6;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && this.F.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) sVar.f36166c.a(sk.f16417y6)).intValue()) {
                ya.a0.m("Parsing gmsg query params on BG thread: ".concat(path));
                ya.f0 f0Var = ua.j.C.f35261c;
                f0Var.getClass();
                h91 h91VarZ = yo0.z(f0Var.f37449k, new ec.g1(5, uri));
                h91VarZ.a(new q81(0, h91VarZ, new aw(this, list, path, uri, 8)), fx.f11279f);
                return;
            }
        }
        ya.f0 f0Var2 = ua.j.C.f35261c;
        n(ya.f0.p(uri), list, path);
    }

    public final void g(boolean z3) {
        synchronized (this.f12084d) {
            this.f12098t = z3;
        }
    }

    public final void h(int i4, int i10) {
        ws wsVar = this.f12100v;
        if (wsVar != null) {
            wsVar.C(i4, i10);
        }
        ts tsVar = this.f12102x;
        if (tsVar != null) {
            synchronized (tsVar.f16931m) {
                tsVar.g = i4;
                tsVar.f16927h = i10;
            }
        }
    }

    public final void j(va.a aVar, eo eoVar, xa.l lVar, fo foVar, xa.c cVar, boolean z3, qo qoVar, ua.a aVar2, dz1 dz1Var, uv uvVar, lh0 lh0Var, ct0 ct0Var, qd0 qd0Var, po poVar, t80 t80Var, co coVar, co coVar2, po poVar2, t20 t20Var, be0 be0Var, s50 s50Var, o50 o50Var) {
        wp0 wp0Var;
        b00 b00Var = this.f12081a;
        ua.a aVar3 = aVar2 == null ? new ua.a(b00Var.getContext(), uvVar) : aVar2;
        this.f12102x = new ts(b00Var, dz1Var);
        this.f12103y = uvVar;
        pk pkVar = sk.f16284q1;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
            b("/adMetadata", new co(0, eoVar));
        }
        if (foVar != null) {
            b("/appEvent", new co(1, foVar));
        }
        b("/backButton", no.f14366e);
        b("/refresh", no.f14367f);
        b("/canOpenApp", io.f12397b);
        b("/canOpenURLs", io.f12401f);
        b("/canOpenIntents", io.f12398c);
        b("/close", no.f14362a);
        b("/customClose", no.f14363b);
        b("/instrument", no.f14369i);
        b("/delayPageLoaded", no.f14370k);
        b("/delayPageClosed", no.f14371l);
        b("/getLocationInfo", no.f14372m);
        b("/log", no.f14364c);
        b("/mraid", new ro(aVar3, this.f12102x, dz1Var));
        ws wsVar = this.f12100v;
        if (wsVar != null) {
            b("/mraidLoaded", wsVar);
        }
        ua.a aVar4 = aVar3;
        b("/open", new uo(aVar4, this.f12102x, lh0Var, qd0Var, t20Var, s50Var));
        b("/precache", new io(26));
        b("/touch", io.f12400e);
        b("/video", no.g);
        b("/videoMeta", no.f14368h);
        if (lh0Var == null || ct0Var == null) {
            b("/click", new lo(0, t80Var, t20Var));
            b("/httpTrack", io.f12399d);
        } else {
            b("/click", new q90(t80Var, t20Var, ct0Var, lh0Var));
            b("/httpTrack", new lo(6, ct0Var, lh0Var));
        }
        dw dwVar = ua.j.C.f35281y;
        Context context = b00Var.getContext();
        e00 e00Var = b00Var.f9521a;
        if (dwVar.a(context)) {
            HashMap map = new HashMap();
            wp0 wp0Var2 = e00Var.j;
            if (wp0Var2 != null) {
                map = wp0Var2.f18115w0;
            }
            b("/logScionEvent", new lo(1, b00Var.getContext(), map));
        }
        if (qoVar != null) {
            b("/setInterstitialProperties", new co(2, qoVar));
        }
        if (poVar != null && ((Boolean) rkVar2.a(sk.f16155ha)).booleanValue()) {
            b("/inspectorNetworkExtras", poVar);
        }
        if (((Boolean) rkVar2.a(sk.Aa)).booleanValue() && coVar != null) {
            b("/shareSheet", coVar);
        }
        if (((Boolean) rkVar2.a(sk.G8)).booleanValue() && be0Var != null) {
            b("/onDeviceStorageEvent", new co(3, be0Var));
        }
        if (((Boolean) rkVar2.a(sk.Fa)).booleanValue() && coVar2 != null) {
            b("/inspectorOutOfContextTest", coVar2);
        }
        if (((Boolean) rkVar2.a(sk.Ka)).booleanValue() && poVar2 != null) {
            b("/inspectorStorage", poVar2);
        }
        if (((Boolean) rkVar2.a(sk.Mc)).booleanValue()) {
            b("/bindPlayStoreOverlay", no.f14375p);
            b("/presentPlayStoreOverlay", no.f14376q);
            b("/expandPlayStoreOverlay", no.f14377r);
            b("/collapsePlayStoreOverlay", no.f14378s);
            b("/closePlayStoreOverlay", no.f14379t);
        }
        if (((Boolean) rkVar2.a(sk.V3)).booleanValue()) {
            b("/setPAIDPersonalizationEnabled", no.f14381v);
            b("/resetPAID", no.f14380u);
        }
        if (((Boolean) rkVar2.a(sk.f16144gd)).booleanValue() && (wp0Var = e00Var.j) != null && wp0Var.f18105r0) {
            b("/writeToLocalStorage", no.f14382w);
            b("/clearLocalStorageKeys", no.f14383x);
        }
        this.f12085e = aVar;
        this.f12086f = lVar;
        this.f12088i = eoVar;
        this.j = foVar;
        this.f12099u = cVar;
        this.f12101w = aVar4;
        this.f12089k = t80Var;
        this.f12104z = qd0Var;
        this.A = o50Var;
        this.f12090l = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.view.View r8, com.google.android.gms.internal.ads.uv r9, int r10) throws java.lang.IllegalStateException, org.json.JSONException, java.lang.InterruptedException, za.j {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.sv r9 = (com.google.android.gms.internal.ads.sv) r9
            com.google.android.gms.internal.ads.tv r0 = r9.g
            boolean r0 = r0.f16970c
            if (r0 == 0) goto Lb6
            boolean r1 = r9.j
            if (r1 != 0) goto Lb6
            if (r10 <= 0) goto Lb6
            if (r0 != 0) goto L12
            goto La0
        L12:
            if (r1 != 0) goto La0
            ua.j r0 = ua.j.C
            ya.f0 r0 = r0.f35261c
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L1d
            goto L78
        L1d:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2f
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2f
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2f
            if (r3 == 0) goto L31
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2f
            goto L32
        L2f:
            r2 = move-exception
            goto L38
        L31:
            r3 = r1
        L32:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L36
            goto L3e
        L36:
            r2 = move-exception
            goto L39
        L38:
            r3 = r1
        L39:
            java.lang.String r4 = "Fail to capture the web view"
            za.i.f(r4, r2)
        L3e:
            if (r3 != 0) goto L77
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L69
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L69
            if (r2 == 0) goto L6b
            if (r3 != 0) goto L4d
            goto L6b
        L4d:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L69
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L69
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L69
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L69
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L69
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L69
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L69
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L69
            r1 = r4
            goto L78
        L69:
            r2 = move-exception
            goto L71
        L6b:
            java.lang.String r2 = "Width or height of view is zero"
            za.i.h(r2)     // Catch: java.lang.RuntimeException -> L69
            goto L78
        L71:
            java.lang.String r3 = "Fail to capture the webview"
            za.i.f(r3, r2)
            goto L78
        L77:
            r1 = r3
        L78:
            if (r1 != 0) goto L80
            java.lang.String r0 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.jz.j(r0)
            goto La0
        L80:
            r9.j = r0
            com.google.android.gms.internal.ads.q81 r0 = new com.google.android.gms.internal.ads.q81
            r2 = 10
            r0.<init>(r2, r9, r1)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            if (r1 == r2) goto L9b
            r0.run()
            goto La0
        L9b:
            com.google.android.gms.internal.ads.ex r1 = com.google.android.gms.internal.ads.fx.f11274a
            r1.execute(r0)
        La0:
            com.google.android.gms.internal.ads.tv r0 = r9.g
            boolean r0 = r0.f16970c
            if (r0 == 0) goto Lb6
            boolean r0 = r9.j
            if (r0 != 0) goto Lb6
            ya.b0 r0 = ya.f0.f37440l
            com.google.android.gms.internal.ads.ry r1 = new com.google.android.gms.internal.ads.ry
            r1.<init>(r7, r8, r9, r10)
            r8 = 100
            r0.postDelayed(r1, r8)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i00.k(android.view.View, com.google.android.gms.internal.ads.uv, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
    
        r0 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0109, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010d, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010f, code lost:
    
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0111, code lost:
    
        r11 = r0.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011c, code lost:
    
        r0 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0124, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0126, code lost:
    
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0128, code lost:
    
        r0 = r0.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012d, code lost:
    
        if (r0.length != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0130, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0132, code lost:
    
        if (r1 >= r0.length) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0140, code lost:
    
        if (r0[r1].trim().startsWith("charset") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0142, code lost:
    
        r2 = r0[r1].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014f, code lost:
    
        if (r2.length <= 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0151, code lost:
    
        r4 = r2[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0158, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015b, code lost:
    
        r0 = r7.getHeaderFields();
        r15 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0174, code lost:
    
        if (r0.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0176, code lost:
    
        r1 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0180, code lost:
    
        if (r1.getKey() == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0186, code lost:
    
        if (r1.getValue() == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0192, code lost:
    
        if (r1.getValue().isEmpty() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0194, code lost:
    
        r15.put(r1.getKey(), r1.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01aa, code lost:
    
        r0 = ua.j.C.f35264f;
        r13 = r7.getResponseCode();
        r14 = r7.getResponseMessage();
        r16 = r7.getInputStream();
        r0.getClass();
        r10 = new android.webkit.WebResourceResponse(r11, r12, r13, r14, r15, r16);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse m(java.lang.String r18, java.util.Map r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i00.m(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void n(Map map, List list, String str) {
        if (ya.a0.o()) {
            ya.a0.m("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(str3);
                ya.a0.m(sb2.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((oo) it.next()).k(this.f12081a, map);
        }
    }

    @Override // va.a
    public final void onAdClicked() {
        va.a aVar = this.f12085e;
        if (aVar != null) {
            aVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        ya.a0.m("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            f(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Toolbar toolbar;
        synchronized (this.f12084d) {
            try {
                b00 b00Var = this.f12081a;
                if (b00Var.f9521a.g0()) {
                    ya.a0.m("Blank page loaded, 1...");
                    b00Var.j();
                    return;
                }
                this.B = true;
                n00 n00Var = this.f12087h;
                if (n00Var != null) {
                    n00Var.mo169b();
                    this.f12087h = null;
                }
                H();
                b00 b00Var2 = this.f12081a;
                if (b00Var2.f9521a.k0() != null) {
                    if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16158hd)).booleanValue() || (toolbar = b00Var2.f9521a.k0().f37062v) == null) {
                        return;
                    }
                    toolbar.setSubtitle(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i4, String str, String str2) {
        this.f12091m = true;
        this.f12092n = i4;
        this.f12093o = str;
        this.f12094p = str2;
    }

    public final void q(t20 t20Var, lh0 lh0Var, ct0 ct0Var) {
        c("/click");
        if (lh0Var != null && ct0Var != null) {
            b("/click", new q90(this.f12089k, t20Var, ct0Var, lh0Var));
            return;
        }
        t80 t80Var = this.f12089k;
        io ioVar = no.f14362a;
        b("/click", new lo(0, t80Var, t20Var));
    }

    public final void r(t20 t20Var, lh0 lh0Var, qd0 qd0Var) {
        c("/open");
        b("/open", new uo(this.f12101w, this.f12102x, lh0Var, qd0Var, t20Var, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            String string = webResourceRequest.getUrl().toString();
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (!(webView instanceof qz)) {
                za.i.h("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return null;
            }
            qz qzVar = (qz) webView;
            uv uvVar = this.f12103y;
            if (uvVar != null) {
                ((sv) uvVar).b(string, requestHeaders, 1);
            }
            if (!"mraid.js".equalsIgnoreCase(new File(string).getName())) {
                if (requestHeaders == null) {
                    requestHeaders = Collections.EMPTY_MAP;
                }
                return e(string, requestHeaders);
            }
            if (qzVar.X() != null) {
                i00 i00VarX = qzVar.X();
                synchronized (i00VarX.f12084d) {
                    i00VarX.f12090l = false;
                    i00VarX.f12095q = true;
                    fx.f11279f.execute(new s(22, i00VarX));
                }
            }
            if (qzVar.R().b()) {
                str = (String) va.s.f36163e.f36166c.a(sk.f16251o0);
            } else if (qzVar.v0()) {
                str = (String) va.s.f36163e.f36166c.a(sk.f16235n0);
            } else {
                str = (String) va.s.f36163e.f36166c.a(sk.f16220m0);
            }
            ua.j jVar = ua.j.C;
            ya.f0 f0Var = jVar.f35261c;
            Context context = qzVar.getContext();
            String str2 = qzVar.J1().f38129a;
            try {
                HashMap map = new HashMap();
                map.put("User-Agent", jVar.f35261c.F(context, str2));
                map.put("Cache-Control", "max-stale=3600");
                ya.p pVarA = new ya.r(context).a(0, str, map, null);
                String str3 = (String) pVarA.f11625a.get(60L, TimeUnit.SECONDS);
                if (str3 != null) {
                    return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes(StandardCharsets.UTF_8)));
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                za.i.i("Could not fetch MRAID JS.", e2);
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        ya.a0.m("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriB = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriB.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriB.getHost())) {
            f(uriB);
            return true;
        }
        boolean z3 = this.f12090l;
        b00 b00Var = this.f12081a;
        if (z3 && webView == b00Var.f9521a) {
            String scheme = uriB.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                va.a aVar = this.f12085e;
                if (aVar != null) {
                    aVar.onAdClicked();
                    uv uvVar = this.f12103y;
                    if (uvVar != null) {
                        ((sv) uvVar).a(str);
                    }
                    this.f12085e = null;
                }
                t80 t80Var = this.f12089k;
                if (t80Var != null) {
                    t80Var.x();
                    this.f12089k = null;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        e00 e00Var = b00Var.f9521a;
        e00 e00Var2 = b00Var.f9521a;
        if (e00Var.willNotDraw()) {
            za.i.h("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            return true;
        }
        try {
            oe oeVar = e00Var2.f10634b;
            jq0 jq0Var = e00Var2.f10636c;
            if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16216ld)).booleanValue() || jq0Var == null) {
                if (oeVar != null && oeVar.a(uriB)) {
                    uriB = oeVar.b(uriB, b00Var.getContext(), b00Var, b00Var.A1());
                }
            } else if (oeVar != null && oeVar.a(uriB)) {
                uriB = jq0Var.a(uriB, b00Var.getContext(), b00Var, b00Var.A1());
            }
        } catch (pe unused) {
            za.i.h("Unable to append parameter to URL: ".concat(String.valueOf(str)));
        }
        ua.a aVar2 = this.f12101w;
        if (aVar2 == null || aVar2.a()) {
            I(new xa.e("android.intent.action.VIEW", uriB.toString(), null, null, null, null, null, null), true, false, e00Var2.G1());
        } else {
            aVar2.b(str);
        }
        return true;
    }

    public final boolean t() {
        boolean z3;
        synchronized (this.f12084d) {
            z3 = this.f12095q;
        }
        return z3;
    }

    public final boolean u() {
        boolean z3;
        synchronized (this.f12084d) {
            z3 = this.f12096r;
        }
        return z3;
    }

    public final boolean v() {
        boolean z3;
        synchronized (this.f12084d) {
            z3 = this.f12097s;
        }
        return z3;
    }

    public final boolean w() {
        boolean z3;
        synchronized (this.f12084d) {
            z3 = this.f12098t;
        }
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.t80
    public final void x() {
        t80 t80Var = this.f12089k;
        if (t80Var != null) {
            t80Var.x();
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return e(str, Collections.EMPTY_MAP);
    }
}
