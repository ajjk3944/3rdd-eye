package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.v42;
import com.yandex.mobile.ads.impl.xv0;

/* loaded from: classes3.dex */
public final class ry1 extends v42 {

    /* renamed from: p, reason: collision with root package name */
    private static final Object f32797p = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final long f32798c;

    /* renamed from: d, reason: collision with root package name */
    private final long f32799d;

    /* renamed from: e, reason: collision with root package name */
    private final long f32800e;

    /* renamed from: f, reason: collision with root package name */
    private final long f32801f;

    /* renamed from: g, reason: collision with root package name */
    private final long f32802g;

    /* renamed from: h, reason: collision with root package name */
    private final long f32803h;
    private final long i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f32804j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f32805k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f32806l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f32807m;

    /* renamed from: n, reason: collision with root package name */
    private final xv0 f32808n;

    /* renamed from: o, reason: collision with root package name */
    private final xv0.e f32809o;

    static {
        new xv0.a().b("SinglePeriodTimeline").a(Uri.EMPTY).a();
    }

    public ry1(long j4, long j10, boolean z10, xv0 xv0Var, xv0.e eVar) {
        this.f32798c = -9223372036854775807L;
        this.f32799d = -9223372036854775807L;
        this.f32800e = -9223372036854775807L;
        this.f32801f = j4;
        this.f32802g = j10;
        this.f32803h = 0L;
        this.i = 0L;
        this.f32804j = z10;
        this.f32805k = false;
        this.f32806l = false;
        this.f32807m = null;
        this.f32808n = (xv0) zf.a(xv0Var);
        this.f32809o = eVar;
    }

    @Override // com.yandex.mobile.ads.impl.v42
    public final int a() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.v42
    public final int b() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.v42
    public final v42.b a(int i, v42.b bVar, boolean z10) {
        zf.a(i, 1);
        Object obj = z10 ? f32797p : null;
        long j4 = this.f32801f;
        long j10 = -this.f32803h;
        bVar.getClass();
        return bVar.a(null, obj, 0, j4, j10, C4246z4.f36166h, false);
    }

    @Override // com.yandex.mobile.ads.impl.v42
    public final Object a(int i) {
        zf.a(i, 1);
        return f32797p;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r1
  0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.yandex.mobile.ads.impl.v42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.v42.d a(int r25, com.yandex.mobile.ads.impl.v42.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            com.yandex.mobile.ads.impl.zf.a(r2, r1)
            long r1 = r0.i
            boolean r14 = r0.f32805k
            if (r14 == 0) goto L2d
            boolean r3 = r0.f32806l
            if (r3 != 0) goto L2d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2d
            long r3 = r0.f32802g
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L24
            goto L2a
        L24:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2d
        L2a:
            r16 = r5
            goto L2f
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = com.yandex.mobile.ads.impl.v42.d.f34354s
            com.yandex.mobile.ads.impl.xv0 r5 = r0.f32808n
            java.lang.Object r6 = r0.f32807m
            long r7 = r0.f32798c
            long r9 = r0.f32799d
            long r11 = r0.f32800e
            boolean r13 = r0.f32804j
            com.yandex.mobile.ads.impl.xv0$e r15 = r0.f32809o
            long r1 = r0.f32802g
            r18 = r1
            long r1 = r0.f32803h
            r20 = 0
            r21 = 0
            r3 = r26
            r22 = r1
            com.yandex.mobile.ads.impl.v42$d r1 = r3.a(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ry1.a(int, com.yandex.mobile.ads.impl.v42$d, long):com.yandex.mobile.ads.impl.v42$d");
    }

    @Override // com.yandex.mobile.ads.impl.v42
    public final int a(Object obj) {
        return f32797p.equals(obj) ? 0 : -1;
    }

    public ry1(long j4, long j10, boolean z10, boolean z11, xv0 xv0Var) {
        this(j4, j10, z10, xv0Var, z11 ? xv0Var.f35440d : null);
    }
}
