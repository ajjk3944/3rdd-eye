package com.applovin.impl;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class c0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f5631a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f5632b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f5633c;

    /* renamed from: e, reason: collision with root package name */
    protected final AtomicBoolean f5635e = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final Context f5634d = com.applovin.impl.sdk.k.o();

    public c0(String str, com.applovin.impl.sdk.k kVar) {
        this.f5632b = str;
        this.f5631a = kVar;
        this.f5633c = kVar.O();
    }

    public Context a() {
        return this.f5634d;
    }

    public void a(boolean z10) {
        this.f5635e.set(z10);
    }
}
