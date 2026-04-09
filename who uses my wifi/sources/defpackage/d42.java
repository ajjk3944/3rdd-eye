package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class d42 extends hv1 implements p42 {
    public d42() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            y();
        } else {
            if (i != 2) {
                return false;
            }
            nx2 nx2Var = (nx2) iv1.b(parcel, nx2.CREATOR);
            iv1.f(parcel);
            O(nx2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
