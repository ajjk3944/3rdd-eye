package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class QQ implements MQ {

    /* renamed from: a, reason: collision with root package name */
    public final MQ f10619a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10620b;

    public QQ(MQ mq, long j6) {
        this.f10619a = mq;
        this.f10620b = j6;
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final int a(C1879sw c1879sw, FM fm, int i) {
        int iA = this.f10619a.a(c1879sw, fm, i);
        if (iA != -4) {
            return iA;
        }
        fm.f8095g += this.f10620b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final boolean c() {
        return this.f10619a.c();
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final void f() {
        this.f10619a.f();
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final int g(long j6) {
        return this.f10619a.g(j6 - this.f10620b);
    }
}
