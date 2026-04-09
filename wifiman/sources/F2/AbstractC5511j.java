package f2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: f2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5511j {
    public static final List a(Map map, InterfaceC6835l isArgumentMissing) {
        AbstractC6492s.i(map, "<this>");
        AbstractC6492s.i(isArgumentMissing, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C5509h c5509h = (C5509h) entry.getValue();
            Boolean boolValueOf = c5509h != null ? Boolean.valueOf(c5509h.d()) : null;
            AbstractC6492s.f(boolValueOf);
            if (!boolValueOf.booleanValue() && !c5509h.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) isArgumentMissing.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
