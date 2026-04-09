package f6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f23668a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f23669b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f23670c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f23671d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f23672e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f[] f23673f;

    static {
        f fVar = new f("ON_CONFIGURE", 0);
        f23668a = fVar;
        f fVar2 = new f("ON_CREATE", 1);
        f23669b = fVar2;
        f fVar3 = new f("ON_UPGRADE", 2);
        f23670c = fVar3;
        f fVar4 = new f("ON_DOWNGRADE", 3);
        f23671d = fVar4;
        f fVar5 = new f("ON_OPEN", 4);
        f23672e = fVar5;
        f23673f = new f[]{fVar, fVar2, fVar3, fVar4, fVar5};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f23673f.clone();
    }
}
