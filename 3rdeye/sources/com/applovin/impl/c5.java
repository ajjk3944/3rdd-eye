package com.applovin.impl;

import com.applovin.impl.AbstractC2147u;

/* loaded from: classes.dex */
public class c5 extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final a f19171g;

    public interface a {
        void a(AbstractC2147u.a aVar);
    }

    public c5(com.applovin.impl.sdk.k kVar, a aVar) {
        super("TaskCollectAdvertisingId", kVar, true);
        this.f19171g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f19171g.a(this.f21692a.B().f());
    }
}
