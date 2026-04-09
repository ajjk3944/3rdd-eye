package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t50 {
    private static final /* synthetic */ ys $ENTRIES;
    private static final /* synthetic */ t50[] $VALUES;
    public static final r50 Companion;
    public static final t50 ON_ANY;
    public static final t50 ON_CREATE;
    public static final t50 ON_DESTROY;
    public static final t50 ON_PAUSE;
    public static final t50 ON_RESUME;
    public static final t50 ON_START;
    public static final t50 ON_STOP;

    static {
        t50 t50Var = new t50("ON_CREATE", 0);
        ON_CREATE = t50Var;
        t50 t50Var2 = new t50("ON_START", 1);
        ON_START = t50Var2;
        t50 t50Var3 = new t50("ON_RESUME", 2);
        ON_RESUME = t50Var3;
        t50 t50Var4 = new t50("ON_PAUSE", 3);
        ON_PAUSE = t50Var4;
        t50 t50Var5 = new t50("ON_STOP", 4);
        ON_STOP = t50Var5;
        t50 t50Var6 = new t50("ON_DESTROY", 5);
        ON_DESTROY = t50Var6;
        t50 t50Var7 = new t50("ON_ANY", 6);
        ON_ANY = t50Var7;
        t50[] t50VarArr = {t50Var, t50Var2, t50Var3, t50Var4, t50Var5, t50Var6, t50Var7};
        $VALUES = t50VarArr;
        $ENTRIES = new zs(t50VarArr);
        Companion = new r50();
    }

    public static t50 valueOf(String str) {
        return (t50) Enum.valueOf(t50.class, str);
    }

    public static t50[] values() {
        return (t50[]) $VALUES.clone();
    }

    public final u50 a() {
        switch (s50.a[ordinal()]) {
            case 1:
            case 2:
                return u50.h;
            case 3:
            case 4:
                return u50.i;
            case 5:
                return u50.j;
            case 6:
                return u50.f;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new rg();
        }
    }
}
