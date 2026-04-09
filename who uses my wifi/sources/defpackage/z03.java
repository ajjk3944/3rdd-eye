package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class z03 extends hv1 implements v72 {
    public final c03 f;

    public z03(n03 n03Var, c03 c03Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
        this.f = c03Var;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        c03 c03Var = this.f;
        if (i == 2) {
            ((u03) c03Var.c).g();
        } else if (i == 3) {
            String string = parcel.readString();
            iv1.f(parcel);
            ((u03) c03Var.c).w0(string, 0);
        } else {
            if (i != 4) {
                return false;
            }
            nx2 nx2Var = (nx2) iv1.b(parcel, nx2.CREATOR);
            iv1.f(parcel);
            a(nx2Var);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.v72
    public final void a(nx2 nx2Var) {
        ((u03) this.f.c).K0(nx2Var);
    }
}
