package rb;

import android.view.Surface;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final d f21502a;

    /* renamed from: b, reason: collision with root package name */
    public final m f21503b;

    /* renamed from: c, reason: collision with root package name */
    public final p f21504c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21505d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f21506e;

    /* renamed from: f, reason: collision with root package name */
    public float f21507f;

    /* renamed from: g, reason: collision with root package name */
    public float f21508g;

    /* renamed from: h, reason: collision with root package name */
    public float f21509h;

    /* renamed from: i, reason: collision with root package name */
    public float f21510i;
    public long j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f21511l;

    /* renamed from: m, reason: collision with root package name */
    public long f21512m;

    /* renamed from: n, reason: collision with root package name */
    public long f21513n;

    /* renamed from: o, reason: collision with root package name */
    public long f21514o;

    /* renamed from: p, reason: collision with root package name */
    public long f21515p;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            rb.d r0 = new rb.d
            r0.<init>()
            rb.c r1 = new rb.c
            r2 = 0
            r1.<init>(r2)
            r0.f21455d = r1
            rb.c r1 = new rb.c
            r1.<init>(r2)
            r0.f21456e = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f21453b = r1
            r6.f21502a = r0
            r0 = 0
            if (r7 == 0) goto L52
            android.content.Context r7 = r7.getApplicationContext()
            int r3 = qb.v.f20828a
            r4 = 17
            if (r3 < r4) goto L3e
            java.lang.String r3 = "display"
            java.lang.Object r3 = r7.getSystemService(r3)
            android.hardware.display.DisplayManager r3 = (android.hardware.display.DisplayManager) r3
            if (r3 == 0) goto L3e
            rb.o r4 = new rb.o
            r5 = 0
            r4.<init>(r3, r5)
            goto L3f
        L3e:
            r4 = r0
        L3f:
            if (r4 != 0) goto L53
            java.lang.String r3 = "window"
            java.lang.Object r7 = r7.getSystemService(r3)
            android.view.WindowManager r7 = (android.view.WindowManager) r7
            if (r7 == 0) goto L52
            rb.n r4 = new rb.n
            r3 = 0
            r4.<init>(r7, r3)
            goto L53
        L52:
            r4 = r0
        L53:
            r6.f21503b = r4
            if (r4 == 0) goto L59
            rb.p r0 = rb.p.f21497x
        L59:
            r6.f21504c = r0
            r6.j = r1
            r6.k = r1
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.f21507f = r7
            r7 = 1065353216(0x3f800000, float:1.0)
            r6.f21510i = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.q.<init>(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r9 = this;
            int r0 = qb.v.f20828a
            r1 = 30
            if (r0 < r1) goto L99
            android.view.Surface r0 = r9.f21506e
            if (r0 != 0) goto Lc
            goto L99
        Lc:
            rb.d r0 = r9.f21502a
            java.lang.Object r2 = r0.f21455d
            rb.c r2 = (rb.c) r2
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.f21455d
            rb.c r2 = (rb.c) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.f21455d
            rb.c r2 = (rb.c) r2
            long r4 = r2.f21448f
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L31
            goto L34
        L31:
            long r6 = r2.f21449g
            long r6 = r6 / r4
        L34:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L41
        L3d:
            r2 = r3
            goto L41
        L3f:
            float r2 = r9.f21507f
        L41:
            float r4 = r9.f21508g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L48
            goto L99
        L48:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L8c
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L8c
            java.lang.Object r1 = r0.f21455d
            rb.c r1 = (rb.c) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r0.f21455d
            rb.c r1 = (rb.c) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L6b
            java.lang.Object r0 = r0.f21455d
            rb.c r0 = (rb.c) r0
            long r0 = r0.f21449g
            goto L70
        L6b:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L70:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L7d
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L7f
        L7d:
            r0 = 1065353216(0x3f800000, float:1.0)
        L7f:
            float r1 = r9.f21508g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L99
            goto L93
        L8c:
            if (r5 == 0) goto L8f
            goto L93
        L8f:
            int r0 = r0.f21454c
            if (r0 < r1) goto L99
        L93:
            r9.f21508g = r2
            r0 = 0
            r9.b(r0)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.q.a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r5) {
        /*
            r4 = this;
            int r0 = qb.v.f20828a
            r1 = 30
            if (r0 < r1) goto L3b
            android.view.Surface r0 = r4.f21506e
            if (r0 != 0) goto Lb
            goto L3b
        Lb:
            boolean r1 = r4.f21505d
            r2 = 0
            if (r1 == 0) goto L1c
            float r1 = r4.f21508g
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L1c
            float r3 = r4.f21510i
            float r1 = r1 * r3
            goto L1d
        L1c:
            r1 = r2
        L1d:
            if (r5 != 0) goto L26
            float r5 = r4.f21509h
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L26
            goto L3b
        L26:
            r4.f21509h = r1
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L2e
            r5 = 0
            goto L2f
        L2e:
            r5 = 1
        L2f:
            hf.z.t(r0, r1, r5)     // Catch: java.lang.IllegalStateException -> L33
            return
        L33:
            r5 = move-exception
            java.lang.String r0 = "VideoFrameReleaseHelper"
            java.lang.String r1 = "Failed to call Surface.setFrameRate"
            qb.b.q(r0, r1, r5)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.q.b(boolean):void");
    }
}
