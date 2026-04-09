package s9;

import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class c0 {
    public static final String a(char c10) {
        String strValueOf = String.valueOf(c10);
        kotlin.jvm.internal.p.c(strValueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        kotlin.jvm.internal.p.d(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c10));
        }
        if (c10 == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        kotlin.jvm.internal.p.c(upperCase, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = upperCase.substring(1);
        kotlin.jvm.internal.p.d(strSubstring, "substring(...)");
        kotlin.jvm.internal.p.c(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        kotlin.jvm.internal.p.d(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }
}
