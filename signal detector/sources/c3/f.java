package c3;

import M2.u;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final j f5902a = new j();

    public final void a(Exception exc) {
        j jVar = this.f5902a;
        jVar.getClass();
        u.f(exc, "Exception must not be null");
        synchronized (jVar.f5911a) {
            try {
                if (jVar.f5913c) {
                    return;
                }
                jVar.f5913c = true;
                jVar.f5916f = exc;
                jVar.f5912b.k(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Object obj) {
        j jVar = this.f5902a;
        synchronized (jVar.f5911a) {
            try {
                if (jVar.f5913c) {
                    return;
                }
                jVar.f5913c = true;
                jVar.f5915e = obj;
                jVar.f5912b.k(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
