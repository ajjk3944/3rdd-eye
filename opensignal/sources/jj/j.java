package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final i Companion;
    private final o0 triggerType;
    public static final j AUDIO_ON_CALL = new j("AUDIO_ON_CALL", 0, o0.AUDIO_ON_CALL);
    public static final j AUDIO_NOT_ON_CALL = new j("AUDIO_NOT_ON_CALL", 1, o0.AUDIO_NOT_ON_CALL);
    public static final j AUDIO_ON_TELEPHONY_CALL = new j("AUDIO_ON_TELEPHONY_CALL", 2, o0.AUDIO_ON_TELEPHONY_CALL);
    public static final j AUDIO_NOT_ON_TELEPHONY_CALL = new j("AUDIO_NOT_ON_TELEPHONY_CALL", 3, o0.AUDIO_NOT_ON_TELEPHONY_CALL);
    public static final j AUDIO_ON_VOIP_CALL = new j("AUDIO_ON_VOIP_CALL", 4, o0.AUDIO_ON_VOIP_CALL);
    public static final j AUDIO_NOT_ON_VOIP_CALL = new j("AUDIO_NOT_ON_VOIP_CALL", 5, o0.AUDIO_NOT_ON_VOIP_CALL);

    private static final /* synthetic */ j[] $values() {
        return new j[]{AUDIO_ON_CALL, AUDIO_NOT_ON_CALL, AUDIO_ON_TELEPHONY_CALL, AUDIO_NOT_ON_TELEPHONY_CALL, AUDIO_ON_VOIP_CALL, AUDIO_NOT_ON_VOIP_CALL};
    }

    static {
        j[] jVarArr$values = $values();
        $VALUES = jVarArr$values;
        $ENTRIES = a.a.j(jVarArr$values);
        Companion = new i();
    }

    private j(String str, int i10, o0 o0Var) {
        this.triggerType = o0Var;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final o0 getTriggerType() {
        return this.triggerType;
    }
}
