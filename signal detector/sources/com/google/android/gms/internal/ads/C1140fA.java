package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;

/* renamed from: com.google.android.gms.internal.ads.fA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1140fA implements Vz {

    /* renamed from: a, reason: collision with root package name */
    public final C2043vy f14031a;

    /* renamed from: b, reason: collision with root package name */
    public final C2043vy f14032b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1692pN f14033c;

    /* renamed from: d, reason: collision with root package name */
    public final C1948uA f14034d;

    public C1140fA(C2043vy c2043vy, C2043vy c2043vy2, InterfaceC1692pN interfaceC1692pN, C1948uA c1948uA) {
        this.f14031a = c2043vy;
        this.f14032b = c2043vy2;
        this.f14033c = interfaceC1692pN;
        this.f14034d = c1948uA;
    }

    @Override // com.google.android.gms.internal.ads.Vz
    public final InterfaceFutureC2326a a() {
        return AbstractC1984ut.e(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.Vz
    public final TD c() {
        C2043vy c2043vy = this.f14031a;
        c2043vy.getClass();
        TD tdZ = AbstractC1984ut.z(new Zs(4, c2043vy), c2043vy.f17373b);
        this.f14034d.e(20302, tdZ);
        return tdZ;
    }

    @Override // com.google.android.gms.internal.ads.Vz
    public final InterfaceFutureC2326a d(Ly ly, byte[] bArr, byte[] bArr2) {
        TD tdA = ((C2043vy) this.f14033c.c()).a(bArr);
        C1948uA c1948uA = this.f14034d;
        c1948uA.e(20307, tdA);
        TD tdA2 = this.f14032b.a(bArr2);
        c1948uA.e(20305, tdA2);
        return AbstractC1984ut.F(AbstractC2221zD.r(new C1789rD(LB.n(new InterfaceFutureC2326a[]{tdA, tdA2}), true)), new C1085eA(this, ly, 0), EnumC2059wD.f17407a);
    }

    @Override // com.google.android.gms.internal.ads.Vz
    public final InterfaceFutureC2326a e(Ly ly, byte[] bArr) {
        TD tdA = this.f14032b.a(bArr);
        this.f14034d.e(20305, tdA);
        return AbstractC1984ut.F(AbstractC2221zD.r(tdA), new C1085eA(this, ly, 1), EnumC2059wD.f17407a);
    }
}
