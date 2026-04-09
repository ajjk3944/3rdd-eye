package zc;

/* loaded from: classes.dex */
public enum k2 {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);

    private final int zzg;

    k2(int i10) {
        this.zzg = i10;
    }

    public static k2 zzb(int i10) {
        for (k2 k2Var : values()) {
            if (k2Var.zzg == i10) {
                return k2Var;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.zzg;
    }
}
