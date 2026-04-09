package ol;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final k f30598c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f30599d;

    /* renamed from: e, reason: collision with root package name */
    public static final k f30600e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f30601f;
    public static final /* synthetic */ k[] g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ fk.b f30602h;

    /* renamed from: a, reason: collision with root package name */
    public final char f30603a;

    /* renamed from: b, reason: collision with root package name */
    public final char f30604b;

    static {
        k kVar = new k("OBJ", 0, '{', '}');
        f30598c = kVar;
        k kVar2 = new k("LIST", 1, '[', ']');
        f30599d = kVar2;
        k kVar3 = new k("MAP", 2, '{', '}');
        f30600e = kVar3;
        k kVar4 = new k("POLY_OBJ", 3, '[', ']');
        f30601f = kVar4;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        g = kVarArr;
        f30602h = new fk.b(kVarArr);
    }

    public k(String str, int i4, char c9, char c10) {
        this.f30603a = c9;
        this.f30604b = c10;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) g.clone();
    }
}
