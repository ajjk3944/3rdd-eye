package u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f23816a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f23817b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f23818c;

    /* renamed from: d, reason: collision with root package name */
    public static final m f23819d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ m[] f23820e;

    static {
        m mVar = new m("SUCCESS", 0);
        f23816a = mVar;
        m mVar2 = new m("PERMANENT_FAILURE", 1);
        f23817b = mVar2;
        m mVar3 = new m("RETRIABLE_FAILURE", 2);
        f23818c = mVar3;
        m mVar4 = new m("BUFFERED", 3);
        f23819d = mVar4;
        f23820e = new m[]{mVar, mVar2, mVar3, mVar4};
    }

    public static m[] values() {
        return (m[]) f23820e.clone();
    }
}
