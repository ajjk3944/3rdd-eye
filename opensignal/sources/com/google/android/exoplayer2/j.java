package com.google.android.exoplayer2;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4171a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4172b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4173c;

    /* renamed from: d, reason: collision with root package name */
    public long f4174d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public long f4175e = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f4177g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f4178h = -9223372036854775807L;
    public float k = 0.97f;
    public float j = 1.03f;

    /* renamed from: l, reason: collision with root package name */
    public float f4180l = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    public long f4181m = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public long f4176f = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f4179i = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public long f4182n = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public long f4183o = -9223372036854775807L;

    public /* synthetic */ j(int i10, long j, long j7) {
        this.f4171a = i10;
        this.f4172b = j;
        this.f4173c = j7;
    }

    public final void a() {
        switch (this.f4171a) {
            case 0:
                long j = this.f4174d;
                if (j != -9223372036854775807L) {
                    long j7 = this.f4175e;
                    if (j7 != -9223372036854775807L) {
                        j = j7;
                    }
                    long j10 = this.f4177g;
                    if (j10 != -9223372036854775807L && j < j10) {
                        j = j10;
                    }
                    long j11 = this.f4178h;
                    if (j11 != -9223372036854775807L && j > j11) {
                        j = j11;
                    }
                } else {
                    j = -9223372036854775807L;
                }
                if (this.f4176f != j) {
                    this.f4176f = j;
                    this.f4179i = j;
                    this.f4182n = -9223372036854775807L;
                    this.f4183o = -9223372036854775807L;
                    this.f4181m = -9223372036854775807L;
                    break;
                }
                break;
            default:
                long j12 = this.f4174d;
                if (j12 != -9223372036854775807L) {
                    long j13 = this.f4175e;
                    if (j13 != -9223372036854775807L) {
                        j12 = j13;
                    }
                    long j14 = this.f4177g;
                    if (j14 != -9223372036854775807L && j12 < j14) {
                        j12 = j14;
                    }
                    long j15 = this.f4178h;
                    if (j15 != -9223372036854775807L && j12 > j15) {
                        j12 = j15;
                    }
                } else {
                    j12 = -9223372036854775807L;
                }
                if (this.f4176f != j12) {
                    this.f4176f = j12;
                    this.f4179i = j12;
                    this.f4182n = -9223372036854775807L;
                    this.f4183o = -9223372036854775807L;
                    this.f4181m = -9223372036854775807L;
                    break;
                }
                break;
        }
    }
}
