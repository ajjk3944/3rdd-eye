package A;

import Zg.AbstractC3689v;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i {
    public static final t a(List list, u uVar, List list2, int i10, int i11, int i12) {
        int index = ((t) AbstractC3689v.q0(list)).getIndex();
        int size = list2.size();
        int iIntValue = -1;
        int iIntValue2 = -1;
        int i13 = 0;
        while (i13 < size && ((Number) list2.get(i13)).intValue() <= index) {
            iIntValue2 = ((Number) list2.get(i13)).intValue();
            i13++;
            iIntValue = ((Number) ((i13 < 0 || i13 > AbstractC3689v.n(list2)) ? -1 : list2.get(i13))).intValue();
        }
        int size2 = list.size();
        int iB = Integer.MIN_VALUE;
        int iB2 = Integer.MIN_VALUE;
        int i14 = -1;
        for (int i15 = 0; i15 < size2; i15++) {
            t tVar = (t) list.get(i15);
            if (tVar.getIndex() == iIntValue2) {
                iB = tVar.b();
                i14 = i15;
            } else if (tVar.getIndex() == iIntValue) {
                iB2 = tVar.b();
            }
        }
        if (iIntValue2 == -1) {
            return null;
        }
        t tVarE = u.e(uVar, iIntValue2, 0L, 2, null);
        tVarE.e(true);
        int iMax = iB != Integer.MIN_VALUE ? Math.max(-i10, iB) : -i10;
        if (iB2 != Integer.MIN_VALUE) {
            iMax = Math.min(iMax, iB2 - tVarE.a());
        }
        tVarE.s(iMax, i11, i12);
        if (i14 != -1) {
            list.set(i14, tVarE);
        } else {
            list.add(0, tVarE);
        }
        return tVarE;
    }
}
