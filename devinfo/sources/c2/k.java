package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f2634a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f2635b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f2636c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k[] f2637d;

    static {
        k kVar = new k("Initial", 0);
        f2634a = kVar;
        k kVar2 = new k("Main", 1);
        f2635b = kVar2;
        k kVar3 = new k("Final", 2);
        f2636c = kVar3;
        f2637d = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f2637d.clone();
    }
}
