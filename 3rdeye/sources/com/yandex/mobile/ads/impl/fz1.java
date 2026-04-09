package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class fz1 implements pc2 {

    /* renamed from: a, reason: collision with root package name */
    private final ez1 f27492a;

    /* renamed from: b, reason: collision with root package name */
    private final bd2 f27493b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27494c;

    public /* synthetic */ fz1(pm0 pm0Var, tn0 tn0Var) {
        this(pm0Var, tn0Var, new ez1(pm0Var), tn0Var.h());
    }

    @Override // com.yandex.mobile.ads.impl.pc2
    public final void a(long j4, long j10) {
        bd2 bd2Var;
        if (this.f27494c || (bd2Var = this.f27493b) == null) {
            return;
        }
        if (j10 < bd2Var.a()) {
            this.f27492a.a(this.f27493b.a(), j10);
        } else {
            this.f27492a.a();
            this.f27494c = true;
        }
    }

    public fz1(pm0 viewHolderManager, tn0 instreamVideoAd, ez1 skipCountDownConfigurator, bd2 bd2Var) {
        kotlin.jvm.internal.l.f(viewHolderManager, "viewHolderManager");
        kotlin.jvm.internal.l.f(instreamVideoAd, "instreamVideoAd");
        kotlin.jvm.internal.l.f(skipCountDownConfigurator, "skipCountDownConfigurator");
        this.f27492a = skipCountDownConfigurator;
        this.f27493b = bd2Var;
    }
}
