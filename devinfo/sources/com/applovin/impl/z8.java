package com.applovin.impl;

import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.s2;
import com.applovin.impl.u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class z8 implements s2.a, u0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppLovinCommunicatorSubscriber f6345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6346b;

    public /* synthetic */ z8(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, Object obj) {
        this.f6345a = appLovinCommunicatorSubscriber;
        this.f6346b = obj;
    }

    @Override // com.applovin.impl.s2.a
    public void a(j2 j2Var, r2 r2Var) {
        ((d7) this.f6345a).a((com.applovin.impl.sdk.k) this.f6346b, j2Var, r2Var);
    }

    @Override // com.applovin.impl.u0.c
    public void a(u0.b bVar) {
        ((u0) this.f6345a).a((u0.c) this.f6346b, bVar);
    }
}
