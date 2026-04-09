package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.measurement.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4380j1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        int iS = 0;
        String strF = null;
        Intent intent = null;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                iS = SafeParcelReader.s(parcel, iQ);
            } else if (iK == 2) {
                strF = SafeParcelReader.f(parcel, iQ);
            } else if (iK != 3) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                intent = (Intent) SafeParcelReader.e(parcel, iQ, Intent.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new C4353g1(iS, strF, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4353g1[i10];
    }
}
