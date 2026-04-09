package S3;

/* loaded from: classes.dex */
public abstract class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final c3.f f3489a;

    public k() {
        this.f3489a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e6) {
            c3.f fVar = this.f3489a;
            if (fVar != null) {
                fVar.a(e6);
            }
        }
    }

    public k(c3.f fVar) {
        this.f3489a = fVar;
    }
}
