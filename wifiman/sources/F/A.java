package F;

import R0.r;
import androidx.compose.ui.platform.n1;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class A implements B {

    /* renamed from: a, reason: collision with root package name */
    private final n1 f4813a;

    /* renamed from: b, reason: collision with root package name */
    public C f4814b;

    /* renamed from: c, reason: collision with root package name */
    public k0.e f4815c;

    public A(n1 n1Var) {
        this.f4813a = n1Var;
    }

    public void a(int i10) {
        r.a aVar = R0.r.f19498b;
        if (R0.r.m(i10, aVar.d())) {
            b().k(androidx.compose.ui.focus.d.f28823b.e());
            return;
        }
        if (R0.r.m(i10, aVar.f())) {
            b().k(androidx.compose.ui.focus.d.f28823b.f());
            return;
        }
        if (!R0.r.m(i10, aVar.b())) {
            if (R0.r.m(i10, aVar.c()) ? true : R0.r.m(i10, aVar.g()) ? true : R0.r.m(i10, aVar.h()) ? true : R0.r.m(i10, aVar.a())) {
                return;
            }
            R0.r.m(i10, aVar.e());
        } else {
            n1 n1Var = this.f4813a;
            if (n1Var != null) {
                n1Var.c();
            }
        }
    }

    public final k0.e b() {
        k0.e eVar = this.f4815c;
        if (eVar != null) {
            return eVar;
        }
        AbstractC6492s.v("focusManager");
        return null;
    }

    public final C c() {
        C c10 = this.f4814b;
        if (c10 != null) {
            return c10;
        }
        AbstractC6492s.v("keyboardActions");
        return null;
    }

    public final void d(int i10) {
        InterfaceC6835l interfaceC6835lG;
        r.a aVar = R0.r.f19498b;
        Yg.J j10 = null;
        if (R0.r.m(i10, aVar.b())) {
            interfaceC6835lG = c().b();
        } else if (R0.r.m(i10, aVar.c())) {
            interfaceC6835lG = c().c();
        } else if (R0.r.m(i10, aVar.d())) {
            interfaceC6835lG = c().d();
        } else if (R0.r.m(i10, aVar.f())) {
            interfaceC6835lG = c().e();
        } else if (R0.r.m(i10, aVar.g())) {
            interfaceC6835lG = c().f();
        } else if (R0.r.m(i10, aVar.h())) {
            interfaceC6835lG = c().g();
        } else {
            if (!(R0.r.m(i10, aVar.a()) ? true : R0.r.m(i10, aVar.e()))) {
                throw new IllegalStateException("invalid ImeAction");
            }
            interfaceC6835lG = null;
        }
        if (interfaceC6835lG != null) {
            interfaceC6835lG.invoke(this);
            j10 = Yg.J.f24997a;
        }
        if (j10 == null) {
            a(i10);
        }
    }

    public final void e(k0.e eVar) {
        this.f4815c = eVar;
    }

    public final void f(C c10) {
        this.f4814b = c10;
    }
}
