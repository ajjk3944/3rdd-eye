package p4;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d1 implements ck.g {

    /* renamed from: a, reason: collision with root package name */
    public static final d1 f31185a = new d1();

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0071 -> B:27:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.io.FileOutputStream r11, ek.c r12) throws java.io.IOException {
        /*
            boolean r0 = r12 instanceof p4.m0
            if (r0 == 0) goto L13
            r0 = r12
            p4.m0 r0 = (p4.m0) r0
            int r1 = r0.f31253d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31253d = r1
            goto L18
        L13:
            p4.m0 r0 = new p4.m0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f31252c
            int r1 = r0.f31253d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            long r3 = r0.f31251b
            java.io.FileOutputStream r11 = r0.f31250a
            ci.b.D(r12)
            r12 = r0
            goto L75
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            ci.b.D(r12)
            r3 = 10
            r12 = r0
        L38:
            r0 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
        */
        //  java.lang.String r1 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
        /*
            if (r0 > 0) goto L7a
            java.nio.channels.FileChannel r5 = r11.getChannel()     // Catch: java.io.IOException -> L55
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)     // Catch: java.io.IOException -> L55
            nk.k.d(r0, r1)     // Catch: java.io.IOException -> L55
            goto L8d
        L55:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L79
            java.lang.String r5 = "Resource deadlock would occur"
            r6 = 0
            boolean r1 = vk.i.y0(r1, r5, r6)
            if (r1 != r2) goto L79
            r12.f31250a = r11
            r12.f31251b = r3
            r12.f31253d = r2
            java.lang.Object r0 = xk.x.i(r3, r12)
            dk.a r1 = dk.a.f22275a
            if (r0 != r1) goto L75
            r0 = r1
            goto L8d
        L75:
            r0 = 2
            long r0 = (long) r0
            long r3 = r3 * r0
            goto L38
        L79:
            throw r0
        L7a:
            java.nio.channels.FileChannel r5 = r11.getChannel()
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)
            nk.k.d(r0, r1)
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.d1.a(java.io.FileOutputStream, ek.c):java.lang.Object");
    }
}
