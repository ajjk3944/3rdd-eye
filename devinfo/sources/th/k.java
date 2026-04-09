package th;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f34627a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f34628b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f34629c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k[] f34630d;

    static {
        k kVar = new k("LOADING", 0);
        f34627a = kVar;
        k kVar2 = new k("NO_PERMISSION", 1);
        f34628b = kVar2;
        k kVar3 = new k("LOADED", 2);
        f34629c = kVar3;
        f34630d = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f34630d.clone();
    }
}
