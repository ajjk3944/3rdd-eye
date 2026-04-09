package com.applovin.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class I0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.adview.g f18812c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f18813d;

    public /* synthetic */ I0(com.applovin.impl.adview.g gVar, Runnable runnable, int i) {
        this.f18811b = i;
        this.f18812c = gVar;
        this.f18813d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18811b) {
            case 0:
                r1.c(this.f18812c, this.f18813d);
                break;
            default:
                r1.b(this.f18812c, this.f18813d);
                break;
        }
    }
}
