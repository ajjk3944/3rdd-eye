package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class j {
    public static r0.e a(Long l10, Long l11) {
        return b(l10, l11, null);
    }

    public static r0.e b(Long l10, Long l11, SimpleDateFormat simpleDateFormat) {
        if (l10 == null && l11 == null) {
            return r0.e.a(null, null);
        }
        if (l10 == null) {
            return r0.e.a(null, d(l11.longValue(), simpleDateFormat));
        }
        if (l11 == null) {
            return r0.e.a(d(l10.longValue(), simpleDateFormat), null);
        }
        Calendar calendarP = a0.p();
        Calendar calendarR = a0.r();
        calendarR.setTimeInMillis(l10.longValue());
        Calendar calendarR2 = a0.r();
        calendarR2.setTimeInMillis(l11.longValue());
        if (simpleDateFormat != null) {
            return r0.e.a(simpleDateFormat.format(new Date(l10.longValue())), simpleDateFormat.format(new Date(l11.longValue())));
        }
        return calendarR.get(1) == calendarR2.get(1) ? calendarR.get(1) == calendarP.get(1) ? r0.e.a(g(l10.longValue(), Locale.getDefault()), g(l11.longValue(), Locale.getDefault())) : r0.e.a(g(l10.longValue(), Locale.getDefault()), n(l11.longValue(), Locale.getDefault())) : r0.e.a(n(l10.longValue(), Locale.getDefault()), n(l11.longValue(), Locale.getDefault()));
    }

    public static String c(long j10) {
        return d(j10, null);
    }

    public static String d(long j10, SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j10)) : q(j10) ? f(j10) : m(j10);
    }

    public static String e(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String strJ = j(j10);
        if (z10) {
            strJ = String.format(context.getString(j4.j.mtrl_picker_today_description), strJ);
        }
        return z11 ? String.format(context.getString(j4.j.mtrl_picker_start_date_description), strJ) : z12 ? String.format(context.getString(j4.j.mtrl_picker_end_date_description), strJ) : strJ;
    }

    public static String f(long j10) {
        return g(j10, Locale.getDefault());
    }

    public static String g(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? a0.c(locale).format(new Date(j10)) : a0.l(locale).format(new Date(j10));
    }

    public static String h(long j10) {
        return i(j10, Locale.getDefault());
    }

    public static String i(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? a0.m(locale).format(new Date(j10)) : a0.j(locale).format(new Date(j10));
    }

    public static String j(long j10) {
        return q(j10) ? h(j10) : o(j10);
    }

    public static String k(Context context, int i10) {
        return a0.p().get(1) == i10 ? String.format(context.getString(j4.j.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i10)) : String.format(context.getString(j4.j.mtrl_picker_navigate_to_year_description), Integer.valueOf(i10));
    }

    public static String l(long j10) {
        return Build.VERSION.SDK_INT >= 24 ? a0.u(Locale.getDefault()).format(new Date(j10)) : DateUtils.formatDateTime(null, j10, 8228);
    }

    public static String m(long j10) {
        return n(j10, Locale.getDefault());
    }

    public static String n(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? a0.t(locale).format(new Date(j10)) : a0.k(locale).format(new Date(j10));
    }

    public static String o(long j10) {
        return p(j10, Locale.getDefault());
    }

    public static String p(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? a0.v(locale).format(new Date(j10)) : a0.j(locale).format(new Date(j10));
    }

    public static boolean q(long j10) {
        Calendar calendarP = a0.p();
        Calendar calendarR = a0.r();
        calendarR.setTimeInMillis(j10);
        return calendarP.get(1) == calendarR.get(1);
    }
}
