package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sf extends zf {

    /* renamed from: h, reason: collision with root package name */
    public final long f16004h;

    public sf(ff ffVar, zc zcVar, long j, int i4) {
        super(ffVar, "KS95o7MbZWIdKuBkGY5EucArwEmarpDzvrPJlr4r6NTEwXHZ52g0Gof8SUaYNmWh", "sZhcPfATNezp7ZcisFX7I2sqsKQPBRrUcm6y3tpw6ig=", zcVar, i4, 25);
        this.f16004h = j;
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void a() {
        long jLongValue = ((Long) this.f19076e.invoke(null, null)).longValue();
        zc zcVar = this.f19075d;
        synchronized (zcVar) {
            zcVar.b();
            ((md) zcVar.f14755b).n0(jLongValue);
            long j = this.f16004h;
            if (j != 0) {
                zcVar.b();
                ((md) zcVar.f14755b).O0(jLongValue - j);
                zcVar.b();
                ((md) zcVar.f14755b).R0(j);
            }
        }
    }
}
