package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import o4.AbstractC2763b;
import q2.InterfaceC2854y0;

/* renamed from: com.google.android.gms.internal.ads.mb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1535mb extends W2.a implements InterfaceC1589nb {
    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final S2.a A() {
        return AbstractC2763b.c(k0(h0(), 18));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final InterfaceC0601La C() {
        InterfaceC0601La c0584Ka;
        Parcel parcelK0 = k0(h0(), 29);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            c0584Ka = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            c0584Ka = iInterfaceQueryLocalInterface instanceof InterfaceC0601La ? (InterfaceC0601La) iInterfaceQueryLocalInterface : new C0584Ka(strongBinder);
        }
        parcelK0.recycle();
        return c0584Ka;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final void I() {
        I0(h0(), 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final InterfaceC2854y0 K() {
        Parcel parcelK0 = k0(h0(), 31);
        InterfaceC2854y0 interfaceC2854y0K3 = BinderC1168fk.K3(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return interfaceC2854y0K3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final List S() {
        Parcel parcelK0 = k0(h0(), 23);
        ArrayList arrayList = parcelK0.readArrayList(C7.f7544a);
        parcelK0.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final String b() {
        Parcel parcelK0 = k0(h0(), 2);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final List d() {
        Parcel parcelK0 = k0(h0(), 3);
        ArrayList arrayList = parcelK0.readArrayList(C7.f7544a);
        parcelK0.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final String e() {
        Parcel parcelK0 = k0(h0(), 4);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final InterfaceC0635Na g() {
        InterfaceC0635Na c0618Ma;
        Parcel parcelK0 = k0(h0(), 5);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            c0618Ma = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            c0618Ma = iInterfaceQueryLocalInterface instanceof InterfaceC0635Na ? (InterfaceC0635Na) iInterfaceQueryLocalInterface : new C0618Ma(strongBinder);
        }
        parcelK0.recycle();
        return c0618Ma;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final String h() {
        Parcel parcelK0 = k0(h0(), 7);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final String i() {
        Parcel parcelK0 = k0(h0(), 9);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final String j() {
        Parcel parcelK0 = k0(h0(), 6);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final double k() {
        Parcel parcelK0 = k0(h0(), 8);
        double d6 = parcelK0.readDouble();
        parcelK0.recycle();
        return d6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final InterfaceC0550Ia l() {
        InterfaceC0550Ia c0516Ga;
        Parcel parcelK0 = k0(h0(), 14);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            c0516Ga = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            c0516Ga = iInterfaceQueryLocalInterface instanceof InterfaceC0550Ia ? (InterfaceC0550Ia) iInterfaceQueryLocalInterface : new C0516Ga(strongBinder);
        }
        parcelK0.recycle();
        return c0516Ga;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final void m2(Bundle bundle) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, bundle);
        I0(parcelH0, 33);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final String n() {
        Parcel parcelK0 = k0(h0(), 10);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final q2.B0 o() {
        Parcel parcelK0 = k0(h0(), 11);
        q2.B0 b0K3 = q2.A0.K3(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return b0K3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1589nb
    public final S2.a u() {
        return AbstractC2763b.c(k0(h0(), 19));
    }
}
