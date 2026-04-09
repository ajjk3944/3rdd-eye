package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();
    public final int B;

    /* renamed from: a, reason: collision with root package name */
    public final Month f5572a;

    /* renamed from: d, reason: collision with root package name */
    public final Month f5573d;

    /* renamed from: g, reason: collision with root package name */
    public final DateValidator f5574g;

    /* renamed from: r, reason: collision with root package name */
    public final Month f5575r;

    /* renamed from: x, reason: collision with root package name */
    public final int f5576x;

    /* renamed from: y, reason: collision with root package name */
    public final int f5577y;

    public interface DateValidator extends Parcelable {
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f5572a = month;
        this.f5573d = month2;
        this.f5575r = month3;
        this.f5576x = i10;
        this.f5574g = dateValidator;
        if (month3 != null && month.f5580a.compareTo(month3.f5580a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.f5580a.compareTo(month2.f5580a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > y.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.B = month.g(month2) + 1;
        this.f5577y = (month2.f5582g - month.f5582g) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f5572a.equals(calendarConstraints.f5572a) && this.f5573d.equals(calendarConstraints.f5573d) && Objects.equals(this.f5575r, calendarConstraints.f5575r) && this.f5576x == calendarConstraints.f5576x && this.f5574g.equals(calendarConstraints.f5574g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5572a, this.f5573d, this.f5575r, Integer.valueOf(this.f5576x), this.f5574g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f5572a, 0);
        parcel.writeParcelable(this.f5573d, 0);
        parcel.writeParcelable(this.f5575r, 0);
        parcel.writeParcelable(this.f5574g, 0);
        parcel.writeInt(this.f5576x);
    }
}
