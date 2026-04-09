package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final List f30818a;

    public UninitializedMessageException(M m10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f30818a = null;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
