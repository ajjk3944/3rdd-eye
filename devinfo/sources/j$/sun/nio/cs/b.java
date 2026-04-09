package j$.sun.nio.cs;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* loaded from: classes2.dex */
public final class b extends CharsetEncoder {

    /* renamed from: a, reason: collision with root package name */
    public final e f26029a;

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c9) {
        return c9 <= 255;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        return true;
    }

    public b(c cVar) {
        super(cVar, 1.0f, 1.0f);
        e eVar = new e();
        eVar.f26032a = CoderResult.UNDERFLOW;
        this.f26029a = eVar;
    }

    public static int a(char[] cArr, int i4, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        if (i11 <= 0) {
            return 0;
        }
        Objects.requireNonNull(cArr);
        Objects.requireNonNull(bArr);
        if (i4 < 0 || i4 >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i4);
        }
        if (i10 < 0 || i10 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i10);
        }
        int i13 = (i4 + i11) - 1;
        if (i13 < 0 || i13 >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i13);
        }
        int i14 = (i10 + i11) - 1;
        if (i14 < 0 || i14 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i14);
        }
        while (i12 < i11) {
            int i15 = i4 + 1;
            char c9 = cArr[i4];
            if (c9 > 255) {
                break;
            }
            bArr[i10] = (byte) c9;
            i12++;
            i4 = i15;
            i10++;
        }
        return i12;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        CoderResult coderResultUnmappableForLength;
        CoderResult coderResultUnmappableForLength2;
        int i4 = 2;
        if (!charBuffer.hasArray() || !byteBuffer.hasArray()) {
            int iPosition = charBuffer.position();
            while (true) {
                try {
                    if (!charBuffer.hasRemaining()) {
                        coderResultUnmappableForLength = CoderResult.UNDERFLOW;
                        break;
                    }
                    char c9 = charBuffer.get();
                    if (c9 <= 255) {
                        if (!byteBuffer.hasRemaining()) {
                            coderResultUnmappableForLength = CoderResult.OVERFLOW;
                            break;
                        }
                        byteBuffer.put((byte) c9);
                        iPosition++;
                    } else if (this.f26029a.a(c9, charBuffer) < 0) {
                        coderResultUnmappableForLength = this.f26029a.f26032a;
                    } else {
                        if (!this.f26029a.f26033b) {
                            i4 = 1;
                        }
                        coderResultUnmappableForLength = CoderResult.unmappableForLength(i4);
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
        int i10 = iLimit2 - iPosition3;
        int i11 = iLimit - iPosition2;
        if (i10 >= i11) {
            i10 = i11;
        }
        try {
            int iA = a(cArrArray, iPosition2, bArrArray, iPosition3, i10);
            int i12 = iPosition2 + iA;
            int i13 = iPosition3 + iA;
            if (iA == i10) {
                coderResultUnmappableForLength2 = i10 < i11 ? CoderResult.OVERFLOW : CoderResult.UNDERFLOW;
            } else if (this.f26029a.b(cArrArray[i12], cArrArray, i12, iLimit) < 0) {
                coderResultUnmappableForLength2 = this.f26029a.f26032a;
            } else {
                if (!this.f26029a.f26033b) {
                    i4 = 1;
                }
                coderResultUnmappableForLength2 = CoderResult.unmappableForLength(i4);
            }
            return coderResultUnmappableForLength2;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
