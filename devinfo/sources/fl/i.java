package fl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f24086a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f24087b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f24088c;

    /* renamed from: d, reason: collision with root package name */
    public static final i f24089d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i[] f24090e;

    static {
        i iVar = new i("SUCCESSFUL", 0);
        f24086a = iVar;
        i iVar2 = new i("REREGISTER", 1);
        f24087b = iVar2;
        i iVar3 = new i("CANCELLED", 2);
        f24088c = iVar3;
        i iVar4 = new i("ALREADY_SELECTED", 3);
        f24089d = iVar4;
        f24090e = new i[]{iVar, iVar2, iVar3, iVar4};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f24090e.clone();
    }
}
