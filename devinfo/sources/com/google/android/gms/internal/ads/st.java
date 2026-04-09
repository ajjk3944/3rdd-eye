package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class st extends qb.a {
    public static final Parcelable.Creator<st> CREATOR = new ci(9);

    /* renamed from: a, reason: collision with root package name */
    public final View f16544a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f16545b;

    public st(IBinder iBinder, IBinder iBinder2) {
        this.f16544a = (View) vb.b.U0(vb.b.r0(iBinder));
        this.f16545b = (Map) vb.b.U0(vb.b.r0(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.F(parcel, 1, new vb.b(this.f16544a));
        com.bumptech.glide.f.F(parcel, 2, new vb.b(this.f16545b));
        com.bumptech.glide.f.P(parcel, iO);
    }
}
