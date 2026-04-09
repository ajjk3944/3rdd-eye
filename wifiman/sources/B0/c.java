package b0;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.J0;
import T.K0;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f32663a = new Object();

    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final InterfaceC4038a b(InterfaceC3540l interfaceC3540l, int i10, boolean z10, Object obj) {
        b bVar;
        interfaceC3540l.s(Integer.rotateLeft(i10, 1), f32663a);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            bVar = new b(i10, z10, obj);
            interfaceC3540l.K(bVar);
        } else {
            AbstractC6492s.g(objF, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            bVar = (b) objF;
            bVar.j(obj);
        }
        interfaceC3540l.N();
        return bVar;
    }

    public static final InterfaceC4038a c(int i10, boolean z10, Object obj) {
        return new b(i10, z10, obj);
    }

    public static final int d(int i10) {
        return a(2, i10);
    }

    public static final InterfaceC4038a e(int i10, boolean z10, Object obj, InterfaceC3540l interfaceC3540l, int i11) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1573003438, i11, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:628)");
        }
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = new b(i10, z10, obj);
            interfaceC3540l.K(objF);
        }
        b bVar = (b) objF;
        bVar.j(obj);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return bVar;
    }

    public static final boolean f(J0 j02, J0 j03) {
        if (j02 != null) {
            if ((j02 instanceof K0) && (j03 instanceof K0)) {
                K0 k02 = (K0) j02;
                if (!k02.r() || AbstractC6492s.d(j02, j03) || AbstractC6492s.d(k02.i(), ((K0) j03).i())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final int g(int i10) {
        return a(1, i10);
    }
}
