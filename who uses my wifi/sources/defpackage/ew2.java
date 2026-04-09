package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ew2 extends n22 {
    public final /* synthetic */ f20 f;
    public final /* synthetic */ fw2 g;

    public ew2(fw2 fw2Var, f20 f20Var) {
        this.f = f20Var;
        this.g = fw2Var;
    }

    @Override // defpackage.d32
    public final void I(int i) {
        long j = this.g.a;
        bu1 bu1Var = new bu1("interstitial");
        bu1Var.g = Long.valueOf(j);
        bu1Var.i = "onAdFailedToLoad";
        bu1Var.j = Integer.valueOf(i);
        this.f.r(bu1Var);
    }

    @Override // defpackage.d32
    public final void W(nx2 nx2Var) {
        long j = this.g.a;
        int i = nx2Var.f;
        bu1 bu1Var = new bu1("interstitial");
        bu1Var.g = Long.valueOf(j);
        bu1Var.i = "onAdFailedToLoad";
        bu1Var.j = Integer.valueOf(i);
        this.f.r(bu1Var);
    }

    @Override // defpackage.d32
    public final void c() {
        long j = this.g.a;
        bu1 bu1Var = new bu1("interstitial");
        bu1Var.g = Long.valueOf(j);
        bu1Var.i = "onAdLoaded";
        this.f.r(bu1Var);
    }

    @Override // defpackage.d32
    public final void e() {
        long j = this.g.a;
        bu1 bu1Var = new bu1("interstitial");
        bu1Var.g = Long.valueOf(j);
        bu1Var.i = "onAdOpened";
        this.f.r(bu1Var);
    }

    @Override // defpackage.d32
    public final void f() {
        long j = this.g.a;
        bu1 bu1Var = new bu1("interstitial");
        bu1Var.g = Long.valueOf(j);
        bu1Var.i = "onAdClicked";
        String strJ = bu1Var.j();
        m42 m42Var = (m42) this.f.g;
        Parcel parcelU = m42Var.U();
        parcelU.writeString(strJ);
        m42Var.M0(parcelU, 1);
    }

    @Override // defpackage.d32
    public final void y() {
        long j = this.g.a;
        bu1 bu1Var = new bu1("interstitial");
        bu1Var.g = Long.valueOf(j);
        bu1Var.i = "onAdClosed";
        this.f.r(bu1Var);
    }

    @Override // defpackage.d32
    public final void b() {
    }

    @Override // defpackage.d32
    public final void g() {
    }

    @Override // defpackage.d32
    public final void j() {
    }
}
