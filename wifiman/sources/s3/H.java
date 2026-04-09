package s3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class H implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        int iS = -1;
        int iS2 = 0;
        int iS3 = 0;
        int iS4 = 0;
        int iS5 = 0;
        String strF = null;
        String strF2 = null;
        long jT = 0;
        long jT2 = 0;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            switch (SafeParcelReader.k(iQ)) {
                case 1:
                    iS2 = SafeParcelReader.s(parcel, iQ);
                    break;
                case 2:
                    iS3 = SafeParcelReader.s(parcel, iQ);
                    break;
                case 3:
                    iS4 = SafeParcelReader.s(parcel, iQ);
                    break;
                case 4:
                    jT = SafeParcelReader.t(parcel, iQ);
                    break;
                case 5:
                    jT2 = SafeParcelReader.t(parcel, iQ);
                    break;
                case 6:
                    strF = SafeParcelReader.f(parcel, iQ);
                    break;
                case 7:
                    strF2 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 8:
                    iS5 = SafeParcelReader.s(parcel, iQ);
                    break;
                case 9:
                    iS = SafeParcelReader.s(parcel, iQ);
                    break;
                default:
                    SafeParcelReader.w(parcel, iQ);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new C7899n(iS2, iS3, iS4, jT, jT2, strF, strF2, iS5, iS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7899n[i10];
    }
}
