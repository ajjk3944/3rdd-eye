package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class hm implements xl1 {

    /* renamed from: a, reason: collision with root package name */
    private final y70 f28264a;

    /* renamed from: b, reason: collision with root package name */
    private u70 f28265b;

    /* renamed from: c, reason: collision with root package name */
    private rz f28266c;

    public hm(y70 y70Var) {
        this.f28264a = y70Var;
    }

    public final void a() {
        u70 u70Var = this.f28265b;
        if (u70Var instanceof q11) {
            ((q11) u70Var).a();
        }
    }

    public final long b() {
        rz rzVar = this.f28266c;
        if (rzVar != null) {
            return rzVar.a();
        }
        return -1L;
    }

    public final void c() {
        u70 u70Var = this.f28265b;
        if (u70Var != null) {
            u70Var.release();
            this.f28265b = null;
        }
        this.f28266c = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
    
        if (r7.f28265b != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        r12 = new java.lang.StringBuilder("None of the available extractors (");
        r13 = com.yandex.mobile.ads.impl.s82.f32899a;
        r13 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        if (r11 >= r8.length) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008e, code lost:
    
        r13.append(r8[r11].getClass().getSimpleName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009d, code lost:
    
        if (r11 >= (r8.length - 1)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        r13.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a4, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a6, code lost:
    
        r12.append(r13.toString());
        r12.append(") could read the stream.");
        r8 = r12.toString();
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bc, code lost:
    
        throw new com.yandex.mobile.ads.impl.x72(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.yandex.mobile.ads.impl.ov r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.yandex.mobile.ads.impl.w70 r15) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 1
            com.yandex.mobile.ads.impl.rz r1 = new com.yandex.mobile.ads.impl.rz
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.f28266c = r1
            com.yandex.mobile.ads.impl.u70 r8 = r7.f28265b
            if (r8 == 0) goto L10
            return
        L10:
            com.yandex.mobile.ads.impl.y70 r8 = r7.f28264a
            com.yandex.mobile.ads.impl.u70[] r8 = r8.a(r9, r10)
            int r10 = r8.length
            r11 = 0
            if (r10 != r0) goto L20
            r8 = r8[r11]
            r7.f28265b = r8
            goto Lbd
        L20:
            int r10 = r8.length
            r12 = r11
        L22:
            if (r12 >= r10) goto L77
            r13 = r8[r12]
            boolean r14 = r13.a(r1)     // Catch: java.lang.Throwable -> L32 java.io.EOFException -> L5f
            if (r14 == 0) goto L35
            r7.f28265b = r13     // Catch: java.lang.Throwable -> L32 java.io.EOFException -> L5f
            r1.c()
            goto L77
        L32:
            r0 = move-exception
            r8 = r0
            goto L48
        L35:
            com.yandex.mobile.ads.impl.u70 r13 = r7.f28265b
            if (r13 != 0) goto L72
            long r13 = r1.a()
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 != 0) goto L42
            goto L72
        L42:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L48:
            com.yandex.mobile.ads.impl.u70 r9 = r7.f28265b
            if (r9 != 0) goto L5b
            long r9 = r1.a()
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L55
            goto L5b
        L55:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L5b:
            r1.c()
            throw r8
        L5f:
            com.yandex.mobile.ads.impl.u70 r13 = r7.f28265b
            if (r13 != 0) goto L72
            long r13 = r1.a()
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 != 0) goto L6c
            goto L72
        L6c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L72:
            r1.c()
            int r12 = r12 + r0
            goto L22
        L77:
            com.yandex.mobile.ads.impl.u70 r10 = r7.f28265b
            if (r10 != 0) goto Lbd
            com.yandex.mobile.ads.impl.x72 r10 = new com.yandex.mobile.ads.impl.x72
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "None of the available extractors ("
            r12.<init>(r13)
            int r13 = com.yandex.mobile.ads.impl.s82.f32899a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
        L8b:
            int r14 = r8.length
            if (r11 >= r14) goto La6
            r14 = r8[r11]
            java.lang.Class r14 = r14.getClass()
            java.lang.String r14 = r14.getSimpleName()
            r13.append(r14)
            int r14 = r8.length
            int r14 = r14 - r0
            if (r11 >= r14) goto La4
            java.lang.String r14 = ", "
            r13.append(r14)
        La4:
            int r11 = r11 + r0
            goto L8b
        La6:
            java.lang.String r8 = r13.toString()
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            r9.getClass()
            r10.<init>(r8)
            throw r10
        Lbd:
            com.yandex.mobile.ads.impl.u70 r8 = r7.f28265b
            r8.a(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hm.a(com.yandex.mobile.ads.impl.ov, android.net.Uri, java.util.Map, long, long, com.yandex.mobile.ads.impl.w70):void");
    }

    public final int a(jj1 jj1Var) throws IOException {
        u70 u70Var = this.f28265b;
        u70Var.getClass();
        rz rzVar = this.f28266c;
        rzVar.getClass();
        return u70Var.a(rzVar, jj1Var);
    }

    public final void a(long j4, long j10) {
        u70 u70Var = this.f28265b;
        u70Var.getClass();
        u70Var.a(j4, j10);
    }
}
