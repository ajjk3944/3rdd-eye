package Ah;

import Bh.InterfaceC2495e;
import Bh.l0;
import Zg.AbstractC3689v;
import Zg.U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;
import pi.w0;
import si.AbstractC7984d;

/* loaded from: classes4.dex */
public abstract class y {
    public static final w0 a(InterfaceC2495e from, InterfaceC2495e to) {
        AbstractC6492s.i(from, "from");
        AbstractC6492s.i(to, "to");
        from.w().size();
        to.w().size();
        w0.a aVar = w0.f58185c;
        List listW = from.w();
        AbstractC6492s.h(listW, "getDeclaredTypeParameters(...)");
        List list = listW;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((l0) it.next()).k());
        }
        List listW2 = to.w();
        AbstractC6492s.h(listW2, "getDeclaredTypeParameters(...)");
        List list2 = listW2;
        ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            AbstractC7346d0 abstractC7346d0U = ((l0) it2.next()).u();
            AbstractC6492s.h(abstractC7346d0U, "getDefaultType(...)");
            arrayList2.add(AbstractC7984d.d(abstractC7346d0U));
        }
        return w0.a.e(aVar, U.r(AbstractC3689v.s1(arrayList, arrayList2)), false, 2, null);
    }
}
