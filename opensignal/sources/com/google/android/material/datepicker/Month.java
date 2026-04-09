package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new q(0);
    public String B;

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f5580a;

    /* renamed from: d, reason: collision with root package name */
    public final int f5581d;

    /* renamed from: g, reason: collision with root package name */
    public final int f5582g;

    /* renamed from: r, reason: collision with root package name */
    public final int f5583r;

    /* renamed from: x, reason: collision with root package name */
    public final int f5584x;

    /* renamed from: y, reason: collision with root package name */
    public final long f5585y;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = y.a(calendar);
        this.f5580a = calendarA;
        this.f5581d = calendarA.get(2);
        this.f5582g = calendarA.get(1);
        this.f5583r = calendarA.getMaximum(7);
        this.f5584x = calendarA.getActualMaximum(5);
        this.f5585y = calendarA.getTimeInMillis();
    }

    public static Month d(int i10, int i11) {
        Calendar calendarC = y.c(null);
        calendarC.set(1, i10);
        calendarC.set(2, i11);
        return new Month(calendarC);
    }

    public static Month e(long j) {
        Calendar calendarC = y.c(null);
        calendarC.setTimeInMillis(j);
        return new Month(calendarC);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Month month) {
        return this.f5580a.compareTo(month.f5580a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f5581d == month.f5581d && this.f5582g == month.f5582g;
    }

    public final String f() {
        if (this.B == null) {
            long timeInMillis = this.f5580a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = y.f5640a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.B = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.B;
    }

    public final int g(Month month) {
        if (!(this.f5580a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month.f5581d - this.f5581d) + ((month.f5582g - this.f5582g) * 12);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5581d), Integer.valueOf(this.f5582g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5582g);
        parcel.writeInt(this.f5581d);
    }
}
