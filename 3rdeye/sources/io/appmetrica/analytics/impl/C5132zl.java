package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.zl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5132zl implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4941s6 fromModel(Al al) {
        C4941s6 c4941s6 = new C4941s6();
        c4941s6.f41620a = (String) WrapUtils.getOrDefault(al.f39119a, c4941s6.f41620a);
        c4941s6.f41621b = (String) WrapUtils.getOrDefault(al.f39120b, c4941s6.f41621b);
        c4941s6.f41622c = ((Integer) WrapUtils.getOrDefault(al.f39121c, Integer.valueOf(c4941s6.f41622c))).intValue();
        c4941s6.f41625f = ((Integer) WrapUtils.getOrDefault(al.f39122d, Integer.valueOf(c4941s6.f41625f))).intValue();
        c4941s6.f41623d = (String) WrapUtils.getOrDefault(al.f39123e, c4941s6.f41623d);
        c4941s6.f41624e = ((Boolean) WrapUtils.getOrDefault(al.f39124f, Boolean.valueOf(c4941s6.f41624e))).booleanValue();
        return c4941s6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Al a(C4941s6 c4941s6) {
        throw new UnsupportedOperationException();
    }
}
