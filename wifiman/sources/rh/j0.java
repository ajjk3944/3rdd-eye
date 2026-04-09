package Rh;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f19932a;

    public j0(Map map) {
        AbstractC6492s.i(map, "map");
        this.f19932a = map;
    }

    public final j0 a() {
        Map map = this.f19932a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Zg.U.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), C3480h.c((C3480h) entry.getValue(), null, null, false, true, 7, null));
        }
        return new j0(linkedHashMap);
    }

    public final Map b() {
        return this.f19932a;
    }
}
