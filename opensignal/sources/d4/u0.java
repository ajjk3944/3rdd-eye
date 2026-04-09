package d4;

import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class u0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final pq.h f6886a;

    /* renamed from: b, reason: collision with root package name */
    public final File f6887b;

    /* renamed from: c, reason: collision with root package name */
    public final zt.b f6888c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6889d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6890e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6891f;

    /* renamed from: g, reason: collision with root package name */
    public final eu.d f6892g;

    /* renamed from: h, reason: collision with root package name */
    public final lq.q f6893h;

    /* renamed from: i, reason: collision with root package name */
    public final lq.q f6894i;

    public u0(pq.h hVar, File file) {
        br.l.e(hVar, "context");
        br.l.e(file, "file");
        this.f6886a = hVar;
        this.f6887b = file;
        Object obj = w0.f6902b;
        this.f6888c = new zt.b(new au.e(file, (pq.c) null, 4), pq.i.f20621a, -2, yt.a.SUSPEND);
        this.f6889d = ".lock";
        this.f6890e = ".version";
        this.f6891f = "fcntl failed: EAGAIN";
        this.f6892g = eu.e.a();
        this.f6893h = kc.f.F(new r0(this, 1));
        this.f6894i = kc.f.F(new r0(this, 0));
    }

    public static final void f(u0 u0Var, File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    @Override // d4.n0
    public final Object a(b0 b0Var) {
        lq.q qVar = this.f6894i;
        if (qVar.a()) {
            return new Integer(a1.f6765b.nativeIncrementAndGetCounterValue(((a1) qVar.getValue()).f6766a));
        }
        return wt.w.B(this.f6886a, new q0(this, null, 1), b0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2 A[Catch: all -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00e6, blocks: (B:60:0x00e2, B:72:0x00fd, B:73:0x0100), top: B:90:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fd A[Catch: all -> 0x00e6, TRY_ENTER, TryCatch #3 {all -> 0x00e6, blocks: (B:60:0x00e2, B:72:0x00fd, B:73:0x0100), top: B:90:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010c  */
    /* JADX WARN: Type inference failed for: r2v0, types: [ar.n] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [d4.t0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [eu.d] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // d4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ar.n r19, rq.c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.u0.b(ar.n, rq.c):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf A[Catch: all -> 0x00c3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00c3, blocks: (B:42:0x00bf, B:56:0x00e0, B:57:0x00e3), top: B:67:0x0022, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0 A[Catch: all -> 0x00c3, TRY_ENTER, TryCatch #1 {all -> 0x00c3, blocks: (B:42:0x00bf, B:56:0x00e0, B:57:0x00e3), top: B:67:0x0022, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object, qq.a] */
    @Override // d4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(ar.k r9, rq.c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.u0.c(ar.k, rq.c):java.lang.Object");
    }

    @Override // d4.n0
    public final Object d(rq.c cVar) {
        lq.q qVar = this.f6894i;
        if (qVar.a()) {
            return new Integer(a1.f6765b.nativeGetCounterValue(((a1) qVar.getValue()).f6766a));
        }
        return wt.w.B(this.f6886a, new q0(this, null, 0), cVar);
    }

    @Override // d4.n0
    public final zt.f e() {
        return this.f6888c;
    }
}
