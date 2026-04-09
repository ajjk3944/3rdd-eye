package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4869i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strF = null;
        String strF2 = null;
        r7 r7Var = null;
        String strF3 = null;
        L l10 = null;
        L l11 = null;
        L l12 = null;
        long jT = 0;
        long jT2 = 0;
        long jT3 = 0;
        boolean zL = false;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            switch (SafeParcelReader.k(iQ)) {
                case 2:
                    strF = SafeParcelReader.f(parcel, iQ);
                    break;
                case 3:
                    strF2 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 4:
                    r7Var = (r7) SafeParcelReader.e(parcel, iQ, r7.CREATOR);
                    break;
                case 5:
                    jT = SafeParcelReader.t(parcel, iQ);
                    break;
                case 6:
                    zL = SafeParcelReader.l(parcel, iQ);
                    break;
                case 7:
                    strF3 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 8:
                    l10 = (L) SafeParcelReader.e(parcel, iQ, L.CREATOR);
                    break;
                case 9:
                    jT2 = SafeParcelReader.t(parcel, iQ);
                    break;
                case 10:
                    l11 = (L) SafeParcelReader.e(parcel, iQ, L.CREATOR);
                    break;
                case 11:
                    jT3 = SafeParcelReader.t(parcel, iQ);
                    break;
                case 12:
                    l12 = (L) SafeParcelReader.e(parcel, iQ, L.CREATOR);
                    break;
                default:
                    SafeParcelReader.w(parcel, iQ);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new C4877j(strF, strF2, r7Var, jT, zL, strF3, l10, jT2, l11, jT3, l12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4877j[i10];
    }
}
