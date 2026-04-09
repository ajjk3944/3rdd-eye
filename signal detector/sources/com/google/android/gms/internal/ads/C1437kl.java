package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import j2.InterfaceC2559o;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import q2.InterfaceC2809b0;
import q2.InterfaceC2853y;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.kl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1437kl implements InterfaceC1223gl, BD, InterfaceC2559o, Eu, InterfaceC2183yc, InterfaceC2237zc, InterfaceC1759qj, InterfaceC1930tt {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15265a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15253b = new C1437kl(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15254c = new C1437kl(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15255d = new C1437kl(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15256e = new C1437kl(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15257f = new C1437kl(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15258g = new C1437kl(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15259h = new C1437kl(6);
    public static final /* synthetic */ C1437kl i = new C1437kl(7);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15260j = new C1437kl(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15261k = new C1437kl(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15262l = new C1437kl(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15263m = new C1437kl(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15264n = new C1437kl(12);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15242C = new C1437kl(13);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15243D = new C1437kl(14);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15244E = new C1437kl(15);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15245F = new C1437kl(16);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15246G = new C1437kl(20);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15247H = new C1437kl(21);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15248I = new C1437kl(22);

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15249J = new C1437kl(23);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15250K = new C1437kl(26);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15251L = new C1437kl(27);
    public static final /* synthetic */ C1437kl M = new C1437kl(28);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ C1437kl f15252N = new C1437kl(29);

    public /* synthetic */ C1437kl(int i3) {
        this.f15265a = i3;
    }

    public static boolean g(Context context) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.a6)).booleanValue()) {
            Boolean bool = (Boolean) p(new C2181ya(context));
            return bool != null && bool.booleanValue();
        }
        u2.k.h("Omid flag is disabled");
        return false;
    }

    public static String h() {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.a6)).booleanValue()) {
            return "a.1.5.2-google_20241009";
        }
        return null;
    }

    public static C0837Yp i(int i3, int i6, WebView webView, String str, String str2, String str3) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.a6)).booleanValue() && AbstractC0709Rg.f10942z.f16455b) {
            return (C0837Yp) p(new C0752Tp(i6, i3, webView, str, str2, str3));
        }
        return null;
    }

    public static void j(Rv rv) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.a6)).booleanValue() && AbstractC0709Rg.f10942z.f16455b) {
            q(new RunnableC0735Sp(rv, 0));
        }
    }

    public static void k(Rv rv, View view) {
        q(new RunnableC0769Up(rv, view, 1));
    }

    public static final Set l(C1117eo c1117eo, Executor executor) {
        return ((Boolean) AbstractC1480la.f15412a.v()).booleanValue() ? Collections.singleton(new C1922tl(c1117eo, executor)) : Collections.EMPTY_SET;
    }

    public static Wv m(String str) {
        return "native".equals(str) ? Wv.NATIVE : "javascript".equals(str) ? Wv.JAVASCRIPT : Wv.NONE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.Uv n(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 1
            r3 = 2
            if (r0 == r1) goto L2a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L20
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L44
            if (r4 == r2) goto L41
            if (r4 == r3) goto L3e
            com.google.android.gms.internal.ads.Uv r4 = com.google.android.gms.internal.ads.Uv.UNSPECIFIED
            return r4
        L3e:
            com.google.android.gms.internal.ads.Uv r4 = com.google.android.gms.internal.ads.Uv.ONE_PIXEL
            return r4
        L41:
            com.google.android.gms.internal.ads.Uv r4 = com.google.android.gms.internal.ads.Uv.DEFINED_BY_JAVASCRIPT
            return r4
        L44:
            com.google.android.gms.internal.ads.Uv r4 = com.google.android.gms.internal.ads.Uv.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1437kl.n(java.lang.String):com.google.android.gms.internal.ads.Uv");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.Sv o(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L20
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L43
            if (r4 == r3) goto L40
            if (r4 == r2) goto L3d
            r4 = 0
            return r4
        L3d:
            com.google.android.gms.internal.ads.Sv r4 = com.google.android.gms.internal.ads.Sv.VIDEO
            return r4
        L40:
            com.google.android.gms.internal.ads.Sv r4 = com.google.android.gms.internal.ads.Sv.NATIVE_DISPLAY
            return r4
        L43:
            com.google.android.gms.internal.ads.Sv r4 = com.google.android.gms.internal.ads.Sv.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1437kl.o(java.lang.String):com.google.android.gms.internal.ads.Sv");
    }

    public static final Object p(InterfaceC0803Wp interfaceC0803Wp) {
        try {
            return interfaceC0803Wp.mo8a();
        } catch (RuntimeException e6) {
            p2.j.f22785C.f22795h.g("omid exception", e6);
            return null;
        }
    }

    public static final void q(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e6) {
            p2.j.f22785C.f22795h.g("omid exception", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1759qj
    /* renamed from: a */
    public /* synthetic */ q2.B0 mo5a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public void mo4b(Object obj) {
        switch (this.f15265a) {
            case 0:
                ((InterfaceC1545ml) obj).b();
                break;
            case 1:
                ((InterfaceC1545ml) obj).d();
                break;
            case 2:
                ((InterfaceC1599nl) obj).e();
                break;
            case 3:
                ((InterfaceC1599nl) obj).g();
                break;
            case 4:
                ((InterfaceC1707pl) obj).z();
                break;
            case 5:
                ((InterfaceC1707pl) obj).a();
                break;
            case 6:
                ((InterfaceC1868sl) obj).j();
                break;
            case 7:
                ((InterfaceC2084wl) obj).M();
                break;
            case 8:
                ((InterfaceC2084wl) obj).L();
                break;
            case 9:
                C2192yl c2192yl = (C2192yl) obj;
                if (!c2192yl.f17753d) {
                    c2192yl.f17751b.a(c2192yl.f17750a, c2192yl.f17752c);
                    c2192yl.f17753d = true;
                    break;
                }
                break;
            case 10:
                ((InterfaceC0619Mb) obj).s();
                break;
            case 11:
                ((InterfaceC0619Mb) obj).a();
                break;
            case 12:
                q2.B0 b0X = ((C1763qn) obj).f16399a.X();
                q2.C0 c0P = null;
                if (b0X != null) {
                    try {
                        c0P = b0X.p();
                    } catch (RemoteException unused) {
                    }
                }
                if (c0P != null) {
                    try {
                        c0P.g();
                        break;
                    } catch (RemoteException e6) {
                        u2.k.i("Unable to call onVideoEnd()", e6);
                        return;
                    }
                }
                break;
            case 13:
                ((C1763qn) obj).a();
                break;
            case 14:
                ((C1763qn) obj).getClass();
                break;
            case 15:
                ((C1763qn) obj).a();
                break;
            case 16:
                q2.B0 b0X2 = ((C1763qn) obj).f16399a.X();
                q2.C0 c0P2 = null;
                if (b0X2 != null) {
                    try {
                        c0P2 = b0X2.p();
                    } catch (RemoteException unused2) {
                    }
                }
                if (c0P2 != null) {
                    try {
                        c0P2.e();
                        break;
                    } catch (RemoteException e7) {
                        u2.k.i("Unable to call onVideoEnd()", e7);
                        return;
                    }
                }
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            default:
                ((InterfaceC2809b0) obj).m();
                break;
            case 27:
                ((InterfaceC2853y) obj).h();
                break;
            case 28:
                ((InterfaceC2853y) obj).z();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2237zc
    public JSONObject d(Object obj) throws JSONException {
        C2088wp c2088wp = (C2088wp) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.ya)).booleanValue()) {
            C1861se c1861se = c2088wp.f17492c;
            jSONObject2.put("ad_request_url", c1861se.f16765f);
            jSONObject2.put("ad_request_post_body", c1861se.f16762c);
        }
        C1861se c1861se2 = c2088wp.f17492c;
        jSONObject2.put("base_url", c1861se2.f16761b);
        jSONObject2.put("signals", c2088wp.f17491b);
        C0429Ap c0429Ap = c2088wp.f17490a;
        jSONObject3.put("body", c0429Ap.f7050c);
        jSONObject3.put("headers", q2.r.f23260g.f23261a.j(c0429Ap.f7049b));
        jSONObject3.put("response_code", c0429Ap.f7048a);
        jSONObject3.put("latency", c0429Ap.f7051d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", c1861se2.f16767h);
        return jSONObject;
    }

    @Override // j2.InterfaceC2559o
    public /* synthetic */ void e(W9 w9) {
        int i3 = this.f15265a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2183yc
    public /* synthetic */ Object w(JSONObject jSONObject) {
        return new C1861se(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public /* synthetic */ void mo11d(Object obj) {
        ((InterfaceC0828Yg) obj).destroy();
    }

    private final /* synthetic */ void c(W9 w9) {
    }

    private final /* synthetic */ void f(W9 w9) {
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public /* synthetic */ Object b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        AbstractC2907C.m("Ad request signals:");
        AbstractC2907C.m(jSONObject.toString(2));
        return jSONObject;
    }
}
