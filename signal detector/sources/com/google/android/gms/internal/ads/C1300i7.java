package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.i7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1300i7 extends AbstractCallableC1676p7 {

    /* renamed from: h, reason: collision with root package name */
    public final long f14673h;

    public C1300i7(X6 x6, S5 s5, long j6, int i) {
        super(x6, "KS95o7MbZWIdKuBkGY5EucArwEmarpDzvrPJlr4r6NTEwXHZ52g0Gof8SUaYNmWh", "sZhcPfATNezp7ZcisFX7I2sqsKQPBRrUcm6y3tpw6ig=", s5, i, 25);
        this.f14673h = j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1676p7
    public final void a() {
        long jLongValue = ((Long) this.f16134e.invoke(null, null)).longValue();
        S5 s5 = this.f16133d;
        synchronized (s5) {
            s5.b();
            ((C1136f6) s5.f13551b).n0(jLongValue);
            long j6 = this.f14673h;
            if (j6 != 0) {
                s5.b();
                ((C1136f6) s5.f13551b).O0(jLongValue - j6);
                s5.b();
                ((C1136f6) s5.f13551b).R0(j6);
            }
        }
    }
}
