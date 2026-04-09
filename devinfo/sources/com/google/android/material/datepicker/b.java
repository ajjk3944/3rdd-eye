package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.i0;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new i0(9);

    /* renamed from: a, reason: collision with root package name */
    public final o f20439a;

    /* renamed from: b, reason: collision with root package name */
    public final o f20440b;

    /* renamed from: c, reason: collision with root package name */
    public final d f20441c;

    /* renamed from: d, reason: collision with root package name */
    public final o f20442d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20443e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20444f;
    public final int g;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i4) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f20439a = oVar;
        this.f20440b = oVar2;
        this.f20442d = oVar3;
        this.f20443e = i4;
        this.f20441c = dVar;
        if (oVar3 != null && oVar.f20490a.compareTo(oVar3.f20490a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f20490a.compareTo(oVar2.f20490a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i4 < 0 || i4 > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.g = oVar.d(oVar2) + 1;
        this.f20444f = (oVar2.f20492c - oVar.f20492c) + 1;
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
        return this.f20439a.equals(bVar.f20439a) && this.f20440b.equals(bVar.f20440b) && Objects.equals(this.f20442d, bVar.f20442d) && this.f20443e == bVar.f20443e && this.f20441c.equals(bVar.f20441c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20439a, this.f20440b, this.f20442d, Integer.valueOf(this.f20443e), this.f20441c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f20439a, 0);
        parcel.writeParcelable(this.f20440b, 0);
        parcel.writeParcelable(this.f20442d, 0);
        parcel.writeParcelable(this.f20441c, 0);
        parcel.writeInt(this.f20443e);
    }
}
