package wi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f36752a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f36753b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f[] f36754c;

    static {
        f fVar = new f("Normal", 0);
        f36752a = fVar;
        f fVar2 = new f("PreferFirstObserver", 1);
        f36753b = fVar2;
        f36754c = new f[]{fVar, fVar2};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f36754c.clone();
    }
}
