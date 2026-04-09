package org.bouncycastle.util.io.pem;

import java.io.IOException;

/* loaded from: classes4.dex */
public class PemGenerationException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f56889a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f56889a;
    }
}
