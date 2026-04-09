package com.google.android.gms.common.internal;

import ac.l;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: classes.dex */
public final class zaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaw> CREATOR = new l(25);

    /* renamed from: a, reason: collision with root package name */
    public final int f4855a;

    /* renamed from: d, reason: collision with root package name */
    public final Account f4856d;

    /* renamed from: g, reason: collision with root package name */
    public final int f4857g;

    /* renamed from: r, reason: collision with root package name */
    public final GoogleSignInAccount f4858r;

    public zaw(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f4855a = i10;
        this.f4856d = account;
        this.f4857g = i11;
        this.f4858r = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f4855a);
        i4.O(parcel, 2, this.f4856d, i10);
        i4.S(parcel, 3, 4);
        parcel.writeInt(this.f4857g);
        i4.O(parcel, 4, this.f4858r, i10);
        i4.W(parcel, iU);
    }
}
