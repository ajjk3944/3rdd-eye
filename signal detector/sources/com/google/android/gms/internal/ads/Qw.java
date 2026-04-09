package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Qw extends N2.a {
    public static final Parcelable.Creator<Qw> CREATOR = new C1784r8(21);

    /* renamed from: a, reason: collision with root package name */
    public final int f10810a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10811b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10812c;

    public Qw(int i, String str, String str2) {
        this.f10810a = i;
        this.f10811b = str;
        this.f10812c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f10810a);
        AbstractC0241a.u(parcel, 2, this.f10811b);
        AbstractC0241a.u(parcel, 3, this.f10812c);
        AbstractC0241a.H(parcel, iE);
    }
}
