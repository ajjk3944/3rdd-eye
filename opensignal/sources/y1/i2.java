package y1;

import android.os.Trace;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class i2 implements n0.r, androidx.lifecycle.t {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f25714a;

    /* renamed from: d, reason: collision with root package name */
    public final n0.v f25715d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25716g;

    /* renamed from: r, reason: collision with root package name */
    public androidx.lifecycle.o f25717r;

    /* renamed from: x, reason: collision with root package name */
    public ar.n f25718x = a1.f25627a;

    public i2(AndroidComposeView androidComposeView, n0.v vVar) {
        this.f25714a = androidComposeView;
        this.f25715d = vVar;
    }

    public final void a() {
        if (!this.f25716g) {
            this.f25716g = true;
            this.f25714a.getView().setTag(z0.n.wrapped_composition_tag, null);
            androidx.lifecycle.o oVar = this.f25717r;
            if (oVar != null) {
                oVar.m1(this);
            }
        }
        n0.v vVar = this.f25715d;
        synchronized (vVar.f17330r) {
            try {
                if (vVar.P.F) {
                    n0.g1.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (vVar.Q != 3) {
                    vVar.Q = 3;
                    int i10 = n0.g.f17175a;
                    o0.a aVar = vVar.P.L;
                    if (aVar != null) {
                        vVar.e(aVar);
                    }
                    boolean z10 = vVar.f17332y.f17311d > 0;
                    if (z10 || !vVar.f17331x.f23058a.g()) {
                        al.g gVar = vVar.O;
                        try {
                            gVar.o(vVar.f17331x, vVar.P.w());
                            if (z10) {
                                n0.v1 v1VarD = vVar.f17332y.d();
                                try {
                                    v1VarD.n(v1VarD.f17350t, new au.v(2, vVar.O));
                                    v1VarD.F();
                                    v1VarD.e(true);
                                    vVar.f17328d.v();
                                    vVar.f17328d.q();
                                    gVar.e();
                                } catch (Throwable th2) {
                                    v1VarD.e(false);
                                    throw th2;
                                }
                            }
                            gVar.d();
                            gVar.c();
                        } catch (Throwable th3) {
                            gVar.c();
                            throw th3;
                        }
                    }
                    n0.p pVar = vVar.P;
                    pVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        pVar.f17255b.getClass();
                        pVar.E.clear();
                        pVar.f17270s.clear();
                        pVar.f17258e.f18682a.a0();
                        pVar.f17273v = null;
                        pVar.f17254a.v();
                        Trace.endSection();
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        vVar.f17327a.p(vVar);
    }

    @Override // androidx.lifecycle.t
    public final void b(androidx.lifecycle.v vVar, androidx.lifecycle.m mVar) {
        if (mVar == androidx.lifecycle.m.ON_DESTROY) {
            a();
        } else {
            if (mVar != androidx.lifecycle.m.ON_CREATE || this.f25716g) {
                return;
            }
            c(this.f25718x);
        }
    }

    public final void c(ar.n nVar) {
        this.f25714a.setOnViewTreeOwnersAvailable(new zp.d(this, nVar, 1));
    }
}
