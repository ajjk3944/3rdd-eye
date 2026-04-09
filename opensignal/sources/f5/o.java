package f5;

import android.media.AudioTrack;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class o {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;

    /* renamed from: a, reason: collision with root package name */
    public final b9.c f8549a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f8550b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f8551c;

    /* renamed from: d, reason: collision with root package name */
    public int f8552d;

    /* renamed from: e, reason: collision with root package name */
    public int f8553e;

    /* renamed from: f, reason: collision with root package name */
    public n f8554f;

    /* renamed from: g, reason: collision with root package name */
    public int f8555g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8556h;

    /* renamed from: i, reason: collision with root package name */
    public long f8557i;
    public float j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public long f8558l;

    /* renamed from: m, reason: collision with root package name */
    public long f8559m;

    /* renamed from: n, reason: collision with root package name */
    public Method f8560n;

    /* renamed from: o, reason: collision with root package name */
    public long f8561o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8562p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8563q;

    /* renamed from: r, reason: collision with root package name */
    public long f8564r;

    /* renamed from: s, reason: collision with root package name */
    public long f8565s;

    /* renamed from: t, reason: collision with root package name */
    public long f8566t;

    /* renamed from: u, reason: collision with root package name */
    public long f8567u;

    /* renamed from: v, reason: collision with root package name */
    public long f8568v;

    /* renamed from: w, reason: collision with root package name */
    public int f8569w;

    /* renamed from: x, reason: collision with root package name */
    public int f8570x;

    /* renamed from: y, reason: collision with root package name */
    public long f8571y;

    /* renamed from: z, reason: collision with root package name */
    public long f8572z;

    public o(b9.c cVar) {
        this.f8549a = cVar;
        if (a5.d0.f105a >= 18) {
            try {
                this.f8560n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f8550b = new long[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a() {
        /*
            r12 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r12.f8571y
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L2b
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            long r0 = r0 - r2
            float r2 = r12.j
            long r0 = a5.d0.t(r0, r2)
            int r2 = r12.f8555g
            long r2 = (long) r2
            long r0 = r0 * r2
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r2
            long r2 = r12.B
            long r4 = r12.A
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L2b:
            long r2 = r12.f8565s
            long r2 = r0 - r2
            r6 = 5
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L90
            android.media.AudioTrack r2 = r12.f8551c
            r2.getClass()
            int r3 = r2.getPlayState()
            r6 = 1
            if (r3 != r6) goto L42
            goto L8e
        L42:
            int r2 = r2.getPlaybackHeadPosition()
            long r6 = (long) r2
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            boolean r2 = r12.f8556h
            r8 = 0
            if (r2 == 0) goto L61
            r2 = 2
            if (r3 != r2) goto L5e
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L5e
            long r10 = r12.f8566t
            r12.f8568v = r10
        L5e:
            long r10 = r12.f8568v
            long r6 = r6 + r10
        L61:
            int r2 = a5.d0.f105a
            r10 = 29
            if (r2 > r10) goto L7f
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L7d
            long r10 = r12.f8566t
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 <= 0) goto L7d
            r2 = 3
            if (r3 != r2) goto L7d
            long r2 = r12.f8572z
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L8e
            r12.f8572z = r0
            goto L8e
        L7d:
            r12.f8572z = r4
        L7f:
            long r2 = r12.f8566t
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L8c
            long r2 = r12.f8567u
            r4 = 1
            long r2 = r2 + r4
            r12.f8567u = r2
        L8c:
            r12.f8566t = r6
        L8e:
            r12.f8565s = r0
        L90:
            long r0 = r12.f8566t
            long r2 = r12.f8567u
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.o.a():long");
    }

    public final boolean b(long j) {
        if (j > a()) {
            return true;
        }
        if (!this.f8556h) {
            return false;
        }
        AudioTrack audioTrack = this.f8551c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && a() == 0;
    }

    public final void c() {
        this.f8558l = 0L;
        this.f8570x = 0;
        this.f8569w = 0;
        this.f8559m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.k = false;
    }
}
