package t5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f34243a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f34244b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f34245c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j[] f34246d;

    static {
        j jVar = new j("NO_OP", 0);
        f34243a = jVar;
        j jVar2 = new j("ADD", 1);
        f34244b = jVar2;
        j jVar3 = new j("REMOVE", 2);
        f34245c = jVar3;
        f34246d = new j[]{jVar, jVar2, jVar3};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f34246d.clone();
    }
}
