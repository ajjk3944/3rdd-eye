package com.survicate.surveys.utils;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import i6.a;
import java.util.Calendar;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/survicate/surveys/utils/SurvicateLocalDate;", "Landroid/os/Parcelable;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurvicateLocalDate implements Parcelable {
    public static final Parcelable.Creator<SurvicateLocalDate> CREATOR = new a(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f6603a;

    /* renamed from: d, reason: collision with root package name */
    public final int f6604d;

    /* renamed from: g, reason: collision with root package name */
    public final int f6605g;

    public SurvicateLocalDate(int i10, int i11, int i12) {
        this.f6603a = i10;
        this.f6604d = i11;
        this.f6605g = i12;
    }

    public final Calendar d() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.set(1, this.f6603a);
        calendar.set(2, this.f6604d - 1);
        calendar.set(5, this.f6605g);
        return calendar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurvicateLocalDate)) {
            return false;
        }
        SurvicateLocalDate survicateLocalDate = (SurvicateLocalDate) obj;
        return this.f6603a == survicateLocalDate.f6603a && this.f6604d == survicateLocalDate.f6604d && this.f6605g == survicateLocalDate.f6605g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6605g) + c7.a.C(this.f6604d, Integer.hashCode(this.f6603a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SurvicateLocalDate(year=");
        sb2.append(this.f6603a);
        sb2.append(", month=");
        sb2.append(this.f6604d);
        sb2.append(", day=");
        return c7.a.q(sb2, this.f6605g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "out");
        parcel.writeInt(this.f6603a);
        parcel.writeInt(this.f6604d);
        parcel.writeInt(this.f6605g);
    }
}
