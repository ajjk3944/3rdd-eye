package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import tc.c;

/* loaded from: classes.dex */
public final class StrokeStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StrokeStyle> CREATOR = new c(27);

    /* renamed from: a, reason: collision with root package name */
    public final float f5367a;

    /* renamed from: d, reason: collision with root package name */
    public final int f5368d;

    /* renamed from: g, reason: collision with root package name */
    public final int f5369g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f5370r;

    /* renamed from: x, reason: collision with root package name */
    public final StampStyle f5371x;

    public StrokeStyle(float f10, int i10, int i11, boolean z10, StampStyle stampStyle) {
        this.f5367a = f10;
        this.f5368d = i10;
        this.f5369g = i11;
        this.f5370r = z10;
        this.f5371x = stampStyle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 2, 4);
        parcel.writeFloat(this.f5367a);
        i4.S(parcel, 3, 4);
        parcel.writeInt(this.f5368d);
        i4.S(parcel, 4, 4);
        parcel.writeInt(this.f5369g);
        i4.S(parcel, 5, 4);
        parcel.writeInt(this.f5370r ? 1 : 0);
        i4.O(parcel, 6, this.f5371x, i10);
        i4.W(parcel, iU);
    }
}
