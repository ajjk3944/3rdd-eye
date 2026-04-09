package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final List f38474a;

    public UninitializedMessageException(M m10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f38474a = null;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
