package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class RQ implements InterfaceC1695pQ, InterfaceC1641oQ {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1695pQ f10910a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10911b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1641oQ f10912c;

    public RQ(InterfaceC1695pQ interfaceC1695pQ, long j6) {
        this.f10910a = interfaceC1695pQ;
        this.f10911b = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final void a(long j6) {
        this.f10910a.a(j6 - this.f10911b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final long b(InterfaceC1020d[] interfaceC1020dArr, boolean[] zArr, MQ[] mqArr, boolean[] zArr2, long j6) {
        MQ[] mqArr2 = new MQ[mqArr.length];
        int i = 0;
        while (true) {
            MQ mq = null;
            if (i >= mqArr.length) {
                break;
            }
            QQ qq = (QQ) mqArr[i];
            if (qq != null) {
                mq = qq.f10619a;
            }
            mqArr2[i] = mq;
            i++;
        }
        long j7 = this.f10911b;
        long jB = this.f10910a.b(interfaceC1020dArr, zArr, mqArr2, zArr2, j6 - j7);
        for (int i3 = 0; i3 < mqArr.length; i3++) {
            MQ mq2 = mqArr2[i3];
            if (mq2 == null) {
                mqArr[i3] = null;
            } else {
                MQ mq3 = mqArr[i3];
                if (mq3 == null || ((QQ) mq3).f10619a != mq2) {
                    mqArr[i3] = new QQ(mq2, j7);
                }
            }
        }
        return jB + j7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final long c(long j6, C2178yO c2178yO) {
        InterfaceC1695pQ interfaceC1695pQ = this.f10910a;
        long j7 = this.f10911b;
        return interfaceC1695pQ.c(j6 - j7, c2178yO) + j7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1641oQ
    public final /* bridge */ /* synthetic */ void d(NQ nq) {
        InterfaceC1641oQ interfaceC1641oQ = this.f10912c;
        interfaceC1641oQ.getClass();
        interfaceC1641oQ.d(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1641oQ
    public final void e(InterfaceC1695pQ interfaceC1695pQ) {
        InterfaceC1641oQ interfaceC1641oQ = this.f10912c;
        interfaceC1641oQ.getClass();
        interfaceC1641oQ.e(this);
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final boolean f(C1045dO c1045dO) {
        long j6 = c1045dO.f13758a;
        C0990cO c0990cO = new C0990cO();
        c0990cO.f13553b = c1045dO.f13759b;
        c0990cO.f13554c = c1045dO.f13760c;
        c0990cO.f13552a = j6 - this.f10911b;
        return this.f10910a.f(new C1045dO(c0990cO));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final long g() {
        long jG = this.f10910a.g();
        if (jG == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jG + this.f10911b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final long h(long j6) {
        InterfaceC1695pQ interfaceC1695pQ = this.f10910a;
        long j7 = this.f10911b;
        return interfaceC1695pQ.h(j6 - j7) + j7;
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final long i() {
        long jI = this.f10910a.i();
        if (jI == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jI + this.f10911b;
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final long j() {
        long j6 = this.f10910a.j();
        if (j6 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return j6 + this.f10911b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final void k(InterfaceC1641oQ interfaceC1641oQ, long j6) {
        this.f10912c = interfaceC1641oQ;
        this.f10910a.k(this, j6 - this.f10911b);
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final void l(long j6) {
        this.f10910a.l(j6 - this.f10911b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final SQ m() {
        return this.f10910a.m();
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final boolean o() {
        return this.f10910a.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final void s() {
        this.f10910a.s();
    }
}
