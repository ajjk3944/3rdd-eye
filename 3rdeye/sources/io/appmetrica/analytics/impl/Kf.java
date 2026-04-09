package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public final class Kf extends Ja {
    public Kf(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(Y y10) {
        if (y10 == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(y10.f40402b) + 12;
    }
}
