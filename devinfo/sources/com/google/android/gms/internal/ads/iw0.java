package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class iw0 extends mg implements hw0 {
    public iw0() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        switch (i4) {
            case 2:
                vb.b.r0(parcel.readStrongBinder());
                parcel.readString();
                ng.f(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                ng.f(parcel);
                break;
            case 5:
                parcel.createByteArray();
                ng.f(parcel);
                break;
            case 6:
                parcel.readInt();
                ng.f(parcel);
                break;
            case 7:
                parcel.readInt();
                ng.f(parcel);
                break;
            case 8:
                vb.b.r0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                ng.f(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void y3() {
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void R1(int i4) {
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void n(int i4) {
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void u2(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void b2(vb.b bVar, String str) {
    }
}
