package com.google.android.gms.internal.ads;

import android.os.Process;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y9 extends Thread {
    public static final boolean g = na.f14189a;

    /* renamed from: a, reason: collision with root package name */
    public final BlockingQueue f18677a;

    /* renamed from: b, reason: collision with root package name */
    public final BlockingQueue f18678b;

    /* renamed from: c, reason: collision with root package name */
    public final sa f18679c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f18680d = false;

    /* renamed from: e, reason: collision with root package name */
    public final aw f18681e;

    /* renamed from: f, reason: collision with root package name */
    public final fk0 f18682f;

    public y9(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, sa saVar, fk0 fk0Var) {
        this.f18677a = priorityBlockingQueue;
        this.f18678b = priorityBlockingQueue2;
        this.f18679c = saVar;
        this.f18682f = fk0Var;
        this.f18681e = new aw(this, priorityBlockingQueue2, fk0Var);
    }

    public final void a() {
        ha haVar = (ha) this.f18677a.take();
        haVar.a("cache-queue-take");
        haVar.c();
        try {
            haVar.e();
            sa saVar = this.f18679c;
            x9 x9VarA = saVar.a(haVar.d());
            if (x9VarA == null) {
                haVar.a("cache-miss");
                if (!this.f18681e.t(haVar)) {
                    this.f18678b.put(haVar);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (x9VarA.f18326e < jCurrentTimeMillis) {
                    haVar.a("cache-hit-expired");
                    haVar.j = x9VarA;
                    if (!this.f18681e.t(haVar)) {
                        this.f18678b.put(haVar);
                    }
                } else {
                    haVar.a("cache-hit");
                    byte[] bArr = x9VarA.f18322a;
                    Map map = x9VarA.g;
                    b5.i0 i0VarI = haVar.i(new fa(TTAdConstant.MATE_VALID, bArr, map, fa.a(map), false));
                    haVar.a("cache-hit-parsed");
                    if (!(((ka) i0VarI.f1823d) == null)) {
                        haVar.a("cache-parsing-failed");
                        String strD = haVar.d();
                        synchronized (saVar) {
                            x9 x9VarA2 = saVar.a(strD);
                            if (x9VarA2 != null) {
                                x9VarA2.f18327f = 0L;
                                x9VarA2.f18326e = 0L;
                                saVar.b(strD, x9VarA2);
                            }
                        }
                        haVar.j = null;
                        if (!this.f18681e.t(haVar)) {
                            this.f18678b.put(haVar);
                        }
                    } else if (x9VarA.f18327f < jCurrentTimeMillis) {
                        haVar.a("cache-hit-refresh-needed");
                        haVar.j = x9VarA;
                        i0VarI.f1820a = true;
                        if (this.f18681e.t(haVar)) {
                            this.f18682f.i(haVar, i0VarI, null);
                        } else {
                            this.f18682f.i(haVar, i0VarI, new q81(this, false, haVar, 3));
                        }
                    } else {
                        this.f18682f.i(haVar, i0VarI, null);
                    }
                }
            }
            haVar.c();
        } catch (Throwable th2) {
            haVar.c();
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (g) {
            na.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f18679c.c();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f18680d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                na.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
