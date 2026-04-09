package X3;

/* loaded from: classes.dex */
public abstract class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final c3.f f4175a;

    public f() {
        this.f4175a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e6) {
            c3.f fVar = this.f4175a;
            if (fVar != null) {
                fVar.a(e6);
            }
        }
    }

    public f(c3.f fVar) {
        this.f4175a = fVar;
    }
}
