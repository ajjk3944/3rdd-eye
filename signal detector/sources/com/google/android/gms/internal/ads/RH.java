package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum RH implements InterfaceC1206gL {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f10887a;

    RH(int i3) {
        this.f10887a = i3;
    }

    public static RH b(int i3) {
        if (i3 == 0) {
            return UNKNOWN_HASH;
        }
        if (i3 == 1) {
            return SHA1;
        }
        if (i3 == 2) {
            return SHA384;
        }
        if (i3 == 3) {
            return SHA256;
        }
        if (i3 == 4) {
            return SHA512;
        }
        if (i3 != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1206gL
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f10887a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f10887a);
    }
}
