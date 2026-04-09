package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.ip, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1334ip extends AbstractBinderC1592ne {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1441kp f14805a;

    public BinderC1334ip(AbstractC1441kp abstractC1441kp) {
        this.f14805a = abstractC1441kp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1646oe
    public final void G2(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        AbstractC1441kp abstractC1441kp = this.f14805a;
        abstractC1441kp.f15279a.b(new C1818rp(autoCloseInputStream, abstractC1441kp.f15283e));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1646oe
    public final void J2(ParcelFileDescriptor parcelFileDescriptor, C1807re c1807re) {
        this.f14805a.f15279a.b(new C1818rp(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c1807re));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1646oe
    public final void L0(t2.o oVar) {
        C0657Of c0657Of = this.f14805a.f15279a;
        oVar.getClass();
        c0657Of.c(new t2.n(oVar.f23640a, oVar.f23641b));
    }
}
