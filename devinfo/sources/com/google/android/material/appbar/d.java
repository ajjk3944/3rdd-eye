package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends m4.b {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* renamed from: c, reason: collision with root package name */
    public boolean f20322c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20323d;

    /* renamed from: e, reason: collision with root package name */
    public int f20324e;

    /* renamed from: f, reason: collision with root package name */
    public float f20325f;
    public boolean g;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f20322c = parcel.readByte() != 0;
        this.f20323d = parcel.readByte() != 0;
        this.f20324e = parcel.readInt();
        this.f20325f = parcel.readFloat();
        this.g = parcel.readByte() != 0;
    }

    @Override // m4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeByte(this.f20322c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20323d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f20324e);
        parcel.writeFloat(this.f20325f);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
    }
}
