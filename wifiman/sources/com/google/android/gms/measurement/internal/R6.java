package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class R6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        long jT = 0;
        long jT2 = 0;
        byte[] bArrB = null;
        String strF = null;
        Bundle bundleA = null;
        String strF2 = null;
        int iS = 0;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            switch (SafeParcelReader.k(iQ)) {
                case 1:
                    jT = SafeParcelReader.t(parcel, iQ);
                    break;
                case 2:
                    bArrB = SafeParcelReader.b(parcel, iQ);
                    break;
                case 3:
                    strF = SafeParcelReader.f(parcel, iQ);
                    break;
                case 4:
                    bundleA = SafeParcelReader.a(parcel, iQ);
                    break;
                case 5:
                    iS = SafeParcelReader.s(parcel, iQ);
                    break;
                case 6:
                    jT2 = SafeParcelReader.t(parcel, iQ);
                    break;
                case 7:
                    strF2 = SafeParcelReader.f(parcel, iQ);
                    break;
                default:
                    SafeParcelReader.w(parcel, iQ);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new N6(jT, bArrB, strF, bundleA, iS, jT2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new N6[i10];
    }
}
