package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tk {
    public static final tk f;
    public static final /* synthetic */ tk[] g;

    static {
        tk tkVar = new tk("DEFAULT", 0);
        f = tkVar;
        g = new tk[]{tkVar, new tk("LAZY", 1), new tk("ATOMIC", 2), new tk("UNDISPATCHED", 3)};
    }

    public static tk valueOf(String str) {
        return (tk) Enum.valueOf(tk.class, str);
    }

    public static tk[] values() {
        return (tk[]) g.clone();
    }
}
