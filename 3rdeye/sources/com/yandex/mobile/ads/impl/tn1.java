package com.yandex.mobile.ads.impl;

import b9.C1992A;
import c9.C2095p;
import com.yandex.mobile.ads.impl.lh1;
import ia.C4466b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class tn1 implements hn {

    /* renamed from: a, reason: collision with root package name */
    private final vd1 f33731a;

    /* renamed from: b, reason: collision with root package name */
    private final pp1 f33732b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33733c;

    /* renamed from: d, reason: collision with root package name */
    private final wn1 f33734d;

    /* renamed from: e, reason: collision with root package name */
    private final r50 f33735e;

    /* renamed from: f, reason: collision with root package name */
    private final c f33736f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f33737g;

    /* renamed from: h, reason: collision with root package name */
    private Object f33738h;
    private y50 i;

    /* renamed from: j, reason: collision with root package name */
    private un1 f33739j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f33740k;

    /* renamed from: l, reason: collision with root package name */
    private w50 f33741l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f33742m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f33743n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f33744o;

    /* renamed from: p, reason: collision with root package name */
    private volatile boolean f33745p;

    /* renamed from: q, reason: collision with root package name */
    private volatile w50 f33746q;

    /* renamed from: r, reason: collision with root package name */
    private volatile un1 f33747r;

    public static final class b extends WeakReference<tn1> {

        /* renamed from: a, reason: collision with root package name */
        private final Object f33751a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tn1 referent, Object obj) {
            super(referent);
            kotlin.jvm.internal.l.f(referent, "referent");
            this.f33751a = obj;
        }

        public final Object a() {
            return this.f33751a;
        }
    }

    public static final class c extends C4466b {
        public c() {
        }

        @Override // ia.C4466b
        public final void timedOut() {
            tn1.this.a();
        }
    }

    public tn1(vd1 client, pp1 originalRequest, boolean z10) {
        kotlin.jvm.internal.l.f(client, "client");
        kotlin.jvm.internal.l.f(originalRequest, "originalRequest");
        this.f33731a = client;
        this.f33732b = originalRequest;
        this.f33733c = z10;
        this.f33734d = client.f().a();
        this.f33735e = client.k().a(this);
        c cVar = new c();
        cVar.timeout(0, TimeUnit.MILLISECONDS);
        this.f33736f = cVar;
        this.f33737g = new AtomicBoolean();
        this.f33744o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o() {
        return F3.h.i(this.f33745p ? "canceled " : "", this.f33733c ? "web socket" : "call", " to ", this.f33732b.g().j());
    }

    public final vd1 c() {
        return this.f33731a;
    }

    public final Object clone() {
        return new tn1(this.f33731a, this.f33732b, this.f33733c);
    }

    public final un1 d() {
        return this.f33739j;
    }

    public final r50 e() {
        return this.f33735e;
    }

    public final boolean f() {
        return this.f33733c;
    }

    public final w50 g() {
        return this.f33741l;
    }

    public final pp1 h() {
        return this.f33732b;
    }

    public final pq1 i() throws IOException {
        ArrayList arrayList = new ArrayList();
        C2095p.b0(this.f33731a.p(), arrayList);
        arrayList.add(new gr1(this.f33731a));
        arrayList.add(new xl(this.f33731a.h()));
        this.f33731a.getClass();
        arrayList.add(new xm());
        arrayList.add(hr.f28338a);
        if (!this.f33733c) {
            C2095p.b0(this.f33731a.q(), arrayList);
        }
        arrayList.add(new in(this.f33733c));
        boolean z10 = false;
        try {
            try {
                pq1 pq1VarA = new xn1(this, arrayList, 0, null, this.f33732b, this.f33731a.e(), this.f33731a.u(), this.f33731a.z()).a(this.f33732b);
                if (this.f33745p) {
                    t82.a((Closeable) pq1VarA);
                    throw new IOException("Canceled");
                }
                b((IOException) null);
                return pq1VarA;
            } catch (IOException e4) {
                z10 = true;
                IOException iOExceptionB = b(e4);
                kotlin.jvm.internal.l.d(iOExceptionB, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionB;
            }
        } catch (Throwable th) {
            if (!z10) {
                b((IOException) null);
            }
            throw th;
        }
    }

    public final boolean j() {
        return this.f33745p;
    }

    public final String k() {
        return this.f33732b.g().j();
    }

    public final Socket l() {
        un1 un1Var = this.f33739j;
        kotlin.jvm.internal.l.c(un1Var);
        if (t82.f33485f && !Thread.holdsLock(un1Var)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + un1Var);
        }
        ArrayList arrayListB = un1Var.b();
        Iterator it = arrayListB.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (kotlin.jvm.internal.l.b(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayListB.remove(i);
        this.f33739j = null;
        if (arrayListB.isEmpty()) {
            un1Var.a(System.nanoTime());
            if (this.f33734d.a(un1Var)) {
                return un1Var.m();
            }
        }
        return null;
    }

    public final boolean m() {
        y50 y50Var = this.i;
        kotlin.jvm.internal.l.c(y50Var);
        return y50Var.b();
    }

    public final void n() {
        if (this.f33740k) {
            throw new IllegalStateException("Check failed.");
        }
        this.f33740k = true;
        this.f33736f.exit();
    }

    public final void a(un1 connection) {
        kotlin.jvm.internal.l.f(connection, "connection");
        if (!t82.f33485f || Thread.holdsLock(connection)) {
            if (this.f33739j != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f33739j = connection;
            connection.b().add(new b(this, this.f33738h));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    public final pq1 b() {
        if (!this.f33737g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f33736f.enter();
        this.f33738h = lh1.f29999a.b();
        this.f33735e.getClass();
        try {
            this.f33731a.i().a(this);
            return i();
        } finally {
            this.f33731a.i().b(this);
        }
    }

    public final void a() {
        if (this.f33745p) {
            return;
        }
        this.f33745p = true;
        w50 w50Var = this.f33746q;
        if (w50Var != null) {
            w50Var.a();
        }
        un1 un1Var = this.f33747r;
        if (un1Var != null) {
            un1Var.a();
        }
        this.f33735e.getClass();
    }

    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final pn f33748b;

        /* renamed from: c, reason: collision with root package name */
        private volatile AtomicInteger f33749c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ tn1 f33750d;

        public a(tn1 tn1Var, pn responseCallback) {
            kotlin.jvm.internal.l.f(responseCallback, "responseCallback");
            this.f33750d = tn1Var;
            this.f33748b = responseCallback;
            this.f33749c = new AtomicInteger(0);
        }

        public final void a(ExecutorService executorService) {
            kotlin.jvm.internal.l.f(executorService, "executorService");
            n10 n10VarI = this.f33750d.c().i();
            if (t82.f33485f && Thread.holdsLock(n10VarI)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + n10VarI);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e4) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e4);
                    this.f33750d.b(interruptedIOException);
                    this.f33748b.a(interruptedIOException);
                    this.f33750d.c().i().b(this);
                }
            } catch (Throwable th) {
                this.f33750d.c().i().b(this);
                throw th;
            }
        }

        public final AtomicInteger b() {
            return this.f33749c;
        }

        public final String c() {
            return this.f33750d.h().g().g();
        }

        @Override // java.lang.Runnable
        public final void run() {
            n10 n10VarI;
            String strD = androidx.work.s.d("OkHttp ", this.f33750d.k());
            tn1 tn1Var = this.f33750d;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(strD);
            try {
                tn1Var.f33736f.enter();
                boolean z10 = false;
                try {
                    try {
                        try {
                            this.f33748b.a(tn1Var.i());
                            n10VarI = tn1Var.c().i();
                        } catch (IOException e4) {
                            e = e4;
                            z10 = true;
                            if (z10) {
                                int i = lh1.f30001c;
                                lh1 lh1VarA = lh1.a.a();
                                String str = "Callback failure for " + tn1Var.o();
                                lh1VarA.getClass();
                                lh1.a(4, str, e);
                            } else {
                                this.f33748b.a(e);
                            }
                            n10VarI = tn1Var.c().i();
                            n10VarI.b(this);
                        } catch (Throwable th) {
                            th = th;
                            z10 = true;
                            tn1Var.a();
                            if (!z10) {
                                IOException iOException = new IOException("canceled due to " + th);
                                b9.x.a(iOException, th);
                                this.f33748b.a(iOException);
                            }
                            throw th;
                        }
                    } catch (IOException e10) {
                        e = e10;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    n10VarI.b(this);
                } catch (Throwable th3) {
                    tn1Var.c().i().b(this);
                    throw th3;
                }
            } finally {
                threadCurrentThread.setName(name);
            }
        }

        public final tn1 a() {
            return this.f33750d;
        }

        public final void a(a other) {
            kotlin.jvm.internal.l.f(other, "other");
            this.f33749c = other.f33749c;
        }
    }

    public final IOException b(IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.f33744o) {
                    this.f33744o = false;
                    if (!this.f33742m && !this.f33743n) {
                        z10 = true;
                    }
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10 ? a((tn1) iOException) : iOException;
    }

    public final void a(pn responseCallback) {
        kotlin.jvm.internal.l.f(responseCallback, "responseCallback");
        if (this.f33737g.compareAndSet(false, true)) {
            this.f33738h = lh1.f29999a.b();
            this.f33735e.getClass();
            this.f33731a.i().a(new a(this, responseCallback));
            return;
        }
        throw new IllegalStateException("Already Executed");
    }

    public final void b(un1 un1Var) {
        this.f33747r = un1Var;
    }

    public final void a(pp1 request, boolean z10) {
        SSLSocketFactory sSLSocketFactoryX;
        ud1 ud1VarO;
        zn znVarD;
        kotlin.jvm.internal.l.f(request, "request");
        if (this.f33741l == null) {
            synchronized (this) {
                if (!this.f33743n) {
                    if (!this.f33742m) {
                        C1992A c1992a = C1992A.f18074a;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                }
            }
            if (z10) {
                wn1 wn1Var = this.f33734d;
                rh0 rh0VarG = request.g();
                if (rh0VarG.h()) {
                    sSLSocketFactoryX = this.f33731a.x();
                    ud1VarO = this.f33731a.o();
                    znVarD = this.f33731a.d();
                } else {
                    sSLSocketFactoryX = null;
                    ud1VarO = null;
                    znVarD = null;
                }
                String strG = rh0VarG.g();
                int i = rh0VarG.i();
                l30 l30VarJ = this.f33731a.j();
                SocketFactory socketFactoryW = this.f33731a.w();
                vh vhVarS = this.f33731a.s();
                this.f33731a.getClass();
                this.i = new y50(wn1Var, new ta(strG, i, l30VarJ, socketFactoryW, sSLSocketFactoryX, ud1VarO, znVarD, vhVarS, this.f33731a.r(), this.f33731a.g(), this.f33731a.t()), this, this.f33735e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void a(boolean z10) {
        w50 w50Var;
        synchronized (this) {
            if (this.f33744o) {
                C1992A c1992a = C1992A.f18074a;
            } else {
                throw new IllegalStateException("released");
            }
        }
        if (z10 && (w50Var = this.f33746q) != null) {
            w50Var.b();
        }
        this.f33741l = null;
    }

    public final w50 a(xn1 chain) throws IOException {
        kotlin.jvm.internal.l.f(chain, "chain");
        synchronized (this) {
            if (this.f33744o) {
                if (!this.f33743n) {
                    if (!this.f33742m) {
                        C1992A c1992a = C1992A.f18074a;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                throw new IllegalStateException("released");
            }
        }
        y50 y50Var = this.i;
        kotlin.jvm.internal.l.c(y50Var);
        w50 w50Var = new w50(this, this.f33735e, y50Var, y50Var.a(this.f33731a, chain));
        this.f33741l = w50Var;
        this.f33746q = w50Var;
        synchronized (this) {
            this.f33742m = true;
            this.f33743n = true;
        }
        if (this.f33745p) {
            throw new IOException("Canceled");
        }
        return w50Var;
    }

    public final <E extends IOException> E a(w50 exchange, boolean z10, boolean z11, E e4) {
        boolean z12;
        boolean z13;
        kotlin.jvm.internal.l.f(exchange, "exchange");
        if (exchange.equals(this.f33746q)) {
            synchronized (this) {
                z12 = false;
                if (z10) {
                    try {
                        if (!this.f33742m) {
                            if (z11 || !this.f33743n) {
                                z13 = false;
                            }
                            C1992A c1992a = C1992A.f18074a;
                        }
                        if (z10) {
                            this.f33742m = false;
                        }
                        if (z11) {
                            this.f33743n = false;
                        }
                        boolean z14 = this.f33742m;
                        boolean z15 = (z14 || this.f33743n) ? false : true;
                        if (!z14 && !this.f33743n && !this.f33744o) {
                            z12 = true;
                        }
                        z13 = z12;
                        z12 = z15;
                        C1992A c1992a2 = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z11) {
                    }
                    z13 = false;
                    C1992A c1992a22 = C1992A.f18074a;
                }
            }
            if (z12) {
                this.f33746q = null;
                un1 un1Var = this.f33739j;
                if (un1Var != null) {
                    un1Var.g();
                }
            }
            if (z13) {
                return (E) a((tn1) e4);
            }
        }
        return e4;
    }

    private final <E extends IOException> E a(E e4) throws IOException {
        E interruptedIOException;
        Socket socketL;
        boolean z10 = t82.f33485f;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        un1 un1Var = this.f33739j;
        if (un1Var != null) {
            if (z10 && Thread.holdsLock(un1Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + un1Var);
            }
            synchronized (un1Var) {
                socketL = l();
            }
            if (this.f33739j == null) {
                if (socketL != null) {
                    t82.a(socketL);
                }
                this.f33735e.getClass();
                r50.a(this, un1Var);
            } else if (socketL != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f33740k && this.f33736f.exit()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e4 != null) {
                interruptedIOException.initCause(e4);
            }
        } else {
            interruptedIOException = e4;
        }
        if (e4 != null) {
            r50 r50Var = this.f33735e;
            kotlin.jvm.internal.l.c(interruptedIOException);
            r50Var.getClass();
            r50.a(this, interruptedIOException);
            return interruptedIOException;
        }
        this.f33735e.getClass();
        r50.a((hn) this);
        return interruptedIOException;
    }
}
