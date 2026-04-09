package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            if (SafeParcelReader.k(iQ) != 1) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                bundleA = SafeParcelReader.a(parcel, iQ);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new C4917o(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4917o[i10];
    }
}
