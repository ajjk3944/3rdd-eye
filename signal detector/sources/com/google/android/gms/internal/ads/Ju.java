package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Ju implements InterfaceFutureC2326a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9392a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9393b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceFutureC2326a f9394c;

    public Ju(Object obj, String str, InterfaceFutureC2326a interfaceFutureC2326a) {
        this.f9392a = obj;
        this.f9393b = str;
        this.f9394c = interfaceFutureC2326a;
    }

    @Override // f4.InterfaceFutureC2326a
    public final void a(Runnable runnable, Executor executor) {
        this.f9394c.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return this.f9394c.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f9394c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9394c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9394c.isDone();
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        String str = this.f9393b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iIdentityHashCode).length());
        sb.append(str);
        sb.append("@");
        sb.append(iIdentityHashCode);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f9394c.get(j6, timeUnit);
    }
}
