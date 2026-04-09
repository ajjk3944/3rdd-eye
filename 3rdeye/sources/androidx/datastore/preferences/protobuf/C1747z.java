package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: InvalidProtocolBufferException.java */
/* renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1747z extends IOException {

    /* compiled from: InvalidProtocolBufferException.java */
    /* renamed from: androidx.datastore.preferences.protobuf.z$a */
    public static class a extends C1747z {
    }

    public static C1747z a() {
        return new C1747z("Protocol message had invalid UTF-8.");
    }

    public static a b() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static C1747z c() {
        return new C1747z("CodedInputStream encountered a malformed varint.");
    }

    public static C1747z d() {
        return new C1747z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C1747z e() {
        return new C1747z("Failed to parse the message.");
    }

    public static C1747z f() {
        return new C1747z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
