package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new A3.q(25);

    /* renamed from: a, reason: collision with root package name */
    public final m f18259a;

    /* renamed from: b, reason: collision with root package name */
    public final m f18260b;

    /* renamed from: c, reason: collision with root package name */
    public final d f18261c;

    /* renamed from: d, reason: collision with root package name */
    public final m f18262d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18263e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18264f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18265g;

    public b(m mVar, m mVar2, d dVar, m mVar3, int i) {
        Objects.requireNonNull(mVar, "start cannot be null");
        Objects.requireNonNull(mVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f18259a = mVar;
        this.f18260b = mVar2;
        this.f18262d = mVar3;
        this.f18263e = i;
        this.f18261c = dVar;
        if (mVar3 != null && mVar.f18319a.compareTo(mVar3.f18319a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (mVar3 != null && mVar3.f18319a.compareTo(mVar2.f18319a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > u.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f18265g = mVar.d(mVar2) + 1;
        this.f18264f = (mVar2.f18321c - mVar.f18321c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18259a.equals(bVar.f18259a) && this.f18260b.equals(bVar.f18260b) && Objects.equals(this.f18262d, bVar.f18262d) && this.f18263e == bVar.f18263e && this.f18261c.equals(bVar.f18261c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18259a, this.f18260b, this.f18262d, Integer.valueOf(this.f18263e), this.f18261c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f18259a, 0);
        parcel.writeParcelable(this.f18260b, 0);
        parcel.writeParcelable(this.f18262d, 0);
        parcel.writeParcelable(this.f18261c, 0);
        parcel.writeInt(this.f18263e);
    }
}
