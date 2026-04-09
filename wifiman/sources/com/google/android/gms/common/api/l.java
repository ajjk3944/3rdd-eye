package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import r3.C7564b;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strF = null;
        C7564b c7564b = null;
        int iS = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                iS = SafeParcelReader.s(parcel, iQ);
            } else if (iK == 2) {
                strF = SafeParcelReader.f(parcel, iQ);
            } else if (iK == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, iQ, PendingIntent.CREATOR);
            } else if (iK != 4) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                c7564b = (C7564b) SafeParcelReader.e(parcel, iQ, C7564b.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new Status(iS, strF, pendingIntent, c7564b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
