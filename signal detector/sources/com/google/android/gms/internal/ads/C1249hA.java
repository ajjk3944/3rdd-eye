package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1249hA implements InterfaceC1195gA {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1692pN f14459a;

    /* renamed from: b, reason: collision with root package name */
    public final C1948uA f14460b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14461c;

    public C1249hA(InterfaceC1692pN interfaceC1692pN, C1948uA c1948uA, long j6) {
        this.f14459a = interfaceC1692pN;
        this.f14460b = c1948uA;
        this.f14461c = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1195gA
    public final boolean a(Ly ly) {
        C1948uA c1948uA = this.f14460b;
        if (ly == null || ly.equals(Ly.F())) {
            c1948uA.b(15102);
            return false;
        }
        if (ly.C() == this.f14459a.c()) {
            return true;
        }
        c1948uA.b(15103);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1195gA
    public final boolean b(Ly ly) {
        C1948uA c1948uA = this.f14460b;
        if (ly == null || ly.equals(Ly.F())) {
            c1948uA.b(15104);
            return true;
        }
        if (ly.C() != this.f14459a.c()) {
            c1948uA.b(15105);
            return true;
        }
        boolean z6 = (ly.A().C() * 1000) - System.currentTimeMillis() <= this.f14461c;
        if (z6) {
            c1948uA.b(15106);
        }
        return z6;
    }
}
