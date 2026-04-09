package sa;

import U9.D;
import U9.E;
import U9.F;
import U9.InterfaceC1608e;
import U9.InterfaceC1609f;
import U9.p;
import U9.s;
import U9.t;
import U9.w;
import U9.z;
import g0.C4356c;
import ia.C4468d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import sa.s;

/* compiled from: OkHttpCall.java */
/* loaded from: classes3.dex */
public final class m<T> implements sa.b<T> {

    /* renamed from: b, reason: collision with root package name */
    public final t f46223b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f46224c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1608e.a f46225d;

    /* renamed from: e, reason: collision with root package name */
    public final f<F, T> f46226e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f46227f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1608e f46228g;

    /* renamed from: h, reason: collision with root package name */
    public Throwable f46229h;
    public boolean i;

    /* compiled from: OkHttpCall.java */
    public class a implements InterfaceC1609f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f46230a;

        public a(d dVar) {
            this.f46230a = dVar;
        }

        @Override // U9.InterfaceC1609f
        public final void onFailure(InterfaceC1608e interfaceC1608e, IOException iOException) {
            try {
                this.f46230a.i(m.this, iOException);
            } catch (Throwable th) {
                A.m(th);
                th.printStackTrace();
            }
        }

        @Override // U9.InterfaceC1609f
        public final void onResponse(InterfaceC1608e interfaceC1608e, E e4) {
            d dVar = this.f46230a;
            m mVar = m.this;
            try {
                try {
                    dVar.c(mVar, mVar.d(e4));
                } catch (Throwable th) {
                    A.m(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                A.m(th2);
                try {
                    dVar.i(mVar, th2);
                } catch (Throwable th3) {
                    A.m(th3);
                    th3.printStackTrace();
                }
            }
        }
    }

    /* compiled from: OkHttpCall.java */
    public static final class b extends F {

        /* renamed from: b, reason: collision with root package name */
        public final F f46232b;

        /* renamed from: c, reason: collision with root package name */
        public final ia.w f46233c;

        /* renamed from: d, reason: collision with root package name */
        public IOException f46234d;

        /* compiled from: OkHttpCall.java */
        public class a extends ia.k {
            public a(ia.g gVar) {
                super(gVar);
            }

            @Override // ia.k, ia.C
            public final long read(C4468d c4468d, long j4) throws IOException {
                try {
                    return super.read(c4468d, j4);
                } catch (IOException e4) {
                    b.this.f46234d = e4;
                    throw e4;
                }
            }
        }

        public b(F f10) {
            this.f46232b = f10;
            this.f46233c = ia.q.c(new a(f10.source()));
        }

        @Override // U9.F, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f46232b.close();
        }

        @Override // U9.F
        public final long contentLength() {
            return this.f46232b.contentLength();
        }

        @Override // U9.F
        public final U9.v contentType() {
            return this.f46232b.contentType();
        }

        @Override // U9.F
        public final ia.g source() {
            return this.f46233c;
        }
    }

    /* compiled from: OkHttpCall.java */
    public static final class c extends F {

        /* renamed from: b, reason: collision with root package name */
        public final U9.v f46236b;

        /* renamed from: c, reason: collision with root package name */
        public final long f46237c;

        public c(U9.v vVar, long j4) {
            this.f46236b = vVar;
            this.f46237c = j4;
        }

        @Override // U9.F
        public final long contentLength() {
            return this.f46237c;
        }

        @Override // U9.F
        public final U9.v contentType() {
            return this.f46236b;
        }

        @Override // U9.F
        public final ia.g source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public m(t tVar, Object[] objArr, InterfaceC1608e.a aVar, f<F, T> fVar) {
        this.f46223b = tVar;
        this.f46224c = objArr;
        this.f46225d = aVar;
        this.f46226e = fVar;
    }

    @Override // sa.b
    public final synchronized U9.z A() {
        try {
        } catch (IOException e4) {
            throw new RuntimeException("Unable to create request.", e4);
        }
        return b().A();
    }

