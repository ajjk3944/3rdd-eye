package com.google.common.collect;

import com.google.common.collect.Multisets;
import com.google.common.collect.e0;
import com.google.common.collect.s0;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class n extends u implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public transient Comparator f12063a;

    /* renamed from: b, reason: collision with root package name */
    public transient NavigableSet f12064b;

    /* renamed from: c, reason: collision with root package name */
    public transient Set f12065c;

    public class a extends Multisets.d {
        public a() {
        }

        @Override // com.google.common.collect.Multisets.d
        public e0 b() {
            return n.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return n.this.z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return n.this.A().entrySet().size();
        }
    }

    public abstract r0 A();

    @Override // com.google.common.collect.r0
    public r0 a(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return A().a(obj2, boundType2, obj, boundType).o();
    }

    @Override // com.google.common.collect.r0, com.google.common.collect.p0
    public Comparator comparator() {
        Comparator comparator = this.f12063a;
        if (comparator != null) {
            return comparator;
        }
        j0 j0VarI = j0.a(A().comparator()).i();
        this.f12063a = j0VarI;
        return j0VarI;
    }

    @Override // com.google.common.collect.e0
    public Set entrySet() {
        Set set = this.f12065c;
        if (set != null) {
            return set;
        }
        Set setY = y();
        this.f12065c = setY;
        return setY;
    }

    @Override // com.google.common.collect.r0
    public e0.a firstEntry() {
        return A().lastEntry();
    }

    @Override // com.google.common.collect.r0
    public e0.a lastEntry() {
        return A().firstEntry();
    }

    @Override // com.google.common.collect.r0
    public r0 o() {
        return A();
    }

    @Override // com.google.common.collect.r0
    public e0.a pollFirstEntry() {
        return A().pollLastEntry();
    }

    @Override // com.google.common.collect.r0
    public e0.a pollLastEntry() {
        return A().pollFirstEntry();
    }

    @Override // com.google.common.collect.r0
    public r0 q(Object obj, BoundType boundType) {
        return A().t(obj, boundType).o();
    }

    @Override // com.google.common.collect.r0
    public r0 t(Object obj, BoundType boundType) {
        return A().q(obj, boundType).o();
    }

    @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return u();
    }

    @Override // com.google.common.collect.v
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.q
    public e0 x() {
        return A();
    }

    public Set y() {
        return new a();
    }

    public abstract Iterator z();

    @Override // com.google.common.collect.e0
    public NavigableSet k() {
        NavigableSet navigableSet = this.f12064b;
        if (navigableSet != null) {
            return navigableSet;
        }
        s0.b bVar = new s0.b(this);
        this.f12064b = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        return v(objArr);
    }
}
