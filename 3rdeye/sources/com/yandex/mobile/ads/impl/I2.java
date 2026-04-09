package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.ml;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class I2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24141b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24142c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24143d;

    public /* synthetic */ I2(int i, Object obj, Object obj2) {
        this.f24141b = i;
        this.f24142c = obj;
        this.f24143d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24141b) {
            case 0:
                ml.a.a((ml.a) this.f24142c, (Bitmap) this.f24143d);
                break;
            case 1:
                ((o60) this.f24142c).b((hi1) this.f24143d);
                break;
            case 2:
                ad.a((ad) this.f24142c, (ae) this.f24143d);
                break;
            case 3:
                g61.a((g61) this.f24142c, (pz1) ((a81) this.f24143d));
                break;
            case 4:
                ik.a((ik) this.f24142c, (h7) this.f24143d);
                break;
            default:
                nm1.a((c6) this.f24142c, (nm1) this.f24143d);
                break;
        }
    }
}
