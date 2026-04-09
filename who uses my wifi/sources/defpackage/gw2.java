package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gw2 extends eb2 {
    public final /* synthetic */ iw2 f;

    public gw2(iw2 iw2Var) {
        this.f = iw2Var;
    }

    @Override // defpackage.fb2
    public final void a(nx2 nx2Var) {
        iw2 iw2Var = this.f;
        f20 f20Var = iw2Var.b;
        long j = iw2Var.a;
        int i = nx2Var.f;
        bu1 bu1Var = new bu1("rewarded");
        bu1Var.g = Long.valueOf(j);
        bu1Var.i = "onRewardedAdFailedToLoad";
        bu1Var.j = Integer.valueOf(i);
        f20Var.r(bu1Var);
    }

    @Override // defpackage.fb2
    public final void b() {
        iw2 iw2Var = this.f;
        f20 f20Var = iw2Var.b;
        long j = iw2Var.a;
        bu1 bu1Var = new bu1("rewarded");
        bu1Var.g = Long.valueOf(j);
        bu1Var.i = "onRewardedAdLoaded";
        f20Var.r(bu1Var);
    }

    @Override // defpackage.fb2
    public final void t(int i) {
        iw2 iw2Var = this.f;
        f20 f20Var = iw2Var.b;
        long j = iw2Var.a;
        bu1 bu1Var = new bu1("rewarded");
        bu1Var.g = Long.valueOf(j);
        bu1Var.i = "onRewardedAdFailedToLoad";
        bu1Var.j = Integer.valueOf(i);
        f20Var.r(bu1Var);
    }
}
