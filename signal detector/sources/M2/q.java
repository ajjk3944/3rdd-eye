package M2;

import a.AbstractC0241a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class q extends N2.a {
    public static final Parcelable.Creator<q> CREATOR = new A3.q(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f2801a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f2802b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2803c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f2804d;

    public q(int i, Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this.f2801a = i;
        this.f2802b = account;
        this.f2803c = i3;
        this.f2804d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f2801a);
        AbstractC0241a.t(parcel, 2, this.f2802b, i);
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(this.f2803c);
        AbstractC0241a.t(parcel, 4, this.f2804d, i);
        AbstractC0241a.H(parcel, iE);
    }
}
