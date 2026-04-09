package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class u12 {

    /* renamed from: a, reason: collision with root package name */
    public final int f33861a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33862b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33863c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33864d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33865e;

    private u12(int i, int i10, int i11, int i12, int i13) {
        this.f33861a = i;
        this.f33862b = i10;
        this.f33863c = i11;
        this.f33864d = i12;
        this.f33865e = i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.u12 a(java.lang.String r10) {
        /*
            r0 = 1
            r1 = 0
            r2 = -1
            java.lang.String r3 = "Format:"
            boolean r3 = r10.startsWith(r3)
            if (r3 == 0) goto L7b
            r3 = 7
            java.lang.String r10 = r10.substring(r3)
            java.lang.String r3 = ","
            java.lang.String[] r10 = android.text.TextUtils.split(r10, r3)
            r3 = r1
            r5 = r2
            r6 = r5
            r7 = r6
            r8 = r7
        L1b:
            int r4 = r10.length
            if (r3 >= r4) goto L6c
            r4 = r10[r3]
            java.lang.String r4 = r4.trim()
            java.lang.String r4 = com.yandex.mobile.ads.impl.xf.b(r4)
            r4.getClass()
            int r9 = r4.hashCode()
            switch(r9) {
                case 100571: goto L55;
                case 3556653: goto L4a;
                case 109757538: goto L3f;
                case 109780401: goto L34;
                default: goto L32;
            }
        L32:
            r4 = r2
            goto L5f
        L34:
            java.lang.String r9 = "style"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L3d
            goto L32
        L3d:
            r4 = 3
            goto L5f
        L3f:
            java.lang.String r9 = "start"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L48
            goto L32
        L48:
            r4 = 2
            goto L5f
        L4a:
            java.lang.String r9 = "text"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L53
            goto L32
        L53:
            r4 = r0
            goto L5f
        L55:
            java.lang.String r9 = "end"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L5e
            goto L32
        L5e:
            r4 = r1
        L5f:
            switch(r4) {
                case 0: goto L69;
                case 1: goto L67;
                case 2: goto L65;
                case 3: goto L63;
                default: goto L62;
            }
        L62:
            goto L6a
        L63:
            r7 = r3
            goto L6a
        L65:
            r5 = r3
            goto L6a
        L67:
            r8 = r3
            goto L6a
        L69:
            r6 = r3
        L6a:
            int r3 = r3 + r0
            goto L1b
        L6c:
            if (r5 == r2) goto L79
            if (r6 == r2) goto L79
            if (r8 == r2) goto L79
            com.yandex.mobile.ads.impl.u12 r4 = new com.yandex.mobile.ads.impl.u12
            int r9 = r10.length
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L79:
            r10 = 0
            return r10
        L7b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.u12.a(java.lang.String):com.yandex.mobile.ads.impl.u12");
    }
}
