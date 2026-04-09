package p4;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class b0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final File f31172a;

    /* renamed from: b, reason: collision with root package name */
    public final w0 f31173b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f31174c;

    public b0(File file, w0 w0Var) {
        nk.k.e(w0Var, "serializer");
        this.f31172a = file;
        this.f31173b = w0Var;
        this.f31174c = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [p4.b0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(p4.b0 r7, ek.c r8) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.b0.a(p4.b0, ek.c):java.lang.Object");
    }

    @Override // p4.a
    public final void close() {
        this.f31174c.set(true);
    }
}
