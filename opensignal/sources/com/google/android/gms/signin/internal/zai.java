package com.google.android.gms.signin.internal;

import ac.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zaw;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: classes.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new l(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f5438a;

    /* renamed from: d, reason: collision with root package name */
    public final zaw f5439d;

    public zai(int i10, zaw zawVar) {
        this.f5438a = i10;
        this.f5439d = zawVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f5438a);
        i4.O(parcel, 2, this.f5439d, i10);
        i4.W(parcel, iU);
    }
}
