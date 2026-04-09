package zh;

import Bh.AbstractC2509t;
import Bh.D;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Bh.b0;
import Bh.g0;
import Bh.l0;
import Bh.s0;
import Dh.AbstractC2612s;
import Dh.O;
import Dh.V;
import Yg.s;
import Zg.AbstractC3689v;
import Zg.N;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.h;
import org.snmp4j.util.SnmpConfigurator;
import pi.AbstractC7346d0;
import pi.G0;
import pi.N0;
import pi.S;
import ui.t;

/* renamed from: zh.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8766e extends O {

    /* renamed from: E, reason: collision with root package name */
    public static final a f67305E = new a(null);

    /* renamed from: zh.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final s0 b(C8766e c8766e, int i10, l0 l0Var) {
            String lowerCase;
            String strB = l0Var.getName().b();
            AbstractC6492s.h(strB, "asString(...)");
            if (AbstractC6492s.d(strB, "T")) {
                lowerCase = "instance";
            } else if (AbstractC6492s.d(strB, SnmpConfigurator.O_CONTEXT_ENGINE_ID)) {
                lowerCase = "receiver";
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                AbstractC6492s.h(lowerCase, "toLowerCase(...)");
            }
            h hVarB = h.f51914c1.b();
            Zh.f fVarH = Zh.f.h(lowerCase);
            AbstractC6492s.h(fVarH, "identifier(...)");
            AbstractC7346d0 abstractC7346d0U = l0Var.u();
            AbstractC6492s.h(abstractC7346d0U, "getDefaultType(...)");
            g0 NO_SOURCE = g0.f1784a;
            AbstractC6492s.h(NO_SOURCE, "NO_SOURCE");
            return new V(c8766e, null, i10, hVarB, fVarH, abstractC7346d0U, false, false, false, null, NO_SOURCE);
        }

        public final C8766e a(C8763b functionClass, boolean z10) {
            AbstractC6492s.i(functionClass, "functionClass");
            List listW = functionClass.w();
            C8766e c8766e = new C8766e(functionClass, null, InterfaceC2492b.a.DECLARATION, z10, null);
            b0 b0VarJ0 = functionClass.J0();
            List listL = AbstractC3689v.l();
            List listL2 = AbstractC3689v.l();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listW) {
                if (((l0) obj).p() != N0.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<N> iterableQ1 = AbstractC3689v.q1(arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(iterableQ1, 10));
            for (N n10 : iterableQ1) {
                arrayList2.add(C8766e.f67305E.b(c8766e, n10.c(), (l0) n10.d()));
            }
            c8766e.R0(null, b0VarJ0, listL, listL2, arrayList2, ((l0) AbstractC3689v.B0(listW)).u(), D.ABSTRACT, AbstractC2509t.f1796e);
            c8766e.Z0(true);
            return c8766e;
        }

        private a() {
        }
    }

    public /* synthetic */ C8766e(InterfaceC2503m interfaceC2503m, C8766e c8766e, InterfaceC2492b.a aVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2503m, c8766e, aVar, z10);
    }

    private final InterfaceC2515z p1(List list) {
        Zh.f fVar;
        int size = i().size() - list.size();
        boolean z10 = true;
        if (size == 0) {
            List listI = i();
            AbstractC6492s.h(listI, "getValueParameters(...)");
            List<s> listS1 = AbstractC3689v.s1(list, listI);
            if (!(listS1 instanceof Collection) || !listS1.isEmpty()) {
                for (s sVar : listS1) {
                    if (!AbstractC6492s.d((Zh.f) sVar.a(), ((s0) sVar.c()).getName())) {
                    }
                }
            }
            return this;
        }
        List listI2 = i();
        AbstractC6492s.h(listI2, "getValueParameters(...)");
        List<s0> list2 = listI2;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
        for (s0 s0Var : list2) {
            Zh.f name = s0Var.getName();
            AbstractC6492s.h(name, "getName(...)");
            int index = s0Var.getIndex();
            int i10 = index - size;
            if (i10 >= 0 && (fVar = (Zh.f) list.get(i10)) != null) {
                name = fVar;
            }
            arrayList.add(s0Var.E(this, name, index));
        }
        AbstractC2612s.c cVarS0 = S0(G0.f58062b);
        List list3 = list;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            z10 = false;
        } else {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((Zh.f) it.next()) == null) {
                    break;
                }
            }
            z10 = false;
        }
        AbstractC2612s.c cVarJ = cVarS0.H(z10).d(arrayList).j(a());
        AbstractC6492s.h(cVarJ, "setOriginal(...)");
        InterfaceC2515z interfaceC2515zM0 = super.M0(cVarJ);
        AbstractC6492s.f(interfaceC2515zM0);
        return interfaceC2515zM0;
    }

    @Override // Dh.O, Dh.AbstractC2612s
    protected AbstractC2612s L0(InterfaceC2503m newOwner, InterfaceC2515z interfaceC2515z, InterfaceC2492b.a kind, Zh.f fVar, h annotations, g0 source) {
        AbstractC6492s.i(newOwner, "newOwner");
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(annotations, "annotations");
        AbstractC6492s.i(source, "source");
        return new C8766e(newOwner, (C8766e) interfaceC2515z, kind, isSuspend());
    }

    @Override // Dh.AbstractC2612s
    protected InterfaceC2515z M0(AbstractC2612s.c configuration) {
        AbstractC6492s.i(configuration, "configuration");
        C8766e c8766e = (C8766e) super.M0(configuration);
        if (c8766e == null) {
            return null;
        }
        List listI = c8766e.i();
        AbstractC6492s.h(listI, "getValueParameters(...)");
        List list = listI;
        if ((list instanceof Collection) && list.isEmpty()) {
            return c8766e;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S type = ((s0) it.next()).getType();
            AbstractC6492s.h(type, "getType(...)");
            if (kotlin.reflect.jvm.internal.impl.builtins.h.d(type) != null) {
                List listI2 = c8766e.i();
                AbstractC6492s.h(listI2, "getValueParameters(...)");
                List list2 = listI2;
                ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    S type2 = ((s0) it2.next()).getType();
                    AbstractC6492s.h(type2, "getType(...)");
                    arrayList.add(kotlin.reflect.jvm.internal.impl.builtins.h.d(type2));
                }
                return c8766e.p1(arrayList);
            }
        }
        return c8766e;
    }

    @Override // Dh.AbstractC2612s, Bh.InterfaceC2515z
    public boolean O() {
        return false;
    }

    @Override // Dh.AbstractC2612s, Bh.C
    public boolean isExternal() {
        return false;
    }

    @Override // Dh.AbstractC2612s, Bh.InterfaceC2515z
    public boolean isInline() {
        return false;
    }

    private C8766e(InterfaceC2503m interfaceC2503m, C8766e c8766e, InterfaceC2492b.a aVar, boolean z10) {
        super(interfaceC2503m, c8766e, h.f51914c1.b(), t.f63152i, aVar, g0.f1784a);
        f1(true);
        h1(z10);
        Y0(false);
    }
}
