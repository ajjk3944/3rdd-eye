package Jh;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2507q;
import Bh.w0;
import java.util.HashMap;
import java.util.Map;
import ji.InterfaceC6346g;

/* loaded from: classes4.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2510u f10215a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC2510u f10216b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC2510u f10217c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map f10218d;

    static class a extends Bh.r {
        a(w0 w0Var) {
            super(w0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "fromPackage";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "myPackage";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "visibleFromPackage";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Bh.AbstractC2510u
        public boolean e(InterfaceC6346g interfaceC6346g, InterfaceC2507q interfaceC2507q, InterfaceC2503m interfaceC2503m, boolean z10) {
            if (interfaceC2507q == null) {
                g(0);
            }
            if (interfaceC2503m == null) {
                g(1);
            }
            return y.d(interfaceC2507q, interfaceC2503m);
        }
    }

    static class b extends Bh.r {
        b(w0 w0Var) {
            super(w0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Bh.AbstractC2510u
        public boolean e(InterfaceC6346g interfaceC6346g, InterfaceC2507q interfaceC2507q, InterfaceC2503m interfaceC2503m, boolean z10) {
            if (interfaceC2507q == null) {
                g(0);
            }
            if (interfaceC2503m == null) {
                g(1);
            }
            return y.e(interfaceC6346g, interfaceC2507q, interfaceC2503m);
        }
    }

    static class c extends Bh.r {
        c(w0 w0Var) {
            super(w0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Bh.AbstractC2510u
        public boolean e(InterfaceC6346g interfaceC6346g, InterfaceC2507q interfaceC2507q, InterfaceC2503m interfaceC2503m, boolean z10) {
            if (interfaceC2507q == null) {
                g(0);
            }
            if (interfaceC2503m == null) {
                g(1);
            }
            return y.e(interfaceC6346g, interfaceC2507q, interfaceC2503m);
        }
    }

    static {
        a aVar = new a(Eh.a.f4758c);
        f10215a = aVar;
        b bVar = new b(Eh.c.f4760c);
        f10216b = bVar;
        c cVar = new c(Eh.b.f4759c);
        f10217c = cVar;
        f10218d = new HashMap();
        f(aVar);
        f(bVar);
        f(cVar);
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i10 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i10 != 5 && i10 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(InterfaceC2503m interfaceC2503m, InterfaceC2503m interfaceC2503m2) {
        if (interfaceC2503m == null) {
            a(2);
        }
        if (interfaceC2503m2 == null) {
            a(3);
        }
        Bh.M m10 = (Bh.M) bi.i.r(interfaceC2503m, Bh.M.class, false);
        Bh.M m11 = (Bh.M) bi.i.r(interfaceC2503m2, Bh.M.class, false);
        return (m11 == null || m10 == null || !m10.e().equals(m11.e())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(InterfaceC6346g interfaceC6346g, InterfaceC2507q interfaceC2507q, InterfaceC2503m interfaceC2503m) {
        if (interfaceC2507q == null) {
            a(0);
        }
        if (interfaceC2503m == null) {
            a(1);
        }
        if (d(bi.i.M(interfaceC2507q), interfaceC2503m)) {
            return true;
        }
        return AbstractC2509t.f1794c.e(interfaceC6346g, interfaceC2507q, interfaceC2503m, false);
    }

    private static void f(AbstractC2510u abstractC2510u) {
        f10218d.put(abstractC2510u.b(), abstractC2510u);
    }

    public static AbstractC2510u g(w0 w0Var) {
        if (w0Var == null) {
            a(4);
        }
        AbstractC2510u abstractC2510u = (AbstractC2510u) f10218d.get(w0Var);
        if (abstractC2510u != null) {
            return abstractC2510u;
        }
        AbstractC2510u abstractC2510uJ = AbstractC2509t.j(w0Var);
        if (abstractC2510uJ == null) {
            a(5);
        }
        return abstractC2510uJ;
    }
}
