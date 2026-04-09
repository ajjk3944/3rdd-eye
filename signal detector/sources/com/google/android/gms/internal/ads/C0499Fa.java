package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;
import m2.C2657d;

/* renamed from: com.google.android.gms.internal.ads.Fa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0499Fa extends N2.a {
    public static final Parcelable.Creator<C0499Fa> CREATOR = new C1784r8(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f8127a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8128b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8129c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8130d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8131e;

    /* renamed from: f, reason: collision with root package name */
    public final q2.Y0 f8132f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8133g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8134h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f8135j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8136k;

    public C0499Fa(int i, boolean z6, int i3, boolean z7, int i6, q2.Y0 y02, boolean z8, int i7, int i8, boolean z9, int i9) {
        this.f8127a = i;
        this.f8128b = z6;
        this.f8129c = i3;
        this.f8130d = z7;
        this.f8131e = i6;
        this.f8132f = y02;
        this.f8133g = z8;
        this.f8134h = i7;
        this.f8135j = z9;
        this.i = i8;
        this.f8136k = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f8127a);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f8128b ? 1 : 0);
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(this.f8129c);
        AbstractC0241a.B(parcel, 4, 4);
        parcel.writeInt(this.f8130d ? 1 : 0);
        AbstractC0241a.B(parcel, 5, 4);
        parcel.writeInt(this.f8131e);
        AbstractC0241a.t(parcel, 6, this.f8132f, i);
        AbstractC0241a.B(parcel, 7, 4);
        parcel.writeInt(this.f8133g ? 1 : 0);
        AbstractC0241a.B(parcel, 8, 4);
        parcel.writeInt(this.f8134h);
        AbstractC0241a.B(parcel, 9, 4);
        parcel.writeInt(this.i);
        AbstractC0241a.B(parcel, 10, 4);
        parcel.writeInt(this.f8135j ? 1 : 0);
        AbstractC0241a.B(parcel, 11, 4);
        parcel.writeInt(this.f8136k);
        AbstractC0241a.H(parcel, iE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0499Fa(C2657d c2657d) {
        boolean z6 = c2657d.f21942a;
        int i = c2657d.f21943b;
        boolean z7 = c2657d.f21945d;
        int i3 = c2657d.f21946e;
        j2.t tVar = c2657d.f21947f;
        this(4, z6, i, z7, i3, tVar != null ? new q2.Y0(tVar) : null, c2657d.f21948g, c2657d.f21944c, 0, false, 0);
    }
}
