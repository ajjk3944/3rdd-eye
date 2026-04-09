package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.e2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4575e2 extends Q2 {
    @Override // io.appmetrica.analytics.impl.Q2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C4550d2();
    }

    public final C4550d2 b() {
        return new C4550d2();
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C4550d2();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4550d2 toState(byte[] bArr) throws IOException {
        return (C4550d2) MessageNano.mergeFrom(new C4550d2(), bArr);
    }
}
