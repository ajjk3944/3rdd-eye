package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Pb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0670Pb extends N2.a {
    public static final Parcelable.Creator<C0670Pb> CREATOR = new C1784r8(4);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10439a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10440b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10441c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f10442d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f10443e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f10444f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10445g;

    /* renamed from: h, reason: collision with root package name */
    public final long f10446h;

    public C0670Pb(boolean z6, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z7, long j6) {
        this.f10439a = z6;
        this.f10440b = str;
        this.f10441c = i;
        this.f10442d = bArr;
        this.f10443e = strArr;
        this.f10444f = strArr2;
        this.f10445g = z7;
        this.f10446h = j6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f10439a ? 1 : 0);
        AbstractC0241a.u(parcel, 2, this.f10440b);
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(this.f10441c);
        AbstractC0241a.r(parcel, 4, this.f10442d);
        AbstractC0241a.v(parcel, 5, this.f10443e);
        AbstractC0241a.v(parcel, 6, this.f10444f);
        AbstractC0241a.B(parcel, 7, 4);
        parcel.writeInt(this.f10445g ? 1 : 0);
        AbstractC0241a.B(parcel, 8, 8);
        parcel.writeLong(this.f10446h);
        AbstractC0241a.H(parcel, iE);
    }
}
