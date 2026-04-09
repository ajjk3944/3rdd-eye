package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import bm.e;
import cc.s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import java.util.Arrays;
import tc.c;

/* loaded from: classes.dex */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new c(26);

    /* renamed from: a, reason: collision with root package name */
    public final LatLng f5338a;

    /* renamed from: d, reason: collision with root package name */
    public final float f5339d;

    /* renamed from: g, reason: collision with root package name */
    public final float f5340g;

    /* renamed from: r, reason: collision with root package name */
    public final float f5341r;

    public CameraPosition(LatLng latLng, float f10, float f11, float f12) {
        s.i(latLng, "camera target must not be null.");
        boolean z10 = false;
        if (f11 >= 0.0f && f11 <= 90.0f) {
            z10 = true;
        }
        s.c(z10, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f11));
        this.f5338a = latLng;
        this.f5339d = f10;
        this.f5340g = f11 + 0.0f;
        this.f5341r = (((double) f12) <= 0.0d ? (f12 % 360.0f) + 360.0f : f12) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f5338a.equals(cameraPosition.f5338a) && Float.floatToIntBits(this.f5339d) == Float.floatToIntBits(cameraPosition.f5339d) && Float.floatToIntBits(this.f5340g) == Float.floatToIntBits(cameraPosition.f5340g) && Float.floatToIntBits(this.f5341r) == Float.floatToIntBits(cameraPosition.f5341r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5338a, Float.valueOf(this.f5339d), Float.valueOf(this.f5340g), Float.valueOf(this.f5341r)});
    }

    public final String toString() {
        e eVar = new e(9, this);
        eVar.d(this.f5338a, "target");
        eVar.d(Float.valueOf(this.f5339d), "zoom");
        eVar.d(Float.valueOf(this.f5340g), "tilt");
        eVar.d(Float.valueOf(this.f5341r), "bearing");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.O(parcel, 2, this.f5338a, i10);
        i4.S(parcel, 3, 4);
        parcel.writeFloat(this.f5339d);
        i4.S(parcel, 4, 4);
        parcel.writeFloat(this.f5340g);
        i4.S(parcel, 5, 4);
        parcel.writeFloat(this.f5341r);
        i4.W(parcel, iU);
    }
}
