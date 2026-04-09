package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1749qQ {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16374a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16375b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16376c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16377d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16378e;

    public C1749qQ(Object obj, int i, int i3, long j6, int i6) {
        this.f16374a = obj;
        this.f16375b = i;
        this.f16376c = i3;
        this.f16377d = j6;
        this.f16378e = i6;
    }

    public final C1749qQ a(Object obj) {
        return this.f16374a.equals(obj) ? this : new C1749qQ(obj, this.f16375b, this.f16376c, this.f16377d, this.f16378e);
    }

    public final boolean b() {
        return this.f16375b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1749qQ)) {
            return false;
        }
        C1749qQ c1749qQ = (C1749qQ) obj;
        return this.f16374a.equals(c1749qQ.f16374a) && this.f16375b == c1749qQ.f16375b && this.f16376c == c1749qQ.f16376c && this.f16377d == c1749qQ.f16377d && this.f16378e == c1749qQ.f16378e;
    }

    public final int hashCode() {
        return ((((((((this.f16374a.hashCode() + 527) * 31) + this.f16375b) * 31) + this.f16376c) * 31) + ((int) this.f16377d)) * 31) + this.f16378e;
    }

    public C1749qQ(long j6, Object obj) {
        this(obj, -1, -1, j6, -1);
    }

    public C1749qQ(Object obj, long j6, int i) {
        this(obj, -1, -1, j6, i);
    }
}
