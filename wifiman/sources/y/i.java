package Y;

import java.util.Iterator;
import java.util.Map;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
public final class i implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final g f24497a;

    public i(f fVar) {
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new y(this);
        }
        this.f24497a = new g(fVar, uVarArr);
    }

    @Override // java.util.Iterator
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        return (Map.Entry) this.f24497a.next();
    }

    public final void e(Object obj, Object obj2) {
        this.f24497a.p(obj, obj2);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24497a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f24497a.remove();
    }
}
