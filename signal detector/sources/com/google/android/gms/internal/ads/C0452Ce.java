package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Ce, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0452Ce extends N2.a {
    public static final Parcelable.Creator<C0452Ce> CREATOR = new C1784r8(14);

    /* renamed from: a, reason: collision with root package name */
    public final q2.a1 f7629a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7630b;

    public C0452Ce(String str, q2.a1 a1Var) {
        this.f7629a = a1Var;
        this.f7630b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.t(parcel, 2, this.f7629a, i);
        AbstractC0241a.u(parcel, 3, this.f7630b);
        AbstractC0241a.H(parcel, iE);
    }
}
