package org.bouncycastle.asn1;

/* loaded from: classes4.dex */
public class ASN1ParsingException extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f56872a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f56872a;
    }
}
