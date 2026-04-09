package T;

import Ii.InterfaceC3091y0;
import dh.InterfaceC5384i;
import java.util.Arrays;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    private static final L f20968a = new L();

    public static final void a(Object obj, Object obj2, Object obj3, InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1239538271, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:236)");
        }
        boolean zT = interfaceC3540l.T(obj) | interfaceC3540l.T(obj2) | interfaceC3540l.T(obj3);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            objF = new J(interfaceC6835l);
            interfaceC3540l.K(objF);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
    }

    public static final void b(Object obj, Object obj2, InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1429097729, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)");
        }
        boolean zT = interfaceC3540l.T(obj) | interfaceC3540l.T(obj2);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            objF = new J(interfaceC6835l);
            interfaceC3540l.K(objF);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
    }

    public static final void c(Object obj, InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1371986847, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        boolean zT = interfaceC3540l.T(obj);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            objF = new J(interfaceC6835l);
            interfaceC3540l.K(objF);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
    }

    public static final void d(Object[] objArr, InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1307627122, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:276)");
        }
        boolean zT = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zT |= interfaceC3540l.T(obj);
        }
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            interfaceC3540l.K(new J(interfaceC6835l));
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
    }

    public static final void e(Object obj, Object obj2, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(590241125, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        InterfaceC5384i interfaceC5384iE = interfaceC3540l.E();
        boolean zT = interfaceC3540l.T(obj) | interfaceC3540l.T(obj2);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            objF = new C3518c0(interfaceC5384iE, interfaceC6839p);
            interfaceC3540l.K(objF);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
    }

    public static final void f(Object obj, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1179185413, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        InterfaceC5384i interfaceC5384iE = interfaceC3540l.E();
        boolean zT = interfaceC3540l.T(obj);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            objF = new C3518c0(interfaceC5384iE, interfaceC6839p);
            interfaceC3540l.K(objF);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
    }

    public static final void g(InterfaceC6824a interfaceC6824a, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1288466761, i10, -1, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        interfaceC3540l.m(interfaceC6824a);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
    }

    public static final Ii.N i(InterfaceC5384i interfaceC5384i, InterfaceC3540l interfaceC3540l) {
        InterfaceC3091y0.b bVar = InterfaceC3091y0.f9363O;
        if (interfaceC5384i.get(bVar) == null) {
            InterfaceC5384i interfaceC5384iE = interfaceC3540l.E();
            return Ii.O.a(interfaceC5384iE.plus(Ii.A0.a((InterfaceC3091y0) interfaceC5384iE.get(bVar))).plus(interfaceC5384i));
        }
        Ii.A aB = Ii.B0.b(null, 1, null);
        aB.a(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return Ii.O.a(aB);
    }
}
