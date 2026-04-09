package n1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f29544a;

    /* renamed from: b, reason: collision with root package name */
    public static final q f29545b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f29546c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ q[] f29547d;

    static {
        q qVar = new q("Active", 0);
        f29544a = qVar;
        q qVar2 = new q("ActiveParent", 1);
        f29545b = qVar2;
        q qVar3 = new q("Captured", 2);
        q qVar4 = new q("Inactive", 3);
        f29546c = qVar4;
        f29547d = new q[]{qVar, qVar2, qVar3, qVar4};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f29547d.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new ac.m();
            }
        }
        return true;
    }
}
