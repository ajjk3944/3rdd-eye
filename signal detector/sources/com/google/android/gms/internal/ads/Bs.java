package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public final class Bs implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2069wN f7456a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f7457b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f7458c;

    public Bs(C1799rN c1799rN, C1799rN c1799rN2, C0540Hh c0540Hh) {
        this.f7456a = c1799rN;
        this.f7457b = c1799rN2;
        this.f7458c = c0540Hh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qr c() {
        return new Qr((ApplicationInfo) this.f7456a.c(), (PackageInfo) this.f7457b.c(), ((C0540Hh) this.f7458c).a(), 2);
    }
}
