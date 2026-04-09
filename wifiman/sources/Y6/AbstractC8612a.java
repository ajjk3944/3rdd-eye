package y6;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* renamed from: y6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8612a {
    public static final Object a(List list, int i10) {
        AbstractC6492s.i(list, "<this>");
        if (list.isEmpty()) {
            throw new IllegalStateException("Cannot get repeated item from empty collection.");
        }
        return list.get(i10 % AbstractC7978m.d(list.size(), 1));
    }

    public static final void b(List list, Collection other) {
        AbstractC6492s.i(list, "<this>");
        AbstractC6492s.i(other, "other");
        list.clear();
        list.addAll(other);
    }

    public static final void c(Map map, Map other) {
        AbstractC6492s.i(map, "<this>");
        AbstractC6492s.i(other, "other");
        map.clear();
        for (Map.Entry entry : other.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }
}
