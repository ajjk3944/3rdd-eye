package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class k22 implements Comparable<k22>, Parcelable {
    public static final Parcelable.Creator<k22> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f29482b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29483c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29484d;

    public class a implements Parcelable.Creator<k22> {
        @Override // android.os.Parcelable.Creator
        public final k22 createFromParcel(Parcel parcel) {
            return new k22(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k22[] newArray(int i) {
            return new k22[i];
        }
    }

    public k22(int i, int i10, int i11) {
        this.f29482b = i;
        this.f29483c = i10;
        this.f29484d = i11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(k22 k22Var) {
        k22 k22Var2 = k22Var;
        int i = this.f29482b - k22Var2.f29482b;
        if (i != 0) {
            return i;
        }
        int i10 = this.f29483c - k22Var2.f29483c;
        return i10 == 0 ? this.f29484d - k22Var2.f29484d : i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k22.class == obj.getClass()) {
            k22 k22Var = (k22) obj;
            if (this.f29482b == k22Var.f29482b && this.f29483c == k22Var.f29483c && this.f29484d == k22Var.f29484d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f29482b * 31) + this.f29483c) * 31) + this.f29484d;
    }

    public final String toString() {
        return this.f29482b + "." + this.f29483c + "." + this.f29484d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f29482b);
        parcel.writeInt(this.f29483c);
        parcel.writeInt(this.f29484d);
    }

    public k22(Parcel parcel) {
        this.f29482b = parcel.readInt();
        this.f29483c = parcel.readInt();
        this.f29484d = parcel.readInt();
    }
}
