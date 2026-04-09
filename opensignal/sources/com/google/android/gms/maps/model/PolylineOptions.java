package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.List;
import wc.h;

/* loaded from: classes.dex */
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new h(8);
    public final boolean B;
    public final Cap D;
    public final Cap E;
    public final int F;
    public final List G;
    public final List H;

    /* renamed from: a, reason: collision with root package name */
    public final List f5360a;

    /* renamed from: d, reason: collision with root package name */
    public float f5361d;

    /* renamed from: g, reason: collision with root package name */
    public int f5362g;

    /* renamed from: r, reason: collision with root package name */
    public final float f5363r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f5364x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f5365y;

    public PolylineOptions() {
        this.f5361d = 10.0f;
        this.f5362g = -16777216;
        this.f5363r = 0.0f;
        this.f5364x = true;
        this.f5365y = false;
        this.B = false;
        this.D = new ButtCap();
        this.E = new ButtCap();
        this.F = 0;
        this.G = null;
        this.H = new ArrayList();
        this.f5360a = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.R(parcel, 2, this.f5360a);
        float f10 = this.f5361d;
        i4.S(parcel, 3, 4);
        parcel.writeFloat(f10);
        int i11 = this.f5362g;
        i4.S(parcel, 4, 4);
        parcel.writeInt(i11);
        i4.S(parcel, 5, 4);
        parcel.writeFloat(this.f5363r);
        i4.S(parcel, 6, 4);
        parcel.writeInt(this.f5364x ? 1 : 0);
        i4.S(parcel, 7, 4);
        parcel.writeInt(this.f5365y ? 1 : 0);
        i4.S(parcel, 8, 4);
        parcel.writeInt(this.B ? 1 : 0);
        i4.O(parcel, 9, this.D.d(), i10);
        i4.O(parcel, 10, this.E.d(), i10);
        i4.S(parcel, 11, 4);
        parcel.writeInt(this.F);
        i4.R(parcel, 12, this.G);
        List<StyleSpan> list = this.H;
        ArrayList arrayList = new ArrayList(list.size());
        for (StyleSpan styleSpan : list) {
            StrokeStyle strokeStyle = styleSpan.f5372a;
            float f11 = strokeStyle.f5367a;
            Pair pair = new Pair(Integer.valueOf(strokeStyle.f5368d), Integer.valueOf(strokeStyle.f5369g));
            arrayList.add(new StyleSpan(new StrokeStyle(this.f5361d, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), this.f5364x, strokeStyle.f5371x), styleSpan.f5373d));
        }
        i4.R(parcel, 13, arrayList);
        i4.W(parcel, iU);
    }

    public PolylineOptions(ArrayList arrayList, float f10, int i10, float f11, boolean z10, boolean z11, boolean z12, Cap cap, Cap cap2, int i11, ArrayList arrayList2, ArrayList arrayList3) {
        this.f5361d = 10.0f;
        this.f5362g = -16777216;
        this.f5363r = 0.0f;
        this.f5364x = true;
        this.f5365y = false;
        this.B = false;
        this.D = new ButtCap();
        this.E = new ButtCap();
        this.F = 0;
        this.G = null;
        this.H = new ArrayList();
        this.f5360a = arrayList;
        this.f5361d = f10;
        this.f5362g = i10;
        this.f5363r = f11;
        this.f5364x = z10;
        this.f5365y = z11;
        this.B = z12;
        if (cap != null) {
            this.D = cap;
        }
        if (cap2 != null) {
            this.E = cap2;
        }
        this.F = i11;
        this.G = arrayList2;
        if (arrayList3 != null) {
            this.H = arrayList3;
        }
    }
}
