package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final f Companion;
    private final int rawBucketValue;
    private final o0 triggerType;
    public static final g APP_BUCKET_ACTIVE = new g("APP_BUCKET_ACTIVE", 0, o0.APP_BUCKET_ACTIVE, 10);
    public static final g APP_BUCKET_WORKING_SET = new g("APP_BUCKET_WORKING_SET", 1, o0.APP_BUCKET_WORKING_SET, 20);
    public static final g APP_BUCKET_FREQUENT = new g("APP_BUCKET_FREQUENT", 2, o0.APP_BUCKET_FREQUENT, 30);
    public static final g APP_BUCKET_RARE = new g("APP_BUCKET_RARE", 3, o0.APP_BUCKET_RARE, 40);
    public static final g APP_BUCKET_RESTRICTED = new g("APP_BUCKET_RESTRICTED", 4, o0.APP_BUCKET_RESTRICTED, 45);

    private static final /* synthetic */ g[] $values() {
        return new g[]{APP_BUCKET_ACTIVE, APP_BUCKET_WORKING_SET, APP_BUCKET_FREQUENT, APP_BUCKET_RARE, APP_BUCKET_RESTRICTED};
    }

    static {
        g[] gVarArr$values = $values();
        $VALUES = gVarArr$values;
        $ENTRIES = a.a.j(gVarArr$values);
        Companion = new f();
    }

    private g(String str, int i10, o0 o0Var, int i11) {
        this.triggerType = o0Var;
        this.rawBucketValue = i11;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final int getRawBucketValue() {
        return this.rawBucketValue;
    }

    public final o0 getTriggerType() {
        return this.triggerType;
    }
}
