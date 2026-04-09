package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.StrictMode;
import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hl implements ta.a, hx, ix, mq, nq, vt, b2, p81, c80 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ hl f11904b = new hl(4);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ hl f11905c = new hl(8);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ hl f11906d = new hl(23);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ hl f11907e = new hl(24);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ hl f11908f = new hl(28);
    public static final /* synthetic */ hl g = new hl(29);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11909a;

    public /* synthetic */ hl(int i4) {
        this.f11909a = i4;
    }

    public static final qz f(final Context context, final h0 h0Var, final String str, final boolean z3, final boolean z10, final oe oeVar, final fl flVar, final za.a aVar, final mx0 mx0Var, final km.n nVar, final li liVar, final wp0 wp0Var, final yp0 yp0Var, final qh0 qh0Var, final jq0 jq0Var, final qd0 qd0Var) throws zz {
        sk.a(context);
        try {
            l31 l31Var = new l31() { // from class: com.google.android.gms.internal.ads.vz
                @Override // com.google.android.gms.internal.ads.l31
                public final Object b() {
                    h0 h0Var2 = h0Var;
                    String str2 = str;
                    boolean z11 = z3;
                    boolean z12 = z10;
                    qh0 qh0Var2 = qh0Var;
                    qd0 qd0Var2 = qd0Var;
                    ua.g gVar = mx0Var;
                    km.n nVar2 = nVar;
                    li liVar2 = liVar;
                    wp0 wp0Var2 = wp0Var;
                    yp0 yp0Var2 = yp0Var;
                    jq0 jq0Var2 = jq0Var;
                    oe oeVar2 = oeVar;
                    fl flVar2 = flVar;
                    za.a aVar2 = aVar;
                    Context context2 = context;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i4 = e00.f10631c0;
                        p00 p00Var = new p00(context2);
                        p00Var.setBaseContext(context2);
                        b00 b00Var = new b00(new e00(p00Var, h0Var2, str2, z11, oeVar2, flVar2, aVar2, gVar, nVar2, liVar2, wp0Var2, yp0Var2, jq0Var2), qd0Var2);
                        b00Var.setWebViewClient(ua.j.C.f35264f.G(b00Var, liVar2, z12, qh0Var2));
                        b00Var.setWebChromeClient(new pz(b00Var));
                        return b00Var;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object objB = l31Var.b();
                StrictMode.setThreadPolicy(threadPolicy);
                return (qz) objB;
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        } catch (Throwable th3) {
            throw new zz("Webview initialization failed.", th3);
        }
    }

    public static final void g(String str, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
            for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i4));
            }
            DesugarCollections.unmodifiableList(arrayList);
        }
    }

    @Override // com.google.android.gms.internal.ads.b2
    public x1[] a(Uri uri, Map map) {
        switch (this.f11909a) {
            case 23:
                AtomicInteger atomicInteger = fz.f11292u;
                return new x1[]{new v5(), new v4()};
            default:
                AtomicInteger atomicInteger2 = fz.f11292u;
                return new x1[]{new v5(), new v4(), new r5(r6.I8, 32, u51.f17096e)};
        }
    }

    @Override // com.google.android.gms.internal.ads.hx
    /* renamed from: b */
    public void mo164b() {
        int i4 = this.f11909a;
    }

    @Override // com.google.android.gms.internal.ads.ix
    public void c(Object obj) {
        switch (this.f11909a) {
            case 5:
                ya.a0.m("Ending javascript session.");
                kq kqVar = (kq) ((jq) obj);
                HashSet hashSet = kqVar.f13230b;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
                    ya.a0.m("Unregistering eventhandler: ".concat(String.valueOf(((oo) simpleEntry.getValue()).toString())));
                    kqVar.f13229a.b((String) simpleEntry.getKey(), (oo) simpleEntry.getValue());
                }
                hashSet.clear();
                break;
            case 6:
                fx.f11279f.execute(new dq((zp) obj, 2));
                break;
            case 28:
                ((va.a) obj).onAdClicked();
                break;
            default:
                ((j60) obj).c();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.nq
    public /* bridge */ /* synthetic */ JSONObject h(Object obj) {
        return (JSONObject) obj;
    }

    @Override // com.google.android.gms.internal.ads.mq
    public /* synthetic */ Object k(JSONObject jSONObject) {
        switch (this.f11909a) {
            case 7:
                return jSONObject;
            default:
                return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        }
    }

    public hl(int i4, int i10, String str) {
        this.f11909a = 2;
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public /* synthetic */ void mo163h(Object obj) {
        ((o40) obj).F1();
    }

    public hl(HashMap map) {
        this.f11909a = 3;
    }

    private final /* synthetic */ void i() {
    }

    private final void j() {
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.vt
    public void d(String str, Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.vt
    public void e(Throwable th2, String str, float f10) {
    }
}
