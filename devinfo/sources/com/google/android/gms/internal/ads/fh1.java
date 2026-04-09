package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public enum fh1 implements sn1 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f11181a;

    fh1(int i4) {
        this.f11181a = i4;
    }

    public static fh1 a(int i4) {
        if (i4 == 0) {
            return UNKNOWN_HASH;
        }
        if (i4 == 1) {
            return SHA1;
        }
        if (i4 == 2) {
            return SHA384;
        }
        if (i4 == 3) {
            return SHA256;
        }
        if (i4 == 4) {
            return SHA512;
        }
        if (i4 != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f11181a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11181a);
    }
}
