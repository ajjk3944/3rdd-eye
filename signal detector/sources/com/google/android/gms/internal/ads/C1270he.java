package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.he, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1270he extends N2.a {
    public static final Parcelable.Creator<C1270he> CREATOR = new C1784r8(11);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14513a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14514b;

    public C1270he(List list, boolean z6) {
        this.f14513a = z6;
        this.f14514b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f14513a ? 1 : 0);
        AbstractC0241a.w(parcel, 3, this.f14514b);
        AbstractC0241a.H(parcel, iE);
    }
}
