package Fi;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public final class h implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final i f6710a;

    public h(d map) {
        AbstractC6492s.i(map, "map");
        this.f6710a = new i(map.g(), map);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6710a.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        this.f6710a.next();
        return this.f6710a.h();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f6710a.remove();
    }
}
