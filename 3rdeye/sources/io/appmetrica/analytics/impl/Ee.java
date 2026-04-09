package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Ee implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Oa f39366a;

    public Ee() {
        this(new Oa(20480, 100, 1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni fromModel(Map<String, String> map) {
        Gn gnA = this.f39366a.a(map);
        C8 c82 = new C8();
        c82.f39232b = ((I4) gnA.f39551b).f39615b;
        Map map2 = (Map) gnA.f39550a;
        if (map2 != null) {
            c82.f39231a = new B8[map2.size()];
            int i = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c82.f39231a[i] = new B8();
                c82.f39231a[i].f39157a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c82.f39231a[i].f39158b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i++;
            }
        }
        InterfaceC5064x3 interfaceC5064x3 = gnA.f39551b;
        int i10 = ((I4) interfaceC5064x3).f41889a;
        return new Ni(c82, interfaceC5064x3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Ee(Oa oa2) {
        this.f39366a = oa2;
    }

    public final Map<String, String> a(Ni ni) {
        throw new UnsupportedOperationException();
    }
}
