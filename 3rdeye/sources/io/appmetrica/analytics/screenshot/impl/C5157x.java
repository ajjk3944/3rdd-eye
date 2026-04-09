package io.appmetrica.analytics.screenshot.impl;

import N7.C1154e9;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5157x implements Parcelable {
    public static final C5156w CREATOR = new C5156w();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42589a;

    public C5157x(boolean z10) {
        this.f42589a = z10;
    }

    public final boolean a() {
        return this.f42589a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return C1154e9.k(new StringBuilder("ParcelableApiCaptorConfig(enabled="), this.f42589a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f42589a ? (byte) 1 : (byte) 0);
    }

    public C5157x(e0 e0Var) {
        this(e0Var.a());
    }
}
