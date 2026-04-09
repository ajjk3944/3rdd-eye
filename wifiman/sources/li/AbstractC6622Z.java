package li;

import Bh.q0;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import ri.InterfaceC7619j;

/* renamed from: li.Z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6622Z {
    public static final q0 a(Uh.c cVar, Wh.c nameResolver, Wh.g typeTable, InterfaceC6835l typeDeserializer, InterfaceC6835l typeOfPublicProperty) {
        InterfaceC7619j interfaceC7619j;
        List listB2;
        AbstractC6492s.i(cVar, "<this>");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(typeTable, "typeTable");
        AbstractC6492s.i(typeDeserializer, "typeDeserializer");
        AbstractC6492s.i(typeOfPublicProperty, "typeOfPublicProperty");
        if (cVar.V1() <= 0) {
            if (!cVar.x2()) {
                return null;
            }
            Zh.f fVarB = AbstractC6609L.b(nameResolver, cVar.S1());
            Uh.q qVarI = Wh.f.i(cVar, typeTable);
            if ((qVarI != null && (interfaceC7619j = (InterfaceC7619j) typeDeserializer.invoke(qVarI)) != null) || (interfaceC7619j = (InterfaceC7619j) typeOfPublicProperty.invoke(fVarB)) != null) {
                return new Bh.A(fVarB, interfaceC7619j);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + AbstractC6609L.b(nameResolver, cVar.O1()) + " with property " + fVarB).toString());
        }
        List listW1 = cVar.W1();
        AbstractC6492s.h(listW1, "getMultiFieldValueClassUnderlyingNameList(...)");
        List<Integer> list = listW1;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        for (Integer num : list) {
            AbstractC6492s.f(num);
            arrayList.add(AbstractC6609L.b(nameResolver, num.intValue()));
        }
        Yg.s sVarA = Yg.z.a(Integer.valueOf(cVar.Z1()), Integer.valueOf(cVar.Y1()));
        if (AbstractC6492s.d(sVarA, Yg.z.a(Integer.valueOf(arrayList.size()), 0))) {
            List listA2 = cVar.a2();
            AbstractC6492s.h(listA2, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            List<Integer> list2 = listA2;
            listB2 = new ArrayList(AbstractC3689v.w(list2, 10));
            for (Integer num2 : list2) {
                AbstractC6492s.f(num2);
                listB2.add(typeTable.a(num2.intValue()));
            }
        } else {
            if (!AbstractC6492s.d(sVarA, Yg.z.a(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + AbstractC6609L.b(nameResolver, cVar.O1()) + " has illegal multi-field value class representation").toString());
            }
            listB2 = cVar.b2();
        }
        AbstractC6492s.f(listB2);
        List list3 = listB2;
        ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(typeDeserializer.invoke(it.next()));
        }
        return new Bh.H(AbstractC3689v.s1(arrayList, arrayList2));
    }
}
