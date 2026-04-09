package L8;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import ec.AbstractC5452a;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import s9.d;

/* loaded from: classes3.dex */
public abstract class i {
    public static final s9.d a(AbstractC5452a abstractC5452a) {
        List listL;
        AbstractC6492s.i(abstractC5452a, "<this>");
        if (abstractC5452a instanceof AbstractC5452a.b) {
            return new d.c(((AbstractC5452a.b) abstractC5452a).b());
        }
        if (!(abstractC5452a instanceof AbstractC5452a.C1741a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC5452a.C1741a c1741a = (AbstractC5452a.C1741a) abstractC5452a;
        int iC = c1741a.c();
        Object[] objArrB = c1741a.b();
        if (objArrB == null || (listL = AbstractC3682n.d1(objArrB)) == null) {
            listL = AbstractC3689v.l();
        }
        return new d.b(iC, listL);
    }
}
