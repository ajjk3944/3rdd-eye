package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes3.dex */
public final class Bf implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(EnumC4685i8 enumC4685i8) {
        int iOrdinal = enumC4685i8.ordinal();
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final EnumC4685i8 toModel(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            return EnumC4685i8.f41060c;
        }
        if (iIntValue == 2) {
            return EnumC4685i8.f41062e;
        }
        if (iIntValue != 3) {
            return EnumC4685i8.f41059b;
        }
        return EnumC4685i8.f41061d;
    }
}
