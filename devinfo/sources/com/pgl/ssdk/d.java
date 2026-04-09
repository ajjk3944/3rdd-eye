package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class d {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f21524a;

        /* renamed from: b, reason: collision with root package name */
        private final q f21525b;

        public a(long j, q qVar) {
            this.f21524a = j;
            this.f21525b = qVar;
        }

        public q a() {
            return this.f21525b;
        }

        public long b() {
            return this.f21524a;
        }
    }

    public static t a(q qVar) throws IOException, s {
        o<ByteBuffer, Long> oVarA = p.a(qVar);
        if (oVarA == null) {
            throw new s("ZIP End of Central Directory record not found");
        }
        ByteBuffer byteBufferA = oVarA.a();
        long jLongValue = oVarA.b().longValue();
        byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
        long jC = p.c(byteBufferA);
        if (jC > jLongValue) {
            StringBuilder sbY = d.h.y(jC, "ZIP Central Directory start offset out of range: ", ". ZIP End of Central Directory offset: ");
            sbY.append(jLongValue);
            throw new s(sbY.toString());
        }
        long jD = p.d(byteBufferA);
        long j = jC + jD;
        if (j <= jLongValue) {
            return new t(jC, jD, p.e(byteBufferA), jLongValue, byteBufferA);
        }
        StringBuilder sbY2 = d.h.y(j, "ZIP Central Directory overlaps with End of Central Directory. CD end: ", ", EoCD start: ");
        sbY2.append(jLongValue);
        throw new s(sbY2.toString());
    }

    public static a a(q qVar, t tVar) throws b, IOException {
        long jA = tVar.a();
        long jC = tVar.c() + jA;
        long jE = tVar.e();
        if (jC != jE) {
            StringBuilder sbY = d.h.y(jC, "ZIP Central Directory is not immediately followed by End of Central Directory. CD end: ", ", EoCD start: ");
            sbY.append(jE);
            throw new b(sbY.toString());
        }
        if (jA >= 32) {
            ByteBuffer byteBufferA = qVar.a(jA - 24, 24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferA.order(byteOrder);
            if (byteBufferA.getLong(8) == 2334950737559900225L && byteBufferA.getLong(16) == 3617552046287187010L) {
                long j = byteBufferA.getLong(0);
                if (j < byteBufferA.capacity() || j > 2147483639) {
                    throw new b("APK Signing Block size out of range: ".concat(String.valueOf(j)));
                }
                long j8 = (int) (8 + j);
                long j9 = jA - j8;
                if (j9 >= 0) {
                    ByteBuffer byteBufferA2 = qVar.a(j9, 8);
                    byteBufferA2.order(byteOrder);
                    long j10 = byteBufferA2.getLong(0);
                    if (j10 == j) {
                        return new a(j9, qVar.a(j9, j8));
                    }
                    StringBuilder sbY2 = d.h.y(j10, "APK Signing Block sizes in header and footer do not match: ", " vs ");
                    sbY2.append(j);
                    throw new b(sbY2.toString());
                }
                throw new b("APK Signing Block offset out of range: ".concat(String.valueOf(j9)));
            }
            throw new b("No APK Signing Block before ZIP Central Directory");
        }
        throw new b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(jA)));
    }
}
