package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class J6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strF = null;
        long jT = 0;
        int iS = 0;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                strF = SafeParcelReader.f(parcel, iQ);
            } else if (iK == 2) {
                jT = SafeParcelReader.t(parcel, iQ);
            } else if (iK != 3) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                iS = SafeParcelReader.s(parcel, iQ);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new K6(strF, jT, iS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new K6[i10];
    }
}
