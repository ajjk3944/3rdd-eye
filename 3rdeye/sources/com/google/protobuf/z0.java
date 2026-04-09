package com.google.protobuf;

import N7.H7;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: Utf8.java */
/* loaded from: classes2.dex */
public final class z0 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final b processor;

    /* compiled from: Utf8.java */
    public static class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i) throws C {
            if (!isNotTrailingByte(b11)) {
                if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !isNotTrailingByte(b12) && !isNotTrailingByte(b13)) {
                    int iTrailingByteValue = ((b10 & 7) << 18) | (trailingByteValue(b11) << 12) | (trailingByteValue(b12) << 6) | trailingByteValue(b13);
                    cArr[i] = highSurrogate(iTrailingByteValue);
                    cArr[i + 1] = lowSurrogate(iTrailingByteValue);
                    return;
                }
            }
            throw C.invalidUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b10, char[] cArr, int i) {
            cArr[i] = (char) b10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b10, byte b11, byte b12, char[] cArr, int i) throws C {
            if (isNotTrailingByte(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || isNotTrailingByte(b12)))) {
                throw C.invalidUtf8();
            }
            cArr[i] = (char) (((b10 & 15) << 12) | (trailingByteValue(b11) << 6) | trailingByteValue(b12));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b10, byte b11, char[] cArr, int i) throws C {
            if (b10 < -62 || isNotTrailingByte(b11)) {
                throw C.invalidUtf8();
            }
            cArr[i] = (char) (((b10 & 31) << 6) | trailingByteValue(b11));
        }

        private static char highSurrogate(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b10) {
            return b10 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b10) {
            return b10 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b10) {
            return b10 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b10) {
            return b10 < -32;
        }

        private static char lowSurrogate(int i) {
            return (char) ((i & 1023) + 56320);
        }

        private static int trailingByteValue(byte b10) {
            return b10 & 63;
        }
    }

    /* compiled from: Utf8.java */
    public static abstract class b {
        public final String decodeUtf8(ByteBuffer byteBuffer, int i, int i10) throws C {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i, i10);
            }
            return byteBuffer.isDirect() ? decodeUtf8Direct(byteBuffer, i, i10) : decodeUtf8Default(byteBuffer, i, i10);
        }

        public abstract String decodeUtf8(byte[] bArr, int i, int i10) throws C;

        public final String decodeUtf8Default(ByteBuffer byteBuffer, int i, int i10) throws C {
            if ((i | i10 | ((byteBuffer.limit() - i) - i10)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i10)));
            }
            int i11 = i + i10;
            char[] cArr = new char[i10];
            int i12 = 0;
            while (i < i11) {
                byte b10 = byteBuffer.get(i);
                if (!a.isOneByte(b10)) {
                    break;
                }
                i++;
                a.handleOneByte(b10, cArr, i12);
                i12++;
            }
            int i13 = i12;
            while (i < i11) {
                int i14 = i + 1;
                byte b11 = byteBuffer.get(i);
                if (a.isOneByte(b11)) {
                    int i15 = i13 + 1;
                    a.handleOneByte(b11, cArr, i13);
                    while (i14 < i11) {
                        byte b12 = byteBuffer.get(i14);
                        if (!a.isOneByte(b12)) {
                            break;
                        }
                        i14++;
                        a.handleOneByte(b12, cArr, i15);
                        i15++;
                    }
                    i13 = i15;
                    i = i14;
                } else if (a.isTwoBytes(b11)) {
                    if (i14 >= i11) {
                        throw C.invalidUtf8();
                    }
                    i += 2;
                    a.handleTwoBytes(b11, byteBuffer.get(i14), cArr, i13);
                    i13++;
                } else if (a.isThreeBytes(b11)) {
                    if (i14 >= i11 - 1) {
                        throw C.invalidUtf8();
                    }
                    int i16 = i + 2;
                    i += 3;
                    a.handleThreeBytes(b11, byteBuffer.get(i14), byteBuffer.get(i16), cArr, i13);
                    i13++;
                } else {
                    if (i14 >= i11 - 2) {
                        throw C.invalidUtf8();
                    }
                    byte b13 = byteBuffer.get(i14);
                    int i17 = i + 3;
                    byte b14 = byteBuffer.get(i + 2);
                    i += 4;
                    a.handleFourBytes(b11, b13, b14, byteBuffer.get(i17), cArr, i13);
                    i13 += 2;
                }
            }
            return new String(cArr, 0, i13);
        }

        public abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i10) throws C;

        public abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i10);

        public final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        public final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
            int length = charSequence.length();
            int iPosition = byteBuffer.position();
            int i = 0;
            while (i < length) {
                try {
                    char cCharAt = charSequence.charAt(i);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i, (byte) cCharAt);
                    i++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (Math.max(i, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                }
            }
            if (i == length) {
                return;
            }
            iPosition += i;
            while (i < length) {
                char cCharAt2 = charSequence.charAt(i);
                if (cCharAt2 < 128) {
                    byteBuffer.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i10 = iPosition + 1;
                    try {
                        byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                        byteBuffer.put(i10, (byte) ((cCharAt2 & '?') | 128));
                        iPosition = i10;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i10;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (Math.max(i, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i11 = i + 1;
                        if (i11 != length) {
                            try {
                                char cCharAt3 = charSequence.charAt(i11);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i12 = iPosition + 1;
                                    try {
                                        byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        int i13 = iPosition + 2;
                                        try {
                                            byteBuffer.put(i12, (byte) (((codePoint >>> 12) & 63) | 128));
                                            iPosition += 3;
                                            byteBuffer.put(i13, (byte) (((codePoint >>> 6) & 63) | 128));
                                            byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                            i = i11;
                                        } catch (IndexOutOfBoundsException unused3) {
                                            i = i11;
                                            iPosition = i13;
                                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (Math.max(i, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                                        }
                                    } catch (IndexOutOfBoundsException unused4) {
                                        iPosition = i12;
                                        i = i11;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (Math.max(i, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                                    }
                                } else {
                                    i = i11;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                        }
                        throw new d(i, length);
                    }
                    int i14 = iPosition + 1;
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    byteBuffer.put(i14, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
                }
                i++;
                iPosition++;
            }
        }

        public abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        public final boolean isValidUtf8(byte[] bArr, int i, int i10) {
            return partialIsValidUtf8(0, bArr, i, i10) == 0;
        }

        public final int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i10, int i11) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? partialIsValidUtf8Direct(i, byteBuffer, i10, i11) : partialIsValidUtf8Default(i, byteBuffer, i10, i11);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return partialIsValidUtf8(i, byteBuffer.array(), i10 + iArrayOffset, iArrayOffset + i11);
        }

        public abstract int partialIsValidUtf8(int i, byte[] bArr, int i10, int i11);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int partialIsValidUtf8Default(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.google.protobuf.z0.access$000(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = com.google.protobuf.z0.access$000(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = com.google.protobuf.z0.access$100(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z0.b.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        public abstract int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i10, int i11);

        public final boolean isValidUtf8(ByteBuffer byteBuffer, int i, int i10) {
            return partialIsValidUtf8(0, byteBuffer, i, i10) == 0;
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i, int i10) {
            int iEstimateConsecutiveAscii = z0.estimateConsecutiveAscii(byteBuffer, i, i10) + i;
            while (iEstimateConsecutiveAscii < i10) {
                int i11 = iEstimateConsecutiveAscii + 1;
                byte b10 = byteBuffer.get(iEstimateConsecutiveAscii);
                if (b10 >= 0) {
                    iEstimateConsecutiveAscii = i11;
                } else if (b10 < -32) {
                    if (i11 >= i10) {
                        return b10;
                    }
                    if (b10 < -62 || byteBuffer.get(i11) > -65) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 2;
                } else {
                    if (b10 >= -16) {
                        if (i11 >= i10 - 2) {
                            return z0.incompleteStateFor(byteBuffer, b10, i11, i10 - i11);
                        }
                        int i12 = iEstimateConsecutiveAscii + 2;
                        byte b11 = byteBuffer.get(i11);
                        if (b11 <= -65) {
                            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0) {
                                int i13 = iEstimateConsecutiveAscii + 3;
                                if (byteBuffer.get(i12) <= -65) {
                                    iEstimateConsecutiveAscii += 4;
                                    if (byteBuffer.get(i13) > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    if (i11 >= i10 - 1) {
                        return z0.incompleteStateFor(byteBuffer, b10, i11, i10 - i11);
                    }
                    int i14 = iEstimateConsecutiveAscii + 2;
                    byte b12 = byteBuffer.get(i11);
                    if (b12 > -65 || ((b10 == -32 && b12 < -96) || ((b10 == -19 && b12 >= -96) || byteBuffer.get(i14) > -65))) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }
    }

    /* compiled from: Utf8.java */
    public static class d extends IllegalArgumentException {
        public d(int i, int i10) {
            super(H7.n(i, i10, "Unpaired surrogate at index ", " of "));
        }
    }

    static {
        processor = (!e.isAvailable() || C4021d.isOnAndroidDevice()) ? new c() : new e();
    }

    private z0() {
    }

    public static String decodeUtf8(ByteBuffer byteBuffer, int i, int i10) throws C {
        return processor.decodeUtf8(byteBuffer, i, i10);
    }

    public static int encode(CharSequence charSequence, byte[] bArr, int i, int i10) {
        return processor.encodeUtf8(charSequence, bArr, i, i10);
    }

    public static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    public static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i < length) {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i);
                    break;
                }
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (iEncodedLengthGeneral + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i10 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 2048) {
                i10 += (127 - cCharAt) >>> 31;
            } else {
                i10 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new d(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i, int i10) {
        int i11 = i10 - 7;
        int i12 = i;
        while (i12 < i11 && (byteBuffer.getLong(i12) & ASCII_MASK_LONG) == 0) {
            i12 += 8;
        }
        return i12 - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    public static int partialIsValidUtf8(int i, byte[] bArr, int i10, int i11) {
        return processor.partialIsValidUtf8(i, bArr, i10, i11);
    }

    public static String decodeUtf8(byte[] bArr, int i, int i10) throws C {
        return processor.decodeUtf8(bArr, i, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i, int i10) {
        if (i > -12 || i10 > -65) {
            return -1;
        }
        return i ^ (i10 << 8);
    }

    public static boolean isValidUtf8(byte[] bArr, int i, int i10) {
        return processor.isValidUtf8(bArr, i, i10);
    }

    public static int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i10, int i11) {
        return processor.partialIsValidUtf8(i, byteBuffer, i10, i11);
    }

    /* compiled from: Utf8.java */
    public static final class e extends b {
        public static boolean isAvailable() {
            return y0.hasUnsafeArrayOperations() && y0.hasUnsafeByteBufferOperations();
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j4, int i) {
            int i10 = 0;
            if (i < 16) {
                return 0;
            }
            int i11 = 8 - (((int) j4) & 7);
            while (i10 < i11) {
                long j10 = 1 + j4;
                if (y0.getByte(bArr, j4) < 0) {
                    return i10;
                }
                i10++;
                j4 = j10;
            }
            while (true) {
                int i12 = i10 + 8;
                if (i12 > i || (y0.getLong((Object) bArr, y0.BYTE_ARRAY_BASE_OFFSET + j4) & z0.ASCII_MASK_LONG) != 0) {
                    break;
                }
                j4 += 8;
                i10 = i12;
            }
            while (i10 < i) {
                long j11 = j4 + 1;
                if (y0.getByte(bArr, j4) < 0) {
                    return i10;
                }
                i10++;
                j4 = j11;
            }
            return i;
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i, long j4, int i10) {
            if (i10 == 0) {
                return z0.incompleteStateFor(i);
            }
            if (i10 == 1) {
                return z0.incompleteStateFor(i, y0.getByte(bArr, j4));
            }
            if (i10 == 2) {
                return z0.incompleteStateFor(i, y0.getByte(bArr, j4), y0.getByte(bArr, j4 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.z0.b
        public String decodeUtf8(byte[] bArr, int i, int i10) throws C {
            Charset charset = B.UTF_8;
            String str = new String(bArr, i, i10, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i10 + i))) {
                throw C.invalidUtf8();
            }
            return str;
        }

        @Override // com.google.protobuf.z0.b
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i10) throws C {
            if ((i | i10 | ((byteBuffer.limit() - i) - i10)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i10)));
            }
            long jAddressOffset = y0.addressOffset(byteBuffer) + i;
            long j4 = i10 + jAddressOffset;
            char[] cArr = new char[i10];
            int i11 = 0;
            while (jAddressOffset < j4) {
                byte b10 = y0.getByte(jAddressOffset);
                if (!a.isOneByte(b10)) {
                    break;
                }
                jAddressOffset++;
                a.handleOneByte(b10, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (jAddressOffset < j4) {
                long j10 = jAddressOffset + 1;
                byte b11 = y0.getByte(jAddressOffset);
                if (a.isOneByte(b11)) {
                    int i13 = i12 + 1;
                    a.handleOneByte(b11, cArr, i12);
                    while (j10 < j4) {
                        byte b12 = y0.getByte(j10);
                        if (!a.isOneByte(b12)) {
                            break;
                        }
                        j10++;
                        a.handleOneByte(b12, cArr, i13);
                        i13++;
                    }
                    i12 = i13;
                    jAddressOffset = j10;
                } else if (a.isTwoBytes(b11)) {
                    if (j10 >= j4) {
                        throw C.invalidUtf8();
                    }
                    jAddressOffset += 2;
                    a.handleTwoBytes(b11, y0.getByte(j10), cArr, i12);
                    i12++;
                } else if (a.isThreeBytes(b11)) {
                    if (j10 >= j4 - 1) {
                        throw C.invalidUtf8();
                    }
                    long j11 = 2 + jAddressOffset;
                    jAddressOffset += 3;
                    a.handleThreeBytes(b11, y0.getByte(j10), y0.getByte(j11), cArr, i12);
                    i12++;
                } else {
                    if (j10 >= j4 - 2) {
                        throw C.invalidUtf8();
                    }
                    byte b13 = y0.getByte(j10);
                    long j12 = jAddressOffset + 3;
                    byte b14 = y0.getByte(2 + jAddressOffset);
                    jAddressOffset += 4;
                    a.handleFourBytes(b11, b13, b14, y0.getByte(j12), cArr, i12);
                    i12 += 2;
                }
            }
            return new String(cArr, 0, i12);
        }

        @Override // com.google.protobuf.z0.b
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i10) {
            long j4;
            long j10;
            long j11;
            int i11;
            char cCharAt;
            long j12 = i;
            long j13 = i10 + j12;
            int length = charSequence.length();
            if (length > i10 || bArr.length - i10 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i10));
            }
            int i12 = 0;
            while (true) {
                j4 = 1;
                if (i12 >= length || (cCharAt = charSequence.charAt(i12)) >= 128) {
                    break;
                }
                y0.putByte(bArr, j12, (byte) cCharAt);
                i12++;
                j12 = 1 + j12;
            }
            if (i12 == length) {
                return (int) j12;
            }
            while (i12 < length) {
                char cCharAt2 = charSequence.charAt(i12);
                if (cCharAt2 < 128 && j12 < j13) {
                    y0.putByte(bArr, j12, (byte) cCharAt2);
                    j11 = j13;
                    j10 = j4;
                    j12 += j4;
                } else if (cCharAt2 >= 2048 || j12 > j13 - 2) {
                    j10 = j4;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j12 > j13 - 3) {
                        j11 = j13;
                        if (j12 > j11 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i11 = i12 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i11)))) {
                                throw new d(i12, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j12);
                        }
                        int i13 = i12 + 1;
                        if (i13 != length) {
                            char cCharAt3 = charSequence.charAt(i13);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                y0.putByte(bArr, j12, (byte) ((codePoint >>> 18) | 240));
                                y0.putByte(bArr, j12 + j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j14 = j12 + 3;
                                y0.putByte(bArr, j12 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j12 += 4;
                                y0.putByte(bArr, j14, (byte) ((codePoint & 63) | 128));
                                i12 = i13;
                            } else {
                                i12 = i13;
                            }
                        }
                        throw new d(i12 - 1, length);
                    }
                    y0.putByte(bArr, j12, (byte) ((cCharAt2 >>> '\f') | 480));
                    j11 = j13;
                    long j15 = j12 + 2;
                    y0.putByte(bArr, j12 + j10, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j12 += 3;
                    y0.putByte(bArr, j15, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j10 = j4;
                    long j16 = j12 + j10;
                    y0.putByte(bArr, j12, (byte) ((cCharAt2 >>> 6) | 960));
                    j12 += 2;
                    y0.putByte(bArr, j16, (byte) ((cCharAt2 & '?') | 128));
                    j11 = j13;
                }
                i12++;
                j4 = j10;
                j13 = j11;
            }
            return (int) j12;
        }

        @Override // com.google.protobuf.z0.b
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            long j4;
            char c10;
            long j10;
            long j11;
            long j12;
            int i;
            char c11;
            char cCharAt;
            long jAddressOffset = y0.addressOffset(byteBuffer);
            long jPosition = byteBuffer.position() + jAddressOffset;
            long jLimit = byteBuffer.limit() + jAddressOffset;
            int length = charSequence.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i10 = 0;
            while (true) {
                j4 = 1;
                c10 = 128;
                if (i10 >= length || (cCharAt = charSequence.charAt(i10)) >= 128) {
                    break;
                }
                y0.putByte(jPosition, (byte) cCharAt);
                i10++;
                jPosition = 1 + jPosition;
            }
            if (i10 == length) {
                return;
            }
            while (i10 < length) {
                char cCharAt2 = charSequence.charAt(i10);
                if (cCharAt2 >= c10 || jPosition >= jLimit) {
                    j10 = j4;
                    if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                        long j13 = jPosition + j10;
                        y0.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        y0.putByte(j13, (byte) ((cCharAt2 & '?') | 128));
                        j11 = jAddressOffset;
                        j12 = jLimit;
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            j11 = jAddressOffset;
                            j12 = jLimit;
                            if (jPosition > j12 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i = i10 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i)))) {
                                    throw new d(i10, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            int i11 = i10 + 1;
                            if (i11 != length) {
                                char cCharAt3 = charSequence.charAt(i11);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    y0.putByte(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    c11 = 128;
                                    y0.putByte(jPosition + j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j14 = jPosition + 3;
                                    y0.putByte(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    y0.putByte(j14, (byte) ((codePoint & 63) | 128));
                                    i10 = i11;
                                } else {
                                    i10 = i11;
                                }
                            }
                            throw new d(i10 - 1, length);
                        }
                        y0.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        j11 = jAddressOffset;
                        long j15 = jPosition + 2;
                        j12 = jLimit;
                        y0.putByte(jPosition + j10, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jPosition += 3;
                        y0.putByte(j15, (byte) ((cCharAt2 & '?') | 128));
                    }
                    c11 = 128;
                } else {
                    y0.putByte(jPosition, (byte) cCharAt2);
                    j11 = jAddressOffset;
                    j12 = jLimit;
                    c11 = c10;
                    jPosition += j4;
                    j10 = j4;
                }
                i10++;
                c10 = c11;
                j4 = j10;
                jAddressOffset = j11;
                jLimit = j12;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (com.google.protobuf.y0.getByte(r13, r1) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.y0.getByte(r13, r1) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.z0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int partialIsValidUtf8(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z0.e.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        
            if (com.google.protobuf.y0.getByte(r1) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
        
            if (com.google.protobuf.y0.getByte(r1) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (com.google.protobuf.y0.getByte(r1) > (-65)) goto L57;
         */
        @Override // com.google.protobuf.z0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int partialIsValidUtf8Direct(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 212
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z0.e.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int unsafeEstimateConsecutiveAscii(long j4, int i) {
            if (i < 16) {
                return 0;
            }
            int i10 = (int) ((-j4) & 7);
            int i11 = i10;
            while (i11 > 0) {
                long j10 = 1 + j4;
                if (y0.getByte(j4) < 0) {
                    return i10 - i11;
                }
                i11--;
                j4 = j10;
            }
            int i12 = i - i10;
            while (i12 >= 8 && (y0.getLong(j4) & z0.ASCII_MASK_LONG) == 0) {
                j4 += 8;
                i12 -= 8;
            }
            return i - i12;
        }

        private static int unsafeIncompleteStateFor(long j4, int i, int i10) {
            if (i10 == 0) {
                return z0.incompleteStateFor(i);
            }
            if (i10 == 1) {
                return z0.incompleteStateFor(i, y0.getByte(j4));
            }
            if (i10 == 2) {
                return z0.incompleteStateFor(i, y0.getByte(j4), y0.getByte(j4 + 1));
            }
            throw new AssertionError();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int partialIsValidUtf8(byte[] r10, long r11, int r13) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = com.google.protobuf.y0.getByte(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = com.google.protobuf.y0.getByte(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = com.google.protobuf.y0.getByte(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = com.google.protobuf.y0.getByte(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = com.google.protobuf.y0.getByte(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = com.google.protobuf.y0.getByte(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = com.google.protobuf.y0.getByte(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z0.e.partialIsValidUtf8(byte[], long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int partialIsValidUtf8(long r10, int r12) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r12)
                long r1 = (long) r0
                long r10 = r10 + r1
                int r12 = r12 - r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r12 <= 0) goto L1a
                long r4 = r10 + r2
                byte r1 = com.google.protobuf.y0.getByte(r10)
                if (r1 < 0) goto L19
                int r12 = r12 + (-1)
                r10 = r4
                goto L9
            L19:
                r10 = r4
            L1a:
                if (r12 != 0) goto L1d
                return r0
            L1d:
                int r0 = r12 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r12 = r12 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r10
                byte r10 = com.google.protobuf.y0.getByte(r10)
                if (r10 <= r6) goto L37
                goto L39
            L37:
                r10 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L48:
                int r12 = r12 + (-3)
                long r2 = r2 + r10
                byte r0 = com.google.protobuf.y0.getByte(r10)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r10 = r10 + r8
                byte r0 = com.google.protobuf.y0.getByte(r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L6d:
                int r12 = r12 + (-4)
                long r2 = r2 + r10
                byte r0 = com.google.protobuf.y0.getByte(r10)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r10
                byte r0 = com.google.protobuf.y0.getByte(r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r10 = r10 + r0
                byte r0 = com.google.protobuf.y0.getByte(r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z0.e.partialIsValidUtf8(long, int):int");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i, int i10, int i11) {
        if (i > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i ^ (i10 << 8)) ^ (i11 << 16);
    }

    public static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i, int i10) {
        byte b10 = bArr[i - 1];
        int i11 = i10 - i;
        if (i11 == 0) {
            return incompleteStateFor(b10);
        }
        if (i11 == 1) {
            return incompleteStateFor(b10, bArr[i]);
        }
        if (i11 == 2) {
            return incompleteStateFor(b10, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(ByteBuffer byteBuffer, int i, int i10, int i11) {
        if (i11 == 0) {
            return incompleteStateFor(i);
        }
        if (i11 == 1) {
            return incompleteStateFor(i, byteBuffer.get(i10));
        }
        if (i11 == 2) {
            return incompleteStateFor(i, byteBuffer.get(i10), byteBuffer.get(i10 + 1));
        }
        throw new AssertionError();
    }

    /* compiled from: Utf8.java */
    public static final class c extends b {
        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i10) {
            while (i < i10) {
                int i11 = i + 1;
                byte b10 = bArr[i];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i11 >= i10) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i += 2;
                            if (bArr[i11] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 < -16) {
                        if (i11 >= i10 - 1) {
                            return z0.incompleteStateFor(bArr, i11, i10);
                        }
                        int i12 = i + 2;
                        byte b11 = bArr[i11];
                        if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                            i += 3;
                            if (bArr[i12] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i11 >= i10 - 2) {
                        return z0.incompleteStateFor(bArr, i11, i10);
                    }
                    int i13 = i + 2;
                    byte b12 = bArr[i11];
                    if (b12 <= -65) {
                        if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                            int i14 = i + 3;
                            if (bArr[i13] <= -65) {
                                i += 4;
                                if (bArr[i14] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i = i11;
            }
            return 0;
        }

        @Override // com.google.protobuf.z0.b
        public String decodeUtf8(byte[] bArr, int i, int i10) throws C {
            if ((i | i10 | ((bArr.length - i) - i10)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i10)));
            }
            int i11 = i + i10;
            char[] cArr = new char[i10];
            int i12 = 0;
            while (i < i11) {
                byte b10 = bArr[i];
                if (!a.isOneByte(b10)) {
                    break;
                }
                i++;
                a.handleOneByte(b10, cArr, i12);
                i12++;
            }
            int i13 = i12;
            while (i < i11) {
                int i14 = i + 1;
                byte b11 = bArr[i];
                if (a.isOneByte(b11)) {
                    int i15 = i13 + 1;
                    a.handleOneByte(b11, cArr, i13);
                    while (i14 < i11) {
                        byte b12 = bArr[i14];
                        if (!a.isOneByte(b12)) {
                            break;
                        }
                        i14++;
                        a.handleOneByte(b12, cArr, i15);
                        i15++;
                    }
                    i13 = i15;
                    i = i14;
                } else if (a.isTwoBytes(b11)) {
                    if (i14 >= i11) {
                        throw C.invalidUtf8();
                    }
                    i += 2;
                    a.handleTwoBytes(b11, bArr[i14], cArr, i13);
                    i13++;
                } else if (a.isThreeBytes(b11)) {
                    if (i14 >= i11 - 1) {
                        throw C.invalidUtf8();
                    }
                    int i16 = i + 2;
                    i += 3;
                    a.handleThreeBytes(b11, bArr[i14], bArr[i16], cArr, i13);
                    i13++;
                } else {
                    if (i14 >= i11 - 2) {
                        throw C.invalidUtf8();
                    }
                    byte b13 = bArr[i14];
                    int i17 = i + 3;
                    byte b14 = bArr[i + 2];
                    i += 4;
                    a.handleFourBytes(b11, b13, b14, bArr[i17], cArr, i13);
                    i13 += 2;
                }
            }
            return new String(cArr, 0, i13);
        }

        @Override // com.google.protobuf.z0.b
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i10) throws C {
            return decodeUtf8Default(byteBuffer, i, i10);
        }

        @Override // com.google.protobuf.z0.b
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i10) {
            int i11;
            int i12;
            char cCharAt;
            int length = charSequence.length();
            int i13 = i10 + i;
            int i14 = 0;
            while (i14 < length && (i12 = i14 + i) < i13 && (cCharAt = charSequence.charAt(i14)) < 128) {
                bArr[i12] = (byte) cCharAt;
                i14++;
            }
            if (i14 == length) {
                return i + length;
            }
            int i15 = i + i14;
            while (i14 < length) {
                char cCharAt2 = charSequence.charAt(i14);
                if (cCharAt2 < 128 && i15 < i13) {
                    bArr[i15] = (byte) cCharAt2;
                    i15++;
                } else if (cCharAt2 < 2048 && i15 <= i13 - 2) {
                    int i16 = i15 + 1;
                    bArr[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                    i15 += 2;
                    bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i15 > i13 - 3) {
                        if (i15 > i13 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i11 = i14 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i11)))) {
                                throw new d(i14, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i15);
                        }
                        int i17 = i14 + 1;
                        if (i17 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i17);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i18 = i15 + 3;
                                bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i15 += 4;
                                bArr[i18] = (byte) ((codePoint & 63) | 128);
                                i14 = i17;
                            } else {
                                i14 = i17;
                            }
                        }
                        throw new d(i14 - 1, length);
                    }
                    bArr[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i19 = i15 + 2;
                    bArr[i15 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i15 += 3;
                    bArr[i19] = (byte) ((cCharAt2 & '?') | 128);
                }
                i14++;
            }
            return i15;
        }

        @Override // com.google.protobuf.z0.b
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.z0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.protobuf.z0.access$000(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.google.protobuf.z0.access$000(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.google.protobuf.z0.access$100(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z0.c.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.z0.b
        public int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i10, int i11) {
            return partialIsValidUtf8Default(i, byteBuffer, i10, i11);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i, int i10) {
            while (i < i10 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i10) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i, i10);
        }
    }
}
