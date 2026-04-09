package su;

import bc.p;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import mq.t;
import ou.a0;
import ou.c0;
import ou.u;
import ou.x;
import xu.n;

/* loaded from: classes.dex */
public final class i implements Cloneable {
    public Object B;
    public e D;
    public k E;
    public p F;
    public boolean G;
    public boolean H;
    public boolean I;
    public volatile boolean J;
    public volatile p K;
    public volatile k L;

    /* renamed from: a, reason: collision with root package name */
    public final x f22335a;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f22336d;

    /* renamed from: g, reason: collision with root package name */
    public final l f22337g;

    /* renamed from: r, reason: collision with root package name */
    public final ou.p f22338r;

    /* renamed from: x, reason: collision with root package name */
    public final h f22339x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f22340y;

    public i(x xVar, a0 a0Var) {
        br.l.e(a0Var, "originalRequest");
        this.f22335a = xVar;
        this.f22336d = a0Var;
        this.f22337g = (l) xVar.f20005d.f11051a;
        this.f22338r = (ou.p) xVar.f20008x.f11882d;
        h hVar = new h(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hVar.g(0);
        this.f22339x = hVar;
        this.f22340y = new AtomicBoolean();
        this.I = true;
    }

    public static final String a(i iVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iVar.J ? "canceled " : "");
        sb2.append("call");
        sb2.append(" to ");
        sb2.append(iVar.f22336d.f19860a.f());
        return sb2.toString();
    }

    public final void b(k kVar) {
        byte[] bArr = pu.b.f20645a;
        if (this.E != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.E = kVar;
        kVar.f22354p.add(new g(this, this.B));
    }

    public final IOException c(IOException iOException) throws IOException {
        IOException interruptedIOException;
        Socket socketJ;
        byte[] bArr = pu.b.f20645a;
        k kVar = this.E;
        if (kVar != null) {
            synchronized (kVar) {
                socketJ = j();
            }
            if (this.E == null) {
                if (socketJ != null) {
                    pu.b.e(socketJ);
                }
                this.f22338r.l(this, kVar);
            } else if (socketJ != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f22339x.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException == null) {
            this.f22338r.d(this);
            return interruptedIOException;
        }
        ou.p pVar = this.f22338r;
        br.l.b(interruptedIOException);
        pVar.e(this, interruptedIOException);
        return interruptedIOException;
    }

    public final Object clone() {
        return new i(this.f22335a, this.f22336d);
    }

    public final void d() throws IOException {
        Socket socket;
        if (this.J) {
            return;
        }
        this.J = true;
        p pVar = this.K;
        if (pVar != null) {
            ((tu.d) pVar.f2640e).cancel();
        }
        k kVar = this.L;
        if (kVar != null && (socket = kVar.f22343c) != null) {
            pu.b.e(socket);
        }
        this.f22338r.g(this);
    }

    public final c0 e() {
        if (!this.f22340y.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f22339x.h();
        n nVar = n.f25563a;
        this.B = n.f25563a.g();
        this.f22338r.f(this);
        try {
            js.e eVar = this.f22335a.f20004a;
            synchronized (eVar) {
                ((ArrayDeque) eVar.f13797d).add(this);
            }
            return g();
        } finally {
            js.e eVar2 = this.f22335a.f20004a;
            eVar2.T((ArrayDeque) eVar2.f13797d, this);
        }
    }

    public final void f(boolean z10) {
        p pVar;
        synchronized (this) {
            if (!this.I) {
                throw new IllegalStateException("released");
            }
        }
        if (z10 && (pVar = this.K) != null) {
            ((tu.d) pVar.f2640e).cancel();
            ((i) pVar.f2637b).h(pVar, true, true, null);
        }
        this.F = null;
    }

    public final c0 g() {
        Object next;
        ArrayList arrayList = new ArrayList();
        t.d0(arrayList, this.f22335a.f20006g);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((u) next) instanceof io.sentry.okhttp.f) {
                break;
            }
        }
        if (next == null) {
            arrayList.add(new io.sentry.okhttp.f());
        }
        arrayList.add(new tu.a(this.f22335a));
        arrayList.add(new tu.a(this.f22335a.F));
        arrayList.add(new qu.b(this.f22335a.G));
        arrayList.add(a.f22306a);
        t.d0(arrayList, this.f22335a.f20007r);
        arrayList.add(new tu.b());
        a0 a0Var = this.f22336d;
        x xVar = this.f22335a;
        try {
            try {
                c0 c0VarB = new tu.f(this, arrayList, 0, null, a0Var, xVar.S, xVar.T, xVar.U).b(this.f22336d);
                if (this.J) {
                    pu.b.d(c0VarB);
                    throw new IOException("Canceled");
                }
                i(null);
                return c0VarB;
            } catch (IOException e4) {
                IOException iOExceptionI = i(e4);
                br.l.c(iOExceptionI, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionI;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                i(null);
            }
            throw th2;
        }
    }

    public final IOException h(p pVar, boolean z10, boolean z11, IOException iOException) {
        boolean z12;
        boolean z13;
        br.l.e(pVar, "exchange");
        if (pVar.equals(this.K)) {
            synchronized (this) {
                z12 = false;
                if (z10) {
                    try {
                        if (!this.G) {
                            if (z11 || !this.H) {
                                z13 = false;
                            }
                        }
                        if (z10) {
                            this.G = false;
                        }
                        if (z11) {
                            this.H = false;
                        }
                        boolean z14 = this.G;
                        boolean z15 = (z14 || this.H) ? false : true;
                        if (!z14 && !this.H) {
                            if (!this.I) {
                                z12 = true;
                            }
                        }
                        z13 = z12;
                        z12 = z15;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    if (z11) {
                    }
                    z13 = false;
                }
            }
            if (z12) {
                this.K = null;
                k kVar = this.E;
                if (kVar != null) {
                    synchronized (kVar) {
                        kVar.f22351m++;
                    }
                }
            }
            if (z13) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException i(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.I) {
                this.I = false;
                if (!this.G) {
                    if (!this.H) {
                        z10 = true;
                    }
                }
            }
        }
        return z10 ? c(iOException) : iOException;
    }

    public final Socket j() {
        k kVar = this.E;
        br.l.b(kVar);
        byte[] bArr = pu.b.f20645a;
        ArrayList arrayList = kVar.f22354p;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (br.l.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i10);
        this.E = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        kVar.f22355q = System.nanoTime();
        l lVar = this.f22337g;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) lVar.f22360e;
        ru.b bVar = (ru.b) lVar.f22358c;
        byte[] bArr2 = pu.b.f20645a;
        if (!kVar.j) {
            bVar.c((qu.f) lVar.f22359d, 0L);
            return null;
        }
        kVar.j = true;
        concurrentLinkedQueue.remove(kVar);
        if (concurrentLinkedQueue.isEmpty()) {
            bVar.a();
        }
        Socket socket = kVar.f22344d;
        br.l.b(socket);
        return socket;
    }
}
