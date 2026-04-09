package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class h80 implements Parcelable {
    public static final Parcelable.Creator<h80> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final String f28138b;

    /* renamed from: c, reason: collision with root package name */
    private final long f28139c;

    public static final class a implements Parcelable.Creator<h80> {
        @Override // android.os.Parcelable.Creator
        public final h80 createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.l.f(parcel, "parcel");
            return new h80(parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final h80[] newArray(int i) {
            return new h80[i];
        }
    }

    public h80(String url, long j4) {
        kotlin.jvm.internal.l.f(url, "url");
        this.f28138b = url;
        this.f28139c = j4;
    }

    public final long c() {
        return this.f28139c;
    }

    public final String d() {
        return this.f28138b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h80)) {
            return false;
        }
        h80 h80Var = (h80) obj;
        return kotlin.jvm.internal.l.b(this.f28138b, h80Var.f28138b) && this.f28139c == h80Var.f28139c;
    }

    public final int hashCode() {
        int iHashCode = this.f28138b.hashCode() * 31;
        long j4 = this.f28139c;
        return ((int) (j4 ^ (j4 >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "FalseClick(url=" + this.f28138b + ", interval=" + this.f28139c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        kotlin.jvm.internal.l.f(out, "out");
        out.writeString(this.f28138b);
        out.writeLong(this.f28139c);
    }
}
