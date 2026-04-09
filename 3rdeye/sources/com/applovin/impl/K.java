package com.applovin.impl;

import androidx.camera.core.impl.AbstractC1707p;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.yandex.mobile.ads.impl.mq1;
import d0.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class K implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18817b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18818c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18819d;

    public /* synthetic */ K(int i, int i10, Object obj) {
        this.f18817b = i10;
        this.f18819d = obj;
        this.f18818c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18817b) {
            case 0:
                ((h2) this.f18819d).a(this.f18818c);
                return;
            case 1:
                ((MaxAdPlacer) this.f18819d).a(this.f18818c);
                return;
            case 2:
                ((mq1) this.f18819d).a(this.f18818c);
                return;
            case 3:
                s.c cVar = (s.c) this.f18819d;
                boolean z10 = cVar.f37295j;
                d0.s sVar = cVar.f37296k;
                if (z10) {
                    C.S.g(sVar.f37258a, "Receives input frame after codec is reset.");
                    return;
                }
                switch (sVar.f37276t.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        sVar.f37267k.offer(Integer.valueOf(this.f18818c));
                        sVar.c();
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: " + sVar.f37276t);
                }
            default:
                ((AbstractC1707p) this.f18819d).a(this.f18818c);
                return;
        }
    }
}
