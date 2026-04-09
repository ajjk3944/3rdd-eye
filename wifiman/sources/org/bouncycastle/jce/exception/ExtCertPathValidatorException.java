package org.bouncycastle.jce.exception;

import java.security.cert.CertPathValidatorException;

/* loaded from: classes4.dex */
public class ExtCertPathValidatorException extends CertPathValidatorException {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f56880a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f56880a;
    }
}
