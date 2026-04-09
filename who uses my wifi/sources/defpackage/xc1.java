package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xc1 extends l0 {
    public static final Parcelable.Creator<xc1> CREATOR = new kq0(11);
    public final int f;
    public final Account g;
    public final int h;
    public final GoogleSignInAccount i;

    public xc1(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f = i;
        this.g = account;
        this.h = i2;
        this.i = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.f);
        uk2.C(parcel, 2, this.g, i);
        uk2.T(parcel, 3, 4);
        parcel.writeInt(this.h);
        uk2.C(parcel, 4, this.i, i);
        uk2.O(parcel, I);
    }
}
