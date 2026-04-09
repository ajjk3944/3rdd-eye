package Y;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final i f4204a;

    public g(h hVar, ReferenceQueue referenceQueue) {
        this.f4204a = new i(hVar, this, referenceQueue);
    }

    public final void a(Object obj) {
        a aVar = (a) obj;
        synchronized (aVar) {
            try {
                if (aVar.f4194a == null) {
                    aVar.f4194a = new d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f4194a.a(this);
    }
}
