package com.applovin.impl.mediation;

import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.mediation.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4820c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a.InterfaceC0014a f4821d;

    public /* synthetic */ m(a.InterfaceC0014a interfaceC0014a, int i4, String str, int i10) {
        this.f4818a = i10;
        this.f4821d = interfaceC0014a;
        this.f4819b = i4;
        this.f4820c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4818a) {
            case 0:
                ((d.b) this.f4821d).a(this.f4819b, this.f4820c);
                break;
            default:
                ((e.b) this.f4821d).a(this.f4819b, this.f4820c);
                break;
        }
    }
}
