package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.ak, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4490ak extends AbstractC4926rh {
    public C4490ak(W6 w62) {
        super(w62);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4926rh, io.appmetrica.analytics.impl.InterfaceC4952sh
    public final boolean a(Boolean bool) {
        return !this.f41580a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
