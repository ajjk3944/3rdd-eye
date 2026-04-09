package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;

/* loaded from: classes.dex */
public final class Nr implements Ms {

    /* renamed from: a, reason: collision with root package name */
    public final ID f10082a;

    /* renamed from: b, reason: collision with root package name */
    public final C0960bu f10083b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10084c;

    public Nr(ID id, C0960bu c0960bu, int i) {
        this.f10082a = id;
        this.f10083b = c0960bu;
        this.f10084c = i;
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final InterfaceFutureC2326a a() {
        return ((C0623Mf) this.f10082a).b(new J6(8, this));
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final int c() {
        return 5;
    }
}
