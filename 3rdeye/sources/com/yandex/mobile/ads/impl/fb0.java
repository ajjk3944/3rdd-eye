package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class fb0 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f27266c;

    /* renamed from: e, reason: collision with root package name */
    private int f27268e;

    /* renamed from: a, reason: collision with root package name */
    private a f27264a = new a();

    /* renamed from: b, reason: collision with root package name */
    private a f27265b = new a();

    /* renamed from: d, reason: collision with root package name */
    private long f27267d = -9223372036854775807L;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f27269a;

        /* renamed from: b, reason: collision with root package name */
        private long f27270b;

        /* renamed from: c, reason: collision with root package name */
        private long f27271c;

        /* renamed from: d, reason: collision with root package name */
        private long f27272d;

        /* renamed from: e, reason: collision with root package name */
        private long f27273e;

        /* renamed from: f, reason: collision with root package name */
        private long f27274f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean[] f27275g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        private int f27276h;

        public final boolean a() {
            return this.f27272d > 15 && this.f27276h == 0;
        }

        public final void a(long j4) {
            long j10 = this.f27272d;
            if (j10 == 0) {
                this.f27269a = j4;
            } else if (j10 == 1) {
                long j11 = j4 - this.f27269a;
                this.f27270b = j11;
                this.f27274f = j11;
                this.f27273e = 1L;
            } else {
                long j12 = j4 - this.f27271c;
                int i = (int) (j10 % 15);
                if (Math.abs(j12 - this.f27270b) <= 1000000) {
                    this.f27273e++;
                    this.f27274f += j12;
                    boolean[] zArr = this.f27275g;
                    if (zArr[i]) {
                        zArr[i] = false;
                        this.f27276h--;
                    }
                } else {
                    boolean[] zArr2 = this.f27275g;
                    if (!zArr2[i]) {
                        zArr2[i] = true;
                        this.f27276h++;
                    }
                }
            }
            this.f27272d++;
            this.f27271c = j4;
        }
    }

    public final long a() {
        if (!this.f27264a.a()) {
            return -9223372036854775807L;
        }
        a aVar = this.f27264a;
        long j4 = aVar.f27273e;
        if (j4 == 0) {
            return 0L;
        }
        return aVar.f27274f / j4;
    }

    public final float b() {
        if (!this.f27264a.a()) {
            return -1.0f;
        }
        return (float) (1.0E9d / (this.f27264a.f27273e != 0 ? r0.f27274f / r1 : 0L));
    }

    public final int c() {
        return this.f27268e;
    }

    public final long d() {
        if (this.f27264a.a()) {
            return this.f27264a.f27274f;
        }
        return -9223372036854775807L;
    }

    public final boolean e() {
        return this.f27264a.a();
    }

    public final void f() {
        a aVar = this.f27264a;
        aVar.f27272d = 0L;
        aVar.f27273e = 0L;
        aVar.f27274f = 0L;
        aVar.f27276h = 0;
        Arrays.fill(aVar.f27275g, false);
        a aVar2 = this.f27265b;
        aVar2.f27272d = 0L;
        aVar2.f27273e = 0L;
        aVar2.f27274f = 0L;
        aVar2.f27276h = 0;
        Arrays.fill(aVar2.f27275g, false);
        this.f27266c = false;
        this.f27267d = -9223372036854775807L;
        this.f27268e = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r8) {
        /*
            r7 = this;
            com.yandex.mobile.ads.impl.fb0$a r0 = r7.f27264a
            r0.a(r8)
            com.yandex.mobile.ads.impl.fb0$a r0 = r7.f27264a
            boolean r0 = r0.a()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L12
            r7.f27266c = r2
            goto L60
        L12:
            long r3 = r7.f27267d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L60
            boolean r0 = r7.f27266c
            if (r0 == 0) goto L3d
            com.yandex.mobile.ads.impl.fb0$a r0 = r7.f27265b
            long r3 = com.yandex.mobile.ads.impl.fb0.a.a(r0)
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L2e
            goto L59
        L2e:
            boolean[] r0 = com.yandex.mobile.ads.impl.fb0.a.d(r0)
            r5 = 1
            long r3 = r3 - r5
            r5 = 15
            long r3 = r3 % r5
            int r3 = (int) r3
            boolean r0 = r0[r3]
            if (r0 == 0) goto L59
        L3d:
            com.yandex.mobile.ads.impl.fb0$a r0 = r7.f27265b
            com.yandex.mobile.ads.impl.fb0.a.e(r0)
            com.yandex.mobile.ads.impl.fb0.a.f(r0)
            com.yandex.mobile.ads.impl.fb0.a.g(r0)
            com.yandex.mobile.ads.impl.fb0.a.h(r0)
            boolean[] r0 = com.yandex.mobile.ads.impl.fb0.a.d(r0)
            java.util.Arrays.fill(r0, r2)
            com.yandex.mobile.ads.impl.fb0$a r0 = r7.f27265b
            long r3 = r7.f27267d
            r0.a(r3)
        L59:
            r7.f27266c = r1
            com.yandex.mobile.ads.impl.fb0$a r0 = r7.f27265b
            r0.a(r8)
        L60:
            boolean r0 = r7.f27266c
            if (r0 == 0) goto L76
            com.yandex.mobile.ads.impl.fb0$a r0 = r7.f27265b
            boolean r0 = r0.a()
            if (r0 == 0) goto L76
            com.yandex.mobile.ads.impl.fb0$a r0 = r7.f27264a
            com.yandex.mobile.ads.impl.fb0$a r3 = r7.f27265b
            r7.f27264a = r3
            r7.f27265b = r0
            r7.f27266c = r2
        L76:
            r7.f27267d = r8
            com.yandex.mobile.ads.impl.fb0$a r8 = r7.f27264a
            boolean r8 = r8.a()
            if (r8 == 0) goto L81
            goto L85
        L81:
            int r8 = r7.f27268e
            int r2 = r8 + 1
        L85:
            r7.f27268e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.fb0.a(long):void");
    }
}
