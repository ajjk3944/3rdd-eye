package y9;

import N7.H7;
import androidx.work.s;

/* compiled from: StringsJVM.kt */
/* loaded from: classes3.dex */
public class n extends m {
    public static String S(char[] cArr, int i, int i10) {
        kotlin.jvm.internal.l.f(cArr, "<this>");
        int length = cArr.length;
        if (i < 0 || i10 > length) {
            StringBuilder sbI = s.i("startIndex: ", i, ", endIndex: ", i10, ", size: ");
            sbI.append(length);
            throw new IndexOutOfBoundsException(sbI.toString());
        }
        if (i <= i10) {
            return new String(cArr, i, i10 - i);
        }
        throw new IllegalArgumentException(H7.n(i, i10, "startIndex: ", " > endIndex: "));
    }

    public static boolean T(String str, String suffix) {
        kotlin.jvm.internal.l.f(str, "<this>");
        kotlin.jvm.internal.l.f(suffix, "suffix");
        return str.endsWith(suffix);
    }

    public static boolean U(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean V(int i, int i10, int i11, String str, String other, boolean z10) {
        kotlin.jvm.internal.l.f(str, "<this>");
        kotlin.jvm.internal.l.f(other, "other");
        return !z10 ? str.regionMatches(i, other, i10, i11) : str.regionMatches(z10, i, other, i10, i11);
    }

    public static String W(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i10 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i11 = 0; i11 < i; i11++) {
                cArr[i11] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append((CharSequence) str);
                if (i10 == i) {
                    break;
                }
                i10++;
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.c(string);
        return string;
    }

    public static String X(String str, String oldValue, String newValue) {
        kotlin.jvm.internal.l.f(str, "<this>");
        kotlin.jvm.internal.l.f(oldValue, "oldValue");
        kotlin.jvm.internal.l.f(newValue, "newValue");
        int iE0 = q.e0(str, oldValue, 0, false);
        if (iE0 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i10 = 0;
        do {
            sb.append((CharSequence) str, i10, iE0);
            sb.append(newValue);
            i10 = iE0 + length;
            if (iE0 >= str.length()) {
                break;
            }
            iE0 = q.e0(str, oldValue, iE0 + i, false);
        } while (iE0 > 0);
        sb.append((CharSequence) str, i10, str.length());
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        return string;
    }

    public static String Y(char c10, char c11, String str) {
        kotlin.jvm.internal.l.f(str, "<this>");
        String strReplace = str.replace(c10, c11);
        kotlin.jvm.internal.l.e(strReplace, "replace(...)");
        return strReplace;
    }

    public static boolean Z(int i, String str, String str2, boolean z10) {
        kotlin.jvm.internal.l.f(str, "<this>");
        return !z10 ? str.startsWith(str2, i) : V(i, 0, str2.length(), str, str2, z10);
    }

    public static boolean a0(String str, String prefix, boolean z10) {
        kotlin.jvm.internal.l.f(str, "<this>");
        kotlin.jvm.internal.l.f(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : V(0, 0, prefix.length(), str, prefix, z10);
    }
}
