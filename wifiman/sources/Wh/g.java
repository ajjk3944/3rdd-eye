package Wh;

import Uh.q;
import Uh.t;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final List f23969a;

    public g(t typeTable) {
        AbstractC6492s.i(typeTable, "typeTable");
        List listF0 = typeTable.f0();
        if (typeTable.q0()) {
            int iS = typeTable.S();
            List listF02 = typeTable.f0();
            AbstractC6492s.h(listF02, "getTypeList(...)");
            List list = listF02;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC3689v.v();
                }
                q qVarT = (q) obj;
                if (i10 >= iS) {
                    qVarT = qVarT.l().N(true).a();
                }
                arrayList.add(qVarT);
                i10 = i11;
            }
            listF0 = arrayList;
        }
        AbstractC6492s.h(listF0, "run(...)");
        this.f23969a = listF0;
    }

    public final q a(int i10) {
        return (q) this.f23969a.get(i10);
    }
}
