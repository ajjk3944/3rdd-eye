package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class O7 implements ProtobufConverter {
    public final BigDecimal a(C5069x8 c5069x8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5069x8 fromModel(BigDecimal bigDecimal) {
        BigInteger bigInteger = Q7.f40009a;
        int i = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(Q7.f40009a) <= 0 && bigIntegerUnscaledValue.compareTo(Q7.f40010b) >= 0) {
                Long lValueOf = Long.valueOf(bigIntegerUnscaledValue.longValue());
                Integer numValueOf = Integer.valueOf(i);
                P7 p72 = new P7(numValueOf.intValue(), lValueOf.longValue());
                C5069x8 c5069x8 = new C5069x8();
                c5069x8.f42054a = p72.f39963a;
                c5069x8.f42055b = p72.f39964b;
                return c5069x8;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i++;
        }
    }
}
