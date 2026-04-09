package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes3.dex */
public final class Jh extends AbstractC4926rh {
    public Jh(W6 w62) {
        super(w62);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4926rh, io.appmetrica.analytics.impl.InterfaceC4952sh
    public final boolean a(Boolean bool) {
        return !this.f41580a.isRestrictedForReporter() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
