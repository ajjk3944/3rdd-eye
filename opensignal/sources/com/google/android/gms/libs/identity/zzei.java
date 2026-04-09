package com.google.android.gms.libs.identity;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.x;
import i6.a;
import pc.o;
import pc.q;
import tc.f;
import tc.g;
import tc.h;
import tc.i;
import tc.j;

@Deprecated
/* loaded from: classes.dex */
public final class zzei extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzei> CREATOR = new a(12);
    public final String B;

    /* renamed from: a, reason: collision with root package name */
    public final int f4895a;

    /* renamed from: d, reason: collision with root package name */
    public final zzeg f4896d;

    /* renamed from: g, reason: collision with root package name */
    public final j f4897g;

    /* renamed from: r, reason: collision with root package name */
    public final g f4898r;

    /* renamed from: x, reason: collision with root package name */
    public final PendingIntent f4899x;

    /* renamed from: y, reason: collision with root package name */
    public final q f4900y;

    public zzei(int i10, zzeg zzegVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        j hVar;
        g fVar;
        this.f4895a = i10;
        this.f4896d = zzegVar;
        q oVar = null;
        if (iBinder != null) {
            int i11 = i.f22703e;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            hVar = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new h(iBinder, "com.google.android.gms.location.ILocationListener", 3);
        } else {
            hVar = null;
        }
        this.f4897g = hVar;
        this.f4899x = pendingIntent;
        if (iBinder2 != null) {
            int i12 = pc.g.f20446f;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            fVar = iInterfaceQueryLocalInterface2 instanceof g ? (g) iInterfaceQueryLocalInterface2 : new f(iBinder2, "com.google.android.gms.location.ILocationCallback", 3);
        } else {
            fVar = null;
        }
        this.f4898r = fVar;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            oVar = iInterfaceQueryLocalInterface3 instanceof q ? (q) iInterfaceQueryLocalInterface3 : new o(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 3);
        }
        this.f4900y = oVar;
        this.B = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f4895a);
        i4.O(parcel, 2, this.f4896d, i10);
        IInterface iInterface = this.f4897g;
        i4.N(parcel, 3, iInterface == null ? null : ((x) iInterface).f5251e);
        i4.O(parcel, 4, this.f4899x, i10);
        g gVar = this.f4898r;
        i4.N(parcel, 5, gVar == null ? null : gVar.asBinder());
        q qVar = this.f4900y;
        i4.N(parcel, 6, qVar != null ? qVar.asBinder() : null);
        i4.P(parcel, 8, this.B);
        i4.W(parcel, iU);
    }
}
