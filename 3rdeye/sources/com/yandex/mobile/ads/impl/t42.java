package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class t42 extends f12 {
    public static final Parcelable.Creator<t42> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f33438b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33439c;

    public class a implements Parcelable.Creator<t42> {
        @Override // android.os.Parcelable.Creator
        public final t42 createFromParcel(Parcel parcel) {
            return new t42(parcel.readLong(), parcel.readLong(), 0);
        }

        @Override // android.os.Parcelable.Creator
        public final t42[] newArray(int i) {
            return new t42[i];
        }
    }

    public /* synthetic */ t42(long j4, long j10, int i) {
        this(j4, j10);
    }

    public static t42 a(uf1 uf1Var, long j4, c52 c52Var) {
        long jA = a(j4, uf1Var);
        return new t42(jA, c52Var.b(jA));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f33438b);
        parcel.writeLong(this.f33439c);
    }

    private t42(long j4, long j10) {
        this.f33438b = j4;
        this.f33439c = j10;
    }

    public static long a(long j4, uf1 uf1Var) {
        long jT = uf1Var.t();
        if ((128 & jT) != 0) {
            return 8589934591L & ((((jT & 1) << 32) | uf1Var.v()) + j4);
        }
        return -9223372036854775807L;
    }
}
