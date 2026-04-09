package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vm0 extends l0 {
    public static final Parcelable.Creator<vm0> CREATOR = new p92(14);
    public final boolean f;
    public final wi2 g;
    public final IBinder h;

    public vm0(boolean z, IBinder iBinder, IBinder iBinder2) {
        wi2 hi2Var;
        this.f = z;
        if (iBinder != null) {
            int i = tv1.g;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            hi2Var = iInterfaceQueryLocalInterface instanceof wi2 ? (wi2) iInterfaceQueryLocalInterface : new hi2(iBinder);
        } else {
            hi2Var = null;
        }
        this.g = hi2Var;
        this.h = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.f ? 1 : 0);
        wi2 wi2Var = this.g;
        uk2.B(parcel, 2, wi2Var == null ? null : wi2Var.asBinder());
        uk2.B(parcel, 3, this.h);
        uk2.O(parcel, I);
    }
}
