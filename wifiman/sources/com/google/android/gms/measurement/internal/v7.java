package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class v7 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        int iS = 0;
        String strF = null;
        Long lU = null;
        Float fP = null;
        String strF2 = null;
        String strF3 = null;
        Double dN = null;
        long jT = 0;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            switch (SafeParcelReader.k(iQ)) {
                case 1:
                    iS = SafeParcelReader.s(parcel, iQ);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, iQ);
                    break;
                case 3:
                    jT = SafeParcelReader.t(parcel, iQ);
                    break;
                case 4:
                    lU = SafeParcelReader.u(parcel, iQ);
                    break;
                case 5:
                    fP = SafeParcelReader.p(parcel, iQ);
                    break;
                case 6:
                    strF2 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 7:
                    strF3 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 8:
                    dN = SafeParcelReader.n(parcel, iQ);
                    break;
                default:
                    SafeParcelReader.w(parcel, iQ);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new r7(iS, strF, jT, lU, fP, strF2, strF3, dN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new r7[i10];
    }
}
