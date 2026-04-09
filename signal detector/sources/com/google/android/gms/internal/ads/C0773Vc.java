package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import o4.AbstractC2763b;

/* renamed from: com.google.android.gms.internal.ads.Vc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0773Vc extends W2.a implements InterfaceC0790Wc {
    public C0773Vc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final void C2(S2.a aVar, S2.a aVar2, S2.a aVar3) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.e(parcelH0, aVar2);
        C7.e(parcelH0, aVar3);
        I0(parcelH0, 21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final float H() {
        Parcel parcelK0 = k0(h0(), 25);
        float f2 = parcelK0.readFloat();
        parcelK0.recycle();
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final void J() {
        I0(h0(), 26);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final float M() {
        Parcel parcelK0 = k0(h0(), 24);
        float f2 = parcelK0.readFloat();
        parcelK0.recycle();
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final boolean N() {
        Parcel parcelK0 = k0(h0(), 17);
        ClassLoader classLoader = C7.f7544a;
        boolean z6 = parcelK0.readInt() != 0;
        parcelK0.recycle();
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final void N0(S2.a aVar) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        I0(parcelH0, 22);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final float S() {
        Parcel parcelK0 = k0(h0(), 23);
        float f2 = parcelK0.readFloat();
        parcelK0.recycle();
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final boolean W() {
        Parcel parcelK0 = k0(h0(), 18);
        ClassLoader classLoader = C7.f7544a;
        boolean z6 = parcelK0.readInt() != 0;
        parcelK0.recycle();
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final String b() {
        Parcel parcelK0 = k0(h0(), 2);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final List d() {
        Parcel parcelK0 = k0(h0(), 3);
        ArrayList arrayList = parcelK0.readArrayList(C7.f7544a);
        parcelK0.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final String e() {
        Parcel parcelK0 = k0(h0(), 4);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final InterfaceC0635Na g() {
        Parcel parcelK0 = k0(h0(), 5);
        InterfaceC0635Na interfaceC0635NaK3 = BinderC0465Da.K3(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return interfaceC0635NaK3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final String h() {
        Parcel parcelK0 = k0(h0(), 7);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final String i() {
        Parcel parcelK0 = k0(h0(), 9);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final String j() {
        Parcel parcelK0 = k0(h0(), 6);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final double k() {
        Parcel parcelK0 = k0(h0(), 8);
        double d6 = parcelK0.readDouble();
        parcelK0.recycle();
        return d6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final S2.a l() {
        return AbstractC2763b.c(k0(h0(), 14));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final void m0(S2.a aVar) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        I0(parcelH0, 20);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final String n() {
        Parcel parcelK0 = k0(h0(), 10);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final q2.B0 o() {
        Parcel parcelK0 = k0(h0(), 11);
        q2.B0 b0K3 = q2.A0.K3(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return b0K3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final InterfaceC0550Ia p() {
        Parcel parcelK0 = k0(h0(), 12);
        InterfaceC0550Ia interfaceC0550IaK3 = AbstractBinderC0533Ha.K3(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return interfaceC0550IaK3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final S2.a q() {
        return AbstractC2763b.c(k0(h0(), 13));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final Bundle r() {
        Parcel parcelK0 = k0(h0(), 16);
        Bundle bundle = (Bundle) C7.b(parcelK0, Bundle.CREATOR);
        parcelK0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final void u() {
        I0(h0(), 19);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final S2.a w() {
        return AbstractC2763b.c(k0(h0(), 15));
    }
}
