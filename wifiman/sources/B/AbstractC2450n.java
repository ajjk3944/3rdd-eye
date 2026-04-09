package B;

import B.E;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import sh.C7974i;

/* renamed from: B.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2450n {
    public static final List a(InterfaceC2455t interfaceC2455t, E e10, C2446j c2446j) {
        if (!c2446j.d() && e10.isEmpty()) {
            return AbstractC3689v.l();
        }
        ArrayList arrayList = new ArrayList();
        C7974i c7974i = c2446j.d() ? new C7974i(c2446j.c(), Math.min(c2446j.b(), interfaceC2455t.a() - 1)) : C7974i.f61630e.a();
        int size = e10.size();
        for (int i10 = 0; i10 < size; i10++) {
            E.a aVar = (E.a) e10.get(i10);
            int iA = u.a(interfaceC2455t, aVar.getKey(), aVar.getIndex());
            int i11 = c7974i.i();
            if ((iA > c7974i.j() || i11 > iA) && iA >= 0 && iA < interfaceC2455t.a()) {
                arrayList.add(Integer.valueOf(iA));
            }
        }
        int i12 = c7974i.i();
        int iJ = c7974i.j();
        if (i12 <= iJ) {
            while (true) {
                arrayList.add(Integer.valueOf(i12));
                if (i12 == iJ) {
                    break;
                }
                i12++;
            }
        }
        return arrayList;
    }
}
