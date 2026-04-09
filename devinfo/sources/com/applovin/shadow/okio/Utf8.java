package com.applovin.shadow.okio;

import a0.g;
import je.u;
import mk.c;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i4) {
        if (i4 < 0 || i4 >= 32) {
            return 127 <= i4 && i4 < 160;
        }
        return true;
    }

    public static final boolean isUtf8Continuation(byte b10) {
        return (b10 & 192) == 128;
    }

    public static final int process2Utf8Bytes(byte[] bArr, int i4, int i10, c cVar) {
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        k.e(bArr, "<this>");
        k.e(cVar, "yield");
        int i11 = i4 + 1;
        if (i10 <= i11) {
            cVar.invoke(numValueOf);
            return 1;
        }
        byte b10 = bArr[i4];
        byte b11 = bArr[i11];
        if ((b11 & 192) != 128) {
            cVar.invoke(numValueOf);
            return 1;
        }
        int i12 = (b11 ^ 3968) ^ (b10 << 6);
        if (i12 < 128) {
            cVar.invoke(numValueOf);
            return 2;
        }
        cVar.invoke(Integer.valueOf(i12));
        return 2;
    }

    public static final int process3Utf8Bytes(byte[] bArr, int i4, int i10, c cVar) {
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        k.e(bArr, "<this>");
        k.e(cVar, "yield");
        int i11 = i4 + 2;
        if (i10 <= i11) {
            cVar.invoke(numValueOf);
            int i12 = i4 + 1;
            return (i10 <= i12 || (bArr[i12] & 192) != 128) ? 1 : 2;
        }
        byte b10 = bArr[i4];
        byte b11 = bArr[i4 + 1];
        if ((b11 & 192) != 128) {
            cVar.invoke(numValueOf);
            return 1;
        }
        byte b12 = bArr[i11];
        if ((b12 & 192) != 128) {
            cVar.invoke(numValueOf);
            return 2;
        }
        int i13 = ((b12 ^ (-123008)) ^ (b11 << 6)) ^ (b10 << 12);
        if (i13 < 2048) {
            cVar.invoke(numValueOf);
            return 3;
        }
        if (55296 > i13 || i13 >= 57344) {
            cVar.invoke(Integer.valueOf(i13));
            return 3;
        }
        cVar.invoke(numValueOf);
        return 3;
    }

    public static final int process4Utf8Bytes(byte[] bArr, int i4, int i10, c cVar) {
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        k.e(bArr, "<this>");
        k.e(cVar, "yield");
        int i11 = i4 + 3;
        if (i10 <= i11) {
            cVar.invoke(numValueOf);
            int i12 = i4 + 1;
            if (i10 <= i12 || (bArr[i12] & 192) != 128) {
                return 1;
            }
            int i13 = i4 + 2;
            return (i10 <= i13 || (bArr[i13] & 192) != 128) ? 2 : 3;
        }
        byte b10 = bArr[i4];
        byte b11 = bArr[i4 + 1];
        if ((b11 & 192) != 128) {
            cVar.invoke(numValueOf);
            return 1;
        }
        byte b12 = bArr[i4 + 2];
        if ((b12 & 192) != 128) {
            cVar.invoke(numValueOf);
            return 2;
        }
        byte b13 = bArr[i11];
        if ((b13 & 192) != 128) {
            cVar.invoke(numValueOf);
            return 3;
        }
        int i14 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12)) ^ (b10 << 18);
        if (i14 > 1114111) {
            cVar.invoke(numValueOf);
            return 4;
        }
        if (55296 <= i14 && i14 < 57344) {
            cVar.invoke(numValueOf);
            return 4;
        }
        if (i14 < 65536) {
            cVar.invoke(numValueOf);
            return 4;
        }
        cVar.invoke(Integer.valueOf(i14));
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void processUtf16Chars(byte[] r12, int r13, int r14, mk.c r15) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Utf8.processUtf16Chars(byte[], int, int, mk.c):void");
    }

    public static final void processUtf8Bytes(String str, int i4, int i10, c cVar) {
        int i11;
        char cCharAt;
        k.e(str, "<this>");
        k.e(cVar, "yield");
        while (i4 < i10) {
            char cCharAt2 = str.charAt(i4);
            if (k.f(cCharAt2, 128) < 0) {
                cVar.invoke(Byte.valueOf((byte) cCharAt2));
                i4++;
                while (i4 < i10 && k.f(str.charAt(i4), 128) < 0) {
                    cVar.invoke(Byte.valueOf((byte) str.charAt(i4)));
                    i4++;
                }
            } else {
                if (k.f(cCharAt2, 2048) < 0) {
                    cVar.invoke(Byte.valueOf((byte) ((cCharAt2 >> 6) | 192)));
                    cVar.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (55296 > cCharAt2 || cCharAt2 >= 57344) {
                    cVar.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | 224)));
                    cVar.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
                    cVar.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (k.f(cCharAt2, 56319) > 0 || i10 <= (i11 = i4 + 1) || 56320 > (cCharAt = str.charAt(i11)) || cCharAt >= 57344) {
                    cVar.invoke(Byte.valueOf(REPLACEMENT_BYTE));
                } else {
                    int iCharAt = (str.charAt(i11) + (cCharAt2 << '\n')) - 56613888;
                    cVar.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                    cVar.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                    cVar.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                    cVar.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                    i4 += 2;
                }
                i4++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void processUtf8CodePoints(byte[] r11, int r12, int r13, mk.c r14) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Utf8.processUtf8CodePoints(byte[], int, int, mk.c):void");
    }

    public static final long size(String str) {
        k.e(str, "<this>");
        return size$default(str, 0, 0, 3, null);
    }

    public static /* synthetic */ long size$default(String str, int i4, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i4 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return size(str, i4, i10);
    }

    public static final long size(String str, int i4) {
        k.e(str, "<this>");
        return size$default(str, i4, 0, 2, null);
    }

    public static final long size(String str, int i4, int i10) {
        int i11;
        k.e(str, "<this>");
        if (i4 < 0) {
            throw new IllegalArgumentException(u.r(i4, "beginIndex < 0: ").toString());
        }
        if (i10 >= i4) {
            if (i10 > str.length()) {
                StringBuilder sbW = u.w(i10, "endIndex > string.length: ", " > ");
                sbW.append(str.length());
                throw new IllegalArgumentException(sbW.toString().toString());
            }
            long j = 0;
            while (i4 < i10) {
                char cCharAt = str.charAt(i4);
                if (cCharAt < 128) {
                    j++;
                } else {
                    if (cCharAt < 2048) {
                        i11 = 2;
                    } else if (cCharAt < 55296 || cCharAt > 57343) {
                        i11 = 3;
                    } else {
                        int i12 = i4 + 1;
                        char cCharAt2 = i12 < i10 ? str.charAt(i12) : (char) 0;
                        if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                            j++;
                            i4 = i12;
                        } else {
                            j += 4;
                            i4 += 2;
                        }
                    }
                    j += i11;
                }
                i4++;
            }
            return j;
        }
        throw new IllegalArgumentException(g.i(i10, i4, "endIndex < beginIndex: ", " < ").toString());
    }
}
