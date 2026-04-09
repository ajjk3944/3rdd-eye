package kotlin.text;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;
import sh.C7974i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.text.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6508b {
    public static int a(int i10) {
        if (2 <= i10 && i10 < 37) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new C7974i(2, 36));
    }

    public static final int b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    public static boolean c(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static String d(char c10, Locale locale) {
        AbstractC6492s.i(locale, "locale");
        String strE = e(c10, locale);
        if (strE.length() <= 1) {
            String strValueOf = String.valueOf(c10);
            AbstractC6492s.g(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            AbstractC6492s.h(upperCase, "toUpperCase(...)");
            return !AbstractC6492s.d(strE, upperCase) ? strE : String.valueOf(Character.toTitleCase(c10));
        }
        if (c10 == 329) {
            return strE;
        }
        char cCharAt = strE.charAt(0);
        AbstractC6492s.g(strE, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = strE.substring(1);
        AbstractC6492s.h(strSubstring, "substring(...)");
        AbstractC6492s.g(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        AbstractC6492s.h(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }

    public static final String e(char c10, Locale locale) {
        AbstractC6492s.i(locale, "locale");
        String strValueOf = String.valueOf(c10);
        AbstractC6492s.g(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        AbstractC6492s.h(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
