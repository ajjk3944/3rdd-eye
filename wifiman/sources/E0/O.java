package E0;

import C0.AbstractC2521a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import l0.AbstractC6532h;
import l0.C6531g;

/* loaded from: classes.dex */
public final class O extends AbstractC2619a {
    public O(InterfaceC2621b interfaceC2621b) {
        super(interfaceC2621b, null);
    }

    @Override // E0.AbstractC2619a
    protected long d(AbstractC2624c0 abstractC2624c0, long j10) {
        Q qC2 = abstractC2624c0.C2();
        AbstractC6492s.f(qC2);
        long jR1 = qC2.r1();
        return C6531g.r(AbstractC6532h.a(Y0.n.h(jR1), Y0.n.i(jR1)), j10);
    }

    @Override // E0.AbstractC2619a
    protected Map e(AbstractC2624c0 abstractC2624c0) {
        Q qC2 = abstractC2624c0.C2();
        AbstractC6492s.f(qC2);
        return qC2.h1().p();
    }

    @Override // E0.AbstractC2619a
    protected int i(AbstractC2624c0 abstractC2624c0, AbstractC2521a abstractC2521a) {
        Q qC2 = abstractC2624c0.C2();
        AbstractC6492s.f(qC2);
        return qC2.X(abstractC2521a);
    }
}
