package I3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        long jT = -1;
        long jT2 = -1;
        int iS = 1;
        int iS2 = 1;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                iS = SafeParcelReader.s(parcel, iQ);
            } else if (iK == 2) {
                iS2 = SafeParcelReader.s(parcel, iQ);
            } else if (iK == 3) {
                jT = SafeParcelReader.t(parcel, iQ);
            } else if (iK != 4) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                jT2 = SafeParcelReader.t(parcel, iQ);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new s(iS, iS2, jT, jT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new s[i10];
    }
}
