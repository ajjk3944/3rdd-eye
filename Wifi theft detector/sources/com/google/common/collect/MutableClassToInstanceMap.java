package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class MutableClassToInstanceMap<B> extends s implements Map, Serializable {
    private final Map<Class<? extends B>, B> delegate;

    public static final class SerializedForm<B> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Map<Class<? extends B>, B> backingMap;

        public SerializedForm(Map map) {
            this.backingMap = map;
        }

        public Object readResolve() {
            return MutableClassToInstanceMap.u(this.backingMap);
        }
    }

    public class a extends t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map.Entry f11925a;

        public a(Map.Entry entry) {
            this.f11925a = entry;
        }

        @Override // com.google.common.collect.v
        /* renamed from: h */
        public Map.Entry x() {
            return this.f11925a;
        }

        @Override // com.google.common.collect.t, java.util.Map.Entry
        public Object setValue(Object obj) {
            return super.setValue(MutableClassToInstanceMap.j((Class) getKey(), obj));
        }
    }

    public class b extends x {

        public class a extends u0 {
            public a(b bVar, Iterator it) {
                super(it);
            }

            @Override // com.google.common.collect.u0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry a(Map.Entry entry) {
                return MutableClassToInstanceMap.s(entry);
            }
        }

        public b() {
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a(this, x().iterator());
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return u();
        }

        @Override // com.google.common.collect.q
        public Set x() {
            return MutableClassToInstanceMap.this.x().entrySet();
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public Object[] toArray(Object[] objArr) {
            return v(objArr);
        }
    }

    public MutableClassToInstanceMap(Map map) {
        this.delegate = (Map) com.google.common.base.g.m(map);
    }

    public static Object j(Class cls, Object obj) {
        return com.google.common.primitives.f.b(cls).cast(obj);
    }

    public static Map.Entry s(Map.Entry entry) {
        return new a(entry);
    }

    public static MutableClassToInstanceMap u(Map map) {
        return new MutableClassToInstanceMap(map);
    }

    private Object writeReplace() {
        return new SerializedForm(x());
    }

    @Override // com.google.common.collect.s, java.util.Map
    public Set entrySet() {
        return new b();
    }

    @Override // com.google.common.collect.v
    /* renamed from: h */
    public Map x() {
        return this.delegate;
    }

    @Override // com.google.common.collect.s, java.util.Map
    public void putAll(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            j((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }

    @Override // com.google.common.collect.s, java.util.Map
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Object put(Class cls, Object obj) {
        return super.put(cls, j(cls, obj));
    }
}
