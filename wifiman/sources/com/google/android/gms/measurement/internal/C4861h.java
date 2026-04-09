package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import t3.AbstractC8026a;

/* renamed from: com.google.android.gms.measurement.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4861h extends AbstractC8026a {
    public static final Parcelable.Creator<C4861h> CREATOR = new C4852g();

    /* renamed from: a, reason: collision with root package name */
    public final long f36469a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36470b;

    /* renamed from: c, reason: collision with root package name */
    public final long f36471c;

    C4861h(long j10, int i10, long j11) {
        this.f36469a = j10;
        this.f36470b = i10;
        this.f36471c = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.n(parcel, 1, this.f36469a);
        t3.b.k(parcel, 2, this.f36470b);
        t3.b.n(parcel, 3, this.f36471c);
        t3.b.b(parcel, iA);
    }
}
