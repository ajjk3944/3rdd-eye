package com.yandex.mobile.ads.impl;

import N7.C1154e9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class gx1 implements Parcelable {
    public static final Parcelable.Creator<gx1> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final String f28027b;

    public static final class a implements Parcelable.Creator<gx1> {
        @Override // android.os.Parcelable.Creator
        public final gx1 createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.l.f(parcel, "parcel");
            return new gx1(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final gx1[] newArray(int i) {
            return new gx1[i];
        }
    }

    public gx1(String rewardUrl) {
        kotlin.jvm.internal.l.f(rewardUrl, "rewardUrl");
        this.f28027b = rewardUrl;
    }

    public final String c() {
        return this.f28027b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx1) && kotlin.jvm.internal.l.b(this.f28027b, ((gx1) obj).f28027b);
    }

    public final int hashCode() {
        return this.f28027b.hashCode();
    }

    public final String toString() {
        return C1154e9.i("ServerSideReward(rewardUrl=", this.f28027b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        kotlin.jvm.internal.l.f(out, "out");
        out.writeString(this.f28027b);
    }
}
