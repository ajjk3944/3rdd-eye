package s3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class W implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        int iS = 0;
        boolean zL = false;
        boolean zL2 = false;
        int iS2 = 0;
        int iS3 = 0;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                iS = SafeParcelReader.s(parcel, iQ);
            } else if (iK == 2) {
                zL = SafeParcelReader.l(parcel, iQ);
            } else if (iK == 3) {
                zL2 = SafeParcelReader.l(parcel, iQ);
            } else if (iK == 4) {
                iS2 = SafeParcelReader.s(parcel, iQ);
            } else if (iK != 5) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                iS3 = SafeParcelReader.s(parcel, iQ);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new r(iS, zL, zL2, iS2, iS3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }
}
