package Y9;

import U9.E;
import U9.InterfaceC1608e;
import U9.InterfaceC1609f;
import U9.m;
import U9.o;
import U9.x;
import U9.z;
import b9.C1992A;
import c9.C2095p;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RealCall.kt */
/* loaded from: classes3.dex */
public final class e implements InterfaceC1608e {

    /* renamed from: b, reason: collision with root package name */
    public final x f13836b;

    /* renamed from: c, reason: collision with root package name */
    public final z f13837c;

    /* renamed from: d, reason: collision with root package name */
    public final j f13838d;

    /* renamed from: e, reason: collision with root package name */
    public final o.a f13839e;

    /* renamed from: f, reason: collision with root package name */
    public final f f13840f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f13841g;

    /* renamed from: h, reason: collision with root package name */
    public Object f13842h;
    public d i;

    /* renamed from: j, reason: collision with root package name */
    public g f13843j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13844k;

    /* renamed from: l, reason: collision with root package name */
    public c f13845l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13846m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13847n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13848o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f13849p;

    /* renamed from: q, reason: collision with root package name */
    public volatile c f13850q;

    /* renamed from: r, reason: collision with root package name */
    public volatile g f13851r;

    /* compiled from: RealCall.kt */
    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC1609f f13852b;

        /* renamed from: c, reason: collision with root package name */
        public volatile AtomicInteger f13853c = new AtomicInteger(0);

