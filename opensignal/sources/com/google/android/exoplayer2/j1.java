package com.google.android.exoplayer2;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f4195a;

    /* renamed from: b, reason: collision with root package name */
    public final h1 f4196b;

    /* renamed from: c, reason: collision with root package name */
    public final qb.a f4197c;

    /* renamed from: d, reason: collision with root package name */
    public int f4198d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4199e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f4200f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4201g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4202h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4203i;

    public j1(h1 h1Var, i1 i1Var, w1 w1Var, int i10, qb.a aVar, Looper looper) {
        this.f4196b = h1Var;
        this.f4195a = i1Var;
        this.f4200f = looper;
        this.f4197c = aVar;
    }

    public final synchronized void a(long j) {
        boolean z10;
        qb.b.j(this.f4201g);
        qb.b.j(this.f4200f.getThread() != Thread.currentThread());
        ((et.d) this.f4197c).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z10 = this.f4203i;
            if (z10 || j <= 0) {
                break;
            }
            this.f4197c.getClass();
            wait(j);
            ((et.d) this.f4197c).getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z10) {
        this.f4202h = z10 | this.f4202h;
        this.f4203i = true;
        notifyAll();
    }

    public final void c() {
        qb.b.j(!this.f4201g);
        this.f4201g = true;
        f0 f0Var = (f0) this.f4196b;
        synchronized (f0Var) {
            if (!f0Var.T && f0Var.D.isAlive()) {
                f0Var.B.a(14, this).b();
                return;
            }
            io.sentry.android.core.e0.p("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
