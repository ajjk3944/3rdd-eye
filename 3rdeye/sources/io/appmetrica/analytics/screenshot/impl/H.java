package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes3.dex */
public final class H implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final J f42501a;

    public H() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(G g10) {
        return MessageNano.toByteArray(this.f42501a.fromModel(g10));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f42501a.fromModel((G) obj));
    }

    public H(J j4) {
        this.f42501a = j4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G toModel(byte[] bArr) {
        O o10;
        try {
            o10 = (O) MessageNano.mergeFrom(new O(), bArr);
        } catch (Throwable unused) {
            o10 = new O();
        }
        return this.f42501a.toModel(o10);
    }

    public /* synthetic */ H(J j4, int i, kotlin.jvm.internal.g gVar) {
        this((i & 1) != 0 ? new J(null, 1, null) : j4);
    }
}
