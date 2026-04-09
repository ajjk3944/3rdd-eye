package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class bq0 implements Parcelable {
    public static final Parcelable.Creator<bq0> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final String f25365b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25366c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f25367d;

    public static final class a implements Parcelable.Creator<bq0> {
        @Override // android.os.Parcelable.Creator
        public final bq0 createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.l.f(parcel, "parcel");
            return new bq0(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final bq0[] newArray(int i) {
            return new bq0[i];
        }
    }

    public bq0(String apiFramework, String url, boolean z10) {
        kotlin.jvm.internal.l.f(apiFramework, "apiFramework");
        kotlin.jvm.internal.l.f(url, "url");
        this.f25365b = apiFramework;
        this.f25366c = url;
        this.f25367d = z10;
    }

    public final String c() {
        return this.f25365b;
    }

    public final String d() {
        return this.f25366c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq0)) {
            return false;
        }
        bq0 bq0Var = (bq0) obj;
        return kotlin.jvm.internal.l.b(this.f25365b, bq0Var.f25365b) && kotlin.jvm.internal.l.b(this.f25366c, bq0Var.f25366c) && this.f25367d == bq0Var.f25367d;
    }

    public final int hashCode() {
        return (this.f25367d ? 1231 : 1237) + C4121h3.a(this.f25366c, this.f25365b.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.f25365b;
        String str2 = this.f25366c;
        return androidx.work.s.h(j6.l.d("JavaScriptResource(apiFramework=", str, ", url=", str2, ", browserOptional="), this.f25367d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        kotlin.jvm.internal.l.f(out, "out");
        out.writeString(this.f25365b);
        out.writeString(this.f25366c);
        out.writeInt(this.f25367d ? 1 : 0);
    }
}
