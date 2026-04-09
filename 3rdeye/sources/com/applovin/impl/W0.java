package com.applovin.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class W0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y3 f18889c;

    public /* synthetic */ W0(y3 y3Var, int i) {
        this.f18888b = i;
        this.f18889c = y3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18888b) {
            case 0:
                this.f18889c.m();
                break;
            case 1:
                this.f18889c.r();
                break;
            default:
                this.f18889c.s();
                break;
        }
    }
}
