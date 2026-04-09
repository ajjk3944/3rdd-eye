package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import jc.d;
import wc.h;

/* loaded from: classes.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new h(15);
    public final boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final String f4868a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4869d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4870g;

    /* renamed from: r, reason: collision with root package name */
    public final Context f4871r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f4872x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f4873y;

    public zzp(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13, boolean z14) {
        this.f4868a = str;
        this.f4869d = z10;
        this.f4870g = z11;
        this.f4871r = (Context) d.V(d.U(iBinder));
        this.f4872x = z12;
        this.f4873y = z13;
        this.B = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.P(parcel, 1, this.f4868a);
        i4.S(parcel, 2, 4);
        parcel.writeInt(this.f4869d ? 1 : 0);
        i4.S(parcel, 3, 4);
        parcel.writeInt(this.f4870g ? 1 : 0);
        i4.N(parcel, 4, new d(this.f4871r));
        i4.S(parcel, 5, 4);
        parcel.writeInt(this.f4872x ? 1 : 0);
        i4.S(parcel, 6, 4);
        parcel.writeInt(this.f4873y ? 1 : 0);
        i4.S(parcel, 8, 4);
        parcel.writeInt(this.B ? 1 : 0);
        i4.W(parcel, iU);
    }
}
