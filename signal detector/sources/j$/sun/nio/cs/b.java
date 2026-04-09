package j$.sun.nio.cs;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* loaded from: classes2.dex */
public final class b extends CharsetEncoder {

    /* renamed from: a, reason: collision with root package name */
    public final e f20639a;

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c6) {
        return c6 <= 255;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        return true;
    }

    public b(c cVar) {
        super(cVar, 1.0f, 1.0f);
        e eVar = new e();
        eVar.f20642a = CoderResult.UNDERFLOW;
        this.f20639a = eVar;
    }

    public static int a(char[] cArr, int i, byte[] bArr, int i3, int i6) {
        int i7 = 0;
        if (i6 <= 0) {
            return 0;
        }
        Objects.requireNonNull(cArr);
        Objects.requireNonNull(bArr);
        if (i < 0 || i >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        if (i3 < 0 || i3 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i3);
        }
        int i8 = (i + i6) - 1;
        if (i8 < 0 || i8 >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i8);
        }
        int i9 = (i3 + i6) - 1;
        if (i9 < 0 || i9 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i9);
        }
        while (i7 < i6) {
            int i10 = i + 1;
            char c6 = cArr[i];
            if (c6 > 255) {
                break;
            }
            bArr[i3] = (byte) c6;
            i7++;
            i = i10;
            i3++;
        }
        return i7;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        CoderResult coderResultUnmappableForLength;
        CoderResult coderResultUnmappableForLength2;
        int i = 2;
        if (!charBuffer.hasArray() || !byteBuffer.hasArray()) {
            int iPosition = charBuffer.position();
            while (true) {
                try {
                    if (!charBuffer.hasRemaining()) {
                        coderResultUnmappableForLength = CoderResult.UNDERFLOW;
                        break;
                    }
                    char c6 = charBuffer.get();
                    if (c6 <= 255) {
                        if (!byteBuffer.hasRemaining()) {
                            coderResultUnmappableForLength = CoderResult.OVERFLOW;
                            break;
                        }
                        byteBuffer.put((byte) c6);
                        iPosition++;
                    } else if (this.f20639a.a(c6, charBuffer) < 0) {
                        coderResultUnmappableForLength = this.f20639a.f20642a;
                    } else {
                        if (!this.f20639a.f20643b) {
                            i = 1;
                        }
                        coderResultUnmappableForLength = CoderResult.unmappableForLength(i);
                    }
                } finally {
                }
            }
            return coderResultUnmappableForLength;
        }
        char[] cArrArray = charBuffer.array();
        int iArrayOffset = charBuffer.arrayOffset();
        int iPosition2 = charBuffer.position() + iArrayOffset;
        int iLimit = charBuffer.limit() + iArrayOffset;
        if (iPosition2 > iLimit) {
            iPosition2 = iLimit;
        }
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset2 = byteBuffer.arrayOffset();
        int iPosition3 = byteBuffer.position() + iArrayOffset2;
        int iLimit2 = byteBuffer.limit() + iArrayOffset2;
        if (iPosition3 > iLimit2) {
            iPosition3 = iLimit2;
        }
        int i3 = iLimit2 - iPosition3;
        int i6 = iLimit - iPosition2;
        if (i3 >= i6) {
            i3 = i6;
        }
        try {
            int iA = a(cArrArray, iPosition2, bArrArray, iPosition3, i3);
            int i7 = iPosition2 + iA;
            int i8 = iPosition3 + iA;
            if (iA == i3) {
                coderResultUnmappableForLength2 = i3 < i6 ? CoderResult.OVERFLOW : CoderResult.UNDERFLOW;
            } else if (this.f20639a.b(cArrArray[i7], cArrArray, i7, iLimit) < 0) {
                coderResultUnmappableForLength2 = this.f20639a.f20642a;
            } else {
                if (!this.f20639a.f20643b) {
                    i = 1;
                }
                coderResultUnmappableForLength2 = CoderResult.unmappableForLength(i);
            }
            return coderResultUnmappableForLength2;
        } catch (Throwable th) {
            throw th;
        }
    }
}
