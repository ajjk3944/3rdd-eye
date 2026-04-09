package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1945u7 implements InterfaceC1206gL {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);


    /* renamed from: a, reason: collision with root package name */
    public final int f17066a;

    EnumC1945u7(int i3) {
        this.f17066a = i3;
    }

    public static EnumC1945u7 b(int i3) {
        if (i3 == 0) {
            return UNSUPPORTED;
        }
        if (i3 == 2) {
            return ARM7;
        }
        if (i3 == 999) {
            return UNKNOWN;
        }
        if (i3 == 4) {
            return X86;
        }
        if (i3 == 5) {
            return ARM64;
        }
        if (i3 == 6) {
            return X86_64;
        }
        if (i3 != 7) {
            return null;
        }
        return RISCV64;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1206gL
    public final int a() {
        return this.f17066a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f17066a);
    }
}
