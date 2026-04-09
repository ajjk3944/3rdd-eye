package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Uri uri = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList arrayListI = null;
        String strF7 = null;
        String strF8 = null;
        long jT = 0;
        int iS = 0;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            switch (SafeParcelReader.k(iQ)) {
                case 1:
                    iS = SafeParcelReader.s(parcel, iQ);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, iQ);
                    break;
                case 3:
                    strF2 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 4:
                    strF3 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 5:
                    strF4 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.e(parcel, iQ, Uri.CREATOR);
                    break;
                case 7:
                    strF5 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 8:
                    jT = SafeParcelReader.t(parcel, iQ);
                    break;
                case 9:
                    strF6 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 10:
                    arrayListI = SafeParcelReader.i(parcel, iQ, Scope.CREATOR);
                    break;
                case 11:
                    strF7 = SafeParcelReader.f(parcel, iQ);
                    break;
                case 12:
                    strF8 = SafeParcelReader.f(parcel, iQ);
                    break;
                default:
                    SafeParcelReader.w(parcel, iQ);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new GoogleSignInAccount(iS, strF, strF2, strF3, strF4, uri, strF5, jT, strF6, arrayListI, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
