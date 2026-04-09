package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidKeyException;

/* loaded from: classes4.dex */
public class BaseWrapCipher$InvalidKeyOrParametersException extends InvalidKeyException {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f56877a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f56877a;
    }
}
