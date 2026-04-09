package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.rn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4932rn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C5107yl f41593a;

    public C4932rn() {
        this(new C5107yl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4967t6 fromModel(C4907qn c4907qn) {
        C4967t6 c4967t6 = new C4967t6();
        Integer num = c4907qn.f41500e;
        c4967t6.f41669e = num == null ? -1 : num.intValue();
        c4967t6.f41668d = c4907qn.f41499d;
        c4967t6.f41666b = c4907qn.f41497b;
        c4967t6.f41665a = c4907qn.f41496a;
        c4967t6.f41667c = c4907qn.f41498c;
        C5107yl c5107yl = this.f41593a;
        List list = c4907qn.f41501f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Al((StackTraceElement) it.next()));
        }
        c4967t6.f41670f = c5107yl.fromModel(arrayList);
        return c4967t6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4932rn(C5107yl c5107yl) {
        this.f41593a = c5107yl;
    }

    public final C4907qn a(C4967t6 c4967t6) {
        throw new UnsupportedOperationException();
    }
}
