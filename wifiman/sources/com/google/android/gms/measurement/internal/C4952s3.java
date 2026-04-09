package com.google.android.gms.measurement.internal;

import android.content.Context;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4952s3 extends AbstractC4830d4 {

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicLong f36722l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    private C4984w3 f36723c;

    /* renamed from: d, reason: collision with root package name */
    private C4984w3 f36724d;

    /* renamed from: e, reason: collision with root package name */
    private final PriorityBlockingQueue f36725e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f36726f;

    /* renamed from: g, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f36727g;

    /* renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f36728h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f36729i;

    /* renamed from: j, reason: collision with root package name */
    private final Semaphore f36730j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f36731k;

    C4952s3(C4976v3 c4976v3) {
        super(c4976v3);
        this.f36729i = new Object();
        this.f36730j = new Semaphore(2);
        this.f36725e = new PriorityBlockingQueue();
        this.f36726f = new LinkedBlockingQueue();
        this.f36727g = new C4968u3(this, "Thread death: Uncaught exception on worker thread");
        this.f36728h = new C4968u3(this, "Thread death: Uncaught exception on network thread");
    }

    private final void u(C4960t3 c4960t3) {
        synchronized (this.f36729i) {
            try {
                this.f36725e.add(c4960t3);
                C4984w3 c4984w3 = this.f36723c;
                if (c4984w3 == null) {
                    C4984w3 c4984w32 = new C4984w3(this, "Measurement Worker", this.f36725e);
                    this.f36723c = c4984w32;
                    c4984w32.setUncaughtExceptionHandler(this.f36727g);
                    this.f36723c.start();
                } else {
                    c4984w3.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void C(Runnable runnable) {
        l();
        AbstractC7901p.l(runnable);
        u(new C4960t3(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean F() {
        return Thread.currentThread() == this.f36724d;
    }

    public final boolean G() {
        return Thread.currentThread() == this.f36723c;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4893l a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ F b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ D2 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ X2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4915n5 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ x7 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final void h() {
        if (Thread.currentThread() != this.f36724d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final void j() {
        if (Thread.currentThread() != this.f36723c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4830d4
    protected final boolean p() {
        return false;
    }

    final Object r(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzl().z(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                zzj().H().a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            zzj().H().a("Timed out waiting for " + str);
        }
        return obj;
    }

    public final Future s(Callable callable) {
        l();
        AbstractC7901p.l(callable);
        C4960t3 c4960t3 = new C4960t3(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f36723c) {
            if (!this.f36725e.isEmpty()) {
                zzj().H().a("Callable skipped the worker queue.");
            }
            c4960t3.run();
        } else {
            u(c4960t3);
        }
        return c4960t3;
    }

    public final void v(Runnable runnable) {
        l();
        AbstractC7901p.l(runnable);
        C4960t3 c4960t3 = new C4960t3(this, runnable, false, "Task exception on network thread");
        synchronized (this.f36729i) {
            try {
                this.f36726f.add(c4960t3);
                C4984w3 c4984w3 = this.f36724d;
                if (c4984w3 == null) {
                    C4984w3 c4984w32 = new C4984w3(this, "Measurement Network", this.f36726f);
                    this.f36724d = c4984w32;
                    c4984w32.setUncaughtExceptionHandler(this.f36728h);
                    this.f36724d.start();
                } else {
                    c4984w3.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Future x(Callable callable) {
        l();
        AbstractC7901p.l(callable);
        C4960t3 c4960t3 = new C4960t3(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f36723c) {
            c4960t3.run();
        } else {
            u(c4960t3);
        }
        return c4960t3;
    }

    public final void z(Runnable runnable) {
        l();
        AbstractC7901p.l(runnable);
        u(new C4960t3(this, runnable, false, "Task exception on worker thread"));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.d zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4834e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ L2 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4952s3 zzl() {
        return super.zzl();
    }
}
