package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d extends W.b {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* renamed from: c, reason: collision with root package name */
    public boolean f18081c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18082d;

    /* renamed from: e, reason: collision with root package name */
    public int f18083e;

    /* renamed from: f, reason: collision with root package name */
    public float f18084f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18085g;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f18081c = parcel.readByte() != 0;
        this.f18082d = parcel.readByte() != 0;
        this.f18083e = parcel.readInt();
        this.f18084f = parcel.readFloat();
        this.f18085g = parcel.readByte() != 0;
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f18081c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f18082d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f18083e);
        parcel.writeFloat(this.f18084f);
        parcel.writeByte(this.f18085g ? (byte) 1 : (byte) 0);
    }
}
