package Dh;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.EnumC2496f;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2494d;
import Bh.InterfaceC2495e;
import Bh.g0;
import Bh.q0;
import com.google.ar.core.ImageFormat;
import ii.AbstractC6165l;
import ii.C6157d;
import ii.InterfaceC6164k;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import pi.C7373u;
import pi.v0;

/* renamed from: Dh.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2611q extends AbstractC2604j {

    /* renamed from: i, reason: collision with root package name */
    private final v0 f3476i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC6164k f3477j;

    /* renamed from: k, reason: collision with root package name */
    private final oi.i f3478k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.h f3479l;

    /* renamed from: Dh.q$a */
    private class a extends AbstractC6165l {

        /* renamed from: b, reason: collision with root package name */
        private final oi.g f3480b;

        /* renamed from: c, reason: collision with root package name */
        private final oi.g f3481c;

        /* renamed from: d, reason: collision with root package name */
        private final oi.i f3482d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2611q f3483e;

        /* renamed from: Dh.q$a$a, reason: collision with other inner class name */
        class C0162a implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2611q f3484a;

            C0162a(C2611q c2611q) {
                this.f3484a = c2611q;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection invoke(Zh.f fVar) {
                return a.this.m(fVar);
            }
        }

        /* renamed from: Dh.q$a$b */
        class b implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2611q f3486a;

            b(C2611q c2611q) {
                this.f3486a = c2611q;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection invoke(Zh.f fVar) {
                return a.this.n(fVar);
            }
        }

        /* renamed from: Dh.q$a$c */
        class c implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2611q f3488a;

            c(C2611q c2611q) {
                this.f3488a = c2611q;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection invoke() {
                return a.this.l();
            }
        }

        /* renamed from: Dh.q$a$d */
        class d extends bi.m {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Set f3490a;

            d(Set set) {
                this.f3490a = set;
            }

            private static /* synthetic */ void f(int i10) {
                Object[] objArr = new Object[3];
                if (i10 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i10 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i10 == 1 || i10 == 2) {
                    objArr[2] = "conflict";
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
                bi.o.K(interfaceC2492b, null);
                this.f3490a.add(interfaceC2492b);
            }

            @Override // bi.m
            protected void e(InterfaceC2492b interfaceC2492b, InterfaceC2492b interfaceC2492b2) {
                if (interfaceC2492b == null) {
                    f(1);
                }
                if (interfaceC2492b2 == null) {
                    f(2);
                }
            }
        }

        public a(C2611q c2611q, oi.n nVar) {
            if (nVar == null) {
                h(0);
            }
            this.f3483e = c2611q;
            this.f3480b = nVar.e(new C0162a(c2611q));
            this.f3481c = nVar.e(new b(c2611q));
            this.f3482d = nVar.f(new c(c2611q));
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void h(int r13) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Dh.C2611q.a.h(int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection l() {
            HashSet hashSet = new HashSet();
            for (Zh.f fVar : (Set) this.f3483e.f3478k.invoke()) {
                Ih.d dVar = Ih.d.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(b(fVar, dVar));
                hashSet.addAll(d(fVar, dVar));
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection m(Zh.f fVar) {
            if (fVar == null) {
                h(8);
            }
            return p(fVar, o().b(fVar, Ih.d.FOR_NON_TRACKED_SCOPE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection n(Zh.f fVar) {
            if (fVar == null) {
                h(4);
            }
            return p(fVar, o().d(fVar, Ih.d.FOR_NON_TRACKED_SCOPE));
        }

        private InterfaceC6164k o() {
            InterfaceC6164k interfaceC6164kR = ((pi.S) this.f3483e.k().a().iterator().next()).r();
            if (interfaceC6164kR == null) {
                h(9);
            }
            return interfaceC6164kR;
        }

        private Collection p(Zh.f fVar, Collection collection) {
            if (fVar == null) {
                h(10);
            }
            if (collection == null) {
                h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            bi.o.f33360f.v(fVar, collection, Collections.emptySet(), this.f3483e, new d(linkedHashSet));
            return linkedHashSet;
        }

        @Override // ii.AbstractC6165l, ii.InterfaceC6164k
        public Set a() {
            Set set = (Set) this.f3483e.f3478k.invoke();
            if (set == null) {
                h(17);
            }
            return set;
        }

        @Override // ii.AbstractC6165l, ii.InterfaceC6164k
        public Collection b(Zh.f fVar, Ih.b bVar) {
            if (fVar == null) {
                h(5);
            }
            if (bVar == null) {
                h(6);
            }
            Collection collection = (Collection) this.f3480b.invoke(fVar);
            if (collection == null) {
                h(7);
            }
            return collection;
        }

        @Override // ii.AbstractC6165l, ii.InterfaceC6164k
        public Set c() {
            Set set = (Set) this.f3483e.f3478k.invoke();
            if (set == null) {
                h(19);
            }
            return set;
        }

        @Override // ii.AbstractC6165l, ii.InterfaceC6164k
        public Collection d(Zh.f fVar, Ih.b bVar) {
            if (fVar == null) {
                h(1);
            }
            if (bVar == null) {
                h(2);
            }
            Collection collection = (Collection) this.f3481c.invoke(fVar);
            if (collection == null) {
                h(3);
            }
            return collection;
        }

        @Override // ii.AbstractC6165l, ii.InterfaceC6167n
        public Collection e(C6157d c6157d, InterfaceC6835l interfaceC6835l) {
            if (c6157d == null) {
                h(13);
            }
            if (interfaceC6835l == null) {
                h(14);
            }
            Collection collection = (Collection) this.f3482d.invoke();
            if (collection == null) {
                h(15);
            }
            return collection;
        }

        @Override // ii.AbstractC6165l, ii.InterfaceC6164k
        public Set f() {
            Set setEmptySet = Collections.emptySet();
            if (setEmptySet == null) {
                h(18);
            }
            return setEmptySet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C2611q(oi.n nVar, InterfaceC2495e interfaceC2495e, pi.S s10, Zh.f fVar, oi.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, g0 g0Var) {
        super(nVar, interfaceC2495e, fVar, g0Var, false);
        if (nVar == null) {
            B0(6);
        }
        if (interfaceC2495e == null) {
            B0(7);
        }
        if (s10 == null) {
            B0(8);
        }
        if (fVar == null) {
            B0(9);
        }
        if (iVar == null) {
            B0(10);
        }
        if (hVar == null) {
            B0(11);
        }
        if (g0Var == null) {
            B0(12);
        }
        this.f3479l = hVar;
        this.f3476i = new C7373u(this, Collections.emptyList(), Collections.singleton(s10), nVar);
        this.f3477j = new a(this, nVar);
        this.f3478k = iVar;
    }

    private static /* synthetic */ void B0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 23:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case ImageFormat.RGBA_FP16 /* 22 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static C2611q L0(oi.n nVar, InterfaceC2495e interfaceC2495e, Zh.f fVar, oi.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, g0 g0Var) {
        if (nVar == null) {
            B0(0);
        }
        if (interfaceC2495e == null) {
            B0(1);
        }
        if (fVar == null) {
            B0(2);
        }
        if (iVar == null) {
            B0(3);
        }
        if (hVar == null) {
            B0(4);
        }
        if (g0Var == null) {
            B0(5);
        }
        return new C2611q(nVar, interfaceC2495e, interfaceC2495e.u(), fVar, iVar, hVar, g0Var);
    }

    @Override // Bh.InterfaceC2495e
    public boolean D() {
        return false;
    }

    @Override // Bh.C
    public boolean F0() {
        return false;
    }

    @Override // Bh.InterfaceC2495e
    public boolean I0() {
        return false;
    }

    @Override // Bh.C
    public boolean L() {
        return false;
    }

    @Override // Bh.InterfaceC2499i
    public boolean M() {
        return false;
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC2494d P() {
        return null;
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC6164k Q() {
        InterfaceC6164k.b bVar = InterfaceC6164k.b.f49223b;
        if (bVar == null) {
            B0(15);
        }
        return bVar;
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC2495e S() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.h getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar = this.f3479l;
        if (hVar == null) {
            B0(21);
        }
        return hVar;
    }

    @Override // Bh.InterfaceC2495e, Bh.C, Bh.InterfaceC2507q
    public AbstractC2510u getVisibility() {
        AbstractC2510u abstractC2510u = AbstractC2509t.f1796e;
        if (abstractC2510u == null) {
            B0(20);
        }
        return abstractC2510u;
    }

    @Override // Bh.InterfaceC2495e
    public EnumC2496f h() {
        EnumC2496f enumC2496f = EnumC2496f.ENUM_ENTRY;
        if (enumC2496f == null) {
            B0(18);
        }
        return enumC2496f;
    }

    @Override // Dh.z
    public InterfaceC6164k i0(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            B0(13);
        }
        InterfaceC6164k interfaceC6164k = this.f3477j;
        if (interfaceC6164k == null) {
            B0(14);
        }
        return interfaceC6164k;
    }

    @Override // Bh.InterfaceC2495e
    public boolean isInline() {
        return false;
    }

    @Override // Bh.InterfaceC2498h
    public v0 k() {
        v0 v0Var = this.f3476i;
        if (v0Var == null) {
            B0(17);
        }
        return v0Var;
    }

    @Override // Bh.InterfaceC2495e, Bh.C
    public Bh.D l() {
        Bh.D d10 = Bh.D.FINAL;
        if (d10 == null) {
            B0(19);
        }
        return d10;
    }

    @Override // Bh.InterfaceC2495e
    public Collection m() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            B0(16);
        }
        return listEmptyList;
    }

    @Override // Bh.InterfaceC2495e
    public Collection n() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            B0(23);
        }
        return listEmptyList;
    }

    @Override // Bh.InterfaceC2495e
    public boolean o() {
        return false;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    @Override // Bh.InterfaceC2495e, Bh.InterfaceC2499i
    public List w() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            B0(22);
        }
        return listEmptyList;
    }

    @Override // Bh.InterfaceC2495e
    public boolean z() {
        return false;
    }

    @Override // Bh.InterfaceC2495e
    public q0 z0() {
        return null;
    }
}
