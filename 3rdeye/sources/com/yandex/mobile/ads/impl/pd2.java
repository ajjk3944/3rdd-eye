package com.yandex.mobile.ads.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class pd2 {
    public static final Long a(String str) {
        if (str != null) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                return Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
            } catch (ParseException unused) {
                fp0.c(new Object[0]);
            }
        }
        return null;
    }

    public static final Integer b(String str) {
        if (str != null) {
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                fp0.c(new Object[0]);
            }
        }
        return null;
    }

    public static final void a(Object obj) {
        if (obj != null) {
            return;
        }
        a();
        throw null;
    }

    private static void a() {
        throw new IllegalArgumentException("AdBreak not set!");
    }
}
