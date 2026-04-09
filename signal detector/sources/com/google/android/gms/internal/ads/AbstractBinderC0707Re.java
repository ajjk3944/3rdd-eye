package com.google.android.gms.internal.ads;

import android.os.Parcel;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.Re, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0707Re extends B7 implements InterfaceC0724Se {
    public AbstractBinderC0707Re() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b();
        } else if (i == 2) {
            int i3 = parcel.readInt();
            C7.f(parcel);
            t(i3);
        } else {
            if (i != 3) {
                return false;
            }
            C2852x0 c2852x0 = (C2852x0) C7.b(parcel, C2852x0.CREATOR);
            C7.f(parcel);
            a(c2852x0);
        }
        parcel2.writeNoException();
        return true;
    }
}
