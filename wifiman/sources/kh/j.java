package Kh;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2502l;
import Bh.Y;
import Bh.f0;
import Qh.q;

/* loaded from: classes4.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f10805a = new a();

    static class a implements j {
        a() {
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Kh.j
        public void a(q qVar, f0 f0Var) {
            if (qVar == null) {
                f(1);
            }
            if (f0Var == null) {
                f(2);
            }
        }

        @Override // Kh.j
        public void b(Qh.g gVar, InterfaceC2495e interfaceC2495e) {
            if (gVar == null) {
                f(7);
            }
            if (interfaceC2495e == null) {
                f(8);
            }
        }

        @Override // Kh.j
        public void c(Qh.l lVar, InterfaceC2502l interfaceC2502l) {
            if (lVar == null) {
                f(3);
            }
            if (interfaceC2502l == null) {
                f(4);
            }
        }

        @Override // Kh.j
        public void d(Qh.n nVar, Y y10) {
            if (nVar == null) {
                f(5);
            }
            if (y10 == null) {
                f(6);
            }
        }

        @Override // Kh.j
        public InterfaceC2495e e(Zh.c cVar) {
            if (cVar != null) {
                return null;
            }
            f(0);
            return null;
        }
    }

    void a(q qVar, f0 f0Var);

    void b(Qh.g gVar, InterfaceC2495e interfaceC2495e);

    void c(Qh.l lVar, InterfaceC2502l interfaceC2502l);

    void d(Qh.n nVar, Y y10);

    InterfaceC2495e e(Zh.c cVar);
}
