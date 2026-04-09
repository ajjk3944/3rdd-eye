package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import s3.AbstractC7901p;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class L extends AbstractC8026a {
    public static final Parcelable.Creator<L> CREATOR = new O();

    /* renamed from: a, reason: collision with root package name */
    public final String f35974a;

    /* renamed from: b, reason: collision with root package name */
    public final K f35975b;

    /* renamed from: c, reason: collision with root package name */
    public final String f35976c;

    /* renamed from: d, reason: collision with root package name */
    public final long f35977d;

    L(L l10, long j10) {
        AbstractC7901p.l(l10);
        this.f35974a = l10.f35974a;
        this.f35975b = l10.f35975b;
        this.f35976c = l10.f35976c;
        this.f35977d = j10;
    }

    public final String toString() {
        return "origin=" + this.f35976c + ",name=" + this.f35974a + ",params=" + String.valueOf(this.f35975b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.q(parcel, 2, this.f35974a, false);
        t3.b.p(parcel, 3, this.f35975b, i10, false);
        t3.b.q(parcel, 4, this.f35976c, false);
        t3.b.n(parcel, 5, this.f35977d);
        t3.b.b(parcel, iA);
    }

    public L(String str, K k10, String str2, long j10) {
        this.f35974a = str;
        this.f35975b = k10;
        this.f35976c = str2;
        this.f35977d = j10;
    }
}
