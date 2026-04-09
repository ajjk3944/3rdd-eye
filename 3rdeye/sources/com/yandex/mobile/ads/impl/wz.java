package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import com.yandex.mobile.ads.impl.xv0;

/* loaded from: classes3.dex */
public final class wz implements or0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f35115a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35116b;

    /* renamed from: c, reason: collision with root package name */
    private final float f35117c;

    /* renamed from: d, reason: collision with root package name */
    private long f35118d;

    /* renamed from: e, reason: collision with root package name */
    private long f35119e;

    /* renamed from: f, reason: collision with root package name */
    private long f35120f;

    /* renamed from: g, reason: collision with root package name */
    private long f35121g;

    /* renamed from: h, reason: collision with root package name */
    private long f35122h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private float f35123j;

    /* renamed from: k, reason: collision with root package name */
    private float f35124k;

    /* renamed from: l, reason: collision with root package name */
    private float f35125l;

    /* renamed from: m, reason: collision with root package name */
    private long f35126m;

    /* renamed from: n, reason: collision with root package name */
    private long f35127n;

    /* renamed from: o, reason: collision with root package name */
    private long f35128o;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f35129a = s82.a(20L);

        /* renamed from: b, reason: collision with root package name */
        private long f35130b = s82.a(500L);

        /* renamed from: c, reason: collision with root package name */
        private float f35131c = 0.999f;

        public final wz a() {
            return new wz(this.f35129a, this.f35130b, this.f35131c, 0);
        }
    }

    public /* synthetic */ wz(long j4, long j10, float f10, int i) {
        this(j4, j10, f10);
    }

    private void b() {
        long j4 = this.f35118d;
        if (j4 != -9223372036854775807L) {
            long j10 = this.f35119e;
            if (j10 != -9223372036854775807L) {
                j4 = j10;
            }
            long j11 = this.f35121g;
            if (j11 != -9223372036854775807L && j4 < j11) {
                j4 = j11;
            }
            long j12 = this.f35122h;
            if (j12 != -9223372036854775807L && j4 > j12) {
                j4 = j12;
            }
        } else {
            j4 = -9223372036854775807L;
        }
        if (this.f35120f == j4) {
            return;
        }
        this.f35120f = j4;
        this.i = j4;
        this.f35127n = -9223372036854775807L;
        this.f35128o = -9223372036854775807L;
        this.f35126m = -9223372036854775807L;
    }

    public final float a(long j4, long j10) {
        if (this.f35118d == -9223372036854775807L) {
            return 1.0f;
        }
        long j11 = j4 - j10;
        long j12 = this.f35127n;
        if (j12 == -9223372036854775807L) {
            this.f35127n = j11;
            this.f35128o = 0L;
        } else {
            float f10 = this.f35117c;
            long jMax = Math.max(j11, (long) (((1.0f - f10) * j11) + (j12 * f10)));
            this.f35127n = jMax;
            long jAbs = Math.abs(j11 - jMax);
            long j13 = this.f35128o;
            float f11 = this.f35117c;
            this.f35128o = (long) (((1.0f - f11) * jAbs) + (j13 * f11));
        }
        if (this.f35126m != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f35126m < 1000) {
            return this.f35125l;
        }
        this.f35126m = SystemClock.elapsedRealtime();
        long j14 = (this.f35128o * 3) + this.f35127n;
        if (this.i > j14) {
            float fA = s82.a(1000L);
            long[] jArr = {j14, this.f35120f, this.i - (((long) ((this.f35125l - 1.0f) * fA)) + ((long) ((this.f35123j - 1.0f) * fA)))};
            long j15 = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j16 = jArr[i];
                if (j16 > j15) {
                    j15 = j16;
                }
            }
            this.i = j15;
        } else {
            long jMax2 = j4 - ((long) (Math.max(0.0f, this.f35125l - 1.0f) / 1.0E-7f));
            long j17 = this.i;
            int i10 = s82.f32899a;
            long jMax3 = Math.max(j17, Math.min(jMax2, j14));
            this.i = jMax3;
            long j18 = this.f35122h;
            if (j18 != -9223372036854775807L && jMax3 > j18) {
                this.i = j18;
            }
        }
        long j19 = j4 - this.i;
        if (Math.abs(j19) < this.f35115a) {
            this.f35125l = 1.0f;
        } else {
            float f12 = this.f35124k;
            float f13 = this.f35123j;
            int i11 = s82.f32899a;
            this.f35125l = Math.max(f12, Math.min((j19 * 1.0E-7f) + 1.0f, f13));
        }
        return this.f35125l;
    }

    public final void c() {
        long j4 = this.i;
        if (j4 == -9223372036854775807L) {
            return;
        }
        long j10 = j4 + this.f35116b;
        this.i = j10;
        long j11 = this.f35122h;
        if (j11 != -9223372036854775807L && j10 > j11) {
            this.i = j11;
        }
        this.f35126m = -9223372036854775807L;
    }

    private wz(long j4, long j10, float f10) {
        this.f35115a = j4;
        this.f35116b = j10;
        this.f35117c = f10;
        this.f35118d = -9223372036854775807L;
        this.f35119e = -9223372036854775807L;
        this.f35121g = -9223372036854775807L;
        this.f35122h = -9223372036854775807L;
        this.f35124k = 0.97f;
        this.f35123j = 1.03f;
        this.f35125l = 1.0f;
        this.f35126m = -9223372036854775807L;
        this.f35120f = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.f35127n = -9223372036854775807L;
        this.f35128o = -9223372036854775807L;
    }

    public final long a() {
        return this.i;
    }

    public final void a(xv0.e eVar) {
        this.f35118d = s82.a(eVar.f35476b);
        this.f35121g = s82.a(eVar.f35477c);
        this.f35122h = s82.a(eVar.f35478d);
        float f10 = eVar.f35479e;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        this.f35124k = f10;
        float f11 = eVar.f35480f;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        this.f35123j = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f35118d = -9223372036854775807L;
        }
        b();
    }

    public final void a(long j4) {
        this.f35119e = j4;
        b();
    }
}
