package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public enum ii1 implements sn1 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f12357a;

    ii1(int i4) {
        this.f12357a = i4;
    }

    public static ii1 a(int i4) {
        if (i4 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i4 == 1) {
            return TINK;
        }
        if (i4 == 2) {
            return LEGACY;
        }
        if (i4 == 3) {
            return RAW;
        }
        if (i4 == 4) {
            return CRUNCHY;
        }
        if (i4 != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f12357a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12357a);
    }
}
