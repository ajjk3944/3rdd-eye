package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f1180a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f1181b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f1182c;

    /* renamed from: d, reason: collision with root package name */
    public static final s f1183d;

    /* renamed from: e, reason: collision with root package name */
    public static final s f1184e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ s[] f1185f;

    static {
        s sVar = new s("DESTROYED", 0);
        f1180a = sVar;
        s sVar2 = new s("INITIALIZED", 1);
        f1181b = sVar2;
        s sVar3 = new s("CREATED", 2);
        f1182c = sVar3;
        s sVar4 = new s("STARTED", 3);
        f1183d = sVar4;
        s sVar5 = new s("RESUMED", 4);
        f1184e = sVar5;
        f1185f = new s[]{sVar, sVar2, sVar3, sVar4, sVar5};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f1185f.clone();
    }
}
