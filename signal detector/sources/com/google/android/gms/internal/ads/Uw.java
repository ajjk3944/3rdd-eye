package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Uw extends N2.a {
    public static final Parcelable.Creator<Uw> CREATOR = new C1784r8(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f11835a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11836b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11837c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11838d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11839e;

    public Uw(int i, int i3, int i6, String str, String str2) {
        this.f11835a = i;
        this.f11836b = i3;
        this.f11837c = str;
        this.f11838d = str2;
        this.f11839e = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f11835a);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f11836b);
        AbstractC0241a.u(parcel, 3, this.f11837c);
        AbstractC0241a.u(parcel, 4, this.f11838d);
        AbstractC0241a.B(parcel, 5, 4);
        parcel.writeInt(this.f11839e);
        AbstractC0241a.H(parcel, iE);
    }
}
