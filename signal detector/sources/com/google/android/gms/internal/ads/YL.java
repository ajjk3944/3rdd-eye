package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class YL {

    /* renamed from: a, reason: collision with root package name */
    public static final ZJ f12634a;

    static {
        if (System.getenv("PROTOBUF_DISABLE_UNSAFE_UTF8_PROCESSOR_FOR_TESTING") == null) {
            if (WL.f12216e && WL.f12215d) {
                int i = JK.f9277a;
            }
        }
        f12634a = new ZJ(11, (byte) 0);
    }

    public static boolean a(int i, int i3, byte[] bArr) {
        int iE;
        f12634a.getClass();
        while (i < i3 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i3) {
            iE = 0;
        } else {
            while (i < i3) {
                int i6 = i + 1;
                iE = bArr[i];
                if (iE < 0) {
                    if (iE >= -32) {
                        if (iE >= -16) {
                            if (i6 < i3 - 2) {
                                int i7 = i + 2;
                                byte b5 = bArr[i6];
                                if (b5 <= -65) {
                                    if ((((b5 + 112) + (iE << 28)) >> 30) == 0) {
                                        int i8 = i + 3;
                                        if (bArr[i7] <= -65) {
                                            i += 4;
                                            if (bArr[i8] > -65) {
                                            }
                                        }
                                    }
                                }
                                iE = -1;
                                break;
                            }
                            iE = e(i6, i3, bArr);
                            break;
                        }
                        if (i6 < i3 - 1) {
                            int i9 = i + 2;
                            byte b6 = bArr[i6];
                            if (b6 <= -65 && ((iE != -32 || b6 >= -96) && (iE != -19 || b6 < -96))) {
                                i += 3;
                                if (bArr[i9] > -65) {
                                }
                            }
                            iE = -1;
                            break;
                        }
                        iE = e(i6, i3, bArr);
                        break;
                    }
                    if (i6 >= i3) {
                        break;
                    }
                    if (iE >= -62) {
                        i += 2;
                        if (bArr[i6] > -65) {
                        }
                    }
                    iE = -1;
                    break;
                }
                i = i6;
            }
            iE = 0;
        }
        return iE == 0;
    }

    public static int b(String str) throws XL {
        int length = str.length();
        int i = 0;
        int i3 = 0;
        while (i3 < length && str.charAt(i3) < 128) {
            i3++;
        }
        int i6 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt < 2048) {
                i6 += (127 - cCharAt) >>> 31;
                i3++;
            } else {
                try {
                    int length2 = str.length();
                    while (i3 < length2) {
                        char cCharAt2 = str.charAt(i3);
                        if (cCharAt2 < 2048) {
                            i += (127 - cCharAt2) >>> 31;
                        } else {
                            i += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i3) < 65536) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 32 + String.valueOf(length2).length());
                                    sb.append("Unpaired surrogate at index ");
                                    sb.append(i3);
                                    sb.append(" of ");
                                    sb.append(length2);
                                    throw new XL(sb.toString());
                                }
                                i3++;
                            }
                        }
                        i3++;
                    }
                    i6 += i;
                } catch (XL unused) {
                    return str.getBytes(AbstractC1528mL.f15610a).length;
                }
            }
        }
        if (i6 >= length) {
            return i6;
        }
        long j6 = i6 + 4294967296L;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j6).length() + 34);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j6);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int c(String str, byte[] bArr, int i, int i3) {
        int i6;
        int i7;
        int length;
        int i8;
        char cCharAt;
        int length2 = str.length();
        int i9 = 0;
        while (true) {
            i6 = i + i3;
            if (i9 >= length2 || (i8 = i9 + i) >= i6 || (cCharAt = str.charAt(i9)) >= 128) {
                break;
            }
            bArr[i8] = (byte) cCharAt;
            i9++;
        }
        if (i9 == length2) {
            return i + length2;
        }
        int i10 = i + i9;
        while (i9 < length2) {
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 128 && i10 < i6) {
                bArr[i10] = (byte) cCharAt2;
                i10++;
            } else if (cCharAt2 < 2048 && i10 <= i6 - 2) {
                bArr[i10] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i10 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i10 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i10 > i6 - 3) {
                    if (i10 <= i6 - 4) {
                        i9++;
                        if (i9 != str.length()) {
                            char cCharAt3 = str.charAt(i9);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int i11 = i10 + 3;
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i10] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                bArr[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i10 += 4;
                                bArr[i11] = (byte) ((codePoint & 63) | 128);
                            }
                        }
                        byte[] bytes = str.getBytes(AbstractC1528mL.f15610a);
                        length = bytes.length;
                        if (length - i > i3) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes, 0, bArr, i, length);
                    } else {
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i7 = i9 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i7)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        byte[] bytes2 = str.getBytes(AbstractC1528mL.f15610a);
                        length = bytes2.length;
                        if (length - i > i3) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes2, 0, bArr, i, length);
                    }
                    return i + length;
                }
                bArr[i10] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i10 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i10 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i10 += 3;
            }
            i9++;
        }
        return i10;
    }

    public static String d(int i, int i3, byte[] bArr) {
        int length = bArr.length;
        if ((((length - i) - i3) | i | i3) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i3)));
        }
        int i6 = i + i3;
        char[] cArr = new char[i3];
        int i7 = 0;
        while (i < i6) {
            byte b5 = bArr[i];
            if (b5 < 0) {
                break;
            }
            i++;
            cArr[i7] = (char) b5;
            i7++;
        }
        while (i < i6) {
            int i8 = i + 1;
            byte b6 = bArr[i];
            if (b6 >= 0) {
                cArr[i7] = (char) b6;
                i7++;
                i = i8;
                while (i < i6) {
                    byte b7 = bArr[i];
                    if (b7 >= 0) {
                        i++;
                        cArr[i7] = (char) b7;
                        i7++;
                    }
                }
            } else if (b6 < -32) {
                if (i8 >= i6) {
                    throw new C1636oL("Protocol message had invalid UTF-8.");
                }
                int i9 = i7 + 1;
                i += 2;
                byte b8 = bArr[i8];
                if (b6 < -62 || Cr.J(b8)) {
                    throw new C1636oL("Protocol message had invalid UTF-8.");
                }
                cArr[i7] = (char) ((b8 & 63) | ((b6 & 31) << 6));
                i7 = i9;
            } else {
                if (b6 < -16) {
                    if (i8 >= i6 - 1) {
                        throw new C1636oL("Protocol message had invalid UTF-8.");
                    }
                    int i10 = i7 + 1;
                    int i11 = i + 2;
                    byte b9 = bArr[i8];
                    i += 3;
                    byte b10 = bArr[i11];
                    if (!Cr.J(b9)) {
                        if (b6 == -32) {
                            if (b9 >= -96) {
                                b6 = -32;
                            }
                        }
                        if (b6 == -19) {
                            if (b9 < -96) {
                                b6 = -19;
                            }
                        }
                        if (!Cr.J(b10)) {
                            cArr[i7] = (char) (((b9 & 63) << 6) | ((b6 & 15) << 12) | (b10 & 63));
                            i7 = i10;
                        }
                    }
                    throw new C1636oL("Protocol message had invalid UTF-8.");
                }
                if (i8 >= i6 - 2) {
                    throw new C1636oL("Protocol message had invalid UTF-8.");
                }
                byte b11 = bArr[i8];
                int i12 = i + 3;
                byte b12 = bArr[i + 2];
                i += 4;
                byte b13 = bArr[i12];
                if (Cr.J(b11) || (((b11 + 112) + (b6 << 28)) >> 30) != 0 || Cr.J(b12) || Cr.J(b13)) {
                    throw new C1636oL("Protocol message had invalid UTF-8.");
                }
                int i13 = ((b11 & 63) << 12) | ((b6 & 7) << 18) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i7] = (char) ((i13 >>> 10) + 55232);
                cArr[i7 + 1] = (char) ((i13 & 1023) + 56320);
                i7 += 2;
            }
        }
        return new String(cArr, 0, i7);
    }

    public static /* synthetic */ int e(int i, int i3, byte[] bArr) {
        int i6 = i3 - i;
        byte b5 = bArr[i - 1];
        if (i6 == 0) {
            if (b5 <= -12) {
                return b5;
            }
            return -1;
        }
        if (i6 == 1) {
            byte b6 = bArr[i];
            if (b5 > -12 || b6 > -65) {
                return -1;
            }
            return (b6 << 8) ^ b5;
        }
        if (i6 != 2) {
            throw new AssertionError();
        }
        byte b7 = bArr[i];
        byte b8 = bArr[i + 1];
        if (b5 > -12 || b7 > -65 || b8 > -65) {
            return -1;
        }
        return (b8 << 16) ^ ((b7 << 8) ^ b5);
    }
}
