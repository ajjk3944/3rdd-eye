package I3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        boolean zL5 = false;
        boolean zL6 = false;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            switch (SafeParcelReader.k(iQ)) {
                case 1:
                    zL = SafeParcelReader.l(parcel, iQ);
                    break;
                case 2:
                    zL2 = SafeParcelReader.l(parcel, iQ);
                    break;
                case 3:
                    zL3 = SafeParcelReader.l(parcel, iQ);
                    break;
                case 4:
                    zL4 = SafeParcelReader.l(parcel, iQ);
                    break;
                case 5:
                    zL5 = SafeParcelReader.l(parcel, iQ);
                    break;
                case 6:
                    zL6 = SafeParcelReader.l(parcel, iQ);
                    break;
                default:
                    SafeParcelReader.w(parcel, iQ);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new i(zL, zL2, zL3, zL4, zL5, zL6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
