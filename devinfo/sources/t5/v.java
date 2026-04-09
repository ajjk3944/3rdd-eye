package t5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f34291a;

    /* renamed from: b, reason: collision with root package name */
    public static final v f34292b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ v[] f34293c;

    static {
        v vVar = new v("DEFERRED", 0);
        f34291a = vVar;
        v vVar2 = new v("IMMEDIATE", 1);
        f34292b = vVar2;
        f34293c = new v[]{vVar, vVar2, new v("EXCLUSIVE", 2)};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f34293c.clone();
    }
}
