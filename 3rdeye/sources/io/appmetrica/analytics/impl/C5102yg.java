package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.yg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5102yg {

    /* renamed from: a, reason: collision with root package name */
    public final String f42142a;

    /* renamed from: b, reason: collision with root package name */
    public final long f42143b;

    /* renamed from: c, reason: collision with root package name */
    public final long f42144c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC5077xg f42145d;

    public C5102yg(byte[] bArr) throws InvalidProtocolBufferNanoException {
        C5127zg c5127zgA = C5127zg.a(bArr);
        this.f42142a = c5127zgA.f42192a;
        this.f42143b = c5127zgA.f42194c;
        this.f42144c = c5127zgA.f42193b;
        this.f42145d = a(c5127zgA.f42195d);
    }

    public final byte[] a() {
        C5127zg c5127zg = new C5127zg();
        c5127zg.f42192a = this.f42142a;
        c5127zg.f42194c = this.f42143b;
        c5127zg.f42193b = this.f42144c;
        int iOrdinal = this.f42145d.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 0;
            }
        }
        c5127zg.f42195d = i;
        return MessageNano.toByteArray(c5127zg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5102yg.class == obj.getClass()) {
            C5102yg c5102yg = (C5102yg) obj;
            if (this.f42143b == c5102yg.f42143b && this.f42144c == c5102yg.f42144c && this.f42142a.equals(c5102yg.f42142a) && this.f42145d == c5102yg.f42145d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f42142a.hashCode() * 31;
        long j4 = this.f42143b;
        int i = (iHashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j10 = this.f42144c;
        return this.f42145d.hashCode() + ((i + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f42142a + "', referrerClickTimestampSeconds=" + this.f42143b + ", installBeginTimestampSeconds=" + this.f42144c + ", source=" + this.f42145d + '}';
    }

    public C5102yg(String str, long j4, long j10, EnumC5077xg enumC5077xg) {
        this.f42142a = str;
        this.f42143b = j4;
        this.f42144c = j10;
        this.f42145d = enumC5077xg;
    }

    public static EnumC5077xg a(int i) {
        if (i == 1) {
            return EnumC5077xg.f42078c;
        }
        if (i != 2) {
            return EnumC5077xg.f42077b;
        }
        return EnumC5077xg.f42079d;
    }
}
