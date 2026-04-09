package org.bouncycastle.jcajce.provider.util;

import javax.crypto.BadPaddingException;

/* loaded from: classes4.dex */
public class BadBlockException extends BadPaddingException {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f56878a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f56878a;
    }
}
