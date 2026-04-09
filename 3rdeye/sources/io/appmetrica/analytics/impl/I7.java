package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes3.dex */
public final class I7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C5100ye f39617a;

    public I7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final H7 fromModel(K7 k72) {
        H7 h72 = new H7();
        Long l5 = k72.f39712a;
        if (l5 != null) {
            h72.f39564a = l5.longValue();
        }
        Long l10 = k72.f39713b;
        if (l10 != null) {
            h72.f39565b = l10.longValue();
        }
        Boolean bool = k72.f39714c;
        if (bool != null) {
            h72.f39566c = this.f39617a.fromModel(bool).intValue();
        }
        return h72;
    }

    public I7(C5100ye c5100ye) {
        this.f39617a = c5100ye;
    }

    public /* synthetic */ I7(C5100ye c5100ye, int i, kotlin.jvm.internal.g gVar) {
        this((i & 1) != 0 ? new C5100ye() : c5100ye);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K7 toModel(H7 h72) {
        H7 h73 = new H7();
        long j4 = h72.f39564a;
        Long lValueOf = Long.valueOf(j4);
        if (j4 == h73.f39564a) {
            lValueOf = null;
        }
        long j10 = h72.f39565b;
        return new K7(lValueOf, j10 != h73.f39565b ? Long.valueOf(j10) : null, this.f39617a.a(h72.f39566c));
    }
}
