package org.msgpack.core;

import java.math.BigInteger;

/* loaded from: classes.dex */
public class MessageIntegerOverflowException extends MessageTypeException {

    /* renamed from: b, reason: collision with root package name */
    private final BigInteger f56971b;

    public MessageIntegerOverflowException(BigInteger bigInteger) {
        this.f56971b = bigInteger;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f56971b.toString();
    }
}
