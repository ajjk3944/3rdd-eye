package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.l31;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
final class k31 extends l31.c<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f29487a;

    public k31(Comparator comparator) {
        this.f29487a = comparator;
    }

    @Override // com.yandex.mobile.ads.impl.l31.c
    public final <K, V> Map<K, Collection<V>> b() {
        return new TreeMap(this.f29487a);
    }
}
