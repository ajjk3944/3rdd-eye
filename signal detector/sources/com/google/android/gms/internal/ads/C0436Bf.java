package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Bf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436Bf extends N2.a {
    public static final Parcelable.Creator<C0436Bf> CREATOR = new C1784r8(18);

    /* renamed from: a, reason: collision with root package name */
    public final String f7377a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7378b;

    /* renamed from: c, reason: collision with root package name */
    public final q2.d1 f7379c;

    /* renamed from: d, reason: collision with root package name */
    public final q2.a1 f7380d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7381e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7382f;

    public C0436Bf(String str, String str2, q2.d1 d1Var, q2.a1 a1Var, int i, String str3) {
        this.f7377a = str;
        this.f7378b = str2;
        this.f7379c = d1Var;
        this.f7380d = a1Var;
        this.f7381e = i;
        this.f7382f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 1, this.f7377a);
        AbstractC0241a.u(parcel, 2, this.f7378b);
        AbstractC0241a.t(parcel, 3, this.f7379c, i);
        AbstractC0241a.t(parcel, 4, this.f7380d, i);
        AbstractC0241a.B(parcel, 5, 4);
        parcel.writeInt(this.f7381e);
        AbstractC0241a.u(parcel, 6, this.f7382f);
        AbstractC0241a.H(parcel, iE);
    }
}
