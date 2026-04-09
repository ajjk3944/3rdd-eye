package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import qc.k;
import wc.h;

/* loaded from: classes.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new h(0);

    /* renamed from: a, reason: collision with root package name */
    public k f5377a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5378d;

    /* renamed from: g, reason: collision with root package name */
    public float f5379g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5380r;

    /* renamed from: x, reason: collision with root package name */
    public float f5381x;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        k kVar = this.f5377a;
        i4.N(parcel, 2, kVar == null ? null : kVar.asBinder());
        boolean z10 = this.f5378d;
        i4.S(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        float f10 = this.f5379g;
        i4.S(parcel, 4, 4);
        parcel.writeFloat(f10);
        boolean z11 = this.f5380r;
        i4.S(parcel, 5, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f11 = this.f5381x;
        i4.S(parcel, 6, 4);
        parcel.writeFloat(f11);
        i4.W(parcel, iU);
    }
}
