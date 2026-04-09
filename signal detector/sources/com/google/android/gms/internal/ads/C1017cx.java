package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.cx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1017cx extends W2.a implements InterfaceC1071dx {
    @Override // com.google.android.gms.internal.ads.InterfaceC1071dx
    public final void A1(S2.b bVar, String str) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, bVar);
        parcelH0.writeString(str);
        parcelH0.writeString(null);
        I0(parcelH0, 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1071dx
    public final void B(int i) {
        Parcel parcelH0 = h0();
        parcelH0.writeInt(i);
        I0(parcelH0, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1071dx
    public final void a3() {
        Parcel parcelH0 = h0();
        parcelH0.writeIntArray(null);
        I0(parcelH0, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1071dx
    public final void b() {
        I0(h0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1071dx
    public final void d2(byte[] bArr) {
        Parcel parcelH0 = h0();
        parcelH0.writeByteArray(bArr);
        I0(parcelH0, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1071dx
    public final void e0(int i) {
        Parcel parcelH0 = h0();
        parcelH0.writeInt(i);
        I0(parcelH0, 7);
    }
}
