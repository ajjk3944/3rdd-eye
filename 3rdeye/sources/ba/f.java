package ba;

import b9.C1992A;
import ia.v;
import ia.w;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import p9.InterfaceC5480a;

/* compiled from: Http2Connection.kt */
/* loaded from: classes3.dex */
public final class f implements Closeable {

    /* renamed from: A, reason: collision with root package name */
    public static final t f18143A;

    /* renamed from: b, reason: collision with root package name */
    public final b f18144b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f18145c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final String f18146d;

    /* renamed from: e, reason: collision with root package name */
    public int f18147e;

    /* renamed from: f, reason: collision with root package name */
    public int f18148f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18149g;

    /* renamed from: h, reason: collision with root package name */
    public final X9.d f18150h;
    public final X9.c i;

    /* renamed from: j, reason: collision with root package name */
    public final X9.c f18151j;

    /* renamed from: k, reason: collision with root package name */
    public final X9.c f18152k;

    /* renamed from: l, reason: collision with root package name */
    public final s f18153l;

    /* renamed from: m, reason: collision with root package name */
    public long f18154m;

    /* renamed from: n, reason: collision with root package name */
    public long f18155n;

    /* renamed from: o, reason: collision with root package name */
    public long f18156o;

    /* renamed from: p, reason: collision with root package name */
    public long f18157p;

    /* renamed from: q, reason: collision with root package name */
    public final t f18158q;

    /* renamed from: r, reason: collision with root package name */
    public t f18159r;

    /* renamed from: s, reason: collision with root package name */
    public long f18160s;

    /* renamed from: t, reason: collision with root package name */
    public long f18161t;

    /* renamed from: u, reason: collision with root package name */
    public long f18162u;

    /* renamed from: v, reason: collision with root package name */
    public long f18163v;

    /* renamed from: w, reason: collision with root package name */
    public final Socket f18164w;

    /* renamed from: x, reason: collision with root package name */
    public final q f18165x;

    /* renamed from: y, reason: collision with root package name */
    public final c f18166y;

    /* renamed from: z, reason: collision with root package name */
    public final LinkedHashSet f18167z;

    /* compiled from: Http2Connection.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final X9.d f18168a;

        /* renamed from: b, reason: collision with root package name */
        public Socket f18169b;

        /* renamed from: c, reason: collision with root package name */
        public String f18170c;

        /* renamed from: d, reason: collision with root package name */
        public w f18171d;

        /* renamed from: e, reason: collision with root package name */
        public v f18172e;

        /* renamed from: f, reason: collision with root package name */
        public b f18173f;

        /* renamed from: g, reason: collision with root package name */
        public final s f18174g;

