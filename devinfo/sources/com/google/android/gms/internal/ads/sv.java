package com.google.android.gms.internal.ads;

import android.content.Context;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sv implements uv {

    /* renamed from: l, reason: collision with root package name */
    public static final List f16551l = DesugarCollections.synchronizedList(new ArrayList());

    /* renamed from: a, reason: collision with root package name */
    public final yp1 f16552a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f16553b;

    /* renamed from: e, reason: collision with root package name */
    public final Context f16556e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16557f;
    public final tv g;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f16554c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f16555d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final Object f16558h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f16559i = new HashSet();
    public boolean j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16560k = false;

    public sv(Context context, za.a aVar, tv tvVar, String str) {
        pb.y.i(tvVar, "SafeBrowsing config is not present.");
        this.f16556e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f16553b = new LinkedHashMap();
        this.g = tvVar;
        Iterator it = tvVar.f16972e.iterator();
        while (it.hasNext()) {
            this.f16559i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.f16559i.remove("cookie".toLowerCase(Locale.ENGLISH));
        yp1 yp1VarD = dr1.D();
        yp1VarD.b();
        ((dr1) yp1VarD.f14755b).O(9);
        if (str != null) {
            yp1VarD.b();
            ((dr1) yp1VarD.f14755b).E(str);
            yp1VarD.b();
            ((dr1) yp1VarD.f14755b).F(str);
        }
        zp1 zp1VarA = aq1.A();
        String str2 = this.g.f16968a;
        if (str2 != null) {
            zp1VarA.b();
            ((aq1) zp1VarA.f14755b).B(str2);
        }
        aq1 aq1Var = (aq1) zp1VarA.e();
        yp1VarD.b();
        ((dr1) yp1VarD.f14755b).G(aq1Var);
        xq1 xq1VarA = yq1.A();
        boolean zF = ub.b.a(this.f16556e).f();
        xq1VarA.b();
        ((yq1) xq1VarA.f14755b).D(zF);
        String str3 = aVar.f38129a;
        if (str3 != null) {
            xq1VarA.b();
            ((yq1) xq1VarA.f14755b).B(str3);
        }
        nb.f fVar = nb.f.f29899b;
        Context context2 = this.f16556e;
        fVar.getClass();
        long jA = nb.f.a(context2);
        if (jA > 0) {
            xq1VarA.b();
            ((yq1) xq1VarA.f14755b).C(jA);
        }
        yq1 yq1Var = (yq1) xq1VarA.e();
        yp1VarD.b();
        ((dr1) yp1VarD.f14755b).L(yq1Var);
        this.f16552a = yp1VarD;
    }

    public final void a(String str) {
        synchronized (this.f16558h) {
            try {
                if (str == null) {
                    yp1 yp1Var = this.f16552a;
                    yp1Var.b();
                    ((dr1) yp1Var.f14755b).J();
                } else {
                    yp1 yp1Var2 = this.f16552a;
                    yp1Var2.b();
                    ((dr1) yp1Var2.f14755b).I(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(String str, Map map, int i4) {
        synchronized (this.f16558h) {
            if (i4 == 3) {
                try {
                    this.f16560k = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            LinkedHashMap linkedHashMap = this.f16553b;
            if (linkedHashMap.containsKey(str)) {
                if (i4 == 3) {
                    vq1 vq1Var = (vq1) linkedHashMap.get(str);
                    vq1Var.b();
                    ((wq1) vq1Var.f14755b).H(4);
                }
                return;
            }
            vq1 vq1VarC = wq1.C();
            int i10 = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? 0 : 4 : 3 : 2 : 1;
            if (i10 != 0) {
                vq1VarC.b();
                ((wq1) vq1VarC.f14755b).H(i10);
            }
            int size = linkedHashMap.size();
            vq1VarC.b();
            ((wq1) vq1VarC.f14755b).D(size);
            vq1VarC.b();
            ((wq1) vq1VarC.f14755b).E(str);
            iq1 iq1VarA = kq1.A();
            if (!this.f16559i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.f16559i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        gq1 gq1VarA = hq1.A();
                        Charset charset = yn1.f18811a;
                        zm1 zm1Var = new zm1(str2.getBytes(charset));
                        gq1VarA.b();
                        ((hq1) gq1VarA.f14755b).B(zm1Var);
                        zm1 zm1Var2 = new zm1(str3.getBytes(charset));
                        gq1VarA.b();
                        ((hq1) gq1VarA.f14755b).C(zm1Var2);
                        hq1 hq1Var = (hq1) gq1VarA.e();
                        iq1VarA.b();
                        ((kq1) iq1VarA.f14755b).B(hq1Var);
                    }
                }
            }
            kq1 kq1Var = (kq1) iq1VarA.e();
            vq1VarC.b();
            ((wq1) vq1VarC.f14755b).F(kq1Var);
            linkedHashMap.put(str, vq1VarC);
        }
    }

    public final void c() {
        synchronized (this.f16558h) {
            this.f16553b.keySet();
            s81 s81VarE = yo0.e(Collections.EMPTY_MAP);
            fp fpVar = new fp(1, this);
            ex exVar = fx.g;
            w71 w71VarF = yo0.F(s81VarE, fpVar, exVar);
            vd.b bVarE = yo0.E(w71VarF, 10L, TimeUnit.SECONDS, fx.f11277d);
            w71VarF.a(new q81(0, w71VarF, new fk0(15, this, bVarE)), exVar);
            f16551l.add(bVarE);
        }
    }
}
