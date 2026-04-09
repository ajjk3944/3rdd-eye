package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vf extends zf {

    /* renamed from: h, reason: collision with root package name */
    public final te f17610h;

    /* renamed from: i, reason: collision with root package name */
    public final long f17611i;
    public final long j;

    public vf(ff ffVar, zc zcVar, int i4, te teVar, long j, long j8) {
        super(ffVar, "MHYgRB9ZLJ711MlDBgDgyPDdkDVVlHwuqDeF/1i1ByNixJnhURH1lj12DYAv6vPJ", "+dsC4zlVzClLb/gffysp/RM/1OAwcqKcuzzXTv3qmQk=", zcVar, i4, 11);
        this.f17610h = teVar;
        this.f17611i = j;
        this.j = j8;
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void a() {
        te teVar = this.f17610h;
        if (teVar != null) {
            String str = (String) this.f19076e.invoke(null, teVar.f16792a, Long.valueOf(this.f17611i), Long.valueOf(this.j));
            re reVar = new re();
            HashMap mapM = ls.m(str);
            if (mapM != null) {
                reVar.I = (Long) mapM.get(0);
                reVar.J = (Long) mapM.get(1);
                reVar.K = (Long) mapM.get(2);
            }
            zc zcVar = this.f19075d;
            synchronized (zcVar) {
                try {
                    long jLongValue = reVar.I.longValue();
                    zcVar.b();
                    ((md) zcVar.f14755b).J0(jLongValue);
                    if (((Long) reVar.J).longValue() >= 0) {
                        long jLongValue2 = ((Long) reVar.J).longValue();
                        zcVar.b();
                        ((md) zcVar.f14755b).h0(jLongValue2);
                    }
                    if (((Long) reVar.K).longValue() >= 0) {
                        long jLongValue3 = ((Long) reVar.K).longValue();
                        zcVar.b();
                        ((md) zcVar.f14755b).i0(jLongValue3);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
