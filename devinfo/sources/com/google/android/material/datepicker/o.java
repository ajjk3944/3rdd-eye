package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.i0;
import com.google.android.gms.internal.measurement.j4;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o implements Comparable, Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new i0(11);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f20490a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20491b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20492c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20493d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20494e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20495f;
    public String g;

    public o(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = w.a(calendar);
        this.f20490a = calendarA;
        this.f20491b = calendarA.get(2);
        this.f20492c = calendarA.get(1);
        this.f20493d = calendarA.getMaximum(7);
        this.f20494e = calendarA.getActualMaximum(5);
        this.f20495f = calendarA.getTimeInMillis();
    }

    public static o a(int i4, int i10) {
        Calendar calendarC = w.c(null);
        calendarC.set(1, i4);
        calendarC.set(2, i10);
        return new o(calendarC);
    }

    public static o b(long j) {
        Calendar calendarC = w.c(null);
        calendarC.setTimeInMillis(j);
        return new o(calendarC);
    }

    public final String c() {
        if (this.g == null) {
            this.g = j4.m(this.f20490a.getTimeInMillis());
        }
        return this.g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f20490a.compareTo(((o) obj).f20490a);
    }

    public final int d(o oVar) {
        if (!(this.f20490a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (oVar.f20491b - this.f20491b) + ((oVar.f20492c - this.f20492c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f20491b == oVar.f20491b && this.f20492c == oVar.f20492c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20491b), Integer.valueOf(this.f20492c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f20492c);
        parcel.writeInt(this.f20491b);
    }
}
