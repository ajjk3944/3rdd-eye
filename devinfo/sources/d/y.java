package d;

import a0.x0;
import android.util.Log;
import androidx.lifecycle.o0;
import b5.i0;
import b5.u0;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final z f21640a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21641b;

    /* renamed from: c, reason: collision with root package name */
    public x0 f21642c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f21643d;

    public y(i0 i0Var, z zVar) {
        nk.k.e(i0Var, "onBackPressedCallback");
        boolean z3 = i0Var.f1820a;
        this.f21640a = zVar;
        this.f21641b = z3;
        this.f21643d = i0Var;
    }

    public final void a() {
        u0 u0Var = (u0) this.f21643d.f1823d;
        if (u0.K(3)) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + u0Var);
        }
        if (u0.K(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + u0Var.f1883h);
        }
        b5.a aVar = u0Var.f1883h;
        if (aVar != null) {
            aVar.f1725t = false;
            aVar.d();
            b5.a aVar2 = u0Var.f1883h;
            o0 o0Var = new o0(2, u0Var);
            if (aVar2.f1723r == null) {
                aVar2.f1723r = new ArrayList();
            }
            aVar2.f1723r.add(o0Var);
            u0Var.f1883h.e();
            u0Var.f1884i = true;
            u0Var.z(true);
            u0Var.E();
            u0Var.f1884i = false;
            u0Var.f1883h = null;
        }
    }

    public final void b() {
        x0 x0Var = this.f21642c;
        if (x0Var == null || !((LinkedHashSet) x0Var.f146c).remove(this)) {
            return;
        }
        k5.e eVar = (k5.e) x0Var.f145b;
        eVar.getClass();
        if (equals(eVar.f27946f)) {
            if (eVar.g == -1) {
                a();
            }
            eVar.f27946f = null;
            eVar.g = 0;
            eVar.f27947h = null;
        }
        eVar.f27944d.remove(this);
        eVar.f27945e.remove(this);
        this.f21642c = null;
        eVar.b();
    }

    public final void c(boolean z3) {
        k5.e eVar;
        if (this.f21641b == z3) {
            return;
        }
        this.f21641b = z3;
        x0 x0Var = this.f21642c;
        if (x0Var == null || (eVar = (k5.e) x0Var.f145b) == null) {
            return;
        }
        eVar.b();
    }
}
