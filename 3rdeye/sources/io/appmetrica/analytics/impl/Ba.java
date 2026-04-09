package io.appmetrica.analytics.impl;

import c9.C2092m;
import java.util.Map;
import y9.C5819a;

/* loaded from: classes3.dex */
public final class Ba implements InterfaceC4635ga {

    /* renamed from: a, reason: collision with root package name */
    public final Z8 f39167a = new Z8();

    public final C4995u9[] a(byte[] bArr) {
        int i = 0;
        if (bArr == null) {
            return new C4995u9[0];
        }
        Map<String, byte[]> model = this.f39167a.toModel(bArr);
        C4995u9[] c4995u9Arr = new C4995u9[model.size()];
        for (Object obj : model.entrySet()) {
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C4995u9 c4995u9 = new C4995u9();
            c4995u9.f41719a = ((String) entry.getKey()).getBytes(C5819a.f48359b);
            c4995u9.f41720b = (byte[]) entry.getValue();
            c4995u9Arr[i] = c4995u9;
            i = i10;
        }
        return c4995u9Arr;
    }
}
