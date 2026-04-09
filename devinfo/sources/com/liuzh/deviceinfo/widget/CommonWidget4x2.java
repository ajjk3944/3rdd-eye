package com.liuzh.deviceinfo.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.style.AbsoluteSizeSpan;
import bi.d;
import com.liuzh.deviceinfo.DeviceInfoApp;
import java.util.Calendar;
import java.util.Locale;
import je.u;
import oi.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class CommonWidget4x2 extends AppWidgetProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21393a = 0;

    public static String a() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getDisplayName(7, 2, Locale.getDefault()) + ", " + calendar.getDisplayName(2, 2, Locale.getDefault()) + " " + calendar.get(5);
    }

    public static CharSequence b() {
        String str;
        Calendar calendar = Calendar.getInstance();
        int i4 = calendar.get(11);
        if (DateFormat.is24HourFormat(DeviceInfoApp.f21145f)) {
            str = "";
        } else {
            str = "pm";
            if (i4 > 12) {
                i4 -= 12;
            } else if (i4 != 12) {
                str = "am";
            }
        }
        String strR = i4 < 10 ? u.r(i4, "0") : String.valueOf(i4);
        int i10 = calendar.get(12);
        String str2 = strR + ":" + (i10 < 10 ? u.r(i10, "0") : String.valueOf(i10)) + str;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new AbsoluteSizeSpan(10, true), str2.length() - str.length(), str2.length(), 33);
        return spannableString;
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        d.c(new a(this, iArr, context, appWidgetManager, 2));
    }
}
