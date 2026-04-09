package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.jp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1387jp extends AbstractBinderC1592ne {

    /* renamed from: a, reason: collision with root package name */
    public final C0657Of f14994a;

    /* renamed from: b, reason: collision with root package name */
    public final C1807re f14995b;

    public BinderC1387jp(C0657Of c0657Of, C1807re c1807re) {
        this.f14994a = c0657Of;
        this.f14995b = c1807re;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1646oe
    public final void G2(ParcelFileDescriptor parcelFileDescriptor) {
        this.f14994a.b(new C1818rp(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f14995b));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1646oe
    public final void J2(ParcelFileDescriptor parcelFileDescriptor, C1807re c1807re) {
        this.f14994a.b(new C1818rp(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c1807re));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1646oe
    public final void L0(t2.o oVar) {
        oVar.getClass();
        this.f14994a.c(new t2.n(oVar.f23640a, oVar.f23641b));
    }
}
