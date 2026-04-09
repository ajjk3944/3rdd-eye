package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ot2 extends hv1 implements i52 {
    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            iv1.f(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.i52
    public final void b() {
    }

    @Override // defpackage.i52
    public final void t(int i) {
    }
}
