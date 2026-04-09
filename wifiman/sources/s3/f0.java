package s3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        r rVar = null;
        int[] iArrC = null;
        int[] iArrC2 = null;
        boolean zL = false;
        boolean zL2 = false;
        int iS = 0;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            switch (SafeParcelReader.k(iQ)) {
                case 1:
                    rVar = (r) SafeParcelReader.e(parcel, iQ, r.CREATOR);
                    break;
                case 2:
                    zL = SafeParcelReader.l(parcel, iQ);
                    break;
                case 3:
                    zL2 = SafeParcelReader.l(parcel, iQ);
                    break;
                case 4:
                    iArrC = SafeParcelReader.c(parcel, iQ);
                    break;
                case 5:
                    iS = SafeParcelReader.s(parcel, iQ);
                    break;
                case 6:
                    iArrC2 = SafeParcelReader.c(parcel, iQ);
                    break;
                default:
                    SafeParcelReader.w(parcel, iQ);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new C7890e(rVar, zL, zL2, iArrC, iS, iArrC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7890e[i10];
    }
}
