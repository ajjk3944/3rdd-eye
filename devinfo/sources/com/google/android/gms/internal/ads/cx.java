package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cx {

    /* renamed from: a, reason: collision with root package name */
    public w81 f10242a;

    /* renamed from: b, reason: collision with root package name */
    public qd0 f10243b;

    /* renamed from: c, reason: collision with root package name */
    public Context f10244c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f10245d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f10246e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public long f10247f = -1;
    public long g = -1;

    public final void a(w81 w81Var, qd0 qd0Var, Context context) {
        if (this.f10245d.getAndSet(true)) {
            return;
        }
        this.f10242a = w81Var;
        this.f10243b = qd0Var;
        pk pkVar = sk.f16066bf;
        va.s sVar = va.s.f36163e;
        this.f10247f = ((Long) sVar.f36166c.a(pkVar)).longValue();
        this.g = ((Long) sVar.f36166c.a(sk.f16082cf)).longValue();
        this.f10244c = context;
    }
}
