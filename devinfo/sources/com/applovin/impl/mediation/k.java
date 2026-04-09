package com.applovin.impl.mediation;

import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.s4;
import com.applovin.impl.y2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements s4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediationServiceImpl f4808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4809c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4810d;

    public /* synthetic */ k(MediationServiceImpl mediationServiceImpl, Object obj, Object obj2, int i4) {
        this.f4807a = i4;
        this.f4808b = mediationServiceImpl;
        this.f4809c = obj;
        this.f4810d = obj2;
    }

    @Override // com.applovin.impl.s4.a
    public final void a(Object obj) {
        switch (this.f4807a) {
            case 0:
                this.f4808b.a((h) this.f4809c, (s4) this.f4810d, (String) obj);
                break;
            default:
                this.f4808b.a((y2) this.f4809c, (a.InterfaceC0014a) this.f4810d, (String) obj);
                break;
        }
    }
}
