package s3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: s3.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7908x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        ArrayList arrayListI = null;
        int iS = 0;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                iS = SafeParcelReader.s(parcel, iQ);
            } else if (iK != 2) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                arrayListI = SafeParcelReader.i(parcel, iQ, C7899n.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new C7904t(iS, arrayListI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7904t[i10];
    }
}
