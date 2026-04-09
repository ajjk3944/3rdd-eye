package Fi;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public final class k implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final i f6718a;

    public k(d map) {
        AbstractC6492s.i(map, "map");
        this.f6718a = new i(map.g(), map);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6718a.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f6718a.next().e();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f6718a.remove();
    }
}
