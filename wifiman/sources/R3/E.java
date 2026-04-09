package r3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class E implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        boolean zL = false;
        String strF = null;
        IBinder iBinderR = null;
        boolean zL2 = false;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                strF = SafeParcelReader.f(parcel, iQ);
            } else if (iK == 2) {
                iBinderR = SafeParcelReader.r(parcel, iQ);
            } else if (iK == 3) {
                zL = SafeParcelReader.l(parcel, iQ);
            } else if (iK != 4) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                zL2 = SafeParcelReader.l(parcel, iQ);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new D(strF, iBinderR, zL, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new D[i10];
    }
}
