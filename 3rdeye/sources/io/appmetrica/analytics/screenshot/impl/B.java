package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class B implements Parcelable {
    public static final A CREATOR = new A();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42492a;

    /* renamed from: b, reason: collision with root package name */
    public final D f42493b;

    public B(boolean z10, D d10) {
        this.f42492a = z10;
        this.f42493b = d10;
    }

    public final D a() {
        return this.f42493b;
    }

    public final boolean b() {
        return this.f42492a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableRemoteScreenshotConfig(enabled=" + this.f42492a + ", config=" + this.f42493b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f42492a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f42493b, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public B(g0 g0Var) {
        boolean zB = g0Var.b();
        h0 h0VarA = g0Var.a();
        this(zB, h0VarA != null ? new D(h0VarA) : null);
    }
}
