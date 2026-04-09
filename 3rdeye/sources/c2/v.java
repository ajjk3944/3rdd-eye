package c2;

import d2.C4268c;
import java.util.List;

/* compiled from: StatusRunnable.java */
/* loaded from: classes.dex */
public abstract class v<T> implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final C4268c<T> f18438b = new C4268c<>();

    public abstract List a();

    @Override // java.lang.Runnable
    public final void run() {
        C4268c<T> c4268c = this.f18438b;
        try {
            c4268c.i(a());
        } catch (Throwable th) {
            c4268c.j(th);
        }
    }
}
