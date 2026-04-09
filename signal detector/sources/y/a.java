package Y;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public transient d f4194a;

    public final void a(int i) throws Throwable {
        synchronized (this) {
            try {
                d dVar = this.f4194a;
                if (dVar == null) {
                    return;
                }
                dVar.c(this, i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
