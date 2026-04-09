package j$.time.format;

import j$.util.stream.z6;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Map f26164a;

    public void b(z6 z6Var) {
        ((EnumMap) this.f26164a).put((EnumMap) z6Var, (z6) 1);
    }

    public r(int i4, Map map) {
        switch (i4) {
            case 1:
                this.f26164a = map;
                break;
            default:
                this.f26164a = map;
                HashMap map2 = new HashMap();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    HashMap map3 = new HashMap();
                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                        String str = (String) entry2.getValue();
                        String str2 = (String) entry2.getValue();
                        Long l10 = (Long) entry2.getKey();
                        q qVar = b.f26127b;
                        map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l10));
                    }
                    ArrayList arrayList2 = new ArrayList(map3.values());
                    Collections.sort(arrayList2, b.f26127b);
                    map2.put((v) entry.getKey(), arrayList2);
                    arrayList.addAll(arrayList2);
                    map2.put(null, arrayList);
                }
                Collections.sort(arrayList, b.f26127b);
                break;
        }
    }

    public String a(long j, v vVar) {
        Map map = (Map) this.f26164a.get(vVar);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }
}
