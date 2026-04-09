package com.applovin.impl;

import com.applovin.impl.v;

/* loaded from: classes.dex */
public class o5 extends i5 {

    /* renamed from: g, reason: collision with root package name */
    private final a f7152g;

    public interface a {
        void a(v.a aVar);
    }

    public o5(com.applovin.impl.sdk.k kVar, a aVar) {
        super("TaskCollectAdvertisingId", kVar, true);
        this.f7152g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7152g.a(this.f6218a.A().f());
    }
}
