package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public long f9514a;

    /* renamed from: b, reason: collision with root package name */
    public long f9515b;

    /* renamed from: c, reason: collision with root package name */
    public long f9516c;

    /* renamed from: d, reason: collision with root package name */
    public long f9517d;

    /* renamed from: e, reason: collision with root package name */
    public long f9518e;

    /* renamed from: f, reason: collision with root package name */
    public long f9519f;
    public final boolean[] g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f9520h;

    public final void a() {
        this.f9517d = 0L;
        this.f9518e = 0L;
        this.f9519f = 0L;
        this.f9520h = 0;
        Arrays.fill(this.g, false);
    }

    public final boolean b() {
        return this.f9517d > 15 && this.f9520h == 0;
    }

    public final void c(long j) {
        long j8 = this.f9517d;
        if (j8 == 0) {
            this.f9514a = j;
        } else if (j8 == 1) {
            long j9 = j - this.f9514a;
            this.f9515b = j9;
            this.f9519f = j9;
            this.f9518e = 1L;
        } else {
            long j10 = j - this.f9516c;
            long jAbs = Math.abs(j10 - this.f9515b);
            int i4 = (int) (j8 % 15);
            boolean[] zArr = this.g;
            if (jAbs <= 1000000) {
                this.f9518e++;
                this.f9519f += j10;
                if (zArr[i4]) {
                    zArr[i4] = false;
                    this.f9520h--;
                }
            } else if (!zArr[i4]) {
                zArr[i4] = true;
                this.f9520h++;
            }
        }
        this.f9517d++;
        this.f9516c = j;
    }
}
