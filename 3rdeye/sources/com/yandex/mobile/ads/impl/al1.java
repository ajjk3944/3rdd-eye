package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class al1 extends f12 {
    public static final Parcelable.Creator<al1> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f24720b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24721c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f24722d;

    public class a implements Parcelable.Creator<al1> {
        @Override // android.os.Parcelable.Creator
        public final al1 createFromParcel(Parcel parcel) {
            return new al1(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final al1[] newArray(int i) {
            return new al1[i];
        }
    }

    public /* synthetic */ al1(Parcel parcel, int i) {
        this(parcel);
    }

    public static al1 a(uf1 uf1Var, int i, long j4) {
        long jV = uf1Var.v();
        int i10 = i - 4;
        byte[] bArr = new byte[i10];
        uf1Var.a(bArr, 0, i10);
        return new al1(jV, bArr, j4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f24720b);
        parcel.writeLong(this.f24721c);
        parcel.writeByteArray(this.f24722d);
    }

    private al1(long j4, byte[] bArr, long j10) {
        this.f24720b = j10;
        this.f24721c = j4;
        this.f24722d = bArr;
    }

    private al1(Parcel parcel) {
        this.f24720b = parcel.readLong();
        this.f24721c = parcel.readLong();
        this.f24722d = (byte[]) s82.a(parcel.createByteArray());
    }
}
