package W4;

import W4.j;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class k implements Parcelable.Creator {
    static void c(j jVar, Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.p(parcel, 1, jVar.e(), i10, false);
        t3.b.p(parcel, 2, jVar.b(), i10, false);
        t3.b.t(parcel, 3, jVar.f(), false);
        t3.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public j createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList arrayListI = null;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                uri = (Uri) SafeParcelReader.e(parcel, iQ, Uri.CREATOR);
            } else if (iK == 2) {
                uri2 = (Uri) SafeParcelReader.e(parcel, iQ, Uri.CREATOR);
            } else if (iK != 3) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                arrayListI = SafeParcelReader.i(parcel, iQ, j.a.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new j(uri, uri2, arrayListI);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j[] newArray(int i10) {
        return new j[i10];
    }
}
