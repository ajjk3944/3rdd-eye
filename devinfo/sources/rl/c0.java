package rl;

import java.io.Closeable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class c0 implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f33050b;

    /* renamed from: a, reason: collision with root package name */
    public a0 f33051a;

    static {
        hm.h hVar = hm.h.f25175d;
        nk.k.e(hVar, "<this>");
        hm.e eVar = new hm.e();
        eVar.y(hVar);
        f33050b = new b0(null, hVar.f25176a.length, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.nio.charset.Charset c() {
        /*
            r6 = this;
            rl.p r0 = r6.g()
            if (r0 == 0) goto L34
            vk.h r1 = rl.p.f33121d
            java.lang.String[] r0 = r0.f33125c
            int r1 = r0.length
            int r1 = r1 + (-1)
            r2 = 2
            r3 = 0
            int r1 = com.bumptech.glide.e.E(r3, r1, r2)
            r2 = 0
            if (r1 < 0) goto L2a
        L16:
            r4 = r0[r3]
            java.lang.String r5 = "charset"
            boolean r4 = vk.p.q0(r4, r5)
            if (r4 == 0) goto L25
            int r3 = r3 + 1
            r0 = r0[r3]
            goto L2b
        L25:
            if (r3 == r1) goto L2a
            int r3 = r3 + 2
            goto L16
        L2a:
            r0 = r2
        L2b:
            if (r0 != 0) goto L2e
            goto L32
        L2e:
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> L32
        L32:
            if (r2 != 0) goto L36
        L34:
            java.nio.charset.Charset r2 = vk.a.f36267a
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rl.c0.c():java.nio.charset.Charset");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        sl.f.b(m());
    }

    public abstract long e();

    public abstract p g();

    public abstract hm.g m();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final String p() {
        hm.g gVarM = m();
        String th2 = null;
        try {
            String string = gVarM.readString(sl.h.f(gVarM, c()));
            try {
                gVarM.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            th = th2;
            th2 = string;
        } catch (Throwable th4) {
            th = th4;
            if (gVarM != null) {
                try {
                    gVarM.close();
                } catch (Throwable th5) {
                    wd.b.a(th, th5);
                }
            }
        }
        if (th == 0) {
            return th2;
        }
        throw th;
    }
}
