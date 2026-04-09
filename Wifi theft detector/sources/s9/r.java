package s9;

import java.util.Comparator;

/* loaded from: classes4.dex */
public abstract class r extends q {
    public static /* synthetic */ boolean A(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return z(str, i10, str2, i11, i12, z10);
    }

    public static String B(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.p.b(string);
        return string;
    }

    public static final String C(String str, char c10, char c11, boolean z10) {
        kotlin.jvm.internal.p.e(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            kotlin.jvm.internal.p.d(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (b.d(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static final String D(String str, String oldValue, String newValue, boolean z10) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(oldValue, "oldValue");
        kotlin.jvm.internal.p.e(newValue, "newValue");
        int i10 = 0;
        int iX = u.X(str, oldValue, 0, z10);
        if (iX < 0) {
            return str;
        }
        int length = oldValue.length();
        int iB = q9.e.b(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i10, iX);
            sb.append(newValue);
            i10 = iX + length;
            if (iX >= str.length()) {
                break;
            }
            iX = u.X(str, oldValue, iX + iB, z10);
        } while (iX > 0);
        sb.append((CharSequence) str, i10, str.length());
        String string = sb.toString();
        kotlin.jvm.internal.p.d(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String E(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return C(str, c10, c11, z10);
    }

    public static /* synthetic */ String F(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return D(str, str2, str3, z10);
    }

    public static boolean G(String str, String prefix, int i10, boolean z10) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : z(str, i10, prefix, 0, prefix.length(), z10);
    }

    public static boolean H(String str, String prefix, boolean z10) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : z(str, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean I(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return G(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean J(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return H(str, str2, z10);
    }

    public static String s(char[] cArr) {
        kotlin.jvm.internal.p.e(cArr, "<this>");
        return new String(cArr);
    }

    public static String t(char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.p.e(cArr, "<this>");
        z8.d.Companion.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static String u(byte[] bArr) {
        kotlin.jvm.internal.p.e(bArr, "<this>");
        return new String(bArr, c.f24341b);
    }

    public static boolean v(String str, String suffix, boolean z10) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : z(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean w(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return v(str, str2, z10);
    }

    public static boolean x(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static Comparator y(kotlin.jvm.internal.w wVar) {
        kotlin.jvm.internal.p.e(wVar, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.p.d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static boolean z(String str, int i10, String other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }
}
