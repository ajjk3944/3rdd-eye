package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Month f10299a;

    /* renamed from: b, reason: collision with root package name */
    public final Month f10300b;

    /* renamed from: c, reason: collision with root package name */
    public final DateValidator f10301c;

    /* renamed from: d, reason: collision with root package name */
    public Month f10302d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10303e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10304f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10305g;

    public interface DateValidator extends Parcelable {
        boolean f(long j10);
    }

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    }

    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        public static final long f10306f = a0.a(Month.g(1900, 0).f10400f);

        /* renamed from: g, reason: collision with root package name */
        public static final long f10307g = a0.a(Month.g(AdError.BROKEN_MEDIA_ERROR_CODE, 11).f10400f);

        /* renamed from: a, reason: collision with root package name */
        public long f10308a;

        /* renamed from: b, reason: collision with root package name */
        public long f10309b;

        /* renamed from: c, reason: collision with root package name */
        public Long f10310c;

        /* renamed from: d, reason: collision with root package name */
        public int f10311d;

        /* renamed from: e, reason: collision with root package name */
        public DateValidator f10312e;

        public b(CalendarConstraints calendarConstraints) {
            this.f10308a = f10306f;
            this.f10309b = f10307g;
            this.f10312e = DateValidatorPointForward.c(Long.MIN_VALUE);
            this.f10308a = calendarConstraints.f10299a.f10400f;
            this.f10309b = calendarConstraints.f10300b.f10400f;
            this.f10310c = Long.valueOf(calendarConstraints.f10302d.f10400f);
            this.f10311d = calendarConstraints.f10303e;
            this.f10312e = calendarConstraints.f10301c;
        }

        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f10312e);
            Month monthH = Month.h(this.f10308a);
            Month monthH2 = Month.h(this.f10309b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f10310c;
            return new CalendarConstraints(monthH, monthH2, dateValidator, l10 == null ? null : Month.h(l10.longValue()), this.f10311d, null);
        }

        public b b(long j10) {
            this.f10310c = Long.valueOf(j10);
            return this;
        }
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10, a aVar) {
        this(month, month2, dateValidator, month3, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f10299a.equals(calendarConstraints.f10299a) && this.f10300b.equals(calendarConstraints.f10300b) && r0.d.a(this.f10302d, calendarConstraints.f10302d) && this.f10303e == calendarConstraints.f10303e && this.f10301c.equals(calendarConstraints.f10301c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10299a, this.f10300b, this.f10302d, Integer.valueOf(this.f10303e), this.f10301c});
    }

    public Month j(Month month) {
        return month.compareTo(this.f10299a) < 0 ? this.f10299a : month.compareTo(this.f10300b) > 0 ? this.f10300b : month;
    }

    public DateValidator q() {
        return this.f10301c;
    }

    public Month r() {
        return this.f10300b;
    }

    public int s() {
        return this.f10303e;
    }

    public int t() {
        return this.f10305g;
    }

    public Month u() {
        return this.f10302d;
    }

    public Month v() {
        return this.f10299a;
    }

    public int w() {
        return this.f10304f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f10299a, 0);
        parcel.writeParcelable(this.f10300b, 0);
        parcel.writeParcelable(this.f10302d, 0);
        parcel.writeParcelable(this.f10301c, 0);
        parcel.writeInt(this.f10303e);
    }

    public boolean x(long j10) {
        if (this.f10299a.q(1) > j10) {
            return false;
        }
        Month month = this.f10300b;
        return j10 <= month.q(month.f10399e);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f10299a = month;
        this.f10300b = month2;
        this.f10302d = month3;
        this.f10303e = i10;
        this.f10301c = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > a0.r().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f10305g = month.v(month2) + 1;
        this.f10304f = (month2.f10397c - month.f10397c) + 1;
    }
}
