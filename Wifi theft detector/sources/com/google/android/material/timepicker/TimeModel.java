package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final c f11474a;

    /* renamed from: b, reason: collision with root package name */
    public final c f11475b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11476c;

    /* renamed from: d, reason: collision with root package name */
    public int f11477d;

    /* renamed from: e, reason: collision with root package name */
    public int f11478e;

    /* renamed from: f, reason: collision with root package name */
    public int f11479f;

    /* renamed from: g, reason: collision with root package name */
    public int f11480g;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i10) {
            return new TimeModel[i10];
        }
    }

    public TimeModel(int i10, int i11, int i12, int i13) {
        this.f11477d = i10;
        this.f11478e = i11;
        this.f11479f = i12;
        this.f11476c = i13;
        this.f11480g = g(i10);
        this.f11474a = new c(59);
        this.f11475b = new c(i13 == 1 ? 23 : 12);
    }

    public static String c(Resources resources, CharSequence charSequence) {
        return e(resources, charSequence, "%02d");
    }

    public static String e(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static int g(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f11477d == timeModel.f11477d && this.f11478e == timeModel.f11478e && this.f11476c == timeModel.f11476c && this.f11479f == timeModel.f11479f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11476c), Integer.valueOf(this.f11477d), Integer.valueOf(this.f11478e), Integer.valueOf(this.f11479f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11477d);
        parcel.writeInt(this.f11478e);
        parcel.writeInt(this.f11479f);
        parcel.writeInt(this.f11476c);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
