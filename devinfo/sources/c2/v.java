package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f2688a;

    /* renamed from: b, reason: collision with root package name */
    public static final v f2689b;

    /* renamed from: c, reason: collision with root package name */
    public static final v f2690c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ v[] f2691d;

    static {
        v vVar = new v("Unknown", 0);
        f2688a = vVar;
        v vVar2 = new v("Dispatching", 1);
        f2689b = vVar2;
        v vVar3 = new v("NotDispatching", 2);
        f2690c = vVar3;
        f2691d = new v[]{vVar, vVar2, vVar3};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f2691d.clone();
    }
}
