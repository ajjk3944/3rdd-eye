package p4;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final File f31207a;

    /* renamed from: b, reason: collision with root package name */
    public final w0 f31208b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f31209c;

    /* renamed from: d, reason: collision with root package name */
    public final b2.b f31210d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f31211e;

    /* renamed from: f, reason: collision with root package name */
    public final gl.c f31212f;

    public g0(File file, w0 w0Var, k0 k0Var, b2.b bVar) {
        nk.k.e(w0Var, "serializer");
        nk.k.e(k0Var, "coordinator");
        this.f31207a = file;
        this.f31208b = w0Var;
        this.f31209c = k0Var;
        this.f31210d = bVar;
        this.f31211e = new AtomicBoolean(false);
        this.f31212f = gl.d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079 A[Catch: all -> 0x007a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x007a, blocks: (B:34:0x0079, B:43:0x0089, B:42:0x0086, B:39:0x0081), top: B:55:0x001e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14, types: [p4.g0] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, p4.e0] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [p4.g0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [p4.n] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p4.n r7, ek.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p4.e0
            if (r0 == 0) goto L13
            r0 = r8
            p4.e0 r0 = (p4.e0) r0
            int r1 = r0.f31195f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31195f = r1
            goto L18
        L13:
            p4.e0 r0 = new p4.e0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f31193d
            int r1 = r0.f31195f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            boolean r7 = r0.f31192c
            p4.b0 r1 = r0.f31191b
            p4.g0 r0 = r0.f31190a
            ci.b.D(r8)     // Catch: java.lang.Throwable -> L2c
            goto L69
        L2c:
            r8 = move-exception
            goto L81
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            ci.b.D(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r6.f31211e
            boolean r8 = r8.get()
            if (r8 != 0) goto L97
            gl.c r8 = r6.f31212f
            boolean r8 = r8.f()
            p4.b0 r1 = new p4.b0     // Catch: java.lang.Throwable -> L8a
            java.io.File r4 = r6.f31207a     // Catch: java.lang.Throwable -> L8a
            p4.w0 r5 = r6.f31208b     // Catch: java.lang.Throwable -> L8a
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L8a
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L7c
            r0.f31190a = r6     // Catch: java.lang.Throwable -> L7c
            r0.f31191b = r1     // Catch: java.lang.Throwable -> L7c
            r0.f31192c = r8     // Catch: java.lang.Throwable -> L7c
            r0.f31195f = r2     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r7 = r7.a(r1, r4, r0)     // Catch: java.lang.Throwable -> L7c
            dk.a r0 = dk.a.f22275a
            if (r7 != r0) goto L65
            return r0
        L65:
            r0 = r8
            r8 = r7
            r7 = r0
            r0 = r6
        L69:
            r1.close()     // Catch: java.lang.Throwable -> L6e
            r1 = r3
            goto L6f
        L6e:
            r1 = move-exception
        L6f:
            if (r1 != 0) goto L79
            if (r7 == 0) goto L78
            gl.c r7 = r0.f31212f
            r7.e(r3)
        L78:
            return r8
        L79:
            throw r1     // Catch: java.lang.Throwable -> L7a
        L7a:
            r8 = move-exception
            goto L8f
        L7c:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r0
            r0 = r6
        L81:
            r1.close()     // Catch: java.lang.Throwable -> L85
            goto L89
        L85:
            r1 = move-exception
            wd.b.a(r8, r1)     // Catch: java.lang.Throwable -> L7a
        L89:
            throw r8     // Catch: java.lang.Throwable -> L7a
        L8a:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r0
            r0 = r6
        L8f:
            if (r7 == 0) goto L96
            gl.c r7 = r0.f31212f
            r7.e(r3)
        L96:
            throw r8
        L97:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "StorageConnection has already been disposed."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.g0.a(p4.n, ek.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0 A[Catch: all -> 0x011b, IOException -> 0x011e, TRY_ENTER, TryCatch #8 {IOException -> 0x011e, all -> 0x011b, blocks: (B:43:0x00e0, B:45:0x00e6, B:47:0x00ee, B:51:0x00fa, B:52:0x011a, B:48:0x00f3, B:59:0x0127, B:66:0x0134, B:65:0x0131, B:62:0x012c), top: B:90:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127 A[Catch: all -> 0x011b, IOException -> 0x011e, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x011e, all -> 0x011b, blocks: (B:43:0x00e0, B:45:0x00e6, B:47:0x00ee, B:51:0x00fa, B:52:0x011a, B:48:0x00f3, B:59:0x0127, B:66:0x0134, B:65:0x0131, B:62:0x012c), top: B:90:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e A[Catch: all -> 0x0135, TryCatch #2 {all -> 0x0135, blocks: (B:70:0x0138, B:72:0x013e, B:73:0x0141, B:33:0x009c, B:34:0x00b8), top: B:82:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8, types: [gl.a] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p4.y r11, ek.c r12) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.g0.b(p4.y, ek.c):java.lang.Object");
    }

    @Override // p4.a
    public final void close() {
        this.f31211e.set(true);
        this.f31210d.invoke();
    }
}
