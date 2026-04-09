package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Ob, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0653Ob extends N2.a {
    public static final Parcelable.Creator<C0653Ob> CREATOR = new C1784r8(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f10208a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f10209b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f10210c;

    public C0653Ob(String str, String[] strArr, String[] strArr2) {
        this.f10208a = str;
        this.f10209b = strArr;
        this.f10210c = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 1, this.f10208a);
        AbstractC0241a.v(parcel, 2, this.f10209b);
        AbstractC0241a.v(parcel, 3, this.f10210c);
        AbstractC0241a.H(parcel, iE);
    }
}
