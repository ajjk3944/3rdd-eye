package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dw1 {

    /* renamed from: a, reason: collision with root package name */
    public final kh0 f10574a;

    /* renamed from: b, reason: collision with root package name */
    public final w5 f10575b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f10576c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioTrack f10577d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10578e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10579f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final uv1 f10580h;

    /* renamed from: i, reason: collision with root package name */
    public final float f10581i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public long f10582k;

    /* renamed from: l, reason: collision with root package name */
    public long f10583l;

    /* renamed from: m, reason: collision with root package name */
    public Method f10584m;

    /* renamed from: n, reason: collision with root package name */
    public long f10585n;

    /* renamed from: o, reason: collision with root package name */
    public long f10586o;

    /* renamed from: p, reason: collision with root package name */
    public long f10587p;

    /* renamed from: q, reason: collision with root package name */
    public long f10588q;

    /* renamed from: r, reason: collision with root package name */
    public long f10589r;

    /* renamed from: s, reason: collision with root package name */
    public int f10590s;

    /* renamed from: t, reason: collision with root package name */
    public int f10591t;

    /* renamed from: u, reason: collision with root package name */
    public long f10592u;

    /* renamed from: v, reason: collision with root package name */
    public long f10593v;

    /* renamed from: w, reason: collision with root package name */
    public long f10594w;

    /* renamed from: x, reason: collision with root package name */
    public long f10595x;

    /* renamed from: y, reason: collision with root package name */
    public long f10596y;

    /* renamed from: z, reason: collision with root package name */
    public long f10597z;

    public dw1(kh0 kh0Var, w5 w5Var, AudioTrack audioTrack, int i4, int i10, int i11) {
        this.f10574a = kh0Var;
        this.f10575b = w5Var;
        this.f10577d = audioTrack;
        try {
            this.f10584m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f10576c = new long[10];
        this.f10597z = -9223372036854775807L;
        this.f10596y = -9223372036854775807L;
        this.f10580h = new uv1(audioTrack, kh0Var);
        int sampleRate = audioTrack.getSampleRate();
        this.f10578e = sampleRate;
        boolean zA = bq0.a(i4);
        this.g = zA;
        this.f10579f = zA ? bq0.t(sampleRate, i11 / i10) : -9223372036854775807L;
        this.f10588q = 0L;
        this.f10589r = 0L;
        this.f10592u = -9223372036854775807L;
        this.f10593v = -9223372036854775807L;
        this.f10586o = 0L;
        this.f10585n = 0L;
        this.f10581i = 1.0f;
        this.j = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x031f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a() {
        /*
            Method dump skipped, instructions count: 992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dw1.a():long");
    }

    public final void b(long j) {
        long j8 = this.j;
        if (j8 == -9223372036854775807L || j < j8) {
            return;
        }
        long jRound = j - j8;
        String str = bq0.f9768a;
        float f10 = this.f10581i;
        if (f10 != 1.0f) {
            jRound = Math.round(jRound / f10);
        }
        long jR = bq0.r(jRound);
        this.f10575b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - jR;
        this.j = -9223372036854775807L;
        c2 c2Var = new c2(jCurrentTimeMillis);
        yf0 yf0Var = ((bw1) this.f10574a.f13160b).f9827h;
        yf0Var.c(-1, c2Var);
        yf0Var.d();
    }

    public final long c(long j) {
        int i4 = this.f10591t;
        int i10 = this.f10578e;
        long jMax = Math.max(0L, (i4 == 0 ? this.f10592u != -9223372036854775807L ? bq0.t(i10, e()) : bq0.t(i10, d()) : bq0.w(j + this.f10582k, this.f10581i)) - this.f10585n);
        return this.f10592u != -9223372036854775807L ? Math.min(bq0.t(i10, this.f10595x), jMax) : jMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long d() {
        /*
            r12 = this;
            long r0 = r12.f10592u
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            long r0 = r12.e()
            long r2 = r12.f10595x
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        L16:
            com.google.android.gms.internal.ads.w5 r0 = r12.f10575b
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r4 = r12.f10587p
            long r4 = r0 - r4
            r6 = 5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L72
            android.media.AudioTrack r4 = r12.f10577d
            r4.getClass()
            int r5 = r4.getPlayState()
            r6 = 1
            if (r5 != r6) goto L36
            goto L70
        L36:
            int r4 = r4.getPlaybackHeadPosition()
            long r6 = (long) r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            r8 = 29
            if (r4 > r8) goto L61
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L5f
            long r10 = r12.f10588q
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 <= 0) goto L5f
            r4 = 3
            if (r5 != r4) goto L5f
            long r4 = r12.f10593v
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L70
            r12.f10593v = r0
            goto L70
        L5f:
            r12.f10593v = r2
        L61:
            long r2 = r12.f10588q
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L6e
            long r2 = r12.f10589r
            r4 = 1
            long r2 = r2 + r4
            r12.f10589r = r2
        L6e:
            r12.f10588q = r6
        L70:
            r12.f10587p = r0
        L72:
            long r0 = r12.f10588q
            long r2 = r12.f10589r
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dw1.d():long");
    }

    public final long e() {
        if (this.f10577d.getPlayState() == 2) {
            return this.f10594w;
        }
        this.f10575b.getClass();
        return this.f10594w + bq0.u(bq0.w(bq0.s(SystemClock.elapsedRealtime()) - this.f10592u, this.f10581i), this.f10578e, 1000000L, RoundingMode.UP);
    }
}
