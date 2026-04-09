package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class da extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final BlockingQueue f10384a;

    /* renamed from: b, reason: collision with root package name */
    public final ca f10385b;

    /* renamed from: c, reason: collision with root package name */
    public final sa f10386c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f10387d = false;

    /* renamed from: e, reason: collision with root package name */
    public final fk0 f10388e;

    public da(PriorityBlockingQueue priorityBlockingQueue, rt rtVar, sa saVar, fk0 fk0Var) {
        this.f10384a = priorityBlockingQueue;
        this.f10385b = rtVar;
        this.f10386c = saVar;
        this.f10388e = fk0Var;
    }

    public final void a() {
        fk0 fk0Var = this.f10388e;
        ha haVar = (ha) this.f10384a.take();
        SystemClock.elapsedRealtime();
        haVar.c();
        int i4 = 1;
        Object obj = null;
        try {
            try {
                haVar.a("network-queue-take");
                haVar.e();
                TrafficStats.setThreadStatsTag(haVar.f11783d);
                fa faVarL = this.f10385b.l(haVar);
                haVar.a("network-http-complete");
                if (faVarL.f11078e && haVar.h()) {
                    haVar.b("not-modified");
                    haVar.m();
                } else {
                    b5.i0 i0VarI = haVar.i(faVarL);
                    haVar.a("network-parse-complete");
                    x9 x9Var = (x9) i0VarI.f1822c;
                    if (x9Var != null) {
                        this.f10386c.b(haVar.d(), x9Var);
                        haVar.a("network-cache-written");
                    }
                    synchronized (haVar.f11784e) {
                        haVar.f11787i = true;
                    }
                    fk0Var.i(haVar, i0VarI, null);
                    haVar.l(i0VarI);
                }
            } catch (ka e2) {
                SystemClock.elapsedRealtime();
                fk0Var.getClass();
                haVar.a("post-error");
                ((aa) fk0Var.f11194b).f9289b.post(new d1(haVar, new b5.i0(e2), obj, i4));
                haVar.m();
            } catch (Exception e10) {
                Log.e("Volley", na.d("Unhandled exception %s", e10.toString()), e10);
                ka kaVar = new ka(e10);
                SystemClock.elapsedRealtime();
                fk0Var.getClass();
                haVar.a("post-error");
                ((aa) fk0Var.f11194b).f9289b.post(new d1(haVar, new b5.i0(kaVar), obj, i4));
                haVar.m();
            }
            haVar.c();
        } catch (Throwable th2) {
            haVar.c();
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f10387d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                na.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
