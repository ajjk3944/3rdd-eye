package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class m implements Comparable, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new A3.q(27);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f18319a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18320b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18321c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18322d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18323e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18324f;

    /* renamed from: g, reason: collision with root package name */
    public String f18325g;

    public m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = u.a(calendar);
        this.f18319a = calendarA;
        this.f18320b = calendarA.get(2);
        this.f18321c = calendarA.get(1);
        this.f18322d = calendarA.getMaximum(7);
        this.f18323e = calendarA.getActualMaximum(5);
        this.f18324f = calendarA.getTimeInMillis();
    }

    public static m a(int i, int i3) {
        Calendar calendarC = u.c(null);
        calendarC.set(1, i);
        calendarC.set(2, i3);
        return new m(calendarC);
    }

    public static m b(long j6) {
        Calendar calendarC = u.c(null);
        calendarC.setTimeInMillis(j6);
        return new m(calendarC);
    }

    public final String c() {
        String dateTime;
        if (this.f18325g == null) {
            long timeInMillis = this.f18319a.getTimeInMillis();
            if (Build.VERSION.SDK_INT >= 24) {
                Locale locale = Locale.getDefault();
                AtomicReference atomicReference = u.f18340a;
                DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
                instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
                DisplayContext unused = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
                instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
                dateTime = instanceForSkeleton.format(new Date(timeInMillis));
            } else {
                dateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
            }
            this.f18325g = dateTime;
        }
        return this.f18325g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f18319a.compareTo(((m) obj).f18319a);
    }

    public final int d(m mVar) {
        if (!(this.f18319a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (mVar.f18320b - this.f18320b) + ((mVar.f18321c - this.f18321c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f18320b == mVar.f18320b && this.f18321c == mVar.f18321c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18320b), Integer.valueOf(this.f18321c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18321c);
        parcel.writeInt(this.f18320b);
    }
}
