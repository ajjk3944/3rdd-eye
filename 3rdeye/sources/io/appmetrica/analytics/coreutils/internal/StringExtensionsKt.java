package io.appmetrica.analytics.coreutils.internal;

import java.util.Locale;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class StringExtensionsKt {
    public static final String replaceFirstCharWithTitleCase(String str) {
        return replaceFirstCharWithTitleCase(str, Locale.US);
    }

    public static final String replaceFirstCharWithTitleCase(String str, Locale locale) {
        String strValueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            l.f(locale, "locale");
            String strValueOf2 = String.valueOf(cCharAt);
            l.d(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            strValueOf = strValueOf2.toUpperCase(locale);
            l.e(strValueOf, "toUpperCase(...)");
            if (strValueOf.length() <= 1) {
                String strValueOf3 = String.valueOf(cCharAt);
                l.d(strValueOf3, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf3.toUpperCase(Locale.ROOT);
                l.e(upperCase, "toUpperCase(...)");
                if (strValueOf.equals(upperCase)) {
                    strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                }
            } else if (cCharAt != 329) {
                char cCharAt2 = strValueOf.charAt(0);
                String strSubstring = strValueOf.substring(1);
                l.e(strSubstring, "substring(...)");
                String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
                l.e(lowerCase, "toLowerCase(...)");
                strValueOf = cCharAt2 + lowerCase;
            }
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb.append((Object) strValueOf);
        sb.append(str.substring(1));
        return sb.toString();
    }
}
