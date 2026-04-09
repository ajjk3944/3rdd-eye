package org.bouncycastle.jce.provider;

/* loaded from: classes4.dex */
public class AnnotatedException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f56883a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f56883a;
    }
}
