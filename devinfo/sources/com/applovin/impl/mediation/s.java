package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.b f4839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f4840c;

    public /* synthetic */ s(h.b bVar, Bundle bundle, int i4) {
        this.f4838a = i4;
        this.f4839b = bVar;
        this.f4840c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4838a) {
            case 0:
                this.f4839b.j(this.f4840c);
                break;
            case 1:
                this.f4839b.e(this.f4840c);
                break;
            case 2:
                this.f4839b.i(this.f4840c);
                break;
            case 3:
                this.f4839b.a(this.f4840c);
                break;
            case 4:
                this.f4839b.f(this.f4840c);
                break;
            case 5:
                this.f4839b.g(this.f4840c);
                break;
            case 6:
                this.f4839b.h(this.f4840c);
                break;
            case 7:
                this.f4839b.d(this.f4840c);
                break;
            case 8:
                this.f4839b.c(this.f4840c);
                break;
            default:
                this.f4839b.b(this.f4840c);
                break;
        }
    }
}
