package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1956uI implements InterfaceC1206gL {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f17104a;

    EnumC1956uI(int i3) {
        this.f17104a = i3;
    }

    public static EnumC1956uI b(int i3) {
        if (i3 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i3 == 1) {
            return TINK;
        }
        if (i3 == 2) {
            return LEGACY;
        }
        if (i3 == 3) {
            return RAW;
        }
        if (i3 == 4) {
            return CRUNCHY;
        }
        if (i3 != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1206gL
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f17104a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f17104a);
    }
}
