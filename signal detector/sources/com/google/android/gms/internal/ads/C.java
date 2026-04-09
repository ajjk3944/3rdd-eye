package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public long f7471a;

    /* renamed from: b, reason: collision with root package name */
    public long f7472b;

    /* renamed from: c, reason: collision with root package name */
    public long f7473c;

    /* renamed from: d, reason: collision with root package name */
    public long f7474d;

    /* renamed from: e, reason: collision with root package name */
    public long f7475e;

    /* renamed from: f, reason: collision with root package name */
    public long f7476f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f7477g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f7478h;

    public final void a() {
        this.f7474d = 0L;
        this.f7475e = 0L;
        this.f7476f = 0L;
        this.f7478h = 0;
        Arrays.fill(this.f7477g, false);
    }

    public final boolean b() {
        return this.f7474d > 15 && this.f7478h == 0;
    }

    public final void c(long j6) {
        long j7 = this.f7474d;
        if (j7 == 0) {
            this.f7471a = j6;
        } else if (j7 == 1) {
            long j8 = j6 - this.f7471a;
            this.f7472b = j8;
            this.f7476f = j8;
            this.f7475e = 1L;
        } else {
            long j9 = j6 - this.f7473c;
            long jAbs = Math.abs(j9 - this.f7472b);
            int i = (int) (j7 % 15);
            boolean[] zArr = this.f7477g;
            if (jAbs <= 1000000) {
                this.f7475e++;
                this.f7476f += j9;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f7478h--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f7478h++;
            }
        }
        this.f7474d++;
        this.f7473c = j6;
    }
}
