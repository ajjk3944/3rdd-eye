package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import bm.e;
import cc.s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import java.util.Arrays;
import wc.h;

/* loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new h(14);

    /* renamed from: a, reason: collision with root package name */
    public final String f4811a;

    /* renamed from: d, reason: collision with root package name */
    public final int f4812d;

    /* renamed from: g, reason: collision with root package name */
    public final long f4813g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4814r;

    public Feature(String str, int i10, long j, boolean z10) {
        this.f4811a = str;
        this.f4812d = i10;
        this.f4813g = j;
        this.f4814r = z10;
    }

    public final long d() {
        long j = this.f4813g;
        return j == -1 ? this.f4812d : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (s.k(this.f4811a, feature.f4811a) && d() == feature.d() && this.f4814r == feature.f4814r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4811a, Long.valueOf(d()), Boolean.valueOf(this.f4814r)});
    }

    public final String toString() {
        e eVar = new e(9, this);
        eVar.d(this.f4811a, "name");
        eVar.d(Long.valueOf(d()), "version");
        eVar.d(Boolean.valueOf(this.f4814r), "is_fully_rolled_out");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.P(parcel, 1, this.f4811a);
        i4.S(parcel, 2, 4);
        parcel.writeInt(this.f4812d);
        long jD = d();
        i4.S(parcel, 3, 8);
        parcel.writeLong(jD);
        i4.S(parcel, 4, 4);
        parcel.writeInt(this.f4814r ? 1 : 0);
        i4.W(parcel, iU);
    }

    public Feature(String str, long j) {
        this(str, -1, j, false);
    }
}
