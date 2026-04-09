package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class d0 {

    public static final class a extends Maps.j {

        /* renamed from: d, reason: collision with root package name */
        public final c0 f12038d;

        /* renamed from: com.google.common.collect.d0$a$a, reason: collision with other inner class name */
        public class C0219a extends Maps.e {

            /* renamed from: com.google.common.collect.d0$a$a$a, reason: collision with other inner class name */
            public class C0220a implements com.google.common.base.c {
                public C0220a() {
                }

                @Override // com.google.common.base.c
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Collection apply(Object obj) {
                    return a.this.f12038d.get(obj);
                }
            }

            public C0219a() {
            }

            @Override // com.google.common.collect.Maps.e
            public Map b() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return Maps.a(a.this.f12038d.keySet(), new C0220a());
            }

            @Override // com.google.common.collect.Maps.e, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                a.this.i(entry.getKey());
                return true;
            }
        }

        public a(c0 c0Var) {
            this.f12038d = (c0) com.google.common.base.g.m(c0Var);
        }

        @Override // com.google.common.collect.Maps.j
        public Set a() {
            return new C0219a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f12038d.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f12038d.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection get(Object obj) {
            if (containsKey(obj)) {
                return this.f12038d.get(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Collection remove(Object obj) {
            if (containsKey(obj)) {
                return this.f12038d.a(obj);
            }
            return null;
        }

        public void i(Object obj) {
            this.f12038d.keySet().remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f12038d.isEmpty();
        }

        @Override // com.google.common.collect.Maps.j, java.util.AbstractMap, java.util.Map
        /* renamed from: keySet */
        public Set j() {
            return this.f12038d.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f12038d.keySet().size();
        }
    }

    public static abstract class b extends AbstractCollection {
        public abstract c0 b();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b().e(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return b().size();
        }
    }

    public static boolean a(c0 c0Var, Object obj) {
        if (obj == c0Var) {
            return true;
        }
        if (obj instanceof c0) {
            return c0Var.d().equals(((c0) obj).d());
        }
        return false;
    }
}
