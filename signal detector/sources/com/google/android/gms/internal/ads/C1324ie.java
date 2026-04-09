package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.ie, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1324ie extends N2.a {
    public static final Parcelable.Creator<C1324ie> CREATOR = new C1784r8(12);

    /* renamed from: a, reason: collision with root package name */
    public final String f14731a;

    public C1324ie(String str) {
        this.f14731a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 1, this.f14731a);
        AbstractC0241a.H(parcel, iE);
    }
}
