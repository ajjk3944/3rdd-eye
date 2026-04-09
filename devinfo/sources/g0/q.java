package g0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f24172a;

    /* renamed from: b, reason: collision with root package name */
    public static final q f24173b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f24174c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ q[] f24175d;

    static {
        q qVar = new q("Vertical", 0);
        f24172a = qVar;
        q qVar2 = new q("Horizontal", 1);
        f24173b = qVar2;
        q qVar3 = new q("Both", 2);
        f24174c = qVar3;
        f24175d = new q[]{qVar, qVar2, qVar3};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f24175d.clone();
    }
}
