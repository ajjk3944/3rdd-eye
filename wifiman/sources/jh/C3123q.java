package Jh;

import Bh.InterfaceC2491a;
import Bh.InterfaceC2495e;
import Bh.b0;
import Bh.f0;
import Bh.s0;
import Zg.AbstractC3689v;
import bi.j;
import bi.o;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import pi.A0;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* renamed from: Jh.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3123q implements bi.j {

    /* renamed from: Jh.q$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10199a;

        static {
            int[] iArr = new int[o.i.a.values().length];
            try {
                iArr[o.i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f10199a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pi.S d(s0 s0Var) {
        return s0Var.getType();
    }

    @Override // bi.j
    public j.a a() {
        return j.a.SUCCESS_ONLY;
    }

    @Override // bi.j
    public j.b b(InterfaceC2491a superDescriptor, InterfaceC2491a subDescriptor, InterfaceC2495e interfaceC2495e) {
        AbstractC6492s.i(superDescriptor, "superDescriptor");
        AbstractC6492s.i(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof Lh.e) {
            Lh.e eVar = (Lh.e) subDescriptor;
            List typeParameters = eVar.getTypeParameters();
            AbstractC6492s.h(typeParameters, "getTypeParameters(...)");
            if (typeParameters.isEmpty()) {
                o.i iVarW = bi.o.w(superDescriptor, subDescriptor);
                A0 a02 = null;
                byte b10 = 0;
                if ((iVarW != null ? iVarW.c() : null) != null) {
                    return j.b.UNKNOWN;
                }
                List listI = eVar.i();
                AbstractC6492s.h(listI, "getValueParameters(...)");
                InterfaceC8780j interfaceC8780jN = AbstractC8783m.N(AbstractC3689v.d0(listI), C3122p.f10198a);
                pi.S returnType = eVar.getReturnType();
                AbstractC6492s.f(returnType);
                InterfaceC8780j interfaceC8780jR = AbstractC8783m.R(interfaceC8780jN, returnType);
                b0 b0VarK0 = eVar.k0();
                for (pi.S s10 : AbstractC8783m.Q(interfaceC8780jR, AbstractC3689v.p(b0VarK0 != null ? b0VarK0.getType() : null))) {
                    if (!s10.L0().isEmpty() && !(s10.Q0() instanceof Oh.k)) {
                        return j.b.UNKNOWN;
                    }
                }
                InterfaceC2491a interfaceC2491aA = (InterfaceC2491a) superDescriptor.c(new Oh.i(a02, 1, b10 == true ? 1 : 0).c());
                if (interfaceC2491aA == null) {
                    return j.b.UNKNOWN;
                }
                if (interfaceC2491aA instanceof f0) {
                    f0 f0Var = (f0) interfaceC2491aA;
                    List typeParameters2 = f0Var.getTypeParameters();
                    AbstractC6492s.h(typeParameters2, "getTypeParameters(...)");
                    if (!typeParameters2.isEmpty()) {
                        interfaceC2491aA = f0Var.v().o(AbstractC3689v.l()).a();
                        AbstractC6492s.f(interfaceC2491aA);
                    }
                }
                o.i.a aVarC = bi.o.f33360f.F(interfaceC2491aA, subDescriptor, false).c();
                AbstractC6492s.h(aVarC, "getResult(...)");
                return a.f10199a[aVarC.ordinal()] == 1 ? j.b.OVERRIDABLE : j.b.UNKNOWN;
            }
        }
        return j.b.UNKNOWN;
    }
}
