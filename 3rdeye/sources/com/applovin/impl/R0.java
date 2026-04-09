package com.applovin.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class R0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18854b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f18855c;

    public /* synthetic */ R0(v1 v1Var, int i) {
        this.f18854b = i;
        this.f18855c = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18854b) {
            case 0:
                this.f18855c.L();
                break;
            default:
                this.f18855c.J();
                break;
        }
    }
}
