package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import r3.C7566d;

/* loaded from: classes.dex */
public final class I implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        ArrayList arrayListI = null;
        t tVar = null;
        int iS = 0;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                iS = SafeParcelReader.s(parcel, iQ);
            } else if (iK == 3) {
                strF = SafeParcelReader.f(parcel, iQ);
            } else if (iK == 4) {
                strF2 = SafeParcelReader.f(parcel, iQ);
            } else if (iK == 6) {
                strF3 = SafeParcelReader.f(parcel, iQ);
            } else if (iK == 7) {
                tVar = (t) SafeParcelReader.e(parcel, iQ, t.CREATOR);
            } else if (iK != 8) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                arrayListI = SafeParcelReader.i(parcel, iQ, C7566d.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new t(iS, strF, strF2, strF3, arrayListI, tVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new t[i10];
    }
}
