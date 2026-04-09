package com.google.android.gms.internal.ads;

import android.os.Bundle;
import j$.util.Optional;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g5 implements j6 {

    /* renamed from: a, reason: collision with root package name */
    public long f11373a;

    /* renamed from: b, reason: collision with root package name */
    public long f11374b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11375c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11376d;

    public g5(String str, byte[] bArr, long j, long j8) {
        this.f11375c = str;
        this.f11376d = bArr;
        this.f11373a = j;
        this.f11374b = j8;
    }

    public static g5 a(a4.d dVar, byte[] bArr) throws fb, ib {
        dVar.p();
        ((hc) dVar.f189b).f11826c.f17958b = rb.e(bArr);
        List list = (List) dVar.z(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        dVar.B(jLongValue, Optional.empty());
        byte[] bArrJ = a80.j();
        String strConcat = "3.825731049.".concat(m61.f13777d.g(bArrJ.length, bArrJ));
        g5 g5Var = new g5();
        g5Var.f11376d = dVar;
        g5Var.f11373a = jLongValue2;
        g5Var.f11374b = jLongValue3;
        g5Var.f11375c = strConcat;
        return g5Var;
    }

    public boolean b(long j, boolean z3, boolean z10) {
        ec.r3 r3Var = (ec.r3) this.f11376d;
        r3Var.B();
        r3Var.C();
        ec.o1 o1Var = (ec.o1) r3Var.f218b;
        boolean zE = o1Var.e();
        ec.s0 s0Var = o1Var.f22954f;
        if (zE) {
            ec.b1 b1Var = o1Var.f22953e;
            ec.o1.k(b1Var);
            ec.a1 a1Var = b1Var.f22568q;
            o1Var.f22957k.getClass();
            a1Var.b(System.currentTimeMillis());
        }
        long j8 = j - this.f11373a;
        if (!z3 && j8 < 1000) {
            ec.o1.m(s0Var);
            s0Var.f23060o.e(Long.valueOf(j8), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z10) {
            j8 = j - this.f11374b;
            this.f11374b = j;
        }
        ec.o1.m(s0Var);
        s0Var.f23060o.e(Long.valueOf(j8), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j8);
        boolean z11 = !o1Var.f22952d.P();
        ec.b3 b3Var = o1Var.f22958l;
        ec.o1.l(b3Var);
        ec.l4.t0(b3Var.H(z11), bundle, true);
        if (!z10) {
            ec.q2 q2Var = o1Var.f22959m;
            ec.o1.l(q2Var);
            q2Var.I("auto", "_e", bundle);
        }
        this.f11373a = j;
        ec.q3 q3Var = (ec.q3) this.f11375c;
        q3Var.c();
        q3Var.b(((Long) ec.d0.f22661r0.a(null)).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.j6
    public long c(y1 y1Var) {
        long j = this.f11374b;
        if (j < 0) {
            return -1L;
        }
        this.f11374b = -1L;
        return -(j + 2);
    }

    @Override // com.google.android.gms.internal.ads.j6
    public void h(long j) {
        long[] jArr = (long[]) ((rt) this.f11376d).f15753b;
        this.f11374b = jArr[bq0.q(jArr, j, true)];
    }

    @Override // com.google.android.gms.internal.ads.j6
    /* renamed from: zzc */
    public m2 mo173zzc() {
        mq0.c0(this.f11373a != -1);
        return new d2((e2) this.f11375c, this.f11373a, 0);
    }

    public g5(long j) {
        mq0.c0(((h) this.f11375c) == null);
        this.f11373a = j;
        this.f11374b = j + 65536;
    }
}
