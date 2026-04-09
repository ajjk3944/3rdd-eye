package com.google.common.collect;

import com.google.common.collect.Sets;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public abstract class Maps {

    public enum EntryFunction implements com.google.common.base.c {
        KEY { // from class: com.google.common.collect.Maps.EntryFunction.1
            @Override // com.google.common.base.c
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.google.common.collect.Maps.EntryFunction.2
            @Override // com.google.common.base.c
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        };

        /* synthetic */ EntryFunction(a aVar) {
            this();
        }
    }

    public class a extends u0 {
        public a(Iterator it) {
            super(it);
        }

        @Override // com.google.common.collect.u0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object a(Map.Entry entry) {
            return entry.getKey();
        }
    }

    public class b extends u0 {
        public b(Iterator it) {
            super(it);
        }

        @Override // com.google.common.collect.u0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object a(Map.Entry entry) {
            return entry.getValue();
        }
    }

    public class c extends u0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.google.common.base.c f11911b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Iterator it, com.google.common.base.c cVar) {
            super(it);
            this.f11911b = cVar;
        }

        @Override // com.google.common.collect.u0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry a(Object obj) {
            return Maps.e(obj, this.f11911b.apply(obj));
        }
    }

    public class d extends com.google.common.collect.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map.Entry f11912a;

        public d(Map.Entry entry) {
            this.f11912a = entry;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object getKey() {
            return this.f11912a.getKey();
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object getValue() {
            return this.f11912a.getValue();
        }
    }

    public static abstract class e extends Sets.a {
        public abstract Map b();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object objK = Maps.k(b(), key);
                if (com.google.common.base.f.a(objK, entry.getValue()) && (objK != null || b().containsKey(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return b().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return b().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.a, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) com.google.common.base.g.m(collection));
            } catch (UnsupportedOperationException unused) {
                return Sets.f(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) com.google.common.base.g.m(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetD = Sets.d(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetD.add(((Map.Entry) obj).getKey());
                    }
                }
                return b().keySet().retainAll(hashSetD);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b().size();
        }
    }

    public static abstract class f extends AbstractMap {

        public class a extends e {
            public a() {
            }

            @Override // com.google.common.collect.Maps.e
            public Map b() {
                return f.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return f.this.a();
            }
        }

        public abstract Iterator a();

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            return new a();
        }
    }

    public static class g extends Sets.a {

        /* renamed from: a, reason: collision with root package name */
        public final Map f11914a;

        public g(Map map) {
            this.f11914a = (Map) com.google.common.base.g.m(map);
        }

        public Map b() {
            return this.f11914a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return b().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return b().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return Maps.g(b().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            b().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b().size();
        }
    }

    public static class h extends g implements SortedSet {
        public h(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // com.google.common.collect.Maps.g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public SortedMap b() {
            return (SortedMap) super.b();
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return b().firstKey();
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return new h(b().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return b().lastKey();
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return new h(b().subMap(obj, obj2));
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return new h(b().tailMap(obj));
        }
    }

    public static class i extends AbstractCollection {

        /* renamed from: a, reason: collision with root package name */
        public final Map f11915a;

        public i(Map map) {
            this.f11915a = (Map) com.google.common.base.g.m(map);
        }

        public final Map b() {
            return this.f11915a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return b().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return b().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return Maps.p(b().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : b().entrySet()) {
                    if (com.google.common.base.f.a(obj, entry.getValue())) {
                        b().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) com.google.common.base.g.m(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetC = Sets.c();
                for (Map.Entry entry : b().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetC.add(entry.getKey());
                    }
                }
                return b().keySet().removeAll(hashSetC);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) com.google.common.base.g.m(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetC = Sets.c();
                for (Map.Entry entry : b().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetC.add(entry.getKey());
                    }
                }
                return b().keySet().retainAll(hashSetC);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return b().size();
        }
    }

    public static abstract class j extends AbstractMap {

        /* renamed from: a, reason: collision with root package name */
        public transient Set f11916a;

        /* renamed from: b, reason: collision with root package name */
        public transient Set f11917b;

        /* renamed from: c, reason: collision with root package name */
        public transient Collection f11918c;

        public abstract Set a();

        /* renamed from: c */
        public Set i() {
            return new g(this);
        }

        public Collection d() {
            return new i(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.f11916a;
            if (set != null) {
                return set;
            }
            Set setA = a();
            this.f11916a = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: keySet */
        public Set j() {
            Set set = this.f11917b;
            if (set != null) {
                return set;
            }
            Set setI = i();
            this.f11917b = setI;
            return setI;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.f11918c;
            if (collection != null) {
                return collection;
            }
            Collection collectionD = d();
            this.f11918c = collectionD;
            return collectionD;
        }
    }

    public static Iterator a(Set set, com.google.common.base.c cVar) {
        return new c(set.iterator(), cVar);
    }

    public static int b(int i10) {
        if (i10 < 3) {
            com.google.common.collect.j.b(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean c(Collection collection, Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.contains(n((Map.Entry) obj));
        }
        return false;
    }

    public static boolean d(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static Map.Entry e(Object obj, Object obj2) {
        return new ImmutableEntry(obj, obj2);
    }

    public static com.google.common.base.c f() {
        return EntryFunction.KEY;
    }

    public static Iterator g(Iterator it) {
        return new a(it);
    }

    public static Object h(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static HashMap i() {
        return new HashMap();
    }

    public static boolean j(Map map, Object obj) {
        com.google.common.base.g.m(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static Object k(Map map, Object obj) {
        com.google.common.base.g.m(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static Object l(Map map, Object obj) {
        com.google.common.base.g.m(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String m(Map map) {
        StringBuilder sbB = k.b(map.size());
        sbB.append('{');
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z10) {
                sbB.append(", ");
            }
            sbB.append(entry.getKey());
            sbB.append('=');
            sbB.append(entry.getValue());
            z10 = false;
        }
        sbB.append('}');
        return sbB.toString();
    }

    public static Map.Entry n(Map.Entry entry) {
        com.google.common.base.g.m(entry);
        return new d(entry);
    }

    public static com.google.common.base.c o() {
        return EntryFunction.VALUE;
    }

    public static Iterator p(Iterator it) {
        return new b(it);
    }
}
