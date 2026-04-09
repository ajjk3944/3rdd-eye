package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Ow extends N2.a {
    public static final Parcelable.Creator<Ow> CREATOR = new C1784r8(20);

    /* renamed from: a, reason: collision with root package name */
    public final int f10275a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10276b;

    public Ow(int i, byte[] bArr) {
        this.f10275a = i;
        this.f10276b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f10275a);
        AbstractC0241a.r(parcel, 2, this.f10276b);
        AbstractC0241a.H(parcel, iE);
    }
}
