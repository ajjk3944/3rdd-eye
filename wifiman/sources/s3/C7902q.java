package s3;

/* renamed from: s3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7902q {

    /* renamed from: b, reason: collision with root package name */
    private static C7902q f61337b;

    /* renamed from: c, reason: collision with root package name */
    private static final r f61338c = new r(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private r f61339a;

    private C7902q() {
    }

    public static synchronized C7902q b() {
        try {
            if (f61337b == null) {
                f61337b = new C7902q();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f61337b;
    }

    public r a() {
        return this.f61339a;
    }

    public final synchronized void c(r rVar) {
        if (rVar == null) {
            this.f61339a = f61338c;
            return;
        }
        r rVar2 = this.f61339a;
        if (rVar2 == null || rVar2.i() < rVar.i()) {
            this.f61339a = rVar;
        }
    }
}
