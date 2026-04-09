package com.applovin.impl.mediation;

import com.applovin.impl.mediation.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4846b;

    public /* synthetic */ u(int i4, Object obj) {
        this.f4845a = i4;
        this.f4846b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4845a) {
            case 0:
                ((h.b) this.f4846b).a();
                break;
            default:
                ((h) this.f4846b).l();
                break;
        }
    }
}
