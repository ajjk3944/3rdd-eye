package s9;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class w extends v {
    public static String Z0(String str, int i10) {
        kotlin.jvm.internal.p.e(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(q9.e.d(i10, str.length()));
            kotlin.jvm.internal.p.d(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char a1(CharSequence charSequence) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(u.V(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char b1(CharSequence charSequence) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static String c1(String str, int i10) {
        kotlin.jvm.internal.p.e(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, q9.e.d(i10, str.length()));
            kotlin.jvm.internal.p.d(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
