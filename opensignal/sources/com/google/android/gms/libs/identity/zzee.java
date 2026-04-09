package com.google.android.gms.libs.identity;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import i6.a;

/* loaded from: classes.dex */
public final class zzee extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzee> CREATOR = new a(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f4889a;

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f4890d;

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f4891g;

    /* renamed from: r, reason: collision with root package name */
    public final PendingIntent f4892r;

    /* renamed from: x, reason: collision with root package name */
    public final String f4893x;

    public zzee(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.f4889a = i10;
        this.f4890d = iBinder;
        this.f4891g = iBinder2;
        this.f4892r = pendingIntent;
        this.f4893x = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f4889a);
        i4.N(parcel, 2, this.f4890d);
        i4.N(parcel, 3, this.f4891g);
        i4.O(parcel, 4, this.f4892r, i10);
        i4.P(parcel, 6, this.f4893x);
        i4.W(parcel, iU);
    }
}
