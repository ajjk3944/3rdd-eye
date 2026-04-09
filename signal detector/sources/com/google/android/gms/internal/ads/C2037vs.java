package com.google.android.gms.internal.ads;

import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.vs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2037vs implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2069wN f17357a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f17358b;

    public C2037vs(C0540Hh c0540Hh, C1799rN c1799rN) {
        this.f17357a = c0540Hh;
        this.f17358b = c1799rN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Yr c() {
        return new Yr(((C0540Hh) this.f17357a).a(), 3, (Intent) this.f17358b.c());
    }
}
