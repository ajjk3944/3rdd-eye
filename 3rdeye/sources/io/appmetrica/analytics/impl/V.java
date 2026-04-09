package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class V implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C4932rn f40259a;

    public V(C4932rn c4932rn) {
        this.f40259a = c4932rn;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4734k6 fromModel(U u8) {
        C4734k6 c4734k6 = new C4734k6();
        C4907qn c4907qn = u8.f40213a;
        if (c4907qn != null) {
            c4734k6.f41132a = this.f40259a.fromModel(c4907qn);
        }
        c4734k6.f41133b = new C4967t6[u8.f40214b.size()];
        Iterator it = u8.f40214b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c4734k6.f41133b[i] = this.f40259a.fromModel((C4907qn) it.next());
            i++;
        }
        String str = u8.f40215c;
        if (str != null) {
            c4734k6.f41134c = str;
        }
        return c4734k6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final U a(C4734k6 c4734k6) {
        throw new UnsupportedOperationException();
    }
}
