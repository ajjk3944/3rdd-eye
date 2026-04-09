package com.pgl.ssdk;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class d {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f19653a;

        /* renamed from: b, reason: collision with root package name */
        private final q f19654b;

        public a(long j6, q qVar) {
            this.f19653a = j6;
            this.f19654b = qVar;
        }

        public q a() {
            return this.f19654b;
        }

        public long b() {
            return this.f19653a;
        }
    }

    public static t a(q qVar) throws s {
        o<ByteBuffer, Long> oVarA = p.a(qVar);
        if (oVarA == null) {
            throw new s("ZIP End of Central Directory record not found");
        }
        ByteBuffer byteBufferA = oVarA.a();
        long jLongValue = oVarA.b().longValue();
        byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
        long jC = p.c(byteBufferA);
        if (jC > jLongValue) {
            throw new s("ZIP Central Directory start offset out of range: " + jC + ". ZIP End of Central Directory offset: " + jLongValue);
        }
        long jD = p.d(byteBufferA);
        long j6 = jC + jD;
        if (j6 <= jLongValue) {
            return new t(jC, jD, p.e(byteBufferA), jLongValue, byteBufferA);
        }
        throw new s("ZIP Central Directory overlaps with End of Central Directory. CD end: " + j6 + ", EoCD start: " + jLongValue);
    }

    public static a a(q qVar, t tVar) throws b {
        long jA = tVar.a();
        long jC = tVar.c() + jA;
        long jE = tVar.e();
        if (jC != jE) {
            throw new b("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: " + jC + ", EoCD start: " + jE);
        }
        if (jA >= 32) {
            ByteBuffer byteBufferA = qVar.a(jA - 24, 24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferA.order(byteOrder);
            if (byteBufferA.getLong(8) == 2334950737559900225L && byteBufferA.getLong(16) == 3617552046287187010L) {
                long j6 = byteBufferA.getLong(0);
                if (j6 < byteBufferA.capacity() || j6 > 2147483639) {
                    throw new b("APK Signing Block size out of range: ".concat(String.valueOf(j6)));
                }
                long j7 = (int) (8 + j6);
                long j8 = jA - j7;
                if (j8 >= 0) {
                    ByteBuffer byteBufferA2 = qVar.a(j8, 8);
                    byteBufferA2.order(byteOrder);
                    long j9 = byteBufferA2.getLong(0);
                    if (j9 == j6) {
                        return new a(j8, qVar.a(j8, j7));
                    }
                    throw new b("APK Signing Block sizes in header and footer do not match: " + j9 + " vs " + j6);
                }
                throw new b("APK Signing Block offset out of range: ".concat(String.valueOf(j8)));
            }
            throw new b("No APK Signing Block before ZIP Central Directory");
        }
        throw new b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(jA)));
    }
}
