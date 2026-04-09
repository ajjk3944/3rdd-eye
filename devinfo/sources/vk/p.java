package vk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class p extends o {
    public static String n0(char[] cArr, int i4, int i10) {
        zj.b bVar = zj.e.Companion;
        int length = cArr.length;
        bVar.getClass();
        if (i4 < 0 || i10 > length) {
            StringBuilder sbN = r5.c.n(i4, "startIndex: ", ", endIndex: ", i10, ", size: ");
            sbN.append(length);
            throw new IndexOutOfBoundsException(sbN.toString());
        }
        if (i4 <= i10) {
            return new String(cArr, i4, i10 - i4);
        }
        throw new IllegalArgumentException(a0.g.i(i4, i10, "startIndex: ", " > endIndex: "));
    }

    public static String o0(byte[] bArr) {
        return new String(bArr, a.f36267a);
    }

    public static boolean p0(String str, String str2, boolean z3) {
        nk.k.e(str, "<this>");
        nk.k.e(str2, "suffix");
        return !z3 ? str.endsWith(str2) : r0(true, str.length() - str2.length(), str, 0, str2, str2.length());
    }

    public static boolean q0(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static boolean r0(boolean z3, int i4, String str, int i10, String str2, int i11) {
        nk.k.e(str, "<this>");
        nk.k.e(str2, "other");
        return !z3 ? str.regionMatches(i4, str2, i10, i11) : str.regionMatches(z3, i4, str2, i10, i11);
    }

    public static String s0(int i4, String str) {
        if (i4 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i4 + '.').toString());
        }
        if (i4 == 0) {
            return "";
        }
        int i10 = 1;
        if (i4 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i4];
            for (int i11 = 0; i11 < i4; i11++) {
                cArr[i11] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(str.length() * i4);
        if (1 <= i4) {
            while (true) {
                sb2.append((CharSequence) str);
                if (i10 == i4) {
                    break;
                }
                i10++;
            }
        }
        String string = sb2.toString();
        nk.k.b(string);
        return string;
    }

    public static String t0(String str, char c9, char c10) {
        nk.k.e(str, "<this>");
        String strReplace = str.replace(c9, c10);
        nk.k.d(strReplace, "replace(...)");
        return strReplace;
    }

    public static String u0(String str, String str2, String str3) {
        nk.k.e(str, "<this>");
        nk.k.e(str2, "oldValue");
        int iC0 = i.C0(str, str2, 0, false);
        if (iC0 < 0) {
            return str;
        }
        int length = str2.length();
        int i4 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i10 = 0;
        do {
            sb2.append((CharSequence) str, i10, iC0);
            sb2.append(str3);
            i10 = iC0 + length;
            if (iC0 >= str.length()) {
                break;
            }
            iC0 = i.C0(str, str2, iC0 + i4, false);
        } while (iC0 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        nk.k.d(string, "toString(...)");
        return string;
    }

    public static boolean v0(String str, int i4, String str2, boolean z3) {
        nk.k.e(str, "<this>");
        return !z3 ? str.startsWith(str2, i4) : r0(z3, i4, str, 0, str2, str2.length());
    }

    public static boolean w0(String str, String str2, boolean z3) {
        nk.k.e(str, "<this>");
        nk.k.e(str2, "prefix");
        return !z3 ? str.startsWith(str2) : r0(z3, 0, str, 0, str2, str2.length());
    }

    public static Integer x0(String str) {
        boolean z3;
        int i4;
        int i10;
        nk.k.e(str, "<this>");
        com.bumptech.glide.d.g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        int i12 = -2147483647;
        if (nk.k.f(cCharAt, 48) < 0) {
            i4 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z3 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i12 = LinearLayoutManager.INVALID_OFFSET;
                z3 = true;
            }
        } else {
            z3 = false;
            i4 = 0;
        }
        int i13 = -59652323;
        while (i4 < length) {
            int iDigit = Character.digit((int) str.charAt(i4), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / 10))) || (i10 = i11 * 10) < i12 + iDigit) {
                return null;
            }
            i11 = i10 - iDigit;
            i4++;
        }
        return z3 ? Integer.valueOf(i11) : Integer.valueOf(-i11);
    }
}
