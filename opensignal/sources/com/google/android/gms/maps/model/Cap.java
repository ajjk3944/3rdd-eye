package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import cc.s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import io.sentry.android.core.e0;
import java.util.Arrays;
import wc.b;
import wc.h;

/* loaded from: classes.dex */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new h(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f5342a;

    /* renamed from: d, reason: collision with root package name */
    public final b f5343d;

    /* renamed from: g, reason: collision with root package name */
    public final Float f5344g;

    public Cap(int i10, b bVar, Float f10) {
        boolean z10 = f10 != null && f10.floatValue() > 0.0f;
        if (i10 == 3) {
            z = bVar != null && z10;
            i10 = 3;
        }
        s.a("Invalid Cap: type=" + i10 + " bitmapDescriptor=" + bVar + " bitmapRefWidth=" + f10, z);
        this.f5342a = i10;
        this.f5343d = bVar;
        this.f5344g = f10;
    }

    public final Cap d() {
        int i10 = this.f5342a;
        if (i10 == 0) {
            return new ButtCap();
        }
        if (i10 == 1) {
            return new SquareCap(1, null, null);
        }
        if (i10 == 2) {
            return new RoundCap(2, null, null);
        }
        if (i10 != 3) {
            e0.p("Cap", "Unknown Cap type: " + i10);
            return this;
        }
        b bVar = this.f5343d;
        s.j("bitmapDescriptor must not be null", bVar != null);
        Float f10 = this.f5344g;
        s.j("bitmapRefWidth must not be null", f10 != null);
        return new CustomCap(bVar, f10.floatValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.f5342a == cap.f5342a && s.k(this.f5343d, cap.f5343d) && s.k(this.f5344g, cap.f5344g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5342a), this.f5343d, this.f5344g});
    }

    public String toString() {
        return h0.b.i(this.f5342a, "]", new StringBuilder("[Cap: type="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 2, 4);
        parcel.writeInt(this.f5342a);
        b bVar = this.f5343d;
        i4.N(parcel, 3, bVar == null ? null : bVar.f24408a.asBinder());
        i4.M(parcel, 4, this.f5344g);
        i4.W(parcel, iU);
    }
}
