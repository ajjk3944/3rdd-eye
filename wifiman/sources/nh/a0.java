package Nh;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.f0;
import Zg.AbstractC3689v;
import Zg.d0;
import ii.C6157d;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import xi.AbstractC8534a;
import xi.AbstractC8535b;
import zi.AbstractC8783m;

/* loaded from: classes4.dex */
public final class a0 extends b0 {

    /* renamed from: n, reason: collision with root package name */
    private final Qh.g f16493n;

    /* renamed from: o, reason: collision with root package name */
    private final Lh.c f16494o;

    public static final class a extends AbstractC8535b.AbstractC2348b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2495e f16495a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f16496b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f16497c;

        a(InterfaceC2495e interfaceC2495e, Set set, InterfaceC6835l interfaceC6835l) {
            this.f16495a = interfaceC2495e;
            this.f16496b = set;
            this.f16497c = interfaceC6835l;
        }

        @Override // xi.AbstractC8535b.d
        public /* bridge */ /* synthetic */ Object a() {
            e();
            return Yg.J.f24997a;
        }

        @Override // xi.AbstractC8535b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC2495e current) {
            AbstractC6492s.i(current, "current");
            if (current == this.f16495a) {
                return true;
            }
            InterfaceC6164k interfaceC6164kQ = current.Q();
            AbstractC6492s.h(interfaceC6164kQ, "getStaticScope(...)");
            if (!(interfaceC6164kQ instanceof b0)) {
                return true;
            }
            this.f16496b.addAll((Collection) this.f16497c.invoke(interfaceC6164kQ));
            return false;
        }

        public void e() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Mh.k c10, Qh.g jClass, Lh.c ownerDescriptor) {
        super(c10);
        AbstractC6492s.i(c10, "c");
        AbstractC6492s.i(jClass, "jClass");
        AbstractC6492s.i(ownerDescriptor, "ownerDescriptor");
        this.f16493n = jClass;
        this.f16494o = ownerDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m0(Qh.q it) {
        AbstractC6492s.i(it, "it");
        return it.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection n0(Zh.f fVar, InterfaceC6164k it) {
        AbstractC6492s.i(it, "it");
        return it.d(fVar, Ih.d.WHEN_GET_SUPER_MEMBERS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection o0(InterfaceC6164k it) {
        AbstractC6492s.i(it, "it");
        return it.c();
    }

    private final Set p0(InterfaceC2495e interfaceC2495e, Set set, InterfaceC6835l interfaceC6835l) {
        AbstractC8535b.b(AbstractC3689v.e(interfaceC2495e), Y.f16490a, new a(interfaceC2495e, set, interfaceC6835l));
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable q0(InterfaceC2495e interfaceC2495e) {
        Collection collectionA = interfaceC2495e.k().a();
        AbstractC6492s.h(collectionA, "getSupertypes(...)");
        return AbstractC8783m.w(AbstractC8783m.O(AbstractC3689v.d0(collectionA), Z.f16491a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2495e r0(pi.S s10) {
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        if (interfaceC2498hC instanceof InterfaceC2495e) {
            return (InterfaceC2495e) interfaceC2498hC;
        }
        return null;
    }

    private final Bh.Y t0(Bh.Y y10) {
        if (y10.h().isReal()) {
            return y10;
        }
        Collection collectionF = y10.f();
        AbstractC6492s.h(collectionF, "getOverriddenDescriptors(...)");
        Collection<Bh.Y> collection = collectionF;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(collection, 10));
        for (Bh.Y y11 : collection) {
            AbstractC6492s.f(y11);
            arrayList.add(t0(y11));
        }
        return (Bh.Y) AbstractC3689v.R0(AbstractC3689v.g0(arrayList));
    }

    private final Set u0(Zh.f fVar, InterfaceC2495e interfaceC2495e) {
        a0 a0VarB = Lh.h.b(interfaceC2495e);
        return a0VarB == null ? d0.e() : AbstractC3689v.n1(a0VarB.b(fVar, Ih.d.WHEN_GET_SUPER_MEMBERS));
    }

    @Override // Nh.U
    protected void B(Collection result, Zh.f name) {
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(name, "name");
        Collection collectionE = Kh.a.e(name, u0(name, R()), result, R(), L().a().c(), L().a().k().a());
        AbstractC6492s.h(collectionE, "resolveOverridesForStaticMembers(...)");
        result.addAll(collectionE);
        if (this.f16493n.A()) {
            if (AbstractC6492s.d(name, kotlin.reflect.jvm.internal.impl.builtins.o.f51782f)) {
                f0 f0VarG = bi.h.g(R());
                AbstractC6492s.h(f0VarG, "createEnumValueOfMethod(...)");
                result.add(f0VarG);
            } else if (AbstractC6492s.d(name, kotlin.reflect.jvm.internal.impl.builtins.o.f51780d)) {
                f0 f0VarH = bi.h.h(R());
                AbstractC6492s.h(f0VarH, "createEnumValuesMethod(...)");
                result.add(f0VarH);
            }
        }
    }

    @Override // Nh.b0, Nh.U
    protected void C(Zh.f name, Collection result) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(result, "result");
        Set setP0 = p0(R(), new LinkedHashSet(), new X(name));
        if (result.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setP0) {
                Bh.Y yT0 = t0((Bh.Y) obj);
                Object arrayList = linkedHashMap.get(yT0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(yT0, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collectionE = Kh.a.e(name, (Collection) ((Map.Entry) it.next()).getValue(), result, R(), L().a().c(), L().a().k().a());
                AbstractC6492s.h(collectionE, "resolveOverridesForStaticMembers(...)");
                AbstractC3689v.C(arrayList2, collectionE);
            }
            result.addAll(arrayList2);
        } else {
            Collection collectionE2 = Kh.a.e(name, setP0, result, R(), L().a().c(), L().a().k().a());
            AbstractC6492s.h(collectionE2, "resolveOverridesForStaticMembers(...)");
            result.addAll(collectionE2);
        }
        if (this.f16493n.A() && AbstractC6492s.d(name, kotlin.reflect.jvm.internal.impl.builtins.o.f51781e)) {
            AbstractC8534a.a(result, bi.h.f(R()));
        }
    }

    @Override // Nh.U
    protected Set D(C6157d kindFilter, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        Set setM1 = AbstractC3689v.m1(((InterfaceC3376c) N().invoke()).e());
        p0(R(), setM1, W.f16488a);
        if (this.f16493n.A()) {
            setM1.add(kotlin.reflect.jvm.internal.impl.builtins.o.f51781e);
        }
        return setM1;
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6167n
    public InterfaceC2498h g(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Nh.U
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C3375b z() {
        return new C3375b(this.f16493n, V.f16487a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Nh.U
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public Lh.c R() {
        return this.f16494o;
    }

    @Override // Nh.U
    protected Set v(C6157d kindFilter, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        return d0.e();
    }

    @Override // Nh.U
    protected Set x(C6157d kindFilter, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        Set setM1 = AbstractC3689v.m1(((InterfaceC3376c) N().invoke()).a());
        a0 a0VarB = Lh.h.b(R());
        Set setA = a0VarB != null ? a0VarB.a() : null;
        if (setA == null) {
            setA = d0.e();
        }
        setM1.addAll(setA);
        if (this.f16493n.A()) {
            setM1.addAll(AbstractC3689v.o(kotlin.reflect.jvm.internal.impl.builtins.o.f51782f, kotlin.reflect.jvm.internal.impl.builtins.o.f51780d));
        }
        setM1.addAll(L().a().w().c(R(), L()));
        return setM1;
    }

    @Override // Nh.U
    protected void y(Collection result, Zh.f name) {
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(name, "name");
        L().a().w().h(R(), name, result, L());
    }
}
