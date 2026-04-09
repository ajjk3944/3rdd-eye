package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.We, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0792We extends N2.a {
    public static final Parcelable.Creator<C0792We> CREATOR = new C1784r8(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f12228a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12229b;

    public C0792We(String str, String str2) {
        this.f12228a = str;
        this.f12229b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 1, this.f12228a);
        AbstractC0241a.u(parcel, 2, this.f12229b);
        AbstractC0241a.H(parcel, iE);
    }
}
