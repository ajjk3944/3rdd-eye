package com.applovin.impl;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class c0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f3797a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f3798b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f3799c;

    /* renamed from: e, reason: collision with root package name */
    protected final AtomicBoolean f3801e = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final Context f3800d = com.applovin.impl.sdk.k.o();

    public c0(String str, com.applovin.impl.sdk.k kVar) {
        this.f3798b = str;
        this.f3797a = kVar;
        this.f3799c = kVar.O();
    }

    public Context a() {
        return this.f3800d;
    }

    public void a(boolean z3) {
        this.f3801e.set(z3);
    }
}
