package d4;

/* loaded from: classes.dex */
public final class i1 implements pq.g {

    /* renamed from: a, reason: collision with root package name */
    public static final i1 f6825a = new i1();

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0072 -> B:27:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.io.FileOutputStream r12, rq.c r13) throws java.io.IOException {
        /*
            boolean r0 = r13 instanceof d4.p0
            if (r0 == 0) goto L13
            r0 = r13
            d4.p0 r0 = (d4.p0) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            d4.p0 r0 = new d4.p0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f6861y
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            long r4 = r0.f6860x
            java.io.FileOutputStream r12 = r0.f6859r
            lf.t1.G(r13)
            r13 = r0
            goto L75
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            lf.t1.G(r13)
            r4 = 10
            r13 = r0
        L3a:
            r6 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
        */
        //  java.lang.String r2 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
        /*
            if (r0 > 0) goto L7a
            java.nio.channels.FileChannel r6 = r12.getChannel()     // Catch: java.io.IOException -> L58
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
            r7 = 0
            java.nio.channels.FileLock r0 = r6.lock(r7, r9, r11)     // Catch: java.io.IOException -> L58
            br.l.d(r0, r2)     // Catch: java.io.IOException -> L58
            r1 = r0
            goto L8d
        L58:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            if (r2 == 0) goto L79
            java.lang.String r6 = "Resource deadlock would occur"
            r7 = 0
            boolean r2 = tt.l.q0(r2, r6, r7)
            if (r2 != r3) goto L79
            r13.f6859r = r12
            r13.f6860x = r4
            r13.B = r3
            java.lang.Object r0 = wt.w.h(r4, r13)
            if (r0 != r1) goto L75
            goto L8d
        L75:
            r0 = 2
            long r6 = (long) r0
            long r4 = r4 * r6
            goto L3a
        L79:
            throw r0
        L7a:
            java.nio.channels.FileChannel r6 = r12.getChannel()
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
            r7 = 0
            java.nio.channels.FileLock r1 = r6.lock(r7, r9, r11)
            br.l.d(r1, r2)
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.i1.a(java.io.FileOutputStream, rq.c):java.lang.Object");
    }
}
