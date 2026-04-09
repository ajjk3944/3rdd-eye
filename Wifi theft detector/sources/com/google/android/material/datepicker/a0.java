package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static AtomicReference f10430a = new AtomicReference();

    public static long a(long j10) {
        Calendar calendarR = r();
        calendarR.setTimeInMillis(j10);
        return f(calendarR).getTimeInMillis();
    }

    public static int b(String str, String str2, int i10, int i11) {
        while (i11 >= 0 && i11 < str.length() && str2.indexOf(str.charAt(i11)) == -1) {
            if (str.charAt(i11) == '\'') {
                do {
                    i11 += i10;
                    if (i11 < 0 || i11 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i11) != '\'');
            }
            i11 += i10;
        }
        return i11;
    }

    public static DateFormat c(Locale locale) {
        return d("MMMd", locale);
    }

    public static DateFormat d(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(q());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    public static String e(String str) {
        return str.replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y");
    }

    public static Calendar f(Calendar calendar) {
        Calendar calendarS = s(calendar);
        Calendar calendarR = r();
        calendarR.set(calendarS.get(1), calendarS.get(2), calendarS.get(5));
        return calendarR;
    }

    public static SimpleDateFormat g() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(e(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern()), Locale.getDefault());
        simpleDateFormat.setTimeZone(o());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static String h(Resources resources, SimpleDateFormat simpleDateFormat) throws Resources.NotFoundException {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(j4.j.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(j4.j.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(j4.j.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D).replaceAll("M+", "M").replaceAll("y+", "y");
        }
        return pattern.replace(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, string3).replace("M", string2).replace("y", string);
    }

    public static java.text.DateFormat i(int i10, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i10, locale);
        dateInstance.setTimeZone(o());
        return dateInstance;
    }

    public static java.text.DateFormat j(Locale locale) {
        return i(0, locale);
    }

    public static java.text.DateFormat k(Locale locale) {
        return i(2, locale);
    }

    public static java.text.DateFormat l(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) k(locale);
        simpleDateFormat.applyPattern(w(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    public static DateFormat m(Locale locale) {
        return d("MMMMEEEEd", locale);
    }

    public static u n() {
        u uVar = (u) f10430a.get();
        return uVar == null ? u.c() : uVar;
    }

    public static TimeZone o() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar p() {
        Calendar calendarA = n().a();
        calendarA.set(11, 0);
        calendarA.set(12, 0);
        calendarA.set(13, 0);
        calendarA.set(14, 0);
        calendarA.setTimeZone(o());
        return calendarA;
    }

    public static android.icu.util.TimeZone q() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar r() {
        return s(null);
    }

    public static Calendar s(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(o());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    public static DateFormat t(Locale locale) {
        return d("yMMMd", locale);
    }

    public static DateFormat u(Locale locale) {
        return d("yMMMM", locale);
    }

    public static DateFormat v(Locale locale) {
        return d("yMMMMEEEEd", locale);
    }

    public static String w(String str) {
        int iB = b(str, "yY", 1, 0);
        if (iB >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int iB2 = b(str, "EMd", 1, iB);
        if (iB2 < str.length()) {
            str2 = "EMd,";
        }
        return str.replace(str.substring(b(str, str2, -1, iB) + 1, iB2), " ").trim();
    }
}
