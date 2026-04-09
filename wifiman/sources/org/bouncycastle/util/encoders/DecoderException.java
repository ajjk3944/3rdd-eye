package org.bouncycastle.util.encoders;

/* loaded from: classes4.dex */
public class DecoderException extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f56887a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f56887a;
    }
}
