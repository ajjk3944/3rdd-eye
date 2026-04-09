package com.google.protobuf;

import java.io.IOException;

/* compiled from: InvalidProtocolBufferException.java */
/* loaded from: classes2.dex */
public class C extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private U unfinishedMessage;
    private boolean wasThrownFromInputStream;

    /* compiled from: InvalidProtocolBufferException.java */
    public static class a extends C {
        private static final long serialVersionUID = 3283890091615336259L;

        public a(String str) {
            super(str);
        }
    }

    public C(String str) {
        super(str);
        this.unfinishedMessage = null;
    }

    public static C invalidEndTag() {
        return new C("Protocol message end-group tag did not match expected tag.");
    }

    public static C invalidTag() {
        return new C("Protocol message contained an invalid tag (zero).");
    }

    public static C invalidUtf8() {
        return new C("Protocol message had invalid UTF-8.");
    }

    public static a invalidWireType() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static C malformedVarint() {
        return new C("CodedInputStream encountered a malformed varint.");
    }

    public static C negativeSize() {
        return new C("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C parseFailure() {
        return new C("Failed to parse the message.");
    }

    public static C recursionLimitExceeded() {
        return new C("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static C sizeLimitExceeded() {
        return new C("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static C truncatedMessage() {
        return new C("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean getThrownFromInputStream() {
        return this.wasThrownFromInputStream;
    }

    public U getUnfinishedMessage() {
        return this.unfinishedMessage;
    }

    public void setThrownFromInputStream() {
        this.wasThrownFromInputStream = true;
    }

    public C setUnfinishedMessage(U u8) {
        this.unfinishedMessage = u8;
        return this;
    }

    public IOException unwrapIOException() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    public C(Exception exc) {
        super(exc.getMessage(), exc);
        this.unfinishedMessage = null;
    }

    public C(String str, Exception exc) {
        super(str, exc);
        this.unfinishedMessage = null;
    }

    public C(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.unfinishedMessage = null;
    }

    public C(String str, IOException iOException) {
        super(str, iOException);
        this.unfinishedMessage = null;
    }
}
