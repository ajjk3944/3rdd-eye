package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Tq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0753Tq implements InterfaceC1736qD {

    /* renamed from: a, reason: collision with root package name */
    public final Mu f11475a;

    /* renamed from: b, reason: collision with root package name */
    public final C1490lk f11476b;

    /* renamed from: c, reason: collision with root package name */
    public final C2148xv f11477c;

    /* renamed from: d, reason: collision with root package name */
    public final C2202yv f11478d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f11479e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f11480f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1920tj f11481g;

    /* renamed from: h, reason: collision with root package name */
    public final C0702Qq f11482h;
    public final C1228gq i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f11483j;

    /* renamed from: k, reason: collision with root package name */
    public final Xu f11484k;

    /* renamed from: l, reason: collision with root package name */
    public final K4.c f11485l;

    /* renamed from: m, reason: collision with root package name */
    public final C0750Tn f11486m;

    public C0753Tq(Context context, Mu mu, C0702Qq c0702Qq, C1490lk c1490lk, C2148xv c2148xv, C2202yv c2202yv, InterfaceC1920tj interfaceC1920tj, C0623Mf c0623Mf, ScheduledExecutorService scheduledExecutorService, C1228gq c1228gq, Xu xu, K4.c cVar, C0750Tn c0750Tn) {
        this.f11483j = context;
        this.f11475a = mu;
        this.f11482h = c0702Qq;
        this.f11476b = c1490lk;
        this.f11477c = c2148xv;
        this.f11478d = c2202yv;
        this.f11481g = interfaceC1920tj;
        this.f11479e = c0623Mf;
        this.f11480f = scheduledExecutorService;
        this.i = c1228gq;
        this.f11484k = xu;
        this.f11485l = cVar;
        this.f11486m = c0750Tn;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(com.google.android.gms.internal.ads.Xt r6) {
        /*
            com.google.android.gms.internal.ads.E9 r0 = com.google.android.gms.internal.ads.H9.r6
            q2.s r1 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r2 = r1.f23270c
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r2 = "No fill."
            r3 = 1
            if (r3 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r2
        L19:
            com.google.android.gms.internal.ads.kf r6 = r6.f12510b
            java.lang.Object r6 = r6.f15174c
            com.google.android.gms.internal.ads.St r6 = (com.google.android.gms.internal.ads.St) r6
            int r3 = r6.f11273f
            if (r3 == 0) goto L5b
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 300(0x12c, float:4.2E-43)
            if (r3 < r4) goto L3c
            if (r3 >= r5) goto L3c
            com.google.android.gms.internal.ads.E9 r3 = com.google.android.gms.internal.ads.H9.q6
            com.google.android.gms.internal.ads.G9 r1 = r1.f23270c
            java.lang.Object r1 = r1.a(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L5b
            goto L5c
        L3c:
            if (r3 < r5) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r3 >= r0) goto L45
            java.lang.String r2 = "No location header to follow redirect or too many redirects."
            goto L5c
        L45:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 35
            r1.<init>(r0)
            java.lang.String r0 = "Received error HTTP response code: "
            java.lang.String r2 = A.f.i(r3, r0, r1)
            goto L5c
        L5b:
            r2 = r0
        L5c:
            com.google.android.gms.internal.ads.AE r6 = r6.f11276j
            if (r6 == 0) goto L63
            java.lang.String r6 = r6.f6968b
            return r6
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0753Tq.a(com.google.android.gms.internal.ads.Xt):java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
    public final InterfaceFutureC2326a b(Object obj) {
        int i;
        Bundle bundle;
        C0753Tq c0753Tq = this;
        Xt xt = (Xt) obj;
        E9 e9 = H9.f8565B2;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && (bundle = (Bundle) xt.f12510b.f15176e) != null) {
            c0753Tq.f11486m.f11461e.putAll(bundle);
        }
        if (((Boolean) c2841s.f23270c.a(H9.C2)).booleanValue()) {
            A.f.r(p2.j.f22785C.f22797k, c0753Tq.f11486m.f11461e, "rendering-start");
        }
        String strA = a(xt);
        C1228gq c1228gq = c0753Tq.i;
        C1431kf c1431kf = xt.f12510b;
        St st = (St) c1431kf.f15174c;
        c1228gq.f14383d = st;
        if (((Boolean) c2841s.f23270c.a(H9.t9)).booleanValue() && (i = st.f11273f) != 0 && (i < 200 || i >= 300)) {
            return AbstractC1984ut.w(new C0736Sq(3, strA));
        }
        String str = st.f11283q;
        if (!((Boolean) c2841s.f23270c.a(H9.f8787m4)).booleanValue() || TextUtils.isEmpty(str)) {
            for (Qt qt : (List) c1431kf.f15173b) {
                c1228gq.b(qt, c1228gq.f14380a.size());
                Iterator it = qt.f10757a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c1228gq.c(qt, 0L, AbstractC1984ut.A(1, null, null), false);
                        break;
                    }
                    InterfaceC0956bq interfaceC0956bqA = c0753Tq.f11481g.a(qt.f10759b, (String) it.next());
                    if (interfaceC0956bqA == null || !interfaceC0956bqA.a(xt, qt)) {
                    }
                }
            }
        } else {
            List list = (List) c1431kf.f15173b;
            synchronized (c1228gq) {
                Map map = c1228gq.f14381b;
                if (map.containsKey(str)) {
                    q2.f1 f1Var = (q2.f1) map.get(str);
                    List list2 = c1228gq.f14380a;
                    int iIndexOf = list2.indexOf(f1Var);
                    try {
                        list2.remove(iIndexOf);
                    } catch (IndexOutOfBoundsException e6) {
                        p2.j.f22785C.f22795h.f("AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry", e6);
                    }
                    c1228gq.f14381b.remove(str);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        c1228gq.b((Qt) it2.next(), iIndexOf);
                        iIndexOf++;
                    }
                }
            }
        }
        C1490lk c1490lk = c0753Tq.f11476b;
        C0456Ci c0456Ci = new C0456Ci(xt, c0753Tq.f11478d, c0753Tq.f11477c);
        Executor executor = c0753Tq.f11479e;
        c1490lk.z1(c0456Ci, executor);
        if (st.f11284r > 1) {
            return c0753Tq.f11485l.m(xt);
        }
        String strA2 = a(xt);
        Mu mu = c0753Tq.f11475a;
        Ku ku = Ku.RENDER_CONFIG_INIT;
        Objects.requireNonNull(mu);
        Ju juU = new C1677p8(mu, ku, null, Mu.f9922d, Collections.EMPTY_LIST, AbstractC1984ut.w(new C0736Sq(3, strA2))).u();
        C0702Qq c0702Qq = c0753Tq.f11482h;
        c0702Qq.a();
        int i3 = 0;
        for (Qt qt2 : (List) c1431kf.f15173b) {
            Iterator it3 = qt2.f10757a.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                String str2 = (String) it3.next();
                InterfaceC0956bq interfaceC0956bqA2 = c0753Tq.f11481g.a(qt2.f10759b, str2);
                if (interfaceC0956bqA2 != null && interfaceC0956bqA2.a(xt, qt2)) {
                    C1677p8 c1677p8A = mu.a(juU, Ku.RENDER_CONFIG_WATERFALL);
                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 15 + String.valueOf(str2).length());
                    sb.append("render-config-");
                    sb.append(i3);
                    sb.append("-");
                    sb.append(str2);
                    String string = sb.toString();
                    InterfaceFutureC2326a interfaceFutureC2326a = (InterfaceFutureC2326a) c1677p8A.f16138b;
                    List list3 = (List) c1677p8A.f16140d;
                    InterfaceFutureC2326a interfaceFutureC2326a2 = (InterfaceFutureC2326a) c1677p8A.f16141e;
                    Mu mu2 = (Mu) c1677p8A.f16142f;
                    Object obj2 = c1677p8A.f16139c;
                    Objects.requireNonNull(mu2);
                    juU = new C1677p8(mu2, obj2, string, interfaceFutureC2326a, list3, AbstractC1984ut.D(interfaceFutureC2326a2, Throwable.class, new C0450Cc(c0753Tq, qt2, xt, interfaceC0956bqA2, 4), mu2.f9923a)).u();
                    break;
                }
                c0753Tq = this;
            }
            i3++;
            c0753Tq = this;
        }
        juU.a(new RunnableC0558Ii(19, c0702Qq), executor);
        return juU;
    }
}
