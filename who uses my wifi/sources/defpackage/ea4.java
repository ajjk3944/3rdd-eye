package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ea4 extends aa4 {
    public static final /* synthetic */ int b = 0;

    static {
        da4.a(Collections.EMPTY_MAP);
    }

    public static cf1 a(int i) {
        return new cf1(i);
    }

    @Override // defpackage.ga4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map d() {
        Map map = this.a;
        LinkedHashMap linkedHashMapF = qb1.F(map.size());
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMapF.put(entry.getKey(), ((ga4) entry.getValue()).d());
        }
        return Collections.unmodifiableMap(linkedHashMapF);
    }
}
