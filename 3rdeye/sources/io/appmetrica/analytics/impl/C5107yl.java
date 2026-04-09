package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.yl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5107yl implements ListConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C5132zl f42148a = new C5132zl();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4941s6[] fromModel(List<Al> list) {
        C4941s6[] c4941s6Arr = new C4941s6[list.size()];
        Iterator<Al> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            c4941s6Arr[i] = this.f42148a.fromModel(it.next());
            i++;
        }
        return c4941s6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final List<Al> a(C4941s6[] c4941s6Arr) {
        throw new UnsupportedOperationException();
    }
}
