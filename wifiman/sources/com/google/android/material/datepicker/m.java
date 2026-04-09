package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes3.dex */
final class m implements Comparable, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Calendar f37444a;

    /* renamed from: b, reason: collision with root package name */
    final int f37445b;

    /* renamed from: c, reason: collision with root package name */
    final int f37446c;

    /* renamed from: d, reason: collision with root package name */
    final int f37447d;

    /* renamed from: e, reason: collision with root package name */
    final int f37448e;

    /* renamed from: f, reason: collision with root package name */
    final long f37449f;

    /* renamed from: g, reason: collision with root package name */
    private String f37450g;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return m.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    private m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = t.c(calendar);
        this.f37444a = calendarC;
        this.f37445b = calendarC.get(2);
        this.f37446c = calendarC.get(1);
        this.f37447d = calendarC.getMaximum(7);
        this.f37448e = calendarC.getActualMaximum(5);
        this.f37449f = calendarC.getTimeInMillis();
    }

    static m b(int i10, int i11) {
        Calendar calendarI = t.i();
        calendarI.set(1, i10);
        calendarI.set(2, i11);
        return new m(calendarI);
    }

    static m c(long j10) {
        Calendar calendarI = t.i();
        calendarI.setTimeInMillis(j10);
        return new m(calendarI);
    }

    static m d() {
        return new m(t.g());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(m mVar) {
        return this.f37444a.compareTo(mVar.f37444a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f37445b == mVar.f37445b && this.f37446c == mVar.f37446c;
    }

    int g(int i10) {
        int i11 = this.f37444a.get(7);
        if (i10 <= 0) {
            i10 = this.f37444a.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f37447d : i12;
    }

    long h(int i10) {
        Calendar calendarC = t.c(this.f37444a);
        calendarC.set(5, i10);
        return calendarC.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f37445b), Integer.valueOf(this.f37446c)});
    }

    int j(long j10) {
        Calendar calendarC = t.c(this.f37444a);
        calendarC.setTimeInMillis(j10);
        return calendarC.get(5);
    }

    String l() {
        if (this.f37450g == null) {
            this.f37450g = e.f(this.f37444a.getTimeInMillis());
        }
        return this.f37450g;
    }

    long n() {
        return this.f37444a.getTimeInMillis();
    }

    m p(int i10) {
        Calendar calendarC = t.c(this.f37444a);
        calendarC.add(2, i10);
        return new m(calendarC);
    }

    int r(m mVar) {
        if (this.f37444a instanceof GregorianCalendar) {
            return ((mVar.f37446c - this.f37446c) * 12) + (mVar.f37445b - this.f37445b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f37446c);
        parcel.writeInt(this.f37445b);
    }
}
