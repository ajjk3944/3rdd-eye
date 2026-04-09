package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.StrictMode;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import o2.InterfaceC2760a;
import org.json.JSONArray;
import org.json.JSONObject;
import q2.InterfaceC2806a;
import t2.AbstractC2907C;
import u2.C2951a;

/* loaded from: classes.dex */
public final class W9 implements InterfaceC2760a, InterfaceC0674Pf, InterfaceC0691Qf, InterfaceC2183yc, InterfaceC2237zc, InterfaceC1107ee, InterfaceC2208z0, BD, InterfaceC1223gl {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ W9 f12179b = new W9(4);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ W9 f12180c = new W9(8);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ W9 f12181d = new W9(24);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ W9 f12182e = new W9(25);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ W9 f12183f = new W9(29);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12184a;

    public /* synthetic */ W9(int i) {
        this.f12184a = i;
    }

    public static final InterfaceC0828Yg g(final Context context, final T2.d dVar, final String str, final boolean z6, final boolean z7, final H6 h6, final U9 u9, final C2951a c2951a, final Nx nx, final V2.h hVar, final A8 a8, final Qt qt, final St st, final BinderC0718Rp binderC0718Rp, final C1068du c1068du, final C0784Vn c0784Vn) {
        H9.a(context);
        try {
            ZA za = new ZA() { // from class: com.google.android.gms.internal.ads.ch
                @Override // com.google.android.gms.internal.ads.ZA
                public final Object a() {
                    T2.d dVar2 = dVar;
                    String str2 = str;
                    boolean z8 = z6;
                    boolean z9 = z7;
                    BinderC0718Rp binderC0718Rp2 = binderC0718Rp;
                    C0784Vn c0784Vn2 = c0784Vn;
                    p2.g gVar = nx;
                    V2.h hVar2 = hVar;
                    A8 a82 = a8;
                    Qt qt2 = qt;
                    St st2 = st;
                    C1068du c1068du2 = c1068du;
                    H6 h62 = h6;
                    U9 u92 = u9;
                    C2951a c2951a2 = c2951a;
                    Context context2 = context;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = ViewTreeObserverOnGlobalLayoutListenerC1433kh.f15183q0;
                        C2026vh c2026vh = new C2026vh(context2);
                        c2026vh.setBaseContext(context2);
                        C1273hh c1273hh = new C1273hh(new ViewTreeObserverOnGlobalLayoutListenerC1433kh(c2026vh, dVar2, str2, z8, h62, u92, c2951a2, gVar, hVar2, a82, qt2, st2, c1068du2), c0784Vn2);
                        c1273hh.setWebViewClient(p2.j.f22785C.f22793f.k(c1273hh, a82, z9, binderC0718Rp2));
                        c1273hh.setWebChromeClient(new C0811Xg(c1273hh));
                        return c1273hh;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object objA = za.a();
                StrictMode.setThreadPolicy(threadPolicy);
                return (InterfaceC0828Yg) objA;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new C1165fh("Webview initialization failed.", th2);
        }
    }

    public static final void h(String str, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i));
            }
            Collections.unmodifiableList(arrayList);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0674Pf, com.google.android.gms.internal.ads.InterfaceC0482Ea, com.google.android.gms.internal.ads.Dr
    /* renamed from: a */
    public void mo6a() {
        int i = this.f12184a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0691Qf, com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public void mo4b(Object obj) {
        switch (this.f12184a) {
            case 5:
                AbstractC2907C.m("Ending javascript session.");
                C2129xc c2129xc = (C2129xc) ((InterfaceC2075wc) obj);
                HashSet hashSet = c2129xc.f17602b;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
                    AbstractC2907C.m("Unregistering eventhandler: ".concat(String.valueOf(((InterfaceC0466Db) simpleEntry.getValue()).toString())));
                    c2129xc.f17601a.d((String) simpleEntry.getKey(), (InterfaceC0466Db) simpleEntry.getValue());
                }
                hashSet.clear();
                break;
            case 6:
                AbstractC0640Nf.f10010f.execute(new RunnableC1752qc((C1536mc) obj, 2));
                break;
            default:
                ((InterfaceC2806a) obj).onAdClicked();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2208z0
    public InterfaceC1992v0[] c(Uri uri, Map map) {
        switch (this.f12184a) {
            case 24:
                AtomicInteger atomicInteger = C0641Ng.f10012I;
                return new InterfaceC1992v0[]{new C1940u2(), new V1()};
            default:
                AtomicInteger atomicInteger2 = C0641Ng.f10012I;
                return new InterfaceC1992v0[]{new C1940u2(), new V1(), new C1725q2(R2.f10828B, 32, C1197gC.f14227e)};
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2237zc
    public /* bridge */ /* synthetic */ JSONObject d(Object obj) {
        return (JSONObject) obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2183yc
    public /* synthetic */ Object w(JSONObject jSONObject) {
        switch (this.f12184a) {
            case 7:
                return jSONObject;
            default:
                return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        }
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d, reason: collision with other method in class */
    public /* synthetic */ void mo11d(Object obj) {
        ((AbstractC1812rj) obj).n();
    }

    private final /* synthetic */ void i() {
    }

    private final void j() {
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1107ee
    public void e(String str, Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1107ee
    public void f(Throwable th, String str, float f2) {
    }
}
