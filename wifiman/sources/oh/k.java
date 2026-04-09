package Oh;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Yg.s;
import Zg.AbstractC3689v;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.renderer.n;
import kotlin.reflect.jvm.internal.impl.renderer.w;
import kotlin.text.t;
import pi.A0;
import pi.AbstractC7346d0;
import pi.B0;
import pi.I;
import pi.InterfaceC7344c0;
import pi.S;
import pi.r0;
import si.AbstractC7984d;

/* loaded from: classes4.dex */
public final class k extends I implements InterfaceC7344c0 {
    private k(AbstractC7346d0 abstractC7346d0, AbstractC7346d0 abstractC7346d02, boolean z10) {
        super(abstractC7346d0, abstractC7346d02);
        if (z10) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.types.checker.e.f52144a.c(abstractC7346d0, abstractC7346d02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence b1(String it) {
        AbstractC6492s.i(it, "it");
        return "(raw) " + it;
    }

    private static final boolean c1(String str, String str2) {
        return AbstractC6492s.d(str, t.G0(str2, "out ")) || AbstractC6492s.d(str2, "*");
    }

    private static final List d1(n nVar, S s10) {
        List listL0 = s10.L0();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listL0, 10));
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            arrayList.add(nVar.V((B0) it.next()));
        }
        return arrayList;
    }

    private static final String e1(String str, String str2) {
        if (!t.V(str, '<', false, 2, null)) {
            return str;
        }
        return t.k1(str, '<', null, 2, null) + '<' + str2 + '>' + t.g1(str, '>', null, 2, null);
    }

    @Override // pi.I
    public AbstractC7346d0 U0() {
        return V0();
    }

    @Override // pi.I
    public String X0(n renderer, w options) {
        AbstractC6492s.i(renderer, "renderer");
        AbstractC6492s.i(options, "options");
        String strU = renderer.U(V0());
        String strU2 = renderer.U(W0());
        if (options.p()) {
            return "raw (" + strU + ".." + strU2 + ')';
        }
        if (W0().L0().isEmpty()) {
            return renderer.R(strU, strU2, AbstractC7984d.n(this));
        }
        List listD1 = d1(renderer, V0());
        List listD12 = d1(renderer, W0());
        List list = listD1;
        String strZ0 = AbstractC3689v.z0(list, ", ", null, null, 0, null, j.f17860a, 30, null);
        List<s> listS1 = AbstractC3689v.s1(list, listD12);
        if ((listS1 instanceof Collection) && listS1.isEmpty()) {
            strU2 = e1(strU2, strZ0);
        } else {
            for (s sVar : listS1) {
                if (!c1((String) sVar.h(), (String) sVar.j())) {
                    break;
                }
            }
            strU2 = e1(strU2, strZ0);
        }
        String strE1 = e1(strU, strZ0);
        return AbstractC6492s.d(strE1, strU2) ? strE1 : renderer.R(strE1, strU2, AbstractC7984d.n(this));
    }

    @Override // pi.M0
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public k R0(boolean z10) {
        return new k(V0().R0(z10), W0().R0(z10));
    }

    @Override // pi.M0
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public I X0(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(V0());
        AbstractC6492s.g(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        S sA2 = kotlinTypeRefiner.a(W0());
        AbstractC6492s.g(sA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new k((AbstractC7346d0) sA, (AbstractC7346d0) sA2, true);
    }

    @Override // pi.M0
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public k T0(r0 newAttributes) {
        AbstractC6492s.i(newAttributes, "newAttributes");
        return new k(V0().T0(newAttributes), W0().T0(newAttributes));
    }

    @Override // pi.I, pi.S
    public InterfaceC6164k r() {
        InterfaceC2498h interfaceC2498hC = N0().c();
        A0 a02 = null;
        byte b10 = 0;
        InterfaceC2495e interfaceC2495e = interfaceC2498hC instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2498hC : null;
        if (interfaceC2495e != null) {
            InterfaceC6164k interfaceC6164kW0 = interfaceC2495e.w0(new i(a02, 1, b10 == true ? 1 : 0));
            AbstractC6492s.h(interfaceC6164kW0, "getMemberScope(...)");
            return interfaceC6164kW0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + N0().c()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(AbstractC7346d0 lowerBound, AbstractC7346d0 upperBound) {
        this(lowerBound, upperBound, false);
        AbstractC6492s.i(lowerBound, "lowerBound");
        AbstractC6492s.i(upperBound, "upperBound");
    }
}
