package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import jc.d;
import wc.b;
import wc.h;

/* loaded from: classes.dex */
public class StampStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StampStyle> CREATOR = new h(9);

    /* renamed from: a, reason: collision with root package name */
    public final b f5366a;

    public StampStyle(IBinder iBinder) {
        this.f5366a = new b(d.U(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.N(parcel, 2, this.f5366a.f24408a.asBinder());
        i4.W(parcel, iU);
    }
}
