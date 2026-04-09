package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes3.dex */
public final class xz implements pr0 {

    /* renamed from: a, reason: collision with root package name */
    private final yy f35541a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35542b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35543c;

    /* renamed from: d, reason: collision with root package name */
    private final long f35544d;

    /* renamed from: e, reason: collision with root package name */
    private final long f35545e;

    /* renamed from: f, reason: collision with root package name */
    private final int f35546f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f35547g;

    /* renamed from: h, reason: collision with root package name */
    private final long f35548h;
    private final boolean i;

    /* renamed from: j, reason: collision with root package name */
    private int f35549j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f35550k;

    public xz() {
        this(new yy());
    }

    private static void a(int i, int i10, String str, String str2) {
        zf.a(str + " cannot be less than " + str2, i >= i10);
    }

    @Override // com.yandex.mobile.ads.impl.pr0
    public final void b() {
        int i = this.f35546f;
        if (i == -1) {
            i = 13107200;
        }
        this.f35549j = i;
        this.f35550k = false;
        this.f35541a.d();
    }

    @Override // com.yandex.mobile.ads.impl.pr0
    public final yy c() {
        return this.f35541a;
    }

    @Override // com.yandex.mobile.ads.impl.pr0
    public final void d() {
        int i = this.f35546f;
        if (i == -1) {
            i = 13107200;
        }
        this.f35549j = i;
        this.f35550k = false;
        this.f35541a.d();
    }

    @Override // com.yandex.mobile.ads.impl.pr0
    public final long e() {
        return this.f35548h;
    }

    @Override // com.yandex.mobile.ads.impl.pr0
    public final void f() {
        int i = this.f35546f;
        if (i == -1) {
            i = 13107200;
        }
        this.f35549j = i;
        this.f35550k = false;
    }

    public xz(yy yyVar) {
        a(2500, 0, "bufferForPlaybackMs", CommonUrlParts.Values.FALSE_INTEGER);
        a(5000, 0, "bufferForPlaybackAfterRebufferMs", CommonUrlParts.Values.FALSE_INTEGER);
        a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        a(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", CommonUrlParts.Values.FALSE_INTEGER);
        this.f35541a = yyVar;
        long j4 = 50000;
        this.f35542b = s82.a(j4);
        this.f35543c = s82.a(j4);
        this.f35544d = s82.a(2500);
        this.f35545e = s82.a(5000);
        this.f35546f = -1;
        this.f35549j = 13107200;
        this.f35547g = false;
        this.f35548h = s82.a(0);
        this.i = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.mobile.ads.impl.pr0
    public final void a(so1[] so1VarArr, c70[] c70VarArr) {
        int iMax = this.f35546f;
        if (iMax == -1) {
            int i = 0;
            int i10 = 0;
            while (true) {
                int i11 = 13107200;
                if (i < so1VarArr.length) {
                    if (c70VarArr[i] != null) {
                        switch (so1VarArr[i].m()) {
                            case -2:
                                i11 = 0;
                                i10 += i11;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i11 = 144310272;
                                i10 += i11;
                                break;
                            case 1:
                                i10 += i11;
                                break;
                            case 2:
                                i11 = 131072000;
                                i10 += i11;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i11 = 131072;
                                i10 += i11;
                                break;
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i10);
                }
            }
        }
        this.f35549j = iMax;
        this.f35541a.a(iMax);
    }

    @Override // com.yandex.mobile.ads.impl.pr0
    public final boolean a() {
        return this.i;
    }

    @Override // com.yandex.mobile.ads.impl.pr0
    public final boolean a(long j4, float f10) {
        boolean z10 = true;
        boolean z11 = this.f35541a.c() >= this.f35549j;
        long jMin = this.f35542b;
        if (f10 > 1.0f) {
            int i = s82.f32899a;
            if (f10 != 1.0f) {
                jMin = Math.round(jMin * f10);
            }
            jMin = Math.min(jMin, this.f35543c);
        }
        if (j4 < Math.max(jMin, 500000L)) {
            if (!this.f35547g && z11) {
                z10 = false;
            }
            this.f35550k = z10;
            if (!z10 && j4 < 500000) {
                rs0.d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j4 >= this.f35543c || z11) {
            this.f35550k = false;
        }
        return this.f35550k;
    }

    @Override // com.yandex.mobile.ads.impl.pr0
    public final boolean a(long j4, float f10, boolean z10, long j10) {
        int i = s82.f32899a;
        if (f10 != 1.0f) {
            j4 = Math.round(j4 / f10);
        }
        long jMin = z10 ? this.f35545e : this.f35544d;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        if (jMin <= 0 || j4 >= jMin) {
            return true;
        }
        return !this.f35547g && this.f35541a.c() >= this.f35549j;
    }
}
