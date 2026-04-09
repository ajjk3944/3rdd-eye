package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.measurement.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4362h1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        long jT = 0;
        long jT2 = 0;
        boolean zL = false;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        Bundle bundleA = null;
        String strF4 = null;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            switch (SafeParcelReader.k(iQ)) {
                case 1:
                    jT = SafeParcelReader.t(parcel, iQ);
                    break;
                case 2:
                    jT2 = SafeParcelReader.t(parcel, iQ);
                    break;
                case 3:
                    zL = SafeParcelReader.l(parcel, iQ);
                    break;
                case 4:
                    strF = SafeParcelReader.f(parcel, iQ);
                    break;
                case 5:
                    strF2 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 6:
                    strF3 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 7:
                    bundleA = SafeParcelReader.a(parcel, iQ);
                    break;
                case 8:
                    strF4 = SafeParcelReader.f(parcel, iQ);
                    break;
                default:
                    SafeParcelReader.w(parcel, iQ);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new C4326d1(jT, jT2, zL, strF, strF2, strF3, bundleA, strF4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4326d1[i10];
    }
}
