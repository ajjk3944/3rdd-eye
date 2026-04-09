package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class A2 extends Q2 {
    @Override // io.appmetrica.analytics.impl.Q2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C5113z2();
    }

    public final C5113z2 b() {
        return new C5113z2();
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C5113z2();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5113z2 toState(byte[] bArr) throws IOException {
        return (C5113z2) MessageNano.mergeFrom(new C5113z2(), bArr);
    }
}
