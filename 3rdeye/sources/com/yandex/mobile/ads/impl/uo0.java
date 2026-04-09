package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.yandex.mobile.ads.impl.l11;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class uo0 {

    /* renamed from: a, reason: collision with root package name */
    private static final l11 f34167a = l11.a.a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f34168b = "YandexAds";

    /* renamed from: c, reason: collision with root package name */
    private static boolean f34169c = true;

    private static String a(String str) {
        return androidx.work.s.d("[Integration] ", str);
    }

    public static final void b(String format, Object... args) {
        kotlin.jvm.internal.l.f(format, "format");
        kotlin.jvm.internal.l.f(args, "args");
        if (f34169c || a11.f24364a.a()) {
            Locale locale = Locale.US;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String strA = a(String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
            if (f34169c) {
                Log.i(f34168b, strA);
            }
            if (a11.f24364a.a()) {
                f34167a.a(z01.f36123b, f34168b, strA);
            }
        }
    }

    public static final void c(String format, Object... args) {
        kotlin.jvm.internal.l.f(format, "format");
        kotlin.jvm.internal.l.f(args, "args");
        if (f34169c || a11.f24364a.a()) {
            Locale locale = Locale.US;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String strA = a(String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
            if (f34169c) {
                Log.w(f34168b, strA);
            }
            if (a11.f24364a.a()) {
                f34167a.a(z01.f36124c, f34168b, strA);
            }
        }
    }

    public static final void a(boolean z10) {
        f34169c = z10;
    }

    public static final void a(String format, Object... args) {
        kotlin.jvm.internal.l.f(format, "format");
        kotlin.jvm.internal.l.f(args, "args");
        if (f34169c || a11.f24364a.a()) {
            Locale locale = Locale.US;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String strA = a(String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
            if (f34169c) {
                Log.e(f34168b, strA);
            }
            if (a11.f24364a.a()) {
                f34167a.a(z01.f36125d, f34168b, strA);
            }
        }
    }
}
