package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4852g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        long jT = 0;
        long jT2 = 0;
        int iS = 0;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                jT = SafeParcelReader.t(parcel, iQ);
            } else if (iK == 2) {
                iS = SafeParcelReader.s(parcel, iQ);
            } else if (iK != 3) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                jT2 = SafeParcelReader.t(parcel, iQ);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new C4861h(jT, iS, jT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4861h[i10];
    }
}
