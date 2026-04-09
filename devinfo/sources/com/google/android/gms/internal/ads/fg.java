package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public enum fg implements sn1 {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);


    /* renamed from: a, reason: collision with root package name */
    public final int f11160a;

    fg(int i4) {
        this.f11160a = i4;
    }

    public static fg a(int i4) {
        if (i4 == 0) {
            return UNSUPPORTED;
        }
        if (i4 == 2) {
            return ARM7;
        }
        if (i4 == 999) {
            return UNKNOWN;
        }
        if (i4 == 4) {
            return X86;
        }
        if (i4 == 5) {
            return ARM64;
        }
        if (i4 == 6) {
            return X86_64;
        }
        if (i4 != 7) {
            return null;
        }
        return RISCV64;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final int b() {
        return this.f11160a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11160a);
    }
}
