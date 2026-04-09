package Fi;

import Zg.AbstractC3679k;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class l extends AbstractC3679k implements Ci.e {

    /* renamed from: b, reason: collision with root package name */
    private final c f6719b;

    public l(c map) {
        AbstractC6492s.i(map, "map");
        this.f6719b = map;
    }

    @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return v((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new m(this.f6719b);
    }

    @Override // Zg.AbstractC3670b
    public int j() {
        return this.f6719b.size();
    }

    public boolean v(Map.Entry element) {
        AbstractC6492s.i(element, "element");
        return Hi.e.f7981a.a(this.f6719b, element);
    }
}
