package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.jf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1377jf implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14965a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f14966b;

    /* renamed from: c, reason: collision with root package name */
    public final C1907tN f14967c;

    public C1377jf(C1907tN c1907tN, C1799rN c1799rN) {
        this.f14965a = 0;
        this.f14967c = c1907tN;
        this.f14966b = c1799rN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f14965a) {
            case 0:
                return new C0697Ql((Q2.a) this.f14967c.f16902a, 10, (C1217gf) this.f14966b.c());
            case 1:
                return new C0614Ln((A8) this.f14966b.c(), (Ct) this.f14967c.f16902a);
            case 2:
                Context context = (Context) this.f14966b.c();
                C0761Uh c0761Uh = (C0761Uh) this.f14967c.f16902a;
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new C1604nq(context, c0761Uh, c0623Mf, 0);
            case 3:
                return new C1712pq(0, (Context) this.f14966b.c(), (C0761Uh) this.f14967c.f16902a);
            case 4:
                return new C2035vq((Context) this.f14966b.c(), (C0795Wh) this.f14967c.f16902a);
            case 5:
                return new C1712pq(1, (Context) this.f14966b.c(), (C0893ai) this.f14967c.f16902a);
            default:
                return new C1712pq(2, (Context) this.f14966b.c(), (C1002ci) this.f14967c.f16902a);
        }
    }

    public /* synthetic */ C1377jf(InterfaceC2069wN interfaceC2069wN, C1907tN c1907tN, int i) {
        this.f14965a = i;
        this.f14966b = interfaceC2069wN;
        this.f14967c = c1907tN;
    }
}
