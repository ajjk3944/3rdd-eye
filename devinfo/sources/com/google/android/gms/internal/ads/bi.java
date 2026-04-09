package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bi extends qb.a {
    public static final Parcelable.Creator<bi> CREATOR = new ci(0);

    /* renamed from: a, reason: collision with root package name */
    public ParcelFileDescriptor f9688a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9689b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9690c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9691d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9692e;

    public bi(ParcelFileDescriptor parcelFileDescriptor, boolean z3, boolean z10, long j, boolean z11) {
        this.f9688a = parcelFileDescriptor;
        this.f9689b = z3;
        this.f9690c = z10;
        this.f9691d = j;
        this.f9692e = z11;
    }

    public final synchronized boolean a() {
        return this.f9688a != null;
    }

    public final synchronized ParcelFileDescriptor.AutoCloseInputStream c() {
        if (this.f9688a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f9688a);
        this.f9688a = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean d() {
        return this.f9689b;
    }

    public final synchronized boolean f() {
        return this.f9690c;
    }

    public final synchronized long g() {
        return this.f9691d;
    }

    public final synchronized boolean i() {
        return this.f9692e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        ParcelFileDescriptor parcelFileDescriptor;
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.f9688a;
        }
        com.bumptech.glide.f.H(parcel, 2, parcelFileDescriptor, i4);
        boolean zD = d();
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(zD ? 1 : 0);
        boolean zF = f();
        com.bumptech.glide.f.N(parcel, 4, 4);
        parcel.writeInt(zF ? 1 : 0);
        long jG = g();
        com.bumptech.glide.f.N(parcel, 5, 8);
        parcel.writeLong(jG);
        boolean zI = i();
        com.bumptech.glide.f.N(parcel, 6, 4);
        parcel.writeInt(zI ? 1 : 0);
        com.bumptech.glide.f.P(parcel, iO);
    }

    public bi() {
        this(null, false, false, 0L, false);
    }
}
