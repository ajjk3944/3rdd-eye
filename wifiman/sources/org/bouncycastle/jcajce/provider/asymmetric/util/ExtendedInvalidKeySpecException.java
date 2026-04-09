package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.spec.InvalidKeySpecException;

/* loaded from: classes4.dex */
public class ExtendedInvalidKeySpecException extends InvalidKeySpecException {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f56876a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f56876a;
    }
}
