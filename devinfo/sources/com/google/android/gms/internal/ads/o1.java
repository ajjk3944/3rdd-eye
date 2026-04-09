package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public long f14497a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f14498b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f14499c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f14500d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f14501e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f14502f = -1;
    public long g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f14503h = -1;

    public static long a(long j, long j8, long j9, long j10, long j11, long j12) {
        if (j10 + 1 >= j11 || 1 + j8 >= j9) {
            return j10;
        }
        long j13 = (long) (((j11 - j10) / (j9 - j8)) * (j - j8));
        String str = bq0.f9768a;
        return Math.max(j10, Math.min(((j10 + j13) - j12) - (j13 / 20), j11 - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bb, code lost:
    
        if (r9.contains("REWARDED") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.content.Context r9, android.view.View r10) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r8 = this;
            long r0 = r8.f14499c
            r8.f14500d = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r8.f14499c = r0
            long r0 = r8.f14501e
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L14
            r8.f14502f = r0
        L14:
            java.lang.String r0 = "window"
            java.lang.Object r9 = r9.getSystemService(r0)
            android.view.WindowManager r9 = (android.view.WindowManager) r9
            android.view.Display r9 = r9.getDefaultDisplay()
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r9.getRealMetrics(r0)     // Catch: java.lang.NoSuchMethodError -> L29
            goto L2c
        L29:
            r9.getMetrics(r0)
        L2c:
            int r9 = r0.widthPixels
            int r1 = r0.heightPixels
            int r9 = r9 * r1
            if (r10 != 0) goto L35
            goto Lc2
        L35:
            int r1 = r10.getWidth()
            int r4 = r0.widthPixels
            int r1 = java.lang.Math.min(r1, r4)
            int r4 = r10.getHeight()
            int r0 = r0.heightPixels
            int r0 = java.lang.Math.min(r4, r0)
            int r0 = r0 * r1
            int r1 = r0 + r0
            if (r1 < r9) goto L4f
            goto Lbd
        L4f:
            if (r0 != 0) goto Lc2
            java.lang.Class r9 = r10.getClass()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "DebugGestureViewWrapper"
            boolean r9 = r9.contains(r0)     // Catch: java.lang.Throwable -> Lc2
            r0 = 0
            if (r9 == 0) goto L68
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10     // Catch: java.lang.Throwable -> Lc2
            android.view.View r10 = r10.getChildAt(r0)     // Catch: java.lang.Throwable -> Lc2
        L68:
            java.lang.Class r9 = r10.getClass()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = "getAdConfiguration"
            r4 = 0
            java.lang.reflect.Method r9 = r9.getMethod(r1, r4)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r9 = r9.invoke(r10, r4)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Class r10 = r9.getClass()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = "adType"
            java.lang.reflect.Field r10 = r10.getField(r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r10 = r10.get(r9)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Throwable -> Lc2
            r10.intValue()     // Catch: java.lang.Throwable -> Lc2
            java.lang.Class r9 = r9.getClass()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = "adTypeToString"
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> Lc2
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lc2
            r6[r0] = r7     // Catch: java.lang.Throwable -> Lc2
            java.lang.reflect.Method r9 = r9.getMethod(r1, r6)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lc2
            r1[r0] = r10     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r9 = r9.invoke(r4, r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r10 = "INTERSTITIAL"
            boolean r10 = r9.contains(r10)     // Catch: java.lang.Throwable -> Lc2
            if (r10 != 0) goto Lbd
            java.lang.String r10 = "APP_OPEN"
            boolean r10 = r9.contains(r10)     // Catch: java.lang.Throwable -> Lc2
            if (r10 != 0) goto Lbd
            java.lang.String r10 = "REWARDED"
            boolean r9 = r9.contains(r10)     // Catch: java.lang.Throwable -> Lc2
            if (r9 == 0) goto Lc2
        Lbd:
            long r9 = r8.f14499c
            r8.f14501e = r9
            return
        Lc2:
            r8.f14501e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o1.b(android.content.Context, android.view.View):void");
    }
}
