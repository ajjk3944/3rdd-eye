package p4;

import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final ck.h f31292a;

    /* renamed from: b, reason: collision with root package name */
    public final File f31293b;

    /* renamed from: c, reason: collision with root package name */
    public final al.d f31294c;

    /* renamed from: d, reason: collision with root package name */
    public final String f31295d;

    /* renamed from: e, reason: collision with root package name */
    public final String f31296e;

    /* renamed from: f, reason: collision with root package name */
    public final String f31297f;
    public final gl.c g;

    /* renamed from: h, reason: collision with root package name */
    public final yj.n f31298h;

    /* renamed from: i, reason: collision with root package name */
    public final yj.n f31299i;

    public r0(ck.h hVar, File file) {
        nk.k.e(hVar, "context");
        nk.k.e(file, "file");
        this.f31292a = hVar;
        this.f31293b = file;
        Object obj = t0.f31314b;
        this.f31294c = new al.d(new bh.t(file, (ck.c) null, 21), ck.i.f2898a, -2, zk.a.f38322a);
        this.f31295d = ".lock";
        this.f31296e = ".version";
        this.f31297f = "fcntl failed: EAGAIN";
        this.g = gl.d.a();
        this.f31298h = a.a.u(new o0(this, 2));
        this.f31299i = a.a.u(new o0(this, 1));
    }

    public static final void f(r0 r0Var, File file) {
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

    @Override // p4.k0
    public final Object a(y yVar) {
        yj.n nVar = this.f31299i;
        if (nVar.a()) {
            return new Integer(x0.f31345b.nativeIncrementAndGetCounterValue(((x0) nVar.getValue()).f31346a));
        }
        return xk.x.E(this.f31292a, new n0(this, null, 1), yVar);
    }

    @Override // p4.k0
    public final Object b(ek.c cVar) {
        yj.n nVar = this.f31299i;
        if (nVar.a()) {
            return new Integer(x0.f31345b.nativeGetCounterValue(((x0) nVar.getValue()).f31346a));
        }
        return xk.x.E(this.f31292a, new n0(this, null, 0), cVar);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba A[Catch: all -> 0x00be, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00be, blocks: (B:42:0x00ba, B:56:0x00d7, B:57:0x00da), top: B:78:0x0022, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7 A[Catch: all -> 0x00be, TRY_ENTER, TryCatch #7 {all -> 0x00be, blocks: (B:42:0x00ba, B:56:0x00d7, B:57:0x00da), top: B:78:0x0022, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [gl.a] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    @Override // p4.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(mk.c r9, ek.c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.r0.c(mk.c, ek.c):java.lang.Object");
    }

    @Override // p4.k0
    public final al.h d() {
        return this.f31294c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de A[Catch: all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e2, blocks: (B:60:0x00de, B:72:0x00f9, B:73:0x00fc), top: B:85:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9 A[Catch: all -> 0x00e2, TRY_ENTER, TryCatch #1 {all -> 0x00e2, blocks: (B:60:0x00de, B:72:0x00f9, B:73:0x00fc), top: B:85:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0108  */
    /* JADX WARN: Type inference failed for: r2v0, types: [mk.e] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, p4.q0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [gl.a] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // p4.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(mk.e r19, ek.c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.r0.e(mk.e, ek.c):java.lang.Object");
    }
}
