package Y9;

import U9.D;
import U9.E;
import U9.o;
import U9.z;
import androidx.work.s;
import ba.u;
import ia.A;
import ia.C;
import ia.C4468d;
import ia.q;
import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: Exchange.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f13811a;

    /* renamed from: b, reason: collision with root package name */
    public final o.a f13812b;

    /* renamed from: c, reason: collision with root package name */
    public final d f13813c;

    /* renamed from: d, reason: collision with root package name */
    public final Z9.d f13814d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13815e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13816f;

    /* renamed from: g, reason: collision with root package name */
    public final g f13817g;

    /* compiled from: Exchange.kt */
    public final class a extends ia.j {

        /* renamed from: f, reason: collision with root package name */
        public final long f13818f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f13819g;

        /* renamed from: h, reason: collision with root package name */
        public long f13820h;
        public boolean i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ c f13821j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, A delegate, long j4) {
            super(delegate);
            kotlin.jvm.internal.l.f(delegate, "delegate");
            this.f13821j = cVar;
            this.f13818f = j4;
        }

        public final <E extends IOException> E a(E e4) {
            if (this.f13819g) {
                return e4;
            }
            this.f13819g = true;
            return (E) this.f13821j.a(false, true, e4);
        }

        @Override // ia.j, ia.A, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.i) {
                return;
            }
            this.i = true;
            long j4 = this.f13818f;
            if (j4 != -1 && this.f13820h != j4) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e4) {
                throw a(e4);
            }
        }

        @Override // ia.j, ia.A, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e4) {
                throw a(e4);
            }
        }

        @Override // ia.j, ia.A
        public final void write(C4468d source, long j4) throws IOException {
            kotlin.jvm.internal.l.f(source, "source");
            if (this.i) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.f13818f;
            if (j10 != -1 && this.f13820h + j4 > j10) {
                StringBuilder sbJ = s.j("expected ", " bytes but received ", j10);
                sbJ.append(this.f13820h + j4);
                throw new ProtocolException(sbJ.toString());
            }
            try {
                super.write(source, j4);
                this.f13820h += j4;
            } catch (IOException e4) {
                throw a(e4);
            }
        }
    }

    /* compiled from: Exchange.kt */
    public final class b extends ia.k {

        /* renamed from: g, reason: collision with root package name */
        public final long f13822g;

        /* renamed from: h, reason: collision with root package name */
        public long f13823h;
        public boolean i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f13824j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f13825k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f13826l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, C delegate, long j4) {
            super(delegate);
            kotlin.jvm.internal.l.f(delegate, "delegate");
            this.f13826l = cVar;
            this.f13822g = j4;
            this.i = true;
            if (j4 == 0) {
                c(null);
            }
        }

        public final <E extends IOException> E c(E e4) {
            if (this.f13824j) {
                return e4;
            }
            this.f13824j = true;
            c cVar = this.f13826l;
            if (e4 == null && this.i) {
                this.i = false;
                cVar.f13812b.getClass();
                e call = cVar.f13811a;
                kotlin.jvm.internal.l.f(call, "call");
            }
            return (E) cVar.a(true, false, e4);
        }

        @Override // ia.k, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f13825k) {
                return;
            }
            this.f13825k = true;
            try {
                super.close();
                c(null);
            } catch (IOException e4) {
                throw c(e4);
            }
        }

        @Override // ia.k, ia.C
        public final long read(C4468d sink, long j4) throws IOException {
            kotlin.jvm.internal.l.f(sink, "sink");
            if (this.f13825k) {
                throw new IllegalStateException("closed");
            }
            try {
                long j10 = delegate().read(sink, j4);
                if (this.i) {
                    this.i = false;
                    c cVar = this.f13826l;
                    o.a aVar = cVar.f13812b;
                    e call = cVar.f13811a;
                    aVar.getClass();
                    kotlin.jvm.internal.l.f(call, "call");
                }
                if (j10 == -1) {
                    c(null);
                    return -1L;
                }
                long j11 = this.f13823h + j10;
                long j12 = this.f13822g;
                if (j12 == -1 || j11 <= j12) {
                    this.f13823h = j11;
                    if (j11 == j12) {
                        c(null);
                    }
                    return j10;
                }
                throw new ProtocolException("expected " + j12 + " bytes but received " + j11);
            } catch (IOException e4) {
                throw c(e4);
            }
        }
    }

    public c(e call, o.a eventListener, d finder, Z9.d dVar) {
        kotlin.jvm.internal.l.f(call, "call");
        kotlin.jvm.internal.l.f(eventListener, "eventListener");
        kotlin.jvm.internal.l.f(finder, "finder");
        this.f13811a = call;
        this.f13812b = eventListener;
        this.f13813c = finder;
        this.f13814d = dVar;
        this.f13817g = dVar.e();
    }

    public final IOException a(boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            e(iOException);
        }
        o.a aVar = this.f13812b;
        e call = this.f13811a;
        if (z11) {
            if (iOException != null) {
                aVar.getClass();
                kotlin.jvm.internal.l.f(call, "call");
            } else {
                aVar.getClass();
                kotlin.jvm.internal.l.f(call, "call");
            }
        }
        if (z10) {
            if (iOException != null) {
                aVar.getClass();
                kotlin.jvm.internal.l.f(call, "call");
            } else {
                aVar.getClass();
                kotlin.jvm.internal.l.f(call, "call");
            }
        }
        return call.g(this, z11, z10, iOException);
    }

    public final a b(z zVar, boolean z10) throws IOException {
        this.f13815e = z10;
        D d10 = zVar.f12798d;
        kotlin.jvm.internal.l.c(d10);
        long jContentLength = d10.contentLength();
        this.f13812b.getClass();
        e call = this.f13811a;
        kotlin.jvm.internal.l.f(call, "call");
        return new a(this, this.f13814d.d(zVar, jContentLength), jContentLength);
    }

    public final Z9.g c(E e4) throws IOException {
        Z9.d dVar = this.f13814d;
        try {
            String strC = E.c(e4, "Content-Type");
            long jH = dVar.h(e4);
            return new Z9.g(strC, jH, q.c(new b(this, dVar.f(e4), jH)));
        } catch (IOException e10) {
            this.f13812b.getClass();
            e call = this.f13811a;
            kotlin.jvm.internal.l.f(call, "call");
            e(e10);
            throw e10;
        }
    }

    public final E.a d(boolean z10) throws IOException {
        try {
            E.a aVarC = this.f13814d.c(z10);
            if (aVarC != null) {
                aVarC.f12586m = this;
            }
            return aVarC;
        } catch (IOException e4) {
            this.f13812b.getClass();
            e call = this.f13811a;
            kotlin.jvm.internal.l.f(call, "call");
            e(e4);
            throw e4;
        }
    }

    public final void e(IOException iOException) {
        this.f13816f = true;
        this.f13813c.c(iOException);
        g gVarE = this.f13814d.e();
        e call = this.f13811a;
        synchronized (gVarE) {
            try {
                kotlin.jvm.internal.l.f(call, "call");
                if (!(iOException instanceof u)) {
                    if (!(gVarE.f13862g != null) || (iOException instanceof ba.a)) {
                        gVarE.f13864j = true;
                        if (gVarE.f13867m == 0) {
                            g.d(call.f13836b, gVarE.f13857b, iOException);
                            gVarE.f13866l++;
                        }
                    }
                } else if (((u) iOException).f18262b == ba.b.REFUSED_STREAM) {
                    int i = gVarE.f13868n + 1;
                    gVarE.f13868n = i;
                    if (i > 1) {
                        gVarE.f13864j = true;
                        gVarE.f13866l++;
                    }
                } else if (((u) iOException).f18262b != ba.b.CANCEL || !call.f13849p) {
                    gVarE.f13864j = true;
                    gVarE.f13866l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
