package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes3.dex */
class s {

    /* renamed from: c, reason: collision with root package name */
    private static final s f37466c = new s(null, null);

    /* renamed from: a, reason: collision with root package name */
    private final Long f37467a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeZone f37468b;

    private s(Long l10, TimeZone timeZone) {
        this.f37467a = l10;
        this.f37468b = timeZone;
    }

    static s c() {
        return f37466c;
    }

    Calendar a() {
        return b(this.f37468b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f37467a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