        public a(InterfaceC1609f interfaceC1609f) {
            this.f13852b = interfaceC1609f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m mVar;
            String strConcat = "OkHttp ".concat(e.this.f13837c.f12795a.h());
            e eVar = e.this;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(strConcat);
            try {
                eVar.f13840f.enter();
                boolean z10 = false;
                try {
                    try {
                        try {
                            this.f13852b.onResponse(eVar, eVar.f());
                            mVar = eVar.f13836b.f12750b;
                        } catch (IOException e4) {
                            e = e4;
                            z10 = true;
                            if (z10) {
                                da.h hVar = da.h.f37600a;
                                da.h hVar2 = da.h.f37600a;
                                String str = "Callback failure for " + e.a(eVar);
                                hVar2.getClass();
                                da.h.i(4, str, e);
                            } else {
                                this.f13852b.onFailure(eVar, e);
                            }
                            mVar = eVar.f13836b.f12750b;
                            mVar.c(this);
                        } catch (Throwable th) {
                            th = th;
                            z10 = true;
                            eVar.cancel();
                            if (!z10) {
                                IOException iOException = new IOException("canceled due to " + th);
                                b9.x.a(iOException, th);
                                this.f13852b.onFailure(eVar, iOException);
                            }
                            throw th;
                        }
                    } catch (IOException e10) {
                        e = e10;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    mVar.c(this);
                } catch (Throwable th3) {
                    eVar.f13836b.f12750b.c(this);
                    throw th3;
                }
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    /* compiled from: RealCall.kt */
    public static final class b extends WeakReference<e> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f13855a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e referent, Object obj) {
            super(referent);
            kotlin.jvm.internal.l.f(referent, "referent");
            this.f13855a = obj;
        }
    }

    public e(x client, z zVar) {
        kotlin.jvm.internal.l.f(client, "client");
        this.f13836b = client;
        this.f13837c = zVar;
        this.f13838d = (j) client.f12751c.f583c;
        o.a this_asFactory = (o.a) client.f12754f.f586c;
        kotlin.jvm.internal.l.f(this_asFactory, "$this_asFactory");
        this.f13839e = this_asFactory;
        f fVar = new f(this);
        fVar.timeout(0, TimeUnit.MILLISECONDS);
        this.f13840f = fVar;
        this.f13841g = new AtomicBoolean();
        this.f13848o = true;
    }

    public static final String a(e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(eVar.f13849p ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(eVar.f13837c.f12795a.h());
        return sb.toString();
    }

    @Override // U9.InterfaceC1608e
    public final z A() {
        return this.f13837c;
    }

    @Override // U9.InterfaceC1608e
    public final void W(InterfaceC1609f interfaceC1609f) {
        a next;
        if (!this.f13841g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        da.h hVar = da.h.f37600a;
        this.f13842h = da.h.f37600a.g();
        this.f13839e.getClass();
        m mVar = this.f13836b.f12750b;
        a aVar = new a(interfaceC1609f);
        mVar.getClass();
        synchronized (mVar) {
            mVar.f12692b.add(aVar);
            String str = this.f13837c.f12795a.f12715d;
            Iterator<a> it = mVar.f12693c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator<a> it2 = mVar.f12692b.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                            if (kotlin.jvm.internal.l.b(e.this.f13837c.f12795a.f12715d, str)) {
                                break;
                            }
                        }
                    }
                } else {
                    next = it.next();
                    if (kotlin.jvm.internal.l.b(e.this.f13837c.f12795a.f12715d, str)) {
                        break;
                    }
                }
            }
            if (next != null) {
                aVar.f13853c = next.f13853c;
            }
            C1992A c1992a = C1992A.f18074a;
        }
        mVar.d();
    }

    public final void b(g gVar) {
        byte[] bArr = V9.b.f13053a;
        if (this.f13843j != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f13843j = gVar;
        gVar.f13870p.add(new b(this, this.f13842h));
    }

    @Override // U9.InterfaceC1608e
    public final void cancel() throws IOException {
        Socket socket;
        if (this.f13849p) {
            return;
        }
        this.f13849p = true;
        c cVar = this.f13850q;
        if (cVar != null) {
            cVar.f13814d.cancel();
        }
        g gVar = this.f13851r;
        if (gVar != null && (socket = gVar.f13858c) != null) {
            V9.b.d(socket);
        }
        this.f13839e.getClass();
    }

    public final Object clone() {
        return new e(this.f13836b, this.f13837c);
    }

    public final <E extends IOException> E d(E e4) throws IOException {
        E interruptedIOException;
        Socket socketI;
        byte[] bArr = V9.b.f13053a;
        g gVar = this.f13843j;
        if (gVar != null) {
            synchronized (gVar) {
                socketI = i();
            }
            if (this.f13843j == null) {
                if (socketI != null) {
                    V9.b.d(socketI);
                }
                this.f13839e.getClass();
            } else if (socketI != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f13844k && this.f13840f.exit()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e4 != null) {
                interruptedIOException.initCause(e4);
            }
        } else {
            interruptedIOException = e4;
        }
        if (e4 == null) {
            this.f13839e.getClass();
            return interruptedIOException;
        }
        o.a aVar = this.f13839e;
        kotlin.jvm.internal.l.c(interruptedIOException);
        aVar.getClass();
        return interruptedIOException;
    }

    public final void e(boolean z10) {
        c cVar;
        synchronized (this) {
            if (!this.f13848o) {
                throw new IllegalStateException("released");
            }
            C1992A c1992a = C1992A.f18074a;
        }
        if (z10 && (cVar = this.f13850q) != null) {
            cVar.f13814d.cancel();
            cVar.f13811a.g(cVar, true, true, null);
        }
        this.f13845l = null;
    }

    @Override // U9.InterfaceC1608e
    public final E execute() {
        if (!this.f13841g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f13840f.enter();
        da.h hVar = da.h.f37600a;
        this.f13842h = da.h.f37600a.g();
        this.f13839e.getClass();
        try {
            m mVar = this.f13836b.f12750b;
            synchronized (mVar) {
                mVar.f12694d.add(this);
            }
            return f();
        } finally {
            m mVar2 = this.f13836b.f12750b;
            mVar2.getClass();
            mVar2.b(mVar2.f12694d, this);
        }
    }

    public final E f() throws IOException {
        ArrayList arrayList = new ArrayList();
        C2095p.b0(this.f13836b.f12752d, arrayList);
        arrayList.add(new Z9.h(this.f13836b));
        arrayList.add(new Z9.a(this.f13836b.f12758k));
        arrayList.add(new W9.a(this.f13836b.f12759l));
        arrayList.add(Y9.a.f13806a);
        C2095p.b0(this.f13836b.f12753e, arrayList);
        arrayList.add(new Z9.b());
        z zVar = this.f13837c;
        x xVar = this.f13836b;
        try {
            try {
                E eA = new Z9.f(this, arrayList, 0, null, zVar, xVar.f12771x, xVar.f12772y, xVar.f12773z).a(this.f13837c);
                if (this.f13849p) {
                    V9.b.c(eA);
                    throw new IOException("Canceled");
                }
                h(null);
                return eA;
            } catch (IOException e4) {
                IOException iOExceptionH = h(e4);
                kotlin.jvm.internal.l.d(iOExceptionH, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionH;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                h(null);
            }
            throw th;
        }
    }

    public final <E extends IOException> E g(c exchange, boolean z10, boolean z11, E e4) {
        boolean z12;
        boolean z13;
        kotlin.jvm.internal.l.f(exchange, "exchange");
        if (exchange.equals(this.f13850q)) {
            synchronized (this) {
                z12 = false;
                if (z10) {
                    try {
                        if (!this.f13846m) {
                            if (z11 || !this.f13847n) {
                                z13 = false;
                            }
                            C1992A c1992a = C1992A.f18074a;
                        }
                        if (z10) {
                            this.f13846m = false;
                        }
                        if (z11) {
                            this.f13847n = false;
                        }
                        boolean z14 = this.f13846m;
                        boolean z15 = (z14 || this.f13847n) ? false : true;
                        if (!z14 && !this.f13847n && !this.f13848o) {
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
                this.f13850q = null;
                g gVar = this.f13843j;
                if (gVar != null) {
                    gVar.h();
                }
            }
            if (z13) {
                return (E) d(e4);
            }
        }
        return e4;
    }

    public final IOException h(IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.f13848o) {
                    this.f13848o = false;
                    if (!this.f13846m && !this.f13847n) {
                        z10 = true;
                    }
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10 ? d(iOException) : iOException;
    }

    public final Socket i() {
        g gVar = this.f13843j;
        kotlin.jvm.internal.l.c(gVar);
        byte[] bArr = V9.b.f13053a;
        ArrayList arrayList = gVar.f13870p;
        Iterator it = arrayList.iterator();
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
        arrayList.remove(i);
        this.f13843j = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        gVar.f13871q = System.nanoTime();
        j jVar = this.f13838d;
        jVar.getClass();
        byte[] bArr2 = V9.b.f13053a;
        boolean z10 = gVar.f13864j;
        X9.c cVar = jVar.f13878b;
        if (!z10) {
            cVar.c(jVar.f13879c, 0L);
            return null;
        }
        gVar.f13864j = true;
        ConcurrentLinkedQueue<g> concurrentLinkedQueue = jVar.f13880d;
        concurrentLinkedQueue.remove(gVar);
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.a();
        }
        Socket socket = gVar.f13859d;
        kotlin.jvm.internal.l.c(socket);
        return socket;
    }

    @Override // U9.InterfaceC1608e
    public final boolean isCanceled() {
        return this.f13849p;
    }
}
