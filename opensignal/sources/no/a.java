package no;

import br.a0;
import cq.l;

/* loaded from: classes.dex */
public final class a extends a0 {

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f18468d;

    @Override // br.a0
    public final void b(l lVar) {
        super.b(lVar);
        synchronized (this) {
            try {
                if (this.f18468d != null) {
                    lVar.a(this.f18468d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // br.a0
    public final void g(Object obj) {
        super.g(obj);
        this.f18468d = obj;
    }
}
