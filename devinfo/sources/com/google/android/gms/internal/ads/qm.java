package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qm extends qb.a {
    public static final Parcelable.Creator<qm> CREATOR = new ci(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f15365a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15366b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15367c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15368d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15369e;

    /* renamed from: f, reason: collision with root package name */
    public final va.x2 f15370f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15371h;

    /* renamed from: i, reason: collision with root package name */
    public final int f15372i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final int f15373k;

    public qm(int i4, boolean z3, int i10, boolean z10, int i11, va.x2 x2Var, boolean z11, int i12, int i13, boolean z12, int i14) {
        this.f15365a = i4;
        this.f15366b = z3;
        this.f15367c = i10;
        this.f15368d = z10;
        this.f15369e = i11;
        this.f15370f = x2Var;
        this.g = z11;
        this.f15371h = i12;
        this.j = z12;
        this.f15372i = i13;
        this.f15373k = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f15365a);
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(this.f15366b ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f15367c);
        com.bumptech.glide.f.N(parcel, 4, 4);
        parcel.writeInt(this.f15368d ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 5, 4);
        parcel.writeInt(this.f15369e);
        com.bumptech.glide.f.H(parcel, 6, this.f15370f, i4);
        com.bumptech.glide.f.N(parcel, 7, 4);
        parcel.writeInt(this.g ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 8, 4);
        parcel.writeInt(this.f15371h);
        com.bumptech.glide.f.N(parcel, 9, 4);
        parcel.writeInt(this.f15372i);
        com.bumptech.glide.f.N(parcel, 10, 4);
        parcel.writeInt(this.j ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 11, 4);
        parcel.writeInt(this.f15373k);
        com.bumptech.glide.f.P(parcel, iO);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qm(sa.d dVar) {
        boolean z3 = dVar.f33511a;
        int i4 = dVar.f33512b;
        boolean z10 = dVar.f33514d;
        int i10 = dVar.f33515e;
        pa.t tVar = dVar.f33516f;
        this(4, z3, i4, z10, i10, tVar != null ? new va.x2(tVar) : null, dVar.g, dVar.f33513c, 0, false, 0);
    }
}
