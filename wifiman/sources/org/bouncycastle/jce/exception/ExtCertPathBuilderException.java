package org.bouncycastle.jce.exception;

import java.security.cert.CertPathBuilderException;

/* loaded from: classes4.dex */
public class ExtCertPathBuilderException extends CertPathBuilderException {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f56879a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f56879a;
    }
}
