package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class K6 extends AbstractC8026a {
    public static final Parcelable.Creator<K6> CREATOR = new J6();

    /* renamed from: a, reason: collision with root package name */
    public final String f35971a;

    /* renamed from: b, reason: collision with root package name */
    public final long f35972b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35973c;

    K6(String str, long j10, int i10) {
        this.f35971a = str;
        this.f35972b = j10;
        this.f35973c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.q(parcel, 1, this.f35971a, false);
        t3.b.n(parcel, 2, this.f35972b);
        t3.b.k(parcel, 3, this.f35973c);
        t3.b.b(parcel, iA);
    }
}
