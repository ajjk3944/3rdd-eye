package pb;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r extends qb.a {
    public static final Parcelable.Creator<r> CREATOR = new j4.g(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f31659a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f31660b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31661c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f31662d;

    public r(int i4, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f31659a = i4;
        this.f31660b = account;
        this.f31661c = i10;
        this.f31662d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f31659a);
        com.bumptech.glide.f.H(parcel, 2, this.f31660b, i4);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f31661c);
        com.bumptech.glide.f.H(parcel, 4, this.f31662d, i4);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
