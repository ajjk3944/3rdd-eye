package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import t3.AbstractC8026a;

/* renamed from: com.google.android.gms.internal.measurement.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4326d1 extends AbstractC8026a {
    public static final Parcelable.Creator<C4326d1> CREATOR = new C4362h1();

    /* renamed from: a, reason: collision with root package name */
    public final long f35193a;

    /* renamed from: b, reason: collision with root package name */
    public final long f35194b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f35195c;

    /* renamed from: d, reason: collision with root package name */
    public final String f35196d;

    /* renamed from: e, reason: collision with root package name */
    public final String f35197e;

    /* renamed from: f, reason: collision with root package name */
    public final String f35198f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f35199g;

    /* renamed from: h, reason: collision with root package name */
    public final String f35200h;

    public C4326d1(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f35193a = j10;
        this.f35194b = j11;
        this.f35195c = z10;
        this.f35196d = str;
        this.f35197e = str2;
        this.f35198f = str3;
        this.f35199g = bundle;
        this.f35200h = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.n(parcel, 1, this.f35193a);
        t3.b.n(parcel, 2, this.f35194b);
        t3.b.c(parcel, 3, this.f35195c);
        t3.b.q(parcel, 4, this.f35196d, false);
        t3.b.q(parcel, 5, this.f35197e, false);
        t3.b.q(parcel, 6, this.f35198f, false);
        t3.b.e(parcel, 7, this.f35199g, false);
        t3.b.q(parcel, 8, this.f35200h, false);
        t3.b.b(parcel, iA);
    }
}
