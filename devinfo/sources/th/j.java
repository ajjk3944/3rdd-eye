package th;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f34623a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f34624b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f34625c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j[] f34626d;

    static {
        j jVar = new j("USER", 0);
        f34623a = jVar;
        j jVar2 = new j("SYSTEM", 1);
        f34624b = jVar2;
        j jVar3 = new j("ALL", 2);
        f34625c = jVar3;
        f34626d = new j[]{jVar, jVar2, jVar3};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f34626d.clone();
    }
}
