package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* loaded from: classes4.dex */
public class InvalidProtocolBufferException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private n f51935a;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f51935a = null;
    }

    static InvalidProtocolBufferException c() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    static InvalidProtocolBufferException d() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    static InvalidProtocolBufferException g() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    static InvalidProtocolBufferException h() {
        return new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
    }

    static InvalidProtocolBufferException j() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    static InvalidProtocolBufferException l() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static InvalidProtocolBufferException m() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static InvalidProtocolBufferException o() {
        return new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static InvalidProtocolBufferException p() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public n a() {
        return this.f51935a;
    }

    public InvalidProtocolBufferException n(n nVar) {
        this.f51935a = nVar;
        return this;
    }
}
