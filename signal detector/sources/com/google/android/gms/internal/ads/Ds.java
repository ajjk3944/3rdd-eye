package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;

/* loaded from: classes.dex */
public final class Ds implements Ms {

    /* renamed from: a, reason: collision with root package name */
    public final String f7847a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7848b;

    public Ds(String str, int i) {
        this.f7847a = str;
        this.f7848b = i;
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final InterfaceFutureC2326a a() {
        return AbstractC1984ut.e(new C0958bs(this.f7847a, this.f7848b, 1));
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final int c() {
        return 31;
    }
}
