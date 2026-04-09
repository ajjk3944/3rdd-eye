package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class bp implements Parcelable {
    public static final Parcelable.Creator<bp> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final int f25358b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25359c;

    public static final class a implements Parcelable.Creator<bp> {
        @Override // android.os.Parcelable.Creator
        public final bp createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.l.f(parcel, "parcel");
            return new bp(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final bp[] newArray(int i) {
            return new bp[i];
        }
    }

    public bp(int i, String rewardType) {
        kotlin.jvm.internal.l.f(rewardType, "rewardType");
        this.f25358b = i;
        this.f25359c = rewardType;
    }

    public final int c() {
        return this.f25358b;
    }

    public final String d() {
        return this.f25359c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp)) {
            return false;
        }
        bp bpVar = (bp) obj;
        return this.f25358b == bpVar.f25358b && kotlin.jvm.internal.l.b(this.f25359c, bpVar.f25359c);
    }

    public final int hashCode() {
        return this.f25359c.hashCode() + (this.f25358b * 31);
    }

    public final String toString() {
        return "ClientSideReward(rewardAmount=" + this.f25358b + ", rewardType=" + this.f25359c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        kotlin.jvm.internal.l.f(out, "out");
        out.writeInt(this.f25358b);
        out.writeString(this.f25359c);
    }
}
