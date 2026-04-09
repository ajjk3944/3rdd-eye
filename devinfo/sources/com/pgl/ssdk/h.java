package com.pgl.ssdk;

import com.pgl.ssdk.d;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f21530a = "0123456789abcdef".toCharArray();

    public static i a(q qVar, t tVar, int i4) throws j, IOException {
        try {
            d.a aVarA = d.a(qVar, tVar);
            long jB = aVarA.b();
            q qVarA = aVarA.a();
            ByteBuffer byteBufferA = qVarA.a(0L, (int) qVarA.a());
            byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
            return new i(a(byteBufferA, i4), jB, tVar.a(), tVar.e(), tVar.d());
        } catch (b e2) {
            throw new j(e2.getMessage(), e2);
        }
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("size: ".concat(String.valueOf(i4)));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i10 = i4 + iPosition;
        if (i10 < iPosition || i10 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i10);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i10);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static byte[] c(ByteBuffer byteBuffer) throws a {
        int i4 = byteBuffer.getInt();
        if (i4 < 0) {
            throw new a("Negative length");
        }
        if (i4 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i4];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbW = je.u.w(i4, "Underflow while reading length-prefixed value. Length: ", ", available: ");
        sbW.append(byteBuffer.remaining());
        throw new a(sbW.toString());
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) throws a {
        if (byteBuffer.remaining() >= 4) {
            int i4 = byteBuffer.getInt();
            if (i4 >= 0) {
                if (i4 <= byteBuffer.remaining()) {
                    return b(byteBuffer, i4);
                }
                StringBuilder sbW = je.u.w(i4, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
                sbW.append(byteBuffer.remaining());
                throw new a(sbW.toString());
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int i4) throws j {
        a(byteBuffer);
        ByteBuffer byteBufferA = a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i10 = 0;
        while (byteBufferA.hasRemaining()) {
            i10++;
            if (byteBufferA.remaining() >= 8) {
                long j = byteBufferA.getLong();
                if (j >= 4 && j <= 2147483647L) {
                    int i11 = (int) j;
                    int iPosition = byteBufferA.position() + i11;
                    if (i11 <= byteBufferA.remaining()) {
                        if (byteBufferA.getInt() == i4) {
                            return b(byteBufferA, i11 - 4);
                        }
                        byteBufferA.position(iPosition);
                    } else {
                        StringBuilder sbN = r5.c.n(i10, "APK Signing Block entry #", " size out of range: ", i11, ", available: ");
                        sbN.append(byteBufferA.remaining());
                        throw new j(sbN.toString());
                    }
                } else {
                    throw new j("APK Signing Block entry #" + i10 + " size out of range: " + j);
                }
            } else {
                throw new j("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i10)));
            }
        }
        throw new j("No APK Signature Scheme block in APK Signing Block with ID: ".concat(String.valueOf(i4)));
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i4, int i10) {
        if (i4 < 0) {
            throw new IllegalArgumentException("start: ".concat(String.valueOf(i4)));
        }
        if (i10 >= i4) {
            int iCapacity = byteBuffer.capacity();
            if (i10 <= byteBuffer.capacity()) {
                int iLimit = byteBuffer.limit();
                int iPosition = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i10);
                    byteBuffer.position(i4);
                    ByteBuffer byteBufferSlice = byteBuffer.slice();
                    byteBufferSlice.order(byteBuffer.order());
                    return byteBufferSlice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(iLimit);
                    byteBuffer.position(iPosition);
                }
            }
            throw new IllegalArgumentException(a0.g.i(i10, iCapacity, "end > capacity: ", " > "));
        }
        throw new IllegalArgumentException(a0.g.i(i10, i4, "end < start: ", " < "));
    }
}
