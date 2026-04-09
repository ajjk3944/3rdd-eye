package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rj0 implements e81 {

    /* renamed from: a, reason: collision with root package name */
    public final sr0 f15656a;

    /* renamed from: b, reason: collision with root package name */
    public final h60 f15657b;

    /* renamed from: c, reason: collision with root package name */
    public final bt0 f15658c;

    /* renamed from: d, reason: collision with root package name */
    public final ct0 f15659d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f15660e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f15661f;
    public final q40 g;

    /* renamed from: h, reason: collision with root package name */
    public final nj0 f15662h;

    /* renamed from: i, reason: collision with root package name */
    public final ei0 f15663i;
    public final Context j;

    /* renamed from: k, reason: collision with root package name */
    public final bs0 f15664k;

    /* renamed from: l, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.d f15665l;

    /* renamed from: m, reason: collision with root package name */
    public final od0 f15666m;

    public rj0(Context context, sr0 sr0Var, nj0 nj0Var, h60 h60Var, bt0 bt0Var, ct0 ct0Var, q40 q40Var, ex exVar, ScheduledExecutorService scheduledExecutorService, ei0 ei0Var, bs0 bs0Var, com.google.android.gms.internal.consent_sdk.d dVar, od0 od0Var) {
        this.j = context;
        this.f15656a = sr0Var;
        this.f15662h = nj0Var;
        this.f15657b = h60Var;
        this.f15658c = bt0Var;
        this.f15659d = ct0Var;
        this.g = q40Var;
        this.f15660e = exVar;
        this.f15661f = scheduledExecutorService;
        this.f15663i = ei0Var;
        this.f15664k = bs0Var;
        this.f15665l = dVar;
        this.f15666m = od0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(com.google.android.gms.internal.ads.dq0 r6) {
        /*
            com.google.android.gms.internal.ads.pk r0 = com.google.android.gms.internal.ads.sk.f16305r6
            va.s r1 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r2 = r1.f36166c
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
            com.google.android.gms.internal.ads.aw r6 = r6.f10544b
            java.lang.Object r6 = r6.f9452c
            com.google.android.gms.internal.ads.yp0 r6 = (com.google.android.gms.internal.ads.yp0) r6
            int r3 = r6.f18824f
            if (r3 == 0) goto L5b
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 300(0x12c, float:4.2E-43)
            if (r3 < r4) goto L3c
            if (r3 >= r5) goto L3c
            com.google.android.gms.internal.ads.pk r3 = com.google.android.gms.internal.ads.sk.f16288q6
            com.google.android.gms.internal.ads.rk r1 = r1.f36166c
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
            java.lang.String r2 = d.h.q(r3, r0, r1)
            goto L5c
        L5b:
            r2 = r0
        L5c:
            com.google.android.gms.internal.ads.ka1 r6 = r6.j
            if (r6 == 0) goto L63
            java.lang.String r6 = r6.f13113b
            return r6
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rj0.a(com.google.android.gms.internal.ads.dq0):java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final vd.b c(Object obj) {
        int i4;
        Bundle bundle;
        rj0 rj0Var = this;
        dq0 dq0Var = (dq0) obj;
        pk pkVar = sk.B2;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && (bundle = (Bundle) dq0Var.f10544b.f9454e) != null) {
            rj0Var.f15666m.f14678e.putAll(bundle);
        }
        if (((Boolean) sVar.f36166c.a(sk.C2)).booleanValue()) {
            d.h.D(ua.j.C.f35267k, rj0Var.f15666m.f14678e, "rendering-start");
        }
        String strA = a(dq0Var);
        ei0 ei0Var = rj0Var.f15663i;
        aw awVar = dq0Var.f10544b;
        yp0 yp0Var = (yp0) awVar.f9452c;
        ei0Var.f10804d = yp0Var;
        if (((Boolean) sVar.f36166c.a(sk.f16370v9)).booleanValue() && (i4 = yp0Var.f18824f) != 0 && (i4 < 200 || i4 >= 300)) {
            return yo0.w(new qj0(3, strA));
        }
        String str = yp0Var.f18833q;
        if (!((Boolean) sVar.f36166c.a(sk.f16224m4)).booleanValue() || TextUtils.isEmpty(str)) {
            for (wp0 wp0Var : (List) awVar.f9451b) {
                ei0Var.b(wp0Var, ei0Var.f10801a.size());
                Iterator it = wp0Var.f18072a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ei0Var.c(wp0Var, 0L, yo0.A(1, null, null), false);
                        break;
                    }
                    zh0 zh0VarA = rj0Var.g.a(wp0Var.f18074b, (String) it.next());
                    if (zh0VarA == null || !zh0VarA.a(dq0Var, wp0Var)) {
                    }
                }
            }
        } else {
            List list = (List) awVar.f9451b;
            synchronized (ei0Var) {
                Map map = ei0Var.f10802b;
                if (map.containsKey(str)) {
                    va.e3 e3Var = (va.e3) map.get(str);
                    List list2 = ei0Var.f10801a;
                    int iIndexOf = list2.indexOf(e3Var);
                    try {
                        list2.remove(iIndexOf);
                    } catch (IndexOutOfBoundsException e2) {
                        ua.j.C.f35265h.f("AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry", e2);
                    }
                    ei0Var.f10802b.remove(str);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ei0Var.b((wp0) it2.next(), iIndexOf);
                        iIndexOf++;
                    }
                }
            }
        }
        h60 h60Var = rj0Var.f15657b;
        x20 x20Var = new x20(dq0Var, rj0Var.f15659d, rj0Var.f15658c);
        Executor executor = rj0Var.f15660e;
        h60Var.m1(x20Var, executor);
        if (yp0Var.f18834r > 1) {
            return rj0Var.f15665l.g(dq0Var);
        }
        String strA2 = a(dq0Var);
        sr0 sr0Var = rj0Var.f15656a;
        qr0 qr0Var = qr0.RENDER_CONFIG_INIT;
        Objects.requireNonNull(sr0Var);
        pr0 pr0VarT = new ai(sr0Var, qr0Var, null, sr0.f16524d, Collections.EMPTY_LIST, yo0.w(new qj0(3, strA2))).t();
        nj0 nj0Var = rj0Var.f15662h;
        nj0Var.a();
        int i10 = 0;
        for (wp0 wp0Var2 : (List) awVar.f9451b) {
            Iterator it3 = wp0Var2.f18072a.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                String str2 = (String) it3.next();
                zh0 zh0VarA2 = rj0Var.g.a(wp0Var2.f18074b, str2);
                if (zh0VarA2 != null && zh0VarA2.a(dq0Var, wp0Var2)) {
                    ai aiVarA = sr0Var.a(qr0.RENDER_CONFIG_WATERFALL, pr0VarT);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15 + String.valueOf(str2).length());
                    sb2.append("render-config-");
                    sb2.append(i10);
                    sb2.append("-");
                    sb2.append(str2);
                    String string = sb2.toString();
                    vd.b bVar = (vd.b) aiVarA.f9331b;
                    List list3 = (List) aiVarA.f9333d;
                    vd.b bVar2 = (vd.b) aiVarA.f9334e;
                    sr0 sr0Var2 = (sr0) aiVarA.f9335f;
                    Object obj2 = aiVarA.f9332c;
                    Objects.requireNonNull(sr0Var2);
                    pr0VarT = new ai(sr0Var2, obj2, string, bVar, list3, yo0.D(bVar2, Throwable.class, new qq(rj0Var, wp0Var2, dq0Var, zh0VarA2, 4), sr0Var2.f16525a)).t();
                    break;
                }
                rj0Var = this;
            }
            i10++;
            rj0Var = this;
        }
        pr0VarT.a(new s30(18, nj0Var), executor);
        return pr0VarT;
    }
}
