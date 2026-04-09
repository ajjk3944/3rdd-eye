package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class O implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strF = null;
        K k10 = null;
        String strF2 = null;
        long jT = 0;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 2) {
                strF = SafeParcelReader.f(parcel, iQ);
            } else if (iK == 3) {
                k10 = (K) SafeParcelReader.e(parcel, iQ, K.CREATOR);
            } else if (iK == 4) {
                strF2 = SafeParcelReader.f(parcel, iQ);
            } else if (iK != 5) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                jT = SafeParcelReader.t(parcel, iQ);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new L(strF, k10, strF2, jT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new L[i10];
    }
}
