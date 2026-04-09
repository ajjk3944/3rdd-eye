package com.yandex.mobile.ads.impl;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class wj0<K, V> extends AbstractC4145l<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    final K f35000b;

    /* renamed from: c, reason: collision with root package name */
    final V f35001c;

    public wj0(K k10, V v10) {
        this.f35000b = k10;
        this.f35001c = v10;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f35000b;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f35001c;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
