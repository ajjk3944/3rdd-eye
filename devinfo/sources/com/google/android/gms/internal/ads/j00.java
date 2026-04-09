package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j00 {

    /* renamed from: e, reason: collision with root package name */
    public static final j00 f12557e = new j00(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f12558a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12559b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12560c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12561d;

    public j00(int i4, int i10, int i11) {
        this.f12558a = i4;
        this.f12559b = i10;
        this.f12560c = i11;
        this.f12561d = bq0.a(i11) ? bq0.d(i11) * i10 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j00)) {
            return false;
        }
        j00 j00Var = (j00) obj;
        return this.f12558a == j00Var.f12558a && this.f12559b == j00Var.f12559b && this.f12560c == j00Var.f12560c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f12558a), Integer.valueOf(this.f12559b), Integer.valueOf(this.f12560c));
    }

    public final String toString() {
        int i4 = this.f12558a;
        int length = String.valueOf(i4).length();
        int i10 = this.f12559b;
        int length2 = String.valueOf(i10).length();
        int i11 = this.f12560c;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i11).length() + 1);
        r5.c.q(i4, i10, "AudioFormat[sampleRate=", ", channelCount=", sb2);
        return je.u.v(sb2, ", encoding=", i11, "]");
    }
}
