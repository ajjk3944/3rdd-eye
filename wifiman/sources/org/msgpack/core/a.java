package org.msgpack.core;

import org.snmp4j.asn1.BER;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final byte f56974a;

    /* renamed from: b, reason: collision with root package name */
    private final int f56975b;

    public a(byte b10, int i10) {
        g.b(i10 >= 0, "length must be >= 0");
        this.f56974a = b10;
        this.f56975b = i10;
    }

    public int a() {
        return this.f56975b;
    }

    public byte b() {
        return this.f56974a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f56974a == aVar.f56974a && this.f56975b == aVar.f56975b;
    }

    public int hashCode() {
        return ((this.f56974a + BER.ASN_EXTENSION_ID) * 31) + this.f56975b;
    }

    public String toString() {
        return String.format("ExtensionTypeHeader(type:%d, length:%,d)", Byte.valueOf(this.f56974a), Integer.valueOf(this.f56975b));
    }
}
