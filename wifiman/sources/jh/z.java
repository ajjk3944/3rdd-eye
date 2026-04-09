package Jh;

import Bh.InterfaceC2491a;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Bh.s0;
import Jh.U;
import Sh.s;
import Zg.AbstractC3689v;
import bi.j;
import fi.AbstractC5833e;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import si.AbstractC7984d;

/* loaded from: classes4.dex */
public final class z implements bi.j {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10219a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(InterfaceC2515z interfaceC2515z) {
            if (interfaceC2515z.i().size() != 1) {
                return false;
            }
            InterfaceC2503m interfaceC2503mB = interfaceC2515z.b();
            InterfaceC2495e interfaceC2495e = interfaceC2503mB instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2503mB : null;
            if (interfaceC2495e == null) {
                return false;
            }
            List listI = interfaceC2515z.i();
            AbstractC6492s.h(listI, "getValueParameters(...)");
            InterfaceC2498h interfaceC2498hC = ((s0) AbstractC3689v.R0(listI)).getType().N0().c();
            InterfaceC2495e interfaceC2495e2 = interfaceC2498hC instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2498hC : null;
            return interfaceC2495e2 != null && kotlin.reflect.jvm.internal.impl.builtins.i.r0(interfaceC2495e) && AbstractC6492s.d(AbstractC5833e.o(interfaceC2495e), AbstractC5833e.o(interfaceC2495e2));
        }

        private final Sh.s c(InterfaceC2515z interfaceC2515z, s0 s0Var) {
            if (Sh.C.e(interfaceC2515z) || b(interfaceC2515z)) {
                pi.S type = s0Var.getType();
                AbstractC6492s.h(type, "getType(...)");
                return Sh.C.g(AbstractC7984d.B(type));
            }
            pi.S type2 = s0Var.getType();
            AbstractC6492s.h(type2, "getType(...)");
            return Sh.C.g(type2);
        }

        public final boolean a(InterfaceC2491a superDescriptor, InterfaceC2491a subDescriptor) {
            AbstractC6492s.i(superDescriptor, "superDescriptor");
            AbstractC6492s.i(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof Lh.e) && (superDescriptor instanceof InterfaceC2515z)) {
                Lh.e eVar = (Lh.e) subDescriptor;
                eVar.i().size();
                InterfaceC2515z interfaceC2515z = (InterfaceC2515z) superDescriptor;
                interfaceC2515z.i().size();
                List listI = eVar.a().i();
                AbstractC6492s.h(listI, "getValueParameters(...)");
                List listI2 = interfaceC2515z.a().i();
                AbstractC6492s.h(listI2, "getValueParameters(...)");
                for (Yg.s sVar : AbstractC3689v.s1(listI, listI2)) {
                    s0 s0Var = (s0) sVar.a();
                    s0 s0Var2 = (s0) sVar.c();
                    AbstractC6492s.f(s0Var);
                    boolean z10 = c((InterfaceC2515z) subDescriptor, s0Var) instanceof s.d;
                    AbstractC6492s.f(s0Var2);
                    if (z10 != (c(interfaceC2515z, s0Var2) instanceof s.d)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private a() {
        }
    }

    private final boolean c(InterfaceC2491a interfaceC2491a, InterfaceC2491a interfaceC2491a2, InterfaceC2495e interfaceC2495e) {
        if ((interfaceC2491a instanceof InterfaceC2492b) && (interfaceC2491a2 instanceof InterfaceC2515z) && !kotlin.reflect.jvm.internal.impl.builtins.i.g0(interfaceC2491a2)) {
            C3115i c3115i = C3115i.f10188o;
            InterfaceC2515z interfaceC2515z = (InterfaceC2515z) interfaceC2491a2;
            Zh.f name = interfaceC2515z.getName();
            AbstractC6492s.h(name, "getName(...)");
            if (!c3115i.n(name)) {
                U.a aVar = U.f10160a;
                Zh.f name2 = interfaceC2515z.getName();
                AbstractC6492s.h(name2, "getName(...)");
                if (!aVar.k(name2)) {
                    return false;
                }
            }
            InterfaceC2492b interfaceC2492bJ = T.j((InterfaceC2492b) interfaceC2491a);
            boolean z10 = interfaceC2491a instanceof InterfaceC2515z;
            InterfaceC2515z interfaceC2515z2 = z10 ? (InterfaceC2515z) interfaceC2491a : null;
            if (!(interfaceC2515z2 != null && interfaceC2515z.v0() == interfaceC2515z2.v0()) && (interfaceC2492bJ == null || !interfaceC2515z.v0())) {
                return true;
            }
            if ((interfaceC2495e instanceof Lh.c) && interfaceC2515z.a0() == null && interfaceC2492bJ != null && !T.l(interfaceC2495e, interfaceC2492bJ)) {
                if ((interfaceC2492bJ instanceof InterfaceC2515z) && z10 && C3115i.l((InterfaceC2515z) interfaceC2492bJ) != null) {
                    String strC = Sh.C.c(interfaceC2515z, false, false, 2, null);
                    InterfaceC2515z interfaceC2515zA = ((InterfaceC2515z) interfaceC2491a).a();
                    AbstractC6492s.h(interfaceC2515zA, "getOriginal(...)");
                    if (AbstractC6492s.d(strC, Sh.C.c(interfaceC2515zA, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // bi.j
    public j.a a() {
        return j.a.CONFLICTS_ONLY;
    }

    @Override // bi.j
    public j.b b(InterfaceC2491a superDescriptor, InterfaceC2491a subDescriptor, InterfaceC2495e interfaceC2495e) {
        AbstractC6492s.i(superDescriptor, "superDescriptor");
        AbstractC6492s.i(subDescriptor, "subDescriptor");
        if (!c(superDescriptor, subDescriptor, interfaceC2495e) && !f10219a.a(superDescriptor, subDescriptor)) {
            return j.b.UNKNOWN;
        }
        return j.b.INCOMPATIBLE;
    }
}
