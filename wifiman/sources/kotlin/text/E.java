package kotlin.text;

import Zg.AbstractC3672d;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.U;
import sh.AbstractC7978m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class E extends D {
    public static boolean A(String str, String suffix, boolean z10) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : t.F(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean B(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return t.A(str, str2, z10);
    }

    public static boolean C(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean D(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return t.C(str, str2, z10);
    }

    public static Comparator E(U u10) {
        AbstractC6492s.i(u10, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        AbstractC6492s.h(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static boolean F(String str, int i10, String other, int i11, int i12, boolean z10) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    public static /* synthetic */ boolean G(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return t.F(str, i10, str2, i11, i12, z10);
    }

    public static String H(CharSequence charSequence, int i10) {
        AbstractC6492s.i(charSequence, "<this>");
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
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.f(string);
        return string;
    }

    public static final String I(String str, char c10, char c11, boolean z10) {
        AbstractC6492s.i(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            AbstractC6492s.h(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC6509c.f(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static final String J(String str, String oldValue, String newValue, boolean z10) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(oldValue, "oldValue");
        AbstractC6492s.i(newValue, "newValue");
        int i10 = 0;
        int iG0 = I.g0(str, oldValue, 0, z10);
        if (iG0 < 0) {
            return str;
        }
        int length = oldValue.length();
        int iD = AbstractC7978m.d(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iG0);
            sb2.append(newValue);
            i10 = iG0 + length;
            if (iG0 >= str.length()) {
                break;
            }
            iG0 = I.g0(str, oldValue, iG0 + iD, z10);
        } while (iG0 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String K(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return I(str, c10, c11, z10);
    }

    public static /* synthetic */ String L(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return J(str, str2, str3, z10);
    }

    public static boolean M(String str, String prefix, int i10, boolean z10) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : t.F(str, i10, prefix, 0, prefix.length(), z10);
    }

    public static boolean N(String str, String prefix, boolean z10) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : t.F(str, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean O(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return t.M(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean P(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return t.N(str, str2, z10);
    }

    public static int u(String str, String other, boolean z10) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(other, "other");
        return z10 ? str.compareToIgnoreCase(other) : str.compareTo(other);
    }

    public static String v(char[] cArr) {
        AbstractC6492s.i(cArr, "<this>");
        return new String(cArr);
    }

    public static String w(char[] cArr, int i10, int i11) {
        AbstractC6492s.i(cArr, "<this>");
        AbstractC3672d.f25361a.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static boolean x(CharSequence charSequence, CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? I.X(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    public static String y(byte[] bArr) {
        AbstractC6492s.i(bArr, "<this>");
        return new String(bArr, C6510d.f52215b);
    }

    public static byte[] z(String str) {
        AbstractC6492s.i(str, "<this>");
        byte[] bytes = str.getBytes(C6510d.f52215b);
        AbstractC6492s.h(bytes, "getBytes(...)");
        return bytes;
    }
}
