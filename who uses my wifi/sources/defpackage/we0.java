package defpackage;

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

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class we0 implements Comparable, Parcelable {
    public static final Parcelable.Creator<we0> CREATOR = new k2(21);
    public final Calendar f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public String l;

    public we0(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = g41.a(calendar);
        this.f = calendarA;
        this.g = calendarA.get(2);
        this.h = calendarA.get(1);
        this.i = calendarA.getMaximum(7);
        this.j = calendarA.getActualMaximum(5);
        this.k = calendarA.getTimeInMillis();
    }

    public static we0 a(int i, int i2) {
        Calendar calendarC = g41.c(null);
        calendarC.set(1, i);
        calendarC.set(2, i2);
        return new we0(calendarC);
    }

    public static we0 b(long j) {
        Calendar calendarC = g41.c(null);
        calendarC.setTimeInMillis(j);
        return new we0(calendarC);
    }

    public final String c() {
        if (this.l == null) {
            long timeInMillis = this.f.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = g41.a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.l = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.l;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f.compareTo(((we0) obj).f);
    }

    public final int d(we0 we0Var) {
        if (!(this.f instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (we0Var.g - this.g) + ((we0Var.h - this.h) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we0)) {
            return false;
        }
        we0 we0Var = (we0) obj;
        return this.g == we0Var.g && this.h == we0Var.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.h);
        parcel.writeInt(this.g);
    }
}
