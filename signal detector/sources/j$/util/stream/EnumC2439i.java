package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2439i {
    public static final EnumC2439i CONCURRENT;
    public static final EnumC2439i IDENTITY_FINISH;
    public static final EnumC2439i UNORDERED;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC2439i[] f21087a;

    public static EnumC2439i valueOf(String str) {
        return (EnumC2439i) Enum.valueOf(EnumC2439i.class, str);
    }

    public static EnumC2439i[] values() {
        return (EnumC2439i[]) f21087a.clone();
    }

    static {
        EnumC2439i enumC2439i = new EnumC2439i("CONCURRENT", 0);
        CONCURRENT = enumC2439i;
        EnumC2439i enumC2439i2 = new EnumC2439i("UNORDERED", 1);
        UNORDERED = enumC2439i2;
        EnumC2439i enumC2439i3 = new EnumC2439i("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = enumC2439i3;
        f21087a = new EnumC2439i[]{enumC2439i, enumC2439i2, enumC2439i3};
    }
}
