package org.bouncycastle.x509.util;

/* loaded from: classes4.dex */
public class StreamParsingException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    Throwable f56890a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f56890a;
    }
}
