package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes2.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f10395a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10396b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10397c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10398d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10399e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10400f;

    /* renamed from: g, reason: collision with root package name */
    public String f10401g;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(Parcel parcel) {
            return Month.g(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i10) {
            return new Month[i10];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarF = a0.f(calendar);
        this.f10395a = calendarF;
        this.f10396b = calendarF.get(2);
        this.f10397c = calendarF.get(1);
        this.f10398d = calendarF.getMaximum(7);
        this.f10399e = calendarF.getActualMaximum(5);
        this.f10400f = calendarF.getTimeInMillis();
    }

    public static Month g(int i10, int i11) {
        Calendar calendarR = a0.r();
        calendarR.set(1, i10);
        calendarR.set(2, i11);
        return new Month(calendarR);
    }

    public static Month h(long j10) {
        Calendar calendarR = a0.r();
        calendarR.setTimeInMillis(j10);
        return new Month(calendarR);
    }

    public static Month i() {
        return new Month(a0.p());
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(Month month) {
        return this.f10395a.compareTo(month.f10395a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f10396b == month.f10396b && this.f10397c == month.f10397c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10396b), Integer.valueOf(this.f10397c)});
    }

    public int j(int i10) {
        int i11 = this.f10395a.get(7);
        if (i10 <= 0) {
            i10 = this.f10395a.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f10398d : i12;
    }

    public long q(int i10) {
        Calendar calendarF = a0.f(this.f10395a);
        calendarF.set(5, i10);
        return calendarF.getTimeInMillis();
    }

    public int r(long j10) {
        Calendar calendarF = a0.f(this.f10395a);
        calendarF.setTimeInMillis(j10);
        return calendarF.get(5);
    }

    public String s() {
        if (this.f10401g == null) {
            this.f10401g = j.l(this.f10395a.getTimeInMillis());
        }
        return this.f10401g;
    }

    public long t() {
        return this.f10395a.getTimeInMillis();
    }

    public Month u(int i10) {
        Calendar calendarF = a0.f(this.f10395a);
        calendarF.add(2, i10);
        return new Month(calendarF);
    }

    public int v(Month month) {
        if (this.f10395a instanceof GregorianCalendar) {
            return ((month.f10397c - this.f10397c) * 12) + (month.f10396b - this.f10396b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f10397c);
        parcel.writeInt(this.f10396b);
    }
}
