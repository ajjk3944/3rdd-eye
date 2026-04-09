package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ex, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1126ex extends B7 implements InterfaceC1071dx {
    public BinderC1126ex() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1071dx
    public final void B(int i) {
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                S2.b.d1(parcel.readStrongBinder());
                parcel.readString();
                C7.f(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                C7.f(parcel);
                break;
            case 5:
                parcel.createByteArray();
                C7.f(parcel);
                break;
            case 6:
                parcel.readInt();
                C7.f(parcel);
                break;
            case 7:
                parcel.readInt();
                C7.f(parcel);
                break;
            case 8:
                S2.b.d1(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                C7.f(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1071dx
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1071dx
    public final void d2(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1071dx
    public final void e0(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1071dx
    public final void a3() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1071dx
    public final void A1(S2.b bVar, String str) {
    }
}
