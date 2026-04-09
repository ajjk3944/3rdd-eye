package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class iu0 extends ju0 {
    public static List F(hu0 hu0Var) {
        Iterator it = hu0Var.iterator();
        if (!it.hasNext()) {
            return ns.f;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return zt0.o(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
