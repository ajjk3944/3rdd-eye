package com.google.android.gms.signin.internal;

import ac.l;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new l(12);

    /* renamed from: a, reason: collision with root package name */
    public final int f5433a;

    /* renamed from: d, reason: collision with root package name */
    public final int f5434d;

    /* renamed from: g, reason: collision with root package name */
    public final Intent f5435g;

    public zaa(int i10, int i11, Intent intent) {
        this.f5433a = i10;
        this.f5434d = i11;
        this.f5435g = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f5433a);
        i4.S(parcel, 2, 4);
        parcel.writeInt(this.f5434d);
        i4.O(parcel, 3, this.f5435g, i10);
        i4.W(parcel, iU);
    }
}
