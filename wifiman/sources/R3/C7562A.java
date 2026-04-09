package r3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: r3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7562A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        String strF = null;
        IBinder iBinderR = null;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            switch (SafeParcelReader.k(iQ)) {
                case 1:
                    strF = SafeParcelReader.f(parcel, iQ);
                    break;
                case 2:
                    zL = SafeParcelReader.l(parcel, iQ);
                    break;
                case 3:
                    zL2 = SafeParcelReader.l(parcel, iQ);
                    break;
                case 4:
                    iBinderR = SafeParcelReader.r(parcel, iQ);
                    break;
                case 5:
                    zL3 = SafeParcelReader.l(parcel, iQ);
                    break;
                case 6:
                    zL4 = SafeParcelReader.l(parcel, iQ);
                    break;
                default:
                    SafeParcelReader.w(parcel, iQ);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new z(strF, zL, zL2, iBinderR, zL3, zL4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new z[i10];
    }
}
