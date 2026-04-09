package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
class j implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Iterator f51997a;

    public j(Iterator it) {
        this.f51997a = it;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f51997a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f51997a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f51997a.remove();
    }
}
