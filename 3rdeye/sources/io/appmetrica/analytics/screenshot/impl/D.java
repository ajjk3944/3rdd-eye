package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class D implements Parcelable {
    public static final C CREATOR = new C();

    /* renamed from: a, reason: collision with root package name */
    public final C5157x f42494a;

    /* renamed from: b, reason: collision with root package name */
    public final F f42495b;

    /* renamed from: c, reason: collision with root package name */
    public final C5159z f42496c;

    public D(C5157x c5157x, F f10, C5159z c5159z) {
        this.f42494a = c5157x;
        this.f42495b = f10;
        this.f42496c = c5159z;
    }

    public final C5157x a() {
        return this.f42494a;
    }

    public final C5159z b() {
        return this.f42496c;
    }

    public final F c() {
        return this.f42495b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableScreenshotConfig(apiCaptorConfig=" + this.f42494a + ", serviceCaptorConfig=" + this.f42495b + ", contentObserverCaptorConfig=" + this.f42496c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f42494a, i);
        parcel.writeParcelable(this.f42495b, i);
        parcel.writeParcelable(this.f42496c, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public D(h0 h0Var) {
        e0 e0VarA = h0Var.a();
        C5157x c5157x = e0VarA != null ? new C5157x(e0VarA) : null;
        i0 i0VarC = h0Var.c();
        F f10 = i0VarC != null ? new F(i0VarC) : null;
        f0 f0VarB = h0Var.b();
        this(c5157x, f10, f0VarB != null ? new C5159z(f0VarB) : null);
    }
}
