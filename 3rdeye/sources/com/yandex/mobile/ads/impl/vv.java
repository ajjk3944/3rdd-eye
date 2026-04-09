package com.yandex.mobile.ads.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class vv {

    /* renamed from: a, reason: collision with root package name */
    private static final a f34708a = new a();

    public static final class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        public final DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(t82.f33483d);
            return simpleDateFormat;
        }
    }

    public static final String a(Date date) {
        kotlin.jvm.internal.l.f(date, "<this>");
        String str = f34708a.get().format(date);
        kotlin.jvm.internal.l.e(str, "format(...)");
        return str;
    }
}
