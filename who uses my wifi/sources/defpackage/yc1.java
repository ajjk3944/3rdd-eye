package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yc1 extends l0 {
    public static final Parcelable.Creator<yc1> CREATOR = new kq0(12);
    public final int f;
    public final IBinder g;
    public final rh h;
    public final boolean i;
    public final boolean j;

    public yc1(int i, IBinder iBinder, rh rhVar, boolean z, boolean z2) {
        this.f = i;
        this.g = iBinder;
        this.h = rhVar;
        this.i = z;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        Object fi4Var;
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof yc1)) {
                return false;
            }
            yc1 yc1Var = (yc1) obj;
            if (!this.h.equals(yc1Var.h)) {
                return false;
            }
            Object fi4Var2 = null;
            IBinder iBinder = this.g;
            if (iBinder == null) {
                fi4Var = null;
            } else {
                int i = k1.g;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                fi4Var = iInterfaceQueryLocalInterface instanceof k10 ? (k10) iInterfaceQueryLocalInterface : new fi4(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = yc1Var.g;
            if (iBinder2 != null) {
                int i2 = k1.g;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                fi4Var2 = iInterfaceQueryLocalInterface2 instanceof k10 ? (k10) iInterfaceQueryLocalInterface2 : new fi4(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (!a30.c(fi4Var, fi4Var2)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.f);
        uk2.B(parcel, 2, this.g);
        uk2.C(parcel, 3, this.h, i);
        uk2.T(parcel, 4, 4);
        parcel.writeInt(this.i ? 1 : 0);
        uk2.T(parcel, 5, 4);
        parcel.writeInt(this.j ? 1 : 0);
        uk2.O(parcel, I);
    }
}
