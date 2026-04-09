package W4;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public class b implements Parcelable.Creator {
    static void c(a aVar, Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.q(parcel, 1, aVar.f(), false);
        t3.b.q(parcel, 2, aVar.e(), false);
        t3.b.k(parcel, 3, aVar.i());
        t3.b.n(parcel, 4, aVar.b());
        t3.b.e(parcel, 5, aVar.g(), false);
        t3.b.p(parcel, 6, aVar.j(), i10, false);
        t3.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strF = null;
        String strF2 = null;
        Bundle bundleA = null;
        Uri uri = null;
        int iS = 0;
        long jT = 0;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            switch (SafeParcelReader.k(iQ)) {
                case 1:
                    strF = SafeParcelReader.f(parcel, iQ);
                    break;
                case 2:
                    strF2 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 3:
                    iS = SafeParcelReader.s(parcel, iQ);
                    break;
                case 4:
                    jT = SafeParcelReader.t(parcel, iQ);
                    break;
                case 5:
                    bundleA = SafeParcelReader.a(parcel, iQ);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.e(parcel, iQ, Uri.CREATOR);
                    break;
                default:
                    SafeParcelReader.w(parcel, iQ);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new a(strF, strF2, iS, jT, bundleA, uri);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a[] newArray(int i10) {
        return new a[i10];
    }
}
