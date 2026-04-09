package org.bouncycastle.jce.exception;

import java.security.cert.CertificateEncodingException;

/* loaded from: classes4.dex */
public class ExtCertificateEncodingException extends CertificateEncodingException {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f56881a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f56881a;
    }
}
