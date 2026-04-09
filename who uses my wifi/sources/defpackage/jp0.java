package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jp0 {
    public static final jp0 f;
    public static final jp0 g;
    public static final jp0 h;
    public static final /* synthetic */ jp0[] i;

    static {
        jp0 jp0Var = new jp0("AUTOMATIC", 0);
        f = jp0Var;
        jp0 jp0Var2 = new jp0("HARDWARE", 1);
        g = jp0Var2;
        jp0 jp0Var3 = new jp0("SOFTWARE", 2);
        h = jp0Var3;
        i = new jp0[]{jp0Var, jp0Var2, jp0Var3};
    }

    public static jp0 valueOf(String str) {
        return (jp0) Enum.valueOf(jp0.class, str);
    }

    public static jp0[] values() {
        return (jp0[]) i.clone();
    }
}
