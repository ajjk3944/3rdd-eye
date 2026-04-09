package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.n0;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class ImmutableMultimap<K, V> extends h implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: d, reason: collision with root package name */
    public final transient ImmutableMap f11802d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f11803e;

    public static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;

        @Weak
        final ImmutableMultimap<K, V> multimap;

        public EntryCollection(ImmutableMultimap immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.multimap.e(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* renamed from: j */
        public v0 iterator() {
            return this.multimap.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.multimap.size();
        }
    }

    public class a extends v0 {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f11804a;

        /* renamed from: b, reason: collision with root package name */
        public Object f11805b = null;

        /* renamed from: c, reason: collision with root package name */
        public Iterator f11806c = Iterators.e();

        public a() {
            this.f11804a = ImmutableMultimap.this.f11802d.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!this.f11806c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f11804a.next();
                this.f11805b = entry.getKey();
                this.f11806c = ((ImmutableCollection) entry.getValue()).iterator();
            }
            Object obj = this.f11805b;
            Objects.requireNonNull(obj);
            return Maps.e(obj, this.f11806c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11806c.hasNext() || this.f11804a.hasNext();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final n0.b f11808a = n0.a(ImmutableMultimap.class, "map");

        /* renamed from: b, reason: collision with root package name */
        public static final n0.b f11809b = n0.a(ImmutableMultimap.class, "size");
    }

    @Override // com.google.common.collect.c0
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.c0
    public boolean containsKey(Object obj) {
        return this.f11802d.containsKey(obj);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.c0
    public /* bridge */ /* synthetic */ boolean e(Object obj, Object obj2) {
        return super.e(obj, obj2);
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.c
    public Map g() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.c
    public Set i() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.c, com.google.common.collect.c0
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.c0
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public ImmutableMap d() {
        return this.f11802d;
    }

    @Override // com.google.common.collect.c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection h() {
        return new EntryCollection(this);
    }

    @Override // com.google.common.collect.c
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public v0 k() {
        return new a();
    }

    @Override // com.google.common.collect.c0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableCollection get(Object obj);

    @Override // com.google.common.collect.c, com.google.common.collect.c0
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public ImmutableSet keySet() {
        return this.f11802d.keySet();
    }

    @Override // com.google.common.collect.c0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.c0
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.c0
    public int size() {
        return this.f11803e;
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
