package tg;

import ig.AbstractC6152a;
import lg.EnumC6593c;
import zg.AbstractC8755h;

/* renamed from: tg.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8108t extends gg.s {

    /* renamed from: a, reason: collision with root package name */
    final kg.q f62566a;

    public C8108t(kg.q qVar) {
        this.f62566a = qVar;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        try {
            th = (Throwable) AbstractC8755h.c(this.f62566a.get(), "Supplier returned a null Throwable.");
        } catch (Throwable th2) {
            th = th2;
            AbstractC6152a.b(th);
        }
        EnumC6593c.error(th, xVar);
    }
}
