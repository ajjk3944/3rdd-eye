package r3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        PendingIntent pendingIntent = null;
        int iS = 0;
        int iS2 = 0;
        String strF = null;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                iS = SafeParcelReader.s(parcel, iQ);
            } else if (iK == 2) {
                iS2 = SafeParcelReader.s(parcel, iQ);
            } else if (iK == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, iQ, PendingIntent.CREATOR);
            } else if (iK != 4) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                strF = SafeParcelReader.f(parcel, iQ);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new C7564b(iS, iS2, pendingIntent, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7564b[i10];
    }
}
