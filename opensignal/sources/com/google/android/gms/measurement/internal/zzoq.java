package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.List;
import wc.h;

/* loaded from: classes.dex */
public final class zzoq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoq> CREATOR = new h(26);

    /* renamed from: a, reason: collision with root package name */
    public final List f5419a;

    public zzoq(ArrayList arrayList) {
        this.f5419a = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.R(parcel, 1, this.f5419a);
        i4.W(parcel, iU);
    }
}
