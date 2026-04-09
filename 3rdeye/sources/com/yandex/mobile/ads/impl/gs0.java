package com.yandex.mobile.ads.impl;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class gs0 {
    public static String a(Locale locale) {
        kotlin.jvm.internal.l.f(locale, "locale");
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        String script = locale.getScript();
        if (script != null && script.length() != 0) {
            sb.append('-');
            sb.append(script);
        }
        if (country != null && country.length() != 0) {
            sb.append('_');
            sb.append(country);
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        return string;
    }
}
