package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class Zz implements Wz {

    /* renamed from: a, reason: collision with root package name */
    public final C2043vy f12998a;

    /* renamed from: b, reason: collision with root package name */
    public final C2043vy f12999b;

    /* renamed from: c, reason: collision with root package name */
    public final C2043vy f13000c;

    /* renamed from: d, reason: collision with root package name */
    public final C2043vy f13001d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1692pN f13002e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1692pN f13003f;

    /* renamed from: g, reason: collision with root package name */
    public final File f13004g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f13005h;
    public final C1948uA i;

    public Zz(C2043vy c2043vy, C2043vy c2043vy2, InterfaceC1692pN interfaceC1692pN, C2043vy c2043vy3, C2043vy c2043vy4, InterfaceC1692pN interfaceC1692pN2, File file, ExecutorService executorService, C1948uA c1948uA) {
        this.f12998a = c2043vy;
        this.f13000c = c2043vy2;
        this.f13002e = interfaceC1692pN;
        this.f12999b = c2043vy3;
        this.f13001d = c2043vy4;
        this.f13003f = interfaceC1692pN2;
        this.f13004g = file;
        this.f13005h = executorService;
        this.i = c1948uA;
    }

    @Override // com.google.android.gms.internal.ads.Vz
    public final InterfaceFutureC2326a a() {
        return AbstractC1984ut.z(new Zs(7, this), this.f13005h);
    }

    @Override // com.google.android.gms.internal.ads.Wz
    public final InterfaceFutureC2326a b() {
        C2043vy c2043vy = this.f12998a;
        c2043vy.getClass();
        C1358jD c1358jDG = AbstractC1984ut.G(AbstractC2221zD.r(AbstractC1984ut.z(new Zs(4, c2043vy), c2043vy.f17373b)), new C1754qe(13, this), EnumC2059wD.f17407a);
        this.i.e(15314, c1358jDG);
        return c1358jDG;
    }

    @Override // com.google.android.gms.internal.ads.Vz
    public final TD c() {
        C2043vy c2043vy = this.f12998a;
        c2043vy.getClass();
        TD tdZ = AbstractC1984ut.z(new Zs(4, c2043vy), c2043vy.f17373b);
        this.i.e(15302, tdZ);
        return tdZ;
    }

    @Override // com.google.android.gms.internal.ads.Vz
    public final InterfaceFutureC2326a d(Ly ly, byte[] bArr, byte[] bArr2) {
        TD tdA = ((C2043vy) this.f13003f.c()).a(bArr);
        C1948uA c1948uA = this.i;
        c1948uA.e(15307, tdA);
        TD tdA2 = this.f13001d.a(bArr2);
        c1948uA.e(15305, tdA2);
        return AbstractC1984ut.F(AbstractC2221zD.r(new C1789rD(LB.n(new InterfaceFutureC2326a[]{tdA, tdA2}), true)), new Yz(this, ly, 1), EnumC2059wD.f17407a);
    }

    @Override // com.google.android.gms.internal.ads.Vz
    public final InterfaceFutureC2326a e(Ly ly, byte[] bArr) {
        TD tdA = this.f13001d.a(bArr);
        this.i.e(15305, tdA);
        return AbstractC1984ut.F(AbstractC2221zD.r(tdA), new Yz(this, ly, 0), EnumC2059wD.f17407a);
    }
}
