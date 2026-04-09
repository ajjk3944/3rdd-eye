package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* loaded from: classes3.dex */
public final class Jn implements InterfaceC4830no {

    /* renamed from: a, reason: collision with root package name */
    public final X8 f39699a;

    public Jn() {
        this(new X8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4830no
    public final byte[] a(C4557d9 c4557d9, C5028vh c5028vh) {
        byte[] bArrDecompressBase64GzipAsBytes = new byte[0];
        try {
            bArrDecompressBase64GzipAsBytes = Base64Utils.decompressBase64GzipAsBytes(c4557d9.f40723b);
        } catch (Throwable unused) {
        }
        byte[] bArrA = ((W8) this.f39699a.f40379a.a(c4557d9.f40735o)).a(bArrDecompressBase64GzipAsBytes);
        return bArrA == null ? new byte[0] : bArrA;
    }

    public Jn(X8 x82) {
        this.f39699a = x82;
    }

    public final X8 a() {
        return this.f39699a;
    }
}
