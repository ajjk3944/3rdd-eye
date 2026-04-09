package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.an, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0898an extends B7 implements InterfaceC1105ec {
    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            C7.f(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1105ec
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1105ec
    public final void t(int i) {
    }
}
