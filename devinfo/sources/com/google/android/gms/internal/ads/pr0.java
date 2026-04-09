package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pr0 implements vd.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15079a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15080b;

    /* renamed from: c, reason: collision with root package name */
    public final vd.b f15081c;

    public pr0(Object obj, String str, vd.b bVar) {
        this.f15079a = obj;
        this.f15080b = str;
        this.f15081c = bVar;
    }

    @Override // vd.b
    public final void a(Runnable runnable, Executor executor) {
        this.f15081c.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return this.f15081c.cancel(z3);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f15081c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15081c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15081c.isDone();
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        String str = this.f15080b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iIdentityHashCode).length());
        sb2.append(str);
        sb2.append("@");
        sb2.append(iIdentityHashCode);
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f15081c.get(j, timeUnit);
    }
}
