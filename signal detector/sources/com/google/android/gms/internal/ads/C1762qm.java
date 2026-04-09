package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1762qm implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16396a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C1113ek f16397b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f16398c;

    public C1762qm(C0540Hh c0540Hh, C1113ek c1113ek) {
        this.f16398c = c0540Hh;
        this.f16397b = c1113ek;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f16396a) {
            case 0:
                return new C1485lf(((C0540Hh) this.f16398c).a(), this.f16397b.a().f13485g);
            default:
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new Qr(c0623Mf, this.f16397b.a(), ((C0659Oh) this.f16398c).c(), 1);
        }
    }

    public C1762qm(C1113ek c1113ek, InterfaceC2069wN interfaceC2069wN) {
        this.f16397b = c1113ek;
        this.f16398c = interfaceC2069wN;
    }
}
