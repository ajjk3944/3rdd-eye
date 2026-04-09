package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;
import y9.C5819a;

/* loaded from: classes3.dex */
public final class Ue implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4786m6[] fromModel(Map<String, String> map) {
        int size = map.size();
        C4786m6[] c4786m6Arr = new C4786m6[size];
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c4786m6Arr[i10] = new C4786m6();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C4786m6 c4786m6 = c4786m6Arr[i];
            String key = entry.getKey();
            Charset charset = C5819a.f48359b;
            c4786m6.f41241a = key.getBytes(charset);
            c4786m6Arr[i].f41242b = entry.getValue().getBytes(charset);
            i++;
        }
        return c4786m6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Map<String, String> a(C4786m6[] c4786m6Arr) {
        throw new UnsupportedOperationException();
    }
}
