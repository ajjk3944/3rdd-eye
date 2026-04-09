package I3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        boolean zL = false;
        ArrayList arrayListI = null;
        boolean zL2 = false;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                arrayListI = SafeParcelReader.i(parcel, iQ, LocationRequest.CREATOR);
            } else if (iK == 2) {
                zL = SafeParcelReader.l(parcel, iQ);
            } else if (iK != 3) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                zL2 = SafeParcelReader.l(parcel, iQ);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new f(arrayListI, zL, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
