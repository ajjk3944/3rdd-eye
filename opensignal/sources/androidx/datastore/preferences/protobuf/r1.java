package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class r1 extends io.sentry.config.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1346a;

    public /* synthetic */ r1(int i10) {
        this.f1346a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    @Override // io.sentry.config.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String J(byte[] r11, int r12, int r13) throws androidx.datastore.preferences.protobuf.e0 {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.r1.J(byte[], int, int):java.lang.String");
    }

    @Override // io.sentry.config.a
    public final int M(int i10, int i11, String str, byte[] bArr) {
        int i12;
        int i13;
        char cCharAt;
        long j;
        char c4;
        long j7;
        String str2;
        int i14;
        char c10;
        int i15;
        char cCharAt2;
        String str3 = str;
        switch (this.f1346a) {
            case 0:
                int length = str3.length();
                int i16 = i11 + i10;
                int i17 = 0;
                while (i17 < length && (i13 = i17 + i10) < i16 && (cCharAt = str3.charAt(i17)) < 128) {
                    bArr[i13] = (byte) cCharAt;
                    i17++;
                }
                if (i17 == length) {
                    return i10 + length;
                }
                int i18 = i10 + i17;
                while (i17 < length) {
                    char cCharAt3 = str3.charAt(i17);
                    if (cCharAt3 < 128 && i18 < i16) {
                        bArr[i18] = (byte) cCharAt3;
                        i18++;
                    } else if (cCharAt3 < 2048 && i18 <= i16 - 2) {
                        int i19 = i18 + 1;
                        bArr[i18] = (byte) ((cCharAt3 >>> 6) | 960);
                        i18 += 2;
                        bArr[i19] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i18 > i16 - 3) {
                            if (i18 > i16 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i12 = i17 + 1) == str3.length() || !Character.isSurrogatePair(cCharAt3, str3.charAt(i12)))) {
                                    throw new s1(i17, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i18);
                            }
                            int i20 = i17 + 1;
                            if (i20 != str3.length()) {
                                char cCharAt4 = str3.charAt(i20);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i18] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i18 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i21 = i18 + 3;
                                    bArr[i18 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i18 += 4;
                                    bArr[i21] = (byte) ((codePoint & 63) | 128);
                                    i17 = i20;
                                } else {
                                    i17 = i20;
                                }
                            }
                            throw new s1(i17 - 1, length);
                        }
                        bArr[i18] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i22 = i18 + 2;
                        bArr[i18 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i18 += 3;
                        bArr[i22] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i17++;
                }
                return i18;
            default:
                long j10 = i10;
                long j11 = i11 + j10;
                int length2 = str3.length();
                if (length2 > i11 || bArr.length - i11 < i10) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str3.charAt(length2 - 1) + " at index " + (i10 + i11));
                }
                int i23 = 0;
                while (true) {
                    j = 1;
                    c4 = 128;
                    if (i23 < length2 && (cCharAt2 = str3.charAt(i23)) < 128) {
                        q1.j(bArr, j10, (byte) cCharAt2);
                        i23++;
                        j10 = 1 + j10;
                    }
                }
                if (i23 != length2) {
                    while (i23 < length2) {
                        char cCharAt5 = str3.charAt(i23);
                        if (cCharAt5 < c4 && j10 < j11) {
                            q1.j(bArr, j10, (byte) cCharAt5);
                            i14 = i23;
                            c10 = c4;
                            j7 = j;
                            j10 += j;
                        } else if (cCharAt5 >= 2048 || j10 > j11 - 2) {
                            j7 = j;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j10 > j11 - 3) {
                                if (j10 > j11 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i15 = i23 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i15)))) {
                                        throw new s1(i23, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j10);
                                }
                                i14 = i23 + 1;
                                if (i14 != length2) {
                                    str2 = str;
                                    char cCharAt6 = str2.charAt(i14);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        q1.j(bArr, j10, (byte) ((codePoint2 >>> 18) | 240));
                                        int i24 = (codePoint2 >>> 12) & 63;
                                        c10 = 128;
                                        q1.j(bArr, j10 + j7, (byte) (i24 | 128));
                                        long j12 = j10 + 3;
                                        q1.j(bArr, j10 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j10 += 4;
                                        q1.j(bArr, j12, (byte) ((codePoint2 & 63) | 128));
                                    } else {
                                        i23 = i14;
                                    }
                                }
                                throw new s1(i23 - 1, length2);
                            }
                            q1.j(bArr, j10, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j13 = j10 + 2;
                            q1.j(bArr, j10 + j7, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j10 += 3;
                            q1.j(bArr, j13, (byte) ((cCharAt5 & '?') | 128));
                            str2 = str;
                            i14 = i23;
                            c10 = 128;
                            c4 = c10;
                            i23 = i14 + 1;
                            str3 = str2;
                            j = j7;
                        } else {
                            j7 = j;
                            long j14 = j10 + j7;
                            q1.j(bArr, j10, (byte) ((cCharAt5 >>> 6) | 960));
                            j10 += 2;
                            q1.j(bArr, j14, (byte) ((cCharAt5 & '?') | c4));
                            i14 = i23;
                            c10 = c4;
                        }
                        str2 = str3;
                        c4 = c10;
                        i23 = i14 + 1;
                        str3 = str2;
                        j = j7;
                    }
                }
                return (int) j10;
        }
    }
}
