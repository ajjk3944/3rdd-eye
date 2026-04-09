package r3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class C implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        boolean zL = false;
        int iS = 0;
        String strF = null;
        int iS2 = 0;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                zL = SafeParcelReader.l(parcel, iQ);
            } else if (iK == 2) {
                strF = SafeParcelReader.f(parcel, iQ);
            } else if (iK == 3) {
                iS2 = SafeParcelReader.s(parcel, iQ);
            } else if (iK != 4) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                iS = SafeParcelReader.s(parcel, iQ);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new B(zL, strF, iS2, iS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new B[i10];
    }
}
