package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3989z implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Iterator f30969a;

    public C3989z(Iterator it) {
        this.f30969a = it;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f30969a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f30969a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f30969a.remove();
    }
}
