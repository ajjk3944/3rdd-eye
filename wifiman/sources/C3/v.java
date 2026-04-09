package C3;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        IBinder iBinderR = null;
        IBinder iBinderR2 = null;
        PendingIntent pendingIntent = null;
        String strF = null;
        int iS = 0;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                iS = SafeParcelReader.s(parcel, iQ);
            } else if (iK == 2) {
                iBinderR = SafeParcelReader.r(parcel, iQ);
            } else if (iK == 3) {
                iBinderR2 = SafeParcelReader.r(parcel, iQ);
            } else if (iK == 4) {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, iQ, PendingIntent.CREATOR);
            } else if (iK != 6) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                strF = SafeParcelReader.f(parcel, iQ);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new u(iS, iBinderR, iBinderR2, pendingIntent, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new u[i10];
    }
}
