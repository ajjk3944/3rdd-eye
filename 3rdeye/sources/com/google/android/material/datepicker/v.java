package com.google.android.material.datepicker;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* compiled from: Month.java */
/* loaded from: classes2.dex */
public final class v implements Comparable<v>, Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f22875b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22876c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22877d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22878e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22879f;

    /* renamed from: g, reason: collision with root package name */
    public final long f22880g;

    /* renamed from: h, reason: collision with root package name */
    public String f22881h;

    /* compiled from: Month.java */
    public class a implements Parcelable.Creator<v> {
        @Override // android.os.Parcelable.Creator
        public final v createFromParcel(Parcel parcel) {
            return v.a(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final v[] newArray(int i) {
            return new v[i];
        }
    }

    public v(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = E.c(calendar);
        this.f22875b = calendarC;
        this.f22876c = calendarC.get(2);
        this.f22877d = calendarC.get(1);
        this.f22878e = calendarC.getMaximum(7);
        this.f22879f = calendarC.getActualMaximum(5);
        this.f22880g = calendarC.getTimeInMillis();
    }

    public static v a(int i, int i10) {
        Calendar calendarE = E.e(null);
        calendarE.set(1, i);
        calendarE.set(2, i10);
        return new v(calendarE);
    }

    public static v b(long j4) {
        Calendar calendarE = E.e(null);
        calendarE.setTimeInMillis(j4);
        return new v(calendarE);
    }

    public final String c() {
        if (this.f22881h == null) {
            long timeInMillis = this.f22875b.getTimeInMillis();
            this.f22881h = Build.VERSION.SDK_INT >= 24 ? E.b("yMMMM", Locale.getDefault()).format(new Date(timeInMillis)) : DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        return this.f22881h;
    }

    @Override // java.lang.Comparable
    public final int compareTo(v vVar) {
        return this.f22875b.compareTo(vVar.f22875b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e(v vVar) {
        if (!(this.f22875b instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (vVar.f22876c - this.f22876c) + ((vVar.f22877d - this.f22877d) * 12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f22876c == vVar.f22876c && this.f22877d == vVar.f22877d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f22876c), Integer.valueOf(this.f22877d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f22877d);
        parcel.writeInt(this.f22876c);
    }
}
