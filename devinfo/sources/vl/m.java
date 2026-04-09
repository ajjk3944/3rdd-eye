package vl;

import a0.x0;
import b5.i0;
import ec.t0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rl.t;
import rl.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final t f36332a;

    /* renamed from: b, reason: collision with root package name */
    public final va.o f36333b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f36334c;

    /* renamed from: d, reason: collision with root package name */
    public final l f36335d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f36336e;

    /* renamed from: f, reason: collision with root package name */
    public Object f36337f;
    public g g;

    /* renamed from: h, reason: collision with root package name */
    public n f36338h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f36339i;
    public i0 j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f36340k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f36341l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f36342m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f36343n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f36344o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f36345p;

    /* renamed from: q, reason: collision with root package name */
    public volatile i0 f36346q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f36347r;

    public m(t tVar, va.o oVar) {
        this.f36332a = tVar;
        this.f36333b = oVar;
        this.f36334c = (t0) tVar.A.f30011b;
        tVar.f33157d.getClass();
        l lVar = new l(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        lVar.g(0);
        this.f36335d = lVar;
        this.f36336e = new AtomicBoolean();
        this.f36344o = true;
        this.f36347r = new CopyOnWriteArrayList();
        new AtomicReference((cm.g) oVar.f36150f);
    }

    public static final String a(m mVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mVar.f36345p ? "canceled " : "");
        sb2.append("call");
        sb2.append(" to ");
        sb2.append(((rl.n) mVar.f36333b.f36146b).g());
        return sb2.toString();
    }

    public final void b(n nVar) {
        nk.k.e(nVar, "connection");
        TimeZone timeZone = sl.h.f33837a;
        if (this.f36338h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f36338h = nVar;
        nVar.f36360p.add(new k(this, this.f36337f));
    }

    public final void cancel() {
        if (this.f36345p) {
            return;
        }
        this.f36345p = true;
        i0 i0Var = this.f36346q;
        if (i0Var != null) {
            ((wl.f) i0Var.f1823d).cancel();
        }
        Iterator it = this.f36347r.iterator();
        nk.k.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((r) it.next()).cancel();
        }
    }

    public final Object clone() {
        return new m(this.f36332a, this.f36333b);
    }

    public final IOException d(IOException iOException) {
        IOException interruptedIOException;
        Socket socketJ;
        TimeZone timeZone = sl.h.f33837a;
        n nVar = this.f36338h;
        if (nVar != null) {
            synchronized (nVar) {
                socketJ = j();
            }
            if (this.f36338h == null) {
                if (socketJ != null) {
                    sl.h.c(socketJ);
                }
            } else if (socketJ != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f36339i && this.f36335d.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            nk.k.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final z e() {
        if (!this.f36336e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f36335d.h();
        bm.e eVar = bm.e.f2349a;
        this.f36337f = bm.e.f2349a.h();
        try {
            x0 x0Var = this.f36332a.f33154a;
            synchronized (x0Var) {
                ((ArrayDeque) x0Var.f147d).add(this);
            }
            return g();
        } finally {
            x0 x0Var2 = this.f36332a.f33154a;
            x0Var2.getClass();
            x0.I(x0Var2, null, this, null, 5);
        }
    }

    public final void f(boolean z3) {
        i0 i0Var;
        synchronized (this) {
            if (!this.f36344o) {
                throw new IllegalStateException("released");
            }
        }
        if (z3 && (i0Var = this.f36346q) != null) {
            ((wl.f) i0Var.f1823d).cancel();
            ((m) i0Var.f1821b).h(i0Var, true, true, true, true, null);
        }
        this.j = null;
    }

    public final z g() {
        ArrayList arrayList = new ArrayList();
        zj.n.W(arrayList, this.f36332a.f33155b);
        arrayList.add(new wl.a(this.f36332a));
        arrayList.add(new wl.a(this.f36332a.j));
        arrayList.add(new tl.a());
        arrayList.add(a.f36289a);
        zj.n.W(arrayList, this.f36332a.f33156c);
        arrayList.add(wl.c.f36828a);
        va.o oVar = this.f36333b;
        t tVar = this.f36332a;
        boolean z3 = false;
        try {
            try {
                z zVarB = new wl.h(this, arrayList, 0, null, oVar, tVar.f33173v, tVar.f33174w, tVar.f33175x).b(oVar);
                if (this.f36345p) {
                    sl.f.b(zVarB);
                    throw new IOException("Canceled");
                }
                i(null);
                return zVarB;
            } catch (IOException e2) {
                z3 = true;
                IOException iOExceptionI = i(e2);
                nk.k.c(iOExceptionI, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionI;
            }
        } catch (Throwable th2) {
            if (!z3) {
                i(null);
            }
            throw th2;
        }
    }

    public final IOException h(i0 i0Var, boolean z3, boolean z10, boolean z11, boolean z12, IOException iOException) {
        boolean z13;
        boolean z14;
        nk.k.e(i0Var, "exchange");
        if (i0Var.equals(this.f36346q)) {
            synchronized (this) {
                z13 = false;
                if (z3) {
                    try {
                        if (!this.f36340k) {
                            if ((z10 || !this.f36341l) && ((!z12 || !this.f36342m) && (!z11 || !this.f36343n))) {
                            }
                        }
                        if (z3) {
                            this.f36340k = false;
                        }
                        if (z10) {
                            this.f36341l = false;
                        }
                        if (z12) {
                            this.f36342m = false;
                        }
                        if (z11) {
                            this.f36343n = false;
                        }
                        boolean z15 = (this.f36340k || this.f36341l || this.f36342m || this.f36343n) ? false : true;
                        if (z15) {
                            if (!this.f36344o) {
                                z13 = true;
                            }
                        }
                        boolean z16 = z15;
                        z14 = z13;
                        z13 = z16;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    z14 = z10 ? false : false;
                }
            }
            if (z13) {
                this.f36346q = null;
                n nVar = this.f36338h;
                if (nVar != null) {
                    nVar.d();
                }
            }
            if (z14) {
                return d(iOException);
            }
        }
        return iOException;
    }

    public final IOException i(IOException iOException) {
        boolean z3;
        synchronized (this) {
            z3 = false;
            if (this.f36344o) {
                this.f36344o = false;
                if (!this.f36340k && !this.f36341l && !this.f36342m) {
                    if (!this.f36343n) {
                        z3 = true;
                    }
                }
            }
        }
        return z3 ? d(iOException) : iOException;
    }

    public final Socket j() {
        n nVar = this.f36338h;
        nk.k.b(nVar);
        TimeZone timeZone = sl.h.f33837a;
        ArrayList arrayList = nVar.f36360p;
        int size = arrayList.size();
        int i4 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i4 = -1;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            if (nk.k.a(((Reference) obj).get(), this)) {
                break;
            }
            i4++;
        }
        if (i4 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i4);
        this.f36338h = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        nVar.f36361q = System.nanoTime();
        t0 t0Var = this.f36334c;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) t0Var.f23072e;
        ul.c cVar = (ul.c) t0Var.f23070c;
        TimeZone timeZone2 = sl.h.f33837a;
        if (!nVar.j) {
            cVar.d((ul.b) t0Var.f23071d, 0L);
            return null;
        }
        nVar.j = true;
        concurrentLinkedQueue.remove(nVar);
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.a();
        }
        return nVar.f36351e;
    }
}
