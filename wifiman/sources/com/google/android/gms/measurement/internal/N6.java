package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class N6 extends AbstractC8026a {
    public static final Parcelable.Creator<N6> CREATOR = new R6();

    /* renamed from: a, reason: collision with root package name */
    public final long f36138a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f36139b;

    /* renamed from: c, reason: collision with root package name */
    public final String f36140c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f36141d;

    /* renamed from: e, reason: collision with root package name */
    private final int f36142e;

    /* renamed from: f, reason: collision with root package name */
    public final long f36143f;

    /* renamed from: g, reason: collision with root package name */
    public String f36144g;

    N6(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11) {
        this(j10, bArr, str, bundle, i10, j11, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.n(parcel, 1, this.f36138a);
        t3.b.f(parcel, 2, this.f36139b, false);
        t3.b.q(parcel, 3, this.f36140c, false);
        t3.b.e(parcel, 4, this.f36141d, false);
        t3.b.k(parcel, 5, this.f36142e);
        t3.b.n(parcel, 6, this.f36143f);
        t3.b.q(parcel, 7, this.f36144g, false);
        t3.b.b(parcel, iA);
    }

    N6(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11, String str2) {
        this.f36138a = j10;
        this.f36139b = bArr;
        this.f36140c = str;
        this.f36141d = bundle;
        this.f36142e = i10;
        this.f36143f = j11;
        this.f36144g = str2;
    }
}
