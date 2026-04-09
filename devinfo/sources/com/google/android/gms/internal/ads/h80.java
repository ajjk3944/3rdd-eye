package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h80 implements c80, p81, pa.o, lr0, mq, nq, n40, xo0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h80 f11746b = new h80(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h80 f11747c = new h80(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h80 f11748d = new h80(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h80 f11749e = new h80(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h80 f11750f = new h80(4);
    public static final /* synthetic */ h80 g = new h80(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ h80 f11751h = new h80(6);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ h80 f11752i = new h80(7);
    public static final /* synthetic */ h80 j = new h80(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ h80 f11753k = new h80(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ h80 f11754l = new h80(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ h80 f11755m = new h80(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ h80 f11756n = new h80(12);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ h80 f11757o = new h80(13);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ h80 f11758p = new h80(14);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ h80 f11759q = new h80(15);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ h80 f11760r = new h80(19);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ h80 f11761s = new h80(20);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ h80 f11762t = new h80(21);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ h80 f11763u = new h80(22);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ h80 f11764v = new h80(25);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ h80 f11765w = new h80(26);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ h80 f11766x = new h80(27);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ h80 f11767y = new h80(28);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ h80 f11768z = new h80(29);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11769a;

    public /* synthetic */ h80(int i4) {
        this.f11769a = i4;
    }

    public static boolean f(Context context) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16040a6)).booleanValue()) {
            Boolean bool = (Boolean) r(new jm(context, 2));
            return bool != null && bool.booleanValue();
        }
        za.i.h("Omid flag is disabled");
        return false;
    }

    public static String g() {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16040a6)).booleanValue()) {
            return "a.1.5.2-google_20241009";
        }
        return null;
    }

    public static xh0 i(int i4, int i10, WebView webView, String str, String str2, String str3) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16040a6)).booleanValue() && jz.f12903z.f15871b) {
            return (xh0) r(new a8.g(i10, i4, webView, str, str2, str3));
        }
        return null;
    }

    public static void j(vt0 vt0Var) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16040a6)).booleanValue() && jz.f12903z.f15871b) {
            s(new rh0(vt0Var, 0));
        }
    }

    public static void l(vt0 vt0Var, View view) {
        s(new th0(vt0Var, view, 1));
    }

    public static final Set m(yd0 yd0Var, Executor executor) {
        return ((Boolean) wl.f18052a.u()).booleanValue() ? Collections.singleton(new q80(yd0Var, executor)) : Collections.EMPTY_SET;
    }

    public static au0 o(String str) {
        return "native".equals(str) ? au0.NATIVE : "javascript".equals(str) ? au0.JAVASCRIPT : au0.NONE;
    }

    public static yt0 p(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    return yt0.ONE_PIXEL;
                }
            } else if (str.equals("definedByJavascript")) {
                return yt0.DEFINED_BY_JAVASCRIPT;
            }
        } else if (str.equals("beginToRender")) {
            return yt0.BEGIN_TO_RENDER;
        }
        return yt0.UNSPECIFIED;
    }

    public static wt0 q(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                return wt0.HTML_DISPLAY;
            }
            return null;
        }
        if (iHashCode == 112202875) {
            if (str.equals("video")) {
                return wt0.VIDEO;
            }
            return null;
        }
        if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
            return wt0.NATIVE_DISPLAY;
        }
        return null;
    }

    public static final Object r(vh0 vh0Var) {
        try {
            return vh0Var.b();
        } catch (RuntimeException e2) {
            ua.j.C.f35265h.g("omid exception", e2);
            return null;
        }
    }

    public static final void s(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e2) {
            ua.j.C.f35265h.g("omid exception", e2);
        }
    }

    @Override // pa.o
    public /* synthetic */ void a(hl hlVar) {
        int i4 = this.f11769a;
    }

    @Override // com.google.android.gms.internal.ads.n40
    /* renamed from: b */
    public /* synthetic */ va.a2 mo165b() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.c80
    /* renamed from: c */
    public void mo162c(Object obj) {
        switch (this.f11769a) {
            case 0:
                ((j80) obj).d();
                break;
            case 1:
                ((k80) obj).e();
                break;
            case 2:
                ((k80) obj).z1();
                break;
            case 3:
                ((m80) obj).m();
                break;
            case 4:
                ((m80) obj).a();
                break;
            case 5:
                ((p80) obj).C1();
                break;
            case 6:
                ((t80) obj).D();
                break;
            case 7:
                ((t80) obj).x();
                break;
            case 8:
                v80 v80Var = (v80) obj;
                if (!v80Var.f17558d) {
                    v80Var.f17556b.a(v80Var.f17555a, v80Var.f17557c);
                    v80Var.f17558d = true;
                    break;
                }
                break;
            case 9:
                ((xo) obj).h();
                break;
            case 10:
                ((xo) obj).a();
                break;
            case 11:
                va.a2 a2VarX = ((mc0) obj).f13863a.X();
                va.b2 b2VarH1 = null;
                if (a2VarX != null) {
                    try {
                        b2VarH1 = a2VarX.H1();
                    } catch (RemoteException unused) {
                    }
                }
                if (b2VarH1 != null) {
                    try {
                        b2VarH1.z1();
                        break;
                    } catch (RemoteException e2) {
                        za.i.i("Unable to call onVideoEnd()", e2);
                        return;
                    }
                }
                break;
            case 12:
                ((mc0) obj).a();
                break;
            case 13:
                ((mc0) obj).getClass();
                break;
            case 14:
                ((mc0) obj).a();
                break;
            case 15:
                va.a2 a2VarX2 = ((mc0) obj).f13863a.X();
                va.b2 b2VarH12 = null;
                if (a2VarX2 != null) {
                    try {
                        b2VarH12 = a2VarX2.H1();
                    } catch (RemoteException unused2) {
                    }
                }
                if (b2VarH12 != null) {
                    try {
                        b2VarH12.e();
                        break;
                    } catch (RemoteException e10) {
                        za.i.i("Unable to call onVideoEnd()", e10);
                        return;
                    }
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            default:
                ((va.y) obj).m();
                break;
            case 26:
                ((va.y) obj).e();
                break;
            case 27:
                ((va.y) obj).C1();
                break;
            case 28:
                ((va.y) obj).A1();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.nq
    public JSONObject h(Object obj) throws JSONException {
        vg0 vg0Var = (vg0) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Aa)).booleanValue()) {
            ju juVar = vg0Var.f17622c;
            jSONObject2.put("ad_request_url", juVar.f12828f);
            jSONObject2.put("ad_request_post_body", juVar.f12825c);
        }
        ju juVar2 = vg0Var.f17622c;
        jSONObject2.put("base_url", juVar2.f12824b);
        jSONObject2.put("signals", vg0Var.f17621b);
        zg0 zg0Var = vg0Var.f17620a;
        jSONObject3.put("body", zg0Var.f19083c);
        jSONObject3.put("headers", va.r.g.f36157a.j(zg0Var.f19082b));
        jSONObject3.put("response_code", zg0Var.f19081a);
        jSONObject3.put("latency", zg0Var.f19084d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", juVar2.f12829h);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.mq
    public /* synthetic */ Object k(JSONObject jSONObject) {
        return new ju(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h, reason: collision with other method in class */
    public /* synthetic */ void mo163h(Object obj) {
        ((qz) obj).destroy();
    }

    private final /* synthetic */ void d(hl hlVar) {
    }

    private final /* synthetic */ void e(hl hlVar) {
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.lr0
    /* renamed from: c */
    public /* synthetic */ Object mo170c(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        ya.a0.m("Ad request signals:");
        ya.a0.m(jSONObject.toString(2));
        return jSONObject;
    }
}
