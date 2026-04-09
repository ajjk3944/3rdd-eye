package b4;

/* renamed from: b4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0359x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final c3.f f5778a;

    public AbstractRunnableC0359x() {
        this.f5778a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e6) {
            c3.f fVar = this.f5778a;
            if (fVar != null) {
                fVar.a(e6);
            }
        }
    }

    public AbstractRunnableC0359x(c3.f fVar) {
        this.f5778a = fVar;
    }
}
