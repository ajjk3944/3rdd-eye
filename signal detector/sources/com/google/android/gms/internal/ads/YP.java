package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class YP implements MQ {

    /* renamed from: a, reason: collision with root package name */
    public final MQ f12638a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ZP f12640c;

    public YP(ZP zp, MQ mq) {
        this.f12640c = zp;
        this.f12638a = mq;
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final int a(C1879sw c1879sw, FM fm, int i) {
        ZP zp = this.f12640c;
        if (zp.n()) {
            return -3;
        }
        if (this.f12639b) {
            fm.f1097b = 4;
            return -4;
        }
        long j6 = zp.j();
        int iA = this.f12638a.a(c1879sw, fm, i);
        if (iA != -5) {
            long j7 = zp.f12893e;
            if (j7 == Long.MIN_VALUE || ((iA != -4 || fm.f8095g < j7) && !(iA == -3 && j6 == Long.MIN_VALUE && !fm.f8094f))) {
                return iA;
            }
            fm.o();
            fm.f1097b = 4;
            this.f12639b = true;
            return -4;
        }
        TP tp = (TP) c1879sw.f16824c;
        tp.getClass();
        int i3 = tp.f11382I;
        int i6 = tp.f11381H;
        if (i6 == 0) {
            if (i3 == 0) {
                return -5;
            }
            i6 = 0;
        }
        if (zp.f12893e != Long.MIN_VALUE) {
            i3 = 0;
        }
        C1855sP c1855sP = new C1855sP(tp);
        c1855sP.f16717G = i6;
        c1855sP.f16718H = i3;
        c1879sw.f16824c = new TP(c1855sP);
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final boolean c() {
        return !this.f12640c.n() && this.f12638a.c();
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final void f() {
        this.f12638a.f();
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final int g(long j6) {
        if (this.f12640c.n()) {
            return -3;
        }
        return this.f12638a.g(j6);
    }
}
