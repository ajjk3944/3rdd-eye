package d4;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class e0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final File f6796a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f6797b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f6798c;

    public e0(File file, z0 z0Var) {
        br.l.e(z0Var, "serializer");
        this.f6796a = file;
        this.f6797b = z0Var;
        this.f6798c = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a0, code lost:
    
        if (r8 == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [d4.e0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [d4.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [d4.e0] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(d4.e0 r7, rq.c r8) throws java.io.IOException {
        /*
            boolean r0 = r8 instanceof d4.d0
            if (r0 == 0) goto L13
            r0 = r8
            d4.d0 r0 = (d4.d0) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            d4.d0 r0 = new d4.d0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f6792y
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.f6790r
            java.io.Closeable r7 = (java.io.Closeable) r7
            lf.t1.G(r8)     // Catch: java.lang.Throwable -> L30
            goto La3
        L30:
            r8 = move-exception
            goto La7
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            java.io.FileInputStream r7 = r0.f6791x
            java.lang.Object r2 = r0.f6790r
            d4.e0 r2 = (d4.e0) r2
            lf.t1.G(r8)     // Catch: java.lang.Throwable -> L45
            goto L70
        L45:
            r8 = move-exception
            goto L7b
        L47:
            lf.t1.G(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f6798c
            boolean r8 = r8.get()
            if (r8 != 0) goto Lb2
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L81
            java.io.File r2 = r7.f6796a     // Catch: java.io.FileNotFoundException -> L81
            r8.<init>(r2)     // Catch: java.io.FileNotFoundException -> L81
            java.io.FileInputStream r8 = xu.d.j(r2, r8)     // Catch: java.io.FileNotFoundException -> L81
            d4.z0 r2 = r7.f6797b     // Catch: java.lang.Throwable -> L76
            r0.f6790r = r7     // Catch: java.lang.Throwable -> L76
            r0.f6791x = r8     // Catch: java.lang.Throwable -> L76
            r0.D = r4     // Catch: java.lang.Throwable -> L76
            java.lang.Object r2 = r2.b(r8)     // Catch: java.lang.Throwable -> L76
            if (r2 != r1) goto L6c
            goto La2
        L6c:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L70:
            ic.a.g(r7, r5)     // Catch: java.io.FileNotFoundException -> L74
            return r8
        L74:
            r7 = r2
            goto L81
        L76:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L7b:
            throw r8     // Catch: java.lang.Throwable -> L7c
        L7c:
            r4 = move-exception
            ic.a.g(r7, r8)     // Catch: java.io.FileNotFoundException -> L74
            throw r4     // Catch: java.io.FileNotFoundException -> L74
        L81:
            java.io.File r8 = r7.f6796a
            d4.z0 r2 = r7.f6797b
            boolean r8 = r8.exists()
            if (r8 == 0) goto Lad
            java.io.FileInputStream r8 = new java.io.FileInputStream
            java.io.File r7 = r7.f6796a
            r8.<init>(r7)
            java.io.FileInputStream r7 = xu.d.j(r7, r8)
            r0.f6790r = r7     // Catch: java.lang.Throwable -> L30
            r0.f6791x = r5     // Catch: java.lang.Throwable -> L30
            r0.D = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r2.b(r7)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto La3
        La2:
            return r1
        La3:
            ic.a.g(r7, r5)
            return r8
        La7:
            throw r8     // Catch: java.lang.Throwable -> La8
        La8:
            r0 = move-exception
            ic.a.g(r7, r8)
            throw r0
        Lad:
            java.lang.Object r7 = r2.a()
            return r7
        Lb2:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "This scope has already been closed."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.e0.a(d4.e0, rq.c):java.lang.Object");
    }

    @Override // d4.a
    public final void close() {
        this.f6798c.set(true);
    }
}
