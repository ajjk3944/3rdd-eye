package qg;

import ig.AbstractC6152a;
import yg.EnumC8669d;
import zg.AbstractC8755h;

/* renamed from: qg.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7502u extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final kg.q f59261b;

    public C7502u(kg.q qVar) {
        this.f59261b = qVar;
    }

    @Override // gg.i
    public void E1(Dj.b bVar) {
        try {
            th = (Throwable) AbstractC8755h.c(this.f59261b.get(), "Callable returned a null Throwable.");
        } catch (Throwable th2) {
            th = th2;
            AbstractC6152a.b(th);
        }
        EnumC8669d.error(th, bVar);
    }
}
