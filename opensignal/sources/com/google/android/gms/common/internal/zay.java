package com.google.android.gms.common.internal;

import ac.l;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import cc.a;
import cc.g;
import cc.g0;
import cc.s;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: classes.dex */
public final class zay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zay> CREATOR = new l(26);

    /* renamed from: a, reason: collision with root package name */
    public final int f4859a;

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f4860d;

    /* renamed from: g, reason: collision with root package name */
    public final ConnectionResult f4861g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4862r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f4863x;

    public zay(int i10, IBinder iBinder, ConnectionResult connectionResult, boolean z10, boolean z11) {
        this.f4859a = i10;
        this.f4860d = iBinder;
        this.f4861g = connectionResult;
        this.f4862r = z10;
        this.f4863x = z11;
    }

    public final boolean equals(Object obj) {
        Object g0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zay)) {
            return false;
        }
        zay zayVar = (zay) obj;
        if (!this.f4861g.equals(zayVar.f4861g)) {
            return false;
        }
        Object g0Var2 = null;
        IBinder iBinder = this.f4860d;
        if (iBinder == null) {
            g0Var = null;
        } else {
            int i10 = a.f3601e;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            g0Var = iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        }
        IBinder iBinder2 = zayVar.f4860d;
        if (iBinder2 != null) {
            int i11 = a.f3601e;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            g0Var2 = iInterfaceQueryLocalInterface2 instanceof g ? (g) iInterfaceQueryLocalInterface2 : new g0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        }
        return s.k(g0Var, g0Var2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f4859a);
        i4.N(parcel, 2, this.f4860d);
        i4.O(parcel, 3, this.f4861g, i10);
        i4.S(parcel, 4, 4);
        parcel.writeInt(this.f4862r ? 1 : 0);
        i4.S(parcel, 5, 4);
        parcel.writeInt(this.f4863x ? 1 : 0);
        i4.W(parcel, iU);
    }
}
