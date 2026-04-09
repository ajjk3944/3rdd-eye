package W4;

import W4.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public class l implements Parcelable.Creator {
    static void c(j.a aVar, Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.q(parcel, 2, aVar.b(), false);
        t3.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public j.a createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strF = null;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            if (SafeParcelReader.k(iQ) != 2) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                strF = SafeParcelReader.f(parcel, iQ);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new j.a(strF);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j.a[] newArray(int i10) {
        return new j.a[i10];
    }
}
