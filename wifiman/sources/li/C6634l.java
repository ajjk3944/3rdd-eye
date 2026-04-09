package li;

import Bh.InterfaceC2495e;
import Bh.g0;
import Wh.h;
import Zg.d0;
import Zh.b;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import mh.InterfaceC6835l;
import ni.C6981m;

/* renamed from: li.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6634l {

    /* renamed from: c, reason: collision with root package name */
    public static final b f52708c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Set f52709d;

    /* renamed from: a, reason: collision with root package name */
    private final C6636n f52710a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f52711b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: li.l$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Zh.b f52712a;

        /* renamed from: b, reason: collision with root package name */
        private final C6631i f52713b;

        public a(Zh.b classId, C6631i c6631i) {
            AbstractC6492s.i(classId, "classId");
            this.f52712a = classId;
            this.f52713b = c6631i;
        }

        public final C6631i a() {
            return this.f52713b;
        }

        public final Zh.b b() {
            return this.f52712a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC6492s.d(this.f52712a, ((a) obj).f52712a);
        }

        public int hashCode() {
            return this.f52712a.hashCode();
        }
    }

    /* renamed from: li.l$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return C6634l.f52709d;
        }

        private b() {
        }
    }

    static {
        b.a aVar = Zh.b.f25401d;
        Zh.c cVarL = o.a.f51850d.l();
        AbstractC6492s.h(cVarL, "toSafe(...)");
        f52709d = d0.c(aVar.c(cVarL));
    }

    public C6634l(C6636n components) {
        AbstractC6492s.i(components, "components");
        this.f52710a = components;
        this.f52711b = components.u().i(new C6633k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2495e c(C6634l c6634l, a key) {
        AbstractC6492s.i(key, "key");
        return c6634l.d(key);
    }

    private final InterfaceC2495e d(a aVar) {
        Object next;
        C6638p c6638pA;
        Zh.b bVarB = aVar.b();
        Iterator it = this.f52710a.l().iterator();
        while (it.hasNext()) {
            InterfaceC2495e interfaceC2495eB = ((Ch.b) it.next()).b(bVarB);
            if (interfaceC2495eB != null) {
                return interfaceC2495eB;
            }
        }
        if (f52709d.contains(bVarB)) {
            return null;
        }
        C6631i c6631iA = aVar.a();
        if (c6631iA == null && (c6631iA = this.f52710a.e().a(bVarB)) == null) {
            return null;
        }
        Wh.c cVarA = c6631iA.a();
        Uh.c cVarB = c6631iA.b();
        Wh.a aVarC = c6631iA.c();
        g0 g0VarD = c6631iA.d();
        Zh.b bVarE = bVarB.e();
        if (bVarE != null) {
            InterfaceC2495e interfaceC2495eF = f(this, bVarE, null, 2, null);
            C6981m c6981m = interfaceC2495eF instanceof C6981m ? (C6981m) interfaceC2495eF : null;
            if (c6981m == null || !c6981m.k1(bVarB.h())) {
                return null;
            }
            c6638pA = c6981m.d1();
        } else {
            Iterator it2 = Bh.S.c(this.f52710a.s(), bVarB.f()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                Bh.M m10 = (Bh.M) next;
                if (!(m10 instanceof AbstractC6640r) || ((AbstractC6640r) m10).K0(bVarB.h())) {
                    break;
                }
            }
            Bh.M m11 = (Bh.M) next;
            if (m11 == null) {
                return null;
            }
            C6636n c6636n = this.f52710a;
            Uh.t tVarR2 = cVarB.r2();
            AbstractC6492s.h(tVarR2, "getTypeTable(...)");
            Wh.g gVar = new Wh.g(tVarR2);
            h.a aVar2 = Wh.h.f23970b;
            Uh.w wVarT2 = cVarB.t2();
            AbstractC6492s.h(wVarT2, "getVersionRequirementTable(...)");
            c6638pA = c6636n.a(m11, cVarA, gVar, aVar2.a(wVarT2), aVarC, null);
        }
        return new C6981m(c6638pA, cVarB, cVarA, aVarC, g0VarD);
    }

    public static /* synthetic */ InterfaceC2495e f(C6634l c6634l, Zh.b bVar, C6631i c6631i, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c6631i = null;
        }
        return c6634l.e(bVar, c6631i);
    }

    public final InterfaceC2495e e(Zh.b classId, C6631i c6631i) {
        AbstractC6492s.i(classId, "classId");
        return (InterfaceC2495e) this.f52711b.invoke(new a(classId, c6631i));
    }
}
