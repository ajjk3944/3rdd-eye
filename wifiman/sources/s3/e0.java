package s3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import r3.C7566d;

/* loaded from: classes.dex */
public final class e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        Bundle bundleA = null;
        C7890e c7890e = null;
        int iS = 0;
        C7566d[] c7566dArr = null;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                bundleA = SafeParcelReader.a(parcel, iQ);
            } else if (iK == 2) {
                c7566dArr = (C7566d[]) SafeParcelReader.h(parcel, iQ, C7566d.CREATOR);
            } else if (iK == 3) {
                iS = SafeParcelReader.s(parcel, iQ);
            } else if (iK != 4) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                c7890e = (C7890e) SafeParcelReader.e(parcel, iQ, C7890e.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new d0(bundleA, c7566dArr, iS, c7890e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d0[i10];
    }
}
