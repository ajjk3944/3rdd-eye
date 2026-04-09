package i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f25762a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f25763b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f25764c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f25765d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ r[] f25766e;

    static {
        r rVar = new r("LookaheadMeasurement", 0);
        f25762a = rVar;
        r rVar2 = new r("LookaheadPlacement", 1);
        f25763b = rVar2;
        r rVar3 = new r("Measurement", 2);
        f25764c = rVar3;
        r rVar4 = new r("Placement", 3);
        f25765d = rVar4;
        f25766e = new r[]{rVar, rVar2, rVar3, rVar4};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f25766e.clone();
    }
}
