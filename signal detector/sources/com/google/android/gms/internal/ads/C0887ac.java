package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.ac, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0887ac extends N2.a {
    public static final Parcelable.Creator<C0887ac> CREATOR = new C1784r8(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f13143a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f13144b;

    public C0887ac(String str, Bundle bundle) {
        this.f13143a = str;
        this.f13144b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 1, this.f13143a);
        AbstractC0241a.q(parcel, 2, this.f13144b);
        AbstractC0241a.H(parcel, iE);
    }
}
