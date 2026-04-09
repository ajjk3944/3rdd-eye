package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class LinkedHashMultimap<K, V> extends LinkedHashMultimapGwtSerializationDependencies<K, V> {

    @GwtIncompatible
    private static final long serialVersionUID = 1;

    /* renamed from: f, reason: collision with root package name */
    public transient int f11857f;

    /* renamed from: g, reason: collision with root package name */
    public transient ValueEntry f11858g;

    @VisibleForTesting
    public static final class ValueEntry<K, V> extends ImmutableEntry<K, V> implements c {

        @CheckForNull
        ValueEntry<K, V> nextInValueBucket;

        @CheckForNull
        ValueEntry<K, V> predecessorInMultimap;

        @CheckForNull
        c predecessorInValueSet;
        final int smearedValueHash;

        @CheckForNull
        ValueEntry<K, V> successorInMultimap;

        @CheckForNull
        c successorInValueSet;

        public ValueEntry(Object obj, Object obj2, int i10, ValueEntry valueEntry) {
            super(obj, obj2);
            this.smearedValueHash = i10;
            this.nextInValueBucket = valueEntry;
        }

        public static ValueEntry m() {
            return new ValueEntry(null, null, 0, null);
        }

        @Override // com.google.common.collect.LinkedHashMultimap.c
        public c d() {
            c cVar = this.predecessorInValueSet;
            Objects.requireNonNull(cVar);
            return cVar;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.c
        public c g() {
            c cVar = this.successorInValueSet;
            Objects.requireNonNull(cVar);
            return cVar;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.c
        public void h(c cVar) {
            this.successorInValueSet = cVar;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.c
        public void i(c cVar) {
            this.predecessorInValueSet = cVar;
        }

        public ValueEntry j() {
            ValueEntry<K, V> valueEntry = this.predecessorInMultimap;
            Objects.requireNonNull(valueEntry);
            return valueEntry;
        }

        public ValueEntry k() {
            ValueEntry<K, V> valueEntry = this.successorInMultimap;
            Objects.requireNonNull(valueEntry);
            return valueEntry;
        }

        public boolean l(Object obj, int i10) {
            return this.smearedValueHash == i10 && com.google.common.base.f.a(getValue(), obj);
        }

        public void n(ValueEntry valueEntry) {
            this.predecessorInMultimap = valueEntry;
        }

        public void o(ValueEntry valueEntry) {
            this.successorInMultimap = valueEntry;
        }
    }

    public class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public ValueEntry f11859a;

        /* renamed from: b, reason: collision with root package name */
        public ValueEntry f11860b;

        public a() {
            this.f11859a = LinkedHashMultimap.this.f11858g.k();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            ValueEntry valueEntry = this.f11859a;
            this.f11860b = valueEntry;
            this.f11859a = valueEntry.k();
            return valueEntry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11859a != LinkedHashMultimap.this.f11858g;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.g.s(this.f11860b != null, "no calls to next() since the last call to remove()");
            LinkedHashMultimap.this.remove(this.f11860b.getKey(), this.f11860b.getValue());
            this.f11860b = null;
        }
    }

    public final class b extends Sets.a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final Object f11862a;

        /* renamed from: b, reason: collision with root package name */
        public ValueEntry[] f11863b;

        /* renamed from: c, reason: collision with root package name */
        public int f11864c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f11865d = 0;

        /* renamed from: e, reason: collision with root package name */
        public c f11866e = this;

        /* renamed from: f, reason: collision with root package name */
        public c f11867f = this;

        public class a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            public c f11869a;

            /* renamed from: b, reason: collision with root package name */
            public ValueEntry f11870b;

            /* renamed from: c, reason: collision with root package name */
            public int f11871c;

            public a() {
                this.f11869a = b.this.f11866e;
                this.f11871c = b.this.f11865d;
            }

            public final void a() {
                if (b.this.f11865d != this.f11871c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                return this.f11869a != b.this;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                ValueEntry valueEntry = (ValueEntry) this.f11869a;
                Object value = valueEntry.getValue();
                this.f11870b = valueEntry;
                this.f11869a = valueEntry.g();
                return value;
            }

            @Override // java.util.Iterator
            public void remove() {
                a();
                com.google.common.base.g.s(this.f11870b != null, "no calls to next() since the last call to remove()");
                b.this.remove(this.f11870b.getValue());
                this.f11871c = b.this.f11865d;
                this.f11870b = null;
            }
        }

        public b(Object obj, int i10) {
            this.f11862a = obj;
            this.f11863b = new ValueEntry[z.a(i10, 1.0d)];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            int iD = z.d(obj);
            int iE = e() & iD;
            ValueEntry<K, V> valueEntry = this.f11863b[iE];
            for (ValueEntry<K, V> valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (valueEntry2.l(obj, iD)) {
                    return false;
                }
            }
            ValueEntry valueEntry3 = new ValueEntry(this.f11862a, obj, iD, valueEntry);
            LinkedHashMultimap.Q(this.f11867f, valueEntry3);
            LinkedHashMultimap.Q(valueEntry3, this);
            LinkedHashMultimap.P(LinkedHashMultimap.this.f11858g.j(), valueEntry3);
            LinkedHashMultimap.P(valueEntry3, LinkedHashMultimap.this.f11858g);
            this.f11863b[iE] = valueEntry3;
            this.f11864c++;
            this.f11865d++;
            f();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.f11863b, (Object) null);
            this.f11864c = 0;
            for (c cVarG = this.f11866e; cVarG != this; cVarG = cVarG.g()) {
                LinkedHashMultimap.N((ValueEntry) cVarG);
            }
            LinkedHashMultimap.Q(this, this);
            this.f11865d++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            int iD = z.d(obj);
            for (ValueEntry<K, V> valueEntry = this.f11863b[e() & iD]; valueEntry != null; valueEntry = valueEntry.nextInValueBucket) {
                if (valueEntry.l(obj, iD)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.c
        public c d() {
            return this.f11867f;
        }

        public final int e() {
            return this.f11863b.length - 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.collect.LinkedHashMultimap$c] */
        public final void f() {
            if (z.b(this.f11864c, this.f11863b.length, 1.0d)) {
                int length = this.f11863b.length * 2;
                ValueEntry<K, V>[] valueEntryArr = new ValueEntry[length];
                this.f11863b = valueEntryArr;
                int i10 = length - 1;
                for (b bVarG = this.f11866e; bVarG != this; bVarG = bVarG.g()) {
                    ValueEntry<K, V> valueEntry = (ValueEntry) bVarG;
                    int i11 = valueEntry.smearedValueHash & i10;
                    valueEntry.nextInValueBucket = valueEntryArr[i11];
                    valueEntryArr[i11] = valueEntry;
                }
            }
        }

        @Override // com.google.common.collect.LinkedHashMultimap.c
        public c g() {
            return this.f11866e;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.c
        public void h(c cVar) {
            this.f11866e = cVar;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.c
        public void i(c cVar) {
            this.f11867f = cVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iD = z.d(obj);
            int iE = e() & iD;
            ValueEntry<K, V> valueEntry = null;
            for (ValueEntry<K, V> valueEntry2 = this.f11863b[iE]; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (valueEntry2.l(obj, iD)) {
                    if (valueEntry == null) {
                        this.f11863b[iE] = valueEntry2.nextInValueBucket;
                    } else {
                        valueEntry.nextInValueBucket = valueEntry2.nextInValueBucket;
                    }
                    LinkedHashMultimap.O(valueEntry2);
                    LinkedHashMultimap.N(valueEntry2);
                    this.f11864c--;
                    this.f11865d++;
                    return true;
                }
                valueEntry = valueEntry2;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f11864c;
        }
    }

    public interface c {
        c d();

        c g();

        void h(c cVar);

        void i(c cVar);
    }

    public static void N(ValueEntry valueEntry) {
        P(valueEntry.j(), valueEntry.k());
    }

    public static void O(c cVar) {
        Q(cVar.d(), cVar.g());
    }

    public static void P(ValueEntry valueEntry, ValueEntry valueEntry2) {
        valueEntry.o(valueEntry2);
        valueEntry2.n(valueEntry);
    }

    public static void Q(c cVar, c cVar2) {
        cVar.h(cVar2);
        cVar2.i(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        ValueEntry valueEntryM = ValueEntry.m();
        this.f11858g = valueEntryM;
        P(valueEntryM, valueEntryM);
        this.f11857f = 2;
        int i10 = objectInputStream.readInt();
        Map mapE = k0.e(12);
        for (int i11 = 0; i11 < i10; i11++) {
            Object object = objectInputStream.readObject();
            mapE.put(object, t(object));
        }
        int i12 = objectInputStream.readInt();
        for (int i13 = 0; i13 < i12; i13++) {
            Object object2 = objectInputStream.readObject();
            Object object3 = objectInputStream.readObject();
            Collection collection = (Collection) mapE.get(object2);
            Objects.requireNonNull(collection);
            collection.add(object3);
        }
        z(mapE);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(keySet().size());
        Iterator it = keySet().iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
        objectOutputStream.writeInt(size());
        for (Map.Entry entry : E()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.AbstractSetMultimap
    public Set E() {
        return super.E();
    }

    @Override // com.google.common.collect.AbstractSetMultimap
    /* renamed from: F */
    public /* bridge */ /* synthetic */ Set get(Object obj) {
        return super.get(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap
    /* renamed from: G */
    public /* bridge */ /* synthetic */ Set a(Object obj) {
        return super.a(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public Set s() {
        return k0.f(this.f11857f);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c0
    public void clear() {
        super.clear();
        ValueEntry valueEntry = this.f11858g;
        P(valueEntry, valueEntry);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c0
    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.c, com.google.common.collect.c0
    public /* bridge */ /* synthetic */ Map d() {
        return super.d();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.c0
    public /* bridge */ /* synthetic */ boolean e(Object obj, Object obj2) {
        return super.e(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.c
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.c0
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c
    public Iterator k() {
        return new a();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.c0
    public Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.c0
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c0
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection t(Object obj) {
        return new b(obj, this.f11857f);
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
