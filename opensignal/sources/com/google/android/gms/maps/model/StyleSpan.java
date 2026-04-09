package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import tc.c;

/* loaded from: classes.dex */
public final class StyleSpan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StyleSpan> CREATOR = new c(28);

    /* renamed from: a, reason: collision with root package name */
    public final StrokeStyle f5372a;

    /* renamed from: d, reason: collision with root package name */
    public final double f5373d;

    public StyleSpan(StrokeStyle strokeStyle, double d6) {
        if (d6 <= 0.0d) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.f5372a = strokeStyle;
        this.f5373d = d6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.O(parcel, 2, this.f5372a, i10);
        i4.S(parcel, 3, 8);
        parcel.writeDouble(this.f5373d);
        i4.W(parcel, iU);
    }
}
