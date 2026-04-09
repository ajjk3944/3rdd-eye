package zt;

import wt.d1;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final bu.t f27543a = new bu.t("NO_VALUE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final bu.t f27544b = new bu.t("NONE", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final bu.t f27545c = new bu.t("PENDING", 0);

    public static final o0 a(Object obj) {
        if (obj == null) {
            obj = au.c.f2321b;
        }
        return new o0(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(zt.q0 r4, d4.o r5, java.lang.Throwable r6, rq.c r7) {
        /*
            boolean r0 = r7 instanceof zt.i
            if (r0 == 0) goto L13
            r0 = r7
            zt.i r0 = (zt.i) r0
            int r1 = r0.f27553y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27553y = r1
            goto L18
        L13:
            zt.i r0 = new zt.i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27552x
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.f27553y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.f27551r
            lf.t1.G(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            lf.t1.G(r7)
            r0.f27551r = r6     // Catch: java.lang.Throwable -> L29
            r0.f27553y = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.h(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            lq.b0 r4 = lq.b0.f15562a
            return r4
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            ir.f0.c(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zt.f0.b(zt.q0, d4.o, java.lang.Throwable, rq.c):java.lang.Object");
    }

    public static final void c(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static f d(f fVar, int i10) {
        yt.a aVar = yt.a.SUSPEND;
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(h0.b.h(i10, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i10 == -1) {
            aVar = yt.a.DROP_OLDEST;
            i10 = 0;
        }
        boolean z10 = fVar instanceof au.o;
        pq.i iVar = pq.i.f20621a;
        return z10 ? ((au.o) fVar).a(iVar, i10, aVar) : new au.h(fVar, iVar, i10, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable e(zt.f r4, zt.g r5, rq.c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof zt.n
            if (r0 == 0) goto L13
            r0 = r6
            zt.n r0 = (zt.n) r0
            int r1 = r0.f27572y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27572y = r1
            goto L18
        L13:
            zt.n r0 = new zt.n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f27571x
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.f27572y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            br.w r4 = r0.f27570r
            lf.t1.G(r6)     // Catch: java.lang.Throwable -> L29
            goto L4b
        L29:
            r5 = move-exception
            goto L4f
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            lf.t1.G(r6)
            br.w r6 = new br.w
            r6.<init>()
            zt.d r2 = new zt.d     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4d
            r0.f27570r = r6     // Catch: java.lang.Throwable -> L4d
            r0.f27572y = r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r4 = r4.l(r2, r0)     // Catch: java.lang.Throwable -> L4d
            if (r4 != r1) goto L4b
            return r1
        L4b:
            r4 = 0
            return r4
        L4d:
            r5 = move-exception
            r4 = r6
        L4f:
            java.lang.Object r4 = r4.f2917a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L5b
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L7e
        L5b:
            pq.h r6 = r0.f21666d
            br.l.b(r6)
            wt.r r0 = wt.r.f24653d
            pq.f r6 = r6.Y(r0)
            wt.t0 r6 = (wt.t0) r6
            if (r6 == 0) goto L7f
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L71
            goto L7f
        L71:
            java.util.concurrent.CancellationException r6 = r6.y()
            if (r6 == 0) goto L7f
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L7e
            goto L7f
        L7e:
            throw r5
        L7f:
            if (r4 != 0) goto L82
            return r5
        L82:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L8a
            ir.f0.c(r4, r5)
            throw r4
        L8a:
            ir.f0.c(r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zt.f0.e(zt.f, zt.g, rq.c):java.io.Serializable");
    }

    public static final f f(f fVar) {
        return ((fVar instanceof m0) || (fVar instanceof e)) ? fVar : new e(fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r2.i(r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005d, B:29:0x0071, B:31:0x0079, B:20:0x0048, B:24:0x0053), top: B:50:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v5, types: [yt.q] */
    /* JADX WARN: Type inference failed for: r8v7, types: [yt.q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008b -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(zt.g r7, yt.o r8, boolean r9, rq.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof zt.h
            if (r0 == 0) goto L13
            r0 = r10
            zt.h r0 = (zt.h) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.E = r1
            goto L18
        L13:
            zt.h r0 = new zt.h
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.D
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.E
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            boolean r9 = r0.B
            yt.b r7 = r0.f27550y
            yt.q r8 = r0.f27549x
            zt.g r2 = r0.f27548r
            lf.t1.G(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r6 = r2
            r2 = r7
            r7 = r6
            goto L5d
        L36:
            r7 = move-exception
            goto L96
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            boolean r9 = r0.B
            yt.b r7 = r0.f27550y
            yt.q r8 = r0.f27549x
            zt.g r2 = r0.f27548r
            lf.t1.G(r10)     // Catch: java.lang.Throwable -> L36
            goto L71
        L4c:
            lf.t1.G(r10)
            boolean r10 = r7 instanceof zt.q0
            if (r10 != 0) goto Lb1
            yt.c r10 = r8.f26455r     // Catch: java.lang.Throwable -> L36
            r10.getClass()     // Catch: java.lang.Throwable -> L36
            yt.b r2 = new yt.b     // Catch: java.lang.Throwable -> L36
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L36
        L5d:
            r0.f27548r = r7     // Catch: java.lang.Throwable -> L36
            r0.f27549x = r8     // Catch: java.lang.Throwable -> L36
            r0.f27550y = r2     // Catch: java.lang.Throwable -> L36
            r0.B = r9     // Catch: java.lang.Throwable -> L36
            r0.E = r5     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r2.b(r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r1) goto L6e
            goto L8d
        L6e:
            r6 = r2
            r2 = r7
            r7 = r6
        L71:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L36
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r10 == 0) goto L8e
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L36
            r0.f27548r = r2     // Catch: java.lang.Throwable -> L36
            r0.f27549x = r8     // Catch: java.lang.Throwable -> L36
            r0.f27550y = r7     // Catch: java.lang.Throwable -> L36
            r0.B = r9     // Catch: java.lang.Throwable -> L36
            r0.E = r4     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r2.i(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r1) goto L32
        L8d:
            return r1
        L8e:
            if (r9 == 0) goto L93
            r8.h(r3)
        L93:
            lq.b0 r7 = lq.b0.f15562a
            return r7
        L96:
            throw r7     // Catch: java.lang.Throwable -> L97
        L97:
            r10 = move-exception
            if (r9 == 0) goto Lb0
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto La1
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        La1:
            if (r3 != 0) goto Lad
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        Lad:
            r8.h(r3)
        Lb0:
            throw r10
        Lb1:
            zt.q0 r7 = (zt.q0) r7
            java.lang.Throwable r7 = r7.f27588a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zt.f0.g(zt.g, yt.o, boolean, rq.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(zt.f r6, ar.n r7, rq.c r8) {
        /*
            bu.t r0 = au.c.f2321b
            boolean r1 = r8 instanceof zt.w
            if (r1 == 0) goto L15
            r1 = r8
            zt.w r1 = (zt.w) r1
            int r2 = r1.D
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.D = r2
            goto L1a
        L15:
            zt.w r1 = new zt.w
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.B
            qq.a r2 = qq.a.COROUTINE_SUSPENDED
            int r3 = r1.D
            r4 = 1
            if (r3 == 0) goto L3b
            if (r3 != r4) goto L33
            j0.g r6 = r1.f27603y
            br.w r7 = r1.f27602x
            rq.j r1 = r1.f27601r
            ar.n r1 = (ar.n) r1
            lf.t1.G(r8)     // Catch: au.a -> L31
            goto L69
        L31:
            r8 = move-exception
            goto L65
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            lf.t1.G(r8)
            br.w r8 = new br.w
            r8.<init>()
            r8.f2917a = r0
            j0.g r3 = new j0.g
            r5 = 2
            r3.<init>(r7, r5, r8)
            r5 = r7
            rq.j r5 = (rq.j) r5     // Catch: au.a -> L60
            r1.f27601r = r5     // Catch: au.a -> L60
            r1.f27602x = r8     // Catch: au.a -> L60
            r1.f27603y = r3     // Catch: au.a -> L60
            r1.D = r4     // Catch: au.a -> L60
            java.lang.Object r6 = r6.l(r3, r1)     // Catch: au.a -> L60
            if (r6 != r2) goto L5d
            return r2
        L5d:
            r1 = r7
            r7 = r8
            goto L69
        L60:
            r6 = move-exception
            r1 = r7
            r7 = r8
            r8 = r6
            r6 = r3
        L65:
            java.lang.Object r2 = r8.f2315a
            if (r2 != r6) goto L82
        L69:
            java.lang.Object r6 = r7.f2917a
            if (r6 == r0) goto L6e
            return r6
        L6e:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Expected at least one element matching the predicate "
            r7.<init>(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L82:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zt.f0.h(zt.f, ar.n, rq.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(zt.f r6, rq.c r7) {
        /*
            bu.t r0 = au.c.f2321b
            boolean r1 = r7 instanceof zt.v
            if (r1 == 0) goto L15
            r1 = r7
            zt.v r1 = (zt.v) r1
            int r2 = r1.B
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.B = r2
            goto L1a
        L15:
            zt.v r1 = new zt.v
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.f27600y
            qq.a r2 = qq.a.COROUTINE_SUSPENDED
            int r3 = r1.B
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            zt.t r6 = r1.f27599x
            br.w r1 = r1.f27598r
            lf.t1.G(r7)     // Catch: au.a -> L2d
            goto L5e
        L2d:
            r7 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            lf.t1.G(r7)
            br.w r7 = new br.w
            r7.<init>()
            r7.f2917a = r0
            zt.t r3 = new zt.t
            r5 = 0
            r3.<init>(r7, r5)
            r1.f27598r = r7     // Catch: au.a -> L56
            r1.f27599x = r3     // Catch: au.a -> L56
            r1.B = r4     // Catch: au.a -> L56
            java.lang.Object r6 = r6.l(r3, r1)     // Catch: au.a -> L56
            if (r6 != r2) goto L54
            return r2
        L54:
            r1 = r7
            goto L5e
        L56:
            r6 = move-exception
            r1 = r7
            r7 = r6
            r6 = r3
        L5a:
            java.lang.Object r2 = r7.f2315a
            if (r2 != r6) goto L6b
        L5e:
            java.lang.Object r6 = r1.f2917a
            if (r6 == r0) goto L63
            return r6
        L63:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zt.f0.i(zt.f, rq.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(zt.f r5, rq.c r6) {
        /*
            boolean r0 = r6 instanceof zt.x
            if (r0 == 0) goto L13
            r0 = r6
            zt.x r0 = (zt.x) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            zt.x r0 = new zt.x
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f27606y
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            zt.t r5 = r0.f27605x
            br.w r0 = r0.f27604r
            lf.t1.G(r6)     // Catch: au.a -> L2b
            goto L5a
        L2b:
            r6 = move-exception
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            lf.t1.G(r6)
            br.w r6 = new br.w
            r6.<init>()
            zt.t r2 = new zt.t
            r4 = 1
            r2.<init>(r6, r4)
            r0.f27604r = r6     // Catch: au.a -> L52
            r0.f27605x = r2     // Catch: au.a -> L52
            r0.B = r3     // Catch: au.a -> L52
            java.lang.Object r5 = r5.l(r2, r0)     // Catch: au.a -> L52
            if (r5 != r1) goto L50
            return r1
        L50:
            r0 = r6
            goto L5a
        L52:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L56:
            java.lang.Object r1 = r6.f2315a
            if (r1 != r5) goto L5d
        L5a:
            java.lang.Object r5 = r0.f2917a
            return r5
        L5d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zt.f0.j(zt.f, rq.c):java.lang.Object");
    }

    public static final a0 k(z7.j jVar, bu.c cVar, l0 l0Var, Float f10) {
        yt.g.C.getClass();
        yt.f fVar = yt.f.f26445a;
        yt.a aVar = yt.a.SUSPEND;
        xr.a aVar2 = new xr.a(jVar, 11, pq.i.f20621a);
        o0 o0VarA = a(f10);
        pq.h hVar = (pq.h) aVar2.f25483g;
        f fVar2 = (f) aVar2.f25482d;
        wt.v vVar = l0Var.equals(i0.f27554a) ? wt.v.DEFAULT : wt.v.UNDISPATCHED;
        wg.d dVar = new wg.d(l0Var, fVar2, o0VarA, f10, null, 2);
        pq.h hVarT = wt.w.t(cVar, hVar);
        pq.c d1Var = vVar.isLazy() ? new d1(hVarT, dVar) : new wt.z(hVarT, true, true ? 1 : 0);
        vVar.invoke(dVar, d1Var, d1Var);
        return new a0(o0VarA);
    }
}
