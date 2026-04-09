package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;

/* loaded from: classes.dex */
public final /* synthetic */ class Yz implements InterfaceC1736qD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Zz f12744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ly f12745c;

    public /* synthetic */ Yz(Zz zz, Ly ly, int i) {
        this.f12743a = i;
        this.f12744b = zz;
        this.f12745c = ly;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
    public final InterfaceFutureC2326a b(Object obj) {
        switch (this.f12743a) {
            case 0:
                Zz zz = this.f12744b;
                TD tdA = zz.f12999b.a(this.f12745c);
                zz.i.e(15303, tdA);
                return tdA;
            default:
                Zz zz2 = this.f12744b;
                TD tdA2 = zz2.f12999b.a(this.f12745c);
                zz2.i.e(15303, tdA2);
                return tdA2;
        }
    }
}
