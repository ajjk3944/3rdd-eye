package org.msgpack.core;

/* loaded from: classes.dex */
public class MessagePackException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public static final IllegalStateException f56972a = new IllegalStateException("Cannot reach here");

    public MessagePackException() {
    }

    public MessagePackException(String str) {
        super(str);
    }

    public MessagePackException(Throwable th2) {
        super(th2);
    }
}
