package com.applovin.impl.adview;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19069b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f19070c;

    public /* synthetic */ o(a aVar, int i) {
        this.f19069b = i;
        this.f19070c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19069b) {
            case 0:
                this.f19070c.s();
                break;
            case 1:
                this.f19070c.q();
                break;
            default:
                this.f19070c.o();
                break;
        }
    }
}
