package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.mq1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class N implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24199c;

    public /* synthetic */ N(Object obj, int i) {
        this.f24198b = i;
        this.f24199c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24198b) {
            case 0:
                ((ch) this.f24199c).d();
                break;
            case 1:
                ((mq1.c) this.f24199c).b();
                break;
            case 2:
                ((yl1) this.f24199c).f();
                break;
            case 3:
                e20.b((kotlin.jvm.internal.w) this.f24199c);
                break;
            case 4:
                hc.b((hc) this.f24199c);
                break;
            case 5:
                jm1.a((jm1) this.f24199c);
                break;
            case 6:
                mn0.a((mn0) this.f24199c, "Video player returned error");
                break;
            case 7:
                si.c((si) this.f24199c);
                break;
            default:
                ye2.d((ye2) this.f24199c);
                break;
        }
    }
}
