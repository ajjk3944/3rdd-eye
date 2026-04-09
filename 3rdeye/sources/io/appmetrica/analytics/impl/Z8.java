package io.appmetrica.analytics.impl;

import c9.C2077A;
import c9.C2092m;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Z8 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Map<String, byte[]> map) {
        C4505b9 c4505b9 = new C4505b9();
        C4479a9[] c4479a9Arr = new C4479a9[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C4479a9 c4479a9 = new C4479a9();
            c4479a9.f40513a = (String) entry.getKey();
            c4479a9.f40514b = (byte[]) entry.getValue();
            c4479a9Arr[i] = c4479a9;
            i = i10;
        }
        c4505b9.f40582a = c4479a9Arr;
        return MessageNano.toByteArray(c4505b9);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(byte[] bArr) {
        C4479a9[] c4479a9Arr = ((C4505b9) MessageNano.mergeFrom(new C4505b9(), bArr)).f40582a;
        int iL = C2077A.l(c4479a9Arr.length);
        if (iL < 16) {
            iL = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iL);
        for (C4479a9 c4479a9 : c4479a9Arr) {
            linkedHashMap.put(c4479a9.f40513a, c4479a9.f40514b);
        }
        return linkedHashMap;
    }
}
