package com.applovin.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class X0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18895b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y3 f18896c;

    public /* synthetic */ X0(y3 y3Var, int i) {
        this.f18895b = i;
        this.f18896c = y3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18895b) {
            case 0:
                this.f18896c.q();
                break;
            case 1:
                this.f18896c.p();
                break;
            default:
                this.f18896c.n();
                break;
        }
    }
}
