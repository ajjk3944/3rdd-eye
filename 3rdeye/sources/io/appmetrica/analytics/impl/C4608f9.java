package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.f9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4608f9 implements ProtobufConverter {
    public static M9 a(C4582e9 c4582e9) {
        M9 m92 = new M9();
        m92.f39856d = new int[c4582e9.f40797b.size()];
        Iterator it = c4582e9.f40797b.iterator();
        int i = 0;
        while (it.hasNext()) {
            m92.f39856d[i] = ((Integer) it.next()).intValue();
            i++;
        }
        m92.f39855c = c4582e9.f40799d;
        m92.f39854b = c4582e9.f40798c;
        m92.f39853a = c4582e9.f40796a;
        return m92;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((C4582e9) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        M9 m92 = (M9) obj;
        return new C4582e9(m92.f39853a, m92.f39854b, m92.f39855c, CollectionUtils.hashSetFromIntArray(m92.f39856d));
    }
}
