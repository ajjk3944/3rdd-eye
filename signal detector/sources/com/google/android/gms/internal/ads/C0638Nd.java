package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Nd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0638Nd extends W2.a implements InterfaceC0672Pd {
    public C0638Nd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void I() {
        I0(h0(), 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void L(S2.a aVar) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        I0(parcelH0, 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void b() {
        I0(h0(), 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void b1(int i, String[] strArr, int[] iArr) {
        Parcel parcelH0 = h0();
        parcelH0.writeInt(i);
        parcelH0.writeStringArray(strArr);
        parcelH0.writeIntArray(iArr);
        I0(parcelH0, 15);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void d() {
        I0(h0(), 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final boolean e() {
        Parcel parcelK0 = k0(h0(), 11);
        ClassLoader classLoader = C7.f7544a;
        boolean z6 = parcelK0.readInt() != 0;
        parcelK0.recycle();
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void g1(Bundle bundle) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, bundle);
        Parcel parcelK0 = k0(parcelH0, 6);
        if (parcelK0.readInt() != 0) {
            bundle.readFromParcel(parcelK0);
        }
        parcelK0.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void h() {
        I0(h0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void i() {
        I0(h0(), 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void j() {
        I0(h0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void k() {
        I0(h0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void l1(int i, int i3, Intent intent) {
        Parcel parcelH0 = h0();
        parcelH0.writeInt(i);
        parcelH0.writeInt(i3);
        C7.c(parcelH0, intent);
        I0(parcelH0, 12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void r() {
        I0(h0(), 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void r3(Bundle bundle) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, bundle);
        I0(parcelH0, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void y() {
        I0(h0(), 8);
    }
}
