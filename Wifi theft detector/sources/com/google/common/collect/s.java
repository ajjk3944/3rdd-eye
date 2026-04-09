package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class s extends v implements Map {
    public void clear() {
        h().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return h().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return h().containsValue(obj);
    }

    public Set entrySet() {
        return h().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || h().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return h().get(obj);
    }

    public abstract Map h();

    @Override // java.util.Map
    public int hashCode() {
        return h().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return h().isEmpty();
    }

    public Set keySet() {
        return h().keySet();
    }

    public Object put(Object obj, Object obj2) {
        return h().put(obj, obj2);
    }

    public void putAll(Map map) {
        h().putAll(map);
    }

    public Object remove(Object obj) {
        return h().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return h().size();
    }

    public Collection values() {
        return h().values();
    }
}
