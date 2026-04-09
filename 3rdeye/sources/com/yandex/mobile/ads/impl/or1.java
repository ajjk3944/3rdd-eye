package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class or1 implements Parcelable {
    public static final Parcelable.Creator<or1> CREATOR = new b();

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31488b;

    /* renamed from: c, reason: collision with root package name */
    private final bp f31489c;

    /* renamed from: d, reason: collision with root package name */
    private final gx1 f31490d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f31491a;

        /* renamed from: b, reason: collision with root package name */
        private bp f31492b;

        /* renamed from: c, reason: collision with root package name */
        private gx1 f31493c;

        public final a a(bp bpVar) {
            this.f31492b = bpVar;
            return this;
        }

        public final a a(gx1 gx1Var) {
            this.f31493c = gx1Var;
            return this;
        }

        public final a a(boolean z10) {
            this.f31491a = z10;
            return this;
        }

        public final or1 a() {
            return new or1(this.f31491a, this.f31492b, this.f31493c);
        }
    }

    public static final class b implements Parcelable.Creator<or1> {
        @Override // android.os.Parcelable.Creator
        public final or1 createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.l.f(parcel, "parcel");
            return new or1(parcel.readInt() != 0, parcel.readInt() == 0 ? null : bp.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? gx1.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final or1[] newArray(int i) {
            return new or1[i];
        }
    }

    public or1(boolean z10, bp bpVar, gx1 gx1Var) {
        this.f31488b = z10;
        this.f31489c = bpVar;
        this.f31490d = gx1Var;
    }

    public final bp c() {
        return this.f31489c;
    }

    public final gx1 d() {
        return this.f31490d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f31488b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or1)) {
            return false;
        }
        or1 or1Var = (or1) obj;
        return this.f31488b == or1Var.f31488b && kotlin.jvm.internal.l.b(this.f31489c, or1Var.f31489c) && kotlin.jvm.internal.l.b(this.f31490d, or1Var.f31490d);
    }

    public final int hashCode() {
        int i = (this.f31488b ? 1231 : 1237) * 31;
        bp bpVar = this.f31489c;
        int iHashCode = (i + (bpVar == null ? 0 : bpVar.hashCode())) * 31;
        gx1 gx1Var = this.f31490d;
        return iHashCode + (gx1Var != null ? gx1Var.hashCode() : 0);
    }

    public final String toString() {
        return "RewardData(serverSideRewardType=" + this.f31488b + ", clientSideReward=" + this.f31489c + ", serverSideReward=" + this.f31490d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        kotlin.jvm.internal.l.f(out, "out");
        out.writeInt(this.f31488b ? 1 : 0);
        bp bpVar = this.f31489c;
        if (bpVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bpVar.writeToParcel(out, i);
        }
        gx1 gx1Var = this.f31490d;
        if (gx1Var == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gx1Var.writeToParcel(out, i);
        }
    }
}
