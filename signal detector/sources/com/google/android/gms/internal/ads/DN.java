package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class DN {

    /* renamed from: a, reason: collision with root package name */
    public final long f7755a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7756b;

    /* renamed from: c, reason: collision with root package name */
    public long f7757c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public long f7758d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public long f7760f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f7761g = -9223372036854775807L;
    public float i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public long f7763j = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public long f7759e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f7762h = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public long f7764k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public long f7765l = -9223372036854775807L;

    public /* synthetic */ DN(long j6, long j7) {
        this.f7755a = j6;
        this.f7756b = j7;
    }

    public final void a() {
        long j6 = this.f7762h;
        if (j6 == -9223372036854775807L) {
            return;
        }
        long j7 = j6 + this.f7756b;
        this.f7762h = j7;
        long j8 = this.f7761g;
        if (j8 != -9223372036854775807L && j7 > j8) {
            this.f7762h = j8;
        }
        this.f7763j = -9223372036854775807L;
    }

    public final long b() {
        return this.f7762h;
    }

    public final void c() {
        long j6;
        long j7 = this.f7757c;
        if (j7 != -9223372036854775807L) {
            j6 = this.f7758d;
            if (j6 == -9223372036854775807L) {
                long j8 = this.f7760f;
                if (j8 != -9223372036854775807L && j7 < j8) {
                    j7 = j8;
                }
                j6 = this.f7761g;
                if (j6 == -9223372036854775807L || j7 <= j6) {
                    j6 = j7;
                }
            }
        } else {
            j6 = -9223372036854775807L;
        }
        if (this.f7759e == j6) {
            return;
        }
        this.f7759e = j6;
        this.f7762h = j6;
        this.f7764k = -9223372036854775807L;
        this.f7765l = -9223372036854775807L;
        this.f7763j = -9223372036854775807L;
    }
}
