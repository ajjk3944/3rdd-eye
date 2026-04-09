package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes3.dex */
public final class J implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final V f42504a;

    public J() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O fromModel(G g10) {
        O o10 = new O();
        o10.f42519a = g10.f42499a;
        T t10 = g10.f42500b;
        o10.f42520b = t10 != null ? this.f42504a.fromModel(t10) : null;
        return o10;
    }

    public J(V v10) {
        this.f42504a = v10;
    }

    public /* synthetic */ J(V v10, int i, kotlin.jvm.internal.g gVar) {
        if ((i & 1) != 0) {
            v10 = new V(null, null, null, 7, null);
        }
        this(v10);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G toModel(O o10) {
        return new G(o10.f42519a, this.f42504a.toModel(o10.f42520b));
    }
}
