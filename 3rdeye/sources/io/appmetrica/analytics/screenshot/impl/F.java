package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class F implements Parcelable {
    public static final E CREATOR = new E();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42497a;

    /* renamed from: b, reason: collision with root package name */
    public final long f42498b;

    public F(boolean z10, long j4) {
        this.f42497a = z10;
        this.f42498b = j4;
    }

    public final long a() {
        return this.f42498b;
    }

    public final boolean b() {
        return this.f42497a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParcelableServiceCaptorConfig(enabled=");
        sb.append(this.f42497a);
        sb.append(", delaySeconds=");
        return androidx.work.s.f(sb, this.f42498b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f42497a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f42498b);
    }

    public F(i0 i0Var) {
        this(i0Var.b(), i0Var.a());
    }
}
