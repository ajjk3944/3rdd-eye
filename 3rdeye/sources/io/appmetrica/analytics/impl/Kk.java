package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes3.dex */
public final class Kk extends Q2 {
    @Override // io.appmetrica.analytics.impl.Q2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new Ik();
    }

    public final Ik b() {
        return new Ik();
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new Ik();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ik toState(byte[] bArr) {
        return (Ik) MessageNano.mergeFrom(new Ik(), bArr);
    }
}
