package com.applovin.impl.mediation.ads;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20297b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaxFullscreenAdImpl f20298c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f20299d;

    public /* synthetic */ c(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, int i) {
        this.f20297b = i;
        this.f20298c = maxFullscreenAdImpl;
        this.f20299d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20297b) {
            case 0:
                this.f20298c.c(this.f20299d);
                break;
            default:
                this.f20298c.b(this.f20299d);
                break;
        }
    }
}
