package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import cc.s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import java.util.Arrays;
import wc.h;

/* loaded from: classes.dex */
public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new h(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f5358a;

    /* renamed from: d, reason: collision with root package name */
    public final Float f5359d;

    public PatternItem(int i10, Float f10) {
        boolean z10 = true;
        if (i10 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z10 = false;
        }
        s.a("Invalid PatternItem: type=" + i10 + " length=" + f10, z10);
        this.f5358a = i10;
        this.f5359d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.f5358a == patternItem.f5358a && s.k(this.f5359d, patternItem.f5359d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5358a), this.f5359d});
    }

    public final String toString() {
        return "[PatternItem: type=" + this.f5358a + " length=" + this.f5359d + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 2, 4);
        parcel.writeInt(this.f5358a);
        i4.M(parcel, 3, this.f5359d);
        i4.W(parcel, iU);
    }
}
