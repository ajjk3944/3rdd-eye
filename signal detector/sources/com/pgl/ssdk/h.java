package com.pgl.ssdk;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.pgl.ssdk.d;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f19659a = "0123456789abcdef".toCharArray();

    public static i a(q qVar, t tVar, int i) throws j {
        try {
            d.a aVarA = d.a(qVar, tVar);
            long jB = aVarA.b();
            q qVarA = aVarA.a();
            ByteBuffer byteBufferA = qVarA.a(0L, (int) qVarA.a());
            byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
            return new i(a(byteBufferA, i), jB, tVar.a(), tVar.e(), tVar.d());
        } catch (b e6) {
            throw new j(e6.getMessage(), e6);
        }
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("size: ".concat(String.valueOf(i)));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i3 = i + iPosition;
        if (i3 < iPosition || i3 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i3);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i3);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static byte[] c(ByteBuffer byteBuffer) throws a {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new a("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbP = AbstractC1135f5.p(i, "Underflow while reading length-prefixed value. Length: ", ", available: ");
        sbP.append(byteBuffer.remaining());
        throw new a(sbP.toString());
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) throws a {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i >= 0) {
                if (i <= byteBuffer.remaining()) {
                    return b(byteBuffer, i);
                }
                StringBuilder sbP = AbstractC1135f5.p(i, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
                sbP.append(byteBuffer.remaining());
                throw new a(sbP.toString());
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int i) throws j {
        a(byteBuffer);
        ByteBuffer byteBufferA = a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i3 = 0;
        while (byteBufferA.hasRemaining()) {
            i3++;
            if (byteBufferA.remaining() >= 8) {
                long j6 = byteBufferA.getLong();
                if (j6 >= 4 && j6 <= 2147483647L) {
                    int i6 = (int) j6;
                    int iPosition = byteBufferA.position() + i6;
                    if (i6 <= byteBufferA.remaining()) {
                        if (byteBufferA.getInt() == i) {
                            return b(byteBufferA, i6 - 4);
                        }
                        byteBufferA.position(iPosition);
                    } else {
                        throw new j("APK Signing Block entry #" + i3 + " size out of range: " + i6 + ", available: " + byteBufferA.remaining());
                    }
                } else {
                    throw new j("APK Signing Block entry #" + i3 + " size out of range: " + j6);
                }
            } else {
                throw new j("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i3)));
            }
        }
        throw new j("No APK Signature Scheme block in APK Signing Block with ID: ".concat(String.valueOf(i)));
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i, int i3) {
        if (i < 0) {
            throw new IllegalArgumentException("start: ".concat(String.valueOf(i)));
        }
        if (i3 >= i) {
            int iCapacity = byteBuffer.capacity();
            if (i3 <= byteBuffer.capacity()) {
                int iLimit = byteBuffer.limit();
                int iPosition = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i3);
                    byteBuffer.position(i);
                    ByteBuffer byteBufferSlice = byteBuffer.slice();
                    byteBufferSlice.order(byteBuffer.order());
                    return byteBufferSlice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(iLimit);
                    byteBuffer.position(iPosition);
                }
            }
            throw new IllegalArgumentException(A.f.g(i3, iCapacity, "end > capacity: ", " > "));
        }
        throw new IllegalArgumentException(A.f.g(i3, i, "end < start: ", " < "));
    }
}
