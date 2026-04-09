package io.sentry;

import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class e2 implements c0, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final x5 f12230a;

    /* renamed from: d, reason: collision with root package name */
    public final i4.b f12231d;

    /* renamed from: g, reason: collision with root package name */
    public final h7.h0 f12232g;

    /* renamed from: r, reason: collision with root package name */
    public volatile k0 f12233r = null;

    public e2(x5 x5Var) {
        this.f12230a = x5Var;
        i.g0 g0Var = new i.g0(x5Var);
        this.f12232g = new h7.h0(g0Var);
        this.f12231d = new i4.b(g0Var, x5Var);
    }

    @Override // io.sentry.c0
    public final z5 b(z5 z5Var, h0 h0Var) {
        if (z5Var.D == null) {
            z5Var.D = "java";
        }
        if (w(z5Var, h0Var)) {
            q(z5Var);
            io.sentry.protocol.r rVar = this.f12230a.getSessionReplay().k;
            if (rVar != null) {
                z5Var.f12270g = rVar;
            }
        }
        return z5Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12233r != null) {
            this.f12233r.f12408f.shutdown();
        }
    }

    @Override // io.sentry.c0
    public final t4 f(t4 t4Var, h0 h0Var) {
        ArrayList arrayList;
        if (t4Var.D == null) {
            t4Var.D = "java";
        }
        Throwable th2 = t4Var.F;
        if (th2 != null) {
            h7.h0 h0Var2 = this.f12232g;
            h0Var2.getClass();
            AtomicInteger atomicInteger = new AtomicInteger(-1);
            HashSet hashSet = new HashSet();
            ArrayDeque arrayDeque = new ArrayDeque();
            h0Var2.u(th2, atomicInteger, hashSet, arrayDeque, null);
            t4Var.P = new fh.f(new ArrayList(arrayDeque));
        }
        io.sentry.protocol.d dVar = t4Var.J;
        x5 x5Var = this.f12230a;
        io.sentry.protocol.d dVarA = io.sentry.protocol.d.a(dVar, x5Var);
        if (dVarA != null) {
            t4Var.J = dVarA;
        }
        Map mapA = x5Var.getModulesLoader().a();
        if (mapA != null) {
            AbstractMap abstractMap = t4Var.U;
            if (abstractMap == null) {
                t4Var.U = new HashMap(mapA);
            } else {
                abstractMap.putAll(mapA);
            }
        }
        if (w(t4Var, h0Var)) {
            q(t4Var);
            fh.f fVar = t4Var.O;
            if ((fVar != null ? fVar.f8871a : null) == null) {
                fh.f fVar2 = t4Var.P;
                ArrayList arrayList2 = fVar2 == null ? null : fVar2.f8871a;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    arrayList = null;
                } else {
                    Iterator it = arrayList2.iterator();
                    arrayList = null;
                    while (it.hasNext()) {
                        io.sentry.protocol.s sVar = (io.sentry.protocol.s) it.next();
                        if (sVar.f12635y != null && sVar.f12633r != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(sVar.f12633r);
                        }
                    }
                }
                boolean zIsAttachThreads = x5Var.isAttachThreads();
                i4.b bVar = this.f12231d;
                if (zIsAttachThreads || io.sentry.hints.a.class.isInstance(dr.a.y(h0Var))) {
                    Object objY = dr.a.y(h0Var);
                    boolean zC = objY instanceof io.sentry.hints.a ? ((io.sentry.hints.a) objY).c() : false;
                    bVar.getClass();
                    t4Var.O = new fh.f(bVar.H(Thread.getAllStackTraces(), arrayList, zC));
                } else if (x5Var.isAttachStacktrace() && ((arrayList2 == null || arrayList2.isEmpty()) && !io.sentry.hints.d.class.isInstance(dr.a.y(h0Var)))) {
                    bVar.getClass();
                    HashMap map = new HashMap();
                    Thread threadCurrentThread = Thread.currentThread();
                    map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
                    t4Var.O = new fh.f(bVar.H(map, null, false));
                    return t4Var;
                }
            }
        }
        return t4Var;
    }

    @Override // io.sentry.c0
    public final io.sentry.protocol.a0 h(io.sentry.protocol.a0 a0Var, h0 h0Var) {
        if (a0Var.D == null) {
            a0Var.D = "java";
        }
        io.sentry.protocol.d dVarA = io.sentry.protocol.d.a(a0Var.J, this.f12230a);
        if (dVarA != null) {
            a0Var.J = dVarA;
        }
        if (w(a0Var, h0Var)) {
            q(a0Var);
        }
        return a0Var;
    }

    @Override // io.sentry.c0
    public final d5 i(d5 d5Var) {
        return d5Var;
    }

    public final void q(g4 g4Var) {
        if (g4Var.f12273y == null) {
            g4Var.f12273y = this.f12230a.getRelease();
        }
        if (g4Var.B == null) {
            g4Var.B = this.f12230a.getEnvironment();
        }
        if (g4Var.G == null) {
            g4Var.G = this.f12230a.getServerName();
        }
        if (this.f12230a.isAttachServerName() && g4Var.G == null) {
            if (this.f12233r == null) {
                this.f12233r = k0.a();
            }
            if (this.f12233r != null) {
                k0 k0Var = this.f12233r;
                if (k0Var.f12405c < System.currentTimeMillis() && k0Var.f12406d.compareAndSet(false, true)) {
                    k0Var.b();
                }
                g4Var.G = k0Var.f12404b;
            }
        }
        if (g4Var.H == null) {
            g4Var.H = this.f12230a.getDist();
        }
        if (g4Var.f12270g == null) {
            g4Var.f12270g = this.f12230a.getSdkVersion();
        }
        x5 x5Var = this.f12230a;
        if (g4Var.f12272x == null) {
            g4Var.f12272x = new HashMap(new HashMap(x5Var.getTags()));
        } else {
            for (Map.Entry<String, String> entry : x5Var.getTags().entrySet()) {
                if (!g4Var.f12272x.containsKey(entry.getKey())) {
                    g4Var.b(entry.getKey(), entry.getValue());
                }
            }
        }
        io.sentry.protocol.e0 e0Var = g4Var.E;
        if (e0Var == null) {
            e0Var = new io.sentry.protocol.e0();
            g4Var.E = e0Var;
        }
        if (e0Var.f12537r == null && this.f12230a.isSendDefaultPii()) {
            e0Var.f12537r = "{{auto}}";
        }
    }

    public final boolean w(g4 g4Var, h0 h0Var) {
        if (dr.a.H(h0Var)) {
            return true;
        }
        this.f12230a.getLogger().m(b5.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", g4Var.f12268a);
        return false;
    }
}
