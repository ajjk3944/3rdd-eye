package com.google.android.gms.location;

import C3.t;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        WorkSource workSource = new WorkSource();
        t tVar = null;
        boolean zL = false;
        int iS = 0;
        int iS2 = 0;
        boolean zL2 = false;
        long jT = -1;
        float fO = 0.0f;
        int iS3 = Integer.MAX_VALUE;
        long jT2 = Long.MAX_VALUE;
        long jT3 = Long.MAX_VALUE;
        long jT4 = 0;
        long jT5 = 600000;
        long jT6 = 3600000;
        int iS4 = 102;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            switch (SafeParcelReader.k(iQ)) {
                case 1:
                    iS4 = SafeParcelReader.s(parcel, iQ);
                    break;
                case 2:
                    jT6 = SafeParcelReader.t(parcel, iQ);
                    break;
                case 3:
                    jT5 = SafeParcelReader.t(parcel, iQ);
                    break;
                case 4:
                case 14:
                default:
                    SafeParcelReader.w(parcel, iQ);
                    break;
                case 5:
                    jT2 = SafeParcelReader.t(parcel, iQ);
                    break;
                case 6:
                    iS3 = SafeParcelReader.s(parcel, iQ);
                    break;
                case 7:
                    fO = SafeParcelReader.o(parcel, iQ);
                    break;
                case 8:
                    jT4 = SafeParcelReader.t(parcel, iQ);
                    break;
                case 9:
                    zL = SafeParcelReader.l(parcel, iQ);
                    break;
                case 10:
                    jT3 = SafeParcelReader.t(parcel, iQ);
                    break;
                case 11:
                    jT = SafeParcelReader.t(parcel, iQ);
                    break;
                case 12:
                    iS = SafeParcelReader.s(parcel, iQ);
                    break;
                case 13:
                    iS2 = SafeParcelReader.s(parcel, iQ);
                    break;
                case 15:
                    zL2 = SafeParcelReader.l(parcel, iQ);
                    break;
                case 16:
                    workSource = (WorkSource) SafeParcelReader.e(parcel, iQ, WorkSource.CREATOR);
                    break;
                case 17:
                    tVar = (t) SafeParcelReader.e(parcel, iQ, t.CREATOR);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new LocationRequest(iS4, jT6, jT5, jT4, jT2, jT3, iS3, fO, zL, jT, iS, iS2, zL2, workSource, tVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
