package N3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import r3.C7564b;
import s3.K;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        C7564b c7564b = null;
        int iS = 0;
        K k10 = null;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                iS = SafeParcelReader.s(parcel, iQ);
            } else if (iK == 2) {
                c7564b = (C7564b) SafeParcelReader.e(parcel, iQ, C7564b.CREATOR);
            } else if (iK != 3) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                k10 = (K) SafeParcelReader.e(parcel, iQ, K.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new l(iS, c7564b, k10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
