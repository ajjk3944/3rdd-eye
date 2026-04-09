package Ei;

import Zg.AbstractC3679k;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class p extends AbstractC3679k implements Ci.e {

    /* renamed from: b, reason: collision with root package name */
    private final d f4795b;

    public p(d map) {
        AbstractC6492s.i(map, "map");
        this.f4795b = map;
    }

    @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f4795b.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new q(this.f4795b.t());
    }

    @Override // Zg.AbstractC3670b
    public int j() {
        return this.f4795b.size();
    }
}
