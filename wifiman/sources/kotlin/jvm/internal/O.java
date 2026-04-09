package kotlin.jvm.internal;

import java.util.Collections;
import wh.b1;

/* loaded from: classes4.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    private static final P f51690a;

    /* renamed from: b, reason: collision with root package name */
    private static final th.d[] f51691b;

    static {
        P p10 = null;
        try {
            p10 = (P) b1.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (p10 == null) {
            p10 = new P();
        }
        f51690a = p10;
        f51691b = new th.d[0];
    }

    public static th.g a(AbstractC6489o abstractC6489o) {
        return f51690a.a(abstractC6489o);
    }

    public static th.d b(Class cls) {
        return f51690a.b(cls);
    }

    public static th.f c(Class cls) {
        return f51690a.c(cls, "");
    }

    public static th.f d(Class cls, String str) {
        return f51690a.c(cls, str);
    }

    public static th.i e(AbstractC6496w abstractC6496w) {
        return f51690a.d(abstractC6496w);
    }

    public static th.j f(AbstractC6498y abstractC6498y) {
        return f51690a.e(abstractC6498y);
    }

    public static th.m g(C c10) {
        return f51690a.f(c10);
    }

    public static th.n h(E e10) {
        return f51690a.g(e10);
    }

    public static th.o i(G g10) {
        return f51690a.h(g10);
    }

    public static String j(InterfaceC6488n interfaceC6488n) {
        return f51690a.i(interfaceC6488n);
    }

    public static String k(AbstractC6494u abstractC6494u) {
        return f51690a.j(abstractC6494u);
    }

    public static th.p l(Class cls) {
        return f51690a.k(b(cls), Collections.emptyList(), false);
    }

    public static th.p m(Class cls, th.r rVar) {
        return f51690a.k(b(cls), Collections.singletonList(rVar), false);
    }
}
