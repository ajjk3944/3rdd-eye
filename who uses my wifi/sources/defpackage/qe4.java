package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qe4 {
    public long A;
    public pz B;
    public final rc3 a;
    public final long[] b;
    public AudioTrack c;
    public pe4 d;
    public int e;
    public long f;
    public float g;
    public boolean h;
    public long i;
    public long j;
    public long k;
    public Method l;
    public long m;
    public boolean n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public boolean y;
    public long z;

    public qe4(rc3 rc3Var) {
        this.a = rc3Var;
        try {
            this.l = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = pz.o;
    }

    public final void a(AudioTrack audioTrack, int i, int i2, int i3, boolean z) {
        long jS;
        this.c = audioTrack;
        this.d = new pe4(audioTrack, this.a);
        this.e = audioTrack.getSampleRate();
        boolean zA = v23.a(i);
        this.n = zA;
        if (zA) {
            jS = v23.s(this.e, i3 / i2);
        } else {
            jS = -9223372036854775807L;
        }
        this.f = jS;
        this.q = 0L;
        this.r = 0L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.o = 0L;
        this.m = 0L;
        this.g = 1.0f;
        this.i = -9223372036854775807L;
        this.y = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x035c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b() {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe4.b():long");
    }

    public final void c(long j) {
        if (this.y) {
            long j2 = this.i;
            if (j2 == -9223372036854775807L || j < j2) {
                return;
            }
            long jW = v23.w(j - j2, this.g);
            this.B.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - v23.q(jW);
            this.i = -9223372036854775807L;
            bi3 bi3Var = ((df4) this.a.g).n;
            if (bi3Var != null) {
                wt2 wt2Var = ((ef4) bi3Var.g).A0;
                Handler handler = (Handler) wt2Var.g;
                if (handler != null) {
                    handler.post(new ee4(wt2Var, jCurrentTimeMillis));
                }
            }
        }
    }

    public final long d(long j) {
        long jV;
        if (this.t != 0) {
            jV = v23.v(j + this.j, this.g);
        } else if (this.u != -9223372036854775807L) {
            jV = v23.s(this.e, f());
        } else {
            jV = v23.s(this.e, e());
        }
        long jMax = Math.max(0L, jV - this.m);
        if (this.u == -9223372036854775807L) {
            return jMax;
        }
        return Math.min(v23.s(this.e, this.x), jMax);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e() {
        /*
            r12 = this;
            long r0 = r12.u
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            long r0 = r12.f()
            long r2 = r12.x
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        L16:
            pz r0 = r12.B
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r4 = r12.p
            long r4 = r0 - r4
            r6 = 5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L72
            android.media.AudioTrack r4 = r12.c
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
            long r10 = r12.q
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 <= 0) goto L5f
            r4 = 3
            if (r5 != r4) goto L5f
            long r4 = r12.v
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L70
            r12.v = r0
            goto L70
        L5f:
            r12.v = r2
        L61:
            long r2 = r12.q
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L6e
            long r2 = r12.r
            r4 = 1
            long r2 = r2 + r4
            r12.r = r2
        L6e:
            r12.q = r6
        L70:
            r12.p = r0
        L72:
            long r0 = r12.q
            long r2 = r12.r
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe4.e():long");
    }

    public final long f() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.w;
        }
        this.B.getClass();
        return this.w + v23.t(v23.v(v23.r(SystemClock.elapsedRealtime()) - this.u, this.g), this.e, 1000000L, RoundingMode.UP);
    }
}
