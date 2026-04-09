package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0292n {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0292n f5243a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0292n f5244b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0292n f5245c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0292n f5246d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0292n f5247e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0292n[] f5248f;

    static {
        EnumC0292n enumC0292n = new EnumC0292n("DESTROYED", 0);
        f5243a = enumC0292n;
        EnumC0292n enumC0292n2 = new EnumC0292n("INITIALIZED", 1);
        f5244b = enumC0292n2;
        EnumC0292n enumC0292n3 = new EnumC0292n("CREATED", 2);
        f5245c = enumC0292n3;
        EnumC0292n enumC0292n4 = new EnumC0292n("STARTED", 3);
        f5246d = enumC0292n4;
        EnumC0292n enumC0292n5 = new EnumC0292n("RESUMED", 4);
        f5247e = enumC0292n5;
        f5248f = new EnumC0292n[]{enumC0292n, enumC0292n2, enumC0292n3, enumC0292n4, enumC0292n5};
    }

    public static EnumC0292n valueOf(String str) {
        return (EnumC0292n) Enum.valueOf(EnumC0292n.class, str);
    }

    public static EnumC0292n[] values() {
        return (EnumC0292n[]) f5248f.clone();
    }
}
