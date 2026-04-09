package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.qz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1775qz implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16429a;

    /* renamed from: b, reason: collision with root package name */
    public final C1907tN f16430b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f16431c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f16432d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2069wN f16433e;

    public /* synthetic */ C1775qz(C1907tN c1907tN, C1799rN c1799rN, C1907tN c1907tN2, C1799rN c1799rN2, int i) {
        this.f16429a = i;
        this.f16430b = c1907tN;
        this.f16431c = c1799rN;
        this.f16432d = c1907tN2;
        this.f16433e = c1799rN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f16429a) {
            case 0:
                return new C1721pz((S5) this.f16430b.f16902a, (C1291hz) this.f16431c.c(), (Context) this.f16432d.c(), (C1948uA) this.f16433e.c(), 0);
            case 1:
                return new C1828rz((S5) this.f16430b.f16902a, (C1291hz) this.f16431c.c(), (Xx) this.f16432d.c(), (C1948uA) this.f16433e.c());
            default:
                return new C1721pz((S5) this.f16430b.f16902a, (C1291hz) this.f16431c.c(), (Context) this.f16432d.c(), (C1948uA) this.f16433e.c(), 1);
        }
    }
}
