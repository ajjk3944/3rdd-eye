package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes3.dex */
public final class Eb implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C4612fd f39364a;

    public Eb() {
        this(new C4612fd(new Ln()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Kn kn) {
        return MessageNano.toByteArray((MessageNano) this.f39364a.f40854a.fromModel(kn));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Eb(C4612fd c4612fd) {
        this.f39364a = c4612fd;
    }

    public final Kn a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
