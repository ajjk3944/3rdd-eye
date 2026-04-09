package com.yandex.mobile.ads.impl;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class hi1 {

    /* renamed from: a, reason: collision with root package name */
    private final b f28228a;

    /* renamed from: b, reason: collision with root package name */
    private final a f28229b;

    /* renamed from: c, reason: collision with root package name */
    private final dp f28230c;

    /* renamed from: d, reason: collision with root package name */
    private int f28231d;

    /* renamed from: e, reason: collision with root package name */
    private Object f28232e;

    /* renamed from: f, reason: collision with root package name */
    private Looper f28233f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f28234g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f28235h;
    private boolean i;

    public interface a {
    }

    public interface b {
        void a(int i, Object obj) throws h60;
    }

    public hi1(a aVar, b bVar, v42 v42Var, int i, dp dpVar, Looper looper) {
        this.f28229b = aVar;
        this.f28228a = bVar;
        this.f28233f = looper;
        this.f28230c = dpVar;
    }

    public final synchronized void a(long j4) throws InterruptedException, TimeoutException {
        boolean z10;
        if (!this.f28234g) {
            throw new IllegalStateException();
        }
        if (this.f28233f.getThread() == Thread.currentThread()) {
            throw new IllegalStateException();
        }
        long jB = this.f28230c.b() + j4;
        while (true) {
            z10 = this.i;
            if (z10 || j4 <= 0) {
                break;
            }
            this.f28230c.getClass();
            wait(j4);
            j4 = jB - this.f28230c.b();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final Object b() {
        return this.f28232e;
    }

    public final b c() {
        return this.f28228a;
    }

    public final int d() {
        return this.f28231d;
    }

    public final hi1 e() {
        if (this.f28234g) {
            throw new IllegalStateException();
        }
        this.f28234g = true;
        ((o60) this.f28229b).c(this);
        return this;
    }

    public final Looper a() {
        return this.f28233f;
    }

    public final synchronized void a(boolean z10) {
        this.f28235h = z10 | this.f28235h;
        this.i = true;
        notifyAll();
    }

    public final hi1 a(Object obj) {
        if (!this.f28234g) {
            this.f28232e = obj;
            return this;
        }
        throw new IllegalStateException();
    }

    public final hi1 a(int i) {
        if (!this.f28234g) {
            this.f28231d = i;
            return this;
        }
        throw new IllegalStateException();
    }
}
