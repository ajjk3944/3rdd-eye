package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* loaded from: classes3.dex */
public final class Tf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Ka f40178a;

    public Tf() {
        this(new Ka(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni fromModel(List<String> list) {
        Gn gnA = this.f40178a.a((List<Object>) list);
        List list2 = (List) gnA.f39550a;
        F8[] f8Arr = new F8[0];
        if (list2 != null) {
            f8Arr = new F8[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                F8 f82 = new F8();
                f8Arr[i] = f82;
                f82.f39432a = StringUtils.getUTF8Bytes((String) list2.get(i));
            }
        }
        gnA.f39551b.getBytesTruncated();
        return new Ni(f8Arr, gnA.f39551b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Tf(Ka ka2) {
        this.f40178a = ka2;
    }

    public final List<String> a(Ni ni) {
        throw new UnsupportedOperationException();
    }
}
