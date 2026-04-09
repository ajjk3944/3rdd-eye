package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.lP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1478lP {

    /* renamed from: a, reason: collision with root package name */
    public final C2255zu f15386a;

    /* renamed from: b, reason: collision with root package name */
    public final C1994v2 f15387b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f15388c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioTrack f15389d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15390e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15391f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15392g;

    /* renamed from: h, reason: collision with root package name */
    public final C1100eP f15393h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public long f15394j;

    /* renamed from: k, reason: collision with root package name */
    public long f15395k;

    /* renamed from: l, reason: collision with root package name */
    public long f15396l;

    /* renamed from: m, reason: collision with root package name */
    public Method f15397m;

    /* renamed from: n, reason: collision with root package name */
    public long f15398n;

    /* renamed from: o, reason: collision with root package name */
    public long f15399o;

    /* renamed from: p, reason: collision with root package name */
    public long f15400p;

    /* renamed from: q, reason: collision with root package name */
    public long f15401q;

    /* renamed from: r, reason: collision with root package name */
    public long f15402r;

    /* renamed from: s, reason: collision with root package name */
    public int f15403s;

    /* renamed from: t, reason: collision with root package name */
    public int f15404t;

    /* renamed from: u, reason: collision with root package name */
    public long f15405u;

    /* renamed from: v, reason: collision with root package name */
    public long f15406v;

    /* renamed from: w, reason: collision with root package name */
    public long f15407w;

    /* renamed from: x, reason: collision with root package name */
    public long f15408x;

    /* renamed from: y, reason: collision with root package name */
    public long f15409y;

    /* renamed from: z, reason: collision with root package name */
    public long f15410z;

    public C1478lP(C2255zu c2255zu, C1994v2 c1994v2, AudioTrack audioTrack, int i, int i3, int i6) {
        this.f15386a = c2255zu;
        this.f15387b = c1994v2;
        this.f15389d = audioTrack;
        try {
            this.f15397m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f15388c = new long[10];
        this.f15410z = -9223372036854775807L;
        this.f15409y = -9223372036854775807L;
        this.f15393h = new C1100eP(audioTrack, c2255zu);
        int sampleRate = audioTrack.getSampleRate();
        this.f15390e = sampleRate;
        boolean zA = Vt.a(i);
        this.f15392g = zA;
        this.f15391f = zA ? Vt.t(sampleRate, i6 / i3) : -9223372036854775807L;
        this.f15401q = 0L;
        this.f15402r = 0L;
        this.f15405u = -9223372036854775807L;
        this.f15406v = -9223372036854775807L;
        this.f15399o = 0L;
        this.f15398n = 0L;
        this.i = 1.0f;
        this.f15394j = -9223372036854775807L;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1478lP.a():long");
    }

    public final void b(long j6) {
        long j7 = this.f15394j;
        if (j7 == -9223372036854775807L || j6 < j7) {
            return;
        }
        long jRound = j6 - j7;
        String str = Vt.f12096a;
        float f2 = this.i;
        if (f2 != 1.0f) {
            jRound = Math.round(jRound / f2);
        }
        long jR = Vt.r(jRound);
        this.f15387b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - jR;
        this.f15394j = -9223372036854775807L;
        A0 a02 = new A0();
        a02.f6910a = jCurrentTimeMillis;
        C1009cp c1009cp = ((C1424kP) this.f15386a.f17990b).f15156h;
        c1009cp.c(-1, a02);
        c1009cp.d();
    }

    public final long c(long j6) {
        int i = this.f15404t;
        int i3 = this.f15390e;
        long jMax = Math.max(0L, (i == 0 ? this.f15405u != -9223372036854775807L ? Vt.t(i3, e()) : Vt.t(i3, d()) : Vt.w(j6 + this.f15395k, this.i)) - this.f15398n);
        return this.f15405u != -9223372036854775807L ? Math.min(Vt.t(i3, this.f15408x), jMax) : jMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long d() {
        /*
            r12 = this;
            long r0 = r12.f15405u
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            long r0 = r12.e()
            long r2 = r12.f15408x
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        L16:
            com.google.android.gms.internal.ads.v2 r0 = r12.f15387b
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r4 = r12.f15400p
            long r4 = r0 - r4
            r6 = 5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L72
            android.media.AudioTrack r4 = r12.f15389d
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
            long r10 = r12.f15401q
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 <= 0) goto L5f
            r4 = 3
            if (r5 != r4) goto L5f
            long r4 = r12.f15406v
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L70
            r12.f15406v = r0
            goto L70
        L5f:
            r12.f15406v = r2
        L61:
            long r2 = r12.f15401q
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L6e
            long r2 = r12.f15402r
            r4 = 1
            long r2 = r2 + r4
            r12.f15402r = r2
        L6e:
            r12.f15401q = r6
        L70:
            r12.f15400p = r0
        L72:
            long r0 = r12.f15401q
            long r2 = r12.f15402r
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1478lP.d():long");
    }

    public final long e() {
        if (this.f15389d.getPlayState() == 2) {
            return this.f15407w;
        }
        this.f15387b.getClass();
        return this.f15407w + Vt.u(Vt.w(Vt.s(SystemClock.elapsedRealtime()) - this.f15405u, this.i), this.f15390e, 1000000L, RoundingMode.UP);
    }
}
