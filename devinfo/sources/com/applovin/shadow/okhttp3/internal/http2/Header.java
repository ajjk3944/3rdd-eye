package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okio.ByteString;
import nk.f;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class Header {
    public static final Companion Companion = new Companion(null);
    public static final ByteString PSEUDO_PREFIX;
    public static final ByteString RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final ByteString TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final ByteString TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final ByteString TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final ByteString TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final ByteString name;
    public final ByteString value;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    static {
        ByteString.Companion companion = ByteString.Companion;
        PSEUDO_PREFIX = companion.encodeUtf8(":");
        RESPONSE_STATUS = companion.encodeUtf8(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = companion.encodeUtf8(TARGET_METHOD_UTF8);
        TARGET_PATH = companion.encodeUtf8(TARGET_PATH_UTF8);
        TARGET_SCHEME = companion.encodeUtf8(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = companion.encodeUtf8(TARGET_AUTHORITY_UTF8);
    }

    public Header(ByteString byteString, ByteString byteString2) {
        k.e(byteString, "name");
        k.e(byteString2, "value");
        this.name = byteString;
        this.value = byteString2;
        this.hpackSize = byteString2.size() + byteString.size() + 32;
    }

    public static /* synthetic */ Header copy$default(Header header, ByteString byteString, ByteString byteString2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            byteString = header.name;
        }
        if ((i4 & 2) != 0) {
            byteString2 = header.value;
        }
        return header.copy(byteString, byteString2);
    }

    public final ByteString component1() {
        return this.name;
    }

    public final ByteString component2() {
        return this.value;
    }

    public final Header copy(ByteString byteString, ByteString byteString2) {
        k.e(byteString, "name");
        k.e(byteString2, "value");
        return new Header(byteString, byteString2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return k.a(this.name, header.name) && k.a(this.value, header.value);
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return this.name.utf8() + ": " + this.value.utf8();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Header(String str, String str2) {
        k.e(str, "name");
        k.e(str2, "value");
        ByteString.Companion companion = ByteString.Companion;
        this(companion.encodeUtf8(str), companion.encodeUtf8(str2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(ByteString byteString, String str) {
        this(byteString, ByteString.Companion.encodeUtf8(str));
        k.e(byteString, "name");
        k.e(str, "value");
    }
}
