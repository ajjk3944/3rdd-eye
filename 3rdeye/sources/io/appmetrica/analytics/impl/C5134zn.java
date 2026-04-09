package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.zn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5134zn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C5107yl f42214a;

    public C5134zn() {
        this(new C5107yl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4992u6 fromModel(An an) {
        C4992u6 c4992u6 = new C4992u6();
        c4992u6.f41709a = (String) WrapUtils.getOrDefault(an.f39126a, "");
        c4992u6.f41710b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(an.f39127b, ""));
        List<Al> list = an.f39128c;
        if (list != null) {
            c4992u6.f41711c = this.f42214a.fromModel(list);
        }
        An an2 = an.f39129d;
        if (an2 != null) {
            c4992u6.f41712d = fromModel(an2);
        }
        List list2 = an.f39130e;
        int i = 0;
        if (list2 == null) {
            c4992u6.f41713e = new C4992u6[0];
            return c4992u6;
        }
        c4992u6.f41713e = new C4992u6[list2.size()];
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c4992u6.f41713e[i] = fromModel((An) it.next());
            i++;
        }
        return c4992u6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5134zn(C5107yl c5107yl) {
        this.f42214a = c5107yl;
    }

    public final An a(C4992u6 c4992u6) {
        throw new UnsupportedOperationException();
    }
}
