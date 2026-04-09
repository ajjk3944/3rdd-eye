package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.e0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements e0 {

    /* renamed from: b, reason: collision with root package name */
    public transient ImmutableSet f11810b;

    public final class EntrySet extends IndexedImmutableSet<e0.a> {
        private static final long serialVersionUID = 0;

        public EntrySet() {
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public e0.a get(int i10) {
            return ImmutableMultiset.this.w(i10);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof e0.a) {
                e0.a aVar = (e0.a) obj;
                if (aVar.getCount() > 0 && ImmutableMultiset.this.r(aVar.d()) == aVar.getCount()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean i() {
            return ImmutableMultiset.this.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ImmutableMultiset.this.k().size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @GwtIncompatible
        public Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }

        public /* synthetic */ EntrySet(ImmutableMultiset immutableMultiset, a aVar) {
            this();
        }
    }

    @GwtIncompatible
    public static class EntrySetSerializedForm<E> implements Serializable {
        final ImmutableMultiset<E> multiset;

        public EntrySetSerializedForm(ImmutableMultiset immutableMultiset) {
            this.multiset = immutableMultiset;
        }

        public Object readResolve() {
            return this.multiset.entrySet();
        }
    }

    public class a extends v0 {

        /* renamed from: a, reason: collision with root package name */
        public int f11811a;

        /* renamed from: b, reason: collision with root package name */
        public Object f11812b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Iterator f11813c;

        public a(ImmutableMultiset immutableMultiset, Iterator it) {
            this.f11813c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11811a > 0 || this.f11813c.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f11811a <= 0) {
                e0.a aVar = (e0.a) this.f11813c.next();
                this.f11812b = aVar.d();
                this.f11811a = aVar.getCount();
            }
            this.f11811a--;
            Object obj = this.f11812b;
            Objects.requireNonNull(obj);
            return obj;
        }
    }

    public static class b extends ImmutableCollection.b {

        /* renamed from: b, reason: collision with root package name */
        public boolean f11815b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f11816c = false;

        /* renamed from: a, reason: collision with root package name */
        public h0 f11814a = null;

        public b(boolean z10) {
        }
    }

    private ImmutableSet s() {
        return isEmpty() ? ImmutableSet.F() : new EntrySet(this, null);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int b(Object[] objArr, int i10) {
        v0 it = entrySet().iterator();
        while (it.hasNext()) {
            e0.a aVar = (e0.a) it.next();
            Arrays.fill(objArr, i10, aVar.getCount() + i10, aVar.d());
            i10 += aVar.getCount();
        }
        return i10;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return r(obj) > 0;
    }

    @Override // java.util.Collection, com.google.common.collect.e0
    public boolean equals(Object obj) {
        return Multisets.f(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.e0
    public int hashCode() {
        return Sets.b(entrySet());
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: j */
    public v0 iterator() {
        return new a(this, entrySet().iterator());
    }

    @Override // com.google.common.collect.e0
    public final int l(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.e0
    public final int m(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.e0
    public final int n(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.e0
    public final boolean p(Object obj, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.e0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableSet k();

    @Override // com.google.common.collect.e0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public ImmutableSet entrySet() {
        ImmutableSet immutableSet = this.f11810b;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet immutableSetS = s();
        this.f11810b = immutableSetS;
        return immutableSetS;
    }

    public abstract e0.a w(int i10);

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public abstract Object writeReplace();
}
