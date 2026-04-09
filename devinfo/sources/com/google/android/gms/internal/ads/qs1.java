package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qs1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f15428a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15429b;

    /* renamed from: c, reason: collision with root package name */
    public long f15430c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public long f15431d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public long f15433f = -9223372036854775807L;
    public long g = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public float f15435i = 1.0f;
    public long j = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public long f15432e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f15434h = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public long f15436k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public long f15437l = -9223372036854775807L;

    public /* synthetic */ qs1(long j, long j8) {
        this.f15428a = j;
        this.f15429b = j8;
    }

    public final void a() {
        long j = this.f15434h;
        if (j == -9223372036854775807L) {
            return;
        }
        long j8 = j + this.f15429b;
        this.f15434h = j8;
        long j9 = this.g;
        if (j9 != -9223372036854775807L && j8 > j9) {
            this.f15434h = j9;
        }
        this.j = -9223372036854775807L;
    }

    public final long b() {
        return this.f15434h;
    }

    public final void c() {
        long j;
        long j8 = this.f15430c;
        if (j8 != -9223372036854775807L) {
            j = this.f15431d;
            if (j == -9223372036854775807L) {
                long j9 = this.f15433f;
                if (j9 != -9223372036854775807L && j8 < j9) {
                    j8 = j9;
                }
                j = this.g;
                if (j == -9223372036854775807L || j8 <= j) {
                    j = j8;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f15432e == j) {
            return;
        }
        this.f15432e = j;
        this.f15434h = j;
        this.f15436k = -9223372036854775807L;
        this.f15437l = -9223372036854775807L;
        this.j = -9223372036854775807L;
    }
}
