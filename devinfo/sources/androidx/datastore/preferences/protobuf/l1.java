package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l1 extends a.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1012d;

    public /* synthetic */ l1(int i4) {
        this.f1012d = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    @Override // a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String i(int r11, int r12, byte[] r13) throws androidx.datastore.preferences.protobuf.a0 {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.l1.i(int, int, byte[]):java.lang.String");
    }

    @Override // a.a
    public final int j(String str, byte[] bArr, int i4, int i10) {
        int i11;
        int i12;
        char cCharAt;
        long j;
        long j8;
        long j9;
        int i13;
        char cCharAt2;
        switch (this.f1012d) {
            case 0:
                int length = str.length();
                int i14 = i10 + i4;
                int i15 = 0;
                while (i15 < length && (i12 = i15 + i4) < i14 && (cCharAt = str.charAt(i15)) < 128) {
                    bArr[i12] = (byte) cCharAt;
                    i15++;
                }
                if (i15 == length) {
                    return i4 + length;
                }
                int i16 = i4 + i15;
                while (i15 < length) {
                    char cCharAt3 = str.charAt(i15);
                    if (cCharAt3 < 128 && i16 < i14) {
                        bArr[i16] = (byte) cCharAt3;
                        i16++;
                    } else if (cCharAt3 < 2048 && i16 <= i14 - 2) {
                        int i17 = i16 + 1;
                        bArr[i16] = (byte) ((cCharAt3 >>> 6) | 960);
                        i16 += 2;
                        bArr[i17] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i16 > i14 - 3) {
                            if (i16 > i14 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i11 = i15 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i11)))) {
                                    throw new m1(i15, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i16);
                            }
                            int i18 = i15 + 1;
                            if (i18 != str.length()) {
                                char cCharAt4 = str.charAt(i18);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i19 = i16 + 3;
                                    bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i16 += 4;
                                    bArr[i19] = (byte) ((codePoint & 63) | 128);
                                    i15 = i18;
                                } else {
                                    i15 = i18;
                                }
                            }
                            throw new m1(i15 - 1, length);
                        }
                        bArr[i16] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i20 = i16 + 2;
                        bArr[i16 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i16 += 3;
                        bArr[i20] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i15++;
                }
                return i16;
            default:
                long j10 = i4;
                long j11 = i10 + j10;
                int length2 = str.length();
                if (length2 > i10 || bArr.length - i10 < i4) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i4 + i10));
                }
                int i21 = 0;
                while (true) {
                    j = 1;
                    if (i21 < length2 && (cCharAt2 = str.charAt(i21)) < 128) {
                        k1.j(bArr, j10, (byte) cCharAt2);
                        i21++;
                        j10 = 1 + j10;
                    }
                }
                if (i21 != length2) {
                    while (i21 < length2) {
                        char cCharAt5 = str.charAt(i21);
                        if (cCharAt5 < 128 && j10 < j11) {
                            k1.j(bArr, j10, (byte) cCharAt5);
                            j9 = j11;
                            j8 = j;
                            j10 += j;
                        } else if (cCharAt5 >= 2048 || j10 > j11 - 2) {
                            j8 = j;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j10 > j11 - 3) {
                                j9 = j11;
                                if (j10 > j9 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i13 = i21 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i13)))) {
                                        throw new m1(i21, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j10);
                                }
                                int i22 = i21 + 1;
                                if (i22 != length2) {
                                    char cCharAt6 = str.charAt(i22);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        k1.j(bArr, j10, (byte) ((codePoint2 >>> 18) | 240));
                                        k1.j(bArr, j10 + j8, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j12 = j10 + 3;
                                        k1.j(bArr, j10 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j10 += 4;
                                        k1.j(bArr, j12, (byte) ((codePoint2 & 63) | 128));
                                        i21 = i22;
                                    } else {
                                        i21 = i22;
                                    }
                                }
                                throw new m1(i21 - 1, length2);
                            }
                            k1.j(bArr, j10, (byte) ((cCharAt5 >>> '\f') | 480));
                            j9 = j11;
                            long j13 = j10 + 2;
                            k1.j(bArr, j10 + j8, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j10 += 3;
                            k1.j(bArr, j13, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            j8 = j;
                            long j14 = j10 + j8;
                            k1.j(bArr, j10, (byte) ((cCharAt5 >>> 6) | 960));
                            j10 += 2;
                            k1.j(bArr, j14, (byte) ((cCharAt5 & '?') | 128));
                            j9 = j11;
                        }
                        i21++;
                        j = j8;
                        j11 = j9;
                    }
                }
                return (int) j10;
        }
    }
}
