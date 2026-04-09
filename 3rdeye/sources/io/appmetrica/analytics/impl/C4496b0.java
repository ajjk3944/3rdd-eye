package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4496b0 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final V f40557a;

    /* renamed from: b, reason: collision with root package name */
    public final A6 f40558b;

    public C4496b0() {
        this(new V(new C4932rn()), new A6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4760l6 fromModel(C4470a0 c4470a0) {
        C4760l6 c4760l6 = new C4760l6();
        c4760l6.f41173a = this.f40557a.fromModel(c4470a0.f40501a);
        String str = c4470a0.f40502b;
        if (str != null) {
            c4760l6.f41174b = str;
        }
        c4760l6.f41175c = this.f40558b.a(c4470a0.f40503c);
        return c4760l6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4496b0(V v10, A6 a62) {
        this.f40557a = v10;
        this.f40558b = a62;
    }

    public final C4470a0 a(C4760l6 c4760l6) {
        throw new UnsupportedOperationException();
    }
}
