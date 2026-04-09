package com.applovin.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class S0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f18861c;

    public /* synthetic */ S0(v1 v1Var, int i) {
        this.f18860b = i;
        this.f18861c = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18860b) {
            case 0:
                this.f18861c.I();
                break;
            default:
                this.f18861c.M();
                break;
        }
    }
}
