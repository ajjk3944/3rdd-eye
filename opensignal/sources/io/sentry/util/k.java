package io.sentry.util;

import java.nio.charset.Charset;
import java.text.StringCharacterIterator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f12817a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f12818b = Pattern.compile("[\\W_]+");

    public static String a(long j) {
        if (-1000 < j && j < 1000) {
            return j + " B";
        }
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("kMGTPE");
        while (true) {
            if (j > -999950 && j < 999950) {
                return String.format(Locale.ROOT, "%.1f %cB", Double.valueOf(j / 1000.0d), Character.valueOf(stringCharacterIterator.current()));
            }
            j /= 1000;
            stringCharacterIterator.next();
        }
    }

    public static String b(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb2.append(strSubstring.toUpperCase(locale));
        sb2.append(str.substring(1).toLowerCase(locale));
        return sb2.toString();
    }

    public static String c(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            sb2.append((CharSequence) it.next());
            while (it.hasNext()) {
                sb2.append((CharSequence) ",");
                sb2.append((CharSequence) it.next());
            }
        }
        return sb2.toString();
    }

    public static String d(String str) {
        return (str != null && str.startsWith("\"") && str.endsWith("\"")) ? str.substring(1, str.length() - 1) : str;
    }
}
