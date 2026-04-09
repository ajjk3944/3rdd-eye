package com.google.android.gms.location;

import I3.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        boolean zL = false;
        s[] sVarArr = null;
        long jT = 0;
        int iS = 1;
        int iS2 = 1;
        int iS3 = 1000;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            switch (SafeParcelReader.k(iQ)) {
                case 1:
                    iS = SafeParcelReader.s(parcel, iQ);
                    break;
                case 2:
                    iS2 = SafeParcelReader.s(parcel, iQ);
                    break;
                case 3:
                    jT = SafeParcelReader.t(parcel, iQ);
                    break;
                case 4:
                    iS3 = SafeParcelReader.s(parcel, iQ);
                    break;
                case 5:
                    sVarArr = (s[]) SafeParcelReader.h(parcel, iQ, s.CREATOR);
                    break;
                case 6:
                    zL = SafeParcelReader.l(parcel, iQ);
                    break;
                default:
                    SafeParcelReader.w(parcel, iQ);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new LocationAvailability(iS3, iS, iS2, jT, sVarArr, zL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
