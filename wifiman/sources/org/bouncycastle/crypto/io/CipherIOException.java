package org.bouncycastle.crypto.io;

import java.io.IOException;

/* loaded from: classes4.dex */
public class CipherIOException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f56874a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f56874a;
    }
}
