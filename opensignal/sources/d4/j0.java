package d4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class j0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final File f6830a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f6831b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f6832c;

    /* renamed from: d, reason: collision with root package name */
    public final as.x f6833d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f6834e;

    /* renamed from: f, reason: collision with root package name */
    public final eu.d f6835f;

    public j0(File file, z0 z0Var, n0 n0Var, as.x xVar) {
        br.l.e(z0Var, "serializer");
        br.l.e(n0Var, "coordinator");
        this.f6830a = file;
        this.f6831b = z0Var;
        this.f6832c = n0Var;
        this.f6833d = xVar;
        this.f6834e = new AtomicBoolean(false);
        this.f6835f = eu.e.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:33:0x007a, B:42:0x008b, B:41:0x0088, B:38:0x0083), top: B:52:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [d4.j0] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [d4.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [d4.j0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [d4.o] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(d4.o r8, rq.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof d4.h0
            if (r0 == 0) goto L13
            r0 = r9
            d4.h0 r0 = (d4.h0) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.E = r1
            goto L18
        L13:
            d4.h0 r0 = new d4.h0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.B
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.E
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r8 = r0.f6817y
            d4.e0 r1 = r0.f6816x
            d4.j0 r0 = r0.f6815r
            lf.t1.G(r9)     // Catch: java.lang.Throwable -> L2e
            goto L6a
        L2e:
            r9 = move-exception
            goto L83
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            lf.t1.G(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.f6834e
            boolean r9 = r9.get()
            if (r9 != 0) goto L99
            eu.d r9 = r7.f6835f
            boolean r9 = r9.e()
            d4.e0 r2 = new d4.e0     // Catch: java.lang.Throwable -> L8c
            java.io.File r5 = r7.f6830a     // Catch: java.lang.Throwable -> L8c
            d4.z0 r6 = r7.f6831b     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L7d
            r0.f6815r = r7     // Catch: java.lang.Throwable -> L7d
            r0.f6816x = r2     // Catch: java.lang.Throwable -> L7d
            r0.f6817y = r9     // Catch: java.lang.Throwable -> L7d
            r0.E = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r8 = r8.h(r2, r5, r0)     // Catch: java.lang.Throwable -> L7d
            if (r8 != r1) goto L65
            return r1
        L65:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L6a:
            r1.close()     // Catch: java.lang.Throwable -> L6f
            r1 = r4
            goto L70
        L6f:
            r1 = move-exception
        L70:
            if (r1 != 0) goto L7a
            if (r8 == 0) goto L79
            eu.d r8 = r0.f6835f
            r8.f(r4)
        L79:
            return r9
        L7a:
            throw r1     // Catch: java.lang.Throwable -> L7b
        L7b:
            r9 = move-exception
            goto L91
        L7d:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L83:
            r1.close()     // Catch: java.lang.Throwable -> L87
            goto L8b
        L87:
            r1 = move-exception
            ir.f0.c(r9, r1)     // Catch: java.lang.Throwable -> L7b
        L8b:
            throw r9     // Catch: java.lang.Throwable -> L7b
        L8c:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
        L91:
            if (r8 == 0) goto L98
            eu.d r8 = r0.f6835f
            r8.f(r4)
        L98:
            throw r9
        L99:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "StorageConnection has already been disposed."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.j0.a(d4.o, rq.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2 A[Catch: all -> 0x011d, IOException -> 0x011f, TRY_ENTER, TryCatch #2 {IOException -> 0x011f, blocks: (B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:51:0x00fc, B:52:0x011c, B:48:0x00f5, B:59:0x012a, B:66:0x0137, B:65:0x0134), top: B:80:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a A[Catch: all -> 0x011d, IOException -> 0x011f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x011f, blocks: (B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:51:0x00fc, B:52:0x011c, B:48:0x00f5, B:59:0x012a, B:66:0x0137, B:65:0x0134), top: B:80:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(d4.b0 r12, rq.c r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.j0.b(d4.b0, rq.c):java.lang.Object");
    }

    @Override // d4.a
    public final void close() throws IOException {
        this.f6834e.set(true);
        this.f6833d.c();
    }
}
