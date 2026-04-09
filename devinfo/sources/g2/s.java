package g2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f24405a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f24406b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s[] f24407c;

    static {
        s sVar = new s("Width", 0);
        f24405a = sVar;
        s sVar2 = new s("Height", 1);
        f24406b = sVar2;
        f24407c = new s[]{sVar, sVar2};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f24407c.clone();
    }
}
