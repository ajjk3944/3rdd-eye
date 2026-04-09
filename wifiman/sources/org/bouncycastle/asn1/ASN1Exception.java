package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes4.dex */
public class ASN1Exception extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f56871a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f56871a;
    }
}
