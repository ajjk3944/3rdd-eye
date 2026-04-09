package com.vungle.ads.internal.presenter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f23815c;

    public /* synthetic */ e(g gVar, int i) {
        this.f23814b = i;
        this.f23815c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23814b) {
            case 0:
                g.m94processCommand$lambda7(this.f23815c);
                break;
            default:
                g.m88prepare$lambda14(this.f23815c);
                break;
        }
    }
}
