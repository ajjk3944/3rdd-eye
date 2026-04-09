package Rb;

import Zg.AbstractC3689v;
import gg.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: Rb.a$a, reason: collision with other inner class name */
    public static final class C0701a {
        public static void a(a aVar, long j10, int i10, long j11) {
            List listL1 = AbstractC3689v.l1(aVar.getAll());
            Iterator it = listL1.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (((c) it.next()).d() == j10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 == -1) {
                Z7.b.e("Host " + j10 + " not found in the DB", null, null, 6, null);
                return;
            }
            listL1.add(i10, (c) listL1.remove(i11));
            List list = listL1;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    AbstractC3689v.v();
                }
                c cVarB = (c) obj;
                if (cVarB.d() == j10) {
                    cVarB = c.b(cVarB, 0L, null, i10, j11, 3, null);
                } else if (cVarB.e() != i12) {
                    cVarB = c.b(cVarB, 0L, null, i12, 0L, 11, null);
                }
                arrayList.add(cVarB);
                i12 = i13;
            }
            c[] cVarArr = (c[]) arrayList.toArray(new c[0]);
            aVar.c((c[]) Arrays.copyOf(cVarArr, cVarArr.length));
        }
    }

    i a();

    int b(long... jArr);

    void c(c... cVarArr);

    void d(long j10, int i10, long j11);

    void e(c... cVarArr);

    List getAll();
}
