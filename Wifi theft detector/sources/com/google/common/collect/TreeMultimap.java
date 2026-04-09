package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public class TreeMultimap<K, V> extends AbstractSortedKeySortedSetMultimap<K, V> {

    @GwtIncompatible
    private static final long serialVersionUID = 0;

    /* renamed from: f, reason: collision with root package name */
    public transient Comparator f11991f;

    /* renamed from: g, reason: collision with root package name */
    public transient Comparator f11992g;

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f11991f = (Comparator) com.google.common.base.g.m((Comparator) objectInputStream.readObject());
        this.f11992g = (Comparator) com.google.common.base.g.m((Comparator) objectInputStream.readObject());
        z(new TreeMap(this.f11991f));
        n0.d(this, objectInputStream);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(Q());
        objectOutputStream.writeObject(S());
        n0.j(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public SortedSet s() {
        return new TreeSet(this.f11992g);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap
    /* renamed from: K */
    public /* bridge */ /* synthetic */ SortedSet a(Object obj) {
        return super.a(obj);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.c, com.google.common.collect.c0
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public NavigableMap d() {
        return (NavigableMap) super.M();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c0
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public NavigableSet get(Object obj) {
        return (NavigableSet) super.J(obj);
    }

    public Comparator Q() {
        return this.f11991f;
    }

    @Override // com.google.common.collect.c, com.google.common.collect.c0
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public NavigableSet keySet() {
        return (NavigableSet) super.N();
    }

    public Comparator S() {
        return this.f11992g;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c0
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c0
    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.c0
    public /* bridge */ /* synthetic */ boolean e(Object obj, Object obj2) {
        return super.e(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.c
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c
    public Map g() {
        return u();
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.c0
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
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
        if (obj == null) {
            Q().compare(obj, obj);
        }
        return super.t(obj);
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