        public a(X9.d taskRunner) {
            kotlin.jvm.internal.l.f(taskRunner, "taskRunner");
            this.f18168a = taskRunner;
            this.f18173f = b.f18175a;
            this.f18174g = s.f18259a;
        }
    }

    /* compiled from: Http2Connection.kt */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18175a = new a();

        /* compiled from: Http2Connection.kt */
        public static final class a extends b {
            @Override // ba.f.b
            public final void b(p pVar) throws IOException {
                pVar.c(ba.b.REFUSED_STREAM, null);
            }
        }

        public void a(f connection, t settings) {
            kotlin.jvm.internal.l.f(connection, "connection");
            kotlin.jvm.internal.l.f(settings, "settings");
        }

        public abstract void b(p pVar) throws IOException;
    }

    /* compiled from: Http2Connection.kt */
    public final class c implements InterfaceC5480a<C1992A> {

        /* renamed from: b, reason: collision with root package name */
        public final o f18176b;

        /* compiled from: TaskQueue.kt */
        public static final class a extends X9.a {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ f f18178e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ int f18179f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ int f18180g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, f fVar, int i, int i10) {
                super(str, true);
                this.f18178e = fVar;
                this.f18179f = i;
                this.f18180g = i10;
            }

            @Override // X9.a
            public final long a() throws IOException {
                int i = this.f18179f;
                int i10 = this.f18180g;
                f fVar = this.f18178e;
                fVar.getClass();
                try {
                    fVar.f18165x.l(i, i10, true);
                    return -1L;
                } catch (IOException e4) {
                    fVar.c(e4);
                    return -1L;
                }
            }
        }

        public c(o oVar) {
            this.f18176b = oVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:57:0x00f4, code lost:
        
            if (r19 == false) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00f6, code lost:
        
            r4.j(V9.b.f13054b, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00fb, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(boolean r19, int r20, ia.w r21, int r22) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 252
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ba.f.c.a(boolean, int, ia.w, int):void");
        }

        public final void b(int i, ba.b bVar, ia.h debugData) {
            int i10;
            Object[] array;
            kotlin.jvm.internal.l.f(debugData, "debugData");
            debugData.c();
            f fVar = f.this;
            synchronized (fVar) {
                array = fVar.f18145c.values().toArray(new p[0]);
                fVar.f18149g = true;
                C1992A c1992a = C1992A.f18074a;
            }
            for (p pVar : (p[]) array) {
                if (pVar.f18223a > i && pVar.h()) {
                    pVar.k(ba.b.REFUSED_STREAM);
                    f.this.k(pVar.f18223a);
                }
            }
        }

        public final void d(boolean z10, int i, List list) {
            f.this.getClass();
            if (i != 0 && (i & 1) == 0) {
                f fVar = f.this;
                fVar.getClass();
                fVar.f18151j.c(new k(fVar.f18146d + '[' + i + "] onHeaders", fVar, i, list, z10), 0L);
                return;
            }
            f fVar2 = f.this;
            synchronized (fVar2) {
                p pVarD = fVar2.d(i);
                if (pVarD != null) {
                    C1992A c1992a = C1992A.f18074a;
                    pVarD.j(V9.b.u(list), z10);
                    return;
                }
                if (fVar2.f18149g) {
                    return;
                }
                if (i <= fVar2.f18147e) {
                    return;
                }
                if (i % 2 == fVar2.f18148f % 2) {
                    return;
                }
                p pVar = new p(i, fVar2, false, z10, V9.b.u(list));
                fVar2.f18147e = i;
                fVar2.f18145c.put(Integer.valueOf(i), pVar);
                fVar2.f18150h.e().c(new h(fVar2.f18146d + '[' + i + "] onStream", fVar2, pVar), 0L);
            }
        }

        public final void e(int i, int i10, boolean z10) {
            if (!z10) {
                f.this.i.c(new a(B4.f.c(new StringBuilder(), f.this.f18146d, " ping"), f.this, i, i10), 0L);
                return;
            }
            f fVar = f.this;
            synchronized (fVar) {
                try {
                    if (i == 1) {
                        fVar.f18154m++;
                    } else if (i != 2) {
                        if (i == 3) {
                            fVar.notifyAll();
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } else {
                        fVar.f18156o++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void f(int i, List list) {
            f fVar = f.this;
            fVar.getClass();
            synchronized (fVar) {
                if (fVar.f18167z.contains(Integer.valueOf(i))) {
                    fVar.B(i, ba.b.PROTOCOL_ERROR);
                    return;
                }
                fVar.f18167z.add(Integer.valueOf(i));
                fVar.f18151j.c(new l(fVar.f18146d + '[' + i + "] onRequest", fVar, i, list), 0L);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [ba.f] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5, types: [ba.b] */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v8 */
        @Override // p9.InterfaceC5480a
        public final C1992A invoke() throws Throwable {
            Throwable th;
            ba.b bVar;
            ?? r02 = f.this;
            o oVar = this.f18176b;
            ba.b bVar2 = ba.b.INTERNAL_ERROR;
            ?? r32 = 1;
            IOException e4 = null;
            try {
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e10) {
                    e4 = e10;
                    bVar = bVar2;
                }
                if (!oVar.a(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                do {
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                        r32 = bVar2;
                        r02.a(r32, bVar2, e4);
                        V9.b.c(oVar);
                        throw th;
                    }
                } while (oVar.a(false, this));
                bVar = ba.b.NO_ERROR;
                try {
                    bVar2 = ba.b.CANCEL;
                    r02.a(bVar, bVar2, null);
                    r32 = bVar;
                } catch (IOException e11) {
                    e4 = e11;
                    bVar2 = ba.b.PROTOCOL_ERROR;
                    r02.a(bVar2, bVar2, e4);
                    r32 = bVar;
                    V9.b.c(oVar);
                    return C1992A.f18074a;
                }
                V9.b.c(oVar);
                return C1992A.f18074a;
            } catch (Throwable th4) {
                th = th4;
                r02.a(r32, bVar2, e4);
                V9.b.c(oVar);
                throw th;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    public static final class d extends X9.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f18181e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f18182f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ba.b f18183g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, f fVar, int i, ba.b bVar) {
            super(str, true);
            this.f18181e = fVar;
            this.f18182f = i;
            this.f18183g = bVar;
        }

        @Override // X9.a
        public final long a() throws IOException {
            f fVar = this.f18181e;
            try {
                int i = this.f18182f;
                ba.b statusCode = this.f18183g;
                fVar.getClass();
                kotlin.jvm.internal.l.f(statusCode, "statusCode");
                fVar.f18165x.n(i, statusCode);
                return -1L;
            } catch (IOException e4) {
                fVar.c(e4);
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    public static final class e extends X9.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f18184e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f18185f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f18186g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, f fVar, int i, long j4) {
            super(str, true);
            this.f18184e = fVar;
            this.f18185f = i;
            this.f18186g = j4;
        }

        @Override // X9.a
        public final long a() throws IOException {
            f fVar = this.f18184e;
            try {
                fVar.f18165x.B(this.f18185f, this.f18186g);
                return -1L;
            } catch (IOException e4) {
                fVar.c(e4);
                return -1L;
            }
        }
    }

    static {
        t tVar = new t();
        tVar.c(7, 65535);
        tVar.c(5, 16384);
        f18143A = tVar;
    }

    public f(a aVar) {
        this.f18144b = aVar.f18173f;
        String str = aVar.f18170c;
        if (str == null) {
            kotlin.jvm.internal.l.l("connectionName");
            throw null;
        }
        this.f18146d = str;
        this.f18148f = 3;
        X9.d dVar = aVar.f18168a;
        this.f18150h = dVar;
        this.i = dVar.e();
        this.f18151j = dVar.e();
        this.f18152k = dVar.e();
        this.f18153l = aVar.f18174g;
        t tVar = new t();
        tVar.c(7, 16777216);
        this.f18158q = tVar;
        this.f18159r = f18143A;
        this.f18163v = r0.a();
        Socket socket = aVar.f18169b;
        if (socket == null) {
            kotlin.jvm.internal.l.l("socket");
            throw null;
        }
        this.f18164w = socket;
        v vVar = aVar.f18172e;
        if (vVar == null) {
            kotlin.jvm.internal.l.l("sink");
            throw null;
        }
        this.f18165x = new q(vVar);
        w wVar = aVar.f18171d;
        if (wVar == null) {
            kotlin.jvm.internal.l.l(AdRevenueConstants.SOURCE_KEY);
            throw null;
        }
        this.f18166y = new c(new o(wVar));
        this.f18167z = new LinkedHashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f18165x.f18250d);
        r6 = r2;
        r8.f18162u += r6;
        r4 = b9.C1992A.f18074a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(int r9, boolean r10, ia.C4468d r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            ba.q r12 = r8.f18165x
            r12.c(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6a
            monitor-enter(r8)
        L12:
            long r4 = r8.f18162u     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            long r6 = r8.f18163v     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f18145c     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            goto L12
        L2a:
            r9 = move-exception
            goto L68
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            ba.q r4 = r8.f18165x     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f18250d     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f18162u     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f18162u = r4     // Catch: java.lang.Throwable -> L2a
            b9.A r4 = b9.C1992A.f18074a     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            ba.q r4 = r8.f18165x
            if (r10 == 0) goto L56
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L56
            r5 = 1
            goto L57
        L56:
            r5 = r3
        L57:
            r4.c(r5, r9, r11, r2)
            goto Ld
        L5b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L68:
            monitor-exit(r8)
            throw r9
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.f.A(int, boolean, ia.d, long):void");
    }

    public final void B(int i, ba.b errorCode) {
        kotlin.jvm.internal.l.f(errorCode, "errorCode");
        this.i.c(new d(this.f18146d + '[' + i + "] writeSynReset", this, i, errorCode), 0L);
    }

    public final void D(int i, long j4) {
        this.i.c(new e(this.f18146d + '[' + i + "] windowUpdate", this, i, j4), 0L);
    }

    public final void a(ba.b connectionCode, ba.b streamCode, IOException iOException) throws IOException {
        int i;
        Object[] array;
        kotlin.jvm.internal.l.f(connectionCode, "connectionCode");
        kotlin.jvm.internal.l.f(streamCode, "streamCode");
        byte[] bArr = V9.b.f13053a;
        try {
            l(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f18145c.isEmpty()) {
                    array = null;
                } else {
                    array = this.f18145c.values().toArray(new p[0]);
                    this.f18145c.clear();
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        p[] pVarArr = (p[]) array;
        if (pVarArr != null) {
            for (p pVar : pVarArr) {
                try {
                    pVar.c(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f18165x.close();
        } catch (IOException unused3) {
        }
        try {
            this.f18164w.close();
        } catch (IOException unused4) {
        }
        this.i.f();
        this.f18151j.f();
        this.f18152k.f();
    }

    public final void c(IOException iOException) throws IOException {
        ba.b bVar = ba.b.PROTOCOL_ERROR;
        a(bVar, bVar, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a(ba.b.NO_ERROR, ba.b.CANCEL, null);
    }

    public final synchronized p d(int i) {
        return (p) this.f18145c.get(Integer.valueOf(i));
    }

    public final synchronized boolean e(long j4) {
        if (this.f18149g) {
            return false;
        }
        if (this.f18156o < this.f18155n) {
            if (j4 >= this.f18157p) {
                return false;
            }
        }
        return true;
    }

    public final void flush() throws IOException {
        this.f18165x.flush();
    }

    public final synchronized p k(int i) {
        p pVar;
        pVar = (p) this.f18145c.remove(Integer.valueOf(i));
        notifyAll();
        return pVar;
    }

    public final void l(ba.b statusCode) throws IOException {
        kotlin.jvm.internal.l.f(statusCode, "statusCode");
        synchronized (this.f18165x) {
            synchronized (this) {
                if (this.f18149g) {
                    return;
                }
                this.f18149g = true;
                int i = this.f18147e;
                C1992A c1992a = C1992A.f18074a;
                this.f18165x.e(i, statusCode, V9.b.f13053a);
            }
        }
    }

    public final synchronized void n(long j4) {
        long j10 = this.f18160s + j4;
        this.f18160s = j10;
        long j11 = j10 - this.f18161t;
        if (j11 >= this.f18158q.a() / 2) {
            D(0, j11);
            this.f18161t += j11;
        }
    }
}
