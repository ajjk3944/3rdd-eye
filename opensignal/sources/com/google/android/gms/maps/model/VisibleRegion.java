package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import bm.e;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import java.util.Arrays;
import wc.h;

/* loaded from: classes.dex */
public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new h(1);

    /* renamed from: a, reason: collision with root package name */
    public final LatLng f5382a;

    /* renamed from: d, reason: collision with root package name */
    public final LatLng f5383d;

    /* renamed from: g, reason: collision with root package name */
    public final LatLng f5384g;

    /* renamed from: r, reason: collision with root package name */
    public final LatLng f5385r;

    /* renamed from: x, reason: collision with root package name */
    public final LatLngBounds f5386x;

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f5382a = latLng;
        this.f5383d = latLng2;
        this.f5384g = latLng3;
        this.f5385r = latLng4;
        this.f5386x = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.f5382a.equals(visibleRegion.f5382a) && this.f5383d.equals(visibleRegion.f5383d) && this.f5384g.equals(visibleRegion.f5384g) && this.f5385r.equals(visibleRegion.f5385r) && this.f5386x.equals(visibleRegion.f5386x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5382a, this.f5383d, this.f5384g, this.f5385r, this.f5386x});
    }

    public final String toString() {
        e eVar = new e(9, this);
        eVar.d(this.f5382a, "nearLeft");
        eVar.d(this.f5383d, "nearRight");
        eVar.d(this.f5384g, "farLeft");
        eVar.d(this.f5385r, "farRight");
        eVar.d(this.f5386x, "latLngBounds");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.O(parcel, 2, this.f5382a, i10);
        i4.O(parcel, 3, this.f5383d, i10);
        i4.O(parcel, 4, this.f5384g, i10);
        i4.O(parcel, 5, this.f5385r, i10);
        i4.O(parcel, 6, this.f5386x, i10);
        i4.W(parcel, iU);
    }
}
