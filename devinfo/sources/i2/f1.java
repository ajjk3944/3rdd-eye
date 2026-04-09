package i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1 f25665a;

    /* renamed from: b, reason: collision with root package name */
    public static final f1 f25666b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f1[] f25667c;

    static {
        f1 f1Var = new f1("Min", 0);
        f25665a = f1Var;
        f1 f1Var2 = new f1("Max", 1);
        f25666b = f1Var2;
        f25667c = new f1[]{f1Var, f1Var2};
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) f25667c.clone();
    }
}
