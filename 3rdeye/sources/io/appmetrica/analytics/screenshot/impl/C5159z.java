package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5159z implements Parcelable {
    public static final C5158y CREATOR = new C5158y();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42590a;

    /* renamed from: b, reason: collision with root package name */
    public final List f42591b;

    /* renamed from: c, reason: collision with root package name */
    public final long f42592c;

    public C5159z(boolean z10, List list, long j4) {
        this.f42590a = z10;
        this.f42591b = list;
        this.f42592c = j4;
    }

    public final long a() {
        return this.f42592c;
    }

    public final boolean b() {
        return this.f42590a;
    }

    public final List c() {
        return this.f42591b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParcelableContentObserverCaptorConfig(enabled=");
        sb.append(this.f42590a);
        sb.append(", mediaStoreColumnNames=");
        sb.append(this.f42591b);
        sb.append(", detectWindowSeconds=");
        return androidx.work.s.f(sb, this.f42592c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f42590a ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.f42591b);
        parcel.writeLong(this.f42592c);
    }

    public C5159z(f0 f0Var) {
        this(f0Var.b(), f0Var.c(), f0Var.a());
    }
}
