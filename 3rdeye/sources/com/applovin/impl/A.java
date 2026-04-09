package com.applovin.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class A implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18772b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.sdk.k f18773c;

    public /* synthetic */ A(int i, com.applovin.impl.sdk.k kVar) {
        this.f18772b = i;
        this.f18773c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18772b) {
            case 0:
                a8.d(this.f18773c);
                break;
            default:
                this.f18773c.I0();
                break;
        }
    }
}
