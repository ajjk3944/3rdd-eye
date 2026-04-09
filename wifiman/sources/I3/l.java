package I3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        C3.t tVar = null;
        int iS = 0;
        boolean zL = false;
        long jT = Long.MAX_VALUE;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                jT = SafeParcelReader.t(parcel, iQ);
            } else if (iK == 2) {
                iS = SafeParcelReader.s(parcel, iQ);
            } else if (iK == 3) {
                zL = SafeParcelReader.l(parcel, iQ);
            } else if (iK != 5) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                tVar = (C3.t) SafeParcelReader.e(parcel, iQ, C3.t.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new d(jT, iS, zL, tVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
