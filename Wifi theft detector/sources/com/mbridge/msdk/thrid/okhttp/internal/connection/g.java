package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.internal.connection.f;
import com.mbridge.msdk.thrid.okhttp.internal.http2.n;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f17693o = true;

    /* renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.a f17694a;

    /* renamed from: b, reason: collision with root package name */
    private f.a f17695b;

    /* renamed from: c, reason: collision with root package name */
    private c0 f17696c;

    /* renamed from: d, reason: collision with root package name */
    private final i f17697d;

    /* renamed from: e, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.d f17698e;

    /* renamed from: f, reason: collision with root package name */
    public final o f17699f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f17700g;

    /* renamed from: h, reason: collision with root package name */
    private final f f17701h;

    /* renamed from: i, reason: collision with root package name */
    private int f17702i;

    /* renamed from: j, reason: collision with root package name */
    private c f17703j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17704k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f17705l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f17706m;

    /* renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okhttp.internal.http.c f17707n;

    public static final class a extends WeakReference<g> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f17708a;

        public a(g gVar, Object obj) {
            super(gVar);
            this.f17708a = obj;
        }
    }

    public g(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar, Object obj) {
        this.f17697d = iVar;
        this.f17694a = aVar;
        this.f17698e = dVar;
        this.f17699f = oVar;
        this.f17701h = new f(aVar, i(), dVar, oVar);
        this.f17700g = obj;
    }

    private Socket g() {
        if (!f17693o && !Thread.holdsLock(this.f17697d)) {
            throw new AssertionError();
        }
        c cVar = this.f17703j;
        if (cVar == null || !cVar.f17675k) {
            return null;
        }
        return a(false, false, true);
    }

    private d i() {
        return com.mbridge.msdk.thrid.okhttp.internal.a.f17624a.a(this.f17697d);
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c a(v vVar, t.a aVar, boolean z10) {
        try {
            com.mbridge.msdk.thrid.okhttp.internal.http.c cVarA = a(aVar.a(), aVar.b(), aVar.c(), vVar.t(), vVar.z(), z10).a(vVar, aVar, this);
            synchronized (this.f17697d) {
                this.f17707n = cVarA;
            }
            return cVarA;
        } catch (IOException e10) {
            throw new e(e10);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c b() {
        com.mbridge.msdk.thrid.okhttp.internal.http.c cVar;
        synchronized (this.f17697d) {
            cVar = this.f17707n;
        }
        return cVar;
    }

    public synchronized c c() {
        return this.f17703j;
    }

    public boolean d() {
        if (this.f17696c != null) {
            return true;
        }
        f.a aVar = this.f17695b;
        return (aVar != null && aVar.b()) || this.f17701h.a();
    }

    public void e() throws IOException {
        c cVar;
        Socket socketA;
        synchronized (this.f17697d) {
            cVar = this.f17703j;
            socketA = a(true, false, false);
            if (this.f17703j != null) {
                cVar = null;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            this.f17699f.connectionReleased(this.f17698e, cVar);
        }
    }

    public void f() throws IOException {
        c cVar;
        Socket socketA;
        synchronized (this.f17697d) {
            cVar = this.f17703j;
            socketA = a(false, true, false);
            if (this.f17703j != null) {
                cVar = null;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            com.mbridge.msdk.thrid.okhttp.internal.a.f17624a.a(this.f17698e, (IOException) null);
            this.f17699f.connectionReleased(this.f17698e, cVar);
            this.f17699f.callEnd(this.f17698e);
        }
    }

    public c0 h() {
        return this.f17696c;
    }

    public String toString() {
        c cVarC = c();
        return cVarC != null ? cVarC.toString() : this.f17694a.toString();
    }

    public Socket b(c cVar) {
        if (!f17693o && !Thread.holdsLock(this.f17697d)) {
            throw new AssertionError();
        }
        if (this.f17707n == null && this.f17703j.f17678n.size() == 1) {
            Reference<g> reference = this.f17703j.f17678n.get(0);
            Socket socketA = a(true, false, false);
            this.f17703j = cVar;
            cVar.f17678n.add(reference);
            return socketA;
        }
        throw new IllegalStateException();
    }

    private c a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws Throwable {
        while (true) {
            c cVarA = a(i10, i11, i12, i13, z10);
            boolean z12 = z10;
            int i14 = i13;
            int i15 = i12;
            int i16 = i11;
            int i17 = i10;
            synchronized (this.f17697d) {
                try {
                    if (cVarA.f17676l == 0 && !cVarA.f()) {
                        return cVarA;
                    }
                    if (cVarA.a(z11)) {
                        return cVarA;
                    }
                    e();
                    i10 = i17;
                    i11 = i16;
                    i12 = i15;
                    i13 = i14;
                    z10 = z12;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private c a(int i10, int i11, int i12, int i13, boolean z10) throws Throwable {
        c cVar;
        Socket socketG;
        c cVar2;
        Socket socketA;
        c0 c0VarC;
        boolean z11;
        boolean z12;
        c cVar3;
        f.a aVar;
        synchronized (this.f17697d) {
            try {
                if (!this.f17705l) {
                    if (this.f17707n == null) {
                        if (!this.f17706m) {
                            cVar = this.f17703j;
                            socketG = g();
                            cVar2 = this.f17703j;
                            socketA = null;
                            if (cVar2 != null) {
                                cVar = null;
                            } else {
                                cVar2 = null;
                            }
                            if (!this.f17704k) {
                                cVar = null;
                            }
                            if (cVar2 == null) {
                                com.mbridge.msdk.thrid.okhttp.internal.a.f17624a.a(this.f17697d, this.f17694a, this, null);
                                c cVar4 = this.f17703j;
                                if (cVar4 != null) {
                                    z11 = true;
                                    cVar2 = cVar4;
                                    c0VarC = null;
                                } else {
                                    c0VarC = this.f17696c;
                                }
                            } else {
                                c0VarC = null;
                            }
                            z11 = false;
                        } else {
                            throw new IOException("Canceled");
                        }
                    } else {
                        throw new IllegalStateException("codec != null");
                    }
                } else {
                    throw new IllegalStateException("released");
                }
            } finally {
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketG);
        if (cVar != null) {
            this.f17699f.connectionReleased(this.f17698e, cVar);
        }
        if (z11) {
            this.f17699f.connectionAcquired(this.f17698e, cVar2);
        }
        if (cVar2 != null) {
            this.f17696c = this.f17703j.c();
            return cVar2;
        }
        if (c0VarC != null || ((aVar = this.f17695b) != null && aVar.b())) {
            z12 = false;
        } else {
            this.f17695b = this.f17701h.c();
            z12 = true;
        }
        synchronized (this.f17697d) {
            try {
                if (this.f17706m) {
                    throw new IOException("Canceled");
                }
                if (z12) {
                    List<c0> listA = this.f17695b.a();
                    int size = listA.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            break;
                        }
                        c0 c0Var = listA.get(i14);
                        com.mbridge.msdk.thrid.okhttp.internal.a.f17624a.a(this.f17697d, this.f17694a, this, c0Var);
                        c cVar5 = this.f17703j;
                        if (cVar5 != null) {
                            this.f17696c = c0Var;
                            z11 = true;
                            cVar2 = cVar5;
                            break;
                        }
                        i14++;
                    }
                }
                if (!z11) {
                    if (c0VarC == null) {
                        c0VarC = this.f17695b.c();
                    }
                    this.f17696c = c0VarC;
                    this.f17702i = 0;
                    cVar2 = new c(this.f17697d, c0VarC);
                    a(cVar2, false);
                }
                cVar3 = cVar2;
            } finally {
            }
        }
        if (z11) {
            this.f17699f.connectionAcquired(this.f17698e, cVar3);
            return cVar3;
        }
        cVar3.a(i10, i11, i12, i13, z10, this.f17698e, this.f17699f);
        i().a(cVar3.c());
        synchronized (this.f17697d) {
            try {
                this.f17704k = true;
                com.mbridge.msdk.thrid.okhttp.internal.a.f17624a.b(this.f17697d, cVar3);
                if (cVar3.f()) {
                    socketA = com.mbridge.msdk.thrid.okhttp.internal.a.f17624a.a(this.f17697d, this.f17694a, this);
                    cVar3 = this.f17703j;
                }
            } finally {
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        this.f17699f.connectionAcquired(this.f17698e, cVar3);
        return cVar3;
    }

    public void a(boolean z10, com.mbridge.msdk.thrid.okhttp.internal.http.c cVar, long j10, IOException iOException) throws IOException {
        c cVar2;
        Socket socketA;
        boolean z11;
        this.f17699f.responseBodyEnd(this.f17698e, j10);
        synchronized (this.f17697d) {
            if (cVar != null) {
                try {
                    if (cVar == this.f17707n) {
                        if (!z10) {
                            this.f17703j.f17676l++;
                        }
                        cVar2 = this.f17703j;
                        socketA = a(z10, false, true);
                        if (this.f17703j != null) {
                            cVar2 = null;
                        }
                        z11 = this.f17705l;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IllegalStateException("expected " + this.f17707n + " but was " + cVar);
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar2 != null) {
            this.f17699f.connectionReleased(this.f17698e, cVar2);
        }
        if (iOException != null) {
            this.f17699f.callFailed(this.f17698e, com.mbridge.msdk.thrid.okhttp.internal.a.f17624a.a(this.f17698e, iOException));
        } else if (z11) {
            com.mbridge.msdk.thrid.okhttp.internal.a.f17624a.a(this.f17698e, (IOException) null);
            this.f17699f.callEnd(this.f17698e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.Socket a(boolean r2, boolean r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = com.mbridge.msdk.thrid.okhttp.internal.connection.g.f17693o
            if (r0 != 0) goto L13
            com.mbridge.msdk.thrid.okhttp.i r0 = r1.f17697d
            boolean r0 = java.lang.Thread.holdsLock(r0)
            if (r0 == 0) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L13:
            r0 = 0
            if (r4 == 0) goto L18
            r1.f17707n = r0
        L18:
            r4 = 1
            if (r3 == 0) goto L1d
            r1.f17705l = r4
        L1d:
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r3 = r1.f17703j
            if (r3 == 0) goto L5d
            if (r2 == 0) goto L25
            r3.f17675k = r4
        L25:
            com.mbridge.msdk.thrid.okhttp.internal.http.c r2 = r1.f17707n
            if (r2 != 0) goto L5d
            boolean r2 = r1.f17705l
            if (r2 != 0) goto L31
            boolean r2 = r3.f17675k
            if (r2 == 0) goto L5d
        L31:
            r1.a(r3)
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r2 = r1.f17703j
            java.util.List<java.lang.ref.Reference<com.mbridge.msdk.thrid.okhttp.internal.connection.g>> r2 = r2.f17678n
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L59
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r2 = r1.f17703j
            long r3 = java.lang.System.nanoTime()
            r2.f17679o = r3
            com.mbridge.msdk.thrid.okhttp.internal.a r2 = com.mbridge.msdk.thrid.okhttp.internal.a.f17624a
            com.mbridge.msdk.thrid.okhttp.i r3 = r1.f17697d
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r4 = r1.f17703j
            boolean r2 = r2.a(r3, r4)
            if (r2 == 0) goto L59
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r2 = r1.f17703j
            java.net.Socket r2 = r2.g()
            goto L5a
        L59:
            r2 = r0
        L5a:
            r1.f17703j = r0
            return r2
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.connection.g.a(boolean, boolean, boolean):java.net.Socket");
    }

    public void a() throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.http.c cVar;
        c cVar2;
        synchronized (this.f17697d) {
            this.f17706m = true;
            cVar = this.f17707n;
            cVar2 = this.f17703j;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (cVar2 != null) {
            cVar2.d();
        }
    }

    public void a(IOException iOException) throws IOException {
        c cVar;
        boolean z10;
        Socket socketA;
        synchronized (this.f17697d) {
            try {
                cVar = null;
                if (iOException instanceof n) {
                    com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar = ((n) iOException).f17944a;
                    if (bVar == com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM) {
                        int i10 = this.f17702i + 1;
                        this.f17702i = i10;
                        if (i10 > 1) {
                            this.f17696c = null;
                            z10 = true;
                        }
                        z10 = false;
                    } else {
                        if (bVar != com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL) {
                            this.f17696c = null;
                            z10 = true;
                        }
                        z10 = false;
                    }
                } else {
                    c cVar2 = this.f17703j;
                    if (cVar2 != null && (!cVar2.f() || (iOException instanceof com.mbridge.msdk.thrid.okhttp.internal.http2.a))) {
                        if (this.f17703j.f17676l == 0) {
                            c0 c0Var = this.f17696c;
                            if (c0Var != null && iOException != null) {
                                this.f17701h.a(c0Var, iOException);
                            }
                            this.f17696c = null;
                        }
                        z10 = true;
                    }
                    z10 = false;
                }
                c cVar3 = this.f17703j;
                socketA = a(z10, false, true);
                if (this.f17703j == null && this.f17704k) {
                    cVar = cVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            this.f17699f.connectionReleased(this.f17698e, cVar);
        }
    }

    public void a(c cVar, boolean z10) {
        if (!f17693o && !Thread.holdsLock(this.f17697d)) {
            throw new AssertionError();
        }
        if (this.f17703j == null) {
            this.f17703j = cVar;
            this.f17704k = z10;
            cVar.f17678n.add(new a(this, this.f17700g));
            return;
        }
        throw new IllegalStateException();
    }

    private void a(c cVar) {
        int size = cVar.f17678n.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (cVar.f17678n.get(i10).get() == this) {
                cVar.f17678n.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
