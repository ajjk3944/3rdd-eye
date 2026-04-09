package org.bouncycastle.crypto;

/* loaded from: classes4.dex */
public class CryptoException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f56873a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f56873a;
    }
}
