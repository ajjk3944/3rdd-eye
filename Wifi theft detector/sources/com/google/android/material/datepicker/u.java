package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class u {

    /* renamed from: c, reason: collision with root package name */
    public static final u f10487c = new u(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final Long f10488a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeZone f10489b;

    public u(Long l10, TimeZone timeZone) {
        this.f10488a = l10;
        this.f10489b = timeZone;
    }

    public static u c() {
        return f10487c;
    }

    public Calendar a() {
        return b(this.f10489b);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f10488a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
