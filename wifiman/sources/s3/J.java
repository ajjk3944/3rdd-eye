package s3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        Account account = null;
        int iS = 0;
        int iS2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            int iK = SafeParcelReader.k(iQ);
            if (iK == 1) {
                iS = SafeParcelReader.s(parcel, iQ);
            } else if (iK == 2) {
                account = (Account) SafeParcelReader.e(parcel, iQ, Account.CREATOR);
            } else if (iK == 3) {
                iS2 = SafeParcelReader.s(parcel, iQ);
            } else if (iK != 4) {
                SafeParcelReader.w(parcel, iQ);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.e(parcel, iQ, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new I(iS, account, iS2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new I[i10];
    }
}
