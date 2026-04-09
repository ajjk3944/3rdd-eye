package y9;

import g0.C4356c;
import java.util.NoSuchElementException;

/* compiled from: _Strings.kt */
/* loaded from: classes3.dex */
public class r extends q {
    public static String x0(int i, String str) {
        kotlin.jvm.internal.l.f(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(C4356c.i(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(i);
        kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static char y0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(q.d0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String z0(int i, String str) {
        kotlin.jvm.internal.l.f(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(C4356c.i(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
        return strSubstring;
    }
}
