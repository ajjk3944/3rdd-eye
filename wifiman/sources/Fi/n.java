package Fi;

import Zg.AbstractC3679k;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class n extends AbstractC3679k implements Ci.e {

    /* renamed from: b, reason: collision with root package name */
    private final c f6721b;

    public n(c map) {
        AbstractC6492s.i(map, "map");
        this.f6721b = map;
    }

    @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f6721b.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new o(this.f6721b);
    }

    @Override // Zg.AbstractC3670b
    public int j() {
        return this.f6721b.size();
    }
}
