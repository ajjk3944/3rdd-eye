package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class e10 {

    /* renamed from: a, reason: collision with root package name */
    private final g10 f26615a;

    /* renamed from: b, reason: collision with root package name */
    private final is0 f26616b;

    /* renamed from: c, reason: collision with root package name */
    private final os1 f26617c;

    public e10() {
        this(0);
    }

    public final String a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return this.f26616b.a(context);
    }

    public final String b(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        String lowerCase = this.f26615a.a(context).name().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final String c(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return this.f26616b.c(context);
    }

    public final List<String> d(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return this.f26616b.b(context);
    }

    public /* synthetic */ e10(int i) {
        this(new g10(), new is0());
    }

    public static String a() {
        return Build.MANUFACTURER;
    }

    public final boolean c() {
        this.f26617c.getClass();
        return os1.a();
    }

    public static String b() {
        return Build.VERSION.RELEASE;
    }

    public e10(g10 deviceTypeProvider, is0 localeProvider) {
        kotlin.jvm.internal.l.f(deviceTypeProvider, "deviceTypeProvider");
        kotlin.jvm.internal.l.f(localeProvider, "localeProvider");
        this.f26615a = deviceTypeProvider;
        this.f26616b = localeProvider;
        this.f26617c = os1.f31497a;
    }
}
