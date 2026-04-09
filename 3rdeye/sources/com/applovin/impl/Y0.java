package com.applovin.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class Y0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y3 f18901c;

    public /* synthetic */ Y0(y3 y3Var, int i) {
        this.f18900b = i;
        this.f18901c = y3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18900b) {
            case 0:
                this.f18901c.t();
                break;
            case 1:
                this.f18901c.u();
                break;
            default:
                this.f18901c.o();
                break;
        }
    }
}
