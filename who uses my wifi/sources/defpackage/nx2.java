package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nx2 extends l0 {
    public static final Parcelable.Creator<nx2> CREATOR = new p92(15);
    public final int f;
    public final String g;
    public final String h;
    public nx2 i;
    public IBinder j;

    public nx2(int i, String str, String str2, nx2 nx2Var, IBinder iBinder) {
        this.f = i;
        this.g = str;
        this.h = str2;
        this.i = nx2Var;
        this.j = iBinder;
    }

    public final r2 a() {
        nx2 nx2Var = this.i;
        r2 r2Var = null;
        if (nx2Var != null) {
            String str = nx2Var.h;
            r2Var = new r2(nx2Var.f, nx2Var.g, str, null);
        }
        return new r2(this.f, this.g, this.h, r2Var);
    }

    public final u70 b() {
        r2 r2Var;
        tx2 ow2Var;
        nx2 nx2Var = this.i;
        if (nx2Var == null) {
            r2Var = null;
        } else {
            r2Var = new r2(nx2Var.f, nx2Var.g, nx2Var.h, null);
        }
        IBinder iBinder = this.j;
        if (iBinder == null) {
            ow2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            ow2Var = iInterfaceQueryLocalInterface instanceof tx2 ? (tx2) iInterfaceQueryLocalInterface : new ow2(iBinder);
        }
        return new u70(this.f, this.g, this.h, r2Var, ow2Var != null ? new hq0(ow2Var) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.f);
        uk2.D(parcel, 2, this.g);
        uk2.D(parcel, 3, this.h);
        uk2.C(parcel, 4, this.i, i);
        uk2.B(parcel, 5, this.j);
        uk2.O(parcel, I);
    }
}
