package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.uf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5001uf extends Q2 {
    @Override // io.appmetrica.analytics.impl.Q2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C5126zf();
    }

    public final C5126zf b() {
        return new C5126zf();
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C5126zf();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5126zf toState(byte[] bArr) throws IOException {
        return (C5126zf) MessageNano.mergeFrom(new C5126zf(), bArr);
    }
}
