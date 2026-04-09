package kotlin.reflect.jvm.internal.impl.types.error;

import Bh.AbstractC2509t;
import Bh.D;
import Bh.EnumC2496f;
import Bh.G;
import Bh.InterfaceC2495e;
import Bh.g0;
import Dh.C2603i;
import Dh.C2605k;
import Zg.AbstractC3689v;
import Zg.d0;
import ii.InterfaceC6164k;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import pi.E0;
import pi.G0;

/* loaded from: classes4.dex */
public final class a extends C2605k {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(Zh.f name) {
        AbstractC6492s.i(name, "name");
        l lVar = l.f52198a;
        G gI = lVar.i();
        D d10 = D.OPEN;
        EnumC2496f enumC2496f = EnumC2496f.CLASS;
        List listL = AbstractC3689v.l();
        g0 g0Var = g0.f1784a;
        super(gI, name, d10, enumC2496f, listL, g0Var, false, oi.f.f55716e);
        C2603i c2603iN1 = C2603i.n1(this, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b(), true, g0Var);
        c2603iN1.q1(AbstractC3689v.l(), AbstractC2509t.f1795d);
        AbstractC6492s.h(c2603iN1, "apply(...)");
        InterfaceC6164k interfaceC6164kB = l.b(h.SCOPE_FOR_ERROR_CLASS, c2603iN1.getName().toString(), "");
        k kVar = k.ERROR_CLASS;
        c2603iN1.g1(new i(lVar.e(kVar, new String[0]), interfaceC6164kB, kVar, null, false, new String[0], 24, null));
        K0(interfaceC6164kB, d0.c(c2603iN1), c2603iN1);
    }

    @Override // Dh.AbstractC2595a, Bh.i0
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public InterfaceC2495e c(G0 substitutor) {
        AbstractC6492s.i(substitutor, "substitutor");
        return this;
    }

    @Override // Dh.AbstractC2595a, Dh.z
    public InterfaceC6164k I(E0 typeSubstitution, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(typeSubstitution, "typeSubstitution");
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        return l.b(h.SCOPE_FOR_ERROR_CLASS, getName().toString(), typeSubstitution.toString());
    }

    @Override // Dh.C2605k
    public String toString() {
        String strB = getName().b();
        AbstractC6492s.h(strB, "asString(...)");
        return strB;
    }
}
