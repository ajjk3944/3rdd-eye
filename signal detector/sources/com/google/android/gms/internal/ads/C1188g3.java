package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.g3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1188g3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f14190a = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f14191b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f14192c;

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f14193d;

    static {
        String str = Vt.f12096a;
        Locale locale = Locale.US;
        f14191b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f14192c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f14193d = Pattern.compile("\\\\an(\\d+)");
    }
}
