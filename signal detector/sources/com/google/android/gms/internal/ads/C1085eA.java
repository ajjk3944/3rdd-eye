package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;

/* renamed from: com.google.android.gms.internal.ads.eA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1085eA implements InterfaceC1736qD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1140fA f13874b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ly f13875c;

    public /* synthetic */ C1085eA(C1140fA c1140fA, Ly ly, int i) {
        this.f13873a = i;
        this.f13874b = c1140fA;
        this.f13875c = ly;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
    public final InterfaceFutureC2326a b(Object obj) {
        switch (this.f13873a) {
            case 0:
                C1140fA c1140fA = this.f13874b;
                TD tdA = c1140fA.f14031a.a(this.f13875c);
                c1140fA.f14034d.e(20303, tdA);
                return tdA;
            default:
                C1140fA c1140fA2 = this.f13874b;
                TD tdA2 = c1140fA2.f14031a.a(this.f13875c);
                c1140fA2.f14034d.e(20303, tdA2);
                return tdA2;
        }
    }
}
