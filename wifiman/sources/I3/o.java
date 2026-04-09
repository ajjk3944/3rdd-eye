package I3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        C3.t tVar = null;
        boolean zL = false;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                zL = SafeParcelReader.l(parcel, iQ);
            } else if (iK != 2) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                tVar = (C3.t) SafeParcelReader.e(parcel, iQ, C3.t.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new n(zL, tVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new n[i10];
    }
}