    public final InterfaceC1608e a() throws IOException {
        U9.t tVarA;
        t tVar = this.f46223b;
        tVar.getClass();
        Object[] objArr = this.f46224c;
        int length = objArr.length;
        q<?>[] qVarArr = tVar.f46307j;
        if (length != qVarArr.length) {
            throw new IllegalArgumentException(B4.i.j(C4356c.j(length, "Argument count (", ") doesn't match expected count ("), qVarArr.length, ")"));
        }
        s sVar = new s(tVar.f46301c, tVar.f46300b, tVar.f46302d, tVar.f46303e, tVar.f46304f, tVar.f46305g, tVar.f46306h, tVar.i);
        if (tVar.f46308k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            qVarArr[i].a(sVar, objArr[i]);
        }
        t.a aVar = sVar.f46290d;
        if (aVar != null) {
            tVarA = aVar.a();
        } else {
            String link = sVar.f46289c;
            U9.t tVar2 = sVar.f46288b;
            tVar2.getClass();
            kotlin.jvm.internal.l.f(link, "link");
            t.a aVarG = tVar2.g(link);
            tVarA = aVarG != null ? aVarG.a() : null;
            if (tVarA == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + tVar2 + ", Relative: " + sVar.f46289c);
            }
        }
        D aVar2 = sVar.f46296k;
        if (aVar2 == null) {
            p.a aVar3 = sVar.f46295j;
            if (aVar3 != null) {
                aVar2 = new U9.p(aVar3.f12700a, aVar3.f12701b);
            } else {
                w.a aVar4 = sVar.i;
                if (aVar4 != null) {
                    ArrayList arrayList2 = aVar4.f12744c;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    aVar2 = new U9.w(aVar4.f12742a, aVar4.f12743b, V9.b.w(arrayList2));
                } else if (sVar.f46294h) {
                    aVar2 = D.create((U9.v) null, new byte[0]);
                }
            }
        }
        U9.v vVar = sVar.f46293g;
        s.a aVar5 = sVar.f46292f;
        if (vVar != null) {
            if (aVar2 != null) {
                aVar2 = new s.a(aVar2, vVar);
            } else {
                aVar5.a("Content-Type", vVar.f12731a);
            }
        }
        z.a aVar6 = sVar.f46291e;
        aVar6.getClass();
        aVar6.f12801a = tVarA;
        aVar6.f12803c = aVar5.d().e();
        aVar6.d(sVar.f46287a, aVar2);
        aVar6.e(k.class, new k(tVar.f46299a, arrayList));
        return this.f46225d.a(aVar6.b());
    }

    public final InterfaceC1608e b() throws IOException {
        InterfaceC1608e interfaceC1608e = this.f46228g;
        if (interfaceC1608e != null) {
            return interfaceC1608e;
        }
        Throwable th = this.f46229h;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            InterfaceC1608e interfaceC1608eA = a();
            this.f46228g = interfaceC1608eA;
            return interfaceC1608eA;
        } catch (IOException | Error | RuntimeException e4) {
            A.m(e4);
            this.f46229h = e4;
            throw e4;
        }
    }

    @Override // sa.b
    public final void c(d<T> dVar) {
        InterfaceC1608e interfaceC1608e;
        Throwable th;
        synchronized (this) {
            try {
                if (this.i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.i = true;
                interfaceC1608e = this.f46228g;
                th = this.f46229h;
                if (interfaceC1608e == null && th == null) {
                    try {
                        InterfaceC1608e interfaceC1608eA = a();
                        this.f46228g = interfaceC1608eA;
                        interfaceC1608e = interfaceC1608eA;
                    } catch (Throwable th2) {
                        th = th2;
                        A.m(th);
                        this.f46229h = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            dVar.i(this, th);
            return;
        }
        if (this.f46227f) {
            interfaceC1608e.cancel();
        }
        interfaceC1608e.W(new a(dVar));
    }

    @Override // sa.b
    public final void cancel() {
        InterfaceC1608e interfaceC1608e;
        this.f46227f = true;
        synchronized (this) {
            interfaceC1608e = this.f46228g;
        }
        if (interfaceC1608e != null) {
            interfaceC1608e.cancel();
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return new m(this.f46223b, this.f46224c, this.f46225d, this.f46226e);
    }

    public final u<T> d(E e4) throws IOException {
        E.a aVarE = e4.e();
        F f10 = e4.f12568h;
        aVarE.f12581g = new c(f10.contentType(), f10.contentLength());
        E eA = aVarE.a();
        int i = eA.f12565e;
        if (i < 200 || i >= 300) {
            try {
                C4468d c4468d = new C4468d();
                f10.source().o(c4468d);
                Objects.requireNonNull(F.create(f10.contentType(), f10.contentLength(), c4468d), "body == null");
                if (eA.d()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new u<>(null, eA);
            } finally {
                f10.close();
            }
        }
        if (i == 204 || i == 205) {
            f10.close();
            if (eA.d()) {
                return new u<>(null, eA);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        b bVar = new b(f10);
        try {
            T tConvert = this.f46226e.convert(bVar);
            if (eA.d()) {
                return new u<>(tConvert, eA);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e10) {
            IOException iOException = bVar.f46234d;
            if (iOException == null) {
                throw e10;
            }
            throw iOException;
        }
    }

    @Override // sa.b
    public final boolean isCanceled() {
        boolean z10 = true;
        if (this.f46227f) {
            return true;
        }
        synchronized (this) {
            try {
                InterfaceC1608e interfaceC1608e = this.f46228g;
                if (interfaceC1608e == null || !interfaceC1608e.isCanceled()) {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // sa.b
    /* renamed from: clone */
    public final sa.b mo145clone() {
        return new m(this.f46223b, this.f46224c, this.f46225d, this.f46226e);
    }
}
