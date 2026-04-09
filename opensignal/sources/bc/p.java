package bc;

import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p implements cc.d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2636a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2637b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2638c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2639d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2640e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2641f;

    public p(d dVar, ac.c cVar, a aVar) {
        Objects.requireNonNull(dVar);
        this.f2641f = dVar;
        this.f2639d = null;
        this.f2640e = null;
        this.f2636a = false;
        this.f2637b = cVar;
        this.f2638c = aVar;
    }

    @Override // cc.d
    public void a(ConnectionResult connectionResult) {
        ((d) this.f2641f).J.post(new re.a(1, this, connectionResult, false));
    }

    public IOException b(long j, boolean z10, boolean z11, IOException iOException) {
        ou.p pVar = (ou.p) this.f2638c;
        su.i iVar = (su.i) this.f2637b;
        if (iOException != null) {
            e(iOException);
        }
        if (z11) {
            if (iOException != null) {
                pVar.s(iVar, iOException);
            } else {
                pVar.q(iVar, j);
            }
        }
        if (z10) {
            if (iOException != null) {
                pVar.x(iVar, iOException);
            } else {
                pVar.v(iVar, j);
            }
        }
        return iVar.h(this, z11, z10, iOException);
    }

    public tu.g c(ou.c0 c0Var) throws IOException {
        tu.d dVar = (tu.d) this.f2640e;
        try {
            String strF = ou.c0.f("Content-Type", c0Var);
            long jD = dVar.d(c0Var);
            return new tu.g(strF, jD, a.a.e(new su.d(this, dVar.c(c0Var), jD)));
        } catch (IOException e4) {
            ((ou.p) this.f2638c).x((su.i) this.f2637b, e4);
            e(e4);
            throw e4;
        }
    }

    public ou.b0 d(boolean z10) throws IOException {
        try {
            ou.b0 b0VarE = ((tu.d) this.f2640e).e(z10);
            if (b0VarE == null) {
                return b0VarE;
            }
            b0VarE.f19879m = this;
            return b0VarE;
        } catch (IOException e4) {
            ((ou.p) this.f2638c).x((su.i) this.f2637b, e4);
            e(e4);
            throw e4;
        }
    }

    public void e(IOException iOException) {
        this.f2636a = true;
        ((su.e) this.f2639d).c(iOException);
        su.k kVarF = ((tu.d) this.f2640e).f();
        su.i iVar = (su.i) this.f2637b;
        synchronized (kVarF) {
            try {
                if (!(iOException instanceof vu.d0)) {
                    if (!(kVarF.f22347g != null) || (iOException instanceof vu.a)) {
                        kVarF.j = true;
                        if (kVarF.f22351m == 0) {
                            su.k.d(iVar.f22335a, kVarF.f22342b, iOException);
                            kVarF.f22350l++;
                        }
                    }
                } else if (((vu.d0) iOException).f23986a == vu.c.REFUSED_STREAM) {
                    int i10 = kVarF.f22352n + 1;
                    kVarF.f22352n = i10;
                    if (i10 > 1) {
                        kVarF.j = true;
                        kVarF.f22350l++;
                    }
                } else if (((vu.d0) iOException).f23986a != vu.c.CANCEL || !iVar.J) {
                    kVarF.j = true;
                    kVarF.f22350l++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(ConnectionResult connectionResult) {
        n nVar = (n) ((d) this.f2641f).F.get((a) this.f2638c);
        if (nVar != null) {
            nVar.m(connectionResult);
        }
    }

    public p(su.i iVar, ou.p pVar, su.e eVar, tu.d dVar) {
        br.l.e(pVar, "eventListener");
        br.l.e(eVar, "finder");
        this.f2637b = iVar;
        this.f2638c = pVar;
        this.f2639d = eVar;
        this.f2640e = dVar;
        this.f2641f = dVar.f();
    }
}
