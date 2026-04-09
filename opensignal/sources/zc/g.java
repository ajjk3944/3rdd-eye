package zc;

/* loaded from: classes.dex */
public enum g {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzk;

    g(char c4) {
        this.zzk = c4;
    }

    public static g zza(char c4) {
        for (g gVar : values()) {
            if (gVar.zzk == c4) {
                return gVar;
            }
        }
        return UNSET;
    }

    public final /* synthetic */ char zzb() {
        return this.zzk;
    }
}
