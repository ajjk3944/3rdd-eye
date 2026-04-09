package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes3.dex */
public interface j31<K, V> {
    Map<K, Collection<V>> a();

    boolean put(K k10, V v10);

    Collection<V> values();
}
