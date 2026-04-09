package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzkq extends IOException {
    public zzkq(String str) {
        super(str);
    }

    static zzkt a() {
        return new zzkt("Protocol message tag had invalid wire type.");
    }

    static zzkq c() {
        return new zzkq("Protocol message contained an invalid tag (zero).");
    }

    static zzkq d() {
        return new zzkq("Protocol message had invalid UTF-8.");
    }

    static zzkq g() {
        return new zzkq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzkq h() {
        return new zzkq("Failed to parse the message.");
    }

    static zzkq j() {
        return new zzkq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static zzkq l() {
        return new zzkq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
