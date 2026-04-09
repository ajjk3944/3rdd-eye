package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import jc.d;
import wc.b;
import wc.h;

/* loaded from: classes.dex */
public class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new h(6);
    public boolean B;
    public float J;
    public View L;
    public int M;
    public String N;
    public float O;

    /* renamed from: a, reason: collision with root package name */
    public LatLng f5352a;

    /* renamed from: d, reason: collision with root package name */
    public String f5353d;

    /* renamed from: g, reason: collision with root package name */
    public String f5354g;

    /* renamed from: r, reason: collision with root package name */
    public b f5355r;

    /* renamed from: x, reason: collision with root package name */
    public float f5356x = 0.5f;

    /* renamed from: y, reason: collision with root package name */
    public float f5357y = 1.0f;
    public boolean D = true;
    public boolean E = false;
    public float F = 0.0f;
    public float G = 0.5f;
    public float H = 0.0f;
    public float I = 1.0f;
    public int K = 0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.O(parcel, 2, this.f5352a, i10);
        i4.P(parcel, 3, this.f5353d);
        i4.P(parcel, 4, this.f5354g);
        b bVar = this.f5355r;
        i4.N(parcel, 5, bVar == null ? null : bVar.f24408a.asBinder());
        float f10 = this.f5356x;
        i4.S(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f5357y;
        i4.S(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.B;
        i4.S(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.D;
        i4.S(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.E;
        i4.S(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f12 = this.F;
        i4.S(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.G;
        i4.S(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.H;
        i4.S(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.I;
        i4.S(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.J;
        i4.S(parcel, 15, 4);
        parcel.writeFloat(f16);
        int i11 = this.K;
        i4.S(parcel, 17, 4);
        parcel.writeInt(i11);
        i4.N(parcel, 18, new d(this.L));
        int i12 = this.M;
        i4.S(parcel, 19, 4);
        parcel.writeInt(i12);
        i4.P(parcel, 20, this.N);
        float f17 = this.O;
        i4.S(parcel, 21, 4);
        parcel.writeFloat(f17);
        i4.W(parcel, iU);
    }
}
