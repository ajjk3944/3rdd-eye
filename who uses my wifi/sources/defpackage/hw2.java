package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hw2 extends ab2 {
    public final /* synthetic */ iw2 f;

    public hw2(iw2 iw2Var) {
        this.f = iw2Var;
    }

    @Override // defpackage.bb2
    public final void U0(va2 va2Var) {
        iw2 iw2Var = this.f;
        f20 f20Var = iw2Var.b;
        long j = iw2Var.a;
        bu1 bu1Var = new bu1("rewarded");
        bu1Var.g = Long.valueOf(j);
        bu1Var.i = "onUserEarnedReward";
        bu1Var.k = va2Var.b();
        bu1Var.l = Integer.valueOf(va2Var.c());
        f20Var.r(bu1Var);
    }

    @Override // defpackage.bb2
    public final void b() {
        iw2 iw2Var = this.f;
        f20 f20Var = iw2Var.b;
        long j = iw2Var.a;
        bu1 bu1Var = new bu1("rewarded");
        bu1Var.g = Long.valueOf(j);
        bu1Var.i = "onRewardedAdOpened";
        f20Var.r(bu1Var);
    }

    @Override // defpackage.bb2
    public final void c() {
        iw2 iw2Var = this.f;
        f20 f20Var = iw2Var.b;
        long j = iw2Var.a;
        bu1 bu1Var = new bu1("rewarded");
        bu1Var.g = Long.valueOf(j);
        bu1Var.i = "onRewardedAdClosed";
        f20Var.r(bu1Var);
    }

    @Override // defpackage.bb2
    public final void g() {
        iw2 iw2Var = this.f;
        f20 f20Var = iw2Var.b;
        long j = iw2Var.a;
        bu1 bu1Var = new bu1("rewarded");
        bu1Var.g = Long.valueOf(j);
        bu1Var.i = "onAdImpression";
        f20Var.r(bu1Var);
    }

    @Override // defpackage.bb2
    public final void k() {
        iw2 iw2Var = this.f;
        f20 f20Var = iw2Var.b;
        long j = iw2Var.a;
        bu1 bu1Var = new bu1("rewarded");
        bu1Var.g = Long.valueOf(j);
        bu1Var.i = "onAdClicked";
        f20Var.r(bu1Var);
    }

    @Override // defpackage.bb2
    public final void t2(nx2 nx2Var) {
        iw2 iw2Var = this.f;
        f20 f20Var = iw2Var.b;
        long j = iw2Var.a;
        int i = nx2Var.f;
        bu1 bu1Var = new bu1("rewarded");
        bu1Var.g = Long.valueOf(j);
        bu1Var.i = "onRewardedAdFailedToShow";
        bu1Var.j = Integer.valueOf(i);
        f20Var.r(bu1Var);
    }

    @Override // defpackage.bb2
    public final void z(int i) {
        iw2 iw2Var = this.f;
        f20 f20Var = iw2Var.b;
        long j = iw2Var.a;
        bu1 bu1Var = new bu1("rewarded");
        bu1Var.g = Long.valueOf(j);
        bu1Var.i = "onRewardedAdFailedToShow";
        bu1Var.j = Integer.valueOf(i);
        f20Var.r(bu1Var);
    }
}
