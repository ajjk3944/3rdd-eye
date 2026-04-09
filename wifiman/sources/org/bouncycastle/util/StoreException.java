package org.bouncycastle.util;

/* loaded from: classes4.dex */
public class StoreException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f56885a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f56885a;
    }
}
