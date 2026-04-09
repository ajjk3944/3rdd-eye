package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.uD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1951uD extends GD {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f17076c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2005vD f17077d;

    /* renamed from: e, reason: collision with root package name */
    public final Callable f17078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2005vD f17079f;

    public C1951uD(C2005vD c2005vD, Callable callable, Executor executor) {
        this.f17079f = c2005vD;
        this.f17077d = c2005vD;
        executor.getClass();
        this.f17076c = executor;
        this.f17078e = callable;
    }

    @Override // com.google.android.gms.internal.ads.GD
    public final Object a() {
        return this.f17078e.call();
    }

    @Override // com.google.android.gms.internal.ads.GD
    public final String c() {
        return this.f17078e.toString();
    }

    @Override // com.google.android.gms.internal.ads.GD
    public final boolean d() {
        return this.f17077d.isDone();
    }

    @Override // com.google.android.gms.internal.ads.GD
    public final void e(Object obj) {
        this.f17077d.f17236D = null;
        this.f17079f.d(obj);
    }

    @Override // com.google.android.gms.internal.ads.GD
    public final void f(Throwable th) {
        C2005vD c2005vD = this.f17077d;
        c2005vD.f17236D = null;
        if (th instanceof ExecutionException) {
            c2005vD.e(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            c2005vD.cancel(false);
        } else {
            c2005vD.e(th);
        }
    }
}
