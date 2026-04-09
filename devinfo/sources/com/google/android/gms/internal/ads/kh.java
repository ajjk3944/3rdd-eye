package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kh {

    /* renamed from: a, reason: collision with root package name */
    public final long f13156a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13157b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13158c;

    public kh(int i4, long j, String str) {
        this.f13156a = j;
        this.f13157b = str;
        this.f13158c = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kh)) {
            return false;
        }
        kh khVar = (kh) obj;
        return khVar.f13156a == this.f13156a && khVar.f13158c == this.f13158c;
    }

    public final int hashCode() {
        return (int) this.f13156a;
    }
}
