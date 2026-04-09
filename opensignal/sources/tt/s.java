package tt;

import com.google.android.gms.internal.measurement.b4;

/* loaded from: classes.dex */
public abstract class s extends r {
    public static boolean f0(String str, String str2, boolean z10) {
        br.l.e(str, "<this>");
        br.l.e(str2, "suffix");
        return !z10 ? str.endsWith(str2) : i0(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static boolean g0(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final void h0(String str) {
        throw new NumberFormatException(h0.b.g('\'', "Invalid number format: '", str));
    }

    public static boolean i0(int i10, int i11, int i12, String str, String str2, boolean z10) {
        br.l.e(str, "<this>");
        br.l.e(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static String j0(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(str.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append((CharSequence) str);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        br.l.b(string);
        return string;
    }

    public static String k0(String str, char c4, char c10) {
        br.l.e(str, "<this>");
        String strReplace = str.replace(c4, c10);
        br.l.d(strReplace, "replace(...)");
        return strReplace;
    }

    public static String l0(String str, String str2, String str3) {
        br.l.e(str, "<this>");
        br.l.e(str3, "newValue");
        int iY0 = l.y0(str, str2, 0, false);
        if (iY0 < 0) {
            return str;
        }
        int length = str2.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i11 = 0;
        do {
            sb2.append((CharSequence) str, i11, iY0);
            sb2.append(str3);
            i11 = iY0 + length;
            if (iY0 >= str.length()) {
                break;
            }
            iY0 = l.y0(str, str2, iY0 + i10, false);
        } while (iY0 > 0);
        sb2.append((CharSequence) str, i11, str.length());
        String string = sb2.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public static boolean m0(String str, int i10, String str2, boolean z10) {
        br.l.e(str, "<this>");
        return !z10 ? str.startsWith(str2, i10) : i0(i10, 0, str2.length(), str, str2, z10);
    }

    public static boolean n0(String str, String str2, boolean z10) {
        br.l.e(str, "<this>");
        br.l.e(str2, "prefix");
        return !z10 ? str.startsWith(str2) : i0(0, 0, str2.length(), str, str2, z10);
    }

    public static Integer o0(String str) {
        boolean z10;
        int i10;
        int i11;
        br.l.e(str, "<this>");
        b4.g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        int i13 = -2147483647;
        if (br.l.g(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i13 = Integer.MIN_VALUE;
                z10 = true;
            }
        } else {
            z10 = false;
            i10 = 0;
        }
        int i14 = -59652323;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i12 < i14 && (i14 != -59652323 || i12 < (i14 = i13 / 10))) || (i11 = i12 * 10) < i13 + iDigit) {
                return null;
            }
            i12 = i11 - iDigit;
            i10++;
        }
        return z10 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    public static Long p0(String str) {
        boolean z10;
        br.l.e(str, "<this>");
        b4.g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (br.l.g(cCharAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
                i10 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i10 = 1;
            }
        } else {
            z10 = false;
        }
        long j7 = 0;
        long j10 = -256204778801521550L;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j7 < j10) {
                if (j10 != -256204778801521550L) {
                    return null;
                }
                j10 = j / 10;
                if (j7 < j10) {
                    return null;
                }
            }
            long j11 = j7 * 10;
            long j12 = iDigit;
            if (j11 < j + j12) {
                return null;
            }
            j7 = j11 - j12;
            i10++;
        }
        return z10 ? Long.valueOf(j7) : Long.valueOf(-j7);
    }
}
