package Fi;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public final class f implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final i f6708a;

    public f(d map) {
        AbstractC6492s.i(map, "map");
        this.f6708a = new i(map.g(), map);
    }

    @Override // java.util.Iterator
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        return new b(this.f6708a.g().h(), this.f6708a.h(), this.f6708a.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6708a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f6708a.remove();
    }
}
