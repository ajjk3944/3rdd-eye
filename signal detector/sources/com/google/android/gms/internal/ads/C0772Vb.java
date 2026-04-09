package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Vb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0772Vb extends N2.a {
    public static final Parcelable.Creator<C0772Vb> CREATOR = new C1784r8(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f12033a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12034b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12035c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12036d;

    public C0772Vb(String str, int i, String str2, boolean z6) {
        this.f12033a = str;
        this.f12034b = z6;
        this.f12035c = i;
        this.f12036d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 1, this.f12033a);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f12034b ? 1 : 0);
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(this.f12035c);
        AbstractC0241a.u(parcel, 4, this.f12036d);
        AbstractC0241a.H(parcel, iE);
    }
}
