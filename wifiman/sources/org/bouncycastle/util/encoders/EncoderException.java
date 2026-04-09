package org.bouncycastle.util.encoders;

/* loaded from: classes4.dex */
public class EncoderException extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f56888a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f56888a;
    }
}
