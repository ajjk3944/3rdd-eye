package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.mq1;
import com.yandex.mobile.ads.impl.o22;
import p9.InterfaceC5480a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class J2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24153c;

    public /* synthetic */ J2(Object obj, int i) {
        this.f24152b = i;
        this.f24153c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24152b) {
            case 0:
                ((mq1.c) this.f24153c).a();
                break;
            case 1:
                o22.b.a((o22) this.f24153c);
                break;
            case 2:
                ((yl1) this.f24153c).e();
                break;
            case 3:
                de2.a((de2) this.f24153c);
                break;
            case 4:
                ((e12) this.f24153c).c();
                break;
            case 5:
                ge1.c((ge1) this.f24153c);
                break;
            case 6:
                i51.b((i51) this.f24153c);
                break;
            case 7:
                lt0.a((lt0) this.f24153c);
                break;
            case 8:
                mn0.a((mn0) this.f24153c);
                break;
            case 9:
                nm1.a((nm1) this.f24153c);
                break;
            case 10:
                qe.a((InterfaceC5480a) this.f24153c);
                break;
            case 11:
                wv1.h((wv1) this.f24153c);
                break;
            case 12:
                ye2.b((ye2) this.f24153c);
                break;
            case 13:
                z82.a((z82) this.f24153c);
                break;
            default:
                ((zy) this.f24153c).c();
                break;
        }
    }
}
