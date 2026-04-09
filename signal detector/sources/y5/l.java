package y5;

/* loaded from: classes3.dex */
public abstract class l extends j {
    public static boolean V(CharSequence charSequence, String str, boolean z6) {
        q5.i.e(charSequence, "<this>");
        q5.i.e(str, "other");
        return a0(charSequence, str, 0, z6, 2) >= 0;
    }

    public static boolean W(String str, String str2) {
        q5.i.e(str, "<this>");
        q5.i.e(str2, "suffix");
        return str.endsWith(str2);
    }

    public static boolean X(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final int Y(CharSequence charSequence) {
        q5.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int Z(CharSequence charSequence, String str, int i, boolean z6) {
        q5.i.e(charSequence, "<this>");
        q5.i.e(str, "string");
        if (!z6 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        v5.c cVar = new v5.c(i, length, 1);
        boolean z7 = charSequence instanceof String;
        int i3 = cVar.f23896c;
        int i6 = cVar.f23895b;
        int i7 = cVar.f23894a;
        if (!z7 || !(str instanceof String)) {
            if ((i3 <= 0 || i7 > i6) && (i3 >= 0 || i6 > i7)) {
                return -1;
            }
            while (!e0(str, charSequence, i7, str.length(), z6)) {
                if (i7 == i6) {
                    return -1;
                }
                i7 += i3;
            }
            return i7;
        }
        if ((i3 <= 0 || i7 > i6) && (i3 >= 0 || i6 > i7)) {
            return -1;
        }
        int i8 = i7;
        while (true) {
            String str2 = str;
            boolean z8 = z6;
            if (d0(z8, 0, str2, i8, (String) charSequence, str.length())) {
                return i8;
            }
            if (i8 == i6) {
                return -1;
            }
            i8 += i3;
            z6 = z8;
            str = str2;
        }
    }

    public static /* synthetic */ int a0(CharSequence charSequence, String str, int i, boolean z6, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z6 = false;
        }
        return Z(charSequence, str, i, z6);
    }

    public static boolean b0(CharSequence charSequence) {
        q5.i.e(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static int c0(int i, String str, String str2) {
        int iY = (i & 2) != 0 ? Y(str) : 0;
        q5.i.e(str, "<this>");
        q5.i.e(str2, "string");
        return str.lastIndexOf(str2, iY);
    }

    public static final boolean d0(boolean z6, int i, String str, int i3, String str2, int i6) {
        q5.i.e(str, "<this>");
        q5.i.e(str2, "other");
        return !z6 ? str.regionMatches(i, str2, i3, i6) : str.regionMatches(z6, i, str2, i3, i6);
    }

    public static final boolean e0(CharSequence charSequence, CharSequence charSequence2, int i, int i3, boolean z6) {
        char upperCase;
        char upperCase2;
        q5.i.e(charSequence, "<this>");
        q5.i.e(charSequence2, "other");
        if (i >= 0 && charSequence.length() - i3 >= 0 && i <= charSequence2.length() - i3) {
            for (int i6 = 0; i6 < i3; i6++) {
                char cCharAt = charSequence.charAt(i6);
                char cCharAt2 = charSequence2.charAt(i + i6);
                if (cCharAt == cCharAt2 || (z6 && ((upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(cCharAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static String f0(String str, String str2, String str3) {
        q5.i.e(str, "<this>");
        int iZ = Z(str, str2, 0, false);
        if (iZ < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i3 = 0;
        do {
            sb.append((CharSequence) str, i3, iZ);
            sb.append(str3);
            i3 = iZ + length;
            if (iZ >= str.length()) {
                break;
            }
            iZ = Z(str, str2, iZ + i, false);
        } while (iZ > 0);
        sb.append((CharSequence) str, i3, str.length());
        String string = sb.toString();
        q5.i.d(string, "toString(...)");
        return string;
    }

    public static boolean g0(String str, String str2) {
        q5.i.e(str, "<this>");
        return str.startsWith(str2);
    }

    public static String h0(String str, v5.c cVar) {
        q5.i.e(cVar, "range");
        String strSubstring = str.substring(cVar.f23894a, cVar.f23895b + 1);
        q5.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String i0(String str) {
        int iLastIndexOf = str.lastIndexOf(46, Y(str));
        if (iLastIndexOf == -1) {
            return str;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        q5.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence j0(String str) {
        q5.i.e(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z6 = false;
        while (i <= length) {
            char cCharAt = str.charAt(!z6 ? i : length);
            boolean z7 = Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt);
            if (z6) {
                if (!z7) {
                    break;
                }
                length--;
            } else if (z7) {
                i++;
            } else {
                z6 = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
