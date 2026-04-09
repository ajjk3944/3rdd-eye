package com.google.android.material.datepicker;

import java.util.Calendar;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5587b = 0;

    /* renamed from: a, reason: collision with root package name */
    public Long f5588a;

    static {
        long j = Month.d(1900, 0).f5585y;
        Calendar calendarC = y.c(null);
        calendarC.setTimeInMillis(j);
        y.a(calendarC).getTimeInMillis();
        long j7 = Month.d(2100, 11).f5585y;
        Calendar calendarC2 = y.c(null);
        calendarC2.setTimeInMillis(j7);
        y.a(calendarC2).getTimeInMillis();
    }
}
