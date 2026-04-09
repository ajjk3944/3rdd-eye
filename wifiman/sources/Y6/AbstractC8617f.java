package y6;

import C6.a;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import x6.InterfaceC8423a;

/* renamed from: y6.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8617f {
    public static final List a(Map map, float f10) {
        InterfaceC8423a interfaceC8423aA;
        AbstractC6492s.i(map, "<this>");
        Collection collectionValues = map.values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            List list = (List) it.next();
            a.C0081a c0081a = (a.C0081a) AbstractC3689v.s0(list);
            List list2 = AbstractC6492s.b((c0081a == null || (interfaceC8423aA = c0081a.a()) == null) ? null : Float.valueOf(interfaceC8423aA.a()), f10) ? list : null;
            if (list2 != null) {
                arrayList.add(list2);
            }
        }
        List listY = AbstractC3689v.y(arrayList);
        if (listY.isEmpty()) {
            return null;
        }
        return listY;
    }
}
