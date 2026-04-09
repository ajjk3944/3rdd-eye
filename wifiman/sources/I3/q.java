package I3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        Status status = null;
        i iVar = null;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                status = (Status) SafeParcelReader.e(parcel, iQ, Status.CREATOR);
            } else if (iK != 2) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                iVar = (i) SafeParcelReader.e(parcel, iQ, i.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new h(status, iVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
