package r3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        long jT = -1;
        int iS = 0;
        String strF = null;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                strF = SafeParcelReader.f(parcel, iQ);
            } else if (iK == 2) {
                iS = SafeParcelReader.s(parcel, iQ);
            } else if (iK != 3) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                jT = SafeParcelReader.t(parcel, iQ);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new C7566d(strF, iS, jT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7566d[i10];
    }
}
