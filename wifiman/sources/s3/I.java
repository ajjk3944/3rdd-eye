package s3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class I extends AbstractC8026a {
    public static final Parcelable.Creator<I> CREATOR = new J();

    /* renamed from: a, reason: collision with root package name */
    final int f61183a;

    /* renamed from: b, reason: collision with root package name */
    private final Account f61184b;

    /* renamed from: c, reason: collision with root package name */
    private final int f61185c;

    /* renamed from: d, reason: collision with root package name */
    private final GoogleSignInAccount f61186d;

    I(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f61183a = i10;
        this.f61184b = account;
        this.f61185c = i11;
        this.f61186d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f61183a;
        int iA = t3.b.a(parcel);
        t3.b.k(parcel, 1, i11);
        t3.b.p(parcel, 2, this.f61184b, i10, false);
        t3.b.k(parcel, 3, this.f61185c);
        t3.b.p(parcel, 4, this.f61186d, i10, false);
        t3.b.b(parcel, iA);
    }

    public I(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
