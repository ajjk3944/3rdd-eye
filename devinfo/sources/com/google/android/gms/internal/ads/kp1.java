package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Utf8;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class kp1 {

    /* renamed from: a, reason: collision with root package name */
    public static final cl1 f13228a;

    static {
        if (System.getenv("PROTOBUF_DISABLE_UNSAFE_UTF8_PROCESSOR_FOR_TESTING") == null) {
            if (ip1.f12414e && ip1.f12413d) {
                int i4 = um1.f17262a;
            }
        }
        f13228a = new cl1((byte) 0, 18);
    }

    public static boolean a(int i4, int i10, byte[] bArr) {
        int iE;
        f13228a.getClass();
        while (i4 < i10 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 >= i10) {
            iE = 0;
        } else {
            while (i4 < i10) {
                int i11 = i4 + 1;
                iE = bArr[i4];
                if (iE < 0) {
                    if (iE >= -32) {
                        if (iE >= -16) {
                            if (i11 < i10 - 2) {
                                int i12 = i4 + 2;
                                byte b10 = bArr[i11];
                                if (b10 <= -65) {
                                    if ((((b10 + 112) + (iE << 28)) >> 30) == 0) {
                                        int i13 = i4 + 3;
                                        if (bArr[i12] <= -65) {
                                            i4 += 4;
                                            if (bArr[i13] > -65) {
                                            }
                                        }
                                    }
                                }
                                iE = -1;
                                break;
                            }
                            iE = e(i11, i10, bArr);
                            break;
                        }
                        if (i11 < i10 - 1) {
                            int i14 = i4 + 2;
                            byte b11 = bArr[i11];
                            if (b11 <= -65 && ((iE != -32 || b11 >= -96) && (iE != -19 || b11 < -96))) {
                                i4 += 3;
                                if (bArr[i14] > -65) {
                                }
                            }
                            iE = -1;
                            break;
                        }
                        iE = e(i11, i10, bArr);
                        break;
                    }
                    if (i11 >= i10) {
                        break;
                    }
                    if (iE >= -62) {
                        i4 += 2;
                        if (bArr[i11] > -65) {
                        }
                    }
                    iE = -1;
                    break;
                }
                i4 = i11;
            }
            iE = 0;
        }
        return iE == 0;
    }

    public static int b(String str) throws jp1 {
        int length = str.length();
        int i4 = 0;
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
                try {
                    int length2 = str.length();
                    while (i10 < length2) {
                        char cCharAt2 = str.charAt(i10);
                        if (cCharAt2 < 2048) {
                            i4 += (127 - cCharAt2) >>> 31;
                        } else {
                            i4 += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i10) < 65536) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 32 + String.valueOf(length2).length());
                                    sb2.append("Unpaired surrogate at index ");
                                    sb2.append(i10);
                                    sb2.append(" of ");
                                    sb2.append(length2);
                                    throw new jp1(sb2.toString());
                                }
                                i10++;
                            }
                        }
                        i10++;
                    }
                    i11 += i4;
                } catch (jp1 unused) {
                    return str.getBytes(yn1.f18811a).length;
                }
            }
        }
        if (i11 >= length) {
            return i11;
        }
        long j = i11 + 4294967296L;
        StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 34);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(j);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static int c(String str, byte[] bArr, int i4, int i10) {
        int i11;
        int i12;
        int length;
        int i13;
        char cCharAt;
        int length2 = str.length();
        int i14 = 0;
        while (true) {
            i11 = i4 + i10;
            if (i14 >= length2 || (i13 = i14 + i4) >= i11 || (cCharAt = str.charAt(i14)) >= 128) {
                break;
            }
            bArr[i13] = (byte) cCharAt;
            i14++;
        }
        if (i14 == length2) {
            return i4 + length2;
        }
        int i15 = i4 + i14;
        while (i14 < length2) {
            char cCharAt2 = str.charAt(i14);
            if (cCharAt2 < 128 && i15 < i11) {
                bArr[i15] = (byte) cCharAt2;
                i15++;
            } else if (cCharAt2 < 2048 && i15 <= i11 - 2) {
                bArr[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i15 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i15 > i11 - 3) {
                    if (i15 <= i11 - 4) {
                        i14++;
                        if (i14 != str.length()) {
                            char cCharAt3 = str.charAt(i14);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int i16 = i15 + 3;
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i15 += 4;
                                bArr[i16] = (byte) ((codePoint & 63) | 128);
                            }
                        }
                        byte[] bytes = str.getBytes(yn1.f18811a);
                        length = bytes.length;
                        if (length - i4 > i10) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes, 0, bArr, i4, length);
                    } else {
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i12 = i14 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        byte[] bytes2 = str.getBytes(yn1.f18811a);
                        length = bytes2.length;
                        if (length - i4 > i10) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes2, 0, bArr, i4, length);
                    }
                    return i4 + length;
                }
                bArr[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i15 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i15 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i15 += 3;
            }
            i14++;
        }
        return i15;
    }

    public static String d(int i4, int i10, byte[] bArr) {
        int length = bArr.length;
        if ((((length - i4) - i10) | i4 | i10) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i4), Integer.valueOf(i10)));
        }
        int i11 = i4 + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i4 < i11) {
            byte b10 = bArr[i4];
            if (b10 < 0) {
                break;
            }
            i4++;
            cArr[i12] = (char) b10;
            i12++;
        }
        while (i4 < i11) {
            int i13 = i4 + 1;
            byte b11 = bArr[i4];
            if (b11 >= 0) {
                cArr[i12] = (char) b11;
                i12++;
                i4 = i13;
                while (i4 < i11) {
                    byte b12 = bArr[i4];
                    if (b12 >= 0) {
                        i4++;
                        cArr[i12] = (char) b12;
                        i12++;
                    }
                }
            } else if (b11 < -32) {
                if (i13 >= i11) {
                    throw new ao1("Protocol message had invalid UTF-8.");
                }
                int i14 = i12 + 1;
                i4 += 2;
                byte b13 = bArr[i13];
                if (b11 < -62 || al0.M(b13)) {
                    throw new ao1("Protocol message had invalid UTF-8.");
                }
                cArr[i12] = (char) ((b13 & Utf8.REPLACEMENT_BYTE) | ((b11 & 31) << 6));
                i12 = i14;
            } else {
                if (b11 < -16) {
                    if (i13 >= i11 - 1) {
                        throw new ao1("Protocol message had invalid UTF-8.");
                    }
                    int i15 = i12 + 1;
                    int i16 = i4 + 2;
                    byte b14 = bArr[i13];
                    i4 += 3;
                    byte b15 = bArr[i16];
                    if (!al0.M(b14)) {
                        if (b11 == -32) {
                            if (b14 >= -96) {
                                b11 = -32;
                            }
                        }
                        if (b11 == -19) {
                            if (b14 < -96) {
                                b11 = -19;
                            }
                        }
                        if (!al0.M(b15)) {
                            cArr[i12] = (char) (((b14 & Utf8.REPLACEMENT_BYTE) << 6) | ((b11 & 15) << 12) | (b15 & Utf8.REPLACEMENT_BYTE));
                            i12 = i15;
                        }
                    }
                    throw new ao1("Protocol message had invalid UTF-8.");
                }
                if (i13 >= i11 - 2) {
                    throw new ao1("Protocol message had invalid UTF-8.");
                }
                byte b16 = bArr[i13];
                int i17 = i4 + 3;
                byte b17 = bArr[i4 + 2];
                i4 += 4;
                byte b18 = bArr[i17];
                if (al0.M(b16) || (((b16 + 112) + (b11 << 28)) >> 30) != 0 || al0.M(b17) || al0.M(b18)) {
                    throw new ao1("Protocol message had invalid UTF-8.");
                }
                int i18 = ((b16 & Utf8.REPLACEMENT_BYTE) << 12) | ((b11 & 7) << 18) | ((b17 & Utf8.REPLACEMENT_BYTE) << 6) | (b18 & Utf8.REPLACEMENT_BYTE);
                cArr[i12] = (char) ((i18 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i12 + 1] = (char) ((i18 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                i12 += 2;
            }
        }
        return new String(cArr, 0, i12);
    }

    public static /* synthetic */ int e(int i4, int i10, byte[] bArr) {
        int i11 = i10 - i4;
        byte b10 = bArr[i4 - 1];
        if (i11 == 0) {
            if (b10 <= -12) {
                return b10;
            }
            return -1;
        }
        if (i11 == 1) {
            byte b11 = bArr[i4];
            if (b10 > -12 || b11 > -65) {
                return -1;
            }
            return (b11 << 8) ^ b10;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i4];
        byte b13 = bArr[i4 + 1];
        if (b10 > -12 || b12 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << 16) ^ ((b12 << 8) ^ b10);
    }
}
