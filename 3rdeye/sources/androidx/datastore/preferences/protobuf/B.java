package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField.java */
/* loaded from: classes.dex */
public final class B extends C {

    /* compiled from: LazyField.java */
    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: b, reason: collision with root package name */
        public Map.Entry<K, B> f15537b;

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f15537b.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            B value = this.f15537b.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof P)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            B value = this.f15537b.getValue();
            P p10 = value.f15539a;
            value.f15540b = null;
            value.f15539a = (P) obj;
            return p10;
        }
    }

    /* compiled from: LazyField.java */
    public static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Object>> f15538b;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f15538b = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f15538b.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f15538b.next();
            if (!(next.getValue() instanceof B)) {
                return next;
            }
            a aVar = new a();
            aVar.f15537b = next;
            return aVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f15538b.remove();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
