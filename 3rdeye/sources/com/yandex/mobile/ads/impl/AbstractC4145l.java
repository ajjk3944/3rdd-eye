package com.yandex.mobile.ads.impl;

import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC4145l<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (pd1.a(getKey(), entry.getKey()) && pd1.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
