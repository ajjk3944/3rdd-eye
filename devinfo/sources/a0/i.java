package a0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f61a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f62b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i[] f63c;

    static {
        i iVar = new i("BoundReached", 0);
        f61a = iVar;
        i iVar2 = new i("Finished", 1);
        f62b = iVar2;
        f63c = new i[]{iVar, iVar2};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f63c.clone();
    }
}
