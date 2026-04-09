package com.yandex.mobile.ads.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class I1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24140c;

    public /* synthetic */ I1(Object obj, int i) {
        this.f24139b = i;
        this.f24140c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24139b) {
            case 0:
                lm1.a((lm1) this.f24140c);
                break;
            case 1:
                si.d((si) this.f24140c);
                break;
            case 2:
                u01.a((ws) this.f24140c);
                break;
            default:
                ye2.c((ye2) this.f24140c);
                break;
        }
    }
}
