package Ha;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import th.d;

/* loaded from: classes3.dex */
public abstract class a {
    public static final List a(d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        List<d> listN = dVar.n();
        ArrayList arrayList = new ArrayList();
        for (d dVar2 : listN) {
            List listA = a(dVar2);
            if (listA.isEmpty()) {
                listA = AbstractC3689v.e(dVar2);
            }
            AbstractC3689v.C(arrayList, listA);
        }
        return arrayList;
    }
}
