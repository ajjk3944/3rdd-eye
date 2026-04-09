package g4;

import ar.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import lf.t1;
import lq.b0;
import mq.p;

/* loaded from: classes.dex */
public final class k extends rq.j implements o {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ f4.e f9330x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ h4.b f9331y;

    @Override // ar.o
    public final Object h(Object obj, Object obj2, Object obj3) {
        k kVar = new k(3, (pq.c) obj3);
        kVar.f9330x = (f4.e) obj;
        kVar.f9331y = (h4.b) obj2;
        return kVar.q(b0.f15562a);
    }

    @Override // rq.a
    public final Object q(Object obj) {
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        t1.G(obj);
        f4.e eVar = this.f9330x;
        h4.b bVar = this.f9331y;
        Set setKeySet = bVar.a().keySet();
        ArrayList arrayList = new ArrayList(p.a0(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((h4.e) it.next()).f9895a);
        }
        Map<String, ?> all = eVar.f8441a.getAll();
        br.l.d(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = eVar.f8442b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mq.b0.P(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = mq.o.U0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        h4.b bVar2 = new h4.b(mq.b0.Y(bVar.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                br.l.e(str, "name");
                bVar2.e(new h4.e(str), value2);
            } else if (value2 instanceof Float) {
                br.l.e(str, "name");
                bVar2.e(new h4.e(str), value2);
            } else if (value2 instanceof Integer) {
                br.l.e(str, "name");
                bVar2.e(new h4.e(str), value2);
            } else if (value2 instanceof Long) {
                br.l.e(str, "name");
                bVar2.e(new h4.e(str), value2);
            } else if (value2 instanceof String) {
                br.l.e(str, "name");
                bVar2.e(new h4.e(str), value2);
            } else if (value2 instanceof Set) {
                bVar2.e(t1.F(str), (Set) value2);
            }
        }
        return new h4.b(mq.b0.Y(bVar2.a()), true);
    }
}
