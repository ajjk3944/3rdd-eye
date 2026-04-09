package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import b9.m;
import d9.C4284b;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class is0 {

    /* renamed from: a, reason: collision with root package name */
    private final gs0 f28860a = new gs0();

    public final String a(Context context) {
        Object objA;
        kotlin.jvm.internal.l.f(context, "context");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                Object systemService = context.getSystemService(CommonUrlParts.LOCALE);
                kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.app.LocaleManager");
                LocaleList applicationLocales = J8.G.a(systemService).getApplicationLocales();
                kotlin.jvm.internal.l.e(applicationLocales, "getApplicationLocales(...)");
                if (applicationLocales.isEmpty()) {
                    Locale locale = context.getResources().getConfiguration().locale;
                    gs0 gs0Var = this.f28860a;
                    kotlin.jvm.internal.l.c(locale);
                    gs0Var.getClass();
                    objA = gs0.a(locale);
                } else {
                    gs0 gs0Var2 = this.f28860a;
                    Locale locale2 = applicationLocales.get(0);
                    kotlin.jvm.internal.l.e(locale2, "get(...)");
                    gs0Var2.getClass();
                    objA = gs0.a(locale2);
                }
            } else {
                objA = c(context);
            }
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (objA instanceof m.a) {
            objA = null;
        }
        return (String) objA;
    }

    public final List<String> b(Context context) {
        Object objA;
        kotlin.jvm.internal.l.f(context, "context");
        try {
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (Build.VERSION.SDK_INT < 24) {
            gs0 gs0Var = this.f28860a;
            Locale locale = context.getResources().getConfiguration().locale;
            kotlin.jvm.internal.l.e(locale, "locale");
            gs0Var.getClass();
            objA = E.u.G(gs0.a(locale));
            if (objA instanceof m.a) {
                objA = null;
            }
            return (List) objA;
        }
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        kotlin.jvm.internal.l.e(locales, "getLocales(...)");
        C4284b c4284bU = E.u.u();
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            gs0 gs0Var2 = this.f28860a;
            Locale locale2 = locales.get(i);
            kotlin.jvm.internal.l.e(locale2, "get(...)");
            gs0Var2.getClass();
            c4284bU.add(gs0.a(locale2));
        }
        return E.u.m(c4284bU);
    }

    public final String c(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        Locale locale = context.getResources().getConfiguration().locale;
        gs0 gs0Var = this.f28860a;
        kotlin.jvm.internal.l.c(locale);
        gs0Var.getClass();
        return gs0.a(locale);
    }
}
