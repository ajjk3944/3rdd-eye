package s3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import r3.C7564b;

/* loaded from: classes.dex */
public final class L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        int iS = 0;
        boolean zL = false;
        boolean zL2 = false;
        IBinder iBinderR = null;
        C7564b c7564b = null;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                iS = SafeParcelReader.s(parcel, iQ);
            } else if (iK == 2) {
                iBinderR = SafeParcelReader.r(parcel, iQ);
            } else if (iK == 3) {
                c7564b = (C7564b) SafeParcelReader.e(parcel, iQ, C7564b.CREATOR);
            } else if (iK == 4) {
                zL = SafeParcelReader.l(parcel, iQ);
            } else if (iK != 5) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                zL2 = SafeParcelReader.l(parcel, iQ);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new K(iS, iBinderR, c7564b, zL, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new K[i10];
    }
}
