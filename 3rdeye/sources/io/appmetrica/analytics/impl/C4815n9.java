package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.n9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4815n9 extends AbstractC4841o9 {

    /* renamed from: a, reason: collision with root package name */
    public final List f41305a;

    public C4815n9(List<Object> list) {
        this.f41305a = CollectionUtils.unmodifiableListCopy(list);
    }

    public final List<Object> a() {
        return this.f41305a;
    }
}
