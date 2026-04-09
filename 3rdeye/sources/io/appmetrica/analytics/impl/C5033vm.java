package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.vm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5033vm extends Q2 {
    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5008um defaultValue() {
        C5008um c5008um = new C5008um();
        c5008um.i = new C4880pm();
        return c5008um;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5008um toState(byte[] bArr) throws IOException {
        return (C5008um) MessageNano.mergeFrom(new C5008um(), bArr);
    }
}
