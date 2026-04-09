package Fi;

import Zg.AbstractC3670b;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class q extends AbstractC3670b implements Ci.b {

    /* renamed from: a, reason: collision with root package name */
    private final c f6726a;

    public q(c map) {
        AbstractC6492s.i(map, "map");
        this.f6726a = map;
    }

    @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f6726a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new r(this.f6726a);
    }

    @Override // Zg.AbstractC3670b
    public int j() {
        return this.f6726a.size();
    }
}
