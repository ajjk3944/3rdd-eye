package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public final class S8 implements InterfaceC4830no {

    /* renamed from: a, reason: collision with root package name */
    public final X8 f40098a;

    public S8() {
        this(new X8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4830no
    public final byte[] a(C4557d9 c4557d9, C5028vh c5028vh) {
        String str = c4557d9.f40723b;
        return ((W8) this.f40098a.f40379a.a(c4557d9.f40735o)).a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public S8(X8 x82) {
        this.f40098a = x82;
    }
}
