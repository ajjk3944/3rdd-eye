package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class EnumBiMap<K extends Enum<K>, V extends Enum<V>> extends AbstractBiMap<K, V> {

    @GwtIncompatible
    private static final long serialVersionUID = 0;

    /* renamed from: f, reason: collision with root package name */
    public transient Class f11732f;

    /* renamed from: g, reason: collision with root package name */
    public transient Class f11733g;

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f11732f = (Class) objectInputStream.readObject();
        this.f11733g = (Class) objectInputStream.readObject();
        C(new EnumMap(this.f11732f), new EnumMap(this.f11733g));
        n0.b(this, objectInputStream);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f11732f);
        objectOutputStream.writeObject(this.f11733g);
        n0.i(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractBiMap
    /* renamed from: F */
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractBiMap
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public Enum v(Enum r12) {
        return (Enum) com.google.common.base.g.m(r12);
    }

    @Override // com.google.common.collect.AbstractBiMap
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public Enum w(Enum r12) {
        return (Enum) com.google.common.base.g.m(r12);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s, java.util.Map
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s, java.util.Map
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s, java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.i
    public /* bridge */ /* synthetic */ i g() {
        return super.g();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s, java.util.Map
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s, java.util.Map
    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        return super.remove(obj);
    }
}
