package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public final class N6 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Pg f39893a;

    public N6() {
        this(new Pg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4890q6 fromModel(M6 m62) {
        C4890q6 c4890q6FromModel = this.f39893a.fromModel(m62.f39849a);
        c4890q6FromModel.f41462g = 1;
        C4864p6 c4864p6 = new C4864p6();
        c4890q6FromModel.f41463h = c4864p6;
        c4864p6.f41414a = StringUtils.correctIllFormedString(m62.f39850b);
        return c4890q6FromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public N6(Pg pg) {
        this.f39893a = pg;
    }

    public final M6 a(C4890q6 c4890q6) {
        throw new UnsupportedOperationException();
    }
}
