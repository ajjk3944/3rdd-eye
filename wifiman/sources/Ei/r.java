package Ei;

import Zg.AbstractC3670b;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class r extends AbstractC3670b implements Ci.b {

    /* renamed from: a, reason: collision with root package name */
    private final d f4796a;

    public r(d map) {
        AbstractC6492s.i(map, "map");
        this.f4796a = map;
    }

    @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f4796a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new s(this.f4796a.t());
    }

    @Override // Zg.AbstractC3670b
    public int j() {
        return this.f4796a.size();
    }
}
