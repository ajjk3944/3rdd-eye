package com.pgl.ssdk;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class p {
    public static o<ByteBuffer, Long> a(q qVar) throws IOException {
        if (qVar.a() < 22) {
            return null;
        }
        o<ByteBuffer, Long> oVarA = a(qVar, 0);
        return oVarA != null ? oVarA : a(qVar, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    }

    private static int b(ByteBuffer byteBuffer) {
        a(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        if (iCapacity < 22) {
            return -1;
        }
        int i4 = iCapacity - 22;
        int iMin = Math.min(i4, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        for (int i10 = 0; i10 <= iMin; i10++) {
            int i11 = i4 - i10;
            if (byteBuffer.getInt(i11) == 101010256 && a(byteBuffer, i11 + 20) == i10) {
                return i11;
            }
        }
        return -1;
    }

    public static long c(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return b(byteBuffer, byteBuffer.position() + 16);
    }

    public static long d(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return b(byteBuffer, byteBuffer.position() + 12);
    }

    public static int e(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return a(byteBuffer, byteBuffer.position() + 10);
    }

    private static o<ByteBuffer, Long> a(q qVar, int i4) throws IOException {
        if (i4 >= 0 && i4 <= 65535) {
            long jA = qVar.a();
            if (jA < 22) {
                return null;
            }
            int iMin = ((int) Math.min(i4, jA - 22)) + 22;
            long j = jA - iMin;
            ByteBuffer byteBufferA = qVar.a(j, iMin);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferA.order(byteOrder);
            int iB = b(byteBufferA);
            if (iB == -1) {
                return null;
            }
            byteBufferA.position(iB);
            ByteBuffer byteBufferSlice = byteBufferA.slice();
            byteBufferSlice.order(byteOrder);
            return o.a(byteBufferSlice, Long.valueOf(j + iB));
        }
        throw new IllegalArgumentException("maxCommentSize: ".concat(String.valueOf(i4)));
    }

    public static long b(ByteBuffer byteBuffer, int i4) {
        return byteBuffer.getInt(i4) & 4294967295L;
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static int a(ByteBuffer byteBuffer, int i4) {
        return byteBuffer.getShort(i4) & 65535;
    }
}
