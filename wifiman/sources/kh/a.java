package Kh;

import Bh.InterfaceC2492b;
import Bh.InterfaceC2494d;
import Bh.InterfaceC2495e;
import Bh.s0;
import Yg.J;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import li.InterfaceC6645w;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: Kh.a$a, reason: collision with other inner class name */
    static class C0433a extends bi.m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6645w f10780a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f10781b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f10782c;

        /* renamed from: Kh.a$a$a, reason: collision with other inner class name */
        class C0434a implements InterfaceC6835l {
            C0434a() {
            }

            private static /* synthetic */ void a(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public J invoke(InterfaceC2492b interfaceC2492b) {
                if (interfaceC2492b == null) {
                    a(0);
                }
                C0433a.this.f10780a.a(interfaceC2492b);
                return J.f24997a;
            }
        }

        C0433a(InterfaceC6645w interfaceC6645w, Set set, boolean z10) {
            this.f10780a = interfaceC6645w;
            this.f10781b = set;
            this.f10782c = z10;
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "fromSuper";
            } else if (i10 == 2) {
                objArr[0] = "fromCurrent";
            } else if (i10 == 3) {
                objArr[0] = "member";
            } else if (i10 != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "conflict";
            } else if (i10 == 3 || i10 == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // bi.n
        public void a(InterfaceC2492b interfaceC2492b) {
            if (interfaceC2492b == null) {
                f(0);
            }
            bi.o.K(interfaceC2492b, new C0434a());
            this.f10781b.add(interfaceC2492b);
        }

        @Override // bi.n
        public void d(InterfaceC2492b interfaceC2492b, Collection collection) {
            if (interfaceC2492b == null) {
                f(3);
            }
            if (collection == null) {
                f(4);
            }
            if (!this.f10782c || interfaceC2492b.h() == InterfaceC2492b.a.FAKE_OVERRIDE) {
                super.d(interfaceC2492b, collection);
            }
        }

        @Override // bi.m
        public void e(InterfaceC2492b interfaceC2492b, InterfaceC2492b interfaceC2492b2) {
            if (interfaceC2492b == null) {
                f(1);
            }
            if (interfaceC2492b2 == null) {
                f(2);
            }
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = i10 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 18 ? 3 : 2];
        switch (i10) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static s0 b(Zh.f fVar, InterfaceC2495e interfaceC2495e) {
        if (fVar == null) {
            a(19);
        }
        if (interfaceC2495e == null) {
            a(20);
        }
        Collection collectionM = interfaceC2495e.m();
        if (collectionM.size() != 1) {
            return null;
        }
        for (s0 s0Var : ((InterfaceC2494d) collectionM.iterator().next()).i()) {
            if (s0Var.getName().equals(fVar)) {
                return s0Var;
            }
        }
        return null;
    }

    private static Collection c(Zh.f fVar, Collection collection, Collection collection2, InterfaceC2495e interfaceC2495e, InterfaceC6645w interfaceC6645w, bi.o oVar, boolean z10) {
        if (fVar == null) {
            a(12);
        }
        if (collection == null) {
            a(13);
        }
        if (collection2 == null) {
            a(14);
        }
        if (interfaceC2495e == null) {
            a(15);
        }
        if (interfaceC6645w == null) {
            a(16);
        }
        if (oVar == null) {
            a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        oVar.v(fVar, collection, collection2, interfaceC2495e, new C0433a(interfaceC6645w, linkedHashSet, z10));
        return linkedHashSet;
    }

    public static Collection d(Zh.f fVar, Collection collection, Collection collection2, InterfaceC2495e interfaceC2495e, InterfaceC6645w interfaceC6645w, bi.o oVar) {
        if (fVar == null) {
            a(0);
        }
        if (collection == null) {
            a(1);
        }
        if (collection2 == null) {
            a(2);
        }
        if (interfaceC2495e == null) {
            a(3);
        }
        if (interfaceC6645w == null) {
            a(4);
        }
        if (oVar == null) {
            a(5);
        }
        return c(fVar, collection, collection2, interfaceC2495e, interfaceC6645w, oVar, false);
    }

    public static Collection e(Zh.f fVar, Collection collection, Collection collection2, InterfaceC2495e interfaceC2495e, InterfaceC6645w interfaceC6645w, bi.o oVar) {
        if (fVar == null) {
            a(6);
        }
        if (collection == null) {
            a(7);
        }
        if (collection2 == null) {
            a(8);
        }
        if (interfaceC2495e == null) {
            a(9);
        }
        if (interfaceC6645w == null) {
            a(10);
        }
        if (oVar == null) {
            a(11);
        }
        return c(fVar, collection, collection2, interfaceC2495e, interfaceC6645w, oVar, true);
    }
}
