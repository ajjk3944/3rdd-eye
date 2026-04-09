package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final D f12540a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f12541b;

    /* renamed from: c, reason: collision with root package name */
    public V f12542c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12543d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f12544e;

    /* renamed from: f, reason: collision with root package name */
    public float f12545f;

    /* renamed from: g, reason: collision with root package name */
    public float f12546g;

    /* renamed from: h, reason: collision with root package name */
    public float f12547h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public int f12548j;

    /* renamed from: k, reason: collision with root package name */
    public long f12549k;

    /* renamed from: l, reason: collision with root package name */
    public long f12550l;

    /* renamed from: m, reason: collision with root package name */
    public long f12551m;

    /* renamed from: n, reason: collision with root package name */
    public long f12552n;

    /* renamed from: o, reason: collision with root package name */
    public long f12553o;

    /* renamed from: p, reason: collision with root package name */
    public long f12554p;

    /* renamed from: q, reason: collision with root package name */
    public long f12555q;

    /* renamed from: r, reason: collision with root package name */
    public long f12556r;

    /* renamed from: s, reason: collision with root package name */
    public long f12557s;

    public Y(Context context) {
        this.f12541b = context;
        D d6 = new D();
        d6.f7707a = new C();
        d6.f7708b = new C();
        d6.f7710d = -9223372036854775807L;
        this.f12540a = d6;
        this.f12545f = -1.0f;
        this.i = 1.0f;
        this.f12548j = 0;
    }

    public final void a() {
        this.f12551m = 0L;
        this.f12555q = -1L;
        this.f12552n = -1L;
        this.f12549k = 0L;
        this.f12550l = 0L;
    }

    public final void b() {
        float f2;
        if (Build.VERSION.SDK_INT < 30 || this.f12544e == null) {
            return;
        }
        D d6 = this.f12540a;
        if (!d6.f7707a.b()) {
            f2 = this.f12545f;
        } else if (d6.f7707a.b()) {
            f2 = (float) (1.0E9d / (d6.f7707a.f7475e != 0 ? r2.f7476f / r4 : 0L));
        } else {
            f2 = -1.0f;
        }
        float f5 = this.f12546g;
        if (f2 != f5) {
            if (f2 != -1.0f && f5 != -1.0f) {
                float f6 = 1.0f;
                if (d6.f7707a.b()) {
                    if ((d6.f7707a.b() ? d6.f7707a.f7476f : -9223372036854775807L) >= 5000000000L) {
                        f6 = 0.1f;
                    }
                }
                if (Math.abs(f2 - this.f12546g) < f6) {
                    return;
                }
            } else if (f2 == -1.0f && d6.f7711e < 30) {
                return;
            }
            this.f12546g = f2;
            c(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(boolean r4) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L48
            android.view.Surface r0 = r3.f12544e
            if (r0 == 0) goto L48
            int r1 = r3.f12548j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L48
            boolean r0 = r0.isValid()
            if (r0 != 0) goto L17
            goto L48
        L17:
            boolean r0 = r3.f12543d
            r1 = 0
            if (r0 == 0) goto L28
            float r0 = r3.f12546g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L28
            float r2 = r3.i
            float r0 = r0 * r2
            goto L29
        L28:
            r0 = r1
        L29:
            if (r4 != 0) goto L31
            float r4 = r3.f12547h
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 == 0) goto L48
        L31:
            r3.f12547h = r0
            android.view.Surface r4 = r3.f12544e
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L3b
            r1 = 0
            goto L3c
        L3b:
            r1 = 1
        L3c:
            Z4.b.x(r4, r0, r1)     // Catch: java.lang.IllegalStateException -> L40
            return
        L40:
            r4 = move-exception
            java.lang.String r0 = "VideoFrameReleaseHelper"
            java.lang.String r1 = "Failed to call Surface.setFrameRate"
            com.google.android.gms.internal.ads.AbstractC2022vd.K(r0, r1, r4)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Y.c(boolean):void");
    }

    public final void d() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f12544e) == null || this.f12548j == Integer.MIN_VALUE || this.f12547h == 0.0f || !surface.isValid()) {
            return;
        }
        this.f12547h = 0.0f;
        try {
            this.f12544e.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e6) {
            AbstractC2022vd.K("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e6);
        }
    }
}
