package km;

import androidx.lifecycle.f1;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d0 implements d {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f28402a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28403b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f28404c;

    /* renamed from: d, reason: collision with root package name */
    public final rl.d f28405d;

    /* renamed from: e, reason: collision with root package name */
    public final m f28406e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f28407f;
    public vl.m g;

    /* renamed from: h, reason: collision with root package name */
    public Throwable f28408h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f28409i;

    public d0(u0 u0Var, Object obj, Object[] objArr, rl.d dVar, m mVar) {
        this.f28402a = u0Var;
        this.f28403b = obj;
        this.f28404c = objArr;
        this.f28405d = dVar;
        this.f28406e = mVar;
    }

    public final vl.m a() {
        rl.n nVarB;
        u0 u0Var = this.f28402a;
        c1[] c1VarArr = u0Var.f28505k;
        Object[] objArr = this.f28404c;
        int length = objArr.length;
        if (length != c1VarArr.length) {
            throw new IllegalArgumentException(r5.c.j(c1VarArr.length, ")", je.u.w(length, "Argument count (", ") doesn't match expected count (")));
        }
        s0 s0Var = new s0(u0Var.f28500d, u0Var.f28499c, u0Var.f28501e, u0Var.f28502f, u0Var.g, u0Var.f28503h, u0Var.f28504i, u0Var.j);
        if (u0Var.f28506l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 0; i4 < length; i4++) {
            arrayList.add(objArr[i4]);
            c1VarArr[i4].a(s0Var, objArr[i4]);
        }
        ed.a0 a0Var = s0Var.f28463d;
        if (a0Var != null) {
            nVarB = a0Var.b();
        } else {
            String str = s0Var.f28462c;
            rl.n nVar = s0Var.f28461b;
            nVar.getClass();
            nk.k.e(str, "link");
            ed.a0 a0VarF = nVar.f(str);
            nVarB = a0VarF != null ? a0VarF.b() : null;
            if (nVarB == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + nVar + ", Relative: " + s0Var.f28462c);
            }
        }
        rl.x r0Var = s0Var.f28468k;
        if (r0Var == null) {
            n nVar2 = s0Var.j;
            if (nVar2 != null) {
                r0Var = new rl.j((ArrayList) nVar2.f28442b, (ArrayList) nVar2.f28443c);
            } else {
                i0.f fVar = s0Var.f28467i;
                if (fVar != null) {
                    ArrayList arrayList2 = (ArrayList) fVar.f25418d;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    r0Var = new rl.r((hm.h) fVar.f25416b, (rl.p) fVar.f25417c, sl.h.j(arrayList2));
                } else if (s0Var.f28466h) {
                    int i10 = rl.x.f33190a;
                    long j = 0;
                    sl.f.a(j, j, j);
                    r0Var = new rl.w(0, new byte[0]);
                }
            }
        }
        rl.p pVar = s0Var.g;
        y yVar = s0Var.f28465f;
        if (pVar != null) {
            if (r0Var != null) {
                r0Var = new r0(r0Var, pVar);
            } else {
                yVar.u("Content-Type", pVar.f33123a);
            }
        }
        f1 f1Var = s0Var.f28464e;
        f1Var.getClass();
        f1Var.f1134b = nVarB;
        f1Var.f1136d = yVar.x().d();
        f1Var.G(s0Var.f28460a, r0Var);
        f1Var.f1138f = ((cm.g) f1Var.f1138f).G(nk.v.a(w.class), new w(u0Var.f28497a, this.f28403b, u0Var.f28498b, arrayList));
        va.o oVar = new va.o(f1Var);
        rl.t tVar = (rl.t) this.f28405d;
        tVar.getClass();
        return new vl.m(tVar, oVar);
    }

    public final vl.m b() throws IOException {
        vl.m mVar = this.g;
        if (mVar != null) {
            return mVar;
        }
        Throwable th2 = this.f28408h;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            vl.m mVarA = a();
            this.g = mVarA;
            return mVarA;
        } catch (IOException | Error | RuntimeException e2) {
            c1.q(e2);
            this.f28408h = e2;
            throw e2;
        }
    }

    @Override // km.d
    public final void c(g gVar) {
        int i4;
        vl.m mVar;
        Throwable th2;
        synchronized (this) {
            try {
                if (this.f28409i) {
                    throw new IllegalStateException("Already executed.");
                }
                i4 = 1;
                this.f28409i = true;
                mVar = this.g;
                th2 = this.f28408h;
                if (mVar == null && th2 == null) {
                    try {
                        vl.m mVarA = a();
                        this.g = mVarA;
                        mVar = mVarA;
                    } catch (Throwable th3) {
                        th2 = th3;
                        c1.q(th2);
                        this.f28408h = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            gVar.g(this, th2);
            return;
        }
        if (this.f28407f) {
            mVar.cancel();
        }
        n nVar = new n(this, false, gVar, i4);
        mVar.getClass();
        if (!mVar.f36336e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        bm.e eVar = bm.e.f2349a;
        mVar.f36337f = bm.e.f2349a.h();
        a0.x0 x0Var = mVar.f36332a.f33154a;
        vl.j jVar = new vl.j(mVar, nVar);
        x0Var.getClass();
        a0.x0.I(x0Var, jVar, null, null, 6);
    }

    @Override // km.d
    public final void cancel() {
        vl.m mVar;
        this.f28407f = true;
        synchronized (this) {
            mVar = this.g;
        }
        if (mVar != null) {
            mVar.cancel();
        }
    }

    public final Object clone() {
        return new d0(this.f28402a, this.f28403b, this.f28404c, this.f28405d, this.f28406e);
    }

    public final v0 d(rl.z zVar) throws IOException {
        rl.c0 c0Var = zVar.g;
        rl.y yVarC = zVar.c();
        yVarC.g = new c0(c0Var.g(), c0Var.e());
        rl.z zVarA = yVarC.a();
        boolean z3 = zVarA.f33217p;
        int i4 = zVarA.f33207d;
        if (i4 < 200 || i4 >= 300) {
            try {
                c0Var.m().i(new hm.e());
                c0Var.g();
                c0Var.e();
                rl.b0 b0Var = rl.c0.f33050b;
                if (z3) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new v0(zVarA, null);
            } finally {
                c0Var.close();
            }
        }
        if (i4 == 204 || i4 == 205) {
            if (z3) {
                return new v0(zVarA, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        b0 b0Var2 = new b0(c0Var);
        try {
            Object objL = this.f28406e.l(b0Var2);
            if (z3) {
                return new v0(zVarA, objL);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e2) {
            IOException iOException = b0Var2.f28395e;
            if (iOException == null) {
                throw e2;
            }
            throw iOException;
        }
    }

    @Override // km.d
    public final boolean isCanceled() {
        boolean z3 = true;
        if (this.f28407f) {
            return true;
        }
        synchronized (this) {
            try {
                vl.m mVar = this.g;
                if (mVar == null || !mVar.f36345p) {
                    z3 = false;
                }
            } finally {
            }
        }
        return z3;
    }

    @Override // km.d
    public final synchronized va.o request() {
        try {
        } catch (IOException e2) {
            throw new RuntimeException("Unable to create request.", e2);
        }
        return b().f36333b;
    }

    @Override // km.d
    public final d clone() {
        return new d0(this.f28402a, this.f28403b, this.f28404c, this.f28405d, this.f28406e);
    }
}
