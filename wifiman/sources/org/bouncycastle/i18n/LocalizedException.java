package org.bouncycastle.i18n;

/* loaded from: classes4.dex */
public class LocalizedException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f56875a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f56875a;
    }
}
