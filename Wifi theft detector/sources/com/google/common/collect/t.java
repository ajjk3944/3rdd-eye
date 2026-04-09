package com.google.common.collect;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class t extends v implements Map.Entry {
    public boolean equals(Object obj) {
        return h().equals(obj);
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return h().getKey();
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return h().getValue();
    }

    public abstract Map.Entry h();

    @Override // java.util.Map.Entry
    public int hashCode() {
        return h().hashCode();
    }

    public boolean i(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (com.google.common.base.f.a(getKey(), entry.getKey()) && com.google.common.base.f.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public Object setValue(Object obj) {
        return h().setValue(obj);
    }
}
