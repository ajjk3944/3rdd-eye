package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ok {
    public static final ok f;
    public static final ok g;
    public static final ok h;
    public static final ok i;
    public static final ok j;
    public static final /* synthetic */ ok[] k;

    static {
        ok okVar = new ok("CPU_ACQUIRED", 0);
        f = okVar;
        ok okVar2 = new ok("BLOCKING", 1);
        g = okVar2;
        ok okVar3 = new ok("PARKING", 2);
        h = okVar3;
        ok okVar4 = new ok("DORMANT", 3);
        i = okVar4;
        ok okVar5 = new ok("TERMINATED", 4);
        j = okVar5;
        k = new ok[]{okVar, okVar2, okVar3, okVar4, okVar5};
    }

    public static ok valueOf(String str) {
        return (ok) Enum.valueOf(ok.class, str);
    }

    public static ok[] values() {
        return (ok[]) k.clone();
    }
}
