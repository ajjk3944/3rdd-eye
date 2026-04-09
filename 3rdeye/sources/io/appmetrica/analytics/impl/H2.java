package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes3.dex */
public final class H2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4498b2 fromModel(J2 j22) {
        C4498b2 c4498b2 = new C4498b2();
        I2 i22 = j22.f39667a;
        if (i22 != null) {
            int iOrdinal = i22.ordinal();
            if (iOrdinal == 1) {
                c4498b2.f40571a = 1;
            } else if (iOrdinal == 2) {
                c4498b2.f40571a = 2;
            } else if (iOrdinal == 3) {
                c4498b2.f40571a = 3;
            } else if (iOrdinal == 4) {
                c4498b2.f40571a = 4;
            } else if (iOrdinal == 5) {
                c4498b2.f40571a = 5;
            }
        }
        Boolean bool = j22.f39668b;
        if (bool != null) {
            if (bool.booleanValue()) {
                c4498b2.f40572b = 1;
                return c4498b2;
            }
            c4498b2.f40572b = 0;
        }
        return c4498b2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J2 toModel(C4498b2 c4498b2) {
        I2 i22;
        int i = c4498b2.f40571a;
        Boolean bool = null;
        if (i == 1) {
            i22 = I2.ACTIVE;
        } else if (i == 2) {
            i22 = I2.WORKING_SET;
        } else if (i == 3) {
            i22 = I2.FREQUENT;
        } else if (i != 4) {
            i22 = i != 5 ? null : I2.RESTRICTED;
        } else {
            i22 = I2.RARE;
        }
        int i10 = c4498b2.f40572b;
        if (i10 == 0) {
            bool = Boolean.FALSE;
        } else if (i10 == 1) {
            bool = Boolean.TRUE;
        }
        return new J2(i22, bool);
    }
}
