package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.yandex.mobile.ads.impl.l11;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class um1 {

    /* renamed from: a, reason: collision with root package name */
    private static final l11 f34088a = l11.a.a();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f34089b = 0;

    public static void a(String format, Object... args) {
        kotlin.jvm.internal.l.f(format, "format");
        kotlin.jvm.internal.l.f(args, "args");
        if (fp0.a() || a11.f24364a.a()) {
            Locale locale = Locale.US;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            if (fp0.a()) {
                Log.w("Yandex Mobile Ads", str);
            }
            if (a11.f24364a.a()) {
                f34088a.a(z01.f36124c, "Yandex Mobile Ads", str);
            }
        }
    }
}
