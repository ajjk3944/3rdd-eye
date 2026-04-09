package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class xr2 extends hv1 implements ms2 {
    public xr2() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        nx2 nx2Var = (nx2) iv1.b(parcel, nx2.CREATOR);
        iv1.f(parcel);
        g0(nx2Var);
        parcel2.writeNoException();
        return true;
    }
}
