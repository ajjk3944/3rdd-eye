package org.bouncycastle.jce.exception;

import java.io.IOException;

/* loaded from: classes4.dex */
public class ExtIOException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f56882a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f56882a;
    }
}
