package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Wi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0796Wi implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2069wN f12305a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f12306b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f12307c;

    public C0796Wi(C1799rN c1799rN, C1799rN c1799rN2, C1799rN c1799rN3) {
        this.f12305a = c1799rN;
        this.f12306b = c1799rN2;
        this.f12307c = c1799rN3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0679Pk c() {
        return new C0679Pk((ScheduledExecutorService) this.f12305a.c(), (Q2.a) this.f12306b.c(), (C0784Vn) this.f12307c.c());
    }
}
