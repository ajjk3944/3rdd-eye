package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: CalendarConstraints.java */
/* renamed from: com.google.android.material.datepicker.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4009a implements Parcelable {
    public static final Parcelable.Creator<C4009a> CREATOR = new C0342a();

    /* renamed from: b, reason: collision with root package name */
    public final v f22777b;

    /* renamed from: c, reason: collision with root package name */
    public final v f22778c;

    /* renamed from: d, reason: collision with root package name */
    public final c f22779d;

    /* renamed from: e, reason: collision with root package name */
    public final v f22780e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22781f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22782g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22783h;

    /* compiled from: CalendarConstraints.java */
    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    public class C0342a implements Parcelable.Creator<C4009a> {
        @Override // android.os.Parcelable.Creator
        public final C4009a createFromParcel(Parcel parcel) {
            return new C4009a((v) parcel.readParcelable(v.class.getClassLoader()), (v) parcel.readParcelable(v.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (v) parcel.readParcelable(v.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final C4009a[] newArray(int i) {
            return new C4009a[i];
        }
    }

    /* compiled from: CalendarConstraints.java */
    /* renamed from: com.google.android.material.datepicker.a$b */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f22784c = 0;

        /* renamed from: a, reason: collision with root package name */
        public Long f22785a;

        /* renamed from: b, reason: collision with root package name */
        public c f22786b;

        static {
            E.a(v.a(1900, 0).f22880g);
            E.a(v.a(AdError.BROKEN_MEDIA_ERROR_CODE, 11).f22880g);
        }
    }

    /* compiled from: CalendarConstraints.java */
    /* renamed from: com.google.android.material.datepicker.a$c */
    public interface c extends Parcelable {
        boolean d(long j4);
    }

    public C4009a(v vVar, v vVar2, c cVar, v vVar3, int i) {
        Objects.requireNonNull(vVar, "start cannot be null");
        Objects.requireNonNull(vVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f22777b = vVar;
        this.f22778c = vVar2;
        this.f22780e = vVar3;
        this.f22781f = i;
        this.f22779d = cVar;
        if (vVar3 != null && vVar.f22875b.compareTo(vVar3.f22875b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (vVar3 != null && vVar3.f22875b.compareTo(vVar2.f22875b) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > E.e(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f22783h = vVar.e(vVar2) + 1;
        this.f22782g = (vVar2.f22877d - vVar.f22877d) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4009a)) {
            return false;
        }
        C4009a c4009a = (C4009a) obj;
        return this.f22777b.equals(c4009a.f22777b) && this.f22778c.equals(c4009a.f22778c) && Objects.equals(this.f22780e, c4009a.f22780e) && this.f22781f == c4009a.f22781f && this.f22779d.equals(c4009a.f22779d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22777b, this.f22778c, this.f22780e, Integer.valueOf(this.f22781f), this.f22779d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f22777b, 0);
        parcel.writeParcelable(this.f22778c, 0);
        parcel.writeParcelable(this.f22780e, 0);
        parcel.writeParcelable(this.f22779d, 0);
        parcel.writeInt(this.f22781f);
    }
}
