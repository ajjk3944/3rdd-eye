package j5;

/* renamed from: j5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6253b implements InterfaceC6252a {

    /* renamed from: a, reason: collision with root package name */
    private static C6253b f50130a;

    private C6253b() {
    }

    public static C6253b b() {
        if (f50130a == null) {
            f50130a = new C6253b();
        }
        return f50130a;
    }

    @Override // j5.InterfaceC6252a
    public long a() {
        return System.currentTimeMillis();
    }
}
