package fi;

import Bh.A;
import Bh.G;
import Bh.H;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2499i;
import Bh.InterfaceC2503m;
import Bh.M;
import Bh.X;
import Bh.Y;
import Bh.q0;
import Bh.s0;
import Zg.AbstractC3689v;
import Zh.f;
import f.AbstractC5487d;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6489o;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.O;
import kotlin.reflect.jvm.internal.impl.builtins.i;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.checker.h;
import mh.InterfaceC6835l;
import pi.S;
import xi.AbstractC8535b;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* renamed from: fi.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5833e {

    /* renamed from: a, reason: collision with root package name */
    private static final f f47356a;

    /* renamed from: fi.e$a */
    /* synthetic */ class a extends AbstractC6489o implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f47357a = new a();

        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(s0 p02) {
            AbstractC6492s.i(p02, "p0");
            return Boolean.valueOf(p02.s0());
        }

        @Override // kotlin.jvm.internal.AbstractC6480f, th.c
        public final String getName() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final th.f getOwner() {
            return O.b(s0.class);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }
    }

    /* renamed from: fi.e$b */
    public static final class b extends AbstractC8535b.AbstractC2348b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f47358a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f47359b;

        b(N n10, InterfaceC6835l interfaceC6835l) {
            this.f47358a = n10;
            this.f47359b = interfaceC6835l;
        }

        @Override // xi.AbstractC8535b.AbstractC2348b, xi.AbstractC8535b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC2492b current) {
            AbstractC6492s.i(current, "current");
            if (this.f47358a.f51689a == null && ((Boolean) this.f47359b.invoke(current)).booleanValue()) {
                this.f47358a.f51689a = current;
            }
        }

        @Override // xi.AbstractC8535b.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC2492b current) {
            AbstractC6492s.i(current, "current");
            return this.f47358a.f51689a == null;
        }

        @Override // xi.AbstractC8535b.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InterfaceC2492b a() {
            return (InterfaceC2492b) this.f47358a.f51689a;
        }
    }

    static {
        f fVarH = f.h("value");
        AbstractC6492s.h(fVarH, "identifier(...)");
        f47356a = fVarH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC8780j A(boolean z10, InterfaceC2492b interfaceC2492b) {
        AbstractC6492s.f(interfaceC2492b);
        return z(interfaceC2492b, z10);
    }

    public static final InterfaceC2495e B(G g10, Zh.c topLevelClassFqName, Ih.b location) {
        AbstractC6492s.i(g10, "<this>");
        AbstractC6492s.i(topLevelClassFqName, "topLevelClassFqName");
        AbstractC6492s.i(location, "location");
        topLevelClassFqName.d();
        Zh.c cVarE = topLevelClassFqName.e();
        AbstractC6492s.h(cVarE, "parent(...)");
        InterfaceC6164k interfaceC6164kR = g10.y(cVarE).r();
        f fVarG = topLevelClassFqName.g();
        AbstractC6492s.h(fVarG, "shortName(...)");
        InterfaceC2498h interfaceC2498hG = interfaceC6164kR.g(fVarG, location);
        if (interfaceC2498hG instanceof InterfaceC2495e) {
            return (InterfaceC2495e) interfaceC2498hG;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2503m a(InterfaceC2503m it) {
        AbstractC6492s.i(it, "it");
        return it.b();
    }

    public static final boolean f(s0 s0Var) {
        AbstractC6492s.i(s0Var, "<this>");
        Boolean boolE = AbstractC8535b.e(AbstractC3689v.e(s0Var), C5829a.f47352a, a.f47357a);
        AbstractC6492s.h(boolE, "ifAny(...)");
        return boolE.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable g(s0 s0Var) {
        Collection collectionF = s0Var.f();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(collectionF, 10));
        Iterator it = collectionF.iterator();
        while (it.hasNext()) {
            arrayList.add(((s0) it.next()).a());
        }
        return arrayList;
    }

    public static final InterfaceC2492b h(InterfaceC2492b interfaceC2492b, boolean z10, InterfaceC6835l predicate) {
        AbstractC6492s.i(interfaceC2492b, "<this>");
        AbstractC6492s.i(predicate, "predicate");
        return (InterfaceC2492b) AbstractC8535b.b(AbstractC3689v.e(interfaceC2492b), new C5831c(z10), new b(new N(), predicate));
    }

    public static /* synthetic */ InterfaceC2492b i(InterfaceC2492b interfaceC2492b, boolean z10, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(interfaceC2492b, z10, interfaceC6835l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable j(boolean z10, InterfaceC2492b interfaceC2492b) {
        Collection collectionL;
        if (z10) {
            interfaceC2492b = interfaceC2492b != null ? interfaceC2492b.a() : null;
        }
        if (interfaceC2492b == null || (collectionL = interfaceC2492b.f()) == null) {
            collectionL = AbstractC3689v.l();
        }
        return collectionL;
    }

    public static final Zh.c k(InterfaceC2503m interfaceC2503m) {
        AbstractC6492s.i(interfaceC2503m, "<this>");
        Zh.d dVarP = p(interfaceC2503m);
        if (!dVarP.f()) {
            dVarP = null;
        }
        if (dVarP != null) {
            return dVarP.l();
        }
        return null;
    }

    public static final InterfaceC2495e l(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        AbstractC6492s.i(cVar, "<this>");
        InterfaceC2498h interfaceC2498hC = cVar.getType().N0().c();
        if (interfaceC2498hC instanceof InterfaceC2495e) {
            return (InterfaceC2495e) interfaceC2498hC;
        }
        return null;
    }

    public static final i m(InterfaceC2503m interfaceC2503m) {
        AbstractC6492s.i(interfaceC2503m, "<this>");
        return s(interfaceC2503m).q();
    }

    public static final Zh.b n(InterfaceC2498h interfaceC2498h) {
        InterfaceC2503m interfaceC2503mB;
        Zh.b bVarN;
        if (interfaceC2498h == null || (interfaceC2503mB = interfaceC2498h.b()) == null) {
            return null;
        }
        if (interfaceC2503mB instanceof M) {
            Zh.c cVarE = ((M) interfaceC2503mB).e();
            f name = interfaceC2498h.getName();
            AbstractC6492s.h(name, "getName(...)");
            return new Zh.b(cVarE, name);
        }
        if (!(interfaceC2503mB instanceof InterfaceC2499i) || (bVarN = n((InterfaceC2498h) interfaceC2503mB)) == null) {
            return null;
        }
        f name2 = interfaceC2498h.getName();
        AbstractC6492s.h(name2, "getName(...)");
        return bVarN.d(name2);
    }

    public static final Zh.c o(InterfaceC2503m interfaceC2503m) {
        AbstractC6492s.i(interfaceC2503m, "<this>");
        Zh.c cVarN = bi.i.n(interfaceC2503m);
        AbstractC6492s.h(cVarN, "getFqNameSafe(...)");
        return cVarN;
    }

    public static final Zh.d p(InterfaceC2503m interfaceC2503m) {
        AbstractC6492s.i(interfaceC2503m, "<this>");
        Zh.d dVarM = bi.i.m(interfaceC2503m);
        AbstractC6492s.h(dVarM, "getFqName(...)");
        return dVarM;
    }

    public static final A q(InterfaceC2495e interfaceC2495e) {
        q0 q0VarZ0 = interfaceC2495e != null ? interfaceC2495e.z0() : null;
        if (q0VarZ0 instanceof A) {
            return (A) q0VarZ0;
        }
        return null;
    }

    public static final g r(G g10) {
        AbstractC6492s.i(g10, "<this>");
        AbstractC5487d.a(g10.b0(h.a()));
        return g.a.f52146a;
    }

    public static final G s(InterfaceC2503m interfaceC2503m) {
        AbstractC6492s.i(interfaceC2503m, "<this>");
        G g10 = bi.i.g(interfaceC2503m);
        AbstractC6492s.h(g10, "getContainingModule(...)");
        return g10;
    }

    public static final H t(InterfaceC2495e interfaceC2495e) {
        q0 q0VarZ0 = interfaceC2495e != null ? interfaceC2495e.z0() : null;
        if (q0VarZ0 instanceof H) {
            return (H) q0VarZ0;
        }
        return null;
    }

    public static final InterfaceC8780j u(InterfaceC2503m interfaceC2503m) {
        AbstractC6492s.i(interfaceC2503m, "<this>");
        return AbstractC8783m.B(v(interfaceC2503m), 1);
    }

    public static final InterfaceC8780j v(InterfaceC2503m interfaceC2503m) {
        AbstractC6492s.i(interfaceC2503m, "<this>");
        return AbstractC8783m.n(interfaceC2503m, C5830b.f47353a);
    }

    public static final InterfaceC2492b w(InterfaceC2492b interfaceC2492b) {
        AbstractC6492s.i(interfaceC2492b, "<this>");
        if (!(interfaceC2492b instanceof X)) {
            return interfaceC2492b;
        }
        Y yC0 = ((X) interfaceC2492b).C0();
        AbstractC6492s.h(yC0, "getCorrespondingProperty(...)");
        return yC0;
    }

    public static final InterfaceC2495e x(InterfaceC2495e interfaceC2495e) {
        AbstractC6492s.i(interfaceC2495e, "<this>");
        for (S s10 : interfaceC2495e.u().N0().a()) {
            if (!i.b0(s10)) {
                InterfaceC2498h interfaceC2498hC = s10.N0().c();
                if (bi.i.w(interfaceC2498hC)) {
                    AbstractC6492s.g(interfaceC2498hC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (InterfaceC2495e) interfaceC2498hC;
                }
            }
        }
        return null;
    }

    public static final boolean y(G g10) {
        AbstractC6492s.i(g10, "<this>");
        AbstractC5487d.a(g10.b0(h.a()));
        return false;
    }

    public static final InterfaceC8780j z(InterfaceC2492b interfaceC2492b, boolean z10) {
        AbstractC6492s.i(interfaceC2492b, "<this>");
        if (z10) {
            interfaceC2492b = interfaceC2492b.a();
        }
        InterfaceC8780j interfaceC8780jS = AbstractC8783m.s(interfaceC2492b);
        Collection collectionF = interfaceC2492b.f();
        AbstractC6492s.h(collectionF, "getOverriddenDescriptors(...)");
        return AbstractC8783m.S(interfaceC8780jS, AbstractC8783m.H(AbstractC3689v.d0(collectionF), new C5832d(z10)));
    }
}
