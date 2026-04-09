package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vv0 extends qb.a {
    public static final Parcelable.Creator<vv0> CREATOR = new ci(22);

    /* renamed from: a, reason: collision with root package name */
    public final int f17731a;

    /* renamed from: b, reason: collision with root package name */
    public md f17732b = null;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f17733c;

    public vv0(int i4, byte[] bArr) {
        this.f17731a = i4;
        this.f17733c = bArr;
        a();
    }

    public final void a() {
        md mdVar = this.f17732b;
        if (mdVar != null || this.f17733c == null) {
            if (mdVar == null || this.f17733c != null) {
                if (mdVar != null && this.f17733c != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (mdVar != null || this.f17733c != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f17731a);
        byte[] bArrB = this.f17733c;
        if (bArrB == null) {
            bArrB = this.f17732b.b();
        }
        com.bumptech.glide.f.E(parcel, 2, bArrB);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
