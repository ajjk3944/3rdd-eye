package androidx.datastore.preferences.protobuf;

import N7.H7;

/* compiled from: Utf8.java */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f15687a;

    /* compiled from: Utf8.java */
    public static class a {
        public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i) throws C1747z {
            if (!d(b11)) {
                if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !d(b12) && !d(b13)) {
                    int i10 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                    cArr[i] = (char) ((i10 >>> 10) + 55232);
                    cArr[i + 1] = (char) ((i10 & 1023) + 56320);
                    return;
                }
            }
            throw C1747z.a();
        }

        public static void b(byte b10, byte b11, char[] cArr, int i) throws C1747z {
            if (b10 < -62 || d(b11)) {
                throw C1747z.a();
            }
            cArr[i] = (char) (((b10 & 31) << 6) | (b11 & 63));
        }

        public static void c(byte b10, byte b11, byte b12, char[] cArr, int i) throws C1747z {
            if (d(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || d(b12)))) {
                throw C1747z.a();
            }
            cArr[i] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
        }

        public static boolean d(byte b10) {
            return b10 > -65;
        }
    }

    /* compiled from: Utf8.java */
    public static abstract class b {
        public abstract String a(byte[] bArr, int i, int i10) throws C1747z;

        public abstract int b(String str, byte[] bArr, int i, int i10);

        public abstract int c(byte[] bArr, int i, int i10);
    }

    /* compiled from: Utf8.java */
    public static final class c extends b {
        @Override // androidx.datastore.preferences.protobuf.p0.b
        public final String a(byte[] bArr, int i, int i10) throws C1747z {
            if ((i | i10 | ((bArr.length - i) - i10)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i10)));
            }
            int i11 = i + i10;
            char[] cArr = new char[i10];
            int i12 = 0;
            while (i < i11) {
                byte b10 = bArr[i];
                if (b10 < 0) {
                    break;
                }
                i++;
                cArr[i12] = (char) b10;
                i12++;
            }
            int i13 = i12;
            while (i < i11) {
                int i14 = i + 1;
                byte b11 = bArr[i];
                if (b11 >= 0) {
                    int i15 = i13 + 1;
                    cArr[i13] = (char) b11;
                    while (i14 < i11) {
                        byte b12 = bArr[i14];
                        if (b12 < 0) {
                            break;
                        }
                        i14++;
                        cArr[i15] = (char) b12;
                        i15++;
                    }
                    i13 = i15;
                    i = i14;
                } else if (b11 < -32) {
                    if (i14 >= i11) {
                        throw C1747z.a();
                    }
                    i += 2;
                    a.b(b11, bArr[i14], cArr, i13);
                    i13++;
                } else if (b11 < -16) {
                    if (i14 >= i11 - 1) {
                        throw C1747z.a();
                    }
                    int i16 = i + 2;
                    i += 3;
                    a.c(b11, bArr[i14], bArr[i16], cArr, i13);
                    i13++;
                } else {
                    if (i14 >= i11 - 2) {
                        throw C1747z.a();
                    }
                    byte b13 = bArr[i14];
                    int i17 = i + 3;
                    byte b14 = bArr[i + 2];
                    i += 4;
                    a.a(b11, b13, b14, bArr[i17], cArr, i13);
                    i13 += 2;
                }
            }
            return new String(cArr, 0, i13);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.b
        public final int b(String str, byte[] bArr, int i, int i10) {
            int i11;
            int i12;
            char cCharAt;
            int length = str.length();
            int i13 = i10 + i;
            int i14 = 0;
            while (i14 < length && (i12 = i14 + i) < i13 && (cCharAt = str.charAt(i14)) < 128) {
                bArr[i12] = (byte) cCharAt;
                i14++;
            }
            if (i14 == length) {
                return i + length;
            }
            int i15 = i + i14;
            while (i14 < length) {
                char cCharAt2 = str.charAt(i14);
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
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i11 = i14 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i11)))) {
                                throw new d(i14, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i15);
                        }
                        int i17 = i14 + 1;
                        if (i17 != str.length()) {
                            char cCharAt3 = str.charAt(i17);
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

        @Override // androidx.datastore.preferences.protobuf.p0.b
        public final int c(byte[] bArr, int i, int i10) {
            while (i < i10 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i10) {
                return 0;
            }
            while (i < i10) {
                int i11 = i + 1;
                byte b10 = bArr[i];
                if (b10 >= 0) {
                    i = i11;
                } else if (b10 < -32) {
                    if (i11 >= i10) {
                        return b10;
                    }
                    if (b10 < -62) {
                        return -1;
                    }
                    i += 2;
                    if (bArr[i11] > -65) {
                        return -1;
                    }
                } else if (b10 < -16) {
                    if (i11 >= i10 - 1) {
                        return p0.a(bArr, i11, i10);
                    }
                    int i12 = i + 2;
                    byte b11 = bArr[i11];
                    if (b11 > -65) {
                        return -1;
                    }
                    if (b10 == -32 && b11 < -96) {
                        return -1;
                    }
                    if (b10 == -19 && b11 >= -96) {
                        return -1;
                    }
                    i += 3;
                    if (bArr[i12] > -65) {
                        return -1;
                    }
                } else {
                    if (i11 >= i10 - 2) {
                        return p0.a(bArr, i11, i10);
                    }
                    int i13 = i + 2;
                    byte b12 = bArr[i11];
                    if (b12 > -65) {
                        return -1;
                    }
                    if ((((b12 + 112) + (b10 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    int i14 = i + 3;
                    if (bArr[i13] > -65) {
                        return -1;
                    }
                    i += 4;
                    if (bArr[i14] > -65) {
                        return -1;
                    }
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

    /* compiled from: Utf8.java */
    public static final class e extends b {
        public static int d(byte[] bArr, int i, long j4, int i10) {
            if (i10 == 0) {
                b bVar = p0.f15687a;
                if (i > -12) {
                    return -1;
                }
                return i;
            }
            if (i10 == 1) {
                return p0.c(i, o0.f(bArr, j4));
            }
            if (i10 == 2) {
                return p0.d(i, o0.f(bArr, j4), o0.f(bArr, j4 + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.p0.b
        public final String a(byte[] bArr, int i, int i10) throws C1747z {
            if ((i | i10 | ((bArr.length - i) - i10)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i10)));
            }
            int i11 = i + i10;
            char[] cArr = new char[i10];
            int i12 = i;
            int i13 = 0;
            while (i12 < i11) {
                byte bF = o0.f(bArr, i12);
                if (bF < 0) {
                    break;
                }
                i12++;
                cArr[i13] = (char) bF;
                i13++;
            }
            int i14 = i13;
            while (i12 < i11) {
                int i15 = i12 + 1;
                byte bF2 = o0.f(bArr, i12);
                if (bF2 >= 0) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) bF2;
                    while (i15 < i11) {
                        byte bF3 = o0.f(bArr, i15);
                        if (bF3 < 0) {
                            break;
                        }
                        i15++;
                        cArr[i16] = (char) bF3;
                        i16++;
                    }
                    i14 = i16;
                    i12 = i15;
                } else if (bF2 < -32) {
                    if (i15 >= i11) {
                        throw C1747z.a();
                    }
                    i12 += 2;
                    a.b(bF2, o0.f(bArr, i15), cArr, i14);
                    i14++;
                } else if (bF2 < -16) {
                    if (i15 >= i11 - 1) {
                        throw C1747z.a();
                    }
                    int i17 = i12 + 2;
                    i12 += 3;
                    a.c(bF2, o0.f(bArr, i15), o0.f(bArr, i17), cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i11 - 2) {
                        throw C1747z.a();
                    }
                    byte bF4 = o0.f(bArr, i15);
                    int i18 = i12 + 3;
                    byte bF5 = o0.f(bArr, i12 + 2);
                    i12 += 4;
                    a.a(bF2, bF4, bF5, o0.f(bArr, i18), cArr, i14);
                    i14 += 2;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.b
        public final int b(String str, byte[] bArr, int i, int i10) {
            long j4;
            long j10;
            long j11;
            int i11;
            char cCharAt;
            long j12 = i;
            long j13 = i10 + j12;
            int length = str.length();
            if (length > i10 || bArr.length - i10 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i + i10));
            }
            int i12 = 0;
            while (true) {
                j4 = 1;
                if (i12 >= length || (cCharAt = str.charAt(i12)) >= 128) {
                    break;
                }
                o0.j(bArr, j12, (byte) cCharAt);
                i12++;
                j12 = 1 + j12;
            }
            if (i12 == length) {
                return (int) j12;
            }
            while (i12 < length) {
                char cCharAt2 = str.charAt(i12);
                if (cCharAt2 < 128 && j12 < j13) {
                    o0.j(bArr, j12, (byte) cCharAt2);
                    j11 = j13;
                    j10 = j4;
                    j12 += j4;
                } else if (cCharAt2 >= 2048 || j12 > j13 - 2) {
                    j10 = j4;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j12 > j13 - 3) {
                        j11 = j13;
                        if (j12 > j11 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i11 = i12 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i11)))) {
                                throw new d(i12, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j12);
                        }
                        int i13 = i12 + 1;
                        if (i13 != length) {
                            char cCharAt3 = str.charAt(i13);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                o0.j(bArr, j12, (byte) ((codePoint >>> 18) | 240));
                                o0.j(bArr, j12 + j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j14 = j12 + 3;
                                o0.j(bArr, j12 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j12 += 4;
                                o0.j(bArr, j14, (byte) ((codePoint & 63) | 128));
                                i12 = i13;
                            } else {
                                i12 = i13;
                            }
                        }
                        throw new d(i12 - 1, length);
                    }
                    o0.j(bArr, j12, (byte) ((cCharAt2 >>> '\f') | 480));
                    j11 = j13;
                    long j15 = j12 + 2;
                    o0.j(bArr, j12 + j10, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j12 += 3;
                    o0.j(bArr, j15, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j10 = j4;
                    long j16 = j12 + j10;
                    o0.j(bArr, j12, (byte) ((cCharAt2 >>> 6) | 960));
                    j12 += 2;
                    o0.j(bArr, j16, (byte) ((cCharAt2 & '?') | 128));
                    j11 = j13;
                }
                i12++;
                j4 = j10;
                j13 = j11;
            }
            return (int) j12;
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x00d0, code lost:
        
            return r7;
         */
        @Override // androidx.datastore.preferences.protobuf.p0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int c(byte[] r20, int r21, int r22) {
            /*
                Method dump skipped, instructions count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.p0.e.c(byte[], int, int):int");
        }
    }

    static {
        f15687a = (o0.f15683f && o0.f15682e && !C1726d.a()) ? new e() : new c();
    }

    public static int a(byte[] bArr, int i, int i10) {
        byte b10 = bArr[i - 1];
        int i11 = i10 - i;
        if (i11 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i11 == 1) {
            return c(b10, bArr[i]);
        }
        if (i11 == 2) {
            return d(b10, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
                i10++;
            } else {
                int length2 = str.length();
                while (i10 < length2) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) < 65536) {
                                throw new d(i10, length2);
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    public static int c(int i, int i10) {
        if (i > -12 || i10 > -65) {
            return -1;
        }
        return i ^ (i10 << 8);
    }

    public static int d(int i, int i10, int i11) {
        if (i > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i ^ (i10 << 8)) ^ (i11 << 16);
    }
}
