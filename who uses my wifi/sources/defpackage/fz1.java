package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fz1 extends hv1 implements pl2 {
    public final yc0 f;

    public fz1(yc0 yc0Var) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.f = yc0Var;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            nx2 nx2Var = (nx2) iv1.b(parcel, nx2.CREATOR);
            iv1.f(parcel);
            M2(nx2Var);
        } else if (i == 2) {
            r();
        } else if (i == 3) {
            l();
        } else if (i != 4 && i != 5) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.pl2
    public final void M2(nx2 nx2Var) {
        yc0 yc0Var = this.f;
        if (yc0Var != null) {
            yc0Var.c(nx2Var.a());
        }
    }

    @Override // defpackage.pl2
    public final void l() {
        yc0 yc0Var = this.f;
        if (yc0Var != null) {
            yc0Var.b();
        }
    }

    @Override // defpackage.pl2
    public final void r() {
        yc0 yc0Var = this.f;
        if (yc0Var != null) {
            yc0Var.d();
        }
    }

    @Override // defpackage.pl2
    public final void b() {
    }

    @Override // defpackage.pl2
    public final void c() {
    }
}
